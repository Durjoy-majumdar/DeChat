package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import android.view.View;
import android.widget.ProgressBar;
import com.tencent.p014mm.pluginsdk.p133ui.tools.RedesignVideoPlayerSeekBar;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.n */
public final class C44078n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f119423d;

    /* renamed from: e */
    public final /* synthetic */ MPVideoPlayFullScreenView f119424e;

    public C44078n(boolean z, MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        this.f119423d = z;
        this.f119424e = mPVideoPlayFullScreenView;
    }

    public final void run() {
        if (this.f119423d) {
            View view = this.f119424e.f119364q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$updatePlayBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$updatePlayBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            ProgressBar progressBar = this.f119424e.f119332B;
            if (!(progressBar != null && progressBar.getVisibility() == 0)) {
                View view3 = this.f119424e.f119364q;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$updatePlayBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$updatePlayBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119424e;
        RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = mPVideoPlayFullScreenView.f119374z;
        if (redesignVideoPlayerSeekBar != null) {
            redesignVideoPlayerSeekBar.setIsPlay(mPVideoPlayFullScreenView.f119335E);
        }
    }
}
