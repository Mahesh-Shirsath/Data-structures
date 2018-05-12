/* Program of stack using linked list*/
# include<stdio.h>
# include<malloc.h>

struct node
{
	int info;
	struct node *link;
} *top=NULL;

int push();
int pop();
int display();
int search();

int main()
{
	int choice;
  printf("+----------------+\n");
  printf("|     1.Push     |\n");
  printf("|     2.Pop      |\n");
  printf("|     3.Display  |\n");
  printf("|     4.Search   |\n");
  printf("|     5.Exit     |\n");
  printf("+----------------+\n");
  printf("Enter your choice : ") ;
  scanf("%d", &choice);

  while(1)
	{
		switch(choice)
		{
		case 1:
			push();
			break;
		case 2:
			pop();
			break;
		case 3:
			display();
			break;
    case 4:
      search();
      break;
		case 5:
			return(0);
		default :
			printf("Wrong choice\n");
		}/*End of switch */
	}/*End of while */
}/*End of main() */

int push()
{
	struct node *tmp;
	int pushed_item;
	tmp = (struct node *)malloc(sizeof(struct node));
	printf("Input the new value to be pushed on the stack : ");
	scanf("%d",&pushed_item);
	tmp->info=pushed_item;
	tmp->link=top;
	top=tmp;
}/*End of push()*/

int pop()
{
	struct node *tmp;
	if(top == NULL)
		printf("Stack is empty\n");
	else
	{       tmp=top;
		printf("Popped item is %d\n",tmp->info);
		top=top->link;
		free(tmp);
	}

}/*End of pop()*/

int display()
{       struct node *ptr;
	ptr=top;
	if(top==NULL)
		printf("Stack is empty\n");
	else
	{
		printf("Stack elements :\n");
		while(ptr!= NULL)
		{
			printf("%d\t",ptr->info);
			ptr = ptr->link;
		}/*End of while */
	}/*End of else*/
}/*End of display()*/

int search()
{
  struct node *temp;
  int search,cout=0;
  temp=top;
  if(top==NULL)
  {
    printf("Entered Stack is Empty\n");
    return(0);
  }
  printf("Enter the element you want to Search : ");
  scanf("%d\n",&search);
  while(temp != NULL)
  {
    if(search==temp->info)
    {
      printf("Element is in stack\n");
      cout++;
    }
    temp=temp->link;
  }
    if(cout==0)
      printf("Element is not found in Stack\n");
}
