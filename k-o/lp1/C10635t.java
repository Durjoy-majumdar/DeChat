package lp1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import dp1.C7434f1;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: lp1.t */
public final class C10635t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C10628q f32046d;

    public C10635t(C10628q qVar) {
        this.f32046d = qVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/share/FinderShareSideGuideUIC$innerShow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C10628q qVar = this.f32046d;
        if (qVar.f31971e) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qVar.f31970d, "alpha", new float[]{1.0f, 0.0f});
            qVar.f32034t = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(280);
            }
            Animator animator = qVar.f32034t;
            if (animator != null) {
                animator.addListener(new C10633r(qVar));
            }
            Animator animator2 = qVar.f32034t;
            if (animator2 != null) {
                animator2.start();
            }
        }
        C7434f1.f25625a.mo8576b(this.f32046d.getActivity(), 5, "right");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/share/FinderShareSideGuideUIC$innerShow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
