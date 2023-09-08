package sb2;

import android.animation.Animator;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvSongInfoUIC;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: sb2.b1 */
public final class C13635b1 implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ View f38636d;

    /* renamed from: e */
    public final /* synthetic */ MusicMvSongInfoUIC f38637e;

    public C13635b1(View view, MusicMvSongInfoUIC musicMvSongInfoUIC) {
        this.f38636d = view;
        this.f38637e = musicMvSongInfoUIC;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.f38636d;
        View findViewById = view != null ? view.findViewById(C0966R.C0970id.epw) : null;
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            boolean z = false;
            aVar.mo10233c(0);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$showLongTryListen$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$showLongTryListen$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f38637e.getClass();
            if (1.0f == findViewById.getAlpha()) {
                z = true;
            }
            if (!z) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150);
                alphaAnimation.setAnimationListener(new C13649y0(findViewById, 1.0f));
                alphaAnimation.setFillAfter(true);
                findViewById.startAnimation(alphaAnimation);
            }
            this.f38637e.f163378n = true;
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
