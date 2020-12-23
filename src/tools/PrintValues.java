package tools;

public class PrintValues {

    public void printresults(double[] array, String array_name)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array_name + (i+1) + ": " + array[i]);
        }
    }

}
