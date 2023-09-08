package qj1;

import android.view.ViewTreeObserver;

/* renamed from: qj1.kf */
public final class C12488kf implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ C12399ff f35917d;

    public C12488kf(C12399ff ffVar) {
        this.f35917d = ffVar;
    }

    public void onGlobalLayout() {
        if (this.f35917d.f35719C.getVisibility() == 0) {
            this.f35917d.f35719C.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            C12399ff ffVar = this.f35917d;
            ffVar.mo12090p1(ffVar.f35719C, true);
        }
    }
}
