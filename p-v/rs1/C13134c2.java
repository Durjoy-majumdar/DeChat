package rs1;

import android.animation.Animator;
import android.view.ViewGroup;
import de1.C7290r;
import jq3.C60905o;

/* renamed from: rs1.c2 */
public final class C13134c2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f37372d;

    /* renamed from: e */
    public final /* synthetic */ C13180d2 f37373e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f37374f;

    /* renamed from: rs1.c2$a */
    public static final class C13135a extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f37375d;

        /* renamed from: e */
        public final /* synthetic */ C13180d2 f37376e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f37377f;

        public C13135a(ViewGroup viewGroup, C13180d2 d2Var, C60905o oVar) {
            this.f37375d = viewGroup;
            this.f37376e = d2Var;
            this.f37377f = oVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f37375d.setAlpha(1.0f);
            this.f37376e.mo12755f3(this.f37377f);
        }
    }

    public C13134c2(ViewGroup viewGroup, C13180d2 d2Var, C60905o oVar) {
        this.f37372d = viewGroup;
        this.f37373e = d2Var;
        this.f37374f = oVar;
    }

    public final void run() {
        this.f37372d.setVisibility(0);
        this.f37372d.setAlpha(0.0f);
        this.f37372d.animate().alpha(1.0f).setDuration(250).setListener(new C13135a(this.f37372d, this.f37373e, this.f37374f)).start();
    }
}
