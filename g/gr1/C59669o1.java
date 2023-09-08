package gr1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: gr1.o1 */
public final class C59669o1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderVideoLayout f170489d;

    public C59669o1(FinderVideoLayout finderVideoLayout) {
        this.f170489d = finderVideoLayout;
    }

    public final void run() {
        this.f170489d.getRetryBtn().animate().cancel();
        C59667n2 seekBarLayout = this.f170489d.getSeekBarLayout();
        if (seekBarLayout != null) {
            seekBarLayout.setVisibility(0);
        }
        View retryBtn = this.f170489d.getRetryBtn();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = retryBtn;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$dismissRetryBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        retryBtn.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$dismissRetryBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
