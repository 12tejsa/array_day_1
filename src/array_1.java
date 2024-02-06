class ArrayExample{


    void maxOfArray() {
        int[]arr = {122,5,4,3,2,2,3,4,21};
        int ans = 0 ;

        for(int i = 0 ; i<arr.length;i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        System.out.println("Max number is "+ans);

    }

    void multiArray(){
        int[][]arr = {{31,21,23},{32,42,21}};
        System.out.println(arr[0][1]);
        System.out.println(arr.length);

        // using for loop which we used in pattern method printing

        for(int i = 0;i<2;i++){
            for( int j=0;j<2;j++){
                System.out.println("Using for loop "+arr[i][j]);
            }

//
//        int[]arrr={12,12,2,3,23,2,12};
//            int x = 23;
//
//            int ans  = -1;
//
//            for(int i = 0;i< arrr.length ,i++){
//                if(arrr[i] ==x){
//                    ans  = i;
//                }
//            }
//            System.out.println(ans);
//        }



//   using length operator

    for(int i = 0; i < arr.length;i++){
        for( int j=0; j < arr.length;j++){
            System.out.println("Using for loop length "+arr[i][j]);
        }
   }


}

//    void demoArray(){
//        int ages [] = new int[3];
//        String[] name = {"Raj","Raghav","Riyan"};
//
//        ages[0]= 213;
//        ages[1]= 211;
//        ages[2]= 212;
//
//        // printing through loops
//
//        for(int i = 0 ;i<3;i++){
//            System.out.println("using loops "+ages[i]);
//        }
//
//
//
//
//
//
//        System.out.println(ages[0]);
//        System.out.println(ages[1]);
//        System.out.println(ages[2]);
//        System.out.println(name[0]);
//        System.out.println(name[1]);
//        System.out.println(name[2]);
//
//
//
//    }
//}

public class array_1{
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.maxOfArray();
        obj.multiArray();
        obj.demoArray();
    }
}
