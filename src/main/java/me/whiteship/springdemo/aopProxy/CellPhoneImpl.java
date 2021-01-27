package me.whiteship.springdemo.aopProxy;

import org.springframework.stereotype.Service;

@Service
public class CellPhoneImpl implements CellPhone {

    @PerfLogging
    @Override
    public void open() {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("cellPhone open");
    }

    @PerfLogging
    @Override
    public void close() {
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("cellPhone close");
    }

    @Override
    public void delete() {
        System.out.println("cellPhone delete");
    }
}
