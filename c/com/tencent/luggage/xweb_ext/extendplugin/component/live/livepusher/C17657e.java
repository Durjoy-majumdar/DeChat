package com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher;

import android.os.Bundle;
import com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter;
import com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a;
import com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17648b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import org.json.JSONObject;
import p301cd.C16922e0;
import p301cd.C16927n;

/* renamed from: com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.e */
public class C17657e {

    /* renamed from: f */
    public static C17648b.C17650b f48041f = C17648b.C17650b.C17651a.f48025b;

    /* renamed from: a */
    public final C16927n f48042a;

    /* renamed from: b */
    public boolean f48043b = false;

    /* renamed from: c */
    public final C17648b f48044c = f48041f.create();

    /* renamed from: d */
    public boolean f48045d = false;

    /* renamed from: e */
    public boolean f48046e = false;

    static {
        int i = C17648b.C17650b.f48024a;
    }

    public C17657e(V2TXLivePusherJSAdapter v2TXLivePusherJSAdapter) {
        C87412m.m108594g(v2TXLivePusherJSAdapter, "livePusherJsAdapter");
        C16922e0 e0Var = new C16922e0(v2TXLivePusherJSAdapter);
        this.f48042a = e0Var;
    }

    /* renamed from: a */
    public final void mo21085a(Bundle bundle, String str, C17643a.C17644b bVar) {
        if (!bundle.containsKey(str)) {
            Log.m105919d("TXLivePusherWeEffectJSAdapter", "applyFaceBeautyIfNeed, %s is not exist in params", str);
            return;
        }
        float f = 0.0f;
        float f2 = bundle.getFloat(str, 0.0f);
        if (f2 < 0.0f) {
            Log.m105925i("TXLivePusherWeEffectJSAdapter", "applyFaceBeautyIfNeed, rate(%f) of %s is illegal", Float.valueOf(f2), str);
        } else {
            f = f2;
        }
        if (f > 1.0f) {
            Log.m105925i("TXLivePusherWeEffectJSAdapter", "applyFaceBeautyIfNeed, rate(%f) of %s is illegal", Float.valueOf(f), str);
            f = 1.0f;
        }
        mo21086b();
        Log.m105919d("TXLivePusherWeEffectJSAdapter", "applyFaceBeauty, faceBeautyType: %s, rate: %f", bVar, Float.valueOf(f));
        this.f48044c.mo21060j(bVar, f);
    }

    /* renamed from: b */
    public final void mo21086b() {
        if (!this.f48045d) {
            Log.m105918d("TXLivePusherWeEffectJSAdapter", "applyWeEffect");
            this.f48042a.setVideoProcessListener(this.f48044c);
            this.f48045d = true;
        }
    }

    /* renamed from: c */
    public final void mo21087c(Bundle bundle, boolean z) {
        if (z || bundle.keySet().size() != 0) {
            this.f48046e = bundle.getBoolean("customEffect", this.f48046e);
            if (mo21090f()) {
                Log.m105924i("TXLivePusherWeEffectJSAdapter", "parseAndApplyParams, useCustomEffect");
                mo21085a(bundle, "skinWhiteness", C17643a.C17644b.SKIN_BRIGHT);
                mo21085a(bundle, "skinSmoothness", C17643a.C17644b.SKIN_SMOOTH);
                mo21085a(bundle, "faceThinness", C17643a.C17644b.FACE_THIN);
                mo21085a(bundle, "eyeBigness", C17643a.C17644b.EYE_BIGGER);
            }
        }
    }

    /* renamed from: d */
    public final float mo21088d(JSONObject jSONObject, String str, float f) {
        float optDouble = (float) jSONObject.optDouble(str, 1.0d);
        if (optDouble < 0.0f) {
            Log.m105925i("TXLivePusherWeEffectJSAdapter", "parseRate, rate(%f) is illegal", Float.valueOf(optDouble));
            optDouble = 0.0f;
        }
        if (optDouble <= 1.0f) {
            return optDouble;
        }
        Log.m105925i("TXLivePusherWeEffectJSAdapter", "parseRate, rate(%f)  is illegal", Float.valueOf(optDouble));
        return 1.0f;
    }

    /* renamed from: e */
    public final C17643a.C17646d mo21089e(JSONObject jSONObject) {
        String optString = jSONObject.optString("stickerType", (String) null);
        if (Util.isNullOrNil(optString)) {
            Log.m105928w("TXLivePusherWeEffectJSAdapter", "parseStickerType, stickerTypeStr is empty");
            return null;
        } else if (optString.equalsIgnoreCase("back")) {
            return C17643a.C17646d.STICKER_BACK;
        } else {
            if (optString.equalsIgnoreCase("front")) {
                return C17643a.C17646d.STICKER_FRONT;
            }
            if (optString.equalsIgnoreCase("2d")) {
                return C17643a.C17646d.STICKER_2D;
            }
            Log.m105928w("TXLivePusherWeEffectJSAdapter", "parseStickerType, stickerTypeStr: " + optString);
            return null;
        }
    }

    /* renamed from: f */
    public final boolean mo21090f() {
        return this.f48046e && this.f48044c.isEnabled();
    }
}
