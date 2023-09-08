package ue0;

import android.view.View;

/* renamed from: ue0.d */
public final class C78155d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f229008d;

    public C78155d(View view) {
        this.f229008d = view;
    }

    public final void run() {
        View view = this.f229008d;
        if (view != null) {
            view.requestLayout();
        }
    }
}
