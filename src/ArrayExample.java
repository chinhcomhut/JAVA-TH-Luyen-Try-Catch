
import java.util.Scanner;
import java.util.Random;
public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[5];
        System.out.println("Danh sách phẩn tử của mảng: ");
        for (int i=0; i<5;i++){
            arr[i]=rd.nextInt(5);
            System.out.print(arr[i]+" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer [] arr = arrExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kì:");
        int x = scanner.nextInt();
        try {
            System.out.println("Gía trị của phần tử có chỉ số "+x+ " là "+arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }

    }
}
