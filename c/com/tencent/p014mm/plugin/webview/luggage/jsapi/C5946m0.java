package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.modeltools.C6085v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.CookieManager;
import com.tencent.xweb.XWebSdk;
import ke3.C88144b;
import kg3.C76577a;
import lg3.C88494d;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.m0 */
public class C5946m0 implements C1256g<Bundle> {

    /* renamed from: d */
    public final /* synthetic */ C53096b.C53097a f22178d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f22179e;

    /* renamed from: f */
    public final /* synthetic */ C5941l0 f22180f;

    public C5946m0(C5941l0 l0Var, C53096b.C53097a aVar, JSONObject jSONObject) {
        this.f22180f = l0Var;
        this.f22178d = aVar;
        this.f22179e = jSONObject;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        String[] strArr;
        String str;
        JSONObject optJSONObject;
        Bundle bundle = (Bundle) obj;
        String string = bundle.getString("nowUrl");
        String[] stringArray = bundle.getStringArray("urlList");
        if (stringArray == null || stringArray.length == 0) {
            Log.m105920e("MicroMsg.JsApiImagePreview", "fail, urls is null");
            this.f22178d.mo73778c("invalid_url", (JSONObject) null);
            return;
        }
        Intent intent = new Intent();
        String cookie = CookieManager.getInstance().getCookie(((C43658n) this.f22178d.f148189a).mo67943v());
        if (!Util.isNullOrNil(cookie)) {
            intent.putExtra("cookie", cookie);
        }
        JSONObject optJSONObject2 = this.f22179e.optJSONObject("currentInfo");
        C5941l0 l0Var = this.f22180f;
        C53096b.C53097a aVar = this.f22178d;
        l0Var.getClass();
        float f = C88494d.m110349f();
        if (((C43658n) aVar.f148189a).f117947q.isXWalkKernel() && XWebSdk.getUsingCustomContext()) {
            f = ((C43658n) aVar.f148189a).f117947q.getResources().getDisplayMetrics().density;
        }
        if (f <= 0.0f) {
            f = C76577a.m92156g(((C43658n) this.f22178d.f148189a).f148196d);
        }
        String e = C6085v.m5954e(this.f22179e.optString("thumbUrl"));
        if (C6085v.m5950a(e)) {
            intent.putExtra("nowUrlPath", e);
        }
        boolean z = ((C43658n) this.f22178d.f148189a).f148261n.getBoolean("show_full_screen", false);
        if (!C6085v.m5955f() || optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("pos")) == null) {
            strArr = stringArray;
            str = "nowUrl";
        } else {
            int height = ((C43658n) this.f22178d.f148189a).f117951u.getHeight();
            String str2 = "MicroMsg.JsApiImagePreview";
            double d = (double) f;
            int optDouble = (int) (optJSONObject.optDouble("width") * d);
            int optDouble2 = (int) (optJSONObject.optDouble("height") * d);
            strArr = stringArray;
            str = "nowUrl";
            int optDouble3 = (int) (optJSONObject.optDouble("x") * d);
            double optDouble4 = optJSONObject.optDouble("y") * d;
            if (z) {
                height = 0;
            }
            int i = (int) (optDouble4 + ((double) height));
            intent.putExtra("img_gallery_width", optDouble).putExtra("img_gallery_height", optDouble2).putExtra("img_gallery_left", optDouble3).putExtra("img_gallery_top", i);
            int j = C76577a.m92159j(((C43658n) this.f22178d.f148189a).f148196d);
            Log.m105919d(str2, "doPreviewImg left %d, top %d, w %d, h %d, density %f,screenHeight %d", Integer.valueOf(optDouble3), Integer.valueOf(i), Integer.valueOf(optDouble), Integer.valueOf(optDouble2), Float.valueOf(f), Integer.valueOf(j));
            if (optDouble > 0 && optDouble2 > 0 && optDouble2 < j) {
                intent.putExtra("shouldRunDragAnimation", true);
            }
        }
        intent.putExtra("forBidForward", this.f22178d.f148190b.f129368c.optInt("forbidForward", 0) == 1);
        intent.putExtra(str, string);
        intent.putExtra("urlList", strArr);
        intent.putExtra("type", -255);
        intent.putExtra("isFromWebView", true);
        intent.putExtra("currentPos", this.f22179e.optInt("currentPos", -1));
        C88144b.m109791i(((C43658n) this.f22178d.f148189a).f148196d, "subapp", ".ui.gallery.GestureGalleryUI", intent, (Bundle) null);
        this.f22178d.mo73776a();
    }
}
