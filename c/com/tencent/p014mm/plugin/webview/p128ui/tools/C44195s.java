package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Intent;
import android.net.Uri;
import j20.C117292a;
import java.util.HashMap;
import k20.C9556a;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.s */
public class C44195s implements C76879j.C11180n {

    /* renamed from: a */
    public final /* synthetic */ QRCodeIntroductionWebViewUI f119730a;

    public C44195s(QRCodeIntroductionWebViewUI qRCodeIntroductionWebViewUI) {
        this.f119730a = qRCodeIntroductionWebViewUI;
    }

    /* renamed from: j */
    public void mo782j(int i) {
        if (i == 0) {
            this.f119730a.f118508Z.mo73237f0((HashMap<String, String>) null, 0);
        } else if (i == 1) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f119730a.mo6901n0()));
            QRCodeIntroductionWebViewUI qRCodeIntroductionWebViewUI = this.f119730a;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            QRCodeIntroductionWebViewUI qRCodeIntroductionWebViewUI2 = qRCodeIntroductionWebViewUI;
            C117292a.m165358d(qRCodeIntroductionWebViewUI2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/QRCodeIntroductionWebViewUI$3", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            qRCodeIntroductionWebViewUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(qRCodeIntroductionWebViewUI2, "com/tencent/mm/plugin/webview/ui/tools/QRCodeIntroductionWebViewUI$3", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
