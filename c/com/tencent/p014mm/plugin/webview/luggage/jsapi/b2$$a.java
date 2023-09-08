package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import nj3.C11182m0;
import nj3.C76874e0;
import org.json.JSONArray;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.b2$$a */
public final /* synthetic */ class b2$$a implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C5883b2 f22092d;

    /* renamed from: e */
    public final /* synthetic */ JSONArray f22093e;

    /* renamed from: f */
    public final /* synthetic */ Context f22094f;

    public /* synthetic */ b2$$a(C5883b2 b2Var, JSONArray jSONArray, Context context) {
        this.f22092d = b2Var;
        this.f22093e = jSONArray;
        this.f22094f = context;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        this.f22092d.mo6922g(this.f22093e, e0Var, this.f22094f);
    }
}
