package hl1;

import android.view.View;

/* renamed from: hl1.s */
public final class C8582s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f27670d;

    public C8582s(View view) {
        this.f27670d = view;
    }

    public final void run() {
        this.f27670d.animate().alpha(1.0f).setDuration(500).start();
    }
}
