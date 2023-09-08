package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import ke3.C88144b;
import org.json.JSONObject;
import qo3.C101218e0;
import rs1.C13442s8;
import te3.C49712hj1;
import te3.C51824we3;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.finder.view.s3 */
public final class C4171s3 implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C4179t3 f18416a;

    /* renamed from: b */
    public final /* synthetic */ Context f18417b;

    public C4171s3(C4179t3 t3Var, Context context) {
        this.f18416a = t3Var;
        this.f18417b = context;
    }

    /* renamed from: a */
    public final void mo2001a() {
        Class cls = C58417y0.class;
        C4179t3 t3Var = this.f18416a;
        if (t3Var.f18435h) {
            C51824we3 we32 = t3Var.f18434g;
            C49712hj1 hj12 = null;
            if (we32 != null) {
                if (!(we32.f143998f == 0 || we32.f143999g == 0 || we32.f144000h == 1)) {
                    C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
                    C13442s8.C13443a aVar = C13442s8.f38060Q0;
                    Context context = t3Var.getContext();
                    C87412m.m108593f(context, "context");
                    C13442s8 f = aVar.mo12873f(context);
                    y0Var.Cx0(0, "poi_channelclaim_submitbutton", "", f != null ? f.mo12861q3() : null);
                }
                Intent intent = new Intent();
                intent.putExtra("rawUrl", we32.f144001i);
                C88144b.m109791i(t3Var.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
            C101218e0 e0Var = t3Var.f18433f;
            if (e0Var != null) {
                e0Var.mo140680z();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("click_option", "nextstep");
                C58417y0 y0Var2 = (C58417y0) C86312j.m106911c(cls);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "kvJson.toString()");
                String n = C112551y.m153814n(jSONObject2, ",", ";", false);
                C13442s8 f2 = C13442s8.f38060Q0.mo12873f(this.f18417b);
                if (f2 != null) {
                    hj12 = f2.mo12861q3();
                }
                y0Var2.Cx0(1, "poi_channelclaim_page", n, hj12);
                return;
            }
            C87412m.m108603p("bottomDialog");
            throw null;
        }
    }
}
