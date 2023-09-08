package p849e3;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: e3.r */
public final class C58525r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: d */
    public final View f167559d;

    /* renamed from: e */
    public ViewTreeObserver f167560e;

    /* renamed from: f */
    public final Runnable f167561f;

    public C58525r(View view, Runnable runnable) {
        this.f167559d = view;
        this.f167560e = view.getViewTreeObserver();
        this.f167561f = runnable;
    }

    /* renamed from: a */
    public static C58525r m67941a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            C58525r rVar = new C58525r(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(rVar);
            view.addOnAttachStateChangeListener(rVar);
            return rVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    /* renamed from: b */
    public void mo83435b() {
        if (this.f167560e.isAlive()) {
            this.f167560e.removeOnPreDrawListener(this);
        } else {
            this.f167559d.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f167559d.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo83435b();
        this.f167561f.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f167560e = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo83435b();
    }
}
