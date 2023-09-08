package b03;

import android.view.View;
import fy3.C32224a;
import gy3.C87412m;

/* renamed from: b03.r */
public final class C39721r {
    /* renamed from: a */
    public static void m42515a(View view, long j, View.OnClickListener onClickListener, C32224a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        long j2 = j;
        View.OnClickListener onClickListener2 = (i & 2) != 0 ? null : onClickListener;
        C32224a aVar2 = (i & 4) != 0 ? null : aVar;
        C87412m.m108594g(view, "<this>");
        view.setOnClickListener(new C39719q(view, j2, onClickListener2, aVar2));
    }
}
