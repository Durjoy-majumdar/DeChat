package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.app.Activity;
import android.media.AudioManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import p331dj.C107043a;
import rx3.C13598b0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.j0 */
public final class C6498j0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Activity f23598d;

    /* renamed from: e */
    public final /* synthetic */ float f23599e;

    /* renamed from: f */
    public final /* synthetic */ C13855j f23600f;

    /* renamed from: g */
    public final /* synthetic */ C13851h1 f23601g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6498j0(Activity activity, float f, C13855j jVar, C13851h1 h1Var) {
        super(0);
        this.f23598d = activity;
        this.f23599e = f;
        this.f23600f = jVar;
        this.f23601g = h1Var;
    }

    public Object invoke() {
        Object systemService = this.f23598d.getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        C107043a.m144905c(audioManager, 3, (int) (((float) streamMaxVolume) * this.f23599e), 0);
        Log.m105924i("MicroMsg.JsApiHandleDeviceInfo", "setVolume, maxVolume=" + streamMaxVolume + ", volume=" + this.f23599e);
        C13849g gVar = this.f23600f.f39001d;
        String str = this.f23601g.f38990c;
        gVar.mo10774a(str, this.f23601g.f38996i + ":ok", (Map<String, Object>) null);
        return C13598b0.f38549a;
    }
}
