import java.util.Scanner;

class StringOperation {
    private String data;

    public StringOperation(String data) {
        this.data = data;
    }

    public int frequency(String s) {
        int c = 0;
        for (int i = 0; i < data.length(); i++) {
            int j;
            for (j = 0; j < s.length(); j++) {
                if (data.charAt(i + j) != s.charAt(j))
                    break;
            }
            if (j == s.length())
                c++;
        }
        return c;
    }

    public boolean isStartWith(String s) {
        if (data.length() < s.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (data.charAt(i) != s.charAt(i))
                return false;
        }
        return true;
    }

    public void converToArray(char s[]) {
        if (s.length < data.length()) {
            System.out.println("Unable to convert into an array due to smaller size of array.");
            return;
        }
        for (int i = 0; i < data.length(); i++)
            s[i] = data.charAt(i);
    }

    public void displayTokens() {
        System.out.println("Tokens: ");
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == ' ' || data.charAt(i) == '@' || data.charAt(i) == '.') {
                System.out.println();
                continue;
            }
            System.out.print(data.charAt(i));
        }
        System.out.println();
    }
}

public class q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string: ");
        String data = scan.nextLine();
        // System.out.println(data);
        StringOperation operation = new StringOperation(data);
        System.out.println("Number of times 'a' appears: " + operation.frequency("a"));
        System.out.println("Number of times 'and' appears: " + operation.frequency("and"));
        System.out.println("Is starts with 'The' : " + operation.isStartWith("The"));
        char input[] = new char[data.length()];
        operation.converToArray(input);
        System.out.print("After conversion array: ");
        for (int i = 0; i < input.length; i++)
            System.out.print(input[i]);
        System.out.println();
        operation.displayTokens();

    }
}
