package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.tencent.p014mm.plugin.webview.model.C43704h2;
import com.tencent.p014mm.sdk.platformtools.Log;
import y93.C53513a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$y */
public class WebViewUI$$y implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CheckBox f118660d;

    /* renamed from: e */
    public final /* synthetic */ WebViewUI f118661e;

    public WebViewUI$$y(WebViewUI webViewUI, CheckBox checkBox) {
        this.f118661e = webViewUI;
        this.f118660d = checkBox;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        CheckBox checkBox = this.f118660d;
        if (checkBox != null && checkBox.isChecked()) {
            try {
                if (this.f118661e.f118511a1.mo68094Fu()) {
                    this.f118661e.f118511a1.Yu0(327792, 1);
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WebViewUI", "tryShowCloseWindowConfirmInfo, ex = " + e.getMessage());
            }
        }
        WebViewUI webViewUI = this.f118661e;
        webViewUI.f118577x1 = true;
        webViewUI.f118533i1 = null;
        C44130p1.f119545i.mo68770a();
        C43704h2.C6037e.m5916a(this.f118661e.getCurrentURL(), 1);
        C53513a aVar = this.f118661e.f118483Q1;
        if (aVar == null || !aVar.mo67896U(1, aVar.f150464v)) {
            this.f118661e.finish();
        }
    }
}
