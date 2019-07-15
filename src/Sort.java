public class Sort {

    public static void main(String[] args) {
        int integerNumbers[] = new int[] {3,2,1,9,12,20,1,20,0,1,-2,-3,-4};


        for (int i=0; i<integerNumbers.length; i++) {
            for (int j=i+1; j < integerNumbers.length; j++) {
                if (integerNumbers[i] > integerNumbers[j]) {
                    int temporaryNumberStorage = integerNumbers[i];
                    integerNumbers[i] = integerNumbers[j];
                    integerNumbers[j] = temporaryNumberStorage;
                }
            }
        }

        for (int i=0; i<integerNumbers.length; i++) {
            System.out.println(integerNumbers[i]);
        }
    }
}
