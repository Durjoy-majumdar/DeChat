package com.tencent.matrix.lifecycle;

import com.tencent.matrix.lifecycle.C80392a0;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.matrix.lifecycle.e0 */
public final class C28656e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Runnable f78629d;

    public C28656e0(Runnable runnable) {
        this.f78629d = runnable;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        Runnable runnable = this.f78629d;
        C80392a0.C28655b bVar = runnable == null ? new C80392a0.C28655b("", System.currentTimeMillis()) : new C80392a0.C28655b(runnable.toString(), System.currentTimeMillis());
        C80411j jVar = C80392a0.f235321a;
        ConcurrentHashMap<Thread, C80392a0.C28655b> concurrentHashMap = C80392a0.f235325e;
        Thread currentThread = Thread.currentThread();
        C87412m.m108593f(currentThread, "Thread.currentThread()");
        concurrentHashMap.put(currentThread, bVar);
        this.f78629d.run();
        Thread currentThread2 = Thread.currentThread();
        C87412m.m108593f(currentThread2, "Thread.currentThread()");
        concurrentHashMap.put(currentThread2, new C80392a0.C28655b("", System.currentTimeMillis()));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > ((long) 500)) {
            C80392a0.f235321a.f235348d.invoke(toString(), Long.valueOf(currentTimeMillis2));
        }
    }

    public String toString() {
        return this.f78629d.toString();
    }
}
