package v82;

import android.animation.Animator;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.model.C105853x;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.CollapseView;

/* renamed from: v82.i */
public class C111453i implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ CollapseView f333686d;

    /* renamed from: v82.i$a */
    public class C111454a implements Runnable {
        public C111454a() {
        }

        public void run() {
            C111453i.this.f333686d.f314960f.setTag(Boolean.TRUE);
            C111453i.this.f333686d.f314970s.setTag(Boolean.FALSE);
            CollapseView collapseView = C111453i.this.f333686d;
            collapseView.mo150907a(collapseView.f314963i);
            C111453i.this.f333686d.f314961g.setAlpha(0.0f);
            C111453i.this.f333686d.f314961g.animate().alpha(1.0f).setDuration(C111453i.this.f333686d.f314959e).start();
            C111453i.this.f333686d.mo150912f();
            if (C111453i.this.f333686d.f314969r != null && !C105851w0.zx0().f314509w) {
                C105853x.m142237h(1, C111453i.this.f333686d.f314969r, 2);
                C105851w0.zx0().f314509w = true;
            }
        }
    }

    public C111453i(CollapseView collapseView) {
        this.f333686d = collapseView;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f333686d.f314966o.post(new C111454a());
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
