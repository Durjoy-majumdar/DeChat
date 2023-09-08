package zp3;

import android.view.View;
import gy3.C87412m;

/* renamed from: zp3.l */
public final class C23563l implements View.OnAttachStateChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C23570r f67546d;

    public C23563l(C23570r rVar) {
        this.f67546d = rVar;
    }

    public void onViewAttachedToWindow(View view) {
        C87412m.m108594g(view, "v");
        if (C87412m.m108589b(this.f67546d.f67562a, view)) {
            this.f67546d.f67571j = false;
            C23564m.m28131a(view.hashCode(), this.f67546d);
        }
    }

    public void onViewDetachedFromWindow(View view) {
        C87412m.m108594g(view, "v");
        if (C87412m.m108589b(this.f67546d.f67562a, view)) {
            C23570r b = C23564m.m28132b(view);
            if (b != null) {
                b.f67571j = true;
            }
            C23570r c = C23564m.m28133c(view);
            if (c != null) {
                c.f67571j = true;
            }
        }
    }
}
