package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import o40.C61926c;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.i3 */
public final class C81931i3 extends C82268c<C83928t1> {
    @Deprecated
    public static final int CTRL_INDEX = -2;
    @Deprecated
    public static final String NAME = "highlightTitleForSinglePage";

    /* renamed from: g */
    public boolean f240304g;

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C83928t1 t1Var = (C83928t1) fVar;
        if (t1Var != null && t1Var.f245025i1 != null) {
            Log.m105924i("MicroMsg.JsApiHighlightTitleForSinglePage", NAME);
            C61926c.m72668M(new C81900h3(this, t1Var));
            t1Var.mo109647a(i, mo115109j("ok"));
        }
    }
}
