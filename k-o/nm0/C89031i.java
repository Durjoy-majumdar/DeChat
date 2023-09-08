package nm0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.C84116i0;
import com.tencent.p014mm.plugin.appbrand.report.C84134l0;
import com.tencent.p014mm.plugin.appbrand.report.model.C84153l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;
import p1044ub.C90630c;
import p963fc.C86812g;
import te3.j55;

/* renamed from: nm0.i */
public class C89031i extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 108;
    public static final String NAME = "reportRealtimeAction";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        try {
            mo123393w((C86812g) kVar.getRuntime(), kVar instanceof C90630c ? (C90630c) kVar : (C90630c) ((C81925i2) kVar).mo114342m0(C90630c.class), jSONObject);
            kVar.mo109647a(i, mo115109j("ok"));
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiReportRealtimeAction", "report by service(%s), e = %s", kVar.getAppId(), e);
            kVar.mo109647a(i, mo115109j("fail:internal error"));
        }
    }

    /* renamed from: w */
    public final void mo123393w(C86812g gVar, C90630c cVar, JSONObject jSONObject) {
        String optString = jSONObject.optString("actionData");
        j55 j55 = new j55();
        j55.f259611d = 2;
        j55.f259612e = gVar.f238147j;
        j55.f259614g = 0;
        j55.f259615h = (int) Util.nowSecond();
        j55.f259616i = 0;
        j55.f259617j = optString;
        j55.f259618n = gVar.mo113051d0().f261072r.f238585d + 1;
        j55.f259620p = C84116i0.m103659b(MMApplicationContext.getContext());
        j55.f259619o = gVar.mo113036W().f234837q;
        AppBrandStatObject n1 = gVar.mo121253n1();
        j55.f259621q = n1.f245533f;
        j55.f259623s = n1.f245534g;
        j55.f259625u = n1.f245531d;
        j55.f259626v = n1.f245532e;
        j55.f259622r = n1.f245535h;
        C84153l l = gVar.mo113042Z().getReporter().mo115894l();
        C84153l.C84155b o = cVar != null ? l.mo116807o(cVar) : l.peek();
        String str = o.f245690b;
        j55.f259613f = str;
        C84153l.C84156c cVar2 = o.f245692d;
        j55.f259624t = cVar2 == null ? null : cVar2.f245693a;
        j55.f259627w = l.mo116806i(str) ? 1 : 0;
        Log.m105925i("MicroMsg.JsApiReportRealtimeAction", "report(%s), path %s, appState %d, sessionId %s, scene %d, sceneNote %s, preScene %d, preSceneNote %s, usedState %d, referPath %s, isEntrance %d", gVar.f238147j, j55.f259613f, Integer.valueOf(j55.f259618n), j55.f259619o, Integer.valueOf(j55.f259621q), j55.f259623s, Integer.valueOf(j55.f259625u), j55.f259626v, Integer.valueOf(j55.f259622r), j55.f259624t, Integer.valueOf(j55.f259627w));
        C84134l0.C84135a.f245612a.invoke().mo116790a(j55);
    }
}
