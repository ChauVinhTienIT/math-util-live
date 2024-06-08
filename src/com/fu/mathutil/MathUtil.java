/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author Lenovo
 */

//TA VIẾT CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC SÀI
//KHI TA CUNG CẤP TIỆN ỊCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA KHÔNG CẦN NHỚ CÁI GÌ
//CHO RIÊNG TA, HÀM STATIC GIÚP LÀM ĐIỀU NÀY
public class MathUtil {
    //nếu đưa vào âm hay 21! thì ta không tính, ta báo có lỗi
    
    public static long getFactional(int n){
       if(n<0 || n > 20){
           throw new IllegalArgumentException("Invalid argument n must be between 0 and 20");
       }
       
       if(n == 0 || n == 1)
           return 1;
       
       long product = 1;
       
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        
        return product;
    }
}
