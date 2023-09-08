package com.tencent.p014mm.plugin.appbrand.jsapi.webview;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.page.C83977y2;
import gy3.C87412m;
import jk0.C87979e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webview.s */
public class C83120s extends C87979e<C83928t1> {
    public static final int CTRL_INDEX = 299;
    public static final String NAME = "removeHTMLWebView";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("htmlId");
    }

    /* renamed from: D */
    public boolean mo110323D(C82520h hVar, int i, View view, JSONObject jSONObject) {
        C83928t1 t1Var = (C83928t1) hVar;
        ((C40478h) view).destroy();
        C87412m.m108594g(t1Var, "page");
        t1Var.mo116272g0(new C83977y2(t1Var, (C40478h) null));
        return true;
    }
}
