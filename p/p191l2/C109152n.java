package p191l2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import gy3.C87412m;

/* renamed from: l2.n */
public class C109152n implements C109150l {
    /* renamed from: a */
    public void mo160390a(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        C87412m.m108594g(windowManager, "windowManager");
        C87412m.m108594g(view, "popupView");
        C87412m.m108594g(layoutParams, "params");
        windowManager.updateViewLayout(view, layoutParams);
    }

    /* renamed from: b */
    public void mo160391b(View view, int i, int i2) {
        C87412m.m108594g(view, "composeView");
    }

    /* renamed from: c */
    public void mo160392c(View view, Rect rect) {
        C87412m.m108594g(view, "composeView");
        C87412m.m108594g(rect, "outRect");
        view.getWindowVisibleDisplayFrame(rect);
    }
}
