package ca3;

import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.WebViewVideoEventHandler;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import in0.C87760d;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* renamed from: ca3.w */
public final class C16917w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C16886m f45740d;

    public C16917w(C16886m mVar) {
        this.f45740d = mVar;
    }

    public final void run() {
        WebViewVideoEventHandler webViewVideoEventHandler;
        C16886m mVar = this.f45740d;
        if (!mVar.f45656I) {
            Log.m105924i(mVar.mo17980x(), "onMediaPlayerSeekComplete, mp released");
            return;
        }
        WebViewVideoEventHandler webViewVideoEventHandler2 = mVar.f45671U;
        if (webViewVideoEventHandler2 != null) {
            try {
                webViewVideoEventHandler2.mo68857a("onVideoSeekEnd", webViewVideoEventHandler2.mo68859c());
            } catch (JSONException e) {
                Log.m105921e(webViewVideoEventHandler2.f119752a, "onVideoSeedEnd fail", e);
            }
        }
        Log.m105924i(mVar.mo17980x(), "onSeekComplete");
        if (!mVar.f45686p) {
            C87760d dVar = mVar.f45684n;
            C87412m.m108591d(dVar);
            boolean isPlaying = dVar.isPlaying();
            if (!mVar.f45688q || (mVar.f45660M && mVar.f45661N)) {
                Log.m105925i(mVar.mo17980x(), "onSeekComplete, video not playing before seeking, isCurrentPlaying:%b", Boolean.valueOf(isPlaying));
                if (!isPlaying && mVar.mo17966K()) {
                    Log.m105924i(mVar.mo17980x(), "onSeekComplete, dispatch pause again");
                    WebViewVideoEventHandler webViewVideoEventHandler3 = mVar.f45671U;
                    if (webViewVideoEventHandler3 != null) {
                        webViewVideoEventHandler3.mo68862f(false);
                    }
                }
                if (isPlaying && mVar.f45660M && mVar.f45661N) {
                    mVar.f45678Y = new AtomicBoolean(true);
                    mVar.mo17982z();
                    return;
                }
                return;
            }
            C87760d dVar2 = mVar.f45684n;
            C87412m.m108591d(dVar2);
            long duration = (long) dVar2.getDuration();
            C87760d dVar3 = mVar.f45684n;
            C87412m.m108591d(dVar3);
            long currentPosition = (long) dVar3.getCurrentPosition();
            Log.m105925i(mVar.mo17980x(), "onSeekComplete, video playing before seeking, isCurrentPlaying:%b, position:%s, duration:%s", Boolean.valueOf(isPlaying), Long.valueOf(currentPosition), Long.valueOf(duration));
            mVar.f45688q = false;
            long j = (long) 1000;
            if (currentPosition / j < duration / j) {
                Log.m105924i(mVar.mo17980x(), "onSeekComplete, video not end");
                if (isPlaying && mVar.mo17966K()) {
                    Log.m105924i(mVar.mo17980x(), "onSeekComplete, dispatch play again");
                    WebViewVideoEventHandler webViewVideoEventHandler4 = mVar.f45671U;
                    if (webViewVideoEventHandler4 != null) {
                        webViewVideoEventHandler4.mo68863g(false);
                        return;
                    }
                    return;
                }
                return;
            }
            Log.m105924i(mVar.mo17980x(), "onSeekComplete, video ends");
            C87760d dVar4 = mVar.f45684n;
            if (dVar4 != null) {
                dVar4.pause();
            }
            if (mVar.mo17966K() && (webViewVideoEventHandler = mVar.f45671U) != null) {
                webViewVideoEventHandler.mo68863g(false);
            }
            C87760d dVar5 = mVar.f45684n;
            if (dVar5 != null) {
                dVar5.start();
            }
        } else if (!mVar.f45660M || !mVar.f45661N) {
            Log.m105924i(mVar.mo17980x(), "onSeekComplete, start when seek complete");
            mVar.f45686p = false;
            mVar.mo17956A(false, true);
        } else {
            Log.m105920e(mVar.mo17980x(), "onSeekComplete, background not allow play");
        }
    }
}
