/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util.test;

import lamhdt.util.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HL
 */
public class MathUtilityTest {
    
    
    
    // Mình sẽ test các tình huống xài hàm getFactorial() ở đây
    // tình huống là tham số đưa vào : dương , âm dương trong khoang 0..20, ngoài khoảng 20
    // tình huống xài hàm, test hàm gọi là test case
    // thường có tính huống thành công hay thất bại
    // thành công đưa vào value hợp lệ 0..20
    // thất bại đưa vào âm > 20 bị ăn đòn
    // hàm bắt buộc có tình huống này và giờ ta test coi hàm xử lí đúng không
    
    
    @Test// bien ham thành public static void main()
    // quy tắc đặt tên hàm cho việc test phần mềm: rất nhiều quy tắc
    // nhưng nói chung là tên hàm sẽ bao gồm ngữ nghĩa kết quả trả về , tình trang tốt
    // không giống tên hàm khi viết app
    // mình đang viết code test app
    
    public void getFactorial_RunWell_IfValidArgument(){
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        // tui muốn check coi có đúng là gọi hàm 5!  = 120 hay k 
        // có xanh không đỏ 
        
    }
    
    // MẶC ĐỊNH CODE TEST ĐỘC LẬP VỚI CODE CHÍNH
    // ĐỘC LẬP VỚI QUÁ TRÌNH CLEAN&BUILD TỨC LÀ DÙ BẠN XANH HAY ĐỎ
    // MIỄN LÀ KHÔNG BỊ ERROR CÚ PHÁP
    // BẠN LUÔN ĐÓNG GÓI BUILD RA ĐC FILE .JAR .WAR
    //
    // HỢP LOGIC THÌ MÀU XANH, TỨC LÀM HÀM CHUẨN MỚI NÊN RA ĐC .JAR .WAR
    // VẬY TA CẦN PHẢI CÓ 1 CÁCH GÀI XANH ĐỎ VÀO QUY TRÌNH BUILD .JAR .WAR
    // CÁCH KHÁC: NẾU CODE TEST ĐANG MÀU ĐỎ THÌ DISABLE CÁI NÚT BẤM CLEAN & BUILD 
    public MathUtilityTest() {
    }
    
}
