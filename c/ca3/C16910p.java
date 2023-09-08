package ca3;

import ca3.C16883a0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.WebViewVideoEventHandler;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p975hd.C87478c;
import z04.C112551y;

/* renamed from: ca3.p */
public final class C16910p implements C87478c.C87479a {

    /* renamed from: a */
    public final /* synthetic */ C16886m f45726a;

    public C16910p(C16886m mVar) {
        this.f45726a = mVar;
    }

    /* renamed from: a */
    public final void mo18001a(String str, int i, int i2) {
        WebViewVideoEventHandler webViewVideoEventHandler;
        String str2 = str;
        Log.m105929w(this.f45726a.mo17980x(), "send video error event, what:%d, extra:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (this.f45726a.mo17966K() && (webViewVideoEventHandler = this.f45726a.f45671U) != null) {
            webViewVideoEventHandler.mo68867k();
            MMHandlerThread.postToMainThread(new C39941l(webViewVideoEventHandler));
            try {
                JSONObject c = webViewVideoEventHandler.mo68859c();
                String format = String.format(Locale.US, "%s(%d,%d)", Arrays.copyOf(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, 3));
                C87412m.m108593f(format, "format(locale, format, *args)");
                c.put("errMsg", format);
                webViewVideoEventHandler.mo68857a("onVideoError", c);
            } catch (JSONException e) {
                Log.m105921e(webViewVideoEventHandler.f119752a, "OnXWebVideoError fail", e);
            }
        }
        C16883a0 a0Var = this.f45726a.f45677X;
        C87412m.m108593f(str2, "msg");
        a0Var.getClass();
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(1379, 40, 1, false);
        Log.m105921e("MicroMsg.WebViewVideoProfileReport", "onMediaPlayerVideoError, what:%s, extra:%s, msg:%s", Integer.valueOf(i), Integer.valueOf(i2), str2);
        if (!Util.isNullOrNil(str)) {
            if (C112551y.m153809i(str2, "MEDIA_ERR_NETWORK", true)) {
                nVar.idkeyStat(1379, 41, 1, false);
            } else if (C112551y.m153809i(str2, "MEDIA_ERR_DECODE", true)) {
                nVar.idkeyStat(1379, 42, 1, false);
            } else if (C112551y.m153809i(str2, "MEDIA_ERR_SRC_NOT_SUPPORTED", true)) {
                nVar.idkeyStat(1379, 43, 1, false);
            } else {
                nVar.idkeyStat(1379, 44, 1, false);
            }
        }
        C16883a0.C16884a aVar = a0Var.f45630a;
        aVar.f45643m = i;
        aVar.f45644n = i2;
        aVar.f45645o = str2;
        this.f45726a.mo17967L();
    }
}
