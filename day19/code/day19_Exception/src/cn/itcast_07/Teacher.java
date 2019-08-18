package cn.itcast_07;

public class Teacher {
	public void check(int score) throws MyException {
		if (score < 0 || score > 100) {
			throw new MyException("鍒嗘暟涓嶅湪0-100涔嬮棿");
		} else {
			System.out.println("鍒嗘暟姝ｅ父");
		}
	}
}
