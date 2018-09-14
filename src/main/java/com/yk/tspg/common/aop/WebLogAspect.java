package com.yk.tspg.common.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

@Aspect
@Component
public class WebLogAspect {

    private Logger logger = Logger.getGlobal();

    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void webLog() { }

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        logger.info("HAHAHA");
        for (Object object : joinPoint.getArgs()) {
            if (
                    object instanceof MultipartFile
                            || object instanceof HttpServletRequest
                            || object instanceof HttpServletResponse
            ) {
                continue;
            }
            try {
                logger.info(
                        joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName()
                );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @AfterReturning(returning = "log", pointcut = "webLog()")
    public void doAfterReturning(Object log) throws Throwable {
        logger.info(log.toString());
    }

}
