package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import android.view.View;
import android.view.animation.Animation;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.b */
public final class C44064b implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ MPVideoPlayFullScreenView f119402a;

    public C44064b(MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        this.f119402a = mPVideoPlayFullScreenView;
    }

    public void onAnimationEnd(Animation animation) {
        C87412m.m108594g(animation, "animation");
        MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119402a;
        if (!mPVideoPlayFullScreenView.f119372x0) {
            View view = mPVideoPlayFullScreenView.f119359j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "hideToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "hideToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = mPVideoPlayFullScreenView.f119358i;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "hideToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "hideToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view4 = mPVideoPlayFullScreenView.f119355f;
            if (view4 != null) {
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "hideToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "hideToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public void onAnimationRepeat(Animation animation) {
        C87412m.m108594g(animation, "animation");
    }

    public void onAnimationStart(Animation animation) {
        C87412m.m108594g(animation, "animation");
    }
}
