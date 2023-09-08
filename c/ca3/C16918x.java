package ca3;

import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.WebViewVideoEventHandler;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ca3.x */
public final class C16918x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C16886m f45741d;

    /* renamed from: e */
    public final /* synthetic */ int f45742e;

    /* renamed from: f */
    public final /* synthetic */ int f45743f;

    public C16918x(C16886m mVar, int i, int i2) {
        this.f45741d = mVar;
        this.f45742e = i;
        this.f45743f = i2;
    }

    public final void run() {
        WebViewVideoEventHandler webViewVideoEventHandler;
        C16886m mVar = this.f45741d;
        int i = this.f45742e;
        int i2 = this.f45743f;
        if (!mVar.f45656I) {
            Log.m105924i(mVar.mo17980x(), "onMediaPlayerVideoSizeChanged, mp released");
            return;
        }
        int w = mVar.mo17979w();
        Log.m105925i(mVar.mo17980x(), "onVideoSizeChanged, width:%d, height:%d, duration:%d, mVideoHasPrepared:%b", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(w), Boolean.valueOf(mVar.f45692u));
        if (!(!mVar.f45692u || mVar.f45684n == null || ((i == mVar.f45694w && i2 == mVar.f45695x && w == mVar.f45697y) || !mVar.mo17966K() || (webViewVideoEventHandler = mVar.f45671U) == null))) {
            String str = webViewVideoEventHandler.f119752a;
            Log.m105924i(str, "onVideoSizeChange width=" + i + ", height=" + i2 + ", duration=" + w);
            try {
                JSONObject c = webViewVideoEventHandler.mo68859c();
                c.put("width", i);
                c.put("height", i2);
                double d = (((double) w) * 1.0d) / ((double) 1000);
                webViewVideoEventHandler.f119755d = d;
                c.put("duration", d);
                webViewVideoEventHandler.mo68857a("onVideoSizeChange", c);
            } catch (JSONException e) {
                Log.m105921e(webViewVideoEventHandler.f119752a, "onVideoSizeChange fail", e);
            }
        }
        mVar.f45694w = i;
        mVar.f45695x = i2;
        mVar.f45697y = w;
        mVar.mo17974r();
    }
}
