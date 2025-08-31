package firstCode;

import recursion.Palindrome;

class main { //the name for class must match file
    public static void main(String[] args) {
        int[] boo = {0,1,2,3,4};
        int[] bar = new int[100];

        for (int i = 0; i<100; i++){
            bar[i] = i;
        }

        int booNum = evenCount(boo, 5);
        int barNum = evenCount(bar, 100);

        System.out.println(booNum);
        System.out.println(barNum);



    }


    public static int evenCount(int[] arr, int size){
        int count = 0;

        for (int a = 0; a<size; a++){
            if (arr[a]%2 == 0){

                count++;
            }

        }

        return count;

    }
}
