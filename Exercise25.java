public class Exercise25 {
    public static void main(String args []) {
        char[] howMany = {'a', 'b', 'k', 'd', 'e', 'a', 'r', 'z', 'a', 'k'};

        System.out.println(number(howMany, 'a'));
    };

    public static int number(char [] howMany, char character) {
        int counter = 0;

        for(int i = 0; i < howMany.length; i++)
        {
            if(howMany[i] == 'a') {
                counter++;
            }

        }
        return counter;

    }
}