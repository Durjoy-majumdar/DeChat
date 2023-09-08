package com.tencent.p014mm.plugin.finder.live.view.mini;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.tencent.p014mm.view.ratio.RatioLayout;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayout;", "Lcom/tencent/mm/view/ratio/RatioLayout;", "", "r", "Lrx3/b0;", "setRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.mini.FinderMiniWindowFloatLayout */
public final class FinderMiniWindowFloatLayout extends RatioLayout {

    /* renamed from: h */
    public float f159951h;

    /* renamed from: i */
    public final Path f159952i = new Path();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMiniWindowFloatLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.f159951h <= 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        this.f159952i.reset();
        RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        Path path = this.f159952i;
        float f = this.f159951h;
        path.addRoundRect(rectF, new float[]{f, f, f, f, f, f, f, f}, Path.Direction.CCW);
        this.f159952i.close();
        if (canvas != null) {
            canvas.clipPath(this.f159952i);
        }
        super.dispatchDraw(canvas);
    }

    public final void setRadius(float f) {
        this.f159951h = f;
        requestLayout();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMiniWindowFloatLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
