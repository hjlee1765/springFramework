package me.whiteship.springdemo.interfaceExtendTest;

import org.springframework.stereotype.Service;

@Service
public class CellPhoneImpl implements CellPhone{
    @Override
    public void call() {
        System.out.println("call");
    }

    @Override
    public void receive() {
        System.out.println("receive");
    }
}
