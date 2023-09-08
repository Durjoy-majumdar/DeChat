package androidx.compose.p002ui.platform;

import android.view.MotionEvent;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$$k */
public final class AndroidComposeView$$k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AndroidComposeView f306034d;

    public AndroidComposeView$$k(AndroidComposeView androidComposeView) {
        this.f306034d = androidComposeView;
    }

    public void run() {
        this.f306034d.removeCallbacks(this);
        MotionEvent motionEvent = this.f306034d.f305988a1;
        if (motionEvent != null) {
            boolean z = false;
            boolean z2 = motionEvent.getToolType(0) == 3;
            int actionMasked = motionEvent.getActionMasked();
            if (!z2 ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                z = true;
            }
            if (z) {
                int i = (actionMasked == 7 || actionMasked == 9) ? 7 : 2;
                AndroidComposeView androidComposeView = this.f306034d;
                androidComposeView.mo144617I(motionEvent, i, androidComposeView.f305989b1, false);
            }
        }
    }
}
