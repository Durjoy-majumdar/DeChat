package androidx.compose.p002ui.platform;

import android.view.View;
import gy3.C87412m;
import p175j0.C60661k1;

/* renamed from: androidx.compose.ui.platform.u2 */
public final class C54190u2 implements View.OnAttachStateChangeListener {

    /* renamed from: d */
    public final /* synthetic */ View f152141d;

    /* renamed from: e */
    public final /* synthetic */ C60661k1 f152142e;

    public C54190u2(View view, C60661k1 k1Var) {
        this.f152141d = view;
        this.f152142e = k1Var;
    }

    public void onViewAttachedToWindow(View view) {
        C87412m.m108594g(view, "v");
    }

    public void onViewDetachedFromWindow(View view) {
        C87412m.m108594g(view, "v");
        this.f152141d.removeOnAttachStateChangeListener(this);
        this.f152142e.mo85596u();
    }
}
