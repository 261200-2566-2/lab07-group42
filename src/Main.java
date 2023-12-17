public class Main 
{
    public static void main(String[] args) 
    {                                                                                                                           
        MySet<Integer> test = new MySet<>();

        for(int i = 0; i < 65; i++)
        {
            test.add(i);
        }

        for(int i: test) System.out.print(i + " " );

        System.out.println();

        test.remove(1);

        for(int i: test) System.out.print(i + " " );
        System.out.println();

        test.add(200);
        for(int i: test) System.out.print(i + " " );
    }
    
}