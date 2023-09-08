package ay0;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.p471ui.MpWebViewController;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d93.C45298c;
import g93.C32355a;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import ob0.C47350c;
import pe3.C47465a;
import sf0.C48374j0;
import t83.C13851h1;
import t83.C48590l;
import te3.C52018xt1;

/* renamed from: ay0.j */
public final class C39655j implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ MpWebViewController f106414a;

    /* renamed from: b */
    public final /* synthetic */ String f106415b;

    /* renamed from: c */
    public final /* synthetic */ C13851h1 f106416c;

    public C39655j(MpWebViewController mpWebViewController, String str, C13851h1 h1Var) {
        this.f106414a = mpWebViewController;
        this.f106415b = str;
        this.f106416c = h1Var;
    }

    /* renamed from: a */
    public final void mo288a(int i, int i2, String str, C47350c cVar) {
        this.f106414a.f109598W1.remove(this.f106415b);
        C47465a aVar = cVar.f127056b.f127083a;
        if (aVar instanceof C52018xt1) {
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetA8KeyResp");
            C52018xt1 xt12 = (C52018xt1) aVar;
            if (Util.isNullOrNil(xt12.f144941d)) {
                Log.m105920e(this.f106414a.mo63662A1(), "updatePageAuth fail fullurl is null");
                C32355a.m39689a(82);
                C48590l g0 = this.f106414a.mo67720g0();
                if (g0 != null) {
                    String str2 = this.f106416c.f38990c;
                    g0.mo10774a(str2, this.f106416c.f38996i + ":fail", (Map<String, Object>) null);
                }
            } else if (i == 0 && i2 == 0) {
                try {
                    this.f106414a.f117539M.mo70864g(xt12.f144941d, new JsapiPermissionWrapper(C48374j0.m53715d(xt12.f144956v)), new GeneralControlWrapper(xt12.f144947j));
                    MpWebViewController mpWebViewController = this.f106414a;
                    String str3 = this.f106415b;
                    String str4 = xt12.f144941d;
                    C87412m.m108593f(str4, "resp.FullURL");
                    mpWebViewController.mo63672J1(str3, str4, C45298c.m50183f(xt12.f144958x));
                    C32355a.m39691c(109);
                    HashMap hashMap = new HashMap();
                    String str5 = xt12.f144941d;
                    C87412m.m108593f(str5, "resp.FullURL");
                    hashMap.put("fullUrl", str5);
                    Log.m105925i(this.f106414a.mo63662A1(), "updatePageAuth values:%s", hashMap);
                    C32355a.m39689a(81);
                    C48590l g05 = this.f106414a.mo67720g0();
                    if (g05 != null) {
                        String str6 = this.f106416c.f38990c;
                        g05.mo10774a(str6, this.f106416c.f38996i + ":ok", hashMap);
                    }
                } catch (Exception unused) {
                    C32355a.m39689a(82);
                    C48590l g06 = this.f106414a.mo67720g0();
                    if (g06 != null) {
                        String str7 = this.f106416c.f38990c;
                        g06.mo10774a(str7, this.f106416c.f38996i + ":fail", (Map<String, Object>) null);
                    }
                }
            } else {
                C32355a.m39689a(82);
                C48590l g07 = this.f106414a.mo67720g0();
                if (g07 != null) {
                    String str8 = this.f106416c.f38990c;
                    g07.mo10774a(str8, this.f106416c.f38996i + ":fail", (Map<String, Object>) null);
                }
            }
        }
    }
}
