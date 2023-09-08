package p774zg;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.eclipsesource.mmv8.JavaCallback;
import com.eclipsesource.mmv8.JavaVoidCallback;
import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8Function;
import com.eclipsesource.mmv8.V8Object;
import com.tencent.p014mm.appbrand.p942v8.C80655c;
import com.tencent.p014mm.appbrand.p942v8.C80662g;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import java.util.concurrent.TimeUnit;

/* renamed from: zg.i0 */
public class C91717i0 extends C91688c0 {

    /* renamed from: b */
    public int f262722b = 0;

    /* renamed from: c */
    public final SparseArray<C91724f> f262723c = new SparseArray<>();

    /* renamed from: d */
    public volatile Looper f262724d;

    /* renamed from: e */
    public boolean f262725e = false;

    /* renamed from: zg.i0$a */
    public class C91718a implements JavaCallback {

        /* renamed from: a */
        public final /* synthetic */ C80669j f262726a;

        public C91718a(C80669j jVar) {
            this.f262726a = jVar;
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [java.lang.Object, zg.i0$g] */
        /* JADX WARNING: type inference failed for: r8v3, types: [zg.i0$e] */
        /* JADX WARNING: type inference failed for: r8v4, types: [zg.i0$g] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(com.eclipsesource.mmv8.V8Object r18, com.eclipsesource.mmv8.V8Array r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r19
                int r2 = r19.length()
                java.lang.String r3 = "MicroMsg.J2V8.V8DirectApiTimer"
                r4 = 0
                r5 = 2
                r6 = 0
                r7 = 1
                if (r2 < r7) goto L_0x00c2
                int r2 = r1.getType(r6)
                r8 = 7
                if (r2 == r8) goto L_0x0019
                goto L_0x00c2
            L_0x0019:
                com.eclipsesource.mmv8.V8Object r2 = r1.getObject(r6)
                r12 = r2
                com.eclipsesource.mmv8.V8Function r12 = (com.eclipsesource.mmv8.V8Function) r12
                int r2 = r19.length()
                if (r2 <= r7) goto L_0x0064
                int r2 = r1.getType(r7)
                if (r2 != r7) goto L_0x0031
                int r6 = r1.getInteger(r7)
                goto L_0x0064
            L_0x0031:
                int r2 = r1.getType(r7)
                if (r2 != r5) goto L_0x003d
                double r2 = r1.getDouble(r7)
                int r6 = (int) r2
                goto L_0x0064
            L_0x003d:
                int r2 = r1.getType(r7)
                r8 = 4
                if (r2 != r8) goto L_0x0051
                java.lang.String r2 = r1.getString(r7)
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                int r6 = p774zg.C91717i0.m115242d(r2, r3)
                if (r6 != r3) goto L_0x0064
                return r4
            L_0x0051:
                java.lang.Object[] r2 = new java.lang.Object[r7]
                int r1 = r1.getType(r7)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2[r6] = r1
                java.lang.String r1 = "setTimeout parameters[1] type:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r1, r2)
                return r4
            L_0x0064:
                int r2 = r19.length()
                if (r2 <= r5) goto L_0x0081
                java.util.List r1 = com.eclipsesource.mmv8.utils.V8ObjectUtils.toList(r19)
                com.tencent.mm.appbrand.v8.j r2 = r0.f262726a
                com.eclipsesource.mmv8.V8Context r2 = r2.mo112501e()
                int r3 = r1.size()
                java.util.List r1 = r1.subList(r7, r3)
                com.eclipsesource.mmv8.V8Array r1 = com.eclipsesource.mmv8.utils.V8ObjectUtils.toV8Array((com.eclipsesource.mmv8.V8Context) r2, (java.util.List<? extends java.lang.Object>) r1)
                goto L_0x008b
            L_0x0081:
                com.tencent.mm.appbrand.v8.j r1 = r0.f262726a
                com.eclipsesource.mmv8.V8Context r1 = r1.mo112501e()
                com.eclipsesource.mmv8.V8Array r1 = r1.newV8Array()
            L_0x008b:
                r13 = r1
                zg.i0 r1 = p774zg.C91717i0.this
                com.tencent.mm.appbrand.v8.j r10 = r0.f262726a
                int r2 = r1.f262722b
                int r11 = r2 + 1
                r1.f262722b = r11
                com.tencent.mm.appbrand.v8.IJSRuntime r2 = r10.f236041b
                boolean r2 = r2 instanceof com.tencent.p014mm.appbrand.p942v8.C80655c
                if (r2 == 0) goto L_0x00a7
                zg.i0$g r2 = new zg.i0$g
                r14 = 0
                long r3 = (long) r6
                r8 = r2
                r9 = r1
                r15 = r3
                r8.<init>(r9, r10, r11, r12, r13, r14, r15)
                goto L_0x00b1
            L_0x00a7:
                zg.i0$e r2 = new zg.i0$e
                r14 = 0
                long r3 = (long) r6
                r8 = r2
                r9 = r1
                r15 = r3
                r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            L_0x00b1:
                r2.mo125565e()
                android.util.SparseArray<zg.i0$f> r3 = r1.f262723c
                int r4 = r1.f262722b
                r3.put(r4, r2)
                int r1 = r1.f262722b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                return r1
            L_0x00c2:
                java.lang.Object[] r2 = new java.lang.Object[r5]
                int r5 = r19.length()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r2[r6] = r5
                int r1 = r1.getType(r6)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2[r7] = r1
                java.lang.String r1 = "setTimeout parameters invalid length:%d type[0]:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r1, r2)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p774zg.C91717i0.C91718a.invoke(com.eclipsesource.mmv8.V8Object, com.eclipsesource.mmv8.V8Array):java.lang.Object");
        }
    }

    /* renamed from: zg.i0$b */
    public class C91719b implements JavaCallback {

        /* renamed from: a */
        public final /* synthetic */ C80669j f262728a;

        public C91719b(C80669j jVar) {
            this.f262728a = jVar;
        }

        /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object, zg.i0$g] */
        /* JADX WARNING: type inference failed for: r8v3, types: [zg.i0$e] */
        /* JADX WARNING: type inference failed for: r8v4, types: [zg.i0$g] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(com.eclipsesource.mmv8.V8Object r18, com.eclipsesource.mmv8.V8Array r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r19
                int r2 = r19.length()
                java.lang.String r3 = "MicroMsg.J2V8.V8DirectApiTimer"
                r4 = 0
                r5 = 2
                r6 = 0
                r7 = 1
                if (r2 < r5) goto L_0x00bc
                int r2 = r1.getType(r6)
                r8 = 7
                if (r2 == r8) goto L_0x0019
                goto L_0x00bc
            L_0x0019:
                com.eclipsesource.mmv8.V8Object r2 = r1.getObject(r6)
                r12 = r2
                com.eclipsesource.mmv8.V8Function r12 = (com.eclipsesource.mmv8.V8Function) r12
                int r2 = r1.getType(r7)
                if (r2 != r7) goto L_0x002b
                int r2 = r1.getInteger(r7)
                goto L_0x004b
            L_0x002b:
                int r2 = r1.getType(r7)
                if (r2 != r5) goto L_0x0037
                double r2 = r1.getDouble(r7)
                int r2 = (int) r2
                goto L_0x004b
            L_0x0037:
                int r2 = r1.getType(r7)
                r8 = 4
                if (r2 != r8) goto L_0x00a9
                java.lang.String r2 = r1.getString(r7)
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                int r2 = p774zg.C91717i0.m115242d(r2, r3)
                if (r2 != r3) goto L_0x004b
                return r4
            L_0x004b:
                int r3 = r19.length()
                if (r3 <= r5) goto L_0x0068
                java.util.List r1 = com.eclipsesource.mmv8.utils.V8ObjectUtils.toList(r19)
                com.tencent.mm.appbrand.v8.j r3 = r0.f262728a
                com.eclipsesource.mmv8.V8Context r3 = r3.mo112501e()
                int r4 = r1.size()
                java.util.List r1 = r1.subList(r7, r4)
                com.eclipsesource.mmv8.V8Array r1 = com.eclipsesource.mmv8.utils.V8ObjectUtils.toV8Array((com.eclipsesource.mmv8.V8Context) r3, (java.util.List<? extends java.lang.Object>) r1)
                goto L_0x0072
            L_0x0068:
                com.tencent.mm.appbrand.v8.j r1 = r0.f262728a
                com.eclipsesource.mmv8.V8Context r1 = r1.mo112501e()
                com.eclipsesource.mmv8.V8Array r1 = r1.newV8Array()
            L_0x0072:
                r13 = r1
                zg.i0 r1 = p774zg.C91717i0.this
                com.tencent.mm.appbrand.v8.j r10 = r0.f262728a
                int r3 = r1.f262722b
                int r11 = r3 + 1
                r1.f262722b = r11
                com.tencent.mm.appbrand.v8.IJSRuntime r3 = r10.f236041b
                boolean r3 = r3 instanceof com.tencent.p014mm.appbrand.p942v8.C80655c
                if (r3 == 0) goto L_0x008e
                zg.i0$g r3 = new zg.i0$g
                r14 = 1
                long r4 = (long) r2
                r8 = r3
                r9 = r1
                r15 = r4
                r8.<init>(r9, r10, r11, r12, r13, r14, r15)
                goto L_0x0098
            L_0x008e:
                zg.i0$e r3 = new zg.i0$e
                r14 = 1
                long r4 = (long) r2
                r8 = r3
                r9 = r1
                r15 = r4
                r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            L_0x0098:
                r3.mo125565e()
                android.util.SparseArray<zg.i0$f> r2 = r1.f262723c
                int r4 = r1.f262722b
                r2.put(r4, r3)
                int r1 = r1.f262722b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                return r1
            L_0x00a9:
                java.lang.Object[] r2 = new java.lang.Object[r7]
                int r1 = r1.getType(r7)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2[r6] = r1
                java.lang.String r1 = "setInterval parameters[1] type:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r1, r2)
                return r4
            L_0x00bc:
                java.lang.Object[] r2 = new java.lang.Object[r5]
                int r5 = r19.length()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r2[r6] = r5
                int r1 = r1.getType(r6)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2[r7] = r1
                java.lang.String r1 = "setInterval parameters invalid length:%d type[0]:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r1, r2)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p774zg.C91717i0.C91719b.invoke(com.eclipsesource.mmv8.V8Object, com.eclipsesource.mmv8.V8Array):java.lang.Object");
        }
    }

    /* renamed from: zg.i0$c */
    public class C91720c implements JavaVoidCallback {
        public C91720c() {
        }

        public void invoke(V8Object v8Object, V8Array v8Array) {
            if (v8Array.length() >= 1 && v8Array.getType(0) == 1) {
                C91717i0 i0Var = C91717i0.this;
                int integer = v8Array.getInteger(0);
                C91724f fVar = i0Var.f262723c.get(integer);
                if (fVar != null) {
                    fVar.mo125564a();
                    i0Var.f262723c.remove(integer);
                }
            }
        }
    }

    /* renamed from: zg.i0$d */
    public class C91721d implements JavaVoidCallback {
        public C91721d() {
        }

        public void invoke(V8Object v8Object, V8Array v8Array) {
            if (v8Array.length() >= 1 && v8Array.getType(0) == 1) {
                C91717i0 i0Var = C91717i0.this;
                int integer = v8Array.getInteger(0);
                C91724f fVar = i0Var.f262723c.get(integer);
                if (fVar != null) {
                    fVar.mo125564a();
                    i0Var.f262723c.remove(integer);
                }
            }
        }
    }

    /* renamed from: zg.i0$e */
    public class C91722e extends C91725g {

        /* renamed from: n */
        public final MTimerHandler f262732n;

        /* renamed from: o */
        public long f262733o;

        /* renamed from: p */
        public long f262734p;

        /* renamed from: zg.i0$e$a */
        public class C91723a implements MTimerHandler.CallBack {

            /* renamed from: d */
            public final /* synthetic */ C80669j f262735d;

            public C91723a(C91717i0 i0Var, C80669j jVar) {
                this.f262735d = jVar;
            }

            public boolean onTimerExpired() {
                C91722e.this.f262734p = SystemClock.elapsedRealtimeNanos();
                this.f262735d.f236041b.mo112450v(C91722e.this);
                return false;
            }
        }

        public C91722e(C91717i0 i0Var, C80669j jVar, int i, V8Function v8Function, V8Array v8Array, boolean z, long j) {
            super(i0Var, jVar, i, v8Function, v8Array, z, j);
            this.f262732n = new MTimerHandler(i0Var.f262724d, (MTimerHandler.CallBack) new C91723a(i0Var, jVar), false);
        }

        /* renamed from: a */
        public void mo125564a() {
            this.f262732n.stopTimer();
            mo125567b();
        }

        /* renamed from: e */
        public void mo125565e() {
            MTimerHandler mTimerHandler = this.f262732n;
            long j = this.f262741h;
            mTimerHandler.startTimer(j, j);
        }

        public void run() {
            if (mo125569d()) {
                mo125568c(this.f262743j);
                if (mo125569d()) {
                    if (!this.f262742i) {
                        mo125567b();
                        return;
                    }
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j = this.f262733o;
                    if (0 == j) {
                        this.f262733o = elapsedRealtimeNanos - this.f262734p;
                    } else {
                        this.f262733o = ((j + elapsedRealtimeNanos) - this.f262734p) / 2;
                    }
                    long millis = this.f262741h - TimeUnit.NANOSECONDS.toMillis(this.f262733o);
                    if (millis <= 0) {
                        millis = this.f262741h;
                    }
                    this.f262732n.startTimer(millis, millis);
                }
            }
        }
    }

    /* renamed from: zg.i0$f */
    public abstract class C91724f {

        /* renamed from: d */
        public C80669j f262737d;

        /* renamed from: e */
        public V8Function f262738e;

        /* renamed from: f */
        public int f262739f;

        public C91724f(C80669j jVar, int i, V8Function v8Function) {
            this.f262737d = jVar;
            this.f262738e = v8Function;
            this.f262739f = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo125564a() {
            mo125567b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo125567b() {
            C91717i0.this.f262723c.remove(this.f262739f);
            this.f262738e.release();
        }

        /* renamed from: c */
        public void mo125568c(V8Array v8Array) {
            if (!this.f262738e.isReleased() && !this.f262737d.mo112501e().isReleased()) {
                this.f262738e.call(this.f262737d.mo112501e().getGlobalObject(), v8Array);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo125569d() {
            return !this.f262738e.isReleased() && !this.f262737d.mo112501e().isReleased();
        }
    }

    /* renamed from: zg.i0$g */
    public class C91725g extends C91724f implements Runnable {

        /* renamed from: h */
        public final long f262741h;

        /* renamed from: i */
        public final boolean f262742i;

        /* renamed from: j */
        public final V8Array f262743j;

        public C91725g(C91717i0 i0Var, C80669j jVar, int i, V8Function v8Function, V8Array v8Array, boolean z, long j) {
            super(jVar, i, v8Function);
            this.f262741h = j;
            this.f262742i = z;
            this.f262743j = v8Array;
        }

        /* renamed from: b */
        public void mo125567b() {
            super.mo125567b();
            this.f262743j.release();
        }

        /* renamed from: e */
        public void mo125565e() {
            this.f262737d.f236041b.mo112433D(this, this.f262741h);
        }

        public void run() {
            if (mo125569d()) {
                mo125568c(this.f262743j);
                if (mo125569d()) {
                    if (this.f262742i) {
                        mo125565e();
                    } else {
                        mo125567b();
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public static int m115242d(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return str.length() <= 0 ? i : Integer.decode(str).intValue();
        } catch (NumberFormatException e) {
            Log.printErrStackTrace("MicroMsg.J2V8.V8DirectApiTimer", e, "", new Object[0]);
            return i;
        }
    }

    /* renamed from: a */
    public void mo125556a() {
        for (int i = 0; i < this.f262723c.size(); i++) {
            this.f262723c.valueAt(i).mo125564a();
        }
        this.f262723c.clear();
        Looper looper = this.f262724d;
        if (looper != null && Looper.getMainLooper() != looper) {
            looper.quit();
            this.f262724d = null;
        }
    }

    /* renamed from: c */
    public void mo125558c(C80669j jVar, V8Object v8Object) {
        if (!(jVar.f236041b instanceof C80655c)) {
            this.f262724d = Looper.getMainLooper();
        }
        if (!this.f262725e) {
            IJSRuntime iJSRuntime = jVar.f236041b;
            if ((iJSRuntime instanceof C80662g) && ((C80662g) iJSRuntime).f236008q) {
                Log.m105924i("MicroMsg.J2V8.V8DirectApiTimer", "hy: node env do not need java imp timer");
                return;
            }
        }
        Log.m105924i("MicroMsg.J2V8.V8DirectApiTimer", "hy: not node. need to inject direct timer");
        v8Object.registerJavaMethod((JavaCallback) new C91718a(jVar), "setTimeout");
        v8Object.registerJavaMethod((JavaCallback) new C91719b(jVar), "setInterval");
        v8Object.registerJavaMethod((JavaVoidCallback) new C91720c(), "clearTimeout");
        v8Object.registerJavaMethod((JavaVoidCallback) new C91721d(), "clearInterval");
    }
}
