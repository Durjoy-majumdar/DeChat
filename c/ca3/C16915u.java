package ca3;

import ca3.C16883a0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.WebViewVideoEventHandler;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ea3.C7616k;
import in0.C87760d;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p975hd.C87478c;

/* renamed from: ca3.u */
public final class C16915u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C16886m f45736d;

    /* renamed from: e */
    public final /* synthetic */ int f45737e;

    /* renamed from: f */
    public final /* synthetic */ int f45738f;

    public C16915u(C16886m mVar, int i, int i2) {
        this.f45736d = mVar;
        this.f45737e = i;
        this.f45738f = i2;
    }

    public final void run() {
        WebViewVideoEventHandler webViewVideoEventHandler;
        C16886m mVar = this.f45736d;
        int i = this.f45737e;
        int i2 = this.f45738f;
        if (!mVar.f45656I) {
            Log.m105924i(mVar.mo17980x(), "onMediaPlayerInfo, mp released");
            return;
        }
        boolean z = false;
        Log.m105925i(mVar.mo17980x(), "onInfo, what:%d, extra:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 701) {
            C87760d dVar = mVar.f45684n;
            mVar.f45689r = dVar != null && dVar.isPlaying();
            Log.m105925i(mVar.mo17980x(), "onInfo, buffering start, isPlayingBeforeBuffering:%b", Boolean.valueOf(mVar.f45689r));
            if (mVar.mo17966K() && (webViewVideoEventHandler = mVar.f45671U) != null) {
                webViewVideoEventHandler.mo68864h();
            }
            WebViewVideoEventHandler webViewVideoEventHandler2 = mVar.f45671U;
            if (webViewVideoEventHandler2 != null) {
                Log.m105924i(webViewVideoEventHandler2.f119752a, "onWaitingBufferReadyReport");
                if (C7616k.f25897a.mo8749a()) {
                    try {
                        webViewVideoEventHandler2.mo68861e("WaitingBufferReady", (JSONObject) null);
                    } catch (JSONException e) {
                        Log.m105921e(webViewVideoEventHandler2.f119752a, "onWaitingBufferReadyReport fail", e);
                    }
                }
            }
            C16883a0.C16884a aVar = mVar.f45677X.f45630a;
            if (aVar.f45639i <= 0) {
                aVar.f45637g++;
                aVar.f45639i = Util.nowMilliSecond();
                C115669n.INSTANCE.idkeyStat(1379, 30, 1, false);
            }
        } else if (i == 702) {
            C87760d dVar2 = mVar.f45684n;
            boolean z2 = dVar2 != null && dVar2.isPlaying();
            Log.m105925i(mVar.mo17980x(), "onInfo, buffering end, isPlayingBeforeBuffering:%b, isCurrentPlaying:%b", Boolean.valueOf(mVar.f45689r), Boolean.valueOf(z2));
            if (mVar.f45689r) {
                mVar.f45689r = false;
                if (z2 && mVar.mo17966K()) {
                    Log.m105924i(mVar.mo17980x(), "onInfo, buffering end, notify video play");
                    WebViewVideoEventHandler webViewVideoEventHandler3 = mVar.f45671U;
                    if (webViewVideoEventHandler3 != null) {
                        webViewVideoEventHandler3.mo68863g(false);
                    }
                    WebViewVideoEventHandler webViewVideoEventHandler4 = mVar.f45671U;
                    if (webViewVideoEventHandler4 != null) {
                        webViewVideoEventHandler4.mo68860d();
                    }
                }
            } else if (!z2 && mVar.mo17966K()) {
                Log.m105924i(mVar.mo17980x(), "onInfo, buffering end, notify video pause");
                WebViewVideoEventHandler webViewVideoEventHandler5 = mVar.f45671U;
                if (webViewVideoEventHandler5 != null) {
                    webViewVideoEventHandler5.mo68862f(false);
                }
                WebViewVideoEventHandler webViewVideoEventHandler6 = mVar.f45671U;
                if (webViewVideoEventHandler6 != null) {
                    webViewVideoEventHandler6.mo68860d();
                }
            }
            C16883a0 a0Var = mVar.f45677X;
            C16883a0.C16884a aVar2 = a0Var.f45630a;
            if (aVar2.f45640j <= 0 && aVar2.f45639i > 0) {
                aVar2.f45640j = Util.nowMilliSecond();
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(1379, 31, 1, false);
                C16883a0.C16884a aVar3 = a0Var.f45630a;
                long j = aVar3.f45640j - aVar3.f45639i;
                aVar3.f45638h += j;
                nVar.idkeyStat(1379, 32, j, false);
                Log.m105925i("MicroMsg.WebViewVideoProfileReport", "onMediaPlayerVideoBufferEnd, bufferTime:%s", Long.valueOf(j));
            }
            C16883a0.C16884a aVar4 = a0Var.f45630a;
            aVar4.f45639i = 0;
            aVar4.f45640j = 0;
        } else if (i2 == -1004) {
            Log.m105925i(mVar.mo17980x(), "onInfo, special error, what:%d, extra:%d", Integer.valueOf(i), Integer.valueOf(i2));
            C87478c cVar = mVar.f45673V;
            if (cVar != null) {
                ((C79968g) cVar).mo110145b(i, i2);
            }
        } else if (i == 3) {
            if (!mVar.f45656I) {
                Log.m105924i(mVar.mo17980x(), "onMediaPlayerVideoFirstFrame, mp released");
            } else {
                Log.m105924i(mVar.mo17980x(), "onMediaPlayerVideoFirstFrame");
            }
        }
        C87760d dVar3 = mVar.f45684n;
        if (dVar3 != null && dVar3.isPlaying()) {
            z = true;
        }
        if (z && mVar.f45660M && mVar.f45661N) {
            mVar.f45678Y = new AtomicBoolean(true);
            mVar.mo17982z();
        }
    }
}
