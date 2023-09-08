package vt0;

import android.view.animation.Animation;
import com.tencent.p014mm.C0966R;

/* renamed from: vt0.f */
public class C22783f implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C22784g f65509a;

    public C22783f(C22784g gVar) {
        this.f65509a = gVar;
    }

    public void onAnimationEnd(Animation animation) {
        this.f65509a.setBackgroundResource(C0966R.color.a8_);
        this.f65509a.f65521q = false;
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
