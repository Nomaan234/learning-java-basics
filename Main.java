import java.util.*;

class C{
    Scanner sc=new Scanner(System.in);

    void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    int[][] createJaggedArray(int r){
        int[][] arr1=new int[r][];

        for (int i =0 ; i<r ;i++){
            System.out.println("enter the number of values in row "+(i+1));
            int x=sc.nextInt();
            arr1[i]=new int[x];
            System.out.println("enter the elements in row"+(i+1));
            for (int j=0; j<x;j++){
                arr1[i][j]=sc.nextInt();
            }
        }return arr1;
    }

    int[][] createMULTIarray(int r,int c){
        int[][] arr1=new int[r][c];
        System.out.println("enter the elements of array");
        for (int i =0 ; i<r ;i++){
            for (int j=0; j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }return arr1;
    }

    int[][] add2darray(int[][] arr1,int r1,int c1,int[][] arr2,int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("array you enter is invlid for addition");
        }
        int[][] ans=new int[r1][c1];
        for (int i =0 ; i<r1 ;i++){
            for (int j =0 ; j<c1;j++){
                ans[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return ans;
    }

    int[][] MULTI2Darray(int[][] arr1,int r1,int c1,int[][] arr2,int r2,int c2) {
        if (c1 != r2) {
            System.out.println("array you enter is invlid for multiplication");
            return new int[0][0];
        }
        int[][] ans = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    ans[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return ans;
    }

    void swap2(int[][] arr ,int i,int j){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;

    }

    void swapp1(int[] arr,int i,int j  ){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

    void reverseArray2(int[] arr1 ){
        int i=0;
        int j=arr1.length-1;
        while(i<j){
            swapp1(arr1,i,j);
            i++;
            j--;
        }
    }

    void reverse2Darraay(int[][] arr1,int r){
        for(int i=0 ; i< r ; i++){
            reverseArray2(arr1[i]);
        }
    }

    void transposeArray(int[][] arr1,int r,int c){


        for (int i =0 ; i< r ;i++){
            for (int j =i+1 ; j<c;j++){
                swap2(arr1,i,j);
            }
        }
    }

    void rotate90(int[][] arr1 ,int r,int c){
        transposeArray(arr1,r,c);
        for (int i =0 ; i< r ;i++){
            reverse2Darraay(arr1,r);
        }
    }


    int[][] pascalTri(int n){
        int ans[][]= new int[n][];
        for (int i =0 ; i< n ;i++){
            ans[i]=new int[i+1];
            ans[i][0]=ans[i][i]=1;
            for (int j =1 ; j< i ;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }return ans;
    }

//        void spiralMatrix(int[][] arr1,int r,int c){
//        int topRow=0 ,rightCol=c-1 ,bottomRow=r-1,leftCol=0;
//
//        int count=0;
//        while(count<n*n){
//
//            for(int j =leftCol ; j<= rightCol && count<n*n ;j++){
//                System.out.print(arr1[topRow][j]+" ");
//                count++;
//            }
//            topRow++;
//
//            for(int i =topRow ; i<= bottomRow  && count<n*n;i++){
//                System.out.print(arr1[i][rightCol]+" ");
//                count++;
//            }
//            rightCol--;
//
//            for(int j =rightCol ; j>=leftCol && count<n*n ;j--){
//                System.out.print(arr1[bottomRow][j]+" ");
//                count++;
//            }
//            bottomRow--;
//
//            for(int i = bottomRow; i>=topRow && count<n*n; i--){
//                System.out.print(arr1[i][leftCol]+" ");
//                count++;
//            }
//            leftCol++;
//        }
//        }


    int[][] generateSpiralArray(int n){
        int topRow=0 ,rightCol=n-1 ,bottomRow=n-1,leftCol=0;

        int[][] arr1=new int[n][n];

        int count=1;
        while(count<=n*n){

            for(int j =leftCol ; j<= rightCol && count<=n*n ;j++){
                arr1[topRow][j] =count++;
            }
            topRow++;

            for(int i =topRow ; i<= bottomRow  && count<=n*n;i++){
                arr1[i][rightCol] = count++;
            }
            rightCol--;

            for(int j =rightCol ; j>=leftCol && count<=n*n ;j--){
                arr1[bottomRow][j] = count++;
            }
            bottomRow--;

            for(int i = bottomRow; i>=topRow && count<=n*n; i--){
                arr1[i][leftCol] = count++;
            }
            leftCol++;
        }

        return arr1;
    }


}

public class Main {
    public static void main(String[] args) {
        C obj=new C();
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number of rows of arr1");
//        int r1 = sc.nextInt();
//        System.out.println("enter the number of columns of arr1");
//        int c1 = sc.nextInt();
//        int[][]arr=obj.createMULTIarray(r1,c1);
//        System.out.println("");
//        obj.printArray(arr);
//        System.out.println("");

        System.out.println("enter the dimension of array : ");
        int n=sc.nextInt();

        int[][] ans=obj.generateSpiralArray(n);
        obj.printArray(ans);









//        int[][]arr1=obj.createJaggedArray(r1);
//        System.out.println("");
//        obj.printArray(arr1);


//        obj.reverse2Darraay(arr,r1);
//        obj.printArray(arr);


//        System.out.println("enter the number of rows of arr2");
//        int r2 = sc.nextInt();
//        System.out.println("enter the number of columns of arr2");
//        int c2 = sc.nextInt();
//
//        int[][] arr1 =obj.createMULTIarray(r1,c1);
//        int[][] arr2 =obj.createMULTIarray(r2,c2);
//        System.out.println();
//        obj.printArray(arr1);
//        System.out.println();
//        obj.printArray(arr2);
//
//        int[][] ans=obj.MULTI2Darray(arr1,r1,c1,arr2,r2,c2);
//        System.out.println();
//        obj.printArray(ans);
    }
}