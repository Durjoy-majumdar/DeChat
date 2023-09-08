package hb2;

import android.graphics.Point;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import gy3.C87412m;

/* renamed from: hb2.h */
public final class C59828h {
    /* renamed from: a */
    public static final C59826g m69722a(View view) {
        C87412m.m108594g(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new C59826g(view instanceof ImageView ? ((ImageView) view).getDrawable() : null, new Point(iArr[0], iArr[1]), new Size(view.getWidth(), view.getHeight()));
    }
}
