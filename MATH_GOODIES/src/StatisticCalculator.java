/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
class StatisticCalculator {
    private int[] input = new int[100];
    private int len;


    float mean(float[] ar) {
        float sum = 0.0F;
    for (float d : ar) {
      sum += d;
    }
    return sum / ar.length;
    }

    float median(float[] ar) {
        quickSort(ar, 0, ar.length - 1);
    int half = ar.length / 2;
    if (ar.length % 2 == 0) {
      return (ar[(half - 1)] + ar[half]) / 2.0F;
    }
    return ar[half];
    }
    
    public void quickSort(float[] ar, int left, int right)
  {
    if (right > left)
    {
      int pivot = (left + right) / 2;
      pivot = partition(ar, left, right, pivot);
      quickSort(ar, left, pivot - 1);
      quickSort(ar, pivot + 1, right);
    }
  }
    
    public int partition(float[] ar, int left, int right, int pivot)
  {
    float pivotValue = ar[pivot];
    ar[pivot] = ar[right];
    ar[right] = pivotValue;
    int index = left;
    for (int x = left; x < right; x++) {
      if (ar[x] < pivotValue)
      {
        float temp = ar[x];
        ar[x] = ar[index];
        ar[index] = temp;
        index++;
      }
    }
    ar[right] = ar[index];
    ar[index] = pivotValue;
    return index;
  }

    float standardDeviation(float[] ar) {
        float mean = mean(ar);
    float ssd = 0.0F;
    for (float d : ar) {
      ssd += (d - mean) * (d - mean);
    }
    return (float) Math.sqrt(ssd / (ar.length - 1));
    }
    public static int mode(int[] arr)
	{
		
		int modeCount = 0;	// The count of the mode value
		int mode = 0;		// The value of the mode

		int currCount = 0;
		
		// Iterate through all values in our array and consider it as a possible mode
		for (int candidateMode : arr)
		{
			// Reset the number of times we have seen the current value
			currCount = 0;
			
			// Iterate through the array counting the number of times we see the current candidate mode
			for (int element : arr)
			{
				// If they match, increment the current count
				if (candidateMode == element)
				{
					currCount++;
				}
			}
			
			// We only save this candidate mode, if its count is greater than the current mode
			// we have stored in the "mode" variable
			if (currCount > modeCount)
			{
				modeCount = currCount;
				mode = candidateMode;
			}
		}
		
		return mode;
	}

    float minimum(float[] ar) {
        quickSort(ar, 0, ar.length - 1);
        return ar[0];
    }

    float maximum(float[] ar) {
        quickSort(ar, 0, ar.length - 1);
        return ar[ar.length - 1];
    }

    float[] ascending_order(float[] ar) {
        quickSort(ar, 0, ar.length - 1);
       // int[] input_array1 = new int[items.length];
        return ar;
    }

    float[] descending_order(float[] ar) {
        quickSort(ar, 0, ar.length - 1);
       float[] arr = new float[ar.length];
       for (int k = 0; k < arr.length; k++) {
            
                arr[k] = ar[ar.length-1-k];
           }
        return arr;
    }
}
