package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import nj3.C11184p0;
import org.json.JSONException;
import org.json.JSONObject;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.b2$$b */
public final /* synthetic */ class b2$$b implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C5883b2 f22095d;

    /* renamed from: e */
    public final /* synthetic */ C43620m2.C5947b f22096e;

    /* renamed from: f */
    public final /* synthetic */ C77407n f22097f;

    public /* synthetic */ b2$$b(C5883b2 b2Var, C43620m2.C5947b bVar, C77407n nVar) {
        this.f22095d = b2Var;
        this.f22096e = bVar;
        this.f22097f = nVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C5883b2 b2Var = this.f22095d;
        C43620m2.C5947b bVar = this.f22096e;
        C77407n nVar = this.f22097f;
        b2Var.getClass();
        int itemId = menuItem.getItemId();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", itemId - 1000);
        } catch (JSONException unused) {
        }
        bVar.mo6946b("onShareCustomMenuItemClick", jSONObject);
        bVar.mo6945a((String) null, (JSONObject) null);
        nVar.mo107572p();
    }
}
