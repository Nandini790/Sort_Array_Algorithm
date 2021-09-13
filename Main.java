public class Main {

    /* Time Complexity  = O(n)
    1. Insertion Sort(A)
    2. for i <- 1 to length[A]
    3.do key <- A[i]
    4.Insert A[i] into the sorted sequence A[0........i-1]
    5.j <- i-1
    6.while j >0 and A[j] > key
    7. do A[j+1] <- A[j]
    8. j = j-1
    9. A[j+1] <- key
    */

    public static void sort(int a[]){
        int n = a.length;
        for(int i = 1; i< n ; i++){
            int key = a[i];
            int j = i-1;
            while( j >= 0 && a[j] > key){
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = key;
        }

    }

    public static void PrintArray(int a[]){
        for (int e : a) {
            System.out.print(e + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = {5,8,2,9,5 };
        sort(a);
        PrintArray(a);

    }
}

