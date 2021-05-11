package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/** @Author: QTX @Date: 2021/5/11 */
@Aspect
@Component
public class AspectAop {
  /** 切点表达式 */
  @Pointcut("execution(* com.spring.service.Impl.*.*(..))")
  public void pointCut() {}

  @Before("pointCut()")
  public void before() {
    System.out.println("前置增强");
  }

  @AfterReturning("pointCut()")
  public void afterReturning() {
    System.out.println("后置增强");
  }

  @Around("pointCut()")
  public Object around(ProceedingJoinPoint pdj) throws Throwable {
    System.out.println("环绕前");
    Object proceed = pdj.proceed();
    System.out.println("环绕后");
    return proceed;
  }

  /** 用类名点的方法 */
  @After("AspectAop.pointCut()")
  public void after() {
    System.out.println("最终增强");
  }

  @AfterThrowing("execution(* com.spring.service.Impl.*.*(..))")
  public void afterThrowing() {
    System.out.println("抛出异常");
  }
}
