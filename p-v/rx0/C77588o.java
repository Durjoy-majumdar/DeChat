package rx0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: rx0.o */
public final class C77588o extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C77587m f226199d;

    /* renamed from: e */
    public final /* synthetic */ C77589p f226200e;

    public C77588o(C77587m mVar, C77589p pVar) {
        this.f226199d = mVar;
        this.f226200e = pVar;
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animation");
        if (this.f226199d.getParent() != null) {
            Log.m105924i(this.f226200e.f226202b, "onAnimationEnd");
            if (!this.f226200e.f226201a.isDestroyed()) {
                Log.m105924i(this.f226200e.f226202b, "removeView");
                ViewParent parent = this.f226199d.getParent();
                C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(this.f226199d);
            }
        }
    }
}
