package com.tencent.p014mm.plugin.webview.luggage;

import android.os.Build;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;

/* renamed from: com.tencent.mm.plugin.webview.luggage.y */
public class C43688y extends WebChromeClient {

    /* renamed from: a */
    public final /* synthetic */ C43658n f118059a;

    public C43688y(C43658n nVar) {
        this.f118059a = nVar;
    }

    public View getVideoLoadingProgressView() {
        Log.m105924i("MicroMsg.LuggageMMWebPage", "getVideoLoadingProgressView");
        C43658n nVar = this.f118059a;
        if (nVar.f117921K == null) {
            nVar.f117921K = new ProgressBar(this.f118059a.f148196d);
            this.f118059a.f117921K.setIndeterminate(true);
        }
        return this.f118059a.f117921K;
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        this.f118059a.getClass();
        return false;
    }

    public void onHideCustomView() {
        Log.m105924i("MicroMsg.LuggageMMWebPage", "onHideCustomView, sdk int = " + Build.VERSION.SDK_INT);
        C43658n nVar = this.f118059a;
        if (nVar.f117920J != null) {
            try {
                nVar.f117948r.setVisibility(0);
                WebChromeClient.CustomViewCallback customViewCallback = this.f118059a.f117919I;
                if (customViewCallback != null) {
                    customViewCallback.onCustomViewHidden();
                }
                this.f118059a.f117951u.setVisibility(0);
                C43658n nVar2 = this.f118059a;
                FrameLayout frameLayout = nVar2.f117920J;
                if (frameLayout != null) {
                    nVar2.f117949s.removeView(frameLayout);
                }
                this.f118059a.f117920J.removeAllViews();
                this.f118059a.f117920J = null;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.LuggageMMWebPage", "onHideCustomView error " + e.getMessage());
            }
        }
    }

    public void onReceivedTitle(WebView webView, String str) {
        boolean z = true;
        Log.m105925i("MicroMsg.LuggageMMWebPage", "onReceivedTitle, title = %s", str);
        if (!C6013c.m5892d(str)) {
            if (Util.isNullOrNil(str) || !str.equalsIgnoreCase("about:blank")) {
                z = false;
            }
            if (!z) {
                this.f118059a.mo65818R(str, 0);
            }
        }
        this.f118059a.f148259i.mo73820h();
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Log.m105924i("MicroMsg.LuggageMMWebPage", "onShowCustomView, sdk int = " + Build.VERSION.SDK_INT);
        try {
            C43658n nVar = this.f118059a;
            if (nVar.f117920J != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            nVar.f117920J = new FrameLayout(this.f118059a.f148196d);
            this.f118059a.f117920J.setBackgroundResource(C0966R.color.akq);
            this.f118059a.f117920J.addView(view);
            C43658n nVar2 = this.f118059a;
            nVar2.f117919I = customViewCallback;
            nVar2.f117948r.setVisibility(8);
            this.f118059a.f117951u.setVisibility(8);
            C43658n nVar3 = this.f118059a;
            nVar3.f117949s.addView(nVar3.f117920J);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.LuggageMMWebPage", "onShowCustomView error " + e.getMessage());
        }
    }
}
