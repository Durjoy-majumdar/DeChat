package ne1;

import com.tencent.p014mm.plugin.finder.service.C3603n1;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.Log;
import ei3.C86522b;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8794p5;
import java.lang.ref.WeakReference;
import je1.C60815y3;
import o40.C61926c;
import ob0.C89137b0;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C26236u;
import te3.C50401mh0;
import te3.C64707sc1;

@C86522b
/* renamed from: ne1.p0 */
public final class C61678p0 extends C61685z0<C64707sc1> implements C3603n1 {

    /* renamed from: e */
    public final String f175372e = "Finder.FinderModifyBlackListService";

    /* renamed from: ne1.p0$a */
    public static final class C61679a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C61679a f175373d = new C61679a();

        public C61679a() {
            super(0);
        }

        public Object invoke() {
            C5139t.m5183e(5, 20);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: BI */
    public void mo3967BI(String str, String str2, boolean z, C8794p5<C64707sc1> p5Var) {
        C87412m.m108594g(str, "anchorUsername");
        C87412m.m108594g(str2, "username");
        String str3 = this.f175372e;
        Log.m105924i(str3, "modifyLiveBlackList anchorUsername:" + str + ", username:" + str2);
        C64707sc1 sc12 = new C64707sc1();
        sc12.f185407g = str2;
        if (z) {
            sc12.f185404d = 1;
        } else {
            sc12.f185404d = 2;
        }
        synchronized (this.f175382d) {
            C50401mh0 mh02 = new C50401mh0();
            mh02.f138028d = xx0();
            mh02.f138029e = vx0(sc12);
            this.f175382d.put(sc12, new WeakReference(p5Var));
            C89137b0 d = C86709a0.m107524d();
            C60815y3 y3Var = new C60815y3(str, C26236u.m33719b(mh02), false, 0, (String) null, 24, (C8480h) null);
            y3Var.f173212o = false;
            d.mo123460f(y3Var);
        }
    }

    /* renamed from: QI */
    public void mo3968QI(long j, long j2, String str, boolean z, C8794p5<C64707sc1> p5Var) {
        C87412m.m108594g(str, "feedNonceId");
        C64707sc1 sc12 = new C64707sc1();
        sc12.f185411n = j;
        sc12.f185405e = j2;
        sc12.f185409i = str;
        if (z) {
            sc12.f185404d = 1;
        } else {
            sc12.f185404d = 2;
        }
        C61685z0.Ax0(this, sc12, p5Var, false, false, 12, (Object) null);
    }

    /* renamed from: Xt */
    public void mo3969Xt(String str, boolean z, C8794p5<C64707sc1> p5Var) {
        C87412m.m108594g(str, "fansId");
        C64707sc1 sc12 = new C64707sc1();
        sc12.f185408h = str;
        if (z) {
            sc12.f185404d = 1;
        } else {
            sc12.f185404d = 2;
        }
        C61685z0.Ax0(this, sc12, p5Var, false, false, 12, (Object) null);
        C61926c.m72668M(C61679a.f175373d);
    }

    public void st0(String str, boolean z, C8794p5<C64707sc1> p5Var) {
        C87412m.m108594g(str, "sessionId");
        C64707sc1 sc12 = new C64707sc1();
        sc12.f185412o = str;
        if (z) {
            sc12.f185404d = 1;
        } else {
            sc12.f185404d = 2;
        }
        C61685z0.Ax0(this, sc12, p5Var, false, false, 12, (Object) null);
    }

    public void vv0(long j, long j2, String str, boolean z, C8794p5<C64707sc1> p5Var) {
        C87412m.m108594g(str, "feedNonceId");
        C64707sc1 sc12 = new C64707sc1();
        sc12.f185406f = j;
        sc12.f185405e = j2;
        sc12.f185409i = str;
        if (z) {
            sc12.f185404d = 1;
        } else {
            sc12.f185404d = 2;
        }
        C61685z0.Ax0(this, sc12, p5Var, false, false, 12, (Object) null);
    }

    public C89349b vx0(Object obj) {
        C64707sc1 sc12 = (C64707sc1) obj;
        C87412m.m108594g(sc12, "cmdBufItem");
        return C89349b.m111674a(sc12.toByteArray());
    }

    public int xx0() {
        return 3;
    }

    /* renamed from: yZ */
    public void mo3972yZ(String str, boolean z, C8794p5<C64707sc1> p5Var) {
        C87412m.m108594g(str, "username");
        C64707sc1 sc12 = new C64707sc1();
        sc12.f185407g = str;
        if (z) {
            sc12.f185404d = 1;
        } else {
            sc12.f185404d = 2;
        }
        C61685z0.Ax0(this, sc12, p5Var, false, false, 12, (Object) null);
    }

    public String yx0() {
        return this.f175372e;
    }

    public void zx0(Object obj, int i) {
        C87412m.m108594g((C64707sc1) obj, "cmdBufItem");
    }
}
