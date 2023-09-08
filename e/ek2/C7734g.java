package ek2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: ek2.g */
public final class C7734g extends RecyclerView.C0129l {

    /* renamed from: d */
    public final int f26186d;

    /* renamed from: e */
    public final int f26187e;

    /* renamed from: f */
    public final ColorDrawable f26188f;

    public C7734g(Context context) {
        C87412m.m108594g(context, "context");
        this.f26186d = (int) context.getResources().getDimension(C0966R.dimen.f3736cp);
        int dimension = (int) context.getResources().getDimension(C0966R.dimen.f3699bs);
        this.f26187e = dimension;
        ColorDrawable colorDrawable = new ColorDrawable(C76577a.m92153d(context, C0966R.color.f2929c));
        this.f26188f = colorDrawable;
        colorDrawable.setBounds(0, 0, 0, dimension);
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = this.f26187e;
    }

    /* renamed from: h */
    public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(canvas, "c");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            int left = childAt.getLeft() - layoutParams2.leftMargin;
            int bottom = childAt.getBottom() + layoutParams2.bottomMargin;
            this.f26188f.setBounds(left, bottom, this.f26186d + left, this.f26188f.getBounds().height() + bottom);
            this.f26188f.draw(canvas);
        }
    }
}
