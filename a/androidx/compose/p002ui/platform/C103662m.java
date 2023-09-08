package androidx.compose.p002ui.platform;

import android.graphics.Region;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import c14.C54614c;
import c14.C54624g;
import c14.C54625h;
import c14.C54629k;
import com.tencent.p014mm.C0966R;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p1042u.C111060j;
import p1042u.C90590d;
import p1108f3.C107457e;
import p246u1.C111063a;
import p246u1.C111073i;
import p246u1.C111074j;
import p246u1.C111075k;
import p246u1.C111076l;
import p246u1.C111078m;
import p246u1.C111079n;
import p246u1.C111087s;
import p246u1.C111090t;
import p246u1.C111091u;
import p246u1.C111092v;
import p246u1.C111096z;
import p436a1.C103250n0;
import p658q1.C110301j;
import p721v0.C111306l;
import p735w1.C111703v;
import p735w1.C37958a;
import p735w1.C38006x;
import p849e3.C107166a;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36903g0;

/* renamed from: androidx.compose.ui.platform.m */
public final class C103662m extends C107166a {

    /* renamed from: D */
    public static final int[] f306155D = {C0966R.C0970id.f5311bn, C0966R.C0970id.f5312bo, C0966R.C0970id.f5323bz, C0966R.C0970id.f5334c_, C0966R.C0970id.f5337cc, C0966R.C0970id.f5338cd, C0966R.C0970id.f5339ce, C0966R.C0970id.f5340cf, C0966R.C0970id.f5341cg, C0966R.C0970id.f5342ch, C0966R.C0970id.f5313bp, C0966R.C0970id.f5314bq, C0966R.C0970id.f5315br, C0966R.C0970id.f5316bs, C0966R.C0970id.f5317bt, C0966R.C0970id.f5318bu, C0966R.C0970id.f5319bv, C0966R.C0970id.f5320bw, C0966R.C0970id.f5321bx, C0966R.C0970id.f5322by, C0966R.C0970id.f5324c0, C0966R.C0970id.f5325c1, C0966R.C0970id.f5326c2, C0966R.C0970id.f5327c3, C0966R.C0970id.f5328c4, C0966R.C0970id.f5329c5, C0966R.C0970id.f5330c6, C0966R.C0970id.f5331c7, C0966R.C0970id.f5332c8, C0966R.C0970id.f5333c9, C0966R.C0970id.f5335ca, C0966R.C0970id.f5336cb};

    /* renamed from: A */
    public final Runnable f306156A;

    /* renamed from: B */
    public final List<C103690u1> f306157B;

    /* renamed from: C */
    public final C32226l<C103690u1, C13598b0> f306158C;

    /* renamed from: e */
    public final AndroidComposeView f306159e;

    /* renamed from: f */
    public int f306160f = Integer.MIN_VALUE;

    /* renamed from: g */
    public final AccessibilityManager f306161g;

    /* renamed from: h */
    public final Handler f306162h;

    /* renamed from: i */
    public C107457e f306163i;

    /* renamed from: j */
    public int f306164j;

    /* renamed from: n */
    public C111060j<C111060j<CharSequence>> f306165n;

    /* renamed from: o */
    public C111060j<Map<CharSequence, Integer>> f306166o;

    /* renamed from: p */
    public int f306167p;

    /* renamed from: q */
    public Integer f306168q;

    /* renamed from: r */
    public final C90590d<C110301j> f306169r;

    /* renamed from: s */
    public final C54625h<C13598b0> f306170s;

    /* renamed from: t */
    public boolean f306171t;

    /* renamed from: u */
    public m$$f f306172u;

    /* renamed from: v */
    public Map<Integer, C103703v1> f306173v;

    /* renamed from: w */
    public C90590d<Integer> f306174w;

    /* renamed from: x */
    public Map<Integer, m$$g> f306175x;

    /* renamed from: y */
    public m$$g f306176y;

    /* renamed from: z */
    public boolean f306177z;

    public C103662m(AndroidComposeView androidComposeView) {
        C87412m.m108594g(androidComposeView, "view");
        this.f306159e = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        if (systemService != null) {
            this.f306161g = (AccessibilityManager) systemService;
            this.f306162h = new Handler(Looper.getMainLooper());
            this.f306163i = new C107457e(new m$$e(this));
            this.f306164j = Integer.MIN_VALUE;
            this.f306165n = new C111060j<>();
            this.f306166o = new C111060j<>();
            this.f306167p = -1;
            this.f306169r = new C90590d<>();
            this.f306170s = C54629k.m61479a(-1, (C54624g) null, (C32226l) null, 6, (Object) null);
            this.f306171t = true;
            C36903g0 g0Var = C36903g0.f97931d;
            this.f306173v = g0Var;
            this.f306174w = new C90590d<>();
            this.f306175x = new LinkedHashMap();
            this.f306176y = new m$$g(androidComposeView.getSemanticsOwner().mo162843a(), g0Var);
            androidComposeView.addOnAttachStateChangeListener(new m$$b(this));
            this.f306156A = new m$$a(this);
            this.f306157B = new ArrayList();
            this.f306158C = new m$$i(this);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
    }

    /* renamed from: l */
    public static final boolean m137843l(C111073i iVar, float f) {
        return (f < 0.0f && iVar.f332605a.invoke().floatValue() > 0.0f) || (f > 0.0f && iVar.f332605a.invoke().floatValue() < iVar.f332606b.invoke().floatValue());
    }

    /* renamed from: m */
    public static final float m137844m(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    /* renamed from: n */
    public static final boolean m137845n(C111073i iVar) {
        return (iVar.f332605a.invoke().floatValue() > 0.0f && !iVar.f332607c) || (iVar.f332605a.invoke().floatValue() < iVar.f332606b.invoke().floatValue() && iVar.f332607c);
    }

    /* renamed from: o */
    public static final boolean m137846o(C111073i iVar) {
        return (iVar.f332605a.invoke().floatValue() < iVar.f332606b.invoke().floatValue() && !iVar.f332607c) || (iVar.f332605a.invoke().floatValue() > 0.0f && iVar.f332607c);
    }

    /* renamed from: s */
    public static /* synthetic */ boolean m137847s(C103662m mVar, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return mVar.mo144789r(i, i2, num, list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0076 A[Catch:{ all -> 0x0050 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0077 A[Catch:{ all -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083 A[Catch:{ all -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo144775a(wx3.C15601d<? super rx3.C13598b0> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.compose.p002ui.platform.m$$h
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.ui.platform.m$$h r0 = (androidx.compose.p002ui.platform.m$$h) r0
            int r1 = r0.f306194i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f306194i = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.m$$h r0 = new androidx.compose.ui.platform.m$$h
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f306192g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f306194i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r2 = r0.f306191f
            c14.j r2 = (c14.C54628j) r2
            java.lang.Object r5 = r0.f306190e
            u.d r5 = (p1042u.C90590d) r5
            java.lang.Object r6 = r0.f306189d
            androidx.compose.ui.platform.m r6 = (androidx.compose.p002ui.platform.C103662m) r6
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ all -> 0x0050 }
        L_0x0035:
            r11 = r5
            r5 = r2
            goto L_0x0068
        L_0x0038:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0040:
            java.lang.Object r2 = r0.f306191f
            c14.j r2 = (c14.C54628j) r2
            java.lang.Object r5 = r0.f306190e
            u.d r5 = (p1042u.C90590d) r5
            java.lang.Object r6 = r0.f306189d
            androidx.compose.ui.platform.m r6 = (androidx.compose.p002ui.platform.C103662m) r6
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ all -> 0x0050 }
            goto L_0x007b
        L_0x0050:
            r11 = move-exception
            goto L_0x00d4
        L_0x0053:
            kotlin.ResultKt.throwOnFailure(r11)
            u.d r11 = new u.d     // Catch:{ all -> 0x00d2 }
            r11.<init>()     // Catch:{ all -> 0x00d2 }
            c14.h<rx3.b0> r2 = r10.f306170s     // Catch:{ all -> 0x00d2 }
            c14.a r2 = (c14.C54602a) r2     // Catch:{ all -> 0x00d2 }
            r2.getClass()     // Catch:{ all -> 0x00d2 }
            c14.a$a r5 = new c14.a$a     // Catch:{ all -> 0x00d2 }
            r5.<init>(r2)     // Catch:{ all -> 0x00d2 }
            r6 = r10
        L_0x0068:
            r0.f306189d = r6     // Catch:{ all -> 0x0050 }
            r0.f306190e = r11     // Catch:{ all -> 0x0050 }
            r0.f306191f = r5     // Catch:{ all -> 0x0050 }
            r0.f306194i = r4     // Catch:{ all -> 0x0050 }
            java.lang.Object r2 = r5.mo75523a(r0)     // Catch:{ all -> 0x0050 }
            if (r2 != r1) goto L_0x0077
            return r1
        L_0x0077:
            r9 = r5
            r5 = r11
            r11 = r2
            r2 = r9
        L_0x007b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x0050 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0050 }
            if (r11 == 0) goto L_0x00ca
            r2.next()     // Catch:{ all -> 0x0050 }
            boolean r11 = r6.mo144785j()     // Catch:{ all -> 0x0050 }
            if (r11 == 0) goto L_0x00b4
            r11 = 0
            u.d<q1.j> r7 = r6.f306169r     // Catch:{ all -> 0x0050 }
            int r7 = r7.f260295f     // Catch:{ all -> 0x0050 }
        L_0x0091:
            if (r11 >= r7) goto L_0x00a4
            u.d<q1.j> r8 = r6.f306169r     // Catch:{ all -> 0x0050 }
            java.lang.Object[] r8 = r8.f260294e     // Catch:{ all -> 0x0050 }
            r8 = r8[r11]     // Catch:{ all -> 0x0050 }
            gy3.C87412m.m108591d(r8)     // Catch:{ all -> 0x0050 }
            q1.j r8 = (p658q1.C110301j) r8     // Catch:{ all -> 0x0050 }
            r6.mo144794w(r8, r5)     // Catch:{ all -> 0x0050 }
            int r11 = r11 + 1
            goto L_0x0091
        L_0x00a4:
            r5.clear()     // Catch:{ all -> 0x0050 }
            boolean r11 = r6.f306177z     // Catch:{ all -> 0x0050 }
            if (r11 != 0) goto L_0x00b4
            r6.f306177z = r4     // Catch:{ all -> 0x0050 }
            android.os.Handler r11 = r6.f306162h     // Catch:{ all -> 0x0050 }
            java.lang.Runnable r7 = r6.f306156A     // Catch:{ all -> 0x0050 }
            r11.post(r7)     // Catch:{ all -> 0x0050 }
        L_0x00b4:
            u.d<q1.j> r11 = r6.f306169r     // Catch:{ all -> 0x0050 }
            r11.clear()     // Catch:{ all -> 0x0050 }
            r7 = 100
            r0.f306189d = r6     // Catch:{ all -> 0x0050 }
            r0.f306190e = r5     // Catch:{ all -> 0x0050 }
            r0.f306191f = r2     // Catch:{ all -> 0x0050 }
            r0.f306194i = r3     // Catch:{ all -> 0x0050 }
            java.lang.Object r11 = a14.C53965x0.m60607b(r7, r0)     // Catch:{ all -> 0x0050 }
            if (r11 != r1) goto L_0x0035
            return r1
        L_0x00ca:
            u.d<q1.j> r11 = r6.f306169r
            r11.clear()
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        L_0x00d2:
            r11 = move-exception
            r6 = r10
        L_0x00d4:
            u.d<q1.j> r0 = r6.f306169r
            r0.clear()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.C103662m.mo144775a(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00da A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo144776b(boolean r10, int r11, long r12) {
        /*
            r9 = this;
            java.util.Map r0 = r9.mo144781g()
            java.util.Collection r0 = r0.values()
            java.lang.String r1 = "currentSemanticsNodes"
            gy3.C87412m.m108594g(r0, r1)
            long r1 = p1166z0.C112539e.f336957d
            boolean r1 = p1166z0.C112539e.m153736a(r12, r1)
            r2 = 0
            if (r1 != 0) goto L_0x00ee
            float r1 = p1166z0.C112539e.m153738c(r12)
            boolean r1 = java.lang.Float.isNaN(r1)
            r3 = 1
            if (r1 != 0) goto L_0x002d
            float r1 = p1166z0.C112539e.m153739d(r12)
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x002d
            r1 = 1
            goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            if (r1 == 0) goto L_0x00e2
            if (r10 != r3) goto L_0x0035
            u1.z<u1.i> r10 = p246u1.C111092v.f332659n
            goto L_0x0039
        L_0x0035:
            if (r10 != 0) goto L_0x00dc
            u1.z<u1.i> r10 = p246u1.C111092v.f332658m
        L_0x0039:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0041
            goto L_0x00ee
        L_0x0041:
            java.util.Iterator r0 = r0.iterator()
        L_0x0045:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00ee
            java.lang.Object r1 = r0.next()
            androidx.compose.ui.platform.v1 r1 = (androidx.compose.p002ui.platform.C103703v1) r1
            android.graphics.Rect r4 = r1.f306290b
            java.lang.String r5 = "<this>"
            gy3.C87412m.m108594g(r4, r5)
            int r5 = r4.left
            float r5 = (float) r5
            int r6 = r4.top
            float r6 = (float) r6
            int r7 = r4.right
            float r7 = (float) r7
            int r4 = r4.bottom
            float r4 = (float) r4
            float r8 = p1166z0.C112539e.m153738c(r12)
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0086
            float r5 = p1166z0.C112539e.m153738c(r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x0086
            float r5 = p1166z0.C112539e.m153739d(r12)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0086
            float r5 = p1166z0.C112539e.m153739d(r12)
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0086
            r4 = 1
            goto L_0x0087
        L_0x0086:
            r4 = 0
        L_0x0087:
            if (r4 != 0) goto L_0x008a
            goto L_0x00d7
        L_0x008a:
            u1.s r1 = r1.f306289a
            u1.k r1 = r1.mo162837f()
            java.lang.Object r1 = p246u1.C111076l.m151465a(r1, r10)
            u1.i r1 = (p246u1.C111073i) r1
            if (r1 != 0) goto L_0x0099
            goto L_0x00d7
        L_0x0099:
            boolean r4 = r1.f332607c
            if (r4 == 0) goto L_0x009f
            int r5 = -r11
            goto L_0x00a0
        L_0x009f:
            r5 = r11
        L_0x00a0:
            if (r11 != 0) goto L_0x00a5
            if (r4 == 0) goto L_0x00a5
            r5 = -1
        L_0x00a5:
            if (r5 >= 0) goto L_0x00b9
            fy3.a<java.lang.Float> r1 = r1.f332605a
            java.lang.Object r1 = r1.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x00d7
            goto L_0x00d5
        L_0x00b9:
            fy3.a<java.lang.Float> r4 = r1.f332605a
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            fy3.a<java.lang.Float> r1 = r1.f332606b
            java.lang.Object r1 = r1.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x00d7
        L_0x00d5:
            r1 = 1
            goto L_0x00d8
        L_0x00d7:
            r1 = 0
        L_0x00d8:
            if (r1 == 0) goto L_0x0045
            r2 = 1
            goto L_0x00ee
        L_0x00dc:
            rx3.j r10 = new rx3.j
            r10.<init>()
            throw r10
        L_0x00e2:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Offset argument contained a NaN value."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00ee:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.C103662m.mo144776b(boolean, int, long):boolean");
    }

    /* renamed from: c */
    public final AccessibilityEvent mo144777c(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C87412m.m108593f(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.f306159e.getContext().getPackageName());
        obtain.setSource(this.f306159e, i);
        C103703v1 v1Var = mo144781g().get(Integer.valueOf(i));
        if (v1Var != null) {
            obtain.setPassword(v1Var.f306289a.mo162837f().mo162823i(C111092v.f332669x));
        }
        return obtain;
    }

    /* renamed from: d */
    public final AccessibilityEvent mo144778d(int i, Integer num, Integer num2, Integer num3, String str) {
        AccessibilityEvent c = mo144777c(i, 8192);
        if (num != null) {
            c.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            c.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            c.setItemCount(num3.intValue());
        }
        if (str != null) {
            c.getText().add(str);
        }
        return c;
    }

    /* renamed from: e */
    public final int mo144779e(C111087s sVar) {
        C111075k kVar = sVar.f332640e;
        C111096z<List<String>> zVar = C111092v.f332646a;
        if (!kVar.mo162823i(C111092v.f332646a)) {
            C111075k kVar2 = sVar.f332640e;
            C111096z zVar2 = C111092v.f332665t;
            if (kVar2.mo162823i(zVar2)) {
                return C38006x.m41695c(((C38006x) sVar.f332640e.mo162825k(zVar2)).f100500a);
            }
        }
        return this.f306167p;
    }

    /* renamed from: f */
    public final int mo144780f(C111087s sVar) {
        C111075k kVar = sVar.f332640e;
        C111096z<List<String>> zVar = C111092v.f332646a;
        if (!kVar.mo162823i(C111092v.f332646a)) {
            C111075k kVar2 = sVar.f332640e;
            C111096z zVar2 = C111092v.f332665t;
            if (kVar2.mo162823i(zVar2)) {
                return (int) (((C38006x) sVar.f332640e.mo162825k(zVar2)).f100500a >> 32);
            }
        }
        return this.f306167p;
    }

    /* renamed from: g */
    public final Map<Integer, C103703v1> mo144781g() {
        if (this.f306171t) {
            C111091u semanticsOwner = this.f306159e.getSemanticsOwner();
            C87412m.m108594g(semanticsOwner, "<this>");
            C111087s a = semanticsOwner.mo162843a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C110301j jVar = a.f332642g;
            if (jVar.f329887A && jVar.mo161701A()) {
                Region region = new Region();
                region.set(C103250n0.m136707a(a.mo162835d()));
                C103678q.m137970e(region, a, linkedHashMap, a);
            }
            this.f306173v = linkedHashMap;
            this.f306171t = false;
        }
        return this.f306173v;
    }

    public C107457e getAccessibilityNodeProvider(View view) {
        C87412m.m108594g(view, "host");
        return this.f306163i;
    }

    /* renamed from: h */
    public final String mo144783h(C111087s sVar) {
        C37958a aVar;
        if (sVar == null) {
            return null;
        }
        C111075k kVar = sVar.f332640e;
        C111096z<List<String>> zVar = C111092v.f332646a;
        C111096z zVar2 = C111092v.f332646a;
        if (kVar.mo162823i(zVar2)) {
            return C111306l.m151789a((List) sVar.f332640e.mo162825k(zVar2), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        }
        if (C103678q.m137971f(sVar)) {
            C37958a i = mo144784i(sVar.f332640e);
            if (i != null) {
                return i.f100413d;
            }
            return null;
        }
        List list = (List) C111076l.m151465a(sVar.f332640e, C111092v.f332663r);
        if (list == null || (aVar = (C37958a) C110818d0.m150916N(list)) == null) {
            return null;
        }
        return aVar.f100413d;
    }

    /* renamed from: i */
    public final C37958a mo144784i(C111075k kVar) {
        C111096z<List<String>> zVar = C111092v.f332646a;
        return (C37958a) C111076l.m151465a(kVar, C111092v.f332664s);
    }

    /* renamed from: j */
    public final boolean mo144785j() {
        return this.f306161g.isEnabled() && this.f306161g.isTouchExplorationEnabled();
    }

    /* renamed from: k */
    public final void mo144786k(C110301j jVar) {
        if (this.f306169r.add(jVar)) {
            ((C54614c) this.f306170s).mo75539t(C13598b0.f38549a);
        }
    }

    /* renamed from: p */
    public final int mo144787p(int i) {
        if (i == this.f306159e.getSemanticsOwner().mo162843a().f332641f) {
            return -1;
        }
        return i;
    }

    /* renamed from: q */
    public final boolean mo144788q(AccessibilityEvent accessibilityEvent) {
        if (!mo144785j()) {
            return false;
        }
        return this.f306159e.getParent().requestSendAccessibilityEvent(this.f306159e, accessibilityEvent);
    }

    /* renamed from: r */
    public final boolean mo144789r(int i, int i2, Integer num, List<String> list) {
        if (i == Integer.MIN_VALUE || !mo144785j()) {
            return false;
        }
        AccessibilityEvent c = mo144777c(i, i2);
        if (num != null) {
            c.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            c.setContentDescription(C111306l.m151789a(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
        }
        return mo144788q(c);
    }

    /* renamed from: t */
    public final void mo144790t(int i, int i2, String str) {
        AccessibilityEvent c = mo144777c(mo144787p(i), 32);
        c.setContentChangeTypes(i2);
        if (str != null) {
            c.getText().add(str);
        }
        mo144788q(c);
    }

    /* renamed from: u */
    public final void mo144791u(int i) {
        m$$f m__f = this.f306172u;
        if (m__f != null) {
            if (i == m__f.f306181a.f332641f) {
                if (SystemClock.uptimeMillis() - m__f.f306186f <= 1000) {
                    AccessibilityEvent c = mo144777c(mo144787p(m__f.f306181a.f332641f), 131072);
                    c.setFromIndex(m__f.f306184d);
                    c.setToIndex(m__f.f306185e);
                    c.setAction(m__f.f306182b);
                    c.setMovementGranularity(m__f.f306183c);
                    c.getText().add(mo144783h(m__f.f306181a));
                    mo144788q(c);
                }
            } else {
                return;
            }
        }
        this.f306172u = null;
    }

    public final void updateHoveredVirtualView(int i) {
        int i2 = this.f306160f;
        if (i2 != i) {
            this.f306160f = i;
            m137847s(this, i, 128, (Integer) null, (List) null, 12, (Object) null);
            m137847s(this, i2, 256, (Integer) null, (List) null, 12, (Object) null);
        }
    }

    /* renamed from: v */
    public final void mo144793v(C111087s sVar, m$$g m__g) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<C111087s> h = sVar.mo162839h();
        int size = h.size();
        for (int i = 0; i < size; i++) {
            C111087s sVar2 = h.get(i);
            if (mo144781g().containsKey(Integer.valueOf(sVar2.f332641f))) {
                if (!m__g.f306188b.contains(Integer.valueOf(sVar2.f332641f))) {
                    mo144786k(sVar.f332642g);
                    return;
                }
                linkedHashSet.add(Integer.valueOf(sVar2.f332641f));
            }
        }
        for (Integer intValue : m__g.f306188b) {
            if (!linkedHashSet.contains(Integer.valueOf(intValue.intValue()))) {
                mo144786k(sVar.f332642g);
                return;
            }
        }
        List<C111087s> h2 = sVar.mo162839h();
        int size2 = h2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C111087s sVar3 = h2.get(i2);
            if (mo144781g().containsKey(Integer.valueOf(sVar3.f332641f))) {
                Object obj = ((LinkedHashMap) this.f306175x).get(Integer.valueOf(sVar3.f332641f));
                C87412m.m108591d(obj);
                mo144793v(sVar3, (m$$g) obj);
            }
        }
    }

    /* renamed from: w */
    public final void mo144794w(C110301j jVar, C90590d<Integer> dVar) {
        C110301j d;
        C111078m d2;
        if (jVar.mo161701A() && !this.f306159e.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(jVar)) {
            C111078m d3 = C111090t.m151491d(jVar);
            if (d3 == null) {
                C110301j d4 = C103678q.m137969d(jVar, m$$k.f306197d);
                d3 = d4 != null ? C111090t.m151491d(d4) : null;
                if (d3 == null) {
                    return;
                }
            }
            if (!(d3.mo162827c().f332625e || (d = C103678q.m137969d(jVar, m$$j.f306196d)) == null || (d2 = C111090t.m151491d(d)) == null)) {
                d3 = d2;
            }
            int id = ((C111079n) d3.f329962e).getId();
            if (dVar.add(Integer.valueOf(id))) {
                m137847s(this, mo144787p(id), 2048, 1, (List) null, 8, (Object) null);
            }
        }
    }

    /* renamed from: x */
    public final boolean mo144795x(C111087s sVar, int i, int i2, boolean z) {
        String h;
        C111075k kVar = sVar.f332640e;
        C111096z<C111063a<C32226l<List<C111703v>, Boolean>>> zVar = C111074j.f332608a;
        C111096z zVar2 = C111074j.f332614g;
        boolean z2 = false;
        if (kVar.mo162823i(zVar2) && C103678q.m137966a(sVar)) {
            C32228q qVar = (C32228q) ((C111063a) sVar.f332640e.mo162825k(zVar2)).f332591b;
            if (qVar != null) {
                return ((Boolean) qVar.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
            return false;
        } else if ((i == i2 && i2 == this.f306167p) || (h = mo144783h(sVar)) == null) {
            return false;
        } else {
            if (i < 0 || i != i2 || i2 > h.length()) {
                i = -1;
            }
            this.f306167p = i;
            if (h.length() > 0) {
                z2 = true;
            }
            int p = mo144787p(sVar.f332641f);
            Integer num = null;
            Integer valueOf = z2 ? Integer.valueOf(this.f306167p) : null;
            Integer valueOf2 = z2 ? Integer.valueOf(this.f306167p) : null;
            if (z2) {
                num = Integer.valueOf(h.length());
            }
            mo144788q(mo144778d(p, valueOf, valueOf2, num, h));
            mo144791u(sVar.f332641f);
            return true;
        }
    }

    /* renamed from: y */
    public final <T extends CharSequence> T mo144796y(T t, int i) {
        boolean z = true;
        if (i > 0) {
            if (!(t == null || t.length() == 0)) {
                z = false;
            }
            if (z || t.length() <= i) {
                return t;
            }
            int i2 = i - 1;
            if (Character.isHighSurrogate(t.charAt(i2)) && Character.isLowSurrogate(t.charAt(i))) {
                i = i2;
            }
            return t.subSequence(0, i);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
