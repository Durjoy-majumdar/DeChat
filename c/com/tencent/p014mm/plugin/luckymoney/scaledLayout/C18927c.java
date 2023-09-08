package com.tencent.p014mm.plugin.luckymoney.scaledLayout;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.tencent.mm.plugin.luckymoney.scaledLayout.c */
public class C18927c extends C18928d {
    public C18927c(RecyclerView.LayoutManager layoutManager) {
        super(layoutManager, (C18926b) null);
    }

    /* renamed from: a */
    public int mo23973a(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f53145a.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public int mo23974b(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f53145a.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    /* renamed from: c */
    public int mo23975c() {
        return this.f53145a.getPaddingTop();
    }

    /* renamed from: d */
    public int mo23976d() {
        return (this.f53145a.getHeight() - this.f53145a.getPaddingTop()) - this.f53145a.getPaddingBottom();
    }

    /* renamed from: e */
    public int mo23977e() {
        return (this.f53145a.getWidth() - this.f53145a.getPaddingLeft()) - this.f53145a.getPaddingRight();
    }
}
