public class testSelectionSort extends TestCase {
	public void test() {
		testPositive();
		testNegative();
		//testZeros();
		testDuplicates();
	}
  public void testPositive(){
 	        int[] arr = new int[5];
 	        arr[0] = 8;
 	        arr[1] = 9;
 	        arr[2] = 7;
 	        arr[3] = 10;
 	        arr[4] = 2;

 	        int[] Sortedarr = new int[5];
 	        Sortedarr[0] = 2;
 	        Sortedarr[1] = 7;
 	        Sortedarr[2] = 8;
 	        Sortedarr[3] = 9;
 	        Sortedarr[4] = 10;

 	        /** add tests to check for this unit test **/
 	        SelectionSort object=new SelectionSort();
 	        object.basicSelectionSort(arr);

 	        for(int i=0;i<arr.length;i++)
 	        {assertEquals("Fails",arr[i],Sortedarr[i]);}

}

          public void testNegative(){
	    	int[] arr = new int[5];
	        arr[0] = -8;
	        arr[1] = -9;
	        arr[2] = -7;
	        arr[3] = -10;
	        arr[4] = -2;

	        int[] Sortedarr = new int[5];
	        Sortedarr[0] =  -10;
	        Sortedarr[1] =  -9;
	        Sortedarr[2] =  -8;
	        Sortedarr[3] =  -7;
	        Sortedarr[4] =  -2;
	        /** Test data contains negative values only **/
	        SelectionSort object=new SelectionSort();
	        object.basicSelectionSort(arr);

	        for(int i=0;i<arr.length;i++)
	        {assertEquals("Fails",arr[i],Sortedarr[i]);}


	    }





}
