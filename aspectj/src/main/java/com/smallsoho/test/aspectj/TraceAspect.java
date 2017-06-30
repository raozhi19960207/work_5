package com.smallsoho.test.aspectj;
import android.provider.Settings;
import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
/**
 * Created by raozhi on 2017/5/18.
 */
@Aspect
public class TraceAspect
{
    private String TAG = "TAG ";
    private static final String POINT_METHOD = "execution(* com.ourcause.everest.activity.MainActivity.*(..))";
    private static final String POINT_CALLMETHOD = "call(* com.ourcause.everest.activity.MainActivity.*(..))";
    @Pointcut(POINT_METHOD)
    public void methodAnnotated()
    {
    }
    @Pointcut(POINT_CALLMETHOD)
    public void methodCallAnnotated(){}
    @Around("methodAnnotated()")
    /*
    public Object aronudWeaverPoint(ProceedingJoinPoint joinPoint) throws Throwable {
        joinPoint.proceed();
        String result = "----------------------------->aroundWeaverPoint";
        Log.e(TAG,"----------------------------->aroundWeaverPoint");
        return  result;//替换原方法的返回值
    }*/
    @Before("methodAnnotated()")
    public void beforecall(JoinPoint joinPoint){
        Log.e(TAG,"beforecall");
        Log.e(TAG,joinPoint.toShortString());
    }
}
