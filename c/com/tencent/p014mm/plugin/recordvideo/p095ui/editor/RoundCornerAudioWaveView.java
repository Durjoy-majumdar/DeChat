package com.tencent.p014mm.plugin.recordvideo.p095ui.editor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.p136ui.C74942w4;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B!\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/RoundCornerAudioWaveView;", "Landroid/view/View;", "", "color", "Lrx3/b0;", "setColor", "", "isShow", "setShow", "count", "setWaveCount", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.RoundCornerAudioWaveView */
public final class RoundCornerAudioWaveView extends View {

    /* renamed from: d */
    public final float f163855d;

    /* renamed from: e */
    public final int f163856e;

    /* renamed from: f */
    public final float f163857f;

    /* renamed from: g */
    public final int f163858g;

    /* renamed from: h */
    public final float f163859h;

    /* renamed from: i */
    public float f163860i;

    /* renamed from: j */
    public Paint f163861j;

    /* renamed from: n */
    public int f163862n;

    /* renamed from: o */
    public boolean f163863o;

    /* renamed from: p */
    public RectF[] f163864p;

    /* renamed from: q */
    public float[] f163865q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundCornerAudioWaveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        int a = C74942w4.m89784a(getContext(), 1);
        float f = (float) a;
        float f2 = 1.5f * f;
        this.f163855d = f2;
        this.f163856e = a;
        this.f163857f = 2.0f * f;
        this.f163858g = a;
        this.f163859h = f2;
        this.f163860i = f * 9.0f;
        int i = this.f163862n;
        RectF[] rectFArr = new RectF[i];
        for (int i2 = 0; i2 < i; i2++) {
            rectFArr[i2] = new RectF();
        }
        this.f163864p = rectFArr;
        this.f163865q = new float[this.f163862n];
        mo80765a();
    }

    /* renamed from: a */
    public final void mo80765a() {
        setWaveCount(20);
        Paint paint = new Paint();
        this.f163861j = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.f163861j;
        C87412m.m108591d(paint2);
        paint2.setColor(-3355444);
        Paint paint3 = this.f163861j;
        C87412m.m108591d(paint3);
        paint3.setAntiAlias(true);
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        RectF[] rectFArr = this.f163864p;
        int length = rectFArr.length;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        while (i < length) {
            RectF rectF = rectFArr[i];
            int i3 = i2 + 1;
            float height = rectF.height();
            int i4 = this.f163856e;
            if (height <= ((float) i4)) {
                this.f163865q[i2] = (float) (((double) this.f163860i) * Math.random());
            } else {
                float[] fArr = this.f163865q;
                if (height >= fArr[i2]) {
                    fArr[i2] = (float) i4;
                }
            }
            float min = height <= this.f163865q[i2] ? Math.min(height + this.f163857f, this.f163860i) : Math.max(height - ((float) this.f163858g), (float) this.f163856e);
            float f2 = this.f163859h;
            float f3 = this.f163860i;
            float f4 = (float) 2;
            float f5 = min / f4;
            rectF.set(f + f2, (f3 / f4) - f5, f + f2 + this.f163855d, (f3 / f4) + f5);
            f = rectF.right;
            float f6 = this.f163855d;
            Paint paint = this.f163861j;
            C87412m.m108591d(paint);
            canvas.drawRoundRect(rectF, f6 / f4, f6 / f4, paint);
            i++;
            i2 = i3;
        }
        if (this.f163863o) {
            postInvalidateDelayed(33);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f163860i = (float) i2;
    }

    public final void setColor(int i) {
        Paint paint = this.f163861j;
        C87412m.m108591d(paint);
        paint.setColor(i);
    }

    public final void setShow(boolean z) {
        this.f163863o = z;
    }

    public final void setWaveCount(int i) {
        this.f163862n = i;
        RectF[] rectFArr = new RectF[i];
        for (int i2 = 0; i2 < i; i2++) {
            rectFArr[i2] = new RectF();
        }
        this.f163864p = rectFArr;
        this.f163865q = new float[this.f163862n];
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundCornerAudioWaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        int a = C74942w4.m89784a(getContext(), 1);
        float f = (float) a;
        float f2 = 1.5f * f;
        this.f163855d = f2;
        this.f163856e = a;
        this.f163857f = 2.0f * f;
        this.f163858g = a;
        this.f163859h = f2;
        this.f163860i = f * 9.0f;
        int i2 = this.f163862n;
        RectF[] rectFArr = new RectF[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            rectFArr[i3] = new RectF();
        }
        this.f163864p = rectFArr;
        this.f163865q = new float[this.f163862n];
        mo80765a();
    }
}
