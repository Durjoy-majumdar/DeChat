package com.tencent.matrix.lifecycle;

import android.os.Process;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.concurrent.ThreadFactory;
import p723vf.C118672d;
import rx3.C13598b0;
import sx3.C64175a0;

/* renamed from: com.tencent.matrix.lifecycle.c0 */
public final class C80399c0 implements ThreadFactory {

    /* renamed from: d */
    public static final C80399c0 f235331d = new C80399c0();

    /* renamed from: com.tencent.matrix.lifecycle.c0$a */
    public static final class C80400a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Runnable f235332d;

        public C80400a(Runnable runnable) {
            this.f235332d = runnable;
        }

        public final void run() {
            Thread currentThread = Thread.currentThread();
            C87412m.m108593f(currentThread, "Thread.currentThread()");
            String name = currentThread.getName();
            int myTid = Process.myTid();
            long currentTimeMillis = System.currentTimeMillis();
            C118672d.m167353c("Matrix.Lifecycle.Thread", "thread run: tid = " + myTid + ", name =" + name, new Object[0]);
            this.f235332d.run();
            C80411j jVar = C80392a0.f235321a;
            ArrayList<String> arrayList = C80392a0.f235323c;
            synchronized (arrayList) {
                arrayList.add(name);
                C118672d.m167353c("Matrix.Lifecycle.Thread", "thread(" + myTid + ',' + name + ") finished, alive time " + (System.currentTimeMillis() - currentTimeMillis) + ", now pool size = " + (5 - arrayList.size()), new Object[0]);
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    public final Thread newThread(Runnable runnable) {
        String str;
        Thread currentThread = Thread.currentThread();
        C87412m.m108593f(currentThread, "Thread.currentThread()");
        ThreadGroup threadGroup = currentThread.getThreadGroup();
        C80400a aVar = new C80400a(runnable);
        C80411j jVar = C80392a0.f235321a;
        ArrayList<String> arrayList = C80392a0.f235323c;
        synchronized (arrayList) {
            str = (String) C64175a0.m75514v(arrayList);
        }
        return new Thread(threadGroup, aVar, str != null ? str : "matrix_x_x", 0);
    }
}
