package qj1;

import android.animation.Animator;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.concurrent.atomic.AtomicBoolean;
import o40.C61926c;
import qj1.C63006u7;
import rx3.C13598b0;

/* renamed from: qj1.y7 */
public final class C63125y7 implements Animator.AnimatorListener {

    /* renamed from: d */
    public boolean f179131d;

    /* renamed from: e */
    public final /* synthetic */ C63006u7 f179132e;

    /* renamed from: f */
    public final /* synthetic */ ViewGroup f179133f;

    /* renamed from: qj1.y7$a */
    public static final class C63126a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f179134d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63126a(ViewGroup viewGroup) {
            super(0);
            this.f179134d = viewGroup;
        }

        public Object invoke() {
            if (C63006u7.f178779V) {
                this.f179134d.setVisibility(8);
            } else {
                this.f179134d.setVisibility(4);
            }
            return C13598b0.f38549a;
        }
    }

    public C63125y7(C63006u7 u7Var, ViewGroup viewGroup) {
        this.f179132e = u7Var;
        this.f179133f = viewGroup;
    }

    public void onAnimationCancel(Animator animator) {
        this.f179131d = true;
        Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "BulletOutAnimator onAnimationCancel: isCancel=" + this.f179131d + ", bulletShowInfo:" + this.f179132e.f178780A.get(this.f179133f));
    }

    public void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean;
        Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "BulletOutAnimator onAnimationEnd: isCancel=" + this.f179131d + ", bulletShowInfo: " + this.f179132e.f178780A.get(this.f179133f));
        if (this.f179131d) {
            this.f179131d = false;
            return;
        }
        C61926c.m72668M(new C63126a(this.f179133f));
        C63006u7.C63008c cVar = this.f179132e.f178780A.get(this.f179133f);
        boolean z = true;
        if (cVar == null || (atomicBoolean = cVar.f178810e) == null || true != atomicBoolean.get()) {
            z = false;
        }
        if (z) {
            this.f179132e.f178789J = false;
        }
        C63006u7.C63008c cVar2 = this.f179132e.f178780A.get(this.f179133f);
        if (cVar2 != null) {
            cVar2.mo87962a();
        }
        this.f179132e.mo87952n1();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "BulletOutAnimator onAnimationStart: " + this.f179132e.f178780A.get(this.f179133f));
    }
}
