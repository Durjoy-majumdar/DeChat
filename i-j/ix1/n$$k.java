package ix1;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.p014mm.C0966R;

public class n$$k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f124893d;

    /* renamed from: e */
    public final /* synthetic */ C46337n f124894e;

    /* renamed from: ix1.n$$k$a */
    public class C46338a implements Animation.AnimationListener {
        public C46338a() {
        }

        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            n$$k n__k = n$$k.this;
            if (n__k.f124893d) {
                C46337n nVar = n__k.f124894e;
                nVar.f124845K.setPath("assets://game/game_avatar_star.pag");
                nVar.f124845K.setVisibility(0);
                nVar.f124845K.setRepeatCount(1);
                nVar.f124845K.setProgress(0.0d);
                nVar.f124845K.play();
                nVar.f124845K.addListener(new C46350x(nVar));
            }
        }
    }

    public n$$k(C46337n nVar, boolean z) {
        this.f124894e = nVar;
        this.f124893d = z;
    }

    public void run() {
        Animation loadAnimation = this.f124893d ? AnimationUtils.loadAnimation(this.f124894e.f124838D, C0966R.C0968anim.f2419ar) : AnimationUtils.loadAnimation(this.f124894e.f124838D, C0966R.C0968anim.f2420as);
        this.f124894e.f124844J.startAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new C46338a());
    }
}
