package main;

public class Octal {

	public static void main(String[] args) {
		System.out.println(rot13("Hello, Xavier"));
		System.out.println(octal(1234567));
	}

	public static String octal(int num) {
		StringBuilder answer = new StringBuilder();
		while(num>0) {
			System.out.println(num + "/8" + " = " + (num / 8) + " R-" + (num%8));
			answer.append(num%8);
			num /= 8;
		}
		
		return answer.reverse().toString();
	}

	public static String rot13(String message) {
		StringBuilder answer = new StringBuilder();
		for (char c : message.toCharArray()) {
			if ((c >= 'A' && c <= 'M') || (c >= 'a' && c <= 'm')) {
				c += 13;
			} else if ((c >= 'N' && c <= 'Z') || (c >= 'n' && c <= 'z')) {
				c -= 13;
			}
			answer.append(c);
		}
		return answer.toString();
	}

}
