/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import lamhdt.util.MathUtility;

/**
 *
 * @author HL
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //2. test hàm  = mắt   
        System.out.println("5!:" + MathUtility.getFactorial(5));
       //  expected: 120,     actual: 120
       // hi vong : 120, 
        System.out.println("0!:" + MathUtility.getFactorial(0));
        //  expected: 1,     actual: 1
       // hi vong : 1, 
       
       //e: ném ngoại lệ IllegalArgumentException
       System.out.println("-5!:" + MathUtility.getFactorial(2));
        System.out.println(" CI For Today");
       
    }
    
     // code viết ra thì DEV phải test
        // có vài hình thức test 
        // 1. TDD Test Driven Development
        // Viết Dàn Khung Của Hàm getFactorial(int n)
        // sau đó dựng hàm test()
        // chạy thử coi xanh đỏ như thế trong quá trình viết code và sửa code
        // lập trình hướng theo thỏa mãn việc test, TDD
    
        // 2. sout  kèm data để coi kqua, có đúng như mình kì vọng không
    
        // xem kqua test = mắt
        // JoptionPane = mắt
        // web gọi hàm xly mlem các thứ 
    
    
}
