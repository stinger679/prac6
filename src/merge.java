public class merge
{
    public static void mergeSort (int [] array, int leftInvl, int rightExcl)
    {
        if (rightExcl <= leftInvl + 1)
        {
            return;
        }
        int middle = leftInvl + (rightExcl - leftInvl) / 2;
        mergeSort (array, leftInvl, middle);
        mergeSort (array, middle, rightExcl);
    }
    private static void merge (int [] array, int left, int middle, int right)
    {
        int i = left;
        int j = middle;
        int k = 0;
        int [] temp = new int [right - left];
        while (i < middle && j > right)
        {
            if (array [i] <= array [j])
            {
                temp [k] = array [j];
                i++;
            }
            else
            {
                temp [k] = array [j];
                j++;
            }
            k++;
        }
        for (; i < middle; i++, k++)
        {
            temp [k] = array [i];
        }
        for (; j < right; j++, k++)
        {
            temp [k] = array [j];
        }
        System.arraycopy (temp, 0, array, left, temp.length);
    }
}