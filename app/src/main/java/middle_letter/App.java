package middle_letter;

public class App {
    String letters;

	public String getMidOfString(String str){
		int len = str.length();
        int middleIdx = len / 2;
        int beforeMidIdx = len / 2 - 1;

        if (len % 2 == 0) {
            String middleLetter = String.valueOf(str.charAt(middleIdx));
            String beforeMiddle = String.valueOf(str.charAt(beforeMidIdx));

            letters = beforeMiddle + middleLetter ;

        } else {
            letters = String.valueOf(str.charAt(middleIdx));
        }
        return letters;
	}
	public static void main(String args[]){
		App app = new App();

        String str = "test";

        System.out.println(app.getMidOfString(str));
	}
}

