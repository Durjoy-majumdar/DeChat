package mo1;

import a14.C53895h;
import a14.C53934p0;
import android.app.Activity;
import androidx.lifecycle.C0125s;
import c30.C104289g;
import cm1.C0728e2;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.finder.view.C4207x4;
import com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import di0.C86299o;
import er1.C58719f2;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C50858pp0;
import te3.C64287ci1;
import te3.C64513l40;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: mo1.w1 */
public final class C61546w1 extends C87413o implements C32226l<C50858pp0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C61532u1 f174938d;

    /* renamed from: e */
    public final /* synthetic */ C0740i2 f174939e;

    /* renamed from: f */
    public final /* synthetic */ String f174940f;

    /* renamed from: g */
    public final /* synthetic */ String f174941g;

    /* renamed from: h */
    public final /* synthetic */ C64287ci1 f174942h;

    /* renamed from: i */
    public final /* synthetic */ C60905o f174943i;

    /* renamed from: j */
    public final /* synthetic */ String f174944j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61546w1(C61532u1 u1Var, C0740i2 i2Var, String str, String str2, C64287ci1 ci12, C60905o oVar, String str3) {
        super(1);
        this.f174938d = u1Var;
        this.f174939e = i2Var;
        this.f174940f = str;
        this.f174941g = str2;
        this.f174942h = ci12;
        this.f174943i = oVar;
        this.f174944j = str3;
    }

    public Object invoke(Object obj) {
        String str;
        C50858pp0 pp02 = (C50858pp0) obj;
        boolean z = (pp02 != null ? pp02.f139891f : 0) == 1 && (pp02 != null ? pp02.f139890e : 0) == 1;
        String str2 = "";
        if (z) {
            JSONObject jSONObject = new JSONObject();
            C64287ci1 ci12 = this.f174942h;
            String str3 = ci12.f182497f;
            if (str3 == null) {
                str3 = str2;
            }
            jSONObject.put("feedId", str3);
            String str4 = ci12.f182498g;
            if (str4 == null) {
                str4 = str2;
            }
            jSONObject.put("nonceId", str4);
            str = jSONObject.toString();
        } else {
            str = str2;
        }
        C87412m.m108593f(str, "if (showLiving) {\n      …                        }");
        String str5 = "profile_shop::" + this.f174938d.getUsername() + "::" + Util.getUuidRandom() + XVFSFile.PATH_SEPARATOR_CHAR + ((C0728e2) this.f174939e).f1742d.f183193x + XVFSFile.PATH_SEPARATOR_CHAR + str2;
        Log.m105924i(this.f174938d.f174905o, "feed.productInfo.product_path_cookie:" + ((C0728e2) this.f174939e).f1742d.f183163H);
        C86299o oVar = new C86299o();
        AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
        C0740i2 i2Var = this.f174939e;
        C104289g gVar = new C104289g();
        String str6 = ((C0728e2) i2Var).f1742d.f183163H;
        if (str6 == null) {
            str6 = str2;
        }
        gVar.put("cookies", str6);
        appBrandLaunchReferrer.f239396d = 1;
        appBrandLaunchReferrer.f239399g = gVar.toString();
        oVar.f250947s = appBrandLaunchReferrer;
        if (z) {
            oVar.f250926O = C4207x4.class;
            oVar.f250927P = str;
        }
        int intExtra = this.f174938d.getIntent().getIntExtra("report_scene", 0);
        String stringExtra = this.f174938d.getIntent().getStringExtra("from_user");
        String stringExtra2 = this.f174938d.getIntent().getStringExtra("key_from_user_name");
        if (intExtra == 1 || intExtra == 2) {
            WCPaySessionInfoRecorder.f210858a.mo99898a(this.f174940f, new WCPaySessionInfoRecorder.JsApiPayInfo(stringExtra, stringExtra2, 0, str2));
        } else if (intExtra == 3) {
            WCPaySessionInfoRecorder.f210858a.mo99898a(this.f174940f, new WCPaySessionInfoRecorder.JsApiPayInfo(stringExtra, str2));
        }
        Log.m105924i(this.f174938d.f174905o, "scene :" + intExtra + " fromUser:" + stringExtra + " fromUserName：" + stringExtra2);
        C58719f2 f2Var = C58719f2.f168110a;
        String username = this.f174938d.getUsername();
        if (username != null) {
            str2 = username;
        }
        f2Var.mo83629a(str2, this.f174941g, oVar);
        C64513l40 l402 = ((C0728e2) this.f174939e).f1742d.f183185p;
        boolean z2 = (l402 != null ? l402.f184036i : 1) == 1;
        C61532u1 u1Var = this.f174938d;
        String str7 = u1Var.f174905o;
        Activity context = u1Var.getContext();
        C53895h.m60466d(new LifecycleScope(str7, context instanceof C0125s ? (C0125s) context : null, 0, 4, (C8480h) null), (C66212f) null, (C53934p0) null, new C61545v1(this.f174938d, this.f174939e, this.f174943i, this.f174940f, this.f174944j, str5, this.f174941g, z2, oVar, (C15601d<? super C61545v1>) null), 3, (Object) null);
        return C13598b0.f38549a;
    }
}
