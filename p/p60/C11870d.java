package p60;

import android.view.View;
import android.view.animation.Animation;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import r60.C101350i;

/* renamed from: p60.d */
public final class C11870d implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C101350i<? extends Object> f34710a;

    public C11870d(C101350i<? extends Object> iVar) {
        this.f34710a = iVar;
    }

    public void onAnimationEnd(Animation animation) {
        C101350i<? extends Object> iVar = this.f34710a;
        View a = iVar != null ? iVar.mo140837a() : null;
        if (a != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(a, aVar.mo10232b(), "com/tencent/mm/loader/impr/DefaultImageLoaderAnimation$onLoadCompleted$1$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            a.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(a, "com/tencent/mm/loader/impr/DefaultImageLoaderAnimation$onLoadCompleted$1$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
