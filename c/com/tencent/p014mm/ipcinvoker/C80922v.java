package com.tencent.p014mm.ipcinvoker;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import o20.C89108b;
import v20.C90741c;

/* renamed from: com.tencent.mm.ipcinvoker.v */
public class C80922v {

    /* renamed from: b */
    public static volatile C80922v f237772b;

    /* renamed from: c */
    public static C89108b f237773c;

    /* renamed from: d */
    public static final HandlerThread f237774d;

    /* renamed from: a */
    public ExecutorService f237775a;

    /* renamed from: com.tencent.mm.ipcinvoker.v$a */
    public static class C80923a implements C89108b {

        /* renamed from: a */
        public HandlerThread f237776a;

        public C80923a() {
            HandlerThread handlerThread = new HandlerThread("IPCThreadPool#InnerWorkerThread-" + hashCode());
            handlerThread.start();
            C90741c.m113809b("IPC.ExecutorServiceCreatorImpl", "createHandlerThread(hash : %d)", Integer.valueOf(handlerThread.hashCode()));
            this.f237776a = handlerThread;
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("IPCThreadPool#WorkerThread");
        f237774d = handlerThread;
        handlerThread.start();
    }

    public C80922v() {
        new Handler(f237774d.getLooper());
        if (f237773c == null) {
            f237773c = new C80923a();
        }
        C80923a aVar = (C80923a) f237773c;
        aVar.getClass();
        C80919t tVar = new C80919t(aVar, 3, new C80917s(aVar));
        tVar.setMaximumPoolSize((int) (((double) 3) * 1.5d));
        tVar.setRejectedExecutionHandler(new C80921u(aVar));
        this.f237775a = tVar;
        C90741c.m113809b("IPC.IPCThreadPool", "initialize IPCInvoker IPCThreadPool(hashCode : %s)", Integer.valueOf(hashCode()));
    }

    /* renamed from: a */
    public static boolean m98792a(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        if (f237772b == null) {
            synchronized (C80922v.class) {
                if (f237772b == null) {
                    f237772b = new C80922v();
                }
            }
        }
        ((C80919t) f237772b.f237775a).execute(runnable);
        return true;
    }
}
