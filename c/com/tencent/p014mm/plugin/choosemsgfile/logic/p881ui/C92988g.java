package com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f11.C97792a;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.logic.ui.g */
public class C92988g extends RecyclerView.C0129l {

    /* renamed from: d */
    public int f267814d = MMApplicationContext.getResources().getColor(C0966R.color.f3370q9);

    /* renamed from: e */
    public ColorDrawable f267815e = new ColorDrawable(this.f267814d);

    /* renamed from: f */
    public int f267816f = ((int) MMApplicationContext.getResources().getDimension(C0966R.dimen.f3623g));

    /* renamed from: g */
    public final /* synthetic */ C92985f f267817g;

    public C92988g(C92985f fVar) {
        this.f267817g = fVar;
    }

    /* renamed from: h */
    public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C97792a F4;
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt.getTag() != null && ((F4 = this.f267817g.f267807d.mo127392F4(((Integer) childAt.getTag()).intValue() + 1)) == null || F4.mo137124h() != 0)) {
                int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                this.f267815e.setBounds(paddingLeft, bottom, width, this.f267816f + bottom);
                this.f267815e.draw(canvas);
            }
        }
    }
}
