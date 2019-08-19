public class PracticeString {
    public static void main(String[] args) {

        String s = "Hello Java";
        System.out.println(s.charAt(3));//print third character --- l
        System.out.println(s.substring(3));//print after 3 character ----- lo Java
        System.out.println(s.substring(3,5)); // print between 3 and 5 character --- lo
        System.out.println(s.replaceAll("l","j")); // Replace all "l" character with "j"
        System.out.println(s.toUpperCase());// Print all capital
        System.out.println("HELLO WORLD".toLowerCase());//print all "HELLO WORLD" in lower case
        System.out.println("HELLO WORLD".toCharArray()[2]);// Print 2 index character
        System.out.println("$250".startsWith("$"));// check condition for starting letter
        System.out.println("EURUSD".endsWith("USD"));//check condition for end letter
}
}
