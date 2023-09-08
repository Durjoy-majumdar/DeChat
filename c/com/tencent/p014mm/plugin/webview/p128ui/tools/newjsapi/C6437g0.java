package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.app.Activity;
import android.media.AudioManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import rx3.C13598b0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.g0 */
public final class C6437g0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Activity f23457d;

    /* renamed from: e */
    public final /* synthetic */ C13855j f23458e;

    /* renamed from: f */
    public final /* synthetic */ C13851h1 f23459f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6437g0(Activity activity, C13855j jVar, C13851h1 h1Var) {
        super(0);
        this.f23457d = activity;
        this.f23458e = jVar;
        this.f23459f = h1Var;
    }

    public Object invoke() {
        Object systemService = this.f23457d.getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        HashMap hashMap = new HashMap();
        hashMap.put("data", Float.valueOf(((float) streamVolume) / ((float) streamMaxVolume)));
        C13849g gVar = this.f23458e.f39001d;
        String str = this.f23459f.f38990c;
        gVar.mo10774a(str, this.f23459f.f38996i + ":ok", hashMap);
        Log.m105924i("MicroMsg.JsApiHandleDeviceInfo", "getVolume, maxVolume=" + streamMaxVolume + ", volume=" + streamVolume);
        return C13598b0.f38549a;
    }
}
