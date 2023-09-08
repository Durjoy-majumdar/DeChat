package rx0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: rx0.q */
public final class C77590q extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C77591r f226204d;

    /* renamed from: e */
    public final /* synthetic */ View f226205e;

    public C77590q(C77591r rVar, View view) {
        this.f226204d = rVar;
        this.f226205e = view;
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animation");
        Log.m105924i(this.f226204d.f226207b, "onAnimationEnd");
        if (!this.f226204d.f226206a.isDestroyed()) {
            Log.m105924i(this.f226204d.f226207b, "removeView");
            ViewParent parent = this.f226205e.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this.f226205e);
        }
    }
}
