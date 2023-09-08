package androidx.compose.p002ui.platform;

import a14.C53973z1;
import android.view.View;
import gy3.C87412m;
import java.util.concurrent.CancellationException;

/* renamed from: androidx.compose.ui.platform.r2 */
public final class C54185r2 implements View.OnAttachStateChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C53973z1 f152134d;

    public C54185r2(C53973z1 z1Var) {
        this.f152134d = z1Var;
    }

    public void onViewAttachedToWindow(View view) {
        C87412m.m108594g(view, "v");
    }

    public void onViewDetachedFromWindow(View view) {
        C87412m.m108594g(view, "v");
        view.removeOnAttachStateChangeListener(this);
        C53973z1.C53974a.m60623a(this.f152134d, (CancellationException) null, 1, (Object) null);
    }
}
