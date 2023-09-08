package com.tencent.p014mm.plugin.finder.live.cheer;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53973z1;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/cheer/CheerCountDownView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "a", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "i", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.cheer.CheerCountDownView */
public final class CheerCountDownView extends View {

    /* renamed from: d */
    public Paint f159289d;

    /* renamed from: e */
    public Paint f159290e;

    /* renamed from: f */
    public int[] f159291f = {Color.parseColor("#1391BC"), Color.parseColor("#B4CB47")};

    /* renamed from: g */
    public final C0000n0 f159292g = C53930o0.m60555b();

    /* renamed from: h */
    public C53973z1 f159293h;

    /* renamed from: i */
    public float f159294i = -90.0f;

    /* renamed from: j */
    public float f159295j = 360.0f;

    /* renamed from: n */
    public float f159296n = ((float) C76577a.m92151b(getContext(), 4));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheerCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "a");
        mo77562a();
    }

    /* renamed from: a */
    public final void mo77562a() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f159296n);
        paint.setAntiAlias(true);
        this.f159290e = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(this.f159296n);
        paint2.setAntiAlias(true);
        paint2.setColor(Color.parseColor("#80FFFFFF"));
        this.f159289d = paint2;
    }

    public void onDraw(Canvas canvas) {
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        if (canvas != null) {
            float f = width - (this.f159296n / ((float) 2));
            Paint paint = this.f159289d;
            if (paint != null) {
                canvas.drawCircle(width, height, f, paint);
            } else {
                C87412m.m108603p("srcPaint");
                throw null;
            }
        }
        float f2 = this.f159296n;
        float f3 = (float) 2;
        RectF rectF = new RectF(f2 / f3, f2 / f3, ((float) getWidth()) - (this.f159296n / f3), ((float) getHeight()) - (this.f159296n / f3));
        if (canvas != null) {
            float f4 = this.f159294i;
            float f5 = this.f159295j;
            Paint paint2 = this.f159290e;
            if (paint2 != null) {
                canvas.drawArc(rectF, f4, f5, false, paint2);
            } else {
                C87412m.m108603p("shaderPaint");
                throw null;
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        Paint paint = this.f159290e;
        if (paint != null) {
            SweepGradient sweepGradient = new SweepGradient(width, height, this.f159291f, (float[]) null);
            Matrix matrix = new Matrix();
            matrix.setRotate(-90.0f, width, height);
            sweepGradient.setLocalMatrix(matrix);
            paint.setShader(sweepGradient);
            return;
        }
        C87412m.m108603p("shaderPaint");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheerCountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "a");
        mo77562a();
    }
}
