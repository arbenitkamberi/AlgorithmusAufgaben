public class Palindrom {

    public static void main(String... args){
        System.out.println("Recursive:");
        System.out.println(isPalindromRecursive("ABBA"));
        System.out.println(isPalindromRecursive("ABCBA"));
        System.out.println(isPalindromRecursive("lagerregal"));
        System.out.println(isPalindromRecursive("arbenit"));

        System.out.println("--------\nLoop:");
        System.out.println(isPalindromLoop("ABBA".toCharArray()));
        System.out.println(isPalindromLoop("ABCBA".toCharArray()));
        System.out.println(isPalindromLoop("lagerregal".toCharArray()));
        System.out.println(isPalindromLoop("arbenit".toCharArray()));
    }


    //-- Rekursiv
    public static boolean isPalindromRecursive(String input){
        return isPalindromRecursive(input.toCharArray(), 0, input.length() - 1);
    }

    private static boolean isPalindromRecursive(char[] input, int start, int end){
        if(start > end) {
            return true;
        }
        if(input[start] == input[end]){
            return isPalindromRecursive(input, ++start, --end);
        }
        return false;
    }


    //-- Loop
    public static boolean isPalindromLoop(char[] input){
        for(int i = 0; i < input.length; ++i){
            if(input[i] != input[input.length - i - 1]){
                return false;
            }
        }
        return true;
    }
}
