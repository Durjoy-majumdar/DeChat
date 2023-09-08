package androidx.compose.p002ui.platform;

import android.os.Handler;
import android.os.Looper;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$$n */
public final class AndroidComposeView$$n extends C87413o implements C32226l<C32224a<? extends C13598b0>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AndroidComposeView f306037d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$$n(AndroidComposeView androidComposeView) {
        super(1);
        this.f306037d = androidComposeView;
    }

    public Object invoke(Object obj) {
        C32224a aVar = (C32224a) obj;
        C87412m.m108594g(aVar, "command");
        Handler handler = this.f306037d.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            aVar.invoke();
        } else {
            Handler handler2 = this.f306037d.getHandler();
            if (handler2 != null) {
                handler2.post(new AndroidComposeView$$n$$a(aVar));
            }
        }
        return C13598b0.f38549a;
    }
}
