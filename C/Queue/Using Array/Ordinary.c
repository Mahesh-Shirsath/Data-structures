/*Program of queue using array*/
# include<stdio.h>
# define MAX 5

int queue_arr[MAX];
int rear = -1;
int front = -1;
int insert();
int del();
int display();
int search();

int main()
{
	int choice;
	printf("+----------------+\n");
	printf("|     1.Insert   |\n");
	printf("|     2.Delete   |\n");
	printf("|     3.Display  |\n");
	printf("|     4.Search   |\n");
	printf("|     5.Exit     |\n");
	printf("+----------------+\n");

	while(1)
	{
		printf("Enter your choice : ") ;
		scanf("%d", &choice);
		switch(choice)
		{
		case 1 :
			insert();
			break;
		case 2 :
			del();
			break;
		case 3:
			display();
			break;
		case 4:
			search();
			break;
		case 5:
			printf("you are out of loops");
			return(0);
		default:
			printf("Wrong choice\n");
		}/*End of switch*/
	}/*End of while*/
}/*End of main()*/

int insert()
{
	int added_item;
	if (rear==MAX-1)
		printf("Queue Overflow\n");
	else
	{
		if (front==-1)  /*If queue is initially empty */
			front=0;
		printf("Input the element for adding in queue : ");
		scanf("%d", &added_item);
		rear=rear+1;
		queue_arr[rear] = added_item ;
	}
}/*End of insert()*/

int del()
{
	if(front==rear)
	{
		printf("The queue is Empty\n");
	}
	else
	{
		printf("The deleted no is :%d\n",queue_arr[0]);
		for (int i = 0; i < rear; i++)
		{
			queue_arr[i]=queue_arr[i+1];
		}
		rear-=1;
	}
}/*End of del() */

int display()
{
	int i;
	if (front == -1)
		printf("Queue is empty\n");
	else
	{
		printf("Queue is :\n");
		for(i=front;i<= rear;i++)
			printf("%d  ",queue_arr[i]);
		printf("\n");
	}
}/*End of display() */

int search()
{
	int i=front,search,cout=0;
	printf("Enter the element you wanted to search : ");
	scanf("%d",&search);
	while(i!=MAX-1)
	{
		if(search==queue_arr[i])
		{
			printf("Your element found in queue on position : %d\n",i);
			cout++;
		}
		i++;
	}
	if(cout==0)
	{
		printf("Your element is not found in queue\n");
	}
}
