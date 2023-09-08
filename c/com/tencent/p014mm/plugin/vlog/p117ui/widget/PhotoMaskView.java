package com.tencent.p014mm.plugin.vlog.p117ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB%\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/widget/PhotoMaskView;", "Landroid/view/View;", "Landroid/graphics/RectF;", "rect", "Lrx3/b0;", "setVisibleRect", "Landroid/graphics/Rect;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.widget.PhotoMaskView */
public final class PhotoMaskView extends View {

    /* renamed from: d */
    public final RectF f316998d = new RectF();

    /* renamed from: e */
    public final Paint f316999e;

    public PhotoMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f316999e = paint;
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f316998d.isEmpty()) {
            if (canvas != null) {
                canvas.drawRect(0.0f, 0.0f, (float) getWidth(), this.f316998d.top, this.f316999e);
            }
            if (canvas != null) {
                canvas.drawRect(0.0f, this.f316998d.bottom, (float) getWidth(), (float) getHeight(), this.f316999e);
            }
        }
    }

    public final void setVisibleRect(RectF rectF) {
        C87412m.m108594g(rectF, "rect");
        this.f316998d.set(rectF);
        invalidate();
    }

    public final void setVisibleRect(Rect rect) {
        C87412m.m108594g(rect, "rect");
        this.f316998d.set(rect);
        invalidate();
    }

    public PhotoMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f316999e = paint;
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
    }
}
