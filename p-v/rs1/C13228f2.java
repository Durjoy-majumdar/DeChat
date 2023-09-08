package rs1;

import android.animation.Animator;
import android.view.ViewGroup;
import de1.C7290r;

/* renamed from: rs1.f2 */
public final class C13228f2 extends C7290r {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f37572d;

    public C13228f2(ViewGroup viewGroup) {
        this.f37572d = viewGroup;
    }

    public void onAnimationEnd(Animator animator) {
        this.f37572d.setAlpha(1.0f);
        this.f37572d.setVisibility(8);
    }
}
