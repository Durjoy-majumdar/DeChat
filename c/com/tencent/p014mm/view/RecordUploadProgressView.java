package com.tencent.p014mm.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.wxmm.v2helper;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010¨\u0006 "}, mo182094d2 = {"Lcom/tencent/mm/view/RecordUploadProgressView;", "Landroid/view/View;", "Landroid/graphics/Paint;", "d", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "setPaint", "(Landroid/graphics/Paint;)V", "paint", "", "e", "I", "getProgress", "()I", "setProgress", "(I)V", "progress", "f", "getBackColor", "setBackColor", "backColor", "g", "getForeColor", "setForeColor", "foreColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui-selectcontact_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.RecordUploadProgressView */
public final class RecordUploadProgressView extends View {

    /* renamed from: d */
    public Paint f24933d;

    /* renamed from: e */
    public int f24934e;

    /* renamed from: f */
    public int f24935f = getResources().getColor(C0966R.color.BW_0_Alpha_0_1);

    /* renamed from: g */
    public int f24936g = getResources().getColor(C0966R.color.Brand_100);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecordUploadProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        setPaint(new Paint());
        getPaint().setStyle(Paint.Style.STROKE);
        getPaint().setStrokeWidth(getResources().getDimension(C0966R.dimen.am5));
        getPaint().setAntiAlias(true);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth() / 2;
        float f = (float) width;
        int strokeWidth = (int) (f - (getPaint().getStrokeWidth() / ((float) 2)));
        getPaint().setColor(this.f24935f);
        getPaint().setAntiAlias(true);
        getPaint().setStyle(Paint.Style.STROKE);
        if (canvas != null) {
            canvas.drawCircle(f, f, (float) strokeWidth, getPaint());
        }
        getPaint().setColor(this.f24936g);
        float f2 = (float) (width - strokeWidth);
        float f3 = (float) (width + strokeWidth);
        RectF rectF = new RectF(f2, f2, f3, f3);
        float f4 = ((float) (this.f24934e * v2helper.VOIP_ENC_HEIGHT_LV1)) / 100.0f;
        if (canvas != null) {
            canvas.drawArc(rectF, -90.0f, f4, false, getPaint());
        }
    }

    public final int getBackColor() {
        return this.f24935f;
    }

    public final int getForeColor() {
        return this.f24936g;
    }

    public final Paint getPaint() {
        Paint paint = this.f24933d;
        if (paint != null) {
            return paint;
        }
        C87412m.m108603p("paint");
        throw null;
    }

    public final int getProgress() {
        return this.f24934e;
    }

    public final void setBackColor(int i) {
        this.f24935f = i;
    }

    public final void setForeColor(int i) {
        this.f24936g = i;
    }

    public final void setPaint(Paint paint) {
        C87412m.m108594g(paint, "<set-?>");
        this.f24933d = paint;
    }

    public final void setProgress(int i) {
        this.f24934e = i;
    }
}
