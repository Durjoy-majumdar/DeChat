package k42;

import com.tencent.p014mm.plugin.magicbrush.C85244b0;
import gy3.C87412m;
import h42.C87430a;

/* renamed from: k42.b */
public final class C88096b implements C87430a {

    /* renamed from: a */
    public final String f254798a;

    /* renamed from: b */
    public final C85244b0 f254799b;

    public C88096b(String str, C85244b0 b0Var) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(b0Var, "clientMgr");
        this.f254798a = str;
        this.f254799b = b0Var;
    }

    /* renamed from: a */
    public void mo121846a(String str) {
        C87412m.m108594g(str, "logStr");
        this.f254799b.mo118379LL(this.f254798a, str);
    }

    /* renamed from: b */
    public void mo121847b() {
        this.f254799b.mo118392yu(this.f254798a);
    }

    /* renamed from: c */
    public void mo121848c(int i, boolean z) {
        this.f254799b.mo118385Ym(this.f254798a, i, z);
    }

    /* renamed from: e */
    public void mo121849e(int i, String str) {
        C87412m.m108594g(str, "msg");
        this.f254799b.Tn0(this.f254798a, i, str);
    }

    /* renamed from: i */
    public void mo121850i(String str, String str2) {
        C87412m.m108594g(str, "envId");
        C87412m.m108594g(str2, "msg");
        this.f254799b.mo118380O(this.f254798a, str, str2);
    }

    /* renamed from: k */
    public void mo121851k(boolean z) {
        this.f254799b.mo118388hq(this.f254798a, z);
    }

    /* renamed from: n */
    public void mo121852n(int i, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        C87412m.m108594g(fArr, "left");
        C87412m.m108594g(fArr2, "top");
        C87412m.m108594g(fArr3, "width");
        C87412m.m108594g(fArr4, "height");
        this.f254799b.x90(this.f254798a, i, fArr, fArr2, fArr3, fArr4);
    }

    public void onCreated() {
        this.f254799b.mo118382TY(this.f254798a);
    }

    public void onDestroy() {
        this.f254799b.mo118381O3(this.f254798a);
    }

    /* renamed from: p */
    public void mo121855p(String str, String str2, int i) {
        C87412m.m108594g(str, "event");
        C87412m.m108594g(str2, "data");
        this.f254799b.p00(this.f254798a, str, str2, i);
    }

    /* renamed from: q */
    public void mo121856q(int i) {
        this.f254799b.mo118387gq(this.f254798a, i);
    }

    /* renamed from: s */
    public void mo121857s(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f254799b.mo118384WI(this.f254798a, i, i2, i3, i4, i5, i6);
    }

    /* renamed from: t */
    public void mo121858t(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f254799b.q80(this.f254798a, i, i2, i3, i4, i5, i6);
    }

    /* renamed from: u */
    public String mo121859u(String str, String str2) {
        C87412m.m108594g(str, "event");
        C87412m.m108594g(str2, "data");
        String fr02 = this.f254799b.fr0(this.f254798a, str, str2);
        C87412m.m108593f(fr02, "clientMgr.invokeSync(instanceName, event, data)");
        return fr02;
    }
}
