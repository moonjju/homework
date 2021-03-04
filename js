<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>실습문제2</title>
<style>
	#result {
		background:yellowgreen;
		border:1px solid black;
		height:200px;
	}
	#productAmount {
		width:100px;
	}
</style>
</head>
<body>
	<h2>@실습문제2</h2>
	<form method="get" action="">
		<fieldset>
			<legend>납품정보</legend>
			<ul>
				<li>
					<label for="goodirum">상품명 : </label> 
                    <input type="text" id="productName" list="goodlist" required>
					<datalist id="goodlist">
						<option value="dog1004">도그1004</option>
						<option value="catchicken">고양이치킨</option>
						<option value="milk">우유</option>
					</datalist>
				</li>
				<br>
				<li>
					<label for="productAmount">납품수량 : </label> 
					<input type="number" id="productAmount" min="10" max="100" step="10" placeholder="최소10이상">
				</li>
				<br>
				<li>
					<label for="productLevel">납품등급 : </label> 
					<input type="range" id="productLevel" min="0" max="10" step="2" onchange="showVal();" >&nbsp;
					<span id="pVal">0</span>
				</li>
				<br>
				<li>
					<label for="message">기타사항 : </label>
					<textarea id="message" rows="5" cols="30"></textarea>
				</li>
			</ul>
		</fieldset>
		<br>
		<input type="button" value="send message" onclick="printProduct();">
	</form>
	<div id="result"></div>

    <script>
        function showVal() {
            pVal.innerHTML = productLevel.value;
        }

        function printProduct() {
            var bool = confirm("입력하시겠습니까?");
			if(bool == true){
            
			var pnum = document.getElementById("productAmount").value;//납품수량
			var pLevel = document.getElementById("productLevel").value;//등급
			var msg = document.getElementById("message").value;//메세지 박스
			
			var result = document.getElementById("result");

			result.innerHTML += "상품명 : " + productName.value + "<br>";
			result.innerHTML += "납품등급 : " + pLevel+ "<br>";
			result.innerHTML += "납품수량 : " + pnum + "<br>";
			result.innerHTML += "기타사항 : " + msg+ "<br>";
			}

        }
    </script>
</body>
</html>
