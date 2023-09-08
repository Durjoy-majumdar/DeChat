package com.tencent.p014mm.plugin.appbrand.debugger;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kr0.C88267e;
import org.json.JSONObject;
import te3.hw4;
import te3.ow4;

@Deprecated
/* renamed from: com.tencent.mm.plugin.appbrand.debugger.e0 */
public final class C81731e0 extends C88267e implements C81740p {

    /* renamed from: V */
    public C81743t f239852V;

    /* renamed from: W */
    public C81745v f239853W;

    /* renamed from: I */
    public void mo114091I(String str) {
        Log.m105918d("MicroMsg.RemoteDebugService", "RemoteDebugInfo");
        ow4 ow4 = new ow4();
        ow4.f184718e = getRuntime().mo113212m1().getCurrentPage().getCurrentPageView().getComponentId();
        ow4.f184717d = str;
        this.f239853W.f239914h.mo114052h(C81738h0.m100298d(ow4, this.f239852V, "domEvent"));
    }

    /* renamed from: J */
    public C83165i mo114092J() {
        C81745v vVar = new C81745v();
        this.f239853W = vVar;
        return vVar;
    }

    /* renamed from: Q */
    public String mo114093Q() {
        JSONObject k0 = mo114340k0();
        return String.format("var __wxConfig = %s;\nvar __wxIndexPage = \"%s\"", new Object[]{k0.toString(), getRuntime().mo113008F().f239599G});
    }

    /* renamed from: a */
    public void mo109647a(int i, String str) {
        if (Util.isNullOrNil(str)) {
            str = "{}";
        }
        C81695a0 a0Var = this.f239853W.f239914h;
        a0Var.getClass();
        hw4 hw4 = new hw4();
        hw4.f183563e = i;
        hw4.f183562d = str;
        a0Var.mo114052h(C81738h0.m100298d(hw4, a0Var.f239778b, "callInterfaceResult"));
    }

    /* renamed from: g */
    public boolean mo114094g(String str) {
        return false;
    }

    /* renamed from: x0 */
    public void mo114095x0() {
        mo114336g0();
    }

    /* renamed from: z0 */
    public void mo114096z0(AppBrandRuntime appBrandRuntime) {
        super.mo114096z0(appBrandRuntime);
        mo114842M();
        C81743t tVar = new C81743t();
        this.f239852V = tVar;
        tVar.mo114110b(this, getRuntime().mo113210l1().f234797A);
        this.f239853W.mo114117x(this.f239852V);
    }
}
