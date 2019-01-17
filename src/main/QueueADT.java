package main;

public class QueueADT
{

	int[] queue = new int[10];
	int front = -1;
	int rear = -1;
	int size = queue.length;

	void enqueue(int value)
	{

	}

	int dequeue()
	{
		int deleted = 0;


		return deleted;
	}

	int peek(int index)
	{	if(!isEmpty()) {
		int item = 0;
		item = queue[index];
		return item;
	}
	else
	{
		System.out.println("Queue is empty");
		return 0;
	}
	}

	int size()
	{
		int size = 0;

		return size;
	}

	boolean isEmpty()

	{
		if(front==-1 && rear==-1) {
			return true;
		}
		else {
            return false;
        }
	}

	boolean isFull()

	{
		return false;
	}

}
