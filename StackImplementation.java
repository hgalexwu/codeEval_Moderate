package codeEval_Moderate;
import java.util.*;
import java.io.*;


public class StackImplementation {

	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		String currentLine = br.readLine();
		while (currentLine != null)
		{
			currentLine.trim();
			Stack<Integer> intStack = new Stack<>();
			String[] parts = currentLine.split(" ");
			for (int i=0; i<parts.length;i++)
			{
				intStack.push(Integer.parseInt(parts[i]));
			}
			while (!intStack.isEmpty())
			{
				System.out.print(intStack.pop() + " ");
				if (!intStack.isEmpty())
					intStack.pop();	
			}

			currentLine = br.readLine();
			System.out.println("");
		}
		br.close();
	}
}
