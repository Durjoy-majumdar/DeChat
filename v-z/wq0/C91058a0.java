package wq0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import org.json.JSONObject;
import p329d3.C86165a;

/* renamed from: wq0.a0 */
public final class C91058a0<T> implements C86165a {

    /* renamed from: a */
    public final /* synthetic */ C82381f.C82383b f261229a;

    /* renamed from: b */
    public final /* synthetic */ C82870p f261230b;

    /* renamed from: c */
    public final /* synthetic */ C82554k f261231c;

    public C91058a0(C82381f.C82383b bVar, C82870p pVar, C82554k kVar) {
        this.f261229a = bVar;
        this.f261230b = pVar;
        this.f261231c = kVar;
    }

    public void accept(Object obj) {
        WeChatBrands.Business.AvailabilityAlertSupplier availabilityAlertSupplier = (WeChatBrands.Business.AvailabilityAlertSupplier) obj;
        C82381f.C82383b bVar = this.f261229a;
        if (bVar != null) {
            C82870p pVar = this.f261230b;
            pVar.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 700001, "fail limited use");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errno", 700001);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            bVar.mo114785a(pVar.mo115115p("fail limited use", jSONObject));
        }
        C82554k kVar = this.f261231c;
        kVar.mo109673t(new C91093z(kVar, availabilityAlertSupplier));
    }
}
