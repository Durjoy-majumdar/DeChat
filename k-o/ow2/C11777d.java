package ow2;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: ow2.d */
public final class C11777d extends RecyclerView.C0129l {

    /* renamed from: d */
    public final int f34468d;

    /* renamed from: e */
    public final Drawable f34469e = new ColorDrawable(-16777216);

    /* renamed from: f */
    public final Rect f34470f = new Rect();

    /* renamed from: g */
    public int f34471g = C76577a.m92151b(MMApplicationContext.getContext(), 16);

    public C11777d(int i) {
        this.f34468d = i;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int position = layoutManager != null ? layoutManager.getPosition(view) : -1;
        RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
        int itemCount = layoutManager2 != null ? layoutManager2.getItemCount() : 0;
        boolean z = true;
        if (position < 0 || position >= itemCount - 1) {
            z = false;
        }
        if (!z) {
            return;
        }
        if (this.f34468d == 0) {
            rect.set(0, 0, this.f34471g, 0);
        } else {
            rect.set(0, 0, 0, this.f34471g);
        }
    }

    /* renamed from: h */
    public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        int i;
        int i2;
        int i3;
        int i4;
        C87412m.m108594g(canvas, "c");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        if (recyclerView.getLayoutManager() != null) {
            int i5 = 0;
            if (this.f34468d == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i3 = recyclerView.getPaddingLeft();
                    i4 = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i3, recyclerView.getPaddingTop(), i4, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    i4 = recyclerView.getWidth();
                    i3 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i5 < childCount) {
                    View childAt = recyclerView.getChildAt(i5);
                    RecyclerView.m15804R0(childAt, this.f34470f);
                    int round = this.f34470f.bottom + Math.round(childAt.getTranslationY());
                    this.f34469e.setBounds(i3, round - this.f34471g, i4, round);
                    this.f34469e.draw(canvas);
                    i5++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i = recyclerView.getPaddingTop();
                i2 = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), i2);
            } else {
                i2 = recyclerView.getHeight();
                i = 0;
            }
            int childCount2 = recyclerView.getChildCount();
            while (i5 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i5);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.getDecoratedBoundsWithMargins(childAt2, this.f34470f);
                }
                int round2 = this.f34470f.right + Math.round(childAt2.getTranslationX());
                this.f34469e.setBounds(round2 - this.f34471g, i, round2, i2);
                this.f34469e.draw(canvas);
                i5++;
            }
            canvas.restore();
        }
    }
}
