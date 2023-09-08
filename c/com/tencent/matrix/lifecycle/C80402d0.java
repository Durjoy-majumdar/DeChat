package com.tencent.matrix.lifecycle;

import com.tencent.matrix.lifecycle.C80392a0;
import fy3.C32228q;
import gy3.C87412m;
import java.util.Map;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import rx3.C13598b0;

/* renamed from: com.tencent.matrix.lifecycle.d0 */
public final class C80402d0 implements RejectedExecutionHandler {

    /* renamed from: a */
    public final /* synthetic */ C80392a0.C80393a f235334a;

    public C80402d0(C80392a0.C80393a aVar) {
        this.f235334a = aVar;
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        C80392a0.C80393a aVar = this.f235334a;
        C87412m.m108593f(runnable, "r");
        aVar.getClass();
        for (Map.Entry next : C80392a0.f235325e.entrySet()) {
            if (!(((C80392a0.C28655b) next.getValue()).f78627a.length() == 0)) {
                long currentTimeMillis = System.currentTimeMillis() - ((C80392a0.C28655b) next.getValue()).f78628b;
                if (currentTimeMillis > TimeUnit.SECONDS.toMillis(30)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Dispatcher Thread Not Responding:\n");
                    StackTraceElement[] stackTrace = ((Thread) next.getKey()).getStackTrace();
                    C87412m.m108593f(stackTrace, "it.key.stackTrace");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb.append("\tat " + stackTraceElement + 10);
                    }
                    String sb4 = sb.toString();
                    C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
                    C32228q<String, String, Long, C13598b0> qVar = C80392a0.f235321a.f235349e;
                    String name = ((Thread) next.getKey()).getName();
                    C87412m.m108593f(name, "it.key.name");
                    qVar.invoke(name, sb4, Long.valueOf(currentTimeMillis));
                }
            }
        }
        aVar.f235327d.offer(runnable);
    }
}
