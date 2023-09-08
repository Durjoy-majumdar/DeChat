package com.tencent.p014mm.plugin.finder.order.p054ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/order/ui/RoundShapeLinearLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.order.ui.RoundShapeLinearLayout */
public class RoundShapeLinearLayout extends LinearLayout {

    /* renamed from: d */
    public float f15856d = 0.5f;

    /* renamed from: e */
    public final Path f15857e = new Path();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundShapeLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public void dispatchDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        this.f15857e.reset();
        this.f15857e.addRoundRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), ((float) getWidth()) * this.f15856d, ((float) getHeight()) * this.f15856d, Path.Direction.CW);
        canvas.clipPath(this.f15857e);
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundShapeLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
