package p849e3;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: e3.a0 */
public final class C107168a0 {

    /* renamed from: a */
    public WeakReference<View> f320755a;

    /* renamed from: e3.a0$a */
    public class C107169a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C107176d0 f320756d;

        /* renamed from: e */
        public final /* synthetic */ View f320757e;

        public C107169a(C107168a0 a0Var, C107176d0 d0Var, View view) {
            this.f320756d = d0Var;
            this.f320757e = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f320756d.mo143483a(this.f320757e);
        }
    }

    public C107168a0(View view) {
        this.f320755a = new WeakReference<>(view);
    }

    /* renamed from: a */
    public C107168a0 mo157605a(float f) {
        View view = this.f320755a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public void mo157606b() {
        View view = this.f320755a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public C107168a0 mo157607c(long j) {
        View view = this.f320755a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: d */
    public C107168a0 mo157608d(C107173b0 b0Var) {
        View view = this.f320755a.get();
        if (view != null) {
            if (b0Var != null) {
                view.animate().setListener(new C107223z(this, b0Var, view));
            } else {
                view.animate().setListener((Animator.AnimatorListener) null);
            }
        }
        return this;
    }

    /* renamed from: e */
    public C107168a0 mo157609e(C107176d0 d0Var) {
        View view = this.f320755a.get();
        if (view != null) {
            C107169a aVar = null;
            if (d0Var != null) {
                aVar = new C107169a(this, d0Var, view);
            }
            view.animate().setUpdateListener(aVar);
        }
        return this;
    }

    /* renamed from: f */
    public void mo157610f() {
        View view = this.f320755a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: g */
    public C107168a0 mo157611g(float f) {
        View view = this.f320755a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
