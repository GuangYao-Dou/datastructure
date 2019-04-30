package InBit.sort;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/28
 * Time: 18:47
 * Description：
 */
public class SelecrSort {
    public static void main(String[] agrs){
        int[] arr = {2,53,5,6,8,55,25,87,95,65,2};
        selectSort(arr);
        for(int i : arr){
            System.out.printf(i+",");
        }
    }
    public static void selectSort(int[] arr){
        for(int i = 0; i < arr.length; i ++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
