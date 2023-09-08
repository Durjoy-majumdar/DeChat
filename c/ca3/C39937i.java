package ca3;

import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.model.C43721l;
import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.WebViewVideoEventHandler;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e00.C45518r0;
import org.json.JSONObject;

/* renamed from: ca3.i */
public final class C39937i implements C43721l {

    /* renamed from: a */
    public final /* synthetic */ WebViewVideoEventHandler f107074a;

    public C39937i(WebViewVideoEventHandler webViewVideoEventHandler) {
        this.f107074a = webViewVideoEventHandler;
    }

    /* renamed from: a */
    public void mo18000a(int i, Bundle bundle) {
        JSONObject c = this.f107074a.mo68859c();
        if (i == 1) {
            String str = this.f107074a.f119752a;
            Log.m105924i(str, "onEnterFinderFullscreen data: " + c);
            this.f107074a.mo68857a("onEnterFinderFullscreen", c);
            return;
        }
        if (!(bundle == null || ((C45518r0) C86312j.m106911c(C45518r0.class)).gi0() == null)) {
            c.put("status", bundle.getString("status", ""));
            c.put("playbackTime", Float.valueOf(bundle.getFloat("playbackTime")));
            c.put("playbackRate", Float.valueOf(bundle.getFloat("playbackRate")));
            c.put("isPause", bundle.getBoolean("isPause"));
            c.put("showBarrage", bundle.getBoolean("showBarrage"));
        }
        String str2 = this.f107074a.f119752a;
        Log.m105924i(str2, "onExitFinderFullscreen data: " + c);
        this.f107074a.mo68857a("onExitFinderFullscreen", c);
    }
}
