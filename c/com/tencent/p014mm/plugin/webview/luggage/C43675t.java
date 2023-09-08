package com.tencent.p014mm.plugin.webview.luggage;

import com.tencent.p014mm.p136ui.KeyboardLinearLayout;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewKeyboardLinearLayout;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input.WebViewInputFooter;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.luggage.t */
public class C43675t implements KeyboardLinearLayout.C44683b {

    /* renamed from: a */
    public final /* synthetic */ C43658n f118044a;

    public C43675t(C43658n nVar) {
        this.f118044a = nVar;
    }

    /* renamed from: a */
    public void mo67991a(int i) {
        Log.m105924i("MicroMsg.LuggageMMWebPage", "onKeyBoardStateChange, state = " + i);
        C43658n nVar = this.f118044a;
        if (!nVar.f117940X) {
            Log.m105924i("MicroMsg.LuggageMMWebPage", "background ignored");
            return;
        }
        WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = nVar.f117952v;
        if (i == -3) {
            nVar.getClass();
            nVar.f117925P.post(new C43677u(nVar, webViewKeyboardLinearLayout.getKeyBoardHeight()));
        } else {
            nVar.f117925P.post(new C43681v(nVar));
        }
        if (i == -3) {
            WebViewInputFooter webViewInputFooter = this.f118044a.f117953w;
            if (webViewInputFooter != null && webViewInputFooter.getVisibility() == 0) {
                WebViewInputFooter webViewInputFooter2 = this.f118044a.f117953w;
                if (webViewInputFooter2.f119994s) {
                    webViewInputFooter2.setVisibility(8);
                }
                webViewInputFooter2.f119985g = 0;
                webViewInputFooter2.mo68984b();
            }
            C43658n nVar2 = this.f118044a;
            nVar2.mo67940s(nVar2.f117952v.getKeyBoardHeight());
            return;
        }
        this.f118044a.mo67940s(0);
    }
}
