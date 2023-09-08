package gr1;

import android.animation.Animator;
import android.view.View;
import com.tencent.p014mm.plugin.finder.video.FinderLongVideoPlayerSeekBar;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import fy3.C32226l;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: gr1.y1 */
public final class C8433y1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderVideoLayout f27429d;

    /* renamed from: gr1.y1$a */
    public static final class C8434a implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ FinderVideoLayout f27430d;

        public C8434a(FinderVideoLayout finderVideoLayout) {
            this.f27430d = finderVideoLayout;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            View d = this.f27430d.getLoading();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(d, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            d.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(d, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View d2 = this.f27430d.getLoading();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            C117292a.m165358d(d2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(d2, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public C8433y1(FinderVideoLayout finderVideoLayout) {
        this.f27429d = finderVideoLayout;
    }

    public final void run() {
        C32226l<Boolean, C13598b0> onCustomLoadingStatusChange;
        FinderVideoLayout finderVideoLayout = this.f27429d;
        int i = FinderVideoLayout.f161844x0;
        finderVideoLayout.getClass();
        FinderVideoLayout finderVideoLayout2 = this.f27429d;
        if (finderVideoLayout2.f161868e) {
            C59670o2 videoView = finderVideoLayout2.getVideoView();
            boolean z = true;
            if (videoView == null || !videoView.getVideoViewFocused()) {
                z = false;
            }
            if (z) {
                FinderLongVideoPlayerSeekBar longVideoSeekBar = this.f27429d.getLongVideoSeekBar();
                if (longVideoSeekBar == null || (onCustomLoadingStatusChange = longVideoSeekBar.getOnCustomLoadingStatusChange()) == null) {
                    View d = this.f27429d.getLoading();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view = d;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    d.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View d2 = this.f27429d.getLoading();
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(Float.valueOf(0.0f));
                    View view2 = d2;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    d2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    this.f27429d.getLoading().animate().alpha(1.0f).setDuration(300).setListener(new C8434a(this.f27429d)).start();
                    return;
                }
                onCustomLoadingStatusChange.invoke(Boolean.TRUE);
            }
        }
    }
}
