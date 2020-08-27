package hw2;

public class ex_for {
    public static void main(String[] args) {
        Ex1(10);
        System.out.println();
        Ex2(10);
        System.out.println();
        Ex3(10);
        System.out.println();
        Ex4(10);
        System.out.println();
        Ex5(6);
        System.out.println();
        Ex6(6);
        System.out.println();

        int[] arraysorare = new int[] {45,30,0,57,100,51};
        Ex8(arraysorare);

       }

       static void Ex1(int n) {
             int i,j;
       for(i=0;i<n;i++) {
         for (j=0; j<n; j++){
             System.out.print(j + " ");
         }
         System.out.println();

             }
    }

    static void Ex2(int n) {
        int i,j;

        for(i=0;i<n;i++) {
            for (j=0; j<n; j++){
                if(j==i){
                    System.out.print(1 + " ");
                }
                else{
                    System.out.print(0+ " ");
                }

            }
            System.out.println();

        }
    }

    static void Ex3(int n) {
        int i,j;

        for(i=0;i<n;i++) {
            for (j=0; j<n; j++){
                if(j==i+1){
                    System.out.print(1+ " ");
                }
                else{
                    System.out.print(0+ " ");
                }

            }
            System.out.println();

        }
    }

    static void Ex4(int n) {
        int i,j;

        for(i=0;i<n;i++) {
            for (j=0; j<n; j++){
                if(j==n-1-i){
                    System.out.print(1+ " ");
                }
                else{
                    System.out.print(0+ " ");
                }

            }
            System.out.println();

        }
    }

    static void Ex5(int n) {
        int i,j;

        for(i=0;i<n;i++) {
            for (j=0; j<=i; j++){
                System.out.print(i);


            }
            System.out.println();

        }
    }

    static void Ex6(int n) {
        int i,j;

        for(i=1;i<n;i++) {
            for (j=n-i-1; j>=0; j--){
                System.out.print(i);


            }
            System.out.println();

        }
    }

    static void Ex8(int[] array) {
        int i,j,x;
        array = new int[] {45,30,0,57,100,51};
        for (i=1;i<array.length; i++) {
            for (j = 0; j <= i; j++) {
                if (array[i] < array[j]) {
                    x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }

        for (i=0;i< array.length; i++){
            System.out.print(array[i]+" ");
        }
    }


}

