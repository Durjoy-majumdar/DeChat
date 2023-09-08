package fb2;

import android.widget.FrameLayout;
import fb2.C58939f;

/* renamed from: fb2.e */
public final class C58938e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C58939f.C58940a f168640d;

    /* renamed from: e */
    public final /* synthetic */ FrameLayout f168641e;

    /* renamed from: f */
    public final /* synthetic */ String f168642f;

    public C58938e(C58939f.C58940a aVar, FrameLayout frameLayout, String str) {
        this.f168640d = aVar;
        this.f168641e = frameLayout;
        this.f168642f = str;
    }

    public final void run() {
        this.f168640d.mo84151r(this.f168641e, this.f168642f);
    }
}
