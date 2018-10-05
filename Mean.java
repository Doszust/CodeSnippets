/**
 * Intakes an array of integers and returns the rounded mean
 * 
 * @param numArray
 * @return mean
 */
public int getMean(int numArray[])
{
	int runningTotal = 0;
	int mean = 0;
	
	for(int i = 0; i < numArray.length; i++)
	{
		runningTotal = runningTotal + numArray[i];
	}
	
	mean = runningTotal/numArray.length;
	
	return mean;
}
