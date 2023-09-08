package p582k1;

import a14.C0000n0;
import fy3.C32224a;
import gy3.C87413o;
import p1166z0.C112539e;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: k1.b */
public final class C108797b {

    /* renamed from: a */
    public C32224a<? extends C0000n0> f325788a = new C108798a(this);

    /* renamed from: b */
    public C0000n0 f325789b;

    /* renamed from: c */
    public C108796a f325790c;

    /* renamed from: k1.b$a */
    public static final class C108798a extends C87413o implements C32224a<C0000n0> {

        /* renamed from: d */
        public final /* synthetic */ C108797b f325791d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108798a(C108797b bVar) {
            super(0);
            this.f325791d = bVar;
        }

        public Object invoke() {
            return this.f325791d.f325789b;
        }
    }

    @C91590f(mo125468c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", mo125469f = "NestedScrollModifier.kt", mo125470l = {215}, mo125471m = "dispatchPostFling-RZ2iAVY")
    /* renamed from: k1.b$b */
    public static final class C108799b extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f325792d;

        /* renamed from: e */
        public final /* synthetic */ C108797b f325793e;

        /* renamed from: f */
        public int f325794f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108799b(C108797b bVar, C15601d<? super C108799b> dVar) {
            super(dVar);
            this.f325793e = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f325792d = obj;
            this.f325794f |= Integer.MIN_VALUE;
            return this.f325793e.mo159900a(0, 0, this);
        }
    }

    @C91590f(mo125468c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", mo125469f = "NestedScrollModifier.kt", mo125470l = {200}, mo125471m = "dispatchPreFling-QWom1Mo")
    /* renamed from: k1.b$c */
    public static final class C108800c extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f325795d;

        /* renamed from: e */
        public final /* synthetic */ C108797b f325796e;

        /* renamed from: f */
        public int f325797f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108800c(C108797b bVar, C15601d<? super C108800c> dVar) {
            super(dVar);
            this.f325796e = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f325795d = obj;
            this.f325797f |= Integer.MIN_VALUE;
            return this.f325796e.mo159902c(0, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo159900a(long r8, long r10, wx3.C15601d<? super p560i2.C108330s> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof p582k1.C108797b.C108799b
            if (r0 == 0) goto L_0x0013
            r0 = r12
            k1.b$b r0 = (p582k1.C108797b.C108799b) r0
            int r1 = r0.f325794f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f325794f = r1
            goto L_0x0018
        L_0x0013:
            k1.b$b r0 = new k1.b$b
            r0.<init>(r7, r12)
        L_0x0018:
            r6 = r0
            java.lang.Object r12 = r6.f325792d
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r6.f325794f
            r2 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r2) goto L_0x0028
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0042
        L_0x0028:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r12)
            k1.a r1 = r7.f325790c
            if (r1 == 0) goto L_0x0047
            r6.f325794f = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.mo159897d(r2, r4, r6)
            if (r12 != r0) goto L_0x0042
            return r0
        L_0x0042:
            i2.s r12 = (p560i2.C108330s) r12
            long r8 = r12.f324356a
            goto L_0x004b
        L_0x0047:
            int r8 = p560i2.C108330s.f324355c
            long r8 = p560i2.C108330s.f324354b
        L_0x004b:
            i2.s r10 = new i2.s
            r10.<init>(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p582k1.C108797b.mo159900a(long, long, wx3.d):java.lang.Object");
    }

    /* renamed from: b */
    public final long mo159901b(long j, long j2, int i) {
        C108796a aVar = this.f325790c;
        if (aVar != null) {
            return aVar.mo159896b(j, j2, i);
        }
        int i2 = C112539e.f336958e;
        return C112539e.f336955b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo159902c(long r5, wx3.C15601d<? super p560i2.C108330s> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p582k1.C108797b.C108800c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            k1.b$c r0 = (p582k1.C108797b.C108800c) r0
            int r1 = r0.f325797f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f325797f = r1
            goto L_0x0018
        L_0x0013:
            k1.b$c r0 = new k1.b$c
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f325795d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f325797f
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x003f
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r7)
            k1.a r7 = r4.f325790c
            if (r7 == 0) goto L_0x0044
            r0.f325797f = r3
            java.lang.Object r7 = r7.mo159899f(r5, r0)
            if (r7 != r1) goto L_0x003f
            return r1
        L_0x003f:
            i2.s r7 = (p560i2.C108330s) r7
            long r5 = r7.f324356a
            goto L_0x0048
        L_0x0044:
            int r5 = p560i2.C108330s.f324355c
            long r5 = p560i2.C108330s.f324354b
        L_0x0048:
            i2.s r7 = new i2.s
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p582k1.C108797b.mo159902c(long, wx3.d):java.lang.Object");
    }

    /* renamed from: d */
    public final C0000n0 mo159903d() {
        C0000n0 n0Var = (C0000n0) this.f325788a.invoke();
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
