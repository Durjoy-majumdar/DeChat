package lp3;

import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import jp3.C9487b;
import junit.framework.Assert;
import kp3.C88253a;
import lp3.C88629c;
import lp3.C88631d;
import mp3.C88819d;
import mp3.C88822g;
import mp3.C88824h;
import op3.C89281k;

/* renamed from: lp3.e */
public class C88633e<_Var> implements C88629c<_Var> {

    /* renamed from: A */
    public Object f255909A;

    /* renamed from: d */
    public volatile boolean f255910d = false;

    /* renamed from: e */
    public volatile C88641i f255911e = C88641i.Idle;

    /* renamed from: f */
    public Queue<C88638f> f255912f = new LinkedList();

    /* renamed from: g */
    public volatile C88819d f255913g = this.f255914h;

    /* renamed from: h */
    public volatile C88819d f255914h = C88824h.m110907a();

    /* renamed from: i */
    public volatile boolean f255915i;

    /* renamed from: j */
    public volatile Object f255916j;

    /* renamed from: n */
    public volatile Object f255917n;

    /* renamed from: o */
    public C88638f f255918o;

    /* renamed from: p */
    public long f255919p = -1;

    /* renamed from: q */
    public boolean f255920q = false;

    /* renamed from: r */
    public C46888b f255921r = new C88639g();

    /* renamed from: s */
    public C88819d f255922s;

    /* renamed from: t */
    public C88822g f255923t = new C88822g(this.f255914h, this.f255924u);

    /* renamed from: u */
    public C88822g.C88823a f255924u = new C88634a();

    /* renamed from: v */
    public List<Pair<C88631d.C76721a, C88819d>> f255925v;

    /* renamed from: w */
    public List<Pair<C88631d.C88632b, C88819d>> f255926w;

    /* renamed from: x */
    public boolean f255927x = false;

    /* renamed from: y */
    public boolean f255928y = false;

    /* renamed from: z */
    public Object f255929z;

    /* renamed from: lp3.e$c */
    public class C76722c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Pair f224454d;

        /* renamed from: e */
        public final /* synthetic */ Object f224455e;

        public C76722c(C88633e eVar, Pair pair, Object obj) {
            this.f224454d = pair;
            this.f224455e = obj;
        }

        public void run() {
            ((C88631d.C76721a) this.f224454d.first).mo1720a(this.f224455e);
        }
    }

    /* renamed from: lp3.e$a */
    public class C88634a implements C88822g.C88823a {
        public C88634a() {
        }
    }

    /* renamed from: lp3.e$b */
    public class C88635b implements C87581a<_Var, _Var> {

        /* renamed from: a */
        public final /* synthetic */ C88629c.C88630a f255931a;

        public C88635b(C88633e eVar, C88629c.C88630a aVar) {
            this.f255931a = aVar;
        }

        public _Var call(_Var _var) {
            return this.f255931a.call();
        }
    }

    /* renamed from: lp3.e$d */
    public class C88636d implements C87581a<Void, Void> {

        /* renamed from: a */
        public final /* synthetic */ Pair f255932a;

        /* renamed from: b */
        public final /* synthetic */ Object f255933b;

        /* renamed from: c */
        public final /* synthetic */ RuntimeException f255934c;

        public C88636d(C88633e eVar, Pair pair, Object obj, RuntimeException runtimeException) {
            this.f255932a = pair;
            this.f255933b = obj;
            this.f255934c = runtimeException;
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            try {
                ((C88631d.C88632b) this.f255932a.first).mo1772a(this.f255933b);
                return null;
            } catch (ClassCastException e) {
                if (this.f255934c.getCause() == null) {
                    this.f255934c.initCause(e);
                }
                throw this.f255934c;
            }
        }
    }

    /* renamed from: lp3.e$e */
    public class C88637e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87581a f255935d;

        /* renamed from: e */
        public final /* synthetic */ Object f255936e;

        /* renamed from: f */
        public final /* synthetic */ boolean f255937f;

        public C88637e(C87581a aVar, Object obj, boolean z) {
            this.f255935d = aVar;
            this.f255936e = obj;
            this.f255937f = z;
        }

        public void run() {
            C88633e.this.f255923t.mo123215a(this.f255935d, this.f255936e, this.f255937f);
        }
    }

    /* renamed from: lp3.e$f */
    public static class C88638f {

        /* renamed from: a */
        public C87581a f255939a;

        /* renamed from: b */
        public C88819d f255940b;

        /* renamed from: c */
        public long f255941c;

        /* renamed from: d */
        public boolean f255942d;

        public C88638f(C87581a aVar, C88819d dVar, long j, boolean z) {
            this.f255939a = aVar;
            this.f255940b = dVar;
            this.f255941c = j;
            this.f255942d = z;
        }
    }

    /* renamed from: lp3.e$g */
    public class C88639g implements C46888b {
        public C88639g() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo72091a(java.lang.Object r8) {
            /*
                r7 = this;
                lp3.e r0 = lp3.C88633e.this
                monitor-enter(r0)
                lp3.e r1 = lp3.C88633e.this     // Catch:{ all -> 0x0068 }
                lp3.e$i r1 = r1.f255911e     // Catch:{ all -> 0x0068 }
                lp3.e$i r2 = lp3.C88633e.C88641i.Interrupted     // Catch:{ all -> 0x0068 }
                r3 = 0
                if (r1 != r2) goto L_0x0017
                java.lang.String r8 = "Vending.Pipeline"
                java.lang.String r1 = "interrupted, skip this interrupt."
                java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x0068 }
                kp3.C88253a.m109903b(r8, r1, r2)     // Catch:{ all -> 0x0068 }
                monitor-exit(r0)     // Catch:{ all -> 0x0068 }
                return
            L_0x0017:
                lp3.e r1 = lp3.C88633e.this     // Catch:{ all -> 0x0068 }
                lp3.e$f r2 = r1.f255918o     // Catch:{ all -> 0x0068 }
                r4 = 1
                if (r2 == 0) goto L_0x0020
                r2 = 1
                goto L_0x0021
            L_0x0020:
                r2 = 0
            L_0x0021:
                if (r2 != 0) goto L_0x0034
                lp3.e$i r1 = r1.f255911e     // Catch:{ all -> 0x0068 }
                lp3.e$i r2 = lp3.C88633e.C88641i.Pausing     // Catch:{ all -> 0x0068 }
                if (r1 == r2) goto L_0x0034
                java.lang.String r8 = "Vending.Pipeline"
                java.lang.String r1 = "interrupt not in func scope or pending, skip this retryOrInterrupt."
                java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x0068 }
                kp3.C88253a.m109903b(r8, r1, r2)     // Catch:{ all -> 0x0068 }
                monitor-exit(r0)     // Catch:{ all -> 0x0068 }
                return
            L_0x0034:
                java.lang.String r1 = "Vending.Pipeline"
                java.lang.String r2 = "interrupt Pipeline(%s)"
                java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0068 }
                lp3.e r6 = lp3.C88633e.this     // Catch:{ all -> 0x0068 }
                r5[r3] = r6     // Catch:{ all -> 0x0068 }
                kp3.C88253a.m109903b(r1, r2, r5)     // Catch:{ all -> 0x0068 }
                lp3.e r1 = lp3.C88633e.this     // Catch:{ all -> 0x0068 }
                r1.mo123069i(r3)     // Catch:{ all -> 0x0068 }
                lp3.e r1 = lp3.C88633e.this     // Catch:{ all -> 0x0068 }
                r1.f255928y = r4     // Catch:{ all -> 0x0068 }
                r1.f255909A = r8     // Catch:{ all -> 0x0068 }
                java.util.List<android.util.Pair<lp3.d$a, mp3.d>> r1 = r1.f255925v     // Catch:{ all -> 0x0068 }
                if (r1 == 0) goto L_0x0066
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0068 }
            L_0x0054:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0068 }
                if (r2 == 0) goto L_0x0066
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0068 }
                android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0068 }
                lp3.e r3 = lp3.C88633e.this     // Catch:{ all -> 0x0068 }
                r3.mo123070j(r2, r8)     // Catch:{ all -> 0x0068 }
                goto L_0x0054
            L_0x0066:
                monitor-exit(r0)     // Catch:{ all -> 0x0068 }
                return
            L_0x0068:
                r8 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0068 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: lp3.C88633e.C88639g.mo72091a(java.lang.Object):void");
        }

        /* renamed from: b */
        public void mo72092b() {
            synchronized (C88633e.this) {
                mo123082d();
            }
        }

        /* renamed from: c */
        public void mo72093c(Object... objArr) {
            C89281k kVar;
            Object obj;
            synchronized (C88633e.this) {
                if (C88633e.this.f255911e != C88641i.Pausing) {
                    C88253a.m109903b("Vending.Pipeline", "state is not pausing %s, skip this wormhole", C88633e.this.f255911e);
                    return;
                }
                C88633e eVar = C88633e.this;
                String str = null;
                if (objArr.length == 0) {
                    kVar = null;
                } else if (objArr.length == 1) {
                    kVar = objArr[0];
                } else {
                    C89281k kVar2 = new C89281k();
                    kVar2.f352402a = objArr;
                    kVar = kVar2;
                }
                eVar.mo123079v(kVar);
                Object[] objArr2 = new Object[2];
                C88633e eVar2 = C88633e.this;
                objArr2[0] = eVar2;
                synchronized (eVar2) {
                    obj = eVar2.f255916j;
                }
                if (obj != null) {
                    str = String.valueOf(obj.hashCode());
                }
                objArr2[1] = str;
                C88253a.m109903b("Vending.Pipeline", "pipline(%s) wormhole(%s).", objArr2);
                resume();
            }
        }

        /* renamed from: d */
        public final void mo123082d() {
            synchronized (C88633e.this) {
                if (C88633e.this.f255911e != C88641i.Interrupted) {
                    if (C88633e.this.f255911e != C88641i.Idle) {
                        C88633e eVar = C88633e.this;
                        if (!(eVar.f255918o != null)) {
                            C88253a.m109902a("Vending.Pipeline", "you are using mario().pause() out of a functional scope on %s!", eVar);
                            return;
                        }
                        if (!(eVar.f255921r == C88643g.m110544b())) {
                            C88253a.m109902a("Vending.Pipeline", "you are using mario().pause() out of calling thread on %s!", C88633e.this);
                            return;
                        } else {
                            C88633e.this.f255911e = C88641i.Pausing;
                            return;
                        }
                    }
                }
                C88253a.m109904c("Vending.Pipeline", "current is state(%s), ignore pause.", C88633e.this.f255911e);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resume() {
            /*
                r6 = this;
                lp3.e r0 = lp3.C88633e.this
                monitor-enter(r0)
                lp3.e r1 = lp3.C88633e.this     // Catch:{ all -> 0x004a }
                lp3.e$i r1 = r1.f255911e     // Catch:{ all -> 0x004a }
                lp3.e$i r2 = lp3.C88633e.C88641i.Pausing     // Catch:{ all -> 0x004a }
                r3 = 1
                r4 = 0
                if (r1 == r2) goto L_0x001d
                java.lang.String r1 = "Vending.Pipeline"
                java.lang.String r2 = "this Pipeline(%s) is not pausing! why call resume?"
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x004a }
                lp3.e r5 = lp3.C88633e.this     // Catch:{ all -> 0x004a }
                r3[r4] = r5     // Catch:{ all -> 0x004a }
                kp3.C88253a.m109902a(r1, r2, r3)     // Catch:{ all -> 0x004a }
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                return
            L_0x001d:
                lp3.e r1 = lp3.C88633e.this     // Catch:{ all -> 0x004a }
                lp3.e$f r2 = r1.f255918o     // Catch:{ all -> 0x004a }
                if (r2 == 0) goto L_0x0025
                r2 = 1
                goto L_0x0026
            L_0x0025:
                r2 = 0
            L_0x0026:
                if (r2 != 0) goto L_0x002d
                lp3.e$i r2 = lp3.C88633e.C88641i.Resolved     // Catch:{ all -> 0x004a }
                r1.f255911e = r2     // Catch:{ all -> 0x004a }
                goto L_0x0031
            L_0x002d:
                lp3.e$i r2 = lp3.C88633e.C88641i.Invoking     // Catch:{ all -> 0x004a }
                r1.f255911e = r2     // Catch:{ all -> 0x004a }
            L_0x0031:
                lp3.e r1 = lp3.C88633e.this     // Catch:{ all -> 0x004a }
                monitor-enter(r1)     // Catch:{ all -> 0x004a }
                monitor-exit(r1)     // Catch:{ all -> 0x004a }
                lp3.e r1 = lp3.C88633e.this     // Catch:{ all -> 0x004a }
                lp3.b r1 = r1.f255921r     // Catch:{ all -> 0x004a }
                lp3.b r2 = lp3.C88643g.m110544b()     // Catch:{ all -> 0x004a }
                if (r1 != r2) goto L_0x0040
                goto L_0x0041
            L_0x0040:
                r3 = 0
            L_0x0041:
                if (r3 != 0) goto L_0x0048
                lp3.e r1 = lp3.C88633e.this     // Catch:{ all -> 0x004a }
                r1.mo123068h()     // Catch:{ all -> 0x004a }
            L_0x0048:
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                return
            L_0x004a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: lp3.C88633e.C88639g.resume():void");
        }
    }

    /* renamed from: lp3.e$h */
    public static class C88640h extends Error {
        public C88640h(String str, Object... objArr) {
            super(String.format(str, objArr));
        }
    }

    /* renamed from: lp3.e$i */
    public enum C88641i {
        Idle,
        Resolved,
        Invoking,
        Pausing,
        Interrupted,
        AllDone
    }

    /* renamed from: F */
    public C88629c<_Var> mo11397F(C9487b bVar) {
        Assert.assertNotNull("keeper should not be null!", bVar);
        bVar.keep(this);
        return this;
    }

    /* renamed from: H */
    public C88629c<_Var> mo123057H(C88819d dVar) {
        if (dVar == null) {
            Assert.assertNotNull("scheduler should not be null!", dVar);
            return this;
        }
        this.f255913g = dVar;
        return this;
    }

    /* renamed from: O */
    public synchronized C88631d<_Var> mo123058O() {
        this.f255910d = true;
        return this;
    }

    /* renamed from: P */
    public C46888b mo123059P() {
        return this.f255921r;
    }

    /* renamed from: U */
    public <_Ret> C88629c<_Ret> mo123060U(C87581a<_Ret, _Var> aVar) {
        return mo123067g("Vending.HEAVY_WORK").mo123061d(aVar);
    }

    /* renamed from: a */
    public synchronized C88631d<_Var> mo114038a(C88631d.C88632b<_Var> bVar) {
        mo123074q(bVar, this.f255914h);
        return this;
    }

    /* renamed from: b */
    public synchronized C88631d<_Var> mo123065b(C88631d.C76721a aVar) {
        mo123073n(aVar, this.f255914h);
        return this;
    }

    /* renamed from: c */
    public synchronized C88631d<_Var> mo114039c(C88819d dVar, C88631d.C88632b<_Var> bVar) {
        mo123074q(bVar, dVar);
        return this;
    }

    /* renamed from: d */
    public synchronized <_Ret> C88629c<_Ret> mo123061d(C87581a<_Ret, _Var> aVar) {
        mo123072l(aVar, this.f255920q);
        return this;
    }

    public void dead() {
        mo123069i(true);
    }

    /* renamed from: e */
    public <_Ret> C88629c<_Ret> mo123062e(C87581a<_Ret, _Var> aVar) {
        return mo123067g("Vending.UI").mo123061d(aVar);
    }

    /* renamed from: f */
    public synchronized C88631d<_Var> mo123066f(C88819d dVar, C88631d.C76721a aVar) {
        mo123073n(aVar, dVar);
        return this;
    }

    /* renamed from: g */
    public C88629c<_Var> mo123067g(String str) {
        if (str == null) {
            Assert.assertNotNull("schedulerTypeString should not be null!", str);
            return this;
        }
        this.f255913g = C88824h.m110909c(str);
        Assert.assertNotNull("mCurrentScheduler should not be null!", this.f255913g);
        return this;
    }

    /* renamed from: h */
    public final void mo123068h() {
        C88641i iVar = this.f255911e;
        C88641i iVar2 = C88641i.Resolved;
        if (iVar == iVar2) {
            this.f255911e = C88641i.Invoking;
            C88638f fVar = (C88638f) ((LinkedList) this.f255912f).peek();
            if (fVar != null) {
                C87581a aVar = fVar.f255939a;
                C88819d dVar = fVar.f255940b;
                long j = fVar.f255941c;
                boolean z = fVar.f255942d;
                if (this.f255911e == C88641i.Pausing) {
                    C88253a.m109903b("Vending.Pipeline", "This pipeline is Pausing. We will stop dequeueFunctionAndInvoke and waiting resume() call", new Object[0]);
                    return;
                }
                this.f255918o = (C88638f) ((LinkedList) this.f255912f).poll();
                C88822g gVar = this.f255923t;
                synchronized (gVar) {
                    gVar.f256224a = dVar;
                }
                Object r = mo123075r();
                if (j < 0) {
                    this.f255923t.mo123215a(aVar, r, z);
                    return;
                }
                C88819d a = C88824h.m110907a();
                this.f255922s = a;
                a.arrangeInterval(new C88637e(aVar, r, z), j);
            } else if (this.f255910d) {
                this.f255911e = C88641i.AllDone;
                this.f255929z = mo123075r();
                this.f255927x = true;
                List<Pair<C88631d.C88632b, C88819d>> list = this.f255926w;
                if (list != null) {
                    for (Pair<C88631d.C88632b, C88819d> w : list) {
                        mo123080w(w, this.f255929z);
                    }
                }
            } else {
                this.f255911e = iVar2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo123069i(boolean r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            lp3.e$i r0 = r5.f255911e     // Catch:{ all -> 0x004b }
            lp3.e$i r1 = lp3.C88633e.C88641i.Interrupted     // Catch:{ all -> 0x004b }
            if (r0 == r1) goto L_0x0049
            lp3.e$i r0 = r5.f255911e     // Catch:{ all -> 0x004b }
            lp3.e$i r2 = lp3.C88633e.C88641i.AllDone     // Catch:{ all -> 0x004b }
            if (r0 != r2) goto L_0x000e
            goto L_0x0049
        L_0x000e:
            if (r6 == 0) goto L_0x0033
            java.util.Queue<lp3.e$f> r6 = r5.f255912f     // Catch:{ all -> 0x004b }
            java.util.LinkedList r6 = (java.util.LinkedList) r6     // Catch:{ all -> 0x004b }
            int r6 = r6.size()     // Catch:{ all -> 0x004b }
            if (r6 <= 0) goto L_0x0033
            java.lang.String r6 = "Vending.Pipeline"
            java.lang.String r0 = "Pipe is not finish and be interrupt! %s pipes did not run"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x004b }
            r3 = 0
            java.util.Queue<lp3.e$f> r4 = r5.f255912f     // Catch:{ all -> 0x004b }
            java.util.LinkedList r4 = (java.util.LinkedList) r4     // Catch:{ all -> 0x004b }
            int r4 = r4.size()     // Catch:{ all -> 0x004b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x004b }
            r2[r3] = r4     // Catch:{ all -> 0x004b }
            kp3.C88253a.m109904c(r6, r0, r2)     // Catch:{ all -> 0x004b }
        L_0x0033:
            r5.f255911e = r1     // Catch:{ all -> 0x004b }
            java.util.Queue<lp3.e$f> r6 = r5.f255912f     // Catch:{ all -> 0x004b }
            java.util.LinkedList r6 = (java.util.LinkedList) r6     // Catch:{ all -> 0x004b }
            r6.clear()     // Catch:{ all -> 0x004b }
            r6 = 0
            r5.mo123079v(r6)     // Catch:{ all -> 0x004b }
            mp3.d r6 = r5.f255922s     // Catch:{ all -> 0x004b }
            if (r6 == 0) goto L_0x0047
            r6.cancel()     // Catch:{ all -> 0x004b }
        L_0x0047:
            monitor-exit(r5)
            return
        L_0x0049:
            monitor-exit(r5)
            return
        L_0x004b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lp3.C88633e.mo123069i(boolean):void");
    }

    /* renamed from: j */
    public final void mo123070j(Pair<C88631d.C76721a, C88819d> pair, Object obj) {
        C88819d dVar = (C88819d) pair.second;
        C76722c cVar = new C76722c(this, pair, obj);
        if (dVar == null) {
            C88253a.m109902a("Vending.Pipeline", "Default scheduler %s is not available!!!", this.f255914h);
            return;
        }
        dVar.arrange(cVar);
    }

    /* renamed from: k */
    public synchronized C88629c<_Var> mo123071k(long j) {
        this.f255919p = j;
        return this;
    }

    /* renamed from: l */
    public final <_Ret> C88629c<_Ret> mo123072l(C87581a<_Ret, _Var> aVar, boolean z) {
        if (!this.f255910d) {
            LinkedList linkedList = (LinkedList) this.f255912f;
            linkedList.add(new C88638f(aVar, this.f255913g, this.f255919p, z));
            this.f255919p = -1;
            if (this.f255911e == C88641i.Idle || this.f255911e != C88641i.Resolved) {
                return this;
            }
            mo123068h();
            return this;
        }
        throw new C88640h("This Pipeline(%s) has terminate and do not allow any next().", this);
    }

    /* renamed from: m */
    public synchronized C88629c<_Var> mo123063m(boolean z) {
        this.f255920q = z;
        return this;
    }

    /* renamed from: n */
    public final void mo123073n(C88631d.C76721a aVar, C88819d dVar) {
        this.f255910d = true;
        if (this.f255925v == null) {
            this.f255925v = new LinkedList();
        }
        Pair pair = new Pair(aVar, dVar);
        if (this.f255928y) {
            mo123070j(pair, this.f255909A);
        } else {
            this.f255925v.add(pair);
        }
    }

    /* renamed from: p */
    public <_Ret> C88629c<_Ret> mo123064p(C87581a<_Ret, _Var> aVar) {
        return mo123067g("Vending.LOGIC").mo123061d(aVar);
    }

    /* renamed from: q */
    public final void mo123074q(C88631d.C88632b bVar, C88819d dVar) {
        this.f255910d = true;
        mo123068h();
        if (this.f255926w == null) {
            this.f255926w = new LinkedList();
        }
        Pair pair = new Pair(bVar, dVar);
        if (this.f255927x) {
            mo123080w(pair, this.f255929z);
        } else {
            this.f255926w.add(pair);
        }
    }

    /* renamed from: r */
    public final synchronized Object mo123075r() {
        Object obj;
        obj = this.f255916j;
        this.f255917n = this.f255916j;
        String str = null;
        this.f255916j = null;
        this.f255915i = false;
        Object[] objArr = new Object[1];
        if (obj != null) {
            str = String.valueOf(obj.hashCode());
        }
        objArr[0] = str;
        if (C88253a.f255069a != null) {
            Log.m105919d("Vending.Pipeline", "pop input(%s)", objArr);
        }
        return obj;
    }

    /* renamed from: s */
    public synchronized C88629c<_Var> mo123076s(C88629c.C88630a<_Var> aVar) {
        mo123078u(new Object[0]);
        mo123072l(new C88635b(this, aVar), true);
        return this;
    }

    /* renamed from: t */
    public synchronized C88629c<_Var> mo123077t(Object... objArr) {
        mo123078u(objArr);
        return this;
    }

    /* renamed from: u */
    public final C88629c<_Var> mo123078u(Object... objArr) {
        C89281k kVar;
        if (this.f255911e != C88641i.Idle) {
            return this;
        }
        this.f255911e = C88641i.Resolved;
        if (objArr.length == 0) {
            kVar = null;
        } else if (objArr.length == 1) {
            kVar = objArr[0];
        } else {
            C89281k kVar2 = new C89281k();
            kVar2.f352402a = objArr;
            kVar = kVar2;
        }
        mo123079v(kVar);
        mo123068h();
        return this;
    }

    /* renamed from: v */
    public final synchronized void mo123079v(Object obj) {
        this.f255916j = obj;
        this.f255915i = true;
        Object[] objArr = new Object[1];
        objArr[0] = obj != null ? String.valueOf(obj.hashCode()) : null;
        if (C88253a.f255069a != null) {
            Log.m105919d("Vending.Pipeline", "set input(%s)", objArr);
        }
    }

    /* renamed from: w */
    public final void mo123080w(Pair<C88631d.C88632b, C88819d> pair, Object obj) {
        new C88822g((C88819d) pair.second, (C88822g.C88823a) null).mo123215a(new C88636d(this, pair, obj, new RuntimeException("object is not right: " + obj)), (Object) null, this.f255920q);
    }
}
