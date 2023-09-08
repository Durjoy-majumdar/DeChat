package dt0;

import android.animation.Animator;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e;

/* renamed from: dt0.b */
public final class C75443b implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandDesktopContainerView f221756d;

    /* renamed from: e */
    public final /* synthetic */ boolean f221757e;

    public C75443b(AppBrandDesktopContainerView appBrandDesktopContainerView, boolean z) {
        this.f221756d = appBrandDesktopContainerView;
        this.f221757e = z;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        C68691e eVar;
        AppBrandDesktopContainerView appBrandDesktopContainerView = this.f221756d;
        appBrandDesktopContainerView.f197230j = false;
        if (this.f221757e && (eVar = appBrandDesktopContainerView.f197226f) != null) {
            eVar.mo94418r();
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
