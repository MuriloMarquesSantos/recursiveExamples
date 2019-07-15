public class SeqSearch {

    public static void main(String[] args) {

        int[] numbers = new int[] {1,2,3,6,7,8};

        System.out.println(seqSearch(numbers, 0, numbers.length, 7));
    }

    static int seqSearch(int[] numbers, int index, int arrayLength, int numberSearched) {
        if (index <= arrayLength) {
            if (numbers[index] == numberSearched) {
                return index;
            } else{
                return seqSearch(numbers, index + 1, arrayLength, numberSearched);
            }
        }
        return 0;
    }
}
