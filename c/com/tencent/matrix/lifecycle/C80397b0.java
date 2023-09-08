package com.tencent.matrix.lifecycle;

import com.tencent.matrix.lifecycle.C80392a0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.matrix.lifecycle.b0 */
public final class C80397b0 extends ThreadPoolExecutor {
    public C80397b0(C80392a0.C80394c cVar, C80392a0.C80393a aVar, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
    }

    public void execute(Runnable runnable) {
        C28656e0 e0Var;
        if (runnable != null) {
            C80411j jVar = C80392a0.f235321a;
            e0Var = new C28656e0(runnable);
        } else {
            e0Var = null;
        }
        super.execute(e0Var);
    }
}
