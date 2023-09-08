package a14;

import f14.C58873d;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import rx3.C13598b0;
import wx3.C66212f;

/* renamed from: a14.q1 */
public final class C53939q1 extends C53935p1 implements C53960w0 {

    /* renamed from: e */
    public final Executor f151190e;

    public C53939q1(Executor executor) {
        this.f151190e = executor;
        Method method = C58873d.f168511a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null) {
                Method method2 = C58873d.f168511a;
                if (method2 != null) {
                    method2.invoke(scheduledThreadPoolExecutor, new Object[]{Boolean.TRUE});
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: I */
    public void mo74578I(long j, C53916l<? super C13598b0> lVar) {
        Executor executor = this.f151190e;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            C53947s2 s2Var = new C53947s2(this, lVar);
            C66212f context = lVar.getContext();
            try {
                scheduledFuture = scheduledExecutorService.schedule(s2Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                C53873d2.m60390b(context, C53927n1.m60552a("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            lVar.mo74599v(new C53900i(scheduledFuture));
        } else {
            C53946s0.f151194n.mo74578I(j, lVar);
        }
    }

    /* renamed from: Q */
    public C53883f1 mo74579Q(long j, Runnable runnable, C66212f fVar) {
        Executor executor = this.f151190e;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                C53873d2.m60390b(fVar, C53927n1.m60552a("The task was rejected", e));
            }
        }
        return scheduledFuture != null ? new C27735e1(scheduledFuture) : C53946s0.f151194n.mo74579Q(j, runnable, fVar);
    }

    /* renamed from: S */
    public void mo74497S(C66212f fVar, Runnable runnable) {
        try {
            this.f151190e.execute(runnable);
        } catch (RejectedExecutionException e) {
            C53873d2.m60390b(fVar, C53927n1.m60552a("The task was rejected", e));
            C53872d1.f151119c.mo74497S(fVar, runnable);
        }
    }

    public void close() {
        Executor executor = this.f151190e;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C53939q1) && ((C53939q1) obj).f151190e == this.f151190e;
    }

    public int hashCode() {
        return System.identityHashCode(this.f151190e);
    }

    /* renamed from: i0 */
    public Executor mo74625i0() {
        return this.f151190e;
    }

    public String toString() {
        return this.f151190e.toString();
    }
}
