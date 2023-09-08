package np1;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener;
import di0.C86299o;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import kr0.C76630x0;
import ok1.C62042e;
import wi0.C66117m;

/* renamed from: np1.a0 */
public final class C61851a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C61853b0 f175866d;

    /* renamed from: e */
    public final /* synthetic */ String f175867e;

    /* renamed from: f */
    public final /* synthetic */ String f175868f;

    /* renamed from: g */
    public final /* synthetic */ String f175869g;

    /* renamed from: h */
    public final /* synthetic */ int f175870h;

    /* renamed from: i */
    public final /* synthetic */ boolean f175871i;

    /* renamed from: j */
    public final /* synthetic */ HalfScreenConfig.CustomSubjectInfo f175872j;

    public C61851a0(C61853b0 b0Var, String str, String str2, String str3, int i, boolean z, HalfScreenConfig.CustomSubjectInfo customSubjectInfo) {
        this.f175866d = b0Var;
        this.f175867e = str;
        this.f175868f = str2;
        this.f175869g = str3;
        this.f175870h = i;
        this.f175871i = z;
        this.f175872j = customSubjectInfo;
    }

    public final void run() {
        C86299o oVar = new C86299o();
        String str = this.f175867e;
        String str2 = this.f175868f;
        String str3 = this.f175869g;
        int i = this.f175870h;
        boolean z = this.f175871i;
        HalfScreenConfig.CustomSubjectInfo customSubjectInfo = this.f175872j;
        C61853b0 b0Var = this.f175866d;
        oVar.f250930b = str;
        oVar.f250934f = str2;
        oVar.f250939k = C62042e.f176370a.mo87027N0() ? 1176 : 1177;
        oVar.f250940l = str3;
        oVar.f250912A = new HalfScreenConfig(true, 0, i == 0 ? HalfScreenConfig.C55451a.POPUP : HalfScreenConfig.C55451a.SLIDE, false, (HalfScreenConfig.BackgroundShapeConfig) null, false, (HalfScreenConfig.CloseWhenClickEmptyAreaConfig) null, z ? HalfScreenConfig.C55453c.SINGLE_CLOSE : HalfScreenConfig.C55453c.HIDE, false, z, (WeAppHalfScreenStatusChangeListener) null, (HalfScreenConfig.C55456f) null, false, false, (C66117m) null, false, (HalfScreenConfig.ShareActionConfig) null, 0, 0, 0, false, false, false, (HalfScreenConfig.C55455e) null, false, customSubjectInfo, 0, false, false, 0, false, false, false, -33555078, 1, (C8480h) null);
        C61853b0 b0Var2 = b0Var;
        Context context = b0Var2.f175874a;
        C87412m.m108593f(str, "appId");
        oVar.f250943o = new C61853b0(context, str, b0Var2.f175876c, b0Var2.f175877d);
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(this.f175866d.f175874a, oVar);
    }
}
