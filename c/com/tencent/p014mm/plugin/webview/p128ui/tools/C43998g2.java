package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.model.C43704h2;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.g2 */
public class C43998g2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f119203d;

    public C43998g2(WebViewUI webViewUI) {
        this.f119203d = webViewUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/WebViewUI$46", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        WebViewUI webViewUI = this.f119203d;
        if (!webViewUI.f118577x1 && !webViewUI.f118581y1 && !webViewUI.isFinishing()) {
            C43522y yVar = webViewUI.f118513b1;
            if (yVar != null) {
                yVar.mo67706Z0(yVar.mo63683n0(), true, 8);
            }
            View view2 = webViewUI.f118536j1;
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "refresh", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "refresh", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C43704h2.C43711h j = webViewUI.f118459E1.mo68012j();
            j.mo68019a(webViewUI.mo6901n0(), 4);
            C115669n.INSTANCE.mo160137l(11576, j.f118154a);
        }
        WebViewUI webViewUI2 = this.f119203d;
        if (webViewUI2.f118550p != null && webViewUI2.mo68237H8()) {
            webViewUI2.f118550p.setVisibility(0);
            webViewUI2.f118558r1 = true;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$46", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
