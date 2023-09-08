package androidx.compose.p002ui.platform;

import android.view.MotionEvent;
import gy3.C87412m;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$$d */
public final /* synthetic */ class AndroidComposeView$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AndroidComposeView f306027d;

    public /* synthetic */ AndroidComposeView$$d(AndroidComposeView androidComposeView) {
        this.f306027d = androidComposeView;
    }

    public final void run() {
        AndroidComposeView androidComposeView = this.f306027d;
        Class<?> cls = AndroidComposeView.f305954n1;
        C87412m.m108594g(androidComposeView, "this$0");
        boolean z = false;
        androidComposeView.f305998g1 = false;
        MotionEvent motionEvent = androidComposeView.f305988a1;
        C87412m.m108591d(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            z = true;
        }
        if (z) {
            androidComposeView.mo144616H(motionEvent);
            return;
        }
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
    }
}
