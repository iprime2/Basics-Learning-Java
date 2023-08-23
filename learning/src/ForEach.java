public class ForEach {
    public static void main(String[] args){
        int[] arr = {5,3,2,4,1};

        // main differnce btw traditional for loop and for each
        // in normal for you control over indexes

        for(int num : arr){
            System.out.println(num);
        }
    }
}
