package sb2;

import android.view.View;
import android.view.animation.Animation;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: sb2.y0 */
public final class C13649y0 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ View f38669a;

    /* renamed from: b */
    public final /* synthetic */ float f38670b;

    public C13649y0(View view, float f) {
        this.f38669a = view;
        this.f38670b = f;
    }

    public void onAnimationEnd(Animation animation) {
        View view = this.f38669a;
        float f = this.f38670b;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$doAlphaAnimation$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$doAlphaAnimation$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
