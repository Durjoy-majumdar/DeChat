package t51;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import p821rk.C48041n;
import p821rk.C48043p;
import r51.C110502a;
import uc0.C111156r;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: t51.w */
public final class C110935w extends C39622i0 {

    /* renamed from: d */
    public final String f331783d;

    /* renamed from: e */
    public final String f331784e;

    /* renamed from: f */
    public String f331785f;

    /* renamed from: g */
    public String f331786g;

    /* renamed from: h */
    public final C0000n0 f331787h;

    /* renamed from: i */
    public final C54219z<Boolean> f331788i;

    /* renamed from: j */
    public final C54219z<C110502a> f331789j = new C54219z<>();

    /* renamed from: n */
    public final C54219z<String> f331790n;

    /* renamed from: o */
    public final C54219z<Object> f331791o;

    /* renamed from: p */
    public final C54219z<Object> f331792p;

    /* renamed from: q */
    public final C54219z<C48041n> f331793q;

    /* renamed from: r */
    public final C54219z<C111156r> f331794r;

    /* renamed from: s */
    public final C54219z<Boolean> f331795s;

    /* renamed from: t */
    public final long f331796t;

    public C110935w(String str, String str2, String str3, String str4, String str5) {
        C87412m.m108594g(str, "eggName");
        C87412m.m108594g(str2, "keyword");
        this.f331783d = str;
        this.f331784e = str2;
        this.f331785f = str3;
        this.f331786g = str4;
        C0000n0 b = C53930o0.m60555b();
        this.f331787h = b;
        C54219z<Boolean> zVar = new C54219z<>();
        this.f331788i = zVar;
        C54219z<String> zVar2 = new C54219z<>();
        this.f331790n = zVar2;
        this.f331791o = new C54219z<>();
        this.f331792p = new C54219z<>();
        this.f331793q = new C54219z<>();
        this.f331794r = new C54219z<>();
        this.f331795s = new C54219z<>();
        this.f331796t = Util.nowMilliSecond();
        zVar2.setValue(str5);
        zVar.setValue(Boolean.TRUE);
        C53895h.m60466d(b, (C66212f) null, (C53934p0) null, new C110931t(this, (C15601d<? super C110931t>) null), 3, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b2, code lost:
        r13 = r13.f128882d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m151221c3(t51.C110935w r12, wx3.C15601d r13) {
        /*
            r12.getClass()
            r51.a r0 = r51.C110502a.FatalError
            boolean r1 = r13 instanceof t51.C110933u
            if (r1 == 0) goto L_0x0018
            r1 = r13
            t51.u r1 = (t51.C110933u) r1
            int r2 = r1.f331780g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.f331780g = r2
            goto L_0x001d
        L_0x0018:
            t51.u r1 = new t51.u
            r1.<init>(r12, r13)
        L_0x001d:
            java.lang.Object r13 = r1.f331778e
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r1.f331780g
            r4 = 0
            java.lang.String r5 = "MicroMsg.SpringLuckyEggViewModel"
            r6 = 1
            if (r3 == 0) goto L_0x003b
            if (r3 != r6) goto L_0x0033
            java.lang.Object r12 = r1.f331777d
            t51.w r12 = (t51.C110935w) r12
            kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ a -> 0x0114, z2 -> 0x00f3 }
            goto L_0x0051
        L_0x0033:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r13)
            r7 = 5000(0x1388, double:2.4703E-320)
            t51.v r13 = new t51.v     // Catch:{ a -> 0x0114, z2 -> 0x00f3 }
            r13.<init>(r12, r4)     // Catch:{ a -> 0x0114, z2 -> 0x00f3 }
            r1.f331777d = r12     // Catch:{ a -> 0x0114, z2 -> 0x00f3 }
            r1.f331780g = r6     // Catch:{ a -> 0x0114, z2 -> 0x00f3 }
            java.lang.Object r13 = a14.C53860b3.m60374b(r7, r13, r1)     // Catch:{ a -> 0x0114, z2 -> 0x00f3 }
            if (r13 != r2) goto L_0x0051
            goto L_0x0134
        L_0x0051:
            rk.h r13 = (p821rk.C48035h) r13     // Catch:{ a -> 0x0114, z2 -> 0x00f3 }
            java.lang.String r0 = r13.f128843d
            r12.f331786g = r0
            rk.n r13 = r13.f128844e
            androidx.lifecycle.z<rk.n> r0 = r12.f331793q
            r0.setValue(r13)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "got material success, type="
            r0.append(r1)
            int r1 = r13.f128862d
            r0.append(r1)
            java.lang.String r1 = ", traceId="
            r0.append(r1)
            java.lang.String r1 = r12.f331786g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            androidx.lifecycle.z<java.lang.Object> r0 = r12.f331791o
            int r1 = r13.f128871p
            rk.p r2 = r13.f128872q
            java.lang.String r3 = "material.link_page"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.Object r1 = r12.mo162612d3(r1, r2)
            r0.setValue(r1)
            androidx.lifecycle.z<java.lang.Object> r0 = r12.f331792p
            int r1 = r13.f128868j
            rk.p r2 = r13.f128869n
            java.lang.String r3 = "material.button_page"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.Object r1 = r12.mo162612d3(r1, r2)
            r0.setValue(r1)
            r0 = 0
            int r1 = r13.f128862d
            r2 = 6
            if (r1 != r2) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r6 = 0
        L_0x00aa:
            if (r6 == 0) goto L_0x00e9
            long r0 = r13.f128876u
            rk.o r13 = r13.f128877v
            if (r13 == 0) goto L_0x00b9
            rk.q r13 = r13.f128882d
            if (r13 == 0) goto L_0x00b9
            java.lang.String r13 = r13.f128889d
            goto L_0x00ba
        L_0x00b9:
            r13 = r4
        L_0x00ba:
            if (r13 != 0) goto L_0x00be
            java.lang.String r13 = ""
        L_0x00be:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "accept materialId="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ", amount="
            r2.append(r3)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
            a14.n0 r6 = r12.f331787h
            t51.s r9 = new t51.s
            r9.<init>(r0, r12, r4)
            r7 = 0
            r8 = 0
            r10 = 3
            r11 = 0
            a14.C53895h.m60466d(r6, r7, r8, r9, r10, r11)
            goto L_0x00f0
        L_0x00e9:
            androidx.lifecycle.z<java.lang.Boolean> r12 = r12.f331788i
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            r12.setValue(r13)
        L_0x00f0:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0134
        L_0x00f3:
            r13 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Timeout to fetch material: "
            r1.append(r2)
            java.lang.String r13 = r13.getMessage()
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r13)
            androidx.lifecycle.z<r51.a> r12 = r12.f331789j
            r12.setValue(r0)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0134
        L_0x0114:
            r13 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to fetch material: "
            r1.append(r2)
            java.lang.String r13 = r13.getMessage()
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r13)
            androidx.lifecycle.z<r51.a> r12 = r12.f331789j
            r12.setValue(r0)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0134:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t51.C110935w.m151221c3(t51.w, wx3.d):java.lang.Object");
    }

    /* renamed from: d3 */
    public final Object mo162612d3(int i, C48043p pVar) {
        switch (i) {
            case 1:
                return pVar.f128883d;
            case 2:
                return pVar.f128884e;
            case 3:
                return pVar.f128885f;
            case 4:
            case 5:
                return pVar.f128886g;
            case 7:
                return pVar.f128887h;
            case 8:
                return pVar.f128888i;
            default:
                return null;
        }
    }

    public void onCleared() {
        super.onCleared();
        Log.m105924i("MicroMsg.SpringLuckyEggViewModel", "onCleared()");
        C53930o0.m60558e(this.f331787h, (CancellationException) null, 1, (Object) null);
    }
}
