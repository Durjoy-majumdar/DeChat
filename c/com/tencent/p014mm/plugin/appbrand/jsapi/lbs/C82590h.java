package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import gy3.C87412m;
import ke3.C88144b;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.h */
public final class C82590h extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 938;
    public static final String NAME = "choosePoi";

    /* renamed from: g */
    public final int f241717g = C87687a.m109085a(C87687a.f253966a);

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        if (i2Var != null) {
            Activity o0 = i2Var.mo114344o0();
            C87412m.m108593f(o0, "env.getPageContext()");
            C89916g.m112446a(o0).mo124232f(new C82589g(this, i2Var, i));
            C88144b.m109795m(o0, "nearlife", ".ui.CheckInLifeUI", new Intent(), this.f241717g);
        }
    }
}
