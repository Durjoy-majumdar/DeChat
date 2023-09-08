package androidx.compose.p002ui.platform;

import android.os.SystemClock;
import android.view.MotionEvent;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$$j */
public final class AndroidComposeView$$j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AndroidComposeView f306033d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$$j(AndroidComposeView androidComposeView) {
        super(0);
        this.f306033d = androidComposeView;
    }

    public Object invoke() {
        int actionMasked;
        MotionEvent motionEvent = this.f306033d.f305988a1;
        if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
            this.f306033d.f305989b1 = SystemClock.uptimeMillis();
            AndroidComposeView androidComposeView = this.f306033d;
            androidComposeView.post(androidComposeView.f305994e1);
        }
        return C13598b0.f38549a;
    }
}
