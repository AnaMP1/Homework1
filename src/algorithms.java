public class algorithms {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,10};
        int[] arraynew = new int[array.length];
        int x = 2;
        if (x % array.length == 0) {
            for (int i = 0; i <= array.length-1; i++) {
                System.out.println(array[i]);
            }
        }
        else { x=x%array.length;
            for(int i=0; i<=array.length-1;i++){
            if (i+x >= arraynew.length){

                arraynew [i] = array[i+x- arraynew.length];
            }
            else {
                arraynew[i] = array[i + x];
                //System.out.println(array[i]);
            }
                System.out.println(arraynew[i]);
            }
            }

    }
}
