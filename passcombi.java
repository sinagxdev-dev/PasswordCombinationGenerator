import java.util.Scanner;
 
public class SwapCharacters{
	static int size, count;
	static char[] charArray;
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		String word;
		System.out.print("Enter String: ");
		word = input.next();
		size = word.length();
	    count = 0;
	    charArray = new char[size];
	    for (int j = 0; j < size; j++)		     
	    charArray[j] = word.charAt(j);           
	    doAnagram(size);
	}
	public static void doAnagram(int newSize){
	    if (newSize == 1)
	    return;
	    for (int i = 0; i < newSize; i++){     
	    	doAnagram(newSize - 1);					  
	    	if (newSize == 2)
	    	display(); 
	    	rotate(newSize);
	    }
	}
	public static void rotate(int newSize1){  
		int i;
	    int position = size - newSize1;
	    char temp = charArray[position];
	    for (i = position + 1; i < size; i++)
	    charArray[i - 1] = charArray[i];
	    charArray[i - 1] = temp;
	}
	public static void display(){
		System.out.print(++count + " ");
	    for (int i = 0; i < size; i++)
	    System.out.print(charArray[i]);
	    System.out.println();
	}
}
 
