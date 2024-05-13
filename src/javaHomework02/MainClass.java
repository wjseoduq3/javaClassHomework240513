package javaHomework02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
			if (result) {
				System.out.println("로그인되었습니다");
				memberService.logout("hong");
			} else {
				System.out.println("로그인에 실패하였습니다.");
				System.out.println("id 와 password를 다시 입력해주세요.");
			}
		

	}

}
