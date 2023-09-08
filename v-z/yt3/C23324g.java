package yt3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import ot3.C21881e;

/* renamed from: yt3.g */
public class C23324g {

    /* renamed from: d */
    public static volatile C23324g f67044d;

    /* renamed from: a */
    public HandlerThread f67045a;

    /* renamed from: b */
    public Handler f67046b = null;

    /* renamed from: c */
    public Handler f67047c = null;

    public C23324g() {
        if (this.f67045a == null) {
            HandlerThread handlerThread = new HandlerThread("SoterGenKeyHandlerThreadName");
            this.f67045a = handlerThread;
            handlerThread.start();
            if (this.f67045a.getLooper() != null) {
                this.f67046b = new Handler(this.f67045a.getLooper());
            } else {
                C21881e.m25083b("Soter.SoterTaskThread", "soter: task looper is null! use main looper as the task looper", new Object[0]);
                this.f67046b = new Handler(Looper.getMainLooper());
            }
        }
        this.f67047c = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public static C23324g m27822a() {
        C23324g gVar;
        if (f67044d != null) {
            return f67044d;
        }
        synchronized (C23324g.class) {
            if (f67044d == null) {
                f67044d = new C23324g();
            }
            gVar = f67044d;
        }
        return gVar;
    }

    /* renamed from: b */
    public void mo36818b(Runnable runnable) {
        this.f67047c.post(runnable);
    }

    /* renamed from: c */
    public void mo36819c(Runnable runnable) {
        this.f67046b.post(runnable);
    }
}
