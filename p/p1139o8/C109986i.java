package p1139o8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: o8.i */
public final class C109986i {

    /* renamed from: a */
    public final ArrayList<C109988b> f329147a = new ArrayList<>();

    /* renamed from: b */
    public ValueAnimator f329148b = null;

    /* renamed from: c */
    public final Animator.AnimatorListener f329149c = new C109987a();

    /* renamed from: o8.i$a */
    public class C109987a extends AnimatorListenerAdapter {
        public C109987a() {
        }

        public void onAnimationEnd(Animator animator) {
            C109986i iVar = C109986i.this;
            if (iVar.f329148b == animator) {
                iVar.f329148b = null;
            }
        }
    }

    /* renamed from: o8.i$b */
    public static class C109988b {
        public C109988b(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: a */
    public void mo161321a(int[] iArr, ValueAnimator valueAnimator) {
        C109988b bVar = new C109988b(iArr, valueAnimator);
        valueAnimator.addListener(this.f329149c);
        this.f329147a.add(bVar);
    }
}
