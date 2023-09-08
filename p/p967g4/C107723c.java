package p967g4;

import android.animation.Animator;
import p967g4.C107724d;

/* renamed from: g4.c */
public class C107723c implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C107724d.C107725a f322318d;

    /* renamed from: e */
    public final /* synthetic */ C107724d f322319e;

    public C107723c(C107724d dVar, C107724d.C107725a aVar) {
        this.f322319e = dVar;
        this.f322318d = aVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
        this.f322319e.mo158131a(1.0f, this.f322318d, true);
        C107724d.C107725a aVar = this.f322318d;
        aVar.f322339k = aVar.f322333e;
        aVar.f322340l = aVar.f322334f;
        aVar.f322341m = aVar.f322335g;
        aVar.mo158143a((aVar.f322338j + 1) % aVar.f322337i.length);
        C107724d dVar = this.f322319e;
        if (dVar.f322328i) {
            dVar.f322328i = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            C107724d.C107725a aVar2 = this.f322318d;
            if (aVar2.f322342n) {
                aVar2.f322342n = false;
                return;
            }
            return;
        }
        dVar.f322327h += 1.0f;
    }

    public void onAnimationStart(Animator animator) {
        this.f322319e.f322327h = 0.0f;
    }
}
