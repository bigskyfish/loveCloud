package com.floatCloud.loveCloud.common.listener;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListener;

/**
 * ShiroSessionListener shiro 监听，在线人数统计
 * @auther FloatCloud
 * @date 2019/5/6
 */
public class ShiroSessionListener implements SessionListener {

    /**
     * 使用原子类定义局部变量Session个数；多线程，线程安全方面考虑
     */
    private final AtomicInteger sessionCount = new AtomicInteger(0);


    /**
     * session 的创建
     * @param session
     */
    @Override
    public void onStart(Session session) {
        /*加一原子性操作*/
        sessionCount.incrementAndGet();
    }

    /**
     * session 的停止
     * @param session
     */
    @Override
    public void onStop(Session session) {
        /*减一的原子性操作*/
        sessionCount.decrementAndGet();
    }

    /**
     * session 的过期
     * @param session
     */
    @Override
    public void onExpiration(Session session) {
         /*减一的原子性操作*/
        sessionCount.decrementAndGet();
    }
}
