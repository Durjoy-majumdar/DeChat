package sk3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: sk3.o0 */
public final class C13707o0 extends RecyclerView.C0129l {

    /* renamed from: d */
    public final int f38786d;

    /* renamed from: e */
    public Paint f38787e = new Paint(1);

    public C13707o0(C13704n0 n0Var) {
        this.f38786d = (int) n0Var.getActivity().getResources().getDimension(C0966R.dimen.f3627k);
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        super.mo21g(rect, view, recyclerView, wVar);
        int i = this.f38786d;
        rect.set(i, i, i, i);
    }

    /* renamed from: h */
    public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(canvas, "c");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        this.f38787e.setColor(-2434342);
        this.f38787e.setStrokeWidth(1.0f);
        this.f38787e.setStyle(Paint.Style.FILL);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (i == 1 || i == 4 || i == 7) {
                canvas.drawLine((float) (childAt.getLeft() - this.f38786d), (float) childAt.getTop(), (float) (childAt.getLeft() - this.f38786d), (float) childAt.getBottom(), this.f38787e);
                canvas.drawLine((float) (childAt.getRight() + this.f38786d), (float) childAt.getTop(), (float) (childAt.getRight() + this.f38786d), (float) childAt.getBottom(), this.f38787e);
            }
        }
    }
}
