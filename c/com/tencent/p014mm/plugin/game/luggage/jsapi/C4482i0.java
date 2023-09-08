package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.media.AudioManager;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;
import p331dj.C107043a;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.i0 */
public final class C4482i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f19255d;

    /* renamed from: e */
    public final /* synthetic */ double f19256e;

    /* renamed from: f */
    public final /* synthetic */ C4486j0 f19257f;

    /* renamed from: g */
    public final /* synthetic */ C43620m2.C5947b f19258g;

    public C4482i0(Context context, double d, C4486j0 j0Var, C43620m2.C5947b bVar) {
        this.f19255d = context;
        this.f19256e = d;
        this.f19257f = j0Var;
        this.f19258g = bVar;
    }

    public final void run() {
        Object systemService = this.f19255d.getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        C107043a.m144905c(audioManager, 3, (int) (((double) streamMaxVolume) * this.f19256e), 0);
        this.f19257f.getClass();
        Log.m105924i("handleDeviceInfo", "setVolume, maxVolume=" + streamMaxVolume + ", volume=" + this.f19256e);
        this.f19258g.mo6945a((String) null, (JSONObject) null);
    }
}
