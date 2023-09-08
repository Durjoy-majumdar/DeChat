package qj1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kl1.C33936c;
import o40.C61926c;
import pi1.C62311l;
import qj1.C63006u7;
import rx3.C13598b0;

/* renamed from: qj1.x7 */
public final class C63103x7 implements Animator.AnimatorListener {

    /* renamed from: d */
    public boolean f179075d;

    /* renamed from: e */
    public final /* synthetic */ C63006u7 f179076e;

    /* renamed from: f */
    public final /* synthetic */ ViewGroup f179077f;

    /* renamed from: g */
    public final /* synthetic */ ObjectAnimator f179078g;

    /* renamed from: h */
    public final /* synthetic */ boolean f179079h;

    /* renamed from: qj1.x7$a */
    public static final class C63104a extends C87413o implements C32227p<Float, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63006u7 f179080d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63104a(C63006u7 u7Var) {
            super(2);
            this.f179080d = u7Var;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj).floatValue();
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C63006u7 u7Var = this.f179080d;
            C63006u7.C63008c cVar = u7Var.f178780A.get(u7Var.f178799v);
            if (cVar != null) {
                cVar.mo87963b(booleanValue);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.x7$b */
    public static final class C63105b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f179081d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f179082e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63105b(boolean z, ViewGroup viewGroup) {
            super(0);
            this.f179081d = z;
            this.f179082e = viewGroup;
        }

        public Object invoke() {
            if (!this.f179081d) {
                this.f179082e.setAlpha(1.0f);
            }
            this.f179082e.setVisibility(0);
            return C13598b0.f38549a;
        }
    }

    public C63103x7(C63006u7 u7Var, ViewGroup viewGroup, ObjectAnimator objectAnimator, boolean z) {
        this.f179076e = u7Var;
        this.f179077f = viewGroup;
        this.f179078g = objectAnimator;
        this.f179079h = z;
    }

    public void onAnimationCancel(Animator animator) {
        this.f179075d = true;
        Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "BulletInAnimator onAnimationCancel: isCancel=" + this.f179075d + ", bulletShowInfo:" + this.f179076e.f178780A.get(this.f179077f));
    }

    public void onAnimationEnd(Animator animator) {
        C62311l lVar;
        AtomicBoolean atomicBoolean;
        Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "BulletInAnimator onAnimationEnd: isCancel=" + this.f179075d + ", bulletShowInfo: " + this.f179076e.f178780A.get(this.f179077f));
        boolean z = false;
        if (this.f179075d) {
            this.f179075d = false;
            return;
        }
        C63006u7.C63008c cVar = this.f179076e.f178780A.get(this.f179077f);
        if (cVar != null) {
            cVar.f178809d = true;
        }
        C63006u7.C63008c cVar2 = this.f179076e.f178780A.get(this.f179077f);
        if (!(cVar2 == null || (atomicBoolean = cVar2.f178810e) == null || true != atomicBoolean.get())) {
            z = true;
        }
        if (!z) {
            ObjectAnimator objectAnimator = (ObjectAnimator) ((ConcurrentHashMap) this.f179076e.f178782C).get(this.f179077f);
            if (objectAnimator != null) {
                objectAnimator.start();
            }
        }
        ObjectAnimator objectAnimator2 = this.f179078g;
        if (objectAnimator2 != null) {
            C63006u7 u7Var = this.f179076e;
            long duration = objectAnimator2.getDuration();
            int i = C63006u7.f178772N;
            if (duration != ((long) (i + 500))) {
                objectAnimator2.setDuration((long) (i + 500));
                objectAnimator2.setEvaluator(new C33936c(500, i, new C63104a(u7Var)));
            }
        }
        if (this.f179076e.f178786G.containsKey(this.f179077f) && (lVar = this.f179076e.f178786G.get(this.f179077f)) != null) {
            lVar.mo86902b();
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        C62311l lVar;
        Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "BulletInAnimator onAnimationStart: " + this.f179076e.f178780A.get(this.f179077f));
        C61926c.m72668M(new C63105b(this.f179079h, this.f179077f));
        if (this.f179076e.f178786G.containsKey(this.f179077f) && (lVar = this.f179076e.f178786G.get(this.f179077f)) != null) {
            lVar.mo86901a();
        }
    }
}
