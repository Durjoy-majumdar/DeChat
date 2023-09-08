package p1111g1;

import android.view.View;
import gy3.C87412m;

/* renamed from: g1.b */
public final class C107694b implements C107693a {

    /* renamed from: a */
    public final View f322201a;

    public C107694b(View view) {
        C87412m.m108594g(view, "view");
        this.f322201a = view;
    }

    /* renamed from: a */
    public void mo158098a(int i) {
        boolean z = true;
        if (i == 0) {
            this.f322201a.performHapticFeedback(0);
            return;
        }
        if (i != 9) {
            z = false;
        }
        if (z) {
            this.f322201a.performHapticFeedback(9);
        }
    }
}
