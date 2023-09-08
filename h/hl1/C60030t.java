package hl1;

import android.view.View;

/* renamed from: hl1.t */
public final class C60030t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f171334d;

    /* renamed from: hl1.t$a */
    public static final class C60031a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f171335d;

        public C60031a(View view) {
            this.f171335d = view;
        }

        public final void run() {
            this.f171335d.animate().alpha(1.0f).setDuration(500).start();
        }
    }

    public C60030t(View view) {
        this.f171334d = view;
    }

    public final void run() {
        View view = this.f171334d;
        view.post(new C60031a(view));
    }
}
