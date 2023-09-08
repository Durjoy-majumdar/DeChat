package p853i4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.transition.Visibility;

/* renamed from: i4.a0 */
public class C108336a0 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C108357s f324358d;

    /* renamed from: e */
    public final /* synthetic */ View f324359e;

    public C108336a0(Visibility visibility, C108357s sVar, View view) {
        this.f324358d = sVar;
        this.f324359e = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f324358d.mo158849a(this.f324359e);
    }
}
