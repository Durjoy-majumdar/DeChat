package qj1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import il1.C60390e2;
import il1.C60557z1;
import o40.C61926c;

/* renamed from: qj1.t0 */
public final class C62986t0 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C62889n0 f178714d;

    public C62986t0(C62889n0 n0Var) {
        this.f178714d = n0Var;
    }

    public void onAnimationEnd(Animator animator) {
        C62889n0.m74012Z0(this.f178714d, false);
        C60557z1 z1Var = this.f178714d.f178469Z;
        z1Var.getClass();
        FinderLiveService.f159376d.getClass();
        z1Var.mo85525c(FinderLiveService.f159391u);
        z1Var.f172608d.notifyDataSetChanged();
        z1Var.f172605a.setVisibility(0);
        C61926c.m72668M(new C60390e2(z1Var));
    }
}
