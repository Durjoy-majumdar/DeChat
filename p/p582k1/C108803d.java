package p582k1;

import a14.C0000n0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p1140p1.C110096b;
import p1140p1.C110098d;
import p1140p1.C110099e;
import p1140p1.C110100f;
import p1166z0.C112539e;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import p721v0.C65503j;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: k1.d */
public final class C108803d implements C110096b, C110098d<C108803d>, C108796a {

    /* renamed from: d */
    public final C108797b f325800d;

    /* renamed from: e */
    public final C108796a f325801e;

    /* renamed from: f */
    public final C60690y0 f325802f = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);

    /* renamed from: k1.d$a */
    public static final class C108804a extends C87413o implements C32224a<C0000n0> {

        /* renamed from: d */
        public final /* synthetic */ C108803d f325803d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108804a(C108803d dVar) {
            super(0);
            this.f325803d = dVar;
        }

        public Object invoke() {
            return this.f325803d.mo159904g();
        }
    }

    @C91590f(mo125468c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", mo125469f = "NestedScrollModifierLocal.kt", mo125470l = {94, 96}, mo125471m = "onPostFling-RZ2iAVY")
    /* renamed from: k1.d$b */
    public static final class C108805b extends C66704d {

        /* renamed from: d */
        public Object f325804d;

        /* renamed from: e */
        public long f325805e;

        /* renamed from: f */
        public long f325806f;

        /* renamed from: g */
        public /* synthetic */ Object f325807g;

        /* renamed from: h */
        public final /* synthetic */ C108803d f325808h;

        /* renamed from: i */
        public int f325809i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108805b(C108803d dVar, C15601d<? super C108805b> dVar2) {
            super(dVar2);
            this.f325808h = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f325807g = obj;
            this.f325809i |= Integer.MIN_VALUE;
            return this.f325808h.mo159897d(0, 0, this);
        }
    }

    @C91590f(mo125468c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", mo125469f = "NestedScrollModifierLocal.kt", mo125470l = {88, 89}, mo125471m = "onPreFling-QWom1Mo")
    /* renamed from: k1.d$c */
    public static final class C108806c extends C66704d {

        /* renamed from: d */
        public Object f325810d;

        /* renamed from: e */
        public long f325811e;

        /* renamed from: f */
        public /* synthetic */ Object f325812f;

        /* renamed from: g */
        public final /* synthetic */ C108803d f325813g;

        /* renamed from: h */
        public int f325814h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108806c(C108803d dVar, C15601d<? super C108806c> dVar2) {
            super(dVar2);
            this.f325813g = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f325812f = obj;
            this.f325814h |= Integer.MIN_VALUE;
            return this.f325813g.mo159899f(0, this);
        }
    }

    public C108803d(C108797b bVar, C108796a aVar) {
        C87412m.m108594g(bVar, "dispatcher");
        C87412m.m108594g(aVar, "connection");
        this.f325800d = bVar;
        this.f325801e = aVar;
        bVar.f325788a = new C108804a(this);
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: U */
    public void mo145808U(C110099e eVar) {
        C87412m.m108594g(eVar, "scope");
        ((C108494d2) this.f325802f).setValue((C108803d) eVar.mo161499a(C108807e.f325815a));
        this.f325800d.f325790c = mo159905h();
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: b */
    public long mo159896b(long j, long j2, int i) {
        long j3;
        long b = this.f325801e.mo159896b(j, j2, i);
        C108803d h = mo159905h();
        if (h != null) {
            j3 = h.mo159896b(C112539e.m153742g(j, b), C112539e.m153741f(j2, b), i);
        } else {
            int i2 = C112539e.f336958e;
            j3 = C112539e.f336955b;
        }
        return C112539e.m153742g(b, j3);
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo159897d(long r16, long r18, wx3.C15601d<? super p560i2.C108330s> r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof p582k1.C108803d.C108805b
            if (r2 == 0) goto L_0x0016
            r2 = r1
            k1.d$b r2 = (p582k1.C108803d.C108805b) r2
            int r3 = r2.f325809i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.f325809i = r3
            goto L_0x001b
        L_0x0016:
            k1.d$b r2 = new k1.d$b
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.f325807g
            xx3.a r9 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r2.f325809i
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 == r4) goto L_0x0037
            if (r3 != r10) goto L_0x002f
            long r2 = r2.f325805e
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0088
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            long r3 = r2.f325806f
            long r5 = r2.f325805e
            java.lang.Object r7 = r2.f325804d
            k1.d r7 = (p582k1.C108803d) r7
            kotlin.ResultKt.throwOnFailure(r1)
            r13 = r3
            r11 = r5
            goto L_0x0063
        L_0x0045:
            kotlin.ResultKt.throwOnFailure(r1)
            k1.a r3 = r0.f325801e
            r2.f325804d = r0
            r11 = r16
            r2.f325805e = r11
            r13 = r18
            r2.f325806f = r13
            r2.f325809i = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.mo159897d(r4, r6, r8)
            if (r1 != r9) goto L_0x0062
            return r9
        L_0x0062:
            r7 = r0
        L_0x0063:
            i2.s r1 = (p560i2.C108330s) r1
            long r4 = r1.f324356a
            k1.d r3 = r7.mo159905h()
            if (r3 == 0) goto L_0x008e
            long r6 = p560i2.C108330s.m146749e(r11, r4)
            long r11 = p560i2.C108330s.m146748d(r13, r4)
            r1 = 0
            r2.f325804d = r1
            r2.f325805e = r4
            r2.f325809i = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.mo159897d(r4, r6, r8)
            if (r1 != r9) goto L_0x0087
            return r9
        L_0x0087:
            r2 = r13
        L_0x0088:
            i2.s r1 = (p560i2.C108330s) r1
            long r4 = r1.f324356a
            r13 = r2
            goto L_0x0093
        L_0x008e:
            r13 = r4
            int r1 = p560i2.C108330s.f324355c
            long r4 = p560i2.C108330s.f324354b
        L_0x0093:
            long r1 = p560i2.C108330s.m146749e(r13, r4)
            i2.s r3 = new i2.s
            r3.<init>(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p582k1.C108803d.mo159897d(long, long, wx3.d):java.lang.Object");
    }

    /* renamed from: e */
    public long mo159898e(long j, int i) {
        long j2;
        C108803d h = mo159905h();
        if (h != null) {
            j2 = h.mo159898e(j, i);
        } else {
            int i2 = C112539e.f336958e;
            j2 = C112539e.f336955b;
        }
        return C112539e.m153742g(j2, this.f325801e.mo159898e(C112539e.m153741f(j, j2), i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo159899f(long r9, wx3.C15601d<? super p560i2.C108330s> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p582k1.C108803d.C108806c
            if (r0 == 0) goto L_0x0013
            r0 = r11
            k1.d$c r0 = (p582k1.C108803d.C108806c) r0
            int r1 = r0.f325814h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f325814h = r1
            goto L_0x0018
        L_0x0013:
            k1.d$c r0 = new k1.d$c
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f325812f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f325814h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            long r9 = r0.f325811e
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0076
        L_0x002c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0034:
            long r9 = r0.f325811e
            java.lang.Object r2 = r0.f325810d
            k1.d r2 = (p582k1.C108803d) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0055
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r11)
            k1.d r11 = r8.mo159905h()
            if (r11 == 0) goto L_0x005a
            r0.f325810d = r8
            r0.f325811e = r9
            r0.f325814h = r4
            java.lang.Object r11 = r11.mo159899f(r9, r0)
            if (r11 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r2 = r8
        L_0x0055:
            i2.s r11 = (p560i2.C108330s) r11
            long r4 = r11.f324356a
            goto L_0x005f
        L_0x005a:
            int r11 = p560i2.C108330s.f324355c
            long r4 = p560i2.C108330s.f324354b
            r2 = r8
        L_0x005f:
            r6 = r9
            r9 = r4
            r4 = r6
            k1.a r11 = r2.f325801e
            long r4 = p560i2.C108330s.m146748d(r4, r9)
            r2 = 0
            r0.f325810d = r2
            r0.f325811e = r9
            r0.f325814h = r3
            java.lang.Object r11 = r11.mo159899f(r4, r0)
            if (r11 != r1) goto L_0x0076
            return r1
        L_0x0076:
            i2.s r11 = (p560i2.C108330s) r11
            long r0 = r11.f324356a
            long r9 = p560i2.C108330s.m146749e(r9, r0)
            i2.s r11 = new i2.s
            r11.<init>(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p582k1.C108803d.mo159899f(long, wx3.d):java.lang.Object");
    }

    /* renamed from: g */
    public final C0000n0 mo159904g() {
        C0000n0 n0Var;
        C108803d h = mo159905h();
        if ((h != null && (n0Var = h.mo159904g()) != null) || (n0Var = this.f325800d.f325789b) != null) {
            return n0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public C110100f<C108803d> getKey() {
        return C108807e.f325815a;
    }

    public Object getValue() {
        return this;
    }

    /* renamed from: h */
    public final C108803d mo159905h() {
        return (C108803d) this.f325802f.getValue();
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }
}
