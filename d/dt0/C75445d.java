package dt0;

import android.animation.Animator;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: dt0.d */
public class C75445d implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandDesktopDragView f221761d;

    public C75445d(AppBrandDesktopDragView appBrandDesktopDragView) {
        this.f221761d = appBrandDesktopDragView;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        AppBrandDesktopDragView appBrandDesktopDragView = this.f221761d;
        appBrandDesktopDragView.getClass();
        Log.m105925i("MicroMsg.DragFeatureView", "alvinluo enableScroll %b", Boolean.TRUE);
        appBrandDesktopDragView.f197312z = true;
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
