package vo3;

import android.view.View;
import android.view.ViewConfiguration;
import gy3.C87412m;

/* renamed from: vo3.e */
public final class C111565e {

    /* renamed from: a */
    public int f333982a;

    /* renamed from: a */
    public int mo163253a(C111567h hVar, View view, int i) {
        C87412m.m108594g(hVar, "overScroll");
        C87412m.m108594g(view, "child");
        return (i == 2 || i == 8) ? view.getWidth() / 10 : (-view.getWidth()) / 10;
    }

    /* renamed from: b */
    public int mo163254b(C111567h hVar, View view, int i) {
        C87412m.m108594g(hVar, "overScroll");
        C87412m.m108594g(view, "child");
        if (this.f333982a <= 0) {
            this.f333982a = ViewConfiguration.get(view.getContext()).getScaledMinimumFlingVelocity() * 15;
        }
        return this.f333982a;
    }
}
