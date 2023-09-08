package ek2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: ek2.f */
public final class C7733f extends RecyclerView.C0129l {

    /* renamed from: d */
    public Paint f26183d = new Paint();

    /* renamed from: e */
    public int f26184e;

    /* renamed from: f */
    public int f26185f;

    public C7733f(Context context) {
        C87412m.m108594g(context, "context");
        this.f26184e = (int) context.getResources().getDimension(C0966R.dimen.f3699bs);
        this.f26185f = (int) context.getResources().getDimension(C0966R.dimen.f3706by);
        this.f26183d.setAntiAlias(true);
        this.f26183d.setColor(C76577a.m92153d(context, C0966R.color.FG_3));
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        super.mo21g(rect, view, recyclerView, wVar);
        rect.bottom = this.f26184e;
    }

    /* renamed from: i */
    public void mo123i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(canvas, "c");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        int childCount = recyclerView.getChildCount() - 1;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) layoutParams).bottomMargin;
            int left = childAt.getLeft() + this.f26185f;
            canvas.drawRect((float) left, (float) bottom, (float) ((childAt.getWidth() + left) - this.f26185f), (float) (this.f26184e + bottom), this.f26183d);
        }
    }
}
