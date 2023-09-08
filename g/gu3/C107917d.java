package gu3;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import lu3.C88656g;

/* renamed from: gu3.d */
public class C107917d<P> {

    /* renamed from: i */
    public static C87399g f323120i = new C8460b();

    /* renamed from: j */
    public static C87399g f323121j = new C107921i();

    /* renamed from: k */
    public static final C87398b f323122k = new C87398b();

    /* renamed from: a */
    public P f323123a;

    /* renamed from: b */
    public C87399g f323124b;

    /* renamed from: c */
    public volatile C107916a f323125c;

    /* renamed from: d */
    public volatile C107917d f323126d;

    /* renamed from: e */
    public volatile C107917d f323127e;

    /* renamed from: f */
    public final Object f323128f = new Object();

    /* renamed from: g */
    public volatile boolean f323129g = false;

    /* renamed from: h */
    public AtomicBoolean f323130h = new AtomicBoolean(false);

    /* renamed from: gu3.d$b */
    public static class C87398b {
    }

    /* renamed from: gu3.d$a */
    public class C107918a implements C88656g {

        /* renamed from: d */
        public final /* synthetic */ C107916a f323131d;

        public C107918a(C107916a aVar) {
            this.f323131d = aVar;
        }

        public String getKey() {
            return this.f323131d.toString();
        }

        /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void run() {
            /*
                r4 = this;
                r0 = 0
                gu3.d r1 = gu3.C107917d.this     // Catch:{ all -> 0x0024 }
                gu3.d r1 = r1.f323127e     // Catch:{ all -> 0x0024 }
                gu3.a r2 = r4.f323131d     // Catch:{ all -> 0x0024 }
                gu3.d r3 = gu3.C107917d.this     // Catch:{ all -> 0x0024 }
                P r3 = r3.f323123a     // Catch:{ all -> 0x0024 }
                java.lang.Object r2 = r2.mo63988a(r3)     // Catch:{ all -> 0x0024 }
                r1.f323123a = r2     // Catch:{ all -> 0x0024 }
                gu3.d r1 = gu3.C107917d.this     // Catch:{ all -> 0x0024 }
                gu3.d r1 = r1.f323127e     // Catch:{ all -> 0x0024 }
                gu3.d r2 = gu3.C107917d.this     // Catch:{ all -> 0x0024 }
                gu3.d r2 = r2.f323127e     // Catch:{ all -> 0x0024 }
                gu3.a r2 = r2.f323125c     // Catch:{ all -> 0x0024 }
                r1.mo158342c(r2)     // Catch:{ all -> 0x0024 }
                gu3.d r1 = gu3.C107917d.this
                r1.mo158341a()
                goto L_0x0049
            L_0x0024:
                r1 = move-exception
                gu3.d r2 = gu3.C107917d.this     // Catch:{ all -> 0x005c }
                gu3.a r2 = r2.mo158343d()     // Catch:{ all -> 0x005c }
                if (r2 == 0) goto L_0x005b
                java.lang.Object r1 = r2.mo63988a(r1)     // Catch:{ all -> 0x005c }
                gu3.d r2 = gu3.C107917d.this     // Catch:{ all -> 0x005c }
            L_0x0033:
                gu3.d r3 = r2.f323127e     // Catch:{ all -> 0x005c }
                if (r3 == 0) goto L_0x003a
                gu3.d r2 = r2.f323127e     // Catch:{ all -> 0x005c }
                goto L_0x0033
            L_0x003a:
                r2.f323123a = r1     // Catch:{ all -> 0x005c }
                gu3.d r1 = gu3.C107917d.this
                r1.getClass()
            L_0x0041:
                if (r1 == 0) goto L_0x0049
                r1.mo158341a()
                gu3.d r1 = r1.f323127e
                goto L_0x0041
            L_0x0049:
                gu3.d r1 = gu3.C107917d.this
                r1.f323127e = r0
                gu3.d r1 = gu3.C107917d.this
                r1.f323126d = r0
                gu3.d r1 = gu3.C107917d.this
                r1.f323125c = r0
                gu3.d r0 = gu3.C107917d.this
                r0.getClass()
                return
            L_0x005b:
                throw r1     // Catch:{ all -> 0x005c }
            L_0x005c:
                r1 = move-exception
                gu3.d r2 = gu3.C107917d.this
                r2.getClass()
            L_0x0062:
                if (r2 == 0) goto L_0x006a
                r2.mo158341a()
                gu3.d r2 = r2.f323127e
                goto L_0x0062
            L_0x006a:
                gu3.d r2 = gu3.C107917d.this
                r2.f323127e = r0
                gu3.d r2 = gu3.C107917d.this
                r2.f323126d = r0
                gu3.d r2 = gu3.C107917d.this
                r2.f323125c = r0
                gu3.d r0 = gu3.C107917d.this
                r0.getClass()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: gu3.C107917d.C107918a.run():void");
        }
    }

    public C107917d() {
    }

    /* renamed from: b */
    public static C107917d<C87398b> m146213b() {
        return new C107917d<>(f323122k);
    }

    /* renamed from: a */
    public final void mo158341a() {
        if (this.f323129g) {
            synchronized (this.f323128f) {
                if (this.f323129g) {
                    this.f323128f.notifyAll();
                }
            }
        }
    }

    /* renamed from: c */
    public void mo158342c(C107916a aVar) {
        if (aVar == null) {
            mo158341a();
            return;
        }
        C107918a aVar2 = new C107918a(aVar);
        if (this.f323123a != null) {
            C87399g gVar = this.f323124b;
            if (gVar == null) {
                aVar2.run();
            } else {
                gVar.execute(aVar2);
            }
        }
    }

    /* renamed from: d */
    public C107916a<Throwable, ?> mo158343d() {
        return null;
    }

    /* renamed from: e */
    public C87399g mo158344e() {
        return this.f323124b;
    }

    /* renamed from: f */
    public <R> C107917d<R> mo158345f(C107916a<P, R> aVar) {
        Objects.requireNonNull(aVar);
        C107917d<R> dVar = new C107917d<>();
        dVar.f323124b = mo158344e();
        dVar.f323126d = null;
        this.f323127e = dVar;
        this.f323125c = aVar;
        this.f323130h.compareAndSet(false, true);
        mo158342c(aVar);
        return dVar;
    }

    /* renamed from: g */
    public P mo158346g() {
        try {
            if (this.f323123a == null) {
                synchronized (this.f323128f) {
                    if (this.f323123a == null) {
                        this.f323129g = true;
                        this.f323128f.wait();
                        this.f323129g = false;
                    }
                }
            }
        } catch (InterruptedException unused) {
        }
        return this.f323123a;
    }

    public C107917d(P p) {
        this.f323123a = p;
    }
}
