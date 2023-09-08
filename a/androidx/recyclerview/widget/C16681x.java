package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.x */
public final class C16681x extends C16682y {
    public C16681x(RecyclerView.LayoutManager layoutManager) {
        super(layoutManager, (C16680w) null);
    }

    /* renamed from: b */
    public int mo17561b(View view) {
        return this.f45081a.getDecoratedBottom(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    /* renamed from: c */
    public int mo17562c(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f45081a.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: d */
    public int mo17563d(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f45081a.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    /* renamed from: e */
    public int mo17564e(View view) {
        return this.f45081a.getDecoratedTop(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
    }

    /* renamed from: f */
    public int mo17565f() {
        return this.f45081a.getHeight();
    }

    /* renamed from: g */
    public int mo17566g() {
        return this.f45081a.getHeight() - this.f45081a.getPaddingBottom();
    }

    /* renamed from: h */
    public int mo17567h() {
        return this.f45081a.getPaddingBottom();
    }

    /* renamed from: i */
    public int mo17568i() {
        return this.f45081a.getHeightMode();
    }

    /* renamed from: j */
    public int mo17569j() {
        return this.f45081a.getWidthMode();
    }

    /* renamed from: k */
    public int mo17570k() {
        return this.f45081a.getPaddingTop();
    }

    /* renamed from: l */
    public int mo17571l() {
        return (this.f45081a.getHeight() - this.f45081a.getPaddingTop()) - this.f45081a.getPaddingBottom();
    }

    /* renamed from: n */
    public int mo17572n(View view) {
        this.f45081a.getTransformedBoundingBox(view, true, this.f45083c);
        return this.f45083c.bottom;
    }

    /* renamed from: o */
    public int mo17573o(View view) {
        this.f45081a.getTransformedBoundingBox(view, true, this.f45083c);
        return this.f45083c.top;
    }

    /* renamed from: p */
    public void mo17574p(int i) {
        this.f45081a.offsetChildrenVertical(i);
    }
}
