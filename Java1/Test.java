// public class Test{
//     public static void main(String[] ag) {
//         //交换两个临时变量  
//         <1>引入临时变量
//         int a = 10;
//         int b = 11;
//         int tmp = a;
//         a = b;
//         b = tmp;

//          <2>用异或位运算

//         System.out.println(a);
//         System.out.println(b);
//     }
// }

//求出三个数中最大的一个
public class Test{
    public static void main(String[] args) {

        int a =10;
        int b = 15;
        int c = 20;
        if(a>b && a>c){
            System.out.println("max:"+a);
        }
        if(b>a && b>c){
            System.out.println("max:"+b);
        }
        else{
            System.out.println("max:"+c);
        }
        // 用库
        int result = Math.max(c, Math.max(a, b));
        System.out.println(result);

    }
}