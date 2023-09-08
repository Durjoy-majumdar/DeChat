package com.tencent.p014mm.plugin.finder.widget.record;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import uc1.C14153w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/widget/record/EdgeTransparentView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.widget.record.EdgeTransparentView */
public final class EdgeTransparentView extends FrameLayout {

    /* renamed from: d */
    public Paint f18836d;

    /* renamed from: e */
    public int f18837e;

    /* renamed from: f */
    public float f18838f;

    /* renamed from: g */
    public final int f18839g;

    /* renamed from: h */
    public final int f18840h;

    /* renamed from: i */
    public final int f18841i;

    /* renamed from: j */
    public final int f18842j;

    /* renamed from: n */
    public int f18843n;

    /* renamed from: o */
    public int f18844o;

    /* renamed from: p */
    public final int[] f18845p;

    /* renamed from: q */
    public final float[] f18846q;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EdgeTransparentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    public void dispatchDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvas2 = canvas;
        C87412m.m108594g(canvas2, "canvas");
        C87412m.m108594g(view, "child");
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (Paint) null);
        boolean drawChild = super.drawChild(canvas, view, j);
        int i = this.f18837e;
        if (i == 0 || (i & this.f18839g) != 0) {
            float f = (float) this.f18843n;
            float f2 = this.f18838f;
            Paint paint = this.f18836d;
            C87412m.m108591d(paint);
            canvas.drawRect(0.0f, 0.0f, f, f2, paint);
        }
        int i2 = this.f18837e;
        if (i2 == 0 || (i2 & this.f18840h) != 0) {
            int save = canvas.save();
            canvas2.rotate(180.0f, ((float) this.f18843n) / 2.0f, ((float) this.f18844o) / 2.0f);
            float f3 = (float) this.f18843n;
            float f4 = this.f18838f;
            Paint paint2 = this.f18836d;
            C87412m.m108591d(paint2);
            canvas.drawRect(0.0f, 0.0f, f3, f4, paint2);
            canvas2.restoreToCount(save);
        }
        int i3 = (this.f18844o - this.f18843n) / 2;
        int i4 = this.f18837e;
        if (i4 == 0 || (i4 & this.f18841i) != 0) {
            int save2 = canvas.save();
            canvas2.rotate(90.0f, ((float) this.f18843n) / 2.0f, ((float) this.f18844o) / 2.0f);
            float f5 = (float) i3;
            canvas2.translate(0.0f, f5);
            float f6 = ((float) this.f18843n) + f5;
            float f7 = this.f18838f;
            Paint paint3 = this.f18836d;
            C87412m.m108591d(paint3);
            canvas.drawRect(((float) 0) - f5, 0.0f, f6, f7, paint3);
            canvas2.restoreToCount(save2);
        }
        int i5 = this.f18837e;
        if (i5 == 0 || (i5 & this.f18842j) != 0) {
            int save3 = canvas.save();
            canvas2.rotate(270.0f, ((float) this.f18843n) / 2.0f, ((float) this.f18844o) / 2.0f);
            float f8 = (float) i3;
            canvas2.translate(0.0f, f8);
            float f9 = ((float) this.f18843n) + f8;
            float f15 = this.f18838f;
            Paint paint4 = this.f18836d;
            C87412m.m108591d(paint4);
            canvas.drawRect(((float) 0) - f8, 0.0f, f9, f15, paint4);
            canvas2.restoreToCount(save3);
        }
        canvas2.restoreToCount(saveLayer);
        return drawChild;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        super.onDraw(canvas);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Paint paint = this.f18836d;
        C87412m.m108591d(paint);
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.f18838f, this.f18845p, this.f18846q, Shader.TileMode.CLAMP));
        this.f18843n = getWidth();
        this.f18844o = getHeight();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EdgeTransparentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f18839g = 1;
        this.f18840h = 1 << 1;
        this.f18841i = 1 << 2;
        this.f18842j = 1 << 3;
        Paint paint = new Paint(1);
        this.f18836d = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.f18836d;
        C87412m.m108591d(paint2);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14153w.f39583b);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…able.EdgeTransparentView)");
        this.f18837e = obtainStyledAttributes.getInt(0, 0);
        this.f18838f = obtainStyledAttributes.getDimension(1, (float) C76577a.m92150a(context, 20.0f));
        obtainStyledAttributes.recycle();
        this.f18845p = new int[]{-1, 0};
        this.f18846q = new float[]{0.0f, 1.0f};
    }
}
