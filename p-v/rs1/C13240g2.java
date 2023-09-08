package rs1;

import android.animation.Animator;
import android.view.ViewGroup;
import de1.C7290r;
import jq3.C60905o;

/* renamed from: rs1.g2 */
public final class C13240g2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f37595d;

    /* renamed from: e */
    public final /* synthetic */ C13282j2 f37596e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f37597f;

    /* renamed from: rs1.g2$a */
    public static final class C13241a extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f37598d;

        /* renamed from: e */
        public final /* synthetic */ C13282j2 f37599e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f37600f;

        public C13241a(ViewGroup viewGroup, C13282j2 j2Var, C60905o oVar) {
            this.f37598d = viewGroup;
            this.f37599e = j2Var;
            this.f37600f = oVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f37598d.setAlpha(1.0f);
            this.f37599e.mo12755f3(this.f37600f);
        }
    }

    public C13240g2(ViewGroup viewGroup, C13282j2 j2Var, C60905o oVar) {
        this.f37595d = viewGroup;
        this.f37596e = j2Var;
        this.f37597f = oVar;
    }

    public final void run() {
        this.f37595d.setVisibility(0);
        this.f37595d.setAlpha(0.0f);
        this.f37595d.animate().alpha(1.0f).setDuration(250).setListener(new C13241a(this.f37595d, this.f37596e, this.f37597f)).start();
    }
}
