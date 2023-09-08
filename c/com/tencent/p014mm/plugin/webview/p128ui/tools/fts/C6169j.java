package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.j */
public class C6169j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f22634d;

    /* renamed from: e */
    public final /* synthetic */ int f22635e;

    /* renamed from: f */
    public final /* synthetic */ FTSSOSHomeWebViewUI f22636f;

    public C6169j(FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI, int i, int i2) {
        this.f22636f = fTSSOSHomeWebViewUI;
        this.f22634d = i;
        this.f22635e = i2;
    }

    public void run() {
        Log.m105925i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "showNavBarShadow %s %s", Integer.valueOf(this.f22634d), Integer.valueOf(this.f22635e));
        this.f22636f.f118986N3.setBackgroundColor(this.f22634d + (this.f22635e * TPMediaCodecProfileLevel.HEVCMainTierLevel62));
        View view = this.f22636f.f118986N3;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$19", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$19", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = this.f22636f;
        fTSSOSHomeWebViewUI.f118986N3.setOnClickListener(fTSSOSHomeWebViewUI.f119019u4);
        this.f22636f.f119010l4 = true;
    }
}
