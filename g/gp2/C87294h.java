package gp2;

import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import e42.C7594e;
import e42.C7596h;
import gy3.C87412m;
import hp2.C87577a;
import hp2.C87578b;
import org.json.JSONObject;
import te3.C49788i22;

/* renamed from: gp2.h */
public final class C87294h<T extends C7594e> extends C87578b<T> {

    /* renamed from: d */
    public final C87295a f253022d = new C87295a(this);

    /* renamed from: gp2.h$a */
    public static final class C87295a implements AdLandingPagesProxy.C94830p {

        /* renamed from: a */
        public final /* synthetic */ C87294h<T> f253023a;

        public C87295a(C87294h<T> hVar) {
            this.f253023a = hVar;
        }

        /* renamed from: a */
        public void mo10855a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiMakeSmartPhone$landingPagesProxyCallback$1");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiMakeSmartPhone$landingPagesProxyCallback$1");
        }

        /* renamed from: b */
        public void mo10856b(int i, int i2, Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiMakeSmartPhone$landingPagesProxyCallback$1");
            if (i == 0 && i2 == 0) {
                try {
                    C49788i22 i222 = new C49788i22();
                    C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.ByteArray");
                    i222.parseFrom((byte[]) obj);
                    AdLandingPagesProxy instance = AdLandingPagesProxy.getInstance();
                    T t = this.f253023a.f251227a;
                    instance.confirmDialPhoneNum(t != null ? t.mo8720e0() : null, i222.f135036d);
                    C87294h<T> hVar = this.f253023a;
                    C7596h i3 = hVar.mo120844i();
                    SnsMethodCalculate.markStartTimeMs("access$backToJs", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiMakeSmartPhone");
                    hVar.mo122027r(i3);
                    SnsMethodCalculate.markEndTimeMs("access$backToJs", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiMakeSmartPhone");
                } catch (Exception e) {
                    Log.m105920e("SnsAdMB", "there is an exception: " + e.getMessage());
                    C87294h<T> hVar2 = this.f253023a;
                    C7596h g = hVar2.mo120842g(10000, "there is an exception: " + e.getMessage());
                    SnsMethodCalculate.markStartTimeMs("access$backToJs", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiMakeSmartPhone");
                    hVar2.mo122027r(g);
                    SnsMethodCalculate.markEndTimeMs("access$backToJs", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiMakeSmartPhone");
                }
            } else {
                C87294h<T> hVar3 = this.f253023a;
                C7596h g2 = hVar3.mo120842g(10000, "the network is invalid");
                SnsMethodCalculate.markStartTimeMs("access$backToJs", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiMakeSmartPhone");
                hVar3.mo122027r(g2);
                SnsMethodCalculate.markEndTimeMs("access$backToJs", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiMakeSmartPhone");
            }
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiMakeSmartPhone$landingPagesProxyCallback$1");
        }
    }

    /* renamed from: e */
    public String mo16e() {
        SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiMakeSmartPhone");
        SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiMakeSmartPhone");
        return "makeSmartPhone";
    }

    /* renamed from: u */
    public void mo121696u(C87577a aVar, JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiMakeSmartPhone");
        C87412m.m108594g(aVar, "env");
        C87412m.m108594g(jSONObject, "data");
        long safeParseLong = Util.safeParseLong(aVar.mo122023b().mo140735b());
        String j = aVar.mo122023b().mo140743j();
        String l = aVar.mo122023b().mo140745l();
        String f = aVar.mo122023b().mo140739f();
        AdLandingPagesProxy.getInstance().doGetSmartPhoneScene(safeParseLong, jSONObject.optInt("compId"), j, l, jSONObject.optInt("sId"), f, this.f253022d);
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiMakeSmartPhone");
    }
}
