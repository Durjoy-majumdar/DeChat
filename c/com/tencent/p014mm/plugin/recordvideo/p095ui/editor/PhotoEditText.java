package com.tencent.p014mm.plugin.recordvideo.p095ui.editor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Editable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/PhotoEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "", "color", "Lrx3/b0;", "setTextBackground", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText */
public final class PhotoEditText extends AppCompatEditText {

    /* renamed from: d */
    public int f203696d;

    /* renamed from: e */
    public final float f203697e;

    /* renamed from: f */
    public final Path f203698f;

    /* renamed from: g */
    public final Paint f203699g;

    /* renamed from: h */
    public final RectF f203700h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhotoEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        this.f203698f = new Path();
        Paint paint = new Paint();
        this.f203699g = paint;
        this.f203700h = new RectF();
        this.f203697e = (float) C76577a.m92151b(context, 12);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        if (this.f203696d != 0) {
            Editable text = getText();
            if (!(text == null || text.length() == 0)) {
                this.f203699g.setColor(this.f203696d);
                float f = this.f203697e * ((float) 2);
                this.f203698f.reset();
                if (getLineCount() != 0) {
                    float lineBottom = ((float) getLayout().getLineBottom(getLineCount() - 1)) + ((float) getPaddingTop()) + ((float) getPaddingBottom());
                    if (getLineCount() == 1) {
                        this.f203700h.set(0.0f, 0.0f, getLayout().getLineWidth(0) + ((float) getPaddingLeft()) + ((float) getPaddingRight()), lineBottom);
                        Path path = this.f203698f;
                        RectF rectF = this.f203700h;
                        float f2 = this.f203697e;
                        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
                    } else {
                        float measuredWidth = (float) getMeasuredWidth();
                        float lineWidth = getLayout().getLineWidth(getLineCount() - 1);
                        float f3 = measuredWidth - f;
                        if (lineWidth >= (f3 - ((float) getPaddingLeft())) - ((float) getPaddingRight())) {
                            this.f203700h.set(0.0f, 0.0f, measuredWidth, lineBottom);
                            Path path2 = this.f203698f;
                            RectF rectF2 = this.f203700h;
                            float f4 = this.f203697e;
                            path2.addRoundRect(rectF2, f4, f4, Path.Direction.CW);
                        } else {
                            float lineTop = ((float) getLayout().getLineTop(getLineCount() - 1)) + ((float) getPaddingTop()) + ((float) getPaddingBottom());
                            float paddingRight = lineWidth + ((float) getPaddingRight()) + ((float) getPaddingLeft());
                            this.f203698f.moveTo(0.0f, this.f203697e);
                            this.f203700h.set(0.0f, 0.0f, f, f);
                            this.f203698f.arcTo(this.f203700h, 180.0f, 90.0f);
                            this.f203698f.lineTo(f3, 0.0f);
                            this.f203700h.set(f3, 0.0f, measuredWidth, f);
                            this.f203698f.arcTo(this.f203700h, 270.0f, 90.0f);
                            this.f203698f.lineTo(measuredWidth, lineTop - this.f203697e);
                            this.f203700h.set(f3, lineTop - f, measuredWidth, lineTop);
                            this.f203698f.arcTo(this.f203700h, 0.0f, 90.0f);
                            this.f203698f.lineTo(this.f203697e + paddingRight, lineTop);
                            this.f203700h.set(paddingRight, lineTop, paddingRight + f, lineTop + f);
                            this.f203698f.arcTo(this.f203700h, 270.0f, -90.0f);
                            this.f203698f.lineTo(paddingRight, lineBottom - this.f203697e);
                            float f5 = lineBottom - f;
                            this.f203700h.set(paddingRight - f, f5, paddingRight, lineBottom);
                            this.f203698f.arcTo(this.f203700h, 0.0f, 90.0f);
                            this.f203698f.lineTo(this.f203697e, lineBottom);
                            this.f203700h.set(0.0f, f5, f, lineBottom);
                            this.f203698f.arcTo(this.f203700h, 90.0f, 90.0f);
                            this.f203698f.lineTo(0.0f, this.f203697e);
                        }
                    }
                    this.f203698f.close();
                    canvas.drawPath(this.f203698f, this.f203699g);
                }
            }
        }
        super.onDraw(canvas);
    }

    public final void setTextBackground(int i) {
        this.f203696d = i;
        invalidate();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PhotoEditText(Context context) {
        this(context, (AttributeSet) null);
        C87412m.m108594g(context, "context");
    }
}
