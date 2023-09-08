package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019R.\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveShadeView;", "Landroid/view/View;", "Landroid/graphics/Rect;", "value", "d", "Landroid/graphics/Rect;", "getHighLightRect", "()Landroid/graphics/Rect;", "setHighLightRect", "(Landroid/graphics/Rect;)V", "highLightRect", "", "e", "I", "getBgColor", "()I", "setBgColor", "(I)V", "bgColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveShadeView */
public final class FinderLiveShadeView extends View {

    /* renamed from: d */
    public Rect f15298d;

    /* renamed from: e */
    public int f15299e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveShadeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    public final int getBgColor() {
        return this.f15299e;
    }

    public final Rect getHighLightRect() {
        return this.f15298d;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.f15298d;
        if (rect != null) {
            if (canvas != null) {
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
            }
            if (canvas != null) {
                canvas.drawColor(this.f15299e);
            }
        }
    }

    public final void setBgColor(int i) {
        this.f15299e = i;
    }

    public final void setHighLightRect(Rect rect) {
        this.f15298d = rect;
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveShadeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f15299e = context.getResources().getColor(C0966R.color.BW_0_Alpha_0_8);
    }
}
