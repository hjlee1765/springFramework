package me.whiteship.springdemo.interfaceExtendTest;

import me.whiteship.springdemo.interfaceExtendTest.CellPhone;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class interfaceExtentTest {

    //클래스 기반의 프록시를 만들 때
    // CellPhone -> CellPhoneImpl -> CellPhoneClassProxy

    //인터페이스 기반의 프록시를 만들 때
    // CellPhone -> CellPhoneImpl
    // CellPhone -> CellPhoneInterfaceProxyExtendImpl
    //
    // CellPhoneImpl -> CellPhoneInterfaceProxyExtendImpl 이게 불가함.


    CellPhone impl = new CellPhoneImpl();
    CellPhone a = new CellPhoneInterfaceProxyExtendImpl();

    //https://www.youtube.com/watch?v=C6nsjqrCJq4&feature=emb_title 관련 문제.
    //아래 코드가 안되니까..!
    //CellPhoneImpl res = new CellPhoneInterfaceProxyExtendImpl();

    @Test
    public void test(){
        impl.call();
        impl.receive();

        System.out.println("====================");


    }
}
