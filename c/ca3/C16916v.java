package ca3;

import ca3.C16883a0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.WebViewVideoEventHandler;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ea3.C7616k;
import gy3.C87412m;
import in0.C87760d;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ca3.v */
public final class C16916v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C16886m f45739d;

    public C16916v(C16886m mVar) {
        this.f45739d = mVar;
    }

    public final void run() {
        C16886m mVar = this.f45739d;
        if (!mVar.f45656I) {
            Log.m105924i(mVar.mo17980x(), "onMediaPlayerPrepared, mp released");
            return;
        }
        Log.m105924i(mVar.mo17980x(), "onPrepared");
        boolean z = true;
        mVar.f45692u = true;
        mVar.mo17974r();
        C16883a0 a0Var = mVar.f45677X;
        int w = mVar.mo17979w();
        C16883a0.C16884a aVar = a0Var.f45630a;
        if (aVar.f45635e <= 0) {
            aVar.f45635e = Util.nowMilliSecond();
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(1379, 21, 1, false);
            C16883a0.C16884a aVar2 = a0Var.f45630a;
            long j = aVar2.f45635e - aVar2.f45634d;
            aVar2.f45636f = j;
            long j2 = j;
            nVar.idkeyStat(1379, 22, j2, false);
            Log.m105925i("MicroMsg.WebViewVideoProfileReport", "onMediaPlayerVideoPrepareEnd, prepareTime:%s", Long.valueOf(j2));
        }
        C16883a0.C16884a aVar3 = a0Var.f45630a;
        if (aVar3.f45633c <= 0 && w > 0) {
            long j3 = (long) ((((double) w) * 1.0d) / ((double) 1000));
            aVar3.f45633c = j3;
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.idkeyStat(1379, 26, 1, false);
            nVar2.idkeyStat(1379, 24, j3, false);
            Log.m105925i("MicroMsg.WebViewVideoProfileReport", "onMediaPlayerVideoPrepareEnd, duration:%s", Long.valueOf(j3));
        }
        if (mVar.mo17966K()) {
            WebViewVideoEventHandler webViewVideoEventHandler = mVar.f45671U;
            if (webViewVideoEventHandler != null) {
                C87760d dVar = mVar.f45684n;
                int videoWidth = dVar != null ? dVar.getVideoWidth() : 0;
                C87760d dVar2 = mVar.f45684n;
                int videoHeight = dVar2 != null ? dVar2.getVideoHeight() : 0;
                int w2 = mVar.mo17979w();
                Log.m105924i(webViewVideoEventHandler.f119752a, "onVideoLoadedMetaData width=" + videoWidth + ", height=" + videoHeight + ", duration=" + w2);
                try {
                    JSONObject c = webViewVideoEventHandler.mo68859c();
                    c.put("width", videoWidth);
                    c.put("height", videoHeight);
                    double d = (((double) w2) * 1.0d) / ((double) 1000);
                    webViewVideoEventHandler.f119755d = d;
                    c.put("duration", d);
                    webViewVideoEventHandler.mo68857a("onVideoLoadedMetaData", c);
                } catch (JSONException e) {
                    Log.m105921e(webViewVideoEventHandler.f119752a, "onVideoLoadedMetaData fail", e);
                }
            }
            WebViewVideoEventHandler webViewVideoEventHandler2 = mVar.f45671U;
            if (webViewVideoEventHandler2 != null) {
                Log.m105924i(webViewVideoEventHandler2.f119752a, "onWaitingMoovReport");
                if (C7616k.f25897a.mo8749a()) {
                    try {
                        webViewVideoEventHandler2.mo68861e("WaitingMoov", (JSONObject) null);
                    } catch (JSONException e2) {
                        Log.m105921e(webViewVideoEventHandler2.f119752a, "onWaitingMoovReport fail", e2);
                    }
                }
            }
            WebViewVideoEventHandler webViewVideoEventHandler3 = mVar.f45671U;
            if (webViewVideoEventHandler3 != null) {
                Log.m105924i(webViewVideoEventHandler3.f119752a, "onWaitingPreDataReport");
                if (C7616k.f25897a.mo8749a()) {
                    try {
                        webViewVideoEventHandler3.mo68861e("WaitingPreData", (JSONObject) null);
                    } catch (JSONException e3) {
                        Log.m105921e(webViewVideoEventHandler3.f119752a, "onWaitingPreDataReport fail", e3);
                    }
                }
            }
            WebViewVideoEventHandler webViewVideoEventHandler4 = mVar.f45671U;
            if (webViewVideoEventHandler4 != null) {
                Log.m105924i(webViewVideoEventHandler4.f119752a, "onWaitingReadyReport");
                if (C7616k.f25897a.mo8749a()) {
                    try {
                        JSONObject c2 = webViewVideoEventHandler4.mo68859c();
                        c2.put("state", 5);
                        c2.put("extInfo", webViewVideoEventHandler4.mo68858b());
                        webViewVideoEventHandler4.mo68861e("WaitingReady", c2);
                    } catch (JSONException e4) {
                        Log.m105921e(webViewVideoEventHandler4.f119752a, "onWaitingReadyReport fail", e4);
                    }
                }
            }
            WebViewVideoEventHandler webViewVideoEventHandler5 = mVar.f45671U;
            if (webViewVideoEventHandler5 != null) {
                Log.m105924i(webViewVideoEventHandler5.f119752a, "onWaitingPlayReport");
                if (C7616k.f25897a.mo8749a()) {
                    try {
                        C16886m mVar2 = webViewVideoEventHandler5.f119754c;
                        if (C87412m.m108589b(mVar2 != null ? mVar2.f45651D : null, (Object) null)) {
                            webViewVideoEventHandler5.f119758g++;
                        } else {
                            webViewVideoEventHandler5.f119758g = 0;
                        }
                        webViewVideoEventHandler5.mo68861e("WaitingPlay", (JSONObject) null);
                    } catch (JSONException e5) {
                        Log.m105921e(webViewVideoEventHandler5.f119752a, "onWaitingPlayReport fail", e5);
                    }
                }
            }
        }
        long j4 = mVar.f45690s;
        if (j4 > 0) {
            mVar.mo17963H(j4);
            mVar.f45690s = 0;
        }
        Log.m105918d(mVar.mo17980x(), "onPrepared, webViewInBackgroun = " + mVar.f45660M);
        if (mVar.f45660M) {
            Log.m105924i(mVar.mo17980x(), "onPrepared, stop video auto play when webview in background");
            if (!mVar.f45691t && !mVar.f45693v) {
                z = false;
            }
            mVar.f45678Y = new AtomicBoolean(z);
        } else if (mVar.f45691t || mVar.f45693v) {
            Log.m105925i(mVar.mo17980x(), "onPrepared, start play when prepared, mStartWhenPrepared:%s, mControlStartWhenPrepared:%s", Boolean.valueOf(mVar.f45691t), Boolean.valueOf(mVar.f45693v));
            mVar.mo17956A(mVar.f45691t, true);
        } else {
            Log.m105924i(mVar.mo17980x(), "onPrepared, not set start play when prepared");
        }
    }
}
