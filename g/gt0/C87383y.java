package gt0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateInterpolator;
import android.widget.RatingBar;
import com.tencent.p014mm.plugin.appbrand.widget.dialog.C84926a;

/* renamed from: gt0.y */
public class C87383y implements RatingBar.OnRatingBarChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C84926a f253231a;

    public C87383y(C84926a aVar) {
        this.f253231a = aVar;
    }

    public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        C84926a aVar = this.f253231a;
        if (!aVar.f247531b) {
            aVar.f247531b = true;
            aVar.mo117762i((int) f);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar.f247539j, "alpha", new float[]{1.0f, 0.0f});
            ofFloat.addListener(new C87377p(aVar));
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aVar.f247542m, "alpha", new float[]{1.0f, 0.0f});
            ofFloat2.addListener(new C87379q(aVar));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
            animatorSet.setDuration(200);
            animatorSet.setInterpolator(new AccelerateInterpolator());
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(aVar.f247541l, "alpha", new float[]{0.0f, 1.0f});
            ofFloat3.addListener(new C87380r(aVar));
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(aVar.f247543n, "alpha", new float[]{0.0f, 1.0f});
            ofFloat4.addListener(new C87382s(aVar));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(new Animator[]{ofFloat3, ofFloat4});
            animatorSet2.setDuration(200);
            animatorSet2.setInterpolator(new AccelerateInterpolator());
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(new Animator[]{animatorSet, animatorSet2});
            animatorSet3.start();
            return;
        }
        aVar.mo117762i((int) f);
        if (f < 1.0f) {
            aVar.f247540k.setRating(1.0f);
        }
    }
}
