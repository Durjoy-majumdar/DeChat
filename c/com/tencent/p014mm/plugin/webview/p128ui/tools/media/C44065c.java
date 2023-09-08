package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import android.view.View;
import android.widget.ProgressBar;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.c */
public final class C44065c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MPVideoPlayFullScreenView f119403d;

    public C44065c(MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        this.f119403d = mPVideoPlayFullScreenView;
    }

    public final void run() {
        ProgressBar progressBar;
        ProgressBar progressBar2 = this.f119403d.f119332B;
        if ((progressBar2 != null && progressBar2.getVisibility() == 0) && (progressBar = this.f119403d.f119332B) != null) {
            progressBar.setVisibility(8);
        }
        MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119403d;
        if (!mPVideoPlayFullScreenView.f119335E) {
            View view = mPVideoPlayFullScreenView.f119364q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$hideLoading$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$hideLoading$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
