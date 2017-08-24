package edu.MeikTranel.JavaAssignments.ProceduralProgramming;

/**
 * Collection of procedural code
 * @author Meik Tranel
 */
public class ProceduralSorting {
    
    /**
     * sorts a given integer array ascending using bubble sort
     * Java port of wikipedia sample implementation of bubble sort in C# 
     * @param sourceList 
     * @see https://en.wikipedia.org/wiki/Bubble_sort
     */
    public static void BubbleSort(int[] sourceList){
        Boolean swapped;
        do
        {
            swapped = false;
            for (int i = 0; i < sourceList.length - 1; i++)
            {
                if (sourceList[i] > sourceList[i + 1])
                {
                    int temp = sourceList[i + 1];
                    sourceList[i + 1] = sourceList[i];
                    sourceList[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped == true);
    }   
    

    
    
    public static int[] selectionSort(int[] sourceArray) {
        for (int i = 0; i < sourceArray.length - 1; i++) {
            for (int j = i + 1; j < sourceArray.length; j++) {
                if (sourceArray[i] > sourceArray[j]) {
                        int temp = sourceArray[i];
                        sourceArray[i] = sourceArray[j];
                        sourceArray[j] = temp;
                }
            }
        }
        return sourceArray;
    }

    /**
     * sorts a string by char atoms starting with the lowest binary representation
     * calls selectionSort
     * @param source
     * @return sorted character array
     * @deprecated kill me
     */
    public static String charSort(final String source){
        char[] characterArray = source.toCharArray();
        int[] numericRepresentationsUnsorted = new int[characterArray.length];

        for (int characterPosition = 0; characterPosition < characterArray.length; characterPosition++) {
            numericRepresentationsUnsorted[characterPosition] = ((int) characterArray[characterPosition]);
        } //for (int characterPosition = 0; characterPosition < characterArray.length; characterPosition++)

        //Assertion is that both length need to be equal before and after sorting
        //Reason: Signature of selectionSort does not promise Length of the returned array
        assert numericRepresentationsUnsorted.length ==  characterArray.length;

        int[] numericRepresentationsSorted = selectionSort(numericRepresentationsUnsorted);

        assert numericRepresentationsSorted.length ==  characterArray.length;


        for (int characterPosition = 0; characterPosition < numericRepresentationsSorted.length; characterPosition++) {
            characterArray[characterPosition] = ((char) numericRepresentationsSorted[characterPosition]);
        } //for (int characterPosition = 0; characterPosition < characterArray.length; characterPosition++)

        return new String(characterArray);
    }
    
}
