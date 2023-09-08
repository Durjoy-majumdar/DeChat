package p194lc;

import android.view.View;

/* renamed from: lc.o$$d$$a */
public final /* synthetic */ class o$$d$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f255481d;

    /* renamed from: e */
    public final /* synthetic */ View.OnAttachStateChangeListener f255482e;

    public /* synthetic */ o$$d$$a(View view, View.OnAttachStateChangeListener onAttachStateChangeListener) {
        this.f255481d = view;
        this.f255482e = onAttachStateChangeListener;
    }

    public final void run() {
        this.f255481d.removeOnAttachStateChangeListener(this.f255482e);
    }
}
