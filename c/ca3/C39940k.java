package ca3;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.WebViewVideoEventHandler;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: ca3.k */
public final class C39940k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebViewVideoEventHandler f107077d;

    public C39940k(WebViewVideoEventHandler webViewVideoEventHandler) {
        this.f107077d = webViewVideoEventHandler;
    }

    public final void run() {
        C39934d dVar = this.f107077d.f119753b;
        if (dVar != null) {
            C87412m.m108591d(dVar);
            if (dVar.f107067a.f38998a instanceof Activity) {
                Log.m105924i(this.f107077d.f119752a, "startKeepScreenOn");
                try {
                    C39934d dVar2 = this.f107077d.f119753b;
                    C87412m.m108591d(dVar2);
                    Context context = dVar2.f107067a.f38998a;
                    C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                    ((Activity) context).getWindow().addFlags(128);
                } catch (Exception e) {
                    Log.m105921e(this.f107077d.f119752a, "startKeepScreenOn exception", e);
                }
            }
        }
    }
}
