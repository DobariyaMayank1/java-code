public class stringbulider {

    public static void main(String[] args) {

        StringBuilder s1  = new StringBuilder("");

        for(char i= 'a'; i<= 'z';i++){
            s1.append(i);
        }

        System.out.println(s1 );


    }

}
