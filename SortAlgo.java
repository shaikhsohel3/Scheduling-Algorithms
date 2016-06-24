import java.util.Scanner;

class sort
{
	int num;
	int [] itemList; // for storing the items
	int [] tempArr;
	
	sort()
	{
		System.out.println("Please enter number of element:");		
		Scanner scn= new Scanner(System.in);
		num=scn.nextInt();
		if(num>0)
		itemList = new int[num];
		
		System.out.println("enter the element:");		
		for(int i=0;i<num;i++)
			itemList[i]=scn.nextInt();
		
	}
	
	/**************************************************
	 BUBBLE SORT
	 *************************************************/
	
	void Bubble_sort()
	{
		int temp=0;
		for(int i=num-1;i>0;i--) // no. of passes
		{
			for(int j=0; j<i ;j++)
			{
				if(itemList[j]>itemList[j+1])//Comparing Bubble with neighbour bubble
				{
					// swap the larger bubble with the smaller
					temp=itemList[j];
					itemList[j]=itemList[j+1];
					itemList[j+1]=temp;
				}
			}
		}
		
	}
	
	/**************************************************
	 INSERTION SORT
	 *************************************************/
	void Insertion_sort()
	{
		int temp=0;
		for(int i=1;i<num;i++)
		{
			for(int j=i; j>0 ;j--)
			{
				if(itemList[j]<itemList[j-1])
				{	
					//swap the two elements
					temp=itemList[j];
					itemList[j]=itemList[j-1];
					itemList[j-1]=temp;
				}
			}
		}
		
	}
	
	/**************************************************
	 SELECTION SORT
	 *************************************************/

	void Selection_sort()
	{
		int temp=0;
		for(int i=0;i<num;i++)
		{
			for(int j=i+1; j<num ;j++)
			{
				if(itemList[i]>itemList[j])
				{	
					//swap the two elements
					temp=itemList[i];
					itemList[i]=itemList[j];
					itemList[j]=temp;
				}
			}
		}
		
	}

	/**************************************************
	 MERGE SORT
	 *************************************************/
	
	public void Merge_sort() {
		// TODO Auto-generated method stub
		
		tempArr=new int[num];
		sortt(0,num-1);

		
	}

	private void merge(int low,int mid,int high) {
		// TODO Auto-generated method stub
		int l1,l2 = 0,i;
		try{
		for(l1=low ,l2=mid+1,i=low; l1<=mid && l2<=high ;i++)
		{
			if(itemList[l1]<=itemList[l2])
				{tempArr[i]=itemList[l1];l1++;}
			else
				{tempArr[i]=itemList[l2];l2++;}
				
		}
		
		//when l2 gets exhausted
		while(l1<=mid)
			tempArr[i++]=itemList[l1++];

		// when l1 gets exhausted
		while(l2<=high)
			tempArr[i++]=itemList[l2++];
		
		for(i=0;i<=high;i++)
			itemList[i]=tempArr[i];
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
	}

	private void sortt(int low, int high) {
		// TODO Auto-generated method stub
		
		int mid;
		
		if(low<high)
		{
			mid =(low+high)/2;
			//divide into two arrays recursively until we reach the atomic element
			sortt(low,mid);
			sortt(mid+1,high);
			//merge the two arrays in sorted order
			merge(low,mid,high);
		}
		else
			return;
	}
	
	/**************************************************
	 QUICK SORT
	 *************************************************/

	public void Quick_sort()
	{
		qksort(0,num-1);
	}
	public void qksort(int lowerIndex, int higherIndex) {
        
       int i = lowerIndex;
       int j = higherIndex;
       // calculate pivot number, I am taking pivot as middle index number
       int pivot = itemList[lowerIndex+(higherIndex-lowerIndex)/2];
       // Divide into two arrays
       while (i <= j) {
           /**
            * In each iteration, we will identify a number from left side which 
            * is greater then the pivot value, and also we will identify a number 
            * from right side which is less then the pivot value. Once the search 
            * is done, then we exchange both numbers.
            */
           while (itemList[i] < pivot) {
               i++;
           }
           while (itemList[j] > pivot) {
               j--;
           }
           if (i <= j) {
        	   int temp = itemList[i];
               itemList[i] = itemList[j];
               itemList[j] = temp;
               //move index to next position on both sides
               i++;
               j--;
           }
       }
       // call quickSort() method recursively
       if (lowerIndex < j)
    	   qksort(lowerIndex, j);
       if (i < higherIndex)
    	   qksort(i, higherIndex);
   }
	void display()
	{
		System.out.println("Sorted Elements are :");
		for(int i=0;i<num;i++)
		{
			System.out.println(itemList[i]);
		}

	}

 	
	
}

public class SortAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		sort t=new sort();
		do
		{
			System.out.println("Please Select sorting method :\n");
			System.out.println("1.Bubble Sort\n");		
			System.out.println("2.Insertion Sort\n");		
			System.out.println("3.Selection Sort\n");		
			System.out.println("4.Merge Sort\n");		
			System.out.println("5.Quick Sort\n");		
			System.out.println("6.Exit :\n");
	
			Scanner scn= new Scanner(System.in);
			choice=scn.nextInt();
			
				switch(choice)
				{
				case 1: t.Bubble_sort(); break; 
				case 2: t.Insertion_sort(); break;
				case 3: t.Selection_sort(); break;
				case 4: t.Merge_sort(); break;
				case 5: t.Quick_sort(); break;
				case 6: return;
				default : System.out.println("Please Enter The Correct Choice\n");
				}
				
				t.display();
		}while(true);
		
	}
}
