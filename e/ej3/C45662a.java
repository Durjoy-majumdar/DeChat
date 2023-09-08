package ej3;

import android.view.View;
import fy3.C32224a;
import gy3.C87412m;

/* renamed from: ej3.a */
public final class C45662a {
    /* renamed from: a */
    public static void m50855a(View view, float f, long j, C32224a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            j = 300;
        }
        if ((i & 4) != 0) {
            aVar = null;
        }
        C87412m.m108594g(view, "<this>");
        C45669g gVar = new C45669g(f);
        gVar.f123474d = view;
        gVar.mo71166f();
        View view2 = gVar.f123474d;
        if (view2 != null) {
            view2.post(new C45665d(gVar, j, aVar));
        }
    }

    /* renamed from: b */
    public static void m50856b(View view, int i, long j, C32224a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 4;
        }
        if ((i2 & 2) != 0) {
            j = 300;
        }
        if ((i2 & 4) != 0) {
            aVar = null;
        }
        C87412m.m108594g(view, "<this>");
        C45670h hVar = new C45670h(i);
        hVar.f123474d = view;
        if (!hVar.mo71168f()) {
            View view2 = hVar.f123474d;
            if (view2 != null) {
                view2.post(new C45665d(hVar, j, aVar));
            }
        } else if (aVar != null) {
            aVar.invoke();
        }
    }
}
