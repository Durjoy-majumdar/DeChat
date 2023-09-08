package com.tencent.p014mm.plugin.vlog.p117ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.p014mm.plugin.recordvideo.p095ui.WxCropOperationLayout;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/widget/MultiEditCropOperationLayout;", "Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout;", "Landroid/graphics/RectF;", "x0", "Landroid/graphics/RectF;", "getMaxVisibilityRect", "()Landroid/graphics/RectF;", "maxVisibilityRect", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropOperationLayout */
public final class MultiEditCropOperationLayout extends WxCropOperationLayout {

    /* renamed from: Q0 */
    public boolean f316993Q0;

    /* renamed from: R0 */
    public boolean f316994R0;

    /* renamed from: p0 */
    public final Paint f316995p0;

    /* renamed from: x0 */
    public final RectF f316996x0 = new RectF();

    /* renamed from: y0 */
    public boolean f316997y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiEditCropOperationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        Paint paint = new Paint();
        this.f316995p0 = paint;
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStrokeWidth((float) C76577a.m92151b(getContext(), 2));
        paint.setStyle(Paint.Style.STROKE);
        getGridLinePaint().setColor(Color.parseColor("#4DFFFFFF"));
        getGridLinePaint().setAntiAlias(true);
        getGridLinePaint().setStrokeWidth((float) C76577a.m92151b(getContext(), 1));
        getGridLinePaint().setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public void mo151287a(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        if (!this.f316993Q0) {
            super.mo151287a(canvas);
        } else if (getStyle() == WxCropOperationLayout.C94436h.RECT_ADJUST || getStyle() == WxCropOperationLayout.C94436h.RECT_LINE_HARD) {
            if (getShowGridLine()) {
                canvas.drawPath(getGridLinePath(), getGridLinePaint());
            }
            canvas.drawRect(getBoxRect(), this.f316995p0);
        }
    }

    /* renamed from: c */
    public void mo151289c(int i, long j) {
        if (!this.f316993Q0) {
            super.mo151289c(i, j);
        }
    }

    public final RectF getMaxVisibilityRect() {
        return this.f316996x0;
    }

    public boolean onDown(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        if (!this.f316993Q0) {
            return super.onDown(motionEvent);
        }
        if (getStyle() == WxCropOperationLayout.C94436h.RECT_ADJUST) {
            this.f316997y0 = false;
            if (getVisibilityRect().contains(motionEvent.getX(), motionEvent.getY())) {
                this.f316997y0 = true;
            }
        }
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "event");
        C87412m.m108594g(motionEvent2, "e2");
        if (!this.f316993Q0) {
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
        motionEvent.toString();
        if (this.f316997y0) {
            getVisibilityRect().offset(-f, -f2);
            if (getVisibilityRect().top < this.f316996x0.top) {
                getVisibilityRect().offset(0.0f, this.f316996x0.top - getVisibilityRect().top);
            }
            if (getVisibilityRect().bottom > this.f316996x0.bottom) {
                getVisibilityRect().offset(0.0f, this.f316996x0.bottom - getVisibilityRect().bottom);
            }
            if (getVisibilityRect().left < this.f316996x0.left) {
                getVisibilityRect().offset(this.f316996x0.left - getVisibilityRect().left, 0.0f);
            }
            if (getVisibilityRect().right > this.f316996x0.right) {
                getVisibilityRect().offset(this.f316996x0.right - getVisibilityRect().right, 0.0f);
            }
        }
        postInvalidate();
        return this.f316997y0;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        if (!this.f316993Q0) {
            return super.onTouchEvent(motionEvent);
        }
        super.onTouchEvent(motionEvent);
        boolean z = this.f316997y0 | this.f315429Q | this.f315430R;
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f316997y0 = false;
            setBelongTopBlock(false);
            setBelongBottomBlock(false);
        }
        if (getStyle() != WxCropOperationLayout.C94436h.RECT_ADJUST) {
            return false;
        }
        if (this.f316994R0) {
            return z;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiEditCropOperationLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        Paint paint = new Paint();
        this.f316995p0 = paint;
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStrokeWidth((float) C76577a.m92151b(getContext(), 2));
        paint.setStyle(Paint.Style.STROKE);
        getGridLinePaint().setColor(Color.parseColor("#4DFFFFFF"));
        getGridLinePaint().setAntiAlias(true);
        getGridLinePaint().setStrokeWidth((float) C76577a.m92151b(getContext(), 1));
        getGridLinePaint().setStyle(Paint.Style.STROKE);
    }
}
