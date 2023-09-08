package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C11184p0;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.u0 */
public class C82768u0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ JsApiChooseMedia.ChooseRequest f242101d;

    /* renamed from: e */
    public final /* synthetic */ C82381f f242102e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f242103f;

    /* renamed from: g */
    public final /* synthetic */ int f242104g;

    /* renamed from: h */
    public final /* synthetic */ JsApiChooseMedia f242105h;

    public C82768u0(JsApiChooseMedia jsApiChooseMedia, JsApiChooseMedia.ChooseRequest chooseRequest, C82381f fVar, JSONObject jSONObject, int i) {
        this.f242105h = jsApiChooseMedia;
        this.f242101d = chooseRequest;
        this.f242102e = fVar;
        this.f242103f = jSONObject;
        this.f242104g = i;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            this.f242101d.f241849e = false;
            Log.m105924i("MicroMsg.JsApiChooseMedia", "reset toAlbum to false");
            this.f242105h.mo114945w(this.f242102e, this.f242103f, this.f242104g, this.f242101d);
        } else if (itemId == 2) {
            this.f242101d.f241850f = false;
            Log.m105924i("MicroMsg.JsApiChooseMedia", "reset toCamera to false");
            this.f242105h.mo114945w(this.f242102e, this.f242103f, this.f242104g, this.f242101d);
        }
    }
}
