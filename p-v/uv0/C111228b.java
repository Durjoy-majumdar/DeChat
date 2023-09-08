package uv0;

import android.animation.Animator;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import uv0.C111231e;
import yv0.C112505b;

/* renamed from: uv0.b */
public class C111228b implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C111231e.C111232a f333067d;

    /* renamed from: e */
    public final /* synthetic */ C111231e f333068e;

    public C111228b(C111231e eVar, C111231e.C111232a aVar) {
        this.f333068e = eVar;
        this.f333067d = aVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        C111231e.C111232a aVar;
        BallInfo ballInfo;
        C112505b bVar = this.f333068e.f333090h;
        if (bVar != null && (aVar = this.f333067d) != null && (ballInfo = aVar.f333105z) != null) {
            bVar.mo145798d(ballInfo, aVar.f333093A);
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
