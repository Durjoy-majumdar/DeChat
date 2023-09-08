package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import org.json.JSONObject;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.q2 */
public final class C1841q2 extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 906;
    public static final String NAME = "editTextWithPopForm";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        if (kVar != null) {
            if (jSONObject == null) {
                kVar.mo109647a(i, "fail:invalid data");
                return;
            }
            Log.m105924i("JsApiEditTextWithPopForm", "invoke data:" + jSONObject);
            String optString = jSONObject.optString(MimeTypes.BASE_TYPE_TEXT, "");
            C87412m.m108593f(optString, MimeTypes.BASE_TYPE_TEXT);
            Activity R = kVar.getRuntime().mo113026R();
            if (R != null) {
                ((C119157j) C119157j.f356862d).mo183895z(new C1771p2(this, R, optString, kVar, i));
            }
        }
    }
}
