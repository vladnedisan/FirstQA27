
class Ideone
{
    public static int[] array;

    public static void main(String[] args)
    {
        array = new int[100];
        for(int i=0; i<100; i++)
            array[i] = i + 1;
        printArray();
    }

    public static void printArray()

    {
        int i;
        for(i=1; i<=100; i++){
            if (i % 10 != 0)
                System.out.print("_");
            else
                System.out.println("_");
        }
    }
}