package com.tencent.p014mm.appbrand.p942v8;

import com.eclipsesource.mmv8.V8RuntimeException;
import com.eclipsesource.mmv8.V8ScriptException;
import com.tencent.p014mm.appbrand.p942v8.C80656d;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import p774zg.C91731l;
import p774zg.C91733m;

/* renamed from: com.tencent.mm.appbrand.v8.r */
public class C80693r implements C80656d {

    /* renamed from: a */
    public final Thread f236095a = Thread.currentThread();

    /* renamed from: b */
    public final C91733m<Runnable> f236096b = new C91733m<>(new LinkedList());

    /* renamed from: c */
    public C80694a f236097c = C80694a.NONE;

    /* renamed from: d */
    public boolean f236098d;

    /* renamed from: e */
    public volatile boolean f236099e;

    /* renamed from: f */
    public final boolean f236100f;

    /* renamed from: g */
    public C80656d.C80657a f236101g;

    /* renamed from: h */
    public C91731l f236102h = new C91731l();

    /* renamed from: i */
    public Queue<Runnable> f236103i = new LinkedList();

    /* renamed from: j */
    public Queue<Runnable> f236104j = new LinkedList();

    /* renamed from: k */
    public boolean f236105k = false;

    /* renamed from: l */
    public int f236106l = -1;

    /* renamed from: com.tencent.mm.appbrand.v8.r$a */
    public enum C80694a {
        NONE,
        RESUME,
        ENQUEUE
    }

    static {
        new ThreadLocal();
    }

    public C80693r(boolean z) {
        this.f236100f = z;
        Log.m105925i("MicroMsg.V8JSRuntimeLooper", "V8JSRuntimeLooper <init> ignoreRemainingTaskWhenLoopEnd?%b", Boolean.valueOf(z));
    }

    /* renamed from: a */
    public void mo112477a() {
        Iterator<Runnable> it = this.f236103i.iterator();
        int i = -1;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Runnable next = it.next();
            if (this.f236100f && this.f236099e) {
                Log.m105924i("MicroMsg.V8JSRuntimeLooper", "LoopTask break for mLooperEnd");
                break;
            }
            i++;
            if (i > this.f236106l) {
                this.f236106l = i;
                mo112525r(next);
                if (this.f236102h.f262756a) {
                    ((LinkedBlockingDeque) this.f236102h.f262757b).pollFirst();
                }
                if (this.f236105k) {
                    break;
                }
            }
        }
        this.f236105k = true;
    }

    /* renamed from: b */
    public void mo112478b(Runnable runnable, long j, boolean z) {
        if (runnable != null) {
            if (j != 0) {
                throw new IllegalStateException("V8JSRuntimeLooper#scheduleDelayed not support.");
            } else if (this.f236099e) {
                Log.m105924i("MicroMsg.V8JSRuntimeLooper", "scheduleDelayed but looper end");
            } else {
                synchronized (this.f236096b) {
                    try {
                        C91733m<Runnable> mVar = this.f236096b;
                        mVar.offer(runnable);
                        if (z) {
                            mVar.f262762e = mVar.f262761d.size() - 1;
                        }
                        if (!mo112524l()) {
                            this.f236096b.notify();
                        }
                        if (z && this.f236098d) {
                            Log.m105925i("MicroMsg.V8JSRuntimeLooper", "scheduleDelayed: important task in pause state. queue.size:[%d]", Integer.valueOf(mo112523j()));
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                mo112496q();
            }
        }
    }

    /* renamed from: c */
    public void mo112479c() {
        Log.m105925i("MicroMsg.V8JSRuntimeLooper", "loop start %d", Integer.valueOf(hashCode()));
        while (!this.f236099e) {
            synchronized (this.f236096b) {
                while (true) {
                    if (!mo112524l() && !mo112497s()) {
                        break;
                    }
                    try {
                        this.f236096b.wait();
                        C80694a aVar = C80694a.RESUME;
                        C80694a aVar2 = this.f236097c;
                        if (aVar == aVar2) {
                            Log.m105925i("MicroMsg.V8JSRuntimeLooper", "loop notify by reason:%s, instance:%d", aVar2, Integer.valueOf(hashCode()));
                        }
                        this.f236097c = C80694a.NONE;
                    } catch (InterruptedException unused) {
                        Log.m105924i("MicroMsg.V8JSRuntimeLooper", "wait interrupted ; loop end");
                        this.f236095a.interrupt();
                    }
                }
                ((LinkedList) this.f236103i).clear();
                this.f236096b.mo125577f(this.f236103i, this.f236098d);
            }
            mo112492m();
        }
        mo112493n();
        synchronized (this.f236096b) {
            this.f236096b.clear();
        }
    }

    /* renamed from: d */
    public boolean mo112480d() {
        if (this.f236099e) {
            this.f236105k = true;
            return true;
        }
        synchronized (this.f236096b) {
            while (true) {
                if (!mo112524l() && !mo112497s()) {
                    break;
                }
                try {
                    this.f236096b.wait();
                    C80694a aVar = C80694a.RESUME;
                    C80694a aVar2 = this.f236097c;
                    if (aVar == aVar2) {
                        Log.m105925i("MicroMsg.V8JSRuntimeLooper", "loop notify by reason:%s, instance:%d", aVar2, Integer.valueOf(hashCode()));
                    }
                    this.f236097c = C80694a.NONE;
                } catch (InterruptedException unused) {
                    Log.m105924i("MicroMsg.V8JSRuntimeLooper", "wait interrupted ; loop end");
                    this.f236095a.interrupt();
                }
            }
            ((LinkedList) this.f236104j).clear();
            this.f236096b.mo125577f(this.f236104j, this.f236098d);
        }
        mo112491k();
        return false;
    }

    /* renamed from: e */
    public String mo112481e() {
        return (String) ((LinkedBlockingDeque) this.f236102h.f262757b).peek();
    }

    /* renamed from: f */
    public void mo112482f(C80656d.C80657a aVar) {
        this.f236101g = aVar;
    }

    /* renamed from: g */
    public void mo112483g(boolean z) {
        this.f236102h.f262756a = z;
    }

    /* renamed from: h */
    public void mo112484h(Runnable runnable, boolean z) {
        if (runnable != null) {
            if (this.f236099e) {
                Log.m105924i("MicroMsg.V8JSRuntimeLooper", "schedule but looper end");
                return;
            }
            if (Thread.currentThread().getId() == this.f236095a.getId()) {
                mo112525r(runnable);
                if (this.f236102h.f262756a) {
                    ((LinkedBlockingDeque) this.f236102h.f262757b).remove((Object) null);
                }
            } else {
                synchronized (this.f236096b) {
                    try {
                        C91733m<Runnable> mVar = this.f236096b;
                        mVar.offer(runnable);
                        if (z) {
                            mVar.f262762e = mVar.f262761d.size() - 1;
                        }
                        if (!mo112524l()) {
                            this.f236097c = C80694a.ENQUEUE;
                            this.f236096b.notify();
                        }
                        if (z && this.f236098d) {
                            Log.m105925i("MicroMsg.V8JSRuntimeLooper", "schedule: important task in pause state. queue.size:[%d]", Integer.valueOf(mo112523j()));
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
            }
            mo112496q();
        }
    }

    /* renamed from: i */
    public boolean mo112485i() {
        return Thread.currentThread().getId() == this.f236095a.getId();
    }

    /* renamed from: j */
    public final int mo112523j() {
        int size;
        synchronized (this.f236096b) {
            size = this.f236096b.size();
        }
        return size;
    }

    /* renamed from: k */
    public void mo112491k() {
        for (Runnable next : this.f236104j) {
            if (!this.f236100f || !this.f236099e) {
                mo112525r(next);
                if (this.f236102h.f262756a) {
                    ((LinkedBlockingDeque) this.f236102h.f262757b).pollFirst();
                }
            } else {
                Log.m105924i("MicroMsg.V8JSRuntimeLooper", "LoopTask break for mLooperEnd");
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if ((r3.f236096b.f262762e >= 0) == false) goto L_0x0014;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo112524l() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f236098d     // Catch:{ all -> 0x0016 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0013
            zg.m<java.lang.Runnable> r0 = r3.f236096b     // Catch:{ all -> 0x0016 }
            int r0 = r0.f262762e     // Catch:{ all -> 0x0016 }
            if (r0 < 0) goto L_0x000f
            r0 = 1
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r0 != 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            monitor-exit(r3)
            return r1
        L_0x0016:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.appbrand.p942v8.C80693r.mo112524l():boolean");
    }

    /* renamed from: m */
    public void mo112492m() {
        this.f236106l = -1;
        this.f236105k = false;
        for (Runnable next : this.f236103i) {
            if (!this.f236100f || !this.f236099e) {
                this.f236106l++;
                mo112525r(next);
                if (this.f236102h.f262756a) {
                    ((LinkedBlockingDeque) this.f236102h.f262757b).pollFirst();
                }
                if (this.f236105k) {
                    return;
                }
            } else {
                Log.m105924i("MicroMsg.V8JSRuntimeLooper", "LoopTask break for mLooperEnd");
                return;
            }
        }
    }

    /* renamed from: n */
    public void mo112493n() {
        Log.m105924i("MicroMsg.V8JSRuntimeLooper", "loop end");
    }

    /* renamed from: o */
    public void mo112494o() {
    }

    /* renamed from: p */
    public void mo112495p() {
    }

    public void pause() {
        Log.m105925i("MicroMsg.V8JSRuntimeLooper", "pause instance:%d queue.size:%d", Integer.valueOf(hashCode()), Integer.valueOf(mo112523j()));
        synchronized (this) {
            this.f236098d = true;
        }
    }

    /* renamed from: q */
    public void mo112496q() {
    }

    public void quit() {
        Log.m105925i("MicroMsg.V8JSRuntimeLooper", "quit %d", Integer.valueOf(hashCode()));
        mo112494o();
        this.f236099e = true;
        this.f236095a.interrupt();
    }

    /* renamed from: r */
    public final void mo112525r(Runnable runnable) {
        try {
            runnable.run();
        } catch (V8ScriptException e) {
            if (this.f236101g != null) {
                C80649a aVar = C80653b.this.f236020e;
                AtomicInteger atomicInteger = C80649a.f235990w;
                aVar.mo112473n(e);
            }
            if (e.getCause() != null) {
                Log.m105921e("MicroMsg.V8JSRuntimeLooper", "runTask V8ScriptException: %s, %s", e, e.getCause());
            }
        } catch (UndeclaredThrowableException e2) {
            Log.m105921e("MicroMsg.V8JSRuntimeLooper", "runTask UndeclaredThrowableException: %s %s", e2, e2.getCause());
        } catch (V8RuntimeException e3) {
            Log.printErrStackTrace("MicroMsg.V8JSRuntimeLooper", e3, "runTask", new Object[0]);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.V8JSRuntimeLooper", th, "runTask", new Object[0]);
            throw th;
        }
    }

    public void resume() {
        Log.m105925i("MicroMsg.V8JSRuntimeLooper", "resume instance:%d queue.size:%d", Integer.valueOf(hashCode()), Integer.valueOf(mo112523j()));
        synchronized (this) {
            this.f236098d = false;
        }
        mo112495p();
        synchronized (this.f236096b) {
            this.f236097c = C80694a.RESUME;
            this.f236096b.notify();
        }
    }

    /* renamed from: s */
    public boolean mo112497s() {
        return this.f236096b.isEmpty();
    }
}
