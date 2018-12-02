import java.util.*;
class Node<N>           //creation of node
{
N data;
Node<N> next;

Node(N data)
{
this.data=data;
this.next=null;
}
}

//----------------------------------------------operations on link list -----------------------------------------------------
class linklist
{

               // --------------- insert at front-----------
	
	public static Node<Integer> insertatend(Node<Integer> head,int data)
	{
		Scanner sc=new Scanner(System.in);
	while(data!=-1)
	{
	Node<Integer>NewNode=new Node<Integer>(data);
	if(head==null)
	{
		head=NewNode;
	}
	else
	{
		Node<Integer>temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=NewNode;
	}
	data=sc.nextInt();
	}
	return head;
	}



// --------------- insert at front-----------
public static Node<Integer> insertatfront(Node<Integer> head,int data)
{
while(data!=-1)
	{
		Scanner sc=new Scanner(System.in);
	Node<Integer>NewNode=new Node<Integer>(data);
	if(head==null)
	{ head=NewNode;
	}
	else
	{
		NewNode.next=head;
		head=NewNode;
	}
	data=sc.nextInt();
		
}
return head;
}

// --------------- insert at nth position-----------

public static Node<Integer> insertatmid(Node<Integer> head,int data,int pos)
{
	Scanner sc=new Scanner(System.in);
	Node<Integer>NewNode=new Node<Integer>(data);
	Node<Integer> prev=null;
	Node<Integer> curr=head;
	if(pos==0)
	{ 	
      if(head==null)
	  { 
       head=NewNode;
	  }
	  else
	  {
	  NewNode.next=head;
	  head=NewNode;
	  }
	   data=sc.nextInt();
	}
	else
	{
		int i=0;
		while(curr!=null && i<pos)
		{
			prev=curr;
			curr=curr.next;
			i++;
		}
		NewNode.next=curr;
		prev.next=NewNode;
	}
	return head;
}
   
   
   // --------length of a link list-----
   
   public static int lengthoflist(Node<Integer> head)
   {
	   int x=0;
	   Node<Integer> temp=head;
	   
		   while(temp!=null)
		   {
			   temp=temp.next;
			  x++;
		   }
		   return x;
	   }
		
		




// -------------print link list -----------------
	public static void printlist(Node<Integer>head)
{
while(head!=null)
{
System.out.print(head.data+"->"); 
head=head.next;
}
System.out.println("Null");
//System.out.println(head);// present head value
}
public static void main(String[] args)
{
	Node<Integer>headd=null;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the elements of list");
	int value=sc.nextInt();
	Node<Integer> headdd=insertatend(headd,value);
	System.out.println("you entered following list");
	printlist(headdd);
	Node<Integer> headddd=insertatfront(headd,value);
	System.out.println("you entered following list");
	printlist(headddd);
	System.out.println("Enter the position you want to insert");
	int position=sc.nextInt();
	System.out.println("Enter the value you want to insert");
	int valuee=sc.nextInt();
	Node<Integer> headdddd=insertatmid(headdd,valuee,position);
	System.out.println("New updated list");
	printlist(headdddd);
	int length=lengthoflist(headdddd);
	System.out.println("The length of list is : "+length);
}
}