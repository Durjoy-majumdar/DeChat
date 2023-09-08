package gr1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: gr1.z1 */
public final class C59690z1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderVideoLayout f170519d;

    public C59690z1(FinderVideoLayout finderVideoLayout) {
        this.f170519d = finderVideoLayout;
    }

    public final void run() {
        this.f170519d.getRetryBtn().animate().cancel();
        View retryBtn = this.f170519d.getRetryBtn();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(retryBtn, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showRetryBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        retryBtn.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(retryBtn, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showRetryBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C59667n2 seekBarLayout = this.f170519d.getSeekBarLayout();
        if (seekBarLayout != null) {
            seekBarLayout.setVisibility(8);
        }
        this.f170519d.mo79576r();
    }
}
