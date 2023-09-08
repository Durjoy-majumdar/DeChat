package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.k */
public class C6170k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FTSSOSHomeWebViewUI f22637d;

    public C6170k(FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI) {
        this.f22637d = fTSSOSHomeWebViewUI;
    }

    public void run() {
        Log.m105924i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "hideNavBarShadow");
        View view = this.f22637d.f118986N3;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$21", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$21", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f22637d.f119010l4 = false;
    }
}
