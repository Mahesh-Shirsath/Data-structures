/* Program of circular queue using array*/
# include<stdio.h>
# define MAX 5

int cqueue_arr[MAX];
int front = -1;
int rear = -1;

int insert();
int del();
int display();

int main()
{
	int choice;
  	printf("+----------------+\n");
	printf("|     1.Insert   |\n");
	printf("|     2.Delete   |\n");
	printf("|     3.Display  |\n");
	printf("|     4.Exit     |\n");
	printf("+----------------+\n");

  while(1)
	{
		printf("Enter your choice : ");
		scanf("%d",&choice);

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
			return(1);
		default:
			printf("Wrong choice\n");
		}/*End of switch*/
	}/*End of while */
}/*End of main()*/

int insert()
{
	int added_item;
	if((front == 0 && rear == MAX-1) || (front == rear+1))
	{
		printf("Queue Overflow \n");
		return(0);
	}
	if (front == -1)  /*If queue is empty */
	{
		front = 0;
		rear = 0;
	}
	else
		if(rear == MAX-1)/*rear is at last position of queue */
			rear = 0;
		else
			rear = rear+1;
	printf("Input the element for insertion in queue : ");
	scanf("%d", &added_item);
	cqueue_arr[rear] = added_item ;
}/*End of insert()*/

int del()
{
	if (front == -1)
	{
		printf("Queue Underflow\n");
		return(0);
	}
	printf("Element deleted from queue is : %d\n",cqueue_arr[front]);
	if(front == rear) /* queue has only one element */
	{
		front = -1;
		rear=-1;
	}
	else
		if(front == MAX-1)
			front = 0;
		else
			front = front+1;
}/*End of del() */

int display()
{
	int front_pos = front,rear_pos = rear;
	if(front == -1)
	{
		printf("Queue is empty\n");
		return(0);
	}
	printf("Circular Queue elements :\n");
	if( front_pos <= rear_pos )
		while(front_pos <= rear_pos)
		{
			printf("%d ",cqueue_arr[front_pos]);
			front_pos++;
		}
	else
	{
		while(front_pos <= MAX-1)
		{
			printf("%d ",cqueue_arr[front_pos]);
			front_pos++;
		}
		front_pos = 0;
		while(front_pos <= rear_pos)
		{
			printf("%d ",cqueue_arr[front_pos]);
			front_pos++;
		}
	}/*End of else */
	printf("\n");
}/*End of display() */
