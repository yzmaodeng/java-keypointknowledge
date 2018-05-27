package com.zl.Datastructure;


class Node{  
    public Node next;  
    public int data;  
    public Node(int data){  
        this.data=data;  
    }  
}  
public class SingleLinkNode {
	
	 public Node head;  
	    public int length=0;  
	    //打印链表  
	    public void printLinkList()  
	    {  
	        Node p=head;  
	        while(p!=null)  
	        {  
	            System.out.println(p.data);  
	            p=p.next;  
	        }  
	        System.out.println("长度为 ："+length);  
	    }  
	    //判断链表是否为空  
	    public Boolean isEmpty()  
	    {  
	        if(head==null)  
	            return true;  
	        return false;  
	    }  
	    //尾插法添加结点  
	    public void addLastNode(int data)  
	    {  
	        Node x=new Node(data);  
	        if(head==null)  
	        {  
	            head=x;length++;  
	            return;  
	        }  
	        Node q=head;  
	        while(q.next!=null)  
	            q=q.next;  
	        q.next=x;  
	        length++;  
	    }  
	    //头插法添加结点  
	    public void addHeadNode(int data)  
	    {  
	        Node x=new Node(data);  
	        if(head==null){  
	            head =x;length++;  
	            return;  
	        }  
	        x.next=head;  
	        head=x;  
	        length++;  
	    }  
	    //删除结点  
	    public Boolean deleteNode(int index)  
	    {  
	        if(index<1||index>length)  
	            return false;  
	        int i=1;  
	        Node p=head;  
	        while(i!=(index-1))  
	        {  
	            p=p.next;  
	            i++;  
	        }  
	          
	        (p.next)=(p.next.next);  
	        length--;  
	        return true;  
	    }  
	    //修改结点  
	    public Boolean updateNode(int index,int data)  
	    {  
	        if(index<1||index>length)  
	            return false;  
	        int i=1;  
	        Node p=head;  
	        while(i<index)  
	            {p=p.next;i++;}  
	        p.data=data;  
	        return true;  
	    }  
	    //向前冒泡，因为冒泡是相邻俩俩进行比较，所以容易知道，当一轮排序发现顺序没有发生改变则数列已经有序 这样可以提高效率  
	    public void SortLinkList()  
	    {  
	        Boolean flag=false;  
	        Node p=head;  
	        Node q=null;  
	        for(int i=0;i<length-1;i++)  
	        {     
	            q=p.next;  
	            for(int j=i;j<length-1;j++)  
	            {  
	                if(p.data>q.data)  
	                {  
	                    int t=p.data;  
	                    p.data=q.data;  
	                    q.data=t;  
	                    flag=true;  
	                }  
	                q=q.next;  
	            }  
	            if(flag==false)  
	                break;  
	            flag=false;  
	            p=p.next;  
	        }  
	    }  

	
	
	

}
