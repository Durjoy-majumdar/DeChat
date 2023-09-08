package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.w */
public final class C16680w extends C16682y {
    public C16680w(RecyclerView.LayoutManager layoutManager) {
        super(layoutManager, (C16680w) null);
    }

    /* renamed from: b */
    public int mo17561b(View view) {
        return this.f45081a.getDecoratedRight(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
    }

    /* renamed from: c */
    public int mo17562c(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f45081a.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    /* renamed from: d */
    public int mo17563d(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f45081a.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: e */
    public int mo17564e(View view) {
        return this.f45081a.getDecoratedLeft(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
    }

    /* renamed from: f */
    public int mo17565f() {
        return this.f45081a.getWidth();
    }

    /* renamed from: g */
    public int mo17566g() {
        return this.f45081a.getWidth() - this.f45081a.getPaddingRight();
    }

    /* renamed from: h */
    public int mo17567h() {
        return this.f45081a.getPaddingRight();
    }

    /* renamed from: i */
    public int mo17568i() {
        return this.f45081a.getWidthMode();
    }

    /* renamed from: j */
    public int mo17569j() {
        return this.f45081a.getHeightMode();
    }

    /* renamed from: k */
    public int mo17570k() {
        return this.f45081a.getPaddingLeft();
    }

    /* renamed from: l */
    public int mo17571l() {
        return (this.f45081a.getWidth() - this.f45081a.getPaddingLeft()) - this.f45081a.getPaddingRight();
    }

    /* renamed from: n */
    public int mo17572n(View view) {
        this.f45081a.getTransformedBoundingBox(view, true, this.f45083c);
        return this.f45083c.right;
    }

    /* renamed from: o */
    public int mo17573o(View view) {
        this.f45081a.getTransformedBoundingBox(view, true, this.f45083c);
        return this.f45083c.left;
    }

    /* renamed from: p */
    public void mo17574p(int i) {
        this.f45081a.offsetChildrenHorizontal(i);
    }
}
