package member.controler;

import java.util.List;

import member.model.exception.MemberException;
import member.model.service.MemberService;
import member.model.vo.DeleteMember;
import member.model.vo.Member;
import member.view.MemberMenu;

public class MemberController {
	
	private MemberService memberService = new  MemberService();

	public List<Member> selectAll() {
		List<Member> list = null;
		try {
		 list = memberService.selectAll();
		}catch(MemberException e) {
			//서버로깅
			//관리자 이메일 알림
			new MemberMenu().displayError(e.getMessage() + " : 관리자에게 문의하세요");
		}
		return list;
	}
	
	public int insertMember(Member member) {
		return memberService.insertMember(member);
	}

	public Member selectOne(String memberId) {
		return memberService.selectOne(memberId);
	}


	public Member selectName(String memberName) {
		return memberService.selectName(memberName);
	
	}

	public int deleteMember(String memberId) {
		return memberService.deleteMember(memberId);
	}

	public int updateMember(Member m) {
		return memberService.updateMember(m);
	}

	public List<DeleteMember>deleteSerch() {
		 List<DeleteMember> listD = null;
		 try {
		listD = memberService.deleteSerch();
		 }catch(MemberException e) {
			//서버로깅
			//관리자 이메일 알림
			new MemberMenu().displayError(e.getMessage() + " : 관리자에게 문의하세요");
			}
		return listD;
	}

}
