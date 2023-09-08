package com.tencent.p014mm.appbrand.p942v8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.eclipsesource.mmv8.V8ScriptException;
import com.tencent.p014mm.appbrand.p942v8.C80656d;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import p774zg.C91731l;

/* renamed from: com.tencent.mm.appbrand.v8.f */
public class C80660f implements C80656d {

    /* renamed from: a */
    public C80656d.C80657a f236023a = null;

    /* renamed from: b */
    public final Looper f236024b;

    /* renamed from: c */
    public final C80661a f236025c;

    /* renamed from: d */
    public C91731l f236026d = new C91731l();

    /* renamed from: com.tencent.mm.appbrand.v8.f$a */
    public class C80661a extends Handler {
        public C80661a(Looper looper) {
            super(looper);
        }

        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (V8ScriptException e) {
                C80656d.C80657a aVar = C80660f.this.f236023a;
                if (aVar != null) {
                    C80649a aVar2 = C80653b.this.f236020e;
                    AtomicInteger atomicInteger = C80649a.f235990w;
                    aVar2.mo112473n(e);
                }
            }
            if (C80660f.this.f236026d.f262756a) {
                ((LinkedBlockingDeque) C80660f.this.f236026d.f262757b).pollFirst();
            }
        }
    }

    public C80660f(Looper looper) {
        this.f236024b = looper;
        this.f236025c = new C80661a(looper);
    }

    /* renamed from: a */
    public void mo112477a() {
        Log.m105920e("resumeLoopTasks", "should not to be here");
    }

    /* renamed from: b */
    public void mo112478b(Runnable runnable, long j, boolean z) {
        this.f236025c.post(runnable);
    }

    /* renamed from: c */
    public void mo112479c() {
        Looper.loop();
    }

    /* renamed from: d */
    public boolean mo112480d() {
        Log.m105920e("doInnerLoopTask", "should not to be here");
        return true;
    }

    /* renamed from: e */
    public String mo112481e() {
        return (String) ((LinkedBlockingDeque) this.f236026d.f262757b).peek();
    }

    /* renamed from: f */
    public void mo112482f(C80656d.C80657a aVar) {
        this.f236023a = aVar;
    }

    /* renamed from: g */
    public void mo112483g(boolean z) {
        this.f236026d.f262756a = z;
    }

    /* renamed from: h */
    public void mo112484h(Runnable runnable, boolean z) {
        if (runnable != null) {
            if (Thread.currentThread().getId() == this.f236024b.getThread().getId()) {
                try {
                    runnable.run();
                } catch (V8ScriptException e) {
                    C80656d.C80657a aVar = this.f236023a;
                    if (aVar != null) {
                        C80649a aVar2 = C80653b.this.f236020e;
                        AtomicInteger atomicInteger = C80649a.f235990w;
                        aVar2.mo112473n(e);
                    }
                }
                if (this.f236026d.f262756a) {
                    ((LinkedBlockingDeque) this.f236026d.f262757b).remove((Object) null);
                    return;
                }
                return;
            }
            this.f236025c.post(runnable);
        }
    }

    /* renamed from: i */
    public boolean mo112485i() {
        return this.f236024b.getThread().getId() == Thread.currentThread().getId();
    }

    public void pause() {
    }

    public void quit() {
        this.f236024b.quitSafely();
    }

    public void resume() {
    }
}
