package wi1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import nj3.C76901s0;
import rx3.C36570n;

/* renamed from: wi1.e */
public final class C66123e extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C66119d f190054d;

    public C66123e(C66119d dVar) {
        this.f190054d = dVar;
    }

    public void onAnimationEnd(Animator animator) {
        if (((C76901s0) ((C36570n) this.f190054d.f190044i).getValue()).isShowing()) {
            ((C76901s0) ((C36570n) this.f190054d.f190044i).getValue()).dismiss();
        }
        this.f190054d.mo90160c();
    }
}
