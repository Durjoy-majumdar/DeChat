package s32;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.ShuffleView;
import java.util.ArrayList;

/* renamed from: s32.i */
public class C22295i implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ ShuffleView f63204d;

    public C22295i(ShuffleView shuffleView) {
        this.f63204d = shuffleView;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        ShuffleView shuffleView = this.f63204d;
        ((ArrayList) shuffleView.f53082d).remove(shuffleView.f53091p);
        ValueAnimator valueAnimator = this.f63204d.f53084f;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        ShuffleView shuffleView2 = this.f63204d;
        shuffleView2.mo23922i(shuffleView2.f53094s);
        ShuffleView shuffleView3 = this.f63204d;
        if (shuffleView3.f53097v > 0) {
            shuffleView3.f53094s = (int) (Math.random() * ((double) shuffleView3.f53097v));
            ShuffleView shuffleView4 = this.f63204d;
            shuffleView4.f53093r = (View) ((ArrayList) shuffleView4.f53082d).get(shuffleView4.f53094s);
            return;
        }
        shuffleView3.f53093r = null;
        shuffleView3.f53094s = 0;
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
