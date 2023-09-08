package gp2;

import android.app.Activity;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import e42.C7594e;
import gy3.C87412m;
import hp2.C87577a;
import hp2.C87578b;
import java.util.Map;
import lo2.C88616u0;
import org.json.JSONObject;
import qs2.C101271i0;
import z04.C112551y;

/* renamed from: gp2.n */
public final class C87302n<T extends C7594e> extends C87578b<T> {
    /* renamed from: e */
    public String mo16e() {
        SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenScanner");
        SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenScanner");
        return "openScanner";
    }

    /* renamed from: u */
    public void mo121696u(C87577a aVar, JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenScanner");
        C87412m.m108594g(aVar, "env");
        C87412m.m108594g(jSONObject, "data");
        Activity a = aVar.mo122022a();
        if (!(a instanceof SnsAdNativeLandingPagesUI)) {
            mo122027r(mo120842g(10000, "the activity is not ad landing page"));
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenScanner");
            return;
        }
        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (SnsAdNativeLandingPagesUI) a;
        snsAdNativeLandingPagesUI.getClass();
        SnsMethodCalculate.markStartTimeMs("getAdXmlValues", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        Map<String, String> map = snsAdNativeLandingPagesUI.f277585i1;
        SnsMethodCalculate.markEndTimeMs("getAdXmlValues", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        ADXml.C85461b a2 = map != null ? ADXml.C85461b.m105464a(map, ".adxml.adScanInfo") : null;
        if (a2 == null) {
            mo122027r(mo120842g(10000, "the scan info doesn't exist"));
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenScanner");
            return;
        }
        C101271i0 b = aVar.mo122023b();
        String k = b.mo140744k();
        String l = k == null || C112551y.m153811k(k) ? b.mo140745l() : b.mo140744k();
        if (l == null) {
            mo122027r(mo120842g(10000, "the ux info doesn't exist"));
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenScanner");
            return;
        }
        C88616u0.m110482a(a, a2, l, 8);
        mo122027r(mo120844i());
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenScanner");
    }
}
