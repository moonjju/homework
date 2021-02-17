package member.model.dao;

import static common.JDBCTemplate.close; //이렇게 스테틱임포트를 하면 클래스명을 안써도 된다.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import member.model.exception.MemberException;
import member.model.vo.DeleteMember;
import member.model.vo.Member;

public class MemberDao {
	
	private Properties prop = new Properties();
	
	/**
	 * MemberDao객체 생성시 (최소1회) member-query.properties의 내용을 읽어다가 prop에 저장한다,
	 * 
	 * dao메소드 호출시마다 prop으로부터 query를 가져다가 사용한다.
	 */
	public MemberDao(){
		//member-qurey.properties  ->prop
		String fileName = "resources/member-query.properties";
		try {
			prop.load(new FileReader(fileName));
			//System.out.println(prop);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	/**
	 * DAO 3. PreparedStatement객체 생성(미완성쿼리) 3.1 ? 값대입 4. 실행 : DML -> int,
	 * DQL(executeQuery) -> ResultSet 4.1.ResultSet-> java객체 옮겨담기 5.자원반납(생성역순 rest -
	 * pstmt )
	 */
	//쿼리 별도 관리
	public List<Member> selectAll(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectAll");
		List<Member> list = null;

		try {
			// 3. PreparedStatement객체 생성(미완성쿼리)
			pstmt = conn.prepareStatement(sql);
			// 3.1 ? 값대입
			// 4. 실행 : DML -> int, DQL(executeQuery) -> ResultSet
			rset = pstmt.executeQuery();
			// 4.1.ResultSet-> java객체 옮겨담기
			list = new ArrayList<>();
			while (rset.next()) {
				String memberId = rset.getString("member_id");
				String password = rset.getString("password");
				String memberName = rset.getString("member_name");
				String gender = rset.getString("gender");
				int age = rset.getInt("age");
				String email = rset.getString("email");
				String phone = rset.getString("phone");
				String address = rset.getString("address");
				String hobby = rset.getString("hobby");
				Date enrollDate = rset.getDate("enroll_date");
//				Date del_date = rset.getDate("del_date");
				Member member = new Member(memberId, password, memberName, gender, age, email, phone, address, hobby,
						enrollDate);
				list.add(member);
			}

		} catch (SQLException e) {
			//e.printStackTrace(); //디버깅용 로그
			//예외를 전환 : runtimeException, 의미가 분명한 커스텀 예외객체로 전환
			throw new MemberException("회원 전체 조회",e);
			
		} finally {
			// 5.자원반납(생성역순 rest - pstmt )
			close(rset);
			close(pstmt);
		}

		return list;
	}

	public int insertMember(Connection conn, Member member) {
		PreparedStatement pstmt = null;
		String sql = prop.getProperty("insertMember");
		int result = 0;

		try {
			// 3. PreparedStatement객체 생성(미완성쿼리)
			pstmt = conn.prepareStatement(sql);
			// 3.1 ? 값대입
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getGender());
			pstmt.setInt(5, member.getAge());
			pstmt.setString(6, member.getEmail());
			pstmt.setString(7, member.getPhone());
			pstmt.setString(8, member.getAddress());
			pstmt.setString(9, member.getHobby());
			// 4. 실행 : DML -> int, DQL(executeQuery) -> ResultSet
			result = pstmt.executeUpdate();
			// 4.1.ResultSet-> java객체 옮겨담기
		} catch (SQLException e) {
			//e.printStackTrace();
			throw new MemberException("회원 전체 조회",e);
		} finally {
			// 5.자원반납(생성역순 rest - pstmt )
			close(pstmt);

		}
		return result;

	}

	public Member selectOne(Connection conn, String memberId) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectOne");
		Member member = null;

		try {
			// 3. PreparedStatement객체 생성(미완성쿼리)
			pstmt = conn.prepareStatement(sql);
			// 3.1 ? 값대입
			pstmt.setString(1, memberId);
			// 4. 실행 : DML -> int, DQL(executeQuery) -> ResultSet
			rset = pstmt.executeQuery();
			// 4.1.ResultSet-> java객체 옮겨담기
			while (rset.next()) {
				// 컬럼명은 대소문자를 구분하지 않는다.
				memberId = rset.getString("member_id");
				String password = rset.getString("password");
				String memberName = rset.getString("member_name");
				String gender = rset.getString("gender");
				int age = rset.getInt("age");
				String email = rset.getString("email");
				String phone = rset.getString("phone");
				String address = rset.getString("address");
				String hobby = rset.getString("hobby");
				Date enrollDate = rset.getDate("enroll_date");
//				Date del_date = rset.getDate("del_date");

				member = new Member(memberId, password, memberName, gender, age, email, phone, address, hobby,
						enrollDate);
			}

		} catch (SQLException e) {
			throw new MemberException("회원 전체 조회",e);
		} finally {
			// 5.자원반납(생성역순 rest - pstmt )
			close(rset);
			close(pstmt);
		}
		return member;
	}

	



	public Member selectName(Connection conn, String memberName) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectName");
		Member member = null;

		try {
			// 3. PreparedStatement객체 생성(미완성쿼리)
			pstmt = conn.prepareStatement(sql);
			// 3.1 ? 값대입
			pstmt.setString(1, memberName);
			// 4. 실행 : DML -> int, DQL(executeQuery) -> ResultSet
			rset = pstmt.executeQuery();
			// 4.1.ResultSet-> java객체 옮겨담기
			while (rset.next()) {
				// 컬럼명은 대소문자를 구분하지 않는다.
				String memberId = rset.getString("member_id");
				String password = rset.getString("password");
				 memberName = rset.getString("member_name");
				String gender = rset.getString("gender");
				int age = rset.getInt("age");
				String email = rset.getString("email");
				String phone = rset.getString("phone");
				String address = rset.getString("address");
				String hobby = rset.getString("hobby");
				Date enrollDate = rset.getDate("enroll_date");
				member = new Member(memberId, password, memberName, gender, age, email, phone, address, hobby,
						enrollDate);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5.자원반납(생성역순 rest - pstmt )
			close(rset);
			close(pstmt);
		}
		return member;
	}

	public int deleteMember(Connection conn, String memberId) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = prop.getProperty("deleteMember");
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			throw new MemberException("회원 전체 조회",e);
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int updateMember(Connection conn, Member m) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = prop.getProperty("updateMember");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getPassword());
			pstmt.setString(2, m.getEmail());
			pstmt.setString(3, m.getPhone());
			pstmt.setString(4, m.getAddress());
			pstmt.setString(5, m.getMemberId());
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			throw new MemberException("회원 전체 조회",e);
		} finally {
			close(pstmt);
		}
		
		return result;
	}




	public List<DeleteMember> deleteSerch(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("deleteSerch");
		List<DeleteMember> listD = null;

		try {
			// 3. PreparedStatement객체 생성(미완성쿼리)
			pstmt = conn.prepareStatement(sql);
			// 3.1 ? 값대입
			// 4. 실행 : DML -> int, DQL(executeQuery) -> ResultSet
			rset = pstmt.executeQuery();
			// 4.1.ResultSet-> java객체 옮겨담기
			listD = new ArrayList<>();
			while (rset.next()) {
				String memberId = rset.getString("member_id");
				String password = rset.getString("password");
				String memberName = rset.getString("member_name");
				String gender = rset.getString("gender");
				int age = rset.getInt("age");
				String email = rset.getString("email");
				String phone = rset.getString("phone");
				String address = rset.getString("address");
				String hobby = rset.getString("hobby");
				Date enrollDate = rset.getDate("enroll_date");
				Date del_date = rset.getDate("del_date");
				DeleteMember deleteMember = new DeleteMember(memberId, password, memberName, gender, age, email, phone, address, hobby,
						enrollDate,del_date);
				listD.add(deleteMember);
			}

		} catch (SQLException e) {
			//e.printStackTrace(); //디버깅용 로그
			//예외를 전환 : runtimeException, 의미가 분명한 커스텀 예외객체로 전환
			throw new MemberException("회원 전체 조회",e);
			
		} finally {
			// 5.자원반납(생성역순 rest - pstmt )
			close(rset);
			close(pstmt);
		}

		return listD;
	}

	
}
