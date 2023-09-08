package qj1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import gy3.C87412m;
import rx3.C36570n;

/* renamed from: qj1.fd */
public final class C62774fd implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f178186d;

    /* renamed from: e */
    public final /* synthetic */ View f178187e;

    /* renamed from: f */
    public final /* synthetic */ C62712dd f178188f;

    /* renamed from: g */
    public final /* synthetic */ C62966ri f178189g;

    /* renamed from: qj1.fd$a */
    public static final class C62775a implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C62712dd f178190d;

        /* renamed from: e */
        public final /* synthetic */ View f178191e;

        /* renamed from: f */
        public final /* synthetic */ C62966ri f178192f;

        public C62775a(C62712dd ddVar, View view, C62966ri riVar) {
            this.f178190d = ddVar;
            this.f178191e = view;
            this.f178192f = riVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = this.f178190d.f178066v;
            if (viewGroup != null) {
                viewGroup.removeView(this.f178191e);
                ViewGroup.LayoutParams layoutParams = this.f178190d.f178061q.getLayoutParams();
                layoutParams.height = -2;
                this.f178190d.f178061q.setLayoutParams(layoutParams);
                ScrollView scrollView = this.f178190d.f178067w;
                if (scrollView != null) {
                    scrollView.setScrollY(0);
                    this.f178192f.mo12178Q();
                    return;
                }
                C87412m.m108603p("promoteBubbleContainerScrollView");
                throw null;
            }
            C87412m.m108603p("promoteBubbleContainer");
            throw null;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public C62774fd(View view, View view2, C62712dd ddVar, C62966ri riVar) {
        this.f178186d = view;
        this.f178187e = view2;
        this.f178188f = ddVar;
        this.f178189g = riVar;
    }

    public final void run() {
        int i;
        View view = this.f178186d;
        if (view != null) {
            i = view.getHeight();
            int height = this.f178187e.getHeight();
            if (i < height) {
                i = height;
            }
        } else {
            i = 0;
        }
        C62712dd ddVar = this.f178188f;
        ScrollView scrollView = ddVar.f178067w;
        if (scrollView != null) {
            ObjectAnimator duration = ObjectAnimator.ofInt(scrollView, "scrollY", new int[]{0, i + ((Number) ((C36570n) ddVar.f178058E).getValue()).intValue()}).setDuration(200);
            C87412m.m108593f(duration, "ofInt(promoteBubbleConta…rHeight).setDuration(200)");
            duration.addListener(new C62775a(this.f178188f, this.f178186d, this.f178189g));
            duration.start();
            return;
        }
        C87412m.m108603p("promoteBubbleContainerScrollView");
        throw null;
    }
}
