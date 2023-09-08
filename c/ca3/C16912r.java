package ca3;

import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.WebViewVideoEventHandler;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ca3.r */
public final class C16912r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C16886m f45730d;

    /* renamed from: e */
    public final /* synthetic */ int f45731e;

    public C16912r(C16886m mVar, int i) {
        this.f45730d = mVar;
        this.f45731e = i;
    }

    public final void run() {
        WebViewVideoEventHandler webViewVideoEventHandler;
        C16886m mVar = this.f45730d;
        int i = this.f45731e;
        if (!mVar.f45656I) {
            Log.m105924i(mVar.mo17980x(), "onMediaPlayerBufferingUpdate, mp released");
            return;
        }
        if (i != mVar.f45699z) {
            mVar.f45699z = i;
            Log.m105925i(mVar.mo17980x(), "onBufferingUpdate, percent:%s", Integer.valueOf(i));
        }
        if (mVar.mo17966K() && mVar.f45692u && (webViewVideoEventHandler = mVar.f45671U) != null) {
            try {
                JSONObject c = webViewVideoEventHandler.mo68859c();
                c.put("buffered", i);
                webViewVideoEventHandler.mo68857a("onVideoBufferUpdate", c);
            } catch (JSONException e) {
                Log.m105921e(webViewVideoEventHandler.f119752a, "OnXWebVideoProgress fail", e);
            }
        }
    }
}
