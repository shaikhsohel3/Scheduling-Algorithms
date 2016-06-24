# Scheduling-Algorithms

		

What is sorting?
Ordering of elements in a particular order.Sorting can be implemented by following sorting algorithms:
1.Bubble Sort.
2.Insertion Sort.
3.Quick Sort.
4.Selection Sort.
5.Merge Sort.

1.Bubble sort
	Bubble sort can be viewed a bubbles stream in which the smallest bubble will float at the top and the  largest at the bottom. Bubble sort ,We can viewed as ,a bubble is compared with its neighbouring bubble if it is larger than its neighbour then the larger bubble takes the position of smaller bubble and smaller one of the larger one.The process is repeated till the largest bubble goes to the end and the smallest bubble at the start.
The example can be illustrated as:
 The largest element - 7 - is bubbled to the bottom:

    7, 5, 2, 4, 3, 9
    5, 7, 2, 4, 3, 9
    5, 2, 7, 4, 3, 9
    5, 2, 4, 7, 3, 9
    5, 2, 4, 3, 7, 9
    5, 2, 4, 3, 7, 9

Sample Code : -
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
				if(itemList[j]>itemList[j+1])
				//Comparing Bubble with neighbour bubble
				{
					// swap the larger bubble with the smaller
					temp=itemList[j];
					itemList[j]=itemList[j+1];
					itemList[j+1]=temp;
				}
			}
		}
		
	}


2.Insertion sort
Another basic algorithm for sorting is the Insertion Sort. We can also illustrate this algorithm with playing cardsWe begin the sort by placing the marker after the first card in our hand. Then we compare the second card with the first. If the second card is smaller, we swap it with the first. Then we advance our marker to indicate that the sorted section now contains two ordered cards. By repeating this process of swapping an unsorted card into the correct sorted position and advancing our sort marker, we can order the entire hand of cards.

The example can be illustrated as :-
29, 20, 73, 34, 64
29, 20, 73, 34, 64
20, 29, 73, 34, 64
20, 29, 73, 34, 64
20, 29, 34, 73, 64
20, 29, 34, 64, 73

Sample Code :-

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

3.Selection Sort
 Selection sort carries out a sequence of passes over the table. At the first pass an entry is selected on some criteria and placed in the correct position in the table. The possible criteria for selecting an element are to pick the smallest or pick the largest. If the smallest is chosen then, for sorting in ascending order, the correct position to put it is at the beginning of the table. Now that the correct entry is in the first place in the table the process is repeated on the remaining entries. Once this has been repeated n-1 times the n-1 smallest entries are in the first n-1 places which leaves the largest element in the last place. Thus only n-1 passes are required. The algorithm can be described as follows: 

29, 64, 73, 34, 20,
20, 64, 73, 34, 29,
20, 29, 73, 34, 64
20, 29, 34, 73, 64
20, 29, 34, 64, 73


Sample code :-
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
 
