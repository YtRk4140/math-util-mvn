/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.han.mathutil.core;

// ta sẽ clone class java.util.Math của JDK mà bên trong nó chứa
// các hàm huyền thoại Math.sqrt() Math.sin() Math.random()
public class MathUtility {
    
    
    //hàm tính n! = 1.2.3.4.5...n
    //thiết kế hàm này như sau:
    //0! = 1! = 1
    // ko có giai thừa cho số âm, -1! -2! BỊ CHỬI, NÉM RA EXCEPTION
    //giai thừa tăng nhanh, 21! Kiểu long bị tràn, chứa ko nổi
    //chỉ tính giai thừa từ 0..20
   //>=21! BỊ CHỬI, NÉM RA NGOẠI LỆ
    public static long getFactorial(int n){
        
        if (n < 0 || n >20)
            throw new IllegalArgumentException("Invald n. n must be between 0..20, please");
        
        if (n == 0 || n == 1)
            return 1;
        
        long product = 1; //tích nhân dồn 1 2 3 4 5 ...
        for (int i = 2; i <= n; i++)
            product *= i;
        
        return product;
        
    }
}
