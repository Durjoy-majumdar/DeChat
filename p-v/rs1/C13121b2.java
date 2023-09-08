package rs1;

import android.animation.Animator;
import android.view.ViewGroup;
import de1.C7290r;

/* renamed from: rs1.b2 */
public final class C13121b2 extends C7290r {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f37350d;

    public C13121b2(ViewGroup viewGroup) {
        this.f37350d = viewGroup;
    }

    public void onAnimationEnd(Animator animator) {
        this.f37350d.setAlpha(1.0f);
        this.f37350d.setVisibility(8);
    }
}
