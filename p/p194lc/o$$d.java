package p194lc;

import android.view.View;

/* renamed from: lc.o$$d */
public class o$$d implements View.OnAttachStateChangeListener {

    /* renamed from: d */
    public final /* synthetic */ View f255506d;

    public o$$d(C88453o oVar, View view) {
        this.f255506d = view;
    }

    public void onViewAttachedToWindow(View view) {
        View view2 = this.f255506d;
        view2.post(new o$$d$$a(view2, this));
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
