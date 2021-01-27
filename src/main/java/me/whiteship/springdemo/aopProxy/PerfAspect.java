package me.whiteship.springdemo.aopProxy;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {

    //@Around("execution") : point cut 을 정의함. (어디에 advice 를 적용해야 할 지)
    @Around("execution(* me.whiteship..*.CellPhone.*(..))")
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable {
        //ProceedingJoinPont : 적용해야 할 메서드 그 자체라 생각하면 편함.

        //Advice 를 작성 함. (해야될 일)
        long begin = System.currentTimeMillis();
        Object retVal = pjp.proceed();
        System.out.println(System.currentTimeMillis()-begin);
        return retVal;
    }

    //어노테이션이 달린곳에 aspect 를 적용함.
    @Around("@annotation(PerfLogging)")
    public Object logPerfAnnotatio(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        Object retVal = pjp.proceed();
        System.out.println(System.currentTimeMillis()-begin);
        return retVal;
    }

    //특정 빈에 aspect 를 적용함
    @Around("bean(cellPhoneImpl)")
    public Object logPerfBean(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        Object retVal = pjp.proceed();
        System.out.println(System.currentTimeMillis()-begin);
        return retVal;
    }

    //특정 빈의 모든 메서드 실행 이전에 aspect 적용함.
    @Before("bean(cellPhoneImpl)")
    public void logPerfBeanBefore(){
        System.out.println("hello");
    }
}
