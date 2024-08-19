public class student_attendance{
    public static void main(String[] args) {
        // input -> [101,0,105,10,0,7,0]
        // output -> [101,105,10,7,0,0,0]
        int array1[] = {101,0,105,0,10,7,0};
        int index = 0;

        for (int i = 0; i < array1.length;i++){
            if (array1[i] != 0){
                array1[index++] = array1[i];
            }
        }

        while (index < array1.length){
            array1[index++] = 0;
        }
        System.out.print("[");
        for (int i = 0; i < array1.length;i++){
            System.out.print(array1[i]+ " ");
        }
        System.out.print("]");
        
    }
}