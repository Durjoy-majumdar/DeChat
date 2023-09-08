package gp2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import e42.C7594e;
import gy3.C87412m;
import hp2.C87577a;
import hp2.C87578b;
import ip2.C87788c;
import java.util.Arrays;
import org.json.JSONObject;
import vr2.C102236a0;

/* renamed from: gp2.l */
public final class C87300l<T extends C7594e> extends C87578b<T> {
    /* renamed from: e */
    public String mo16e() {
        SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenHalfWeApp");
        SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenHalfWeApp");
        return "openHalfWeApp";
    }

    /* renamed from: u */
    public void mo121696u(C87577a aVar, JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenHalfWeApp");
        C87412m.m108594g(aVar, "env");
        C87412m.m108594g(jSONObject, "data");
        String optString = jSONObject.optString("weappUserName");
        String optString2 = jSONObject.optString("weappPath");
        String optString3 = jSONObject.optString("id");
        String valueOf = String.valueOf(System.currentTimeMillis() / ((long) 1000));
        int c = aVar.mo122023b().mo140736c();
        String a = C87788c.m109226a(aVar.mo122023b());
        String format = String.format("%s:%s:%s:%s:%d:%s:%s:%d", Arrays.copyOf(new Object[]{"", "", optString3, valueOf, Integer.valueOf(c), a, aVar.mo122023b().mo140740g(), Integer.valueOf(aVar.mo122023b().mo140742i())}, 8));
        C87412m.m108593f(format, "format(format, *args)");
        C102236a0.m134757m0(aVar.mo122022a(), optString, optString2, "", aVar.mo122023b().mo140735b(), aVar.mo122023b().mo140743j(), format, a, 1200);
        mo122027r(mo120844i());
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenHalfWeApp");
    }
}
