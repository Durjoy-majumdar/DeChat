package com.tencent.p014mm.plugin.recordvideo.p095ui.editor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/PhotoTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "color", "Lrx3/b0;", "setTextBackground", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.PhotoTextView */
public final class PhotoTextView extends AppCompatTextView {

    /* renamed from: g */
    public int f203701g;

    /* renamed from: h */
    public final float f203702h;

    /* renamed from: i */
    public final Path f203703i = new Path();

    /* renamed from: j */
    public final Paint f203704j;

    /* renamed from: n */
    public final RectF f203705n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhotoTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        Paint paint = new Paint();
        this.f203704j = paint;
        this.f203705n = new RectF();
        this.f203702h = (float) C76577a.m92151b(context, 12);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        if (this.f203701g != 0) {
            CharSequence text = getText();
            if (!(text == null || text.length() == 0)) {
                this.f203704j.setColor(this.f203701g);
                float f = this.f203702h * ((float) 2);
                this.f203703i.reset();
                if (getLineCount() != 0) {
                    float lineBottom = ((float) getLayout().getLineBottom(getLineCount() - 1)) + ((float) getPaddingTop()) + ((float) getPaddingBottom());
                    if (getLineCount() == 1) {
                        this.f203705n.set(0.0f, 0.0f, getLayout().getLineWidth(0) + ((float) getPaddingLeft()) + ((float) getPaddingRight()), lineBottom);
                        Path path = this.f203703i;
                        RectF rectF = this.f203705n;
                        float f2 = this.f203702h;
                        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
                    } else {
                        float measuredWidth = (float) getMeasuredWidth();
                        float lineWidth = getLayout().getLineWidth(getLineCount() - 1);
                        float f3 = measuredWidth - f;
                        if (lineWidth >= (f3 - ((float) getPaddingLeft())) - ((float) getPaddingRight())) {
                            this.f203705n.set(0.0f, 0.0f, measuredWidth, lineBottom);
                            Path path2 = this.f203703i;
                            RectF rectF2 = this.f203705n;
                            float f4 = this.f203702h;
                            path2.addRoundRect(rectF2, f4, f4, Path.Direction.CW);
                        } else {
                            float lineTop = ((float) getLayout().getLineTop(getLineCount() - 1)) + ((float) getPaddingTop()) + ((float) getPaddingBottom());
                            float paddingRight = lineWidth + ((float) getPaddingRight()) + ((float) getPaddingLeft());
                            this.f203703i.moveTo(0.0f, this.f203702h);
                            this.f203705n.set(0.0f, 0.0f, f, f);
                            this.f203703i.arcTo(this.f203705n, 180.0f, 90.0f);
                            this.f203703i.lineTo(f3, 0.0f);
                            this.f203705n.set(f3, 0.0f, measuredWidth, f);
                            this.f203703i.arcTo(this.f203705n, 270.0f, 90.0f);
                            this.f203703i.lineTo(measuredWidth, lineTop - this.f203702h);
                            this.f203705n.set(f3, lineTop - f, measuredWidth, lineTop);
                            this.f203703i.arcTo(this.f203705n, 0.0f, 90.0f);
                            this.f203703i.lineTo(this.f203702h + paddingRight, lineTop);
                            this.f203705n.set(paddingRight, lineTop, paddingRight + f, lineTop + f);
                            this.f203703i.arcTo(this.f203705n, 270.0f, -90.0f);
                            this.f203703i.lineTo(paddingRight, lineBottom - this.f203702h);
                            float f5 = lineBottom - f;
                            this.f203705n.set(paddingRight - f, f5, paddingRight, lineBottom);
                            this.f203703i.arcTo(this.f203705n, 0.0f, 90.0f);
                            this.f203703i.lineTo(this.f203702h, lineBottom);
                            this.f203705n.set(0.0f, f5, f, lineBottom);
                            this.f203703i.arcTo(this.f203705n, 90.0f, 90.0f);
                            this.f203703i.lineTo(0.0f, this.f203702h);
                        }
                    }
                    this.f203703i.close();
                    canvas.drawPath(this.f203703i, this.f203704j);
                }
            }
        }
        super.onDraw(canvas);
    }

    public final void setTextBackground(int i) {
        this.f203701g = i;
        invalidate();
    }
}
