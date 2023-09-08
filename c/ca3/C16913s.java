package ca3;

import ca3.C16883a0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.WebViewVideoEventHandler;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import in0.C87760d;
import org.json.JSONException;
import p830xc.C91165a;

/* renamed from: ca3.s */
public final class C16913s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C16886m f45732d;

    public C16913s(C16886m mVar) {
        this.f45732d = mVar;
    }

    public final void run() {
        WebViewVideoEventHandler webViewVideoEventHandler;
        C16886m mVar = this.f45732d;
        if (!mVar.f45656I) {
            Log.m105924i(mVar.mo17980x(), "onMediaPlayerCompletion, mp released");
            return;
        }
        Log.m105924i(mVar.mo17980x(), "onCompletion");
        if (mVar.mo17966K() && (webViewVideoEventHandler = mVar.f45671U) != null) {
            try {
                webViewVideoEventHandler.mo68857a("onVideoEnded", webViewVideoEventHandler.mo68859c());
            } catch (JSONException e) {
                Log.m105921e(webViewVideoEventHandler.f119752a, "OnXWebVideoEnded fail", e);
            }
            webViewVideoEventHandler.mo68867k();
            MMHandlerThread.postToMainThread(new C39941l(webViewVideoEventHandler));
        }
        C87760d dVar = mVar.f45684n;
        if (dVar != null) {
            C16883a0 a0Var = mVar.f45677X;
            C91165a aVar = mVar.f45653F;
            a0Var.getClass();
            if (!Util.isNullOrNil(a0Var.f45630a.f45646p)) {
                C16883a0.C16884a aVar2 = a0Var.f45630a;
                if (aVar2.f45634d > 0) {
                    aVar2.f45642l = Util.nowMilliSecond();
                    a0Var.mo17952b(aVar, dVar, "onMediaPlayerVideoEnd");
                }
            }
        }
        if (mVar.f45657J) {
            Log.m105924i(mVar.mo17980x(), "onCompletion, video loop playing");
            mVar.f45686p = true;
            mVar.mo17963H(0);
            return;
        }
        Log.m105924i(mVar.mo17980x(), "onCompletion, video end playing");
        mVar.f45659L = true;
    }
}
