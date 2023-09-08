package k71;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;

/* renamed from: k71.a */
public final class C60980a extends C54256s {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60980a(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: i */
    public int mo74664i(View view, int i) {
        C87412m.m108594g(view, "view");
        RecyclerView.LayoutManager layoutManager = this.f44874c;
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        return (layoutManager.getWidth() / 2) - ((view.getLeft() + view.getRight()) / 2);
    }

    /* renamed from: j */
    public int mo74665j(View view, int i) {
        C87412m.m108594g(view, "view");
        RecyclerView.LayoutManager layoutManager = this.f44874c;
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return 0;
        }
        return (layoutManager.getHeight() / 2) - ((view.getTop() + view.getBottom()) / 2);
    }

    /* renamed from: k */
    public float mo3227k(DisplayMetrics displayMetrics) {
        C87412m.m108594g(displayMetrics, "displayMetrics");
        return 50.0f / ((float) displayMetrics.densityDpi);
    }
}
