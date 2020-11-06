class insert
{
    public static Student [] insert (Student [] array)
    {
        for (int i = 1; i < array.length; i++)
        {
            Student elem = array [i];
            int j = i - 1;
            while (j >= 0 && (array [j].getId () > elem.getId()))
            {
                array [j + 1] = array [j];
                j--;
            }
            array [j + 1] = elem;
        }
        return array;
    }
}