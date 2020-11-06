public class Test
{
    public static void main (String [] args)
    {
        Student [] sortById = Student.getSamples (true);
        for (int i = 0; i < sortById.length; i++)
        {
            System.out.print (sortById [i]);
            System.out.print (' ');
        }
        System.out.println ();
        Student [] sortedById = insert.insert(sortById);
        for (int i=0; i<sortedById.length; i++)
        {
            System.out.print (sortedById[i]);
            System.out.print (' ');
        }
        System.out.println ();
        Student [] sortByGPA = Student.getSamples (false);
        quick.quickSort (sortByGPA, 0, sortByGPA.length - 1);

        for (int i=0; i<sortByGPA.length; i++)
        {
            System.out.print (sortByGPA[i]);
            System.out.print (' ');
        }
        System.out.println ();
        int [] sortByAll = new int [sortById.length + sortByGPA.length];
        int j=0;
        for (int i = 0; i < sortByAll.length; i++)
        {
            if (i < sortById.length)
            {
                sortByAll [i] = sortById [i].getId();
            }
            else
            {
                sortByAll [i] = sortByGPA [j].getGPA();
                j++;
            }
        }
        merge.mergeSort (sortByAll, 0, sortByAll.length);
        for (int i=0; i<sortByAll.length; i++)
        {
            System.out.print (sortByAll[i]);
            System.out.print (' ');
        }
    }
}