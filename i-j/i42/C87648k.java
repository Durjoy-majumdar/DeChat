package i42;

import android.os.Handler;
import android.os.Looper;
import com.tencent.p014mm.plugin.magicbrush.C85244b0;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d42.C86189r;
import d42.C86190s;
import e42.C7594e;
import e42.C7596h;
import e42.C86430i;
import e42.C86431j;
import e42.C86432k;
import f42.C7982d;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h42.C87431b;
import j42.C87874p;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import p748xd.C91174f;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;

/* renamed from: i42.k */
public final class C87648k<T extends C7594e> implements C87431b, C86190s {

    /* renamed from: a */
    public final MBBuildConfig<T> f253853a;

    /* renamed from: b */
    public final C86189r<T> f253854b;

    /* renamed from: c */
    public final C32226l<String, C13604l<String, C85244b0>> f253855c;

    /* renamed from: d */
    public final C32226l<String, C13598b0> f253856d;

    /* renamed from: e */
    public final C13601g f253857e = C36568h.m40985a(new C87652d(this));

    /* renamed from: f */
    public C87874p f253858f;

    /* renamed from: g */
    public final Handler f253859g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    public final HashMap<Integer, List<Runnable>> f253860h = new HashMap<>();

    /* renamed from: i */
    public final HashMap<Integer, String> f253861i = new HashMap<>();

    /* renamed from: i42.k$a */
    public static final class C87649a extends C87413o implements C32226l<C7596h, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87648k<T> f253862d;

        /* renamed from: e */
        public final /* synthetic */ int f253863e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87649a(C87648k<T> kVar, int i) {
            super(1);
            this.f253862d = kVar;
            this.f253863e = i;
        }

        public Object invoke(Object obj) {
            C7596h hVar = (C7596h) obj;
            C87412m.m108594g(hVar, "result");
            C87874p pVar = this.f253862d.f253858f;
            if (pVar != null) {
                pVar.mo121880o(this.f253863e, hVar.mo8721a());
                return C13598b0.f38549a;
            }
            C87412m.m108603p("server");
            throw null;
        }
    }

    /* renamed from: i42.k$b */
    public static final class C87650b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C86430i<C7594e> f253864d;

        /* renamed from: e */
        public final /* synthetic */ C7596h f253865e;

        public C87650b(C86430i<C7594e> iVar, C7596h hVar) {
            this.f253864d = iVar;
            this.f253865e = hVar;
        }

        public final void run() {
            this.f253864d.mo18q(this.f253865e);
        }
    }

    /* renamed from: i42.k$c */
    public static final class C87651c<V> implements Callable {

        /* renamed from: d */
        public final /* synthetic */ C86432k<C7594e> f253866d;

        /* renamed from: e */
        public final /* synthetic */ C7596h f253867e;

        public C87651c(C86432k<C7594e> kVar, C7596h hVar) {
            this.f253866d = kVar;
            this.f253867e = hVar;
        }

        public Object call() {
            return this.f253866d.mo62167o(this.f253867e);
        }
    }

    /* renamed from: i42.k$d */
    public static final class C87652d extends C87413o implements C32224a<C7982d> {

        /* renamed from: d */
        public final /* synthetic */ C87648k<T> f253868d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87652d(C87648k<T> kVar) {
            super(0);
            this.f253868d = kVar;
        }

        public Object invoke() {
            C87874p pVar = this.f253868d.f253858f;
            if (pVar != null) {
                return new C7982d(pVar.f254276b);
            }
            C87412m.m108603p("server");
            throw null;
        }
    }

    /* renamed from: i42.k$e */
    public static final class C87653e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87648k<T> f253869d;

        /* renamed from: e */
        public final /* synthetic */ int f253870e;

        /* renamed from: f */
        public final /* synthetic */ int f253871f;

        /* renamed from: g */
        public final /* synthetic */ int f253872g;

        /* renamed from: h */
        public final /* synthetic */ int f253873h;

        /* renamed from: i */
        public final /* synthetic */ int f253874i;

        /* renamed from: j */
        public final /* synthetic */ int f253875j;

        public C87653e(C87648k<T> kVar, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f253869d = kVar;
            this.f253870e = i;
            this.f253871f = i2;
            this.f253872g = i3;
            this.f253873h = i4;
            this.f253874i = i5;
            this.f253875j = i6;
        }

        public final void run() {
            long currentTicks = Util.currentTicks();
            String str = this.f253869d.f253861i.get(Integer.valueOf(this.f253870e));
            if (str != null) {
                C85244b0 b0Var = (C85244b0) this.f253869d.f253855c.invoke(str).f38556e;
                if (b0Var != null) {
                    b0Var.q80(str, this.f253870e, this.f253871f, this.f253872g, this.f253873h, this.f253874i, this.f253875j);
                }
                Log.m105924i("MagicBrushPublicService", "onCanvasViewCreated ipc cost: " + Util.ticksToNow(currentTicks));
            }
        }
    }

    /* renamed from: i42.k$f */
    public static final class C87654f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87648k<T> f253876d;

        /* renamed from: e */
        public final /* synthetic */ int f253877e;

        /* renamed from: f */
        public final /* synthetic */ boolean f253878f;

        public C87654f(C87648k<T> kVar, int i, boolean z) {
            this.f253876d = kVar;
            this.f253877e = i;
            this.f253878f = z;
        }

        public final void run() {
            C85244b0 b0Var;
            String str = this.f253876d.f253861i.get(Integer.valueOf(this.f253877e));
            if (str != null && (b0Var = (C85244b0) this.f253876d.f253855c.invoke(str).f38556e) != null) {
                b0Var.mo118385Ym(str, this.f253877e, this.f253878f);
            }
        }
    }

    /* renamed from: i42.k$g */
    public static final class C87655g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87648k<T> f253879d;

        /* renamed from: e */
        public final /* synthetic */ int f253880e;

        /* renamed from: f */
        public final /* synthetic */ float[] f253881f;

        /* renamed from: g */
        public final /* synthetic */ float[] f253882g;

        /* renamed from: h */
        public final /* synthetic */ float[] f253883h;

        /* renamed from: i */
        public final /* synthetic */ float[] f253884i;

        public C87655g(C87648k<T> kVar, int i, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
            this.f253879d = kVar;
            this.f253880e = i;
            this.f253881f = fArr;
            this.f253882g = fArr2;
            this.f253883h = fArr3;
            this.f253884i = fArr4;
        }

        public final void run() {
            C85244b0 b0Var;
            String str = this.f253879d.f253861i.get(Integer.valueOf(this.f253880e));
            if (str != null && (b0Var = (C85244b0) this.f253879d.f253855c.invoke(str).f38556e) != null) {
                b0Var.x90(str, this.f253880e, this.f253881f, this.f253882g, this.f253883h, this.f253884i);
            }
        }
    }

    /* renamed from: i42.k$h */
    public static final class C87656h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87648k<T> f253885d;

        /* renamed from: e */
        public final /* synthetic */ int f253886e;

        /* renamed from: f */
        public final /* synthetic */ int f253887f;

        /* renamed from: g */
        public final /* synthetic */ int f253888g;

        /* renamed from: h */
        public final /* synthetic */ int f253889h;

        /* renamed from: i */
        public final /* synthetic */ int f253890i;

        /* renamed from: j */
        public final /* synthetic */ int f253891j;

        public C87656h(C87648k<T> kVar, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f253885d = kVar;
            this.f253886e = i;
            this.f253887f = i2;
            this.f253888g = i3;
            this.f253889h = i4;
            this.f253890i = i5;
            this.f253891j = i6;
        }

        public final void run() {
            C85244b0 b0Var;
            String str = this.f253885d.f253861i.get(Integer.valueOf(this.f253886e));
            if (str != null && (b0Var = (C85244b0) this.f253885d.f253855c.invoke(str).f38556e) != null) {
                b0Var.mo118384WI(str, this.f253886e, this.f253887f, this.f253888g, this.f253889h, this.f253890i, this.f253891j);
            }
        }
    }

    public C87648k(MBBuildConfig<T> mBBuildConfig, C86189r<T> rVar, C32226l<? super String, ? extends C13604l<String, ? extends C85244b0>> lVar, C32226l<? super String, C13598b0> lVar2) {
        C87412m.m108594g(mBBuildConfig, "config");
        C87412m.m108594g(rVar, "delegate");
        C87412m.m108594g(lVar, "instanceToClientMgr");
        C87412m.m108594g(lVar2, "markHookBiz");
        this.f253853a = mBBuildConfig;
        this.f253854b = rVar;
        this.f253855c = lVar;
        this.f253856d = lVar2;
    }

    /* renamed from: a */
    public void mo121846a(String str) {
        C87412m.m108594g(str, "logStr");
    }

    /* renamed from: b */
    public void mo121847b() {
        this.f253854b.mo5788b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r0 == null) goto L_0x002b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo121848c(int r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            d42.r<T> r0 = r2.f253854b     // Catch:{ all -> 0x0043 }
            r0.mo5790k(r3)     // Catch:{ all -> 0x0043 }
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = r2.f253861i     // Catch:{ all -> 0x0043 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x002b
            fy3.l<java.lang.String, rx3.l<java.lang.String, com.tencent.mm.plugin.magicbrush.b0>> r1 = r2.f253855c     // Catch:{ all -> 0x0043 }
            java.lang.Object r1 = r1.invoke(r0)     // Catch:{ all -> 0x0043 }
            rx3.l r1 = (rx3.C13604l) r1     // Catch:{ all -> 0x0043 }
            B r1 = r1.f38556e     // Catch:{ all -> 0x0043 }
            com.tencent.mm.plugin.magicbrush.b0 r1 = (com.tencent.p014mm.plugin.magicbrush.C85244b0) r1     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0028
            r1.mo118385Ym(r0, r3, r4)     // Catch:{ all -> 0x0043 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0043 }
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 != 0) goto L_0x0041
        L_0x002b:
            java.util.HashMap<java.lang.Integer, java.util.List<java.lang.Runnable>> r0 = r2.f253860h     // Catch:{ all -> 0x0043 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0043 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0041
            i42.k$f r1 = new i42.k$f     // Catch:{ all -> 0x0043 }
            r1.<init>(r2, r3, r4)     // Catch:{ all -> 0x0043 }
            r0.add(r1)     // Catch:{ all -> 0x0043 }
        L_0x0041:
            monitor-exit(r2)
            return
        L_0x0043:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i42.C87648k.mo121848c(int, boolean):void");
    }

    /* renamed from: d */
    public synchronized void mo120595d(int i, String str) {
        C87412m.m108594g(str, "instanceName");
        this.f253861i.put(Integer.valueOf(i), str);
        this.f253856d.invoke(str);
        List<Runnable> list = this.f253860h.get(Integer.valueOf(i));
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
        }
    }

    /* renamed from: e */
    public void mo121849e(int i, String str) {
        C87412m.m108594g(str, "msg");
    }

    /* renamed from: f */
    public String mo120596f(String str) {
        C87412m.m108594g(str, "instanceName");
        return (String) this.f253855c.invoke(str).f38555d;
    }

    /* renamed from: i */
    public void mo121850i(String str, String str2) {
        C87412m.m108594g(str, "envId");
        C87412m.m108594g(str2, "msg");
        this.f253854b.mo5789i(str, str2);
    }

    /* renamed from: k */
    public void mo121851k(boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (r0 == null) goto L_0x0043;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo121852n(int r10, float[] r11, float[] r12, float[] r13, float[] r14) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "left"
            gy3.C87412m.m108594g(r11, r0)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "top"
            gy3.C87412m.m108594g(r12, r0)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "width"
            gy3.C87412m.m108594g(r13, r0)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "height"
            gy3.C87412m.m108594g(r14, r0)     // Catch:{ all -> 0x0062 }
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = r9.f253861i     // Catch:{ all -> 0x0062 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0062 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0062 }
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x0043
            fy3.l<java.lang.String, rx3.l<java.lang.String, com.tencent.mm.plugin.magicbrush.b0>> r0 = r9.f253855c     // Catch:{ all -> 0x0062 }
            java.lang.Object r0 = r0.invoke(r2)     // Catch:{ all -> 0x0062 }
            rx3.l r0 = (rx3.C13604l) r0     // Catch:{ all -> 0x0062 }
            B r0 = r0.f38556e     // Catch:{ all -> 0x0062 }
            r1 = r0
            com.tencent.mm.plugin.magicbrush.b0 r1 = (com.tencent.p014mm.plugin.magicbrush.C85244b0) r1     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0040
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.x90(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0062 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0062 }
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0060
        L_0x0043:
            java.util.HashMap<java.lang.Integer, java.util.List<java.lang.Runnable>> r0 = r9.f253860h     // Catch:{ all -> 0x0062 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0062 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0062 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0060
            i42.k$g r8 = new i42.k$g     // Catch:{ all -> 0x0062 }
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0062 }
            r0.add(r8)     // Catch:{ all -> 0x0062 }
        L_0x0060:
            monitor-exit(r9)
            return
        L_0x0062:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i42.C87648k.mo121852n(int, float[], float[], float[], float[]):void");
    }

    public void onCreated() {
        this.f253854b.onCreated();
    }

    public void onDestroy() {
        this.f253854b.onDestroy();
    }

    /* renamed from: p */
    public void mo121855p(String str, String str2, int i) {
        C87412m.m108594g(str, "event");
        C87412m.m108594g(str2, "data");
        C86431j jVar = this.f253853a.f248374j.get(str);
        if (jVar != null) {
            C86430i o = ((C86430i) jVar).mo71237o();
            o.f251227a = this.f253853a.mo118368b();
            o.mo120847m((C7982d) ((C36570n) this.f253857e).getValue());
            o.f251226c = new C87649a(this, i);
            C7596h hVar = new C7596h(str2);
            if (o.mo17l()) {
                this.f253859g.post(new C87650b(o, hVar));
            } else {
                o.mo18q(hVar);
            }
        }
    }

    /* renamed from: q */
    public synchronized void mo121856q(int i) {
        C85244b0 b0Var;
        this.f253854b.mo5787H(i);
        String remove = this.f253861i.remove(Integer.valueOf(i));
        if (!(remove == null || (b0Var = (C85244b0) this.f253855c.invoke(remove).f38556e) == null)) {
            b0Var.mo118387gq(remove, i);
        }
        this.f253860h.remove(Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (r0 == null) goto L_0x0031;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo121857s(int r12, int r13, int r14, int r15, int r16, int r17) {
        /*
            r11 = this;
            r9 = r11
            monitor-enter(r11)
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = r9.f253861i     // Catch:{ all -> 0x0053 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0053 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0053 }
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x0031
            fy3.l<java.lang.String, rx3.l<java.lang.String, com.tencent.mm.plugin.magicbrush.b0>> r0 = r9.f253855c     // Catch:{ all -> 0x0053 }
            java.lang.Object r0 = r0.invoke(r2)     // Catch:{ all -> 0x0053 }
            rx3.l r0 = (rx3.C13604l) r0     // Catch:{ all -> 0x0053 }
            B r0 = r0.f38556e     // Catch:{ all -> 0x0053 }
            r1 = r0
            com.tencent.mm.plugin.magicbrush.b0 r1 = (com.tencent.p014mm.plugin.magicbrush.C85244b0) r1     // Catch:{ all -> 0x0053 }
            if (r1 == 0) goto L_0x002e
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.mo118384WI(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0053 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0053 }
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r0 != 0) goto L_0x0051
        L_0x0031:
            java.util.HashMap<java.lang.Integer, java.util.List<java.lang.Runnable>> r0 = r9.f253860h     // Catch:{ all -> 0x0053 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0053 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0053 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0051
            i42.k$h r10 = new i42.k$h     // Catch:{ all -> 0x0053 }
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0053 }
            r0.add(r10)     // Catch:{ all -> 0x0053 }
        L_0x0051:
            monitor-exit(r11)
            return
        L_0x0053:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i42.C87648k.mo121857s(int, int, int, int, int, int):void");
    }

    /* renamed from: t */
    public synchronized void mo121858t(int i, int i2, int i3, int i4, int i5, int i6) {
        synchronized (this) {
            int i7 = i;
            this.f253854b.mo5794w(i);
            this.f253860h.put(Integer.valueOf(i), C64197v.m75539h(new C87653e(this, i, i2, i3, i4, i5, i6)));
        }
    }

    /* renamed from: u */
    public String mo121859u(String str, String str2) {
        String str3;
        C87412m.m108594g(str, "event");
        C87412m.m108594g(str2, "data");
        C86431j jVar = this.f253853a.f248374j.get(str);
        if (jVar == null) {
            return "{\"errMsg\":\"Not handled\", \"errCode\": -1}";
        }
        C86432k kVar = (C86432k) jVar;
        kVar.f251227a = this.f253853a.mo118368b();
        kVar.mo120847m((C7982d) ((C36570n) this.f253857e).getValue());
        C7596h hVar = new C7596h(str2);
        if (kVar.mo17l()) {
            C91174f fVar = new C91174f(new C87651c(kVar, hVar));
            this.f253859g.post(fVar);
            str3 = ((C7596h) fVar.mo125236b()).mo8721a();
        } else {
            str3 = kVar.mo62167o(hVar).mo8721a();
        }
        kVar.f251227a = null;
        return str3;
    }
}
