package me.whiteship.springdemo.aopProxy;
import java.lang.annotation.*;

/**
 * 이 어노테이션을 사용하면 성능을 로깅해 줍니다.
 */
//@Retention : 이 어노테이션 정보를 얼마나 유지할 것인가?
//(RetentionPolicy.CLASS) : 컴파일 한 byte 코드의 class 파일까지 이 어노테이션을 유지하겠다.
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD) // 어노테이션이 쓰이는 타겟.
@Documented // java dog 만들때? 이거뭐지?
public @interface PerfLogging {
}
