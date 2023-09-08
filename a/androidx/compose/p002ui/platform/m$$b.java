package androidx.compose.p002ui.platform;

import android.view.View;
import gy3.C87412m;

/* renamed from: androidx.compose.ui.platform.m$$b */
public final class m$$b implements View.OnAttachStateChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C103662m f306179d;

    public m$$b(C103662m mVar) {
        this.f306179d = mVar;
    }

    public void onViewAttachedToWindow(View view) {
        C87412m.m108594g(view, "view");
    }

    public void onViewDetachedFromWindow(View view) {
        C87412m.m108594g(view, "view");
        C103662m mVar = this.f306179d;
        mVar.f306162h.removeCallbacks(mVar.f306156A);
    }
}
