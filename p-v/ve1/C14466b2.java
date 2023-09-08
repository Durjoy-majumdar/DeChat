package ve1;

import android.animation.Animator;
import android.widget.ImageView;
import de1.C7290r;

/* renamed from: ve1.b2 */
public final class C14466b2 extends C7290r {

    /* renamed from: d */
    public final /* synthetic */ ImageView f40107d;

    public C14466b2(ImageView imageView) {
        this.f40107d = imageView;
    }

    public void onAnimationEnd(Animator animator) {
        this.f40107d.setVisibility(8);
        this.f40107d.setAlpha(1.0f);
        this.f40107d.setTag(Boolean.FALSE);
    }
}
