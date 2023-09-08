package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44307k0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.xweb.WebViewClient;
import js0.C46574u;
import p224ra.C89909e;
import t83.C48583f1;
import t83.C48590l;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi */
public class MMWebViewWithJsApi extends MMWebView {

    /* renamed from: t */
    public C44307k0 f119805t;

    /* renamed from: u */
    public boolean f119806u;

    public MMWebViewWithJsApi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C48590l getJsapi() {
        C44307k0 k0Var = this.f119805t;
        if (k0Var != null) {
            return k0Var.f120077g;
        }
        return null;
    }

    public void loadData(String str, String str2, String str3) {
        C44307k0 k0Var = this.f119805t;
        if (k0Var != null) {
            k0Var.f120091u = true;
            k0Var.mo68637g0("");
        }
        super.loadData(str, str2, str3);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        C44307k0 k0Var = this.f119805t;
        if (k0Var != null) {
            k0Var.f120091u = true;
            k0Var.mo68637g0("");
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void loadUrl(String str) {
        C44307k0 k0Var = this.f119805t;
        if (k0Var != null) {
            k0Var.f120091u = false;
            if (!k0Var.mo68637g0(str)) {
                super.loadUrl(str);
                return;
            }
            return;
        }
        super.loadUrl(str);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C44307k0 k0Var = this.f119805t;
        if (k0Var != null && this.f119806u) {
            k0Var.f120073c.removeCallbacks(k0Var.f120096z);
            try {
                k0Var.f120074d.mo68124cg(k0Var.f120072b.hashCode());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MMWebViewClient", e, "", new Object[0]);
            }
            C44307k0.C44335i iVar = k0Var.f120069A;
            if (iVar != null) {
                try {
                    k0Var.f120071a.unbindService(iVar);
                } catch (Exception e2) {
                    Log.m105920e("MicroMsg.MMWebViewClient", e2.getMessage());
                }
            }
            C48590l lVar = k0Var.f120077g;
            if (lVar != null) {
                lVar.mo73251p();
            }
            C48583f1 f1Var = k0Var.f120076f;
            if (f1Var != null) {
                Log.m105926v("MicroMsg.JsLoader", "detach");
                f1Var.f129968a = null;
                f1Var.f129969b = null;
                f1Var.f129970c = null;
            }
            k0Var.mo69049d0(233);
            k0Var.f120070B = null;
            k0Var.mo68628U();
        }
    }

    public void setCleanOnDetached(boolean z) {
        this.f119806u = z;
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C44307k0) {
            this.f119805t = (C44307k0) webViewClient;
        } else {
            this.f119805t = null;
        }
    }

    public MMWebViewWithJsApi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f119806u = true;
        mo70467Q();
        getSettings().setJavaScriptEnabled(true);
        boolean z = false;
        getSettings().setMixedContentMode(0);
        setWebChromeClient(new C44262h0(this));
        setWebViewClient(new C44307k0(this, false, (Bundle) null));
        String userAgentString = getSettings().getUserAgentString();
        QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
        if (!(userAgentString != null ? userAgentString.toLowerCase().contains("MicroMessenger/".toLowerCase()) : z)) {
            getSettings().setUserAgentString(C46574u.m51897a(getContext(), userAgentString, (C46574u.C46575a) C89909e.m112436a(C46574u.C46575a.class)));
        }
    }
}
