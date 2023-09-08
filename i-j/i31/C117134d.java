package i31;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.datapreloader.FutureTask$1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import i31.C117139g;
import j31.C117294b;
import j31.C9279c;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: i31.d */
public abstract class C117134d<_key, _value, T extends C117139g<_key, _value>> {

    /* renamed from: a */
    public final String f350948a;

    /* renamed from: b */
    public T f350949b;

    /* renamed from: c */
    public final C13601g f350950c;

    /* renamed from: d */
    public final C13601g f350951d;

    /* renamed from: e */
    public final C13601g f350952e;

    /* renamed from: f */
    public C53973z1 f350953f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.datapreloader.FutureTask", mo125469f = "FutureTask.kt", mo125470l = {61, 64, 74}, mo125471m = "preload$suspendImpl")
    /* renamed from: i31.d$a */
    public static final class C117135a extends C66704d {

        /* renamed from: d */
        public Object f350954d;

        /* renamed from: e */
        public /* synthetic */ Object f350955e;

        /* renamed from: f */
        public final /* synthetic */ C117134d<_key, _value, T> f350956f;

        /* renamed from: g */
        public int f350957g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C117135a(C117134d<_key, _value, T> dVar, C15601d<? super C117135a> dVar2) {
            super(dVar2);
            this.f350956f = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f350955e = obj;
            this.f350957g |= Integer.MIN_VALUE;
            return C117134d.m165172f(this.f350956f, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.datapreloader.FutureTask$preload$job$1", mo125469f = "FutureTask.kt", mo125470l = {67}, mo125471m = "invokeSuspend")
    /* renamed from: i31.d$b */
    public static final class C117136b extends C91594j implements C32227p<C0000n0, C15601d<? super _value>, Object> {

        /* renamed from: d */
        public int f350958d;

        /* renamed from: e */
        public final /* synthetic */ C117134d<_key, _value, T> f350959e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C117136b(C117134d<_key, _value, T> dVar, C15601d<? super C117136b> dVar2) {
            super(2, dVar2);
            this.f350959e = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C117136b(this.f350959e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C117136b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f350958d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C117134d<_key, _value, T> dVar = this.f350959e;
                this.f350958d = 1;
                obj = dVar.mo181071g(false, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f350959e.mo181070d().mo10056c(true);
            this.f350959e.mo181070d().mo379e(obj, System.currentTimeMillis());
            this.f350959e.mo181070d().mo10054a();
            return obj;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.datapreloader.FutureTask", mo125469f = "FutureTask.kt", mo125470l = {45, 46}, mo125471m = "run$suspendImpl")
    /* renamed from: i31.d$c */
    public static final class C117137c extends C66704d {

        /* renamed from: d */
        public Object f350960d;

        /* renamed from: e */
        public boolean f350961e;

        /* renamed from: f */
        public /* synthetic */ Object f350962f;

        /* renamed from: g */
        public final /* synthetic */ C117134d<_key, _value, T> f350963g;

        /* renamed from: h */
        public int f350964h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C117137c(C117134d<_key, _value, T> dVar, C15601d<? super C117137c> dVar2) {
            super(dVar2);
            this.f350963g = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f350962f = obj;
            this.f350964h |= Integer.MIN_VALUE;
            return C117134d.m165174i(this.f350963g, false, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.datapreloader.FutureTask$run$2", mo125469f = "FutureTask.kt", mo125470l = {49, 53, 55}, mo125471m = "invokeSuspend")
    /* renamed from: i31.d$d */
    public static final class C117138d extends C91594j implements C32227p<C0000n0, C15601d<? super _value>, Object> {

        /* renamed from: d */
        public int f350965d;

        /* renamed from: e */
        public final /* synthetic */ C117134d<_key, _value, T> f350966e;

        /* renamed from: f */
        public final /* synthetic */ boolean f350967f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C117138d(C117134d<_key, _value, T> dVar, boolean z, C15601d<? super C117138d> dVar2) {
            super(2, dVar2);
            this.f350966e = dVar;
            this.f350967f = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C117138d(this.f350966e, this.f350967f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C117138d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f350965d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String e = this.f350966e.mo384e();
                Log.m105924i(e, "requestCache checkCache:" + this.f350967f);
                if (this.f350967f) {
                    C117294b<_key, _value> d = this.f350966e.mo181070d();
                    this.f350965d = 1;
                    obj = d.mo378d(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    T b = this.f350966e.mo181068b();
                    this.f350965d = 3;
                    obj = b.mo10083f(this);
                    return obj == aVar ? aVar : obj;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2 || i == 3) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (obj != null) {
                C117134d<_key, _value, T> dVar = this.f350966e;
                String e2 = dVar.mo384e();
                Log.m105924i(e2, "requestCache with cache:" + obj);
                dVar.mo181070d().mo10056c(false);
                dVar.mo181068b().mo10080b(obj);
            } else {
                T b2 = this.f350966e.mo181068b();
                this.f350965d = 2;
                obj = b2.mo10083f(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
        }
    }

    public C117134d(C32224a aVar, C53973z1 z1Var, C0125s sVar, C53896h0 h0Var, int i, C8480h hVar) {
        z1Var = (i & 2) != 0 ? null : z1Var;
        sVar = (i & 4) != 0 ? null : sVar;
        h0Var = (i & 8) != 0 ? C53872d1.f151119c : h0Var;
        C87412m.m108594g(aVar, "initLoader");
        C87412m.m108594g(h0Var, "coroutineDispatcher");
        this.f350948a = "FutureTask";
        this.f350950c = C36568h.m40985a(new C117133c(this));
        this.f350951d = C36568h.m40985a(new C8848f(this));
        this.f350952e = C36568h.m40985a(new C60243e(z1Var, h0Var));
        C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new FutureTask$1(sVar, this, (C15601d<? super FutureTask$1>) null), 3, (Object) null);
        this.f350953f = C53895h.m60466d(mo181069c(), (C66212f) null, (C53934p0) null, new C117130a(this, aVar, (C15601d<? super C117130a>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m165172f(i31.C117134d r10, wx3.C15601d r11) {
        /*
            boolean r0 = r11 instanceof i31.C117134d.C117135a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            i31.d$a r0 = (i31.C117134d.C117135a) r0
            int r1 = r0.f350957g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f350957g = r1
            goto L_0x0018
        L_0x0013:
            i31.d$a r0 = new i31.d$a
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f350955e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f350957g
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r5) goto L_0x0039
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0096
        L_0x002d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0070
        L_0x0039:
            java.lang.Object r10 = r0.f350954d
            i31.d r10 = (i31.C117134d) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x004f
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r11)
            r0.f350954d = r10
            r0.f350957g = r5
            java.lang.Object r11 = r10.mo181072j(r0)
            if (r11 != r1) goto L_0x004f
            return r1
        L_0x004f:
            j31.b r11 = r10.mo181070d()
            a14.u0 r11 = r11.mo10055b()
            r2 = 0
            if (r11 == 0) goto L_0x0061
            boolean r6 = r11.mo74466a()
            if (r6 != r5) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r5 = 0
        L_0x0062:
            r2 = 0
            if (r5 == 0) goto L_0x0071
            r0.f350954d = r2
            r0.f350957g = r4
            java.lang.Object r11 = r11.mo74634A(r0)
            if (r11 != r1) goto L_0x0070
            return r1
        L_0x0070:
            return r11
        L_0x0071:
            a14.n0 r4 = r10.mo181069c()
            r5 = 0
            r6 = 0
            i31.d$b r7 = new i31.d$b
            r7.<init>(r10, r2)
            r8 = 3
            r9 = 0
            a14.u0 r11 = a14.C53895h.m60464b(r4, r5, r6, r7, r8, r9)
            j31.b r10 = r10.mo181070d()
            r10.mo10057f(r11)
            r0.f350954d = r2
            r0.f350957g = r3
            a14.v0 r11 = (a14.C53957v0) r11
            java.lang.Object r11 = r11.mo74549z(r0)
            if (r11 != r1) goto L_0x0096
            return r1
        L_0x0096:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: i31.C117134d.m165172f(i31.d, wx3.d):java.lang.Object");
    }

    /* renamed from: h */
    public static /* synthetic */ Object m165173h(C117134d dVar, boolean z, C15601d dVar2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            return dVar.mo181071g(z, dVar2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: run");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065 A[PHI: r7 
      PHI: (r7v2 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:18:0x0062, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m165174i(i31.C117134d r5, boolean r6, wx3.C15601d r7) {
        /*
            boolean r0 = r7 instanceof i31.C117134d.C117137c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            i31.d$c r0 = (i31.C117134d.C117137c) r0
            int r1 = r0.f350964h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f350964h = r1
            goto L_0x0018
        L_0x0013:
            i31.d$c r0 = new i31.d$c
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f350962f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f350964h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0065
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            boolean r6 = r0.f350961e
            java.lang.Object r5 = r0.f350960d
            i31.d r5 = (i31.C117134d) r5
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x004c
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f350960d = r5
            r0.f350961e = r6
            r0.f350964h = r4
            java.lang.Object r7 = r5.mo181072j(r0)
            if (r7 != r1) goto L_0x004c
            return r1
        L_0x004c:
            a14.n0 r7 = r5.mo181069c()
            wx3.f r7 = r7.getCoroutineContext()
            i31.d$d r2 = new i31.d$d
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f350960d = r4
            r0.f350964h = r3
            java.lang.Object r7 = a14.C53895h.m60469g(r7, r2, r0)
            if (r7 != r1) goto L_0x0065
            return r1
        L_0x0065:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i31.C117134d.m165174i(i31.d, boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: a */
    public C117294b<_key, _value> mo383a() {
        return new C9279c(((C36570n) this.f350950c).getValue());
    }

    /* renamed from: b */
    public final T mo181068b() {
        T t = this.f350949b;
        if (t != null) {
            return t;
        }
        C87412m.m108603p("future");
        throw null;
    }

    /* renamed from: c */
    public final C0000n0 mo181069c() {
        return (C0000n0) this.f350952e.getValue();
    }

    /* renamed from: d */
    public final C117294b<_key, _value> mo181070d() {
        return (C117294b) ((C36570n) this.f350951d).getValue();
    }

    /* renamed from: e */
    public String mo384e() {
        return this.f350948a;
    }

    /* renamed from: g */
    public Object mo181071g(boolean z, C15601d<? super _value> dVar) {
        return m165174i(this, z, dVar);
    }

    /* renamed from: j */
    public final Object mo181072j(C15601d<? super C13598b0> dVar) {
        C53973z1 z1Var = this.f350953f;
        if (z1Var == null) {
            return C13598b0.f38549a;
        }
        Object O = z1Var.mo74521O(dVar);
        return O == C15911a.COROUTINE_SUSPENDED ? O : C13598b0.f38549a;
    }
}
