/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.han.mathutil.core.test;

import org.han.mathutil.core.MathUtility;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author WINDOWS
 */
public class MathUtilityAdvancedTest {
    
    //CHUẨN BỊ SẴN RIÊNG TEST DATA, LÁT HỒI FILL VÀO HÀM
    //ĐT
    
    //hàm trả về mảng 2 chiều, kiểu WRAPPẺ CLASS/OBJECT
    //mảng chứa các cặp n -> expected, ví dụ 0! -> 1; 1! -> 1; 5 -> 120
    public static Object[][] initTestData(){
        
        Object[][] testData = {{0, 1},
                               {1, 1}, 
                               {2, 2}, 
                               {5, 120},
                               {6, 720}
                            };
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource(value = "initTestData")
    public void checkFactorialGivenRightArguementReturnsWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
                    //tham so hoa viec dua test data vao ham assertE()
                    //biesn doi du lieu thanh tham so cho tong quat
                    //PARAMETERIZED
    } 
    
}

//TDD vs. DDT
//TDD - Test Driven Development
//Kĩ thuật viết code chính đan xen, xen kẽ cùng với viết TestCase/Test App
//Script, tức là quá trình viết code làm app ta viết luôn những đoạn
//code (những thư viện Unit Test như JUnit, TestNG, xUnit, MSTest,...)
//dùng để test hàm ta vừa viết

//Viết code và viết code test cùng với nhau thì gọi là
//kĩ thuật lập trình hướng về kiểm thử 

//DDT - Data Driven Testing
//là kĩ thuật bổ trợ/mở rộng thêm cho kĩ thuật TDD 
//là kĩ thuật viết test code mà ta tách riêng những bộ data test
//ra 1 chỗ, câu lệnh so sánh ra 1 chỗ
//kết nối, map/fill test data vào hàm test thông qua các tham số
//{6, 720} -> fill vào 2 biến n, expected và lát hồi 2 biến này 