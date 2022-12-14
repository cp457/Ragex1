public class Main {
    public static void main(String[] args) {

        String s1 = "I Like to code near the Lake with my friend Luke";

        String s2 = s1.replaceAll("(La|Li)",  "BLA");


        System.out.println(s2);


    }



}



/*
    You have a string with the following value: I Like to code near the Lake with my friend Luke
    with a regular expression, change into BLA all occurrences of words that start with an l and end with a ke, except your friend
    print the result


 */