package qj1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.RelativeLayout;
import com.tencent.p014mm.p136ui.C75044y4;
import o40.C61926c;

/* renamed from: qj1.x0 */
public final class C63098x0 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C62889n0 f179057d;

    /* renamed from: e */
    public final /* synthetic */ boolean f179058e;

    public C63098x0(C62889n0 n0Var, boolean z) {
        this.f179057d = n0Var;
        this.f179058e = z;
    }

    public void onAnimationEnd(Animator animator) {
        this.f179057d.f166287d.setVisibility(8);
        this.f179057d.f178471p0.mo85376d();
        this.f179057d.f178480x0.mo85430c(false);
        RelativeLayout relativeLayout = this.f179057d.f178468Y.f172243a;
        relativeLayout.setTranslationY((float) C75044y4.m89990b(relativeLayout.getContext()).y);
        RelativeLayout relativeLayout2 = this.f179057d.f178469Z.f172605a;
        relativeLayout2.setTranslationY((float) C75044y4.m89990b(relativeLayout2.getContext()).y);
        this.f179057d.f178473r.setTranslationY(0.0f);
        if (this.f179058e) {
            C62889n0 n0Var = this.f179057d;
            n0Var.getClass();
            C61926c.m72668M(new C63115y0(n0Var));
        }
    }
}
