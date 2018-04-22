public class RadixSort
{
   //------------------------------------------------------------------
   //  Perform a radix sort on a set of numeric values.
   //------------------------------------------------------------------
   public static void main (String[] args)
   {
      int[] list = {7843, 4568, 8765, 6543, 7865, 4532, 9987, 3241,
                    6589, 6622, 1211};
      int radixLength = 3;
      String temp;
      int digit, num;

      QueueReferenceBased[] digitQueues =
         (QueueReferenceBased[])(new QueueReferenceBased[10]);

      for (int digitVal = 0; digitVal <= 9; digitVal++)
         digitQueues[digitVal] = new QueueReferenceBased();

      // sort the list
      for (int position=0; position <= radixLength; position++)
      {
         for (int scan = 0; scan < list.length; scan++)
         {
            temp = String.valueOf (list[scan]);
            digit = Character.digit (temp.charAt(radixLength-position), 10);
            digitQueues[digit].enqueue(list[scan]);
         }

         // gather numbers back into list
         num = 0;
         for (int digitVal = 0; digitVal <= 9; digitVal++)
         {
            while (!(digitQueues[digitVal].isEmpty()))
            {
               list[num] = (Integer)digitQueues[digitVal].dequeue();
               num++;
            }
         }
      }

      // output the sorted list
      for (int scan = 0; scan < list.length; scan++)
         System.out.println (list[scan]);
   }
}
