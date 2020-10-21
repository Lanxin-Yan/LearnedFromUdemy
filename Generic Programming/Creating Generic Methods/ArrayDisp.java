public class ArrayDisp{
    static <T> void display (T[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != null){
                System.out.println(arr[i] + " ");
            }
        }
    }


    public static void main(String[] args){

        String[] names = new String[10];
        names[1] = "Jax";
        names[2] = "Warwick";
        names[3] = "Camille";
        display(names);
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5, 6};
        //System.out.println();
        display(numbers);
        }
}