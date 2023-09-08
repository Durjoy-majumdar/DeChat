package vo3;

import android.view.View;
import android.view.ViewConfiguration;
import gy3.C87412m;

/* renamed from: vo3.k */
public final class C111577k {

    /* renamed from: a */
    public int f334007a;

    /* renamed from: a */
    public int mo163256a(C111567h hVar, View view, int i) {
        C87412m.m108594g(hVar, "overScroll");
        C87412m.m108594g(view, "child");
        return (i == 2 || i == 8) ? view.getHeight() / 10 : (-view.getHeight()) / 10;
    }

    /* renamed from: b */
    public int mo163257b(C111567h hVar, View view, int i) {
        C87412m.m108594g(hVar, "overScroll");
        C87412m.m108594g(view, "child");
        if (this.f334007a <= 0) {
            this.f334007a = ViewConfiguration.get(view.getContext()).getScaledMinimumFlingVelocity() * 15;
        }
        return this.f334007a;
    }
}
