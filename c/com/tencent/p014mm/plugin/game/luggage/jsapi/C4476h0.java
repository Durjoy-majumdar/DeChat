package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.media.AudioManager;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.h0 */
public final class C4476h0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f19240d;

    /* renamed from: e */
    public final /* synthetic */ C43620m2.C5947b f19241e;

    /* renamed from: f */
    public final /* synthetic */ C4486j0 f19242f;

    public C4476h0(Context context, C43620m2.C5947b bVar, C4486j0 j0Var) {
        this.f19240d = context;
        this.f19241e = bVar;
        this.f19242f = j0Var;
    }

    public final void run() {
        Object systemService = this.f19240d.getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        C43620m2.C5947b bVar = this.f19241e;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", Float.valueOf(((float) streamVolume) / ((float) streamMaxVolume)));
        bVar.mo6945a((String) null, jSONObject);
        this.f19242f.getClass();
        Log.m105924i("handleDeviceInfo", "getVolume, maxVolume=" + streamMaxVolume + ", volume=" + streamVolume);
    }
}
