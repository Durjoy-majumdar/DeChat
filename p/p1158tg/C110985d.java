package p1158tg;

import android.animation.Animator;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: tg.d */
public class C110985d implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C110986e f332402d;

    public C110985d(C110986e eVar) {
        this.f332402d = eVar;
    }

    public void onAnimationCancel(Animator animator) {
        C110986e eVar = this.f332402d;
        eVar.f332399a = true;
        eVar.f332407g = 0.0f;
        eVar.f332408h = 0.0f;
    }

    public void onAnimationEnd(Animator animator) {
        C110986e eVar = this.f332402d;
        eVar.f332399a = true;
        eVar.f332407g = 0.0f;
        eVar.f332408h = 0.0f;
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        C110986e eVar = this.f332402d;
        eVar.f332399a = false;
        eVar.f332407g = 0.0f;
        eVar.f332408h = 0.0f;
        Log.m105918d("MicroMsg.StickBackAnim", "onAnimationStart");
    }
}
