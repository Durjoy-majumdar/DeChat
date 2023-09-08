package p191l2;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import gy3.C87412m;

/* renamed from: l2.i */
public final class C99296i extends ViewOutlineProvider {
    public void getOutline(View view, Outline outline) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(outline, "result");
        outline.setRect(0, 0, view.getWidth(), view.getHeight());
        outline.setAlpha(0.0f);
    }
}
