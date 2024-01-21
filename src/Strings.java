public class Strings{
    public static void main(String []args){
         /*Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is : " + name);*/

        /*//Concatination
        String firstName = "Chai";
        String lastName = " Mate";
        String fullName = firstName +"@" + lastName;
        System.out.println(fullName.length());

        //charAt 
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }


        //compareTo 
        String name1 = "hello";
        String name2 = "wello";

        //1 s1>s2 : +ve value 
        //2 s1==s2 : 0
        //3 s1<s2 : -ve value

       /*  if(name1.compareTo(name2) < 0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }*/

        /*//SubString
        String sentence  = "Chaitanya Mate";
        //substring have (begin index , end index)
        String name = sentence.substring(0,10);
        System.out.println(name);*/

        // String Builder 
        /*StringBuilder sb = new StringBuilder("I");
        sb.append(" ");
        sb.append("l");
        sb.append("o");
        sb.append("v");
        sb.append("e");
        sb.append(" ");
        sb.append("U");
        System.out.println(sb.length());*/

        //char at index 0
        //System.out.println(sb.charAt(0));

        // set char at index 0
        // sb.setCharAt(0, 'P');
        //System.out.println(sb);

        //insert char at index
        //sb.insert(2,'n');
        //System.out.println(sb);

        // delete the extra 'n'
        //sb.delete(2,4 );
        //System.out.println(sb);


        // Reverse a string hello
        StringBuilder sb = new StringBuilder("hello");

        for(int i=0;i<sb.length()/2;i++){
            int front = i ;
            int back = sb.length()-1-i;   // 5-1-0

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}