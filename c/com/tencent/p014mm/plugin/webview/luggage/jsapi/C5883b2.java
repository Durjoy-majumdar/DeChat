package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import com.tencent.p014mm.ipcinvoker.C40319a0;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import nj3.C76874e0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;
import sw1.C48478n;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.b2 */
public class C5883b2 extends C5954n2<C43658n> {
    /* renamed from: f */
    public static boolean m5609f(C5883b2 b2Var, Context context, JSONObject jSONObject, C43620m2.C5947b bVar, boolean z) {
        b2Var.getClass();
        Class cls = C48478n.class;
        String optString = jSONObject.optString("videoId");
        if (Util.isNullOrNil(optString)) {
            return false;
        }
        C48478n.C13792e rR = ((C48478n) C86312j.m106911c(cls)).mo65692rR(optString);
        if (rR == null) {
            bVar.mo6945a("localVideo not exist videoId = videoId", (JSONObject) null);
        } else {
            C48478n.C13793h hVar = new C48478n.C13793h();
            hVar.f38919c = rR.f38910d;
            hVar.f38917a = rR.f38908b;
            hVar.f38918b = rR.f38909c;
            hVar.f38921e = rR.f38914h;
            hVar.f38922f = rR.f38915i;
            hVar.f38920d = rR.f38916j;
            if (z) {
                ((C48478n) C86312j.m106911c(cls)).Yd0(context, hVar, new C5901d2(b2Var, bVar));
            } else if (context instanceof MMFragmentActivity) {
                ((C48478n) C86312j.m106911c(cls)).jg0((MMFragmentActivity) context, hVar, new C5908e2(b2Var, bVar));
            } else {
                bVar.mo6945a("context is not MMFragmentActivity", (JSONObject) null);
            }
        }
        return true;
    }

    /* renamed from: b */
    public String mo5382b() {
        return "shareCustomContent";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        C40319a0.m43495c(true, new b2$$c(this, str, bVar, context));
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
    }

    /* renamed from: g */
    public final void mo6922g(JSONArray jSONArray, C76874e0 e0Var, Context context) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String optString = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    int optInt = jSONObject.optInt("id");
                    byte[] decode = Base64.decode(jSONObject.optString("iconData"), 0);
                    BitmapDrawable bitmapDrawable = null;
                    if (decode != null) {
                        bitmapDrawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    }
                    if (bitmapDrawable != null) {
                        e0Var.mo107153m(optInt + 1000, optString, bitmapDrawable, 0);
                    }
                } catch (JSONException e) {
                    Log.m105924i("MicroMsg.JsApiShareCustomContent", "err:" + e.getMessage());
                }
            }
        }
    }
}
