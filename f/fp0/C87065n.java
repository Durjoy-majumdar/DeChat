package fp0;

import android.app.Activity;
import android.view.animation.Animation;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import in3.C87771d;

/* renamed from: fp0.n */
public final class C87065n implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C87060l f252646a;

    public C87065n(C87060l lVar) {
        this.f252646a = lVar;
    }

    public void onAnimationEnd(Animation animation) {
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(this.f252646a.getContext());
        if (castActivityOrNull != null) {
            C87771d.m109203b(castActivityOrNull).mo122181e();
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
