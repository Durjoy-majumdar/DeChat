package androidx.compose.p002ui.platform;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import gy3.C87412m;
import p190l1.C10447a;
import p190l1.C10448b;
import p190l1.C10449p;

/* renamed from: androidx.compose.ui.platform.s */
public final class C103684s {

    /* renamed from: a */
    public static final C103684s f306255a = new C103684s();

    /* renamed from: a */
    public final void mo144854a(View view, C10449p pVar) {
        PointerIcon pointerIcon;
        C87412m.m108594g(view, "view");
        if (pVar instanceof C10447a) {
            ((C10447a) pVar).getClass();
            pointerIcon = null;
        } else if (pVar instanceof C10448b) {
            Context context = view.getContext();
            ((C10448b) pVar).getClass();
            pointerIcon = PointerIcon.getSystemIcon(context, 0);
        } else {
            pointerIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (!C87412m.m108589b(view.getPointerIcon(), pointerIcon)) {
            view.setPointerIcon(pointerIcon);
        }
    }
}
