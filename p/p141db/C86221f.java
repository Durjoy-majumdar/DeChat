package p141db;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82446i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p547hb.C87464c;

/* renamed from: db.f */
public class C86221f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f250814d;

    /* renamed from: e */
    public final /* synthetic */ int f250815e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f250816f;

    /* renamed from: g */
    public final /* synthetic */ C86222g f250817g;

    public C86221f(C86222g gVar, C81925i2 i2Var, int i, JSONObject jSONObject) {
        this.f250817g = gVar;
        this.f250814d = i2Var;
        this.f250815e = i;
        this.f250816f = jSONObject;
    }

    public void run() {
        if (!this.f250814d.isRunning()) {
            Log.m105928w("MicroMsg.WAGameJsApiCanvasToTempFilePath", "invoke JsApi insertView failed, current page view is null.");
            this.f250814d.mo109647a(this.f250815e, this.f250817g.mo115109j("fail"));
            return;
        }
        C83780d1 l0 = this.f250814d.mo114341l0();
        if (((C87464c) l0.mo116150E0(C87464c.class)) == null) {
            this.f250814d.mo109647a(this.f250815e, this.f250817g.mo115109j("fail"));
            return;
        }
        C82446i w = C86222g.m106822w(l0, this.f250816f, false);
        this.f250814d.mo109647a(this.f250815e, this.f250817g.mo115112m(w.f242317b, w.f242316a));
    }
}
