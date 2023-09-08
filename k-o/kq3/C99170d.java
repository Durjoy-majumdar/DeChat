package kq3;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;

/* renamed from: kq3.d */
public final class C99170d {

    /* renamed from: a */
    public static final Rect f290807a = new Rect();

    /* renamed from: a */
    public static final int m129189a(RecyclerView recyclerView, float f, float f2) {
        C87412m.m108594g(recyclerView, "<this>");
        View D0 = recyclerView.mo17019D0(Math.max(Math.min(f, (float) recyclerView.getWidth()), 0.0f), Math.max(Math.min(f2, (float) recyclerView.getHeight()), 0.0f));
        if (D0 == null) {
            return -1;
        }
        Rect rect = f290807a;
        if (!(D0.getGlobalVisibleRect(rect) && ((float) rect.height()) >= (((float) D0.getMeasuredHeight()) / 4.0f) * ((float) 3))) {
            return -1;
        }
        return recyclerView.mo17029N0(D0);
    }
}
