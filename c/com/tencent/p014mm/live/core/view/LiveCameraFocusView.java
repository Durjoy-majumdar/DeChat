package com.tencent.p014mm.live.core.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/live/core/view/LiveCameraFocusView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-core_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.core.view.LiveCameraFocusView */
public final class LiveCameraFocusView extends View {

    /* renamed from: d */
    public final Paint f157131d = new Paint();

    /* renamed from: e */
    public boolean f157132e;

    /* renamed from: f */
    public boolean f157133f;

    /* renamed from: g */
    public boolean f157134g;

    /* renamed from: h */
    public long f157135h;

    /* renamed from: i */
    public final int f157136i = 200;

    /* renamed from: j */
    public final int f157137j = 200;

    /* renamed from: n */
    public final int f157138n = 3;

    /* renamed from: o */
    public final int f157139o = 300;

    /* renamed from: p */
    public final int f157140p = 200;

    /* renamed from: q */
    public int f157141q;

    /* renamed from: r */
    public int f157142r;

    /* renamed from: s */
    public int f157143s;

    /* renamed from: t */
    public int f157144t;

    /* renamed from: u */
    public int f157145u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveCameraFocusView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        setVisibility(4);
    }

    /* renamed from: a */
    public final void mo76410a(int i, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = i2;
        }
        this.f157141q = i;
        this.f157142r = i2;
        this.f157143s = i / 2;
        this.f157144t = i2 / 2;
        this.f157145u = C76577a.m92151b(getContext(), 1);
        this.f157131d.setColor(i3);
        this.f157131d.setStrokeWidth((float) this.f157145u);
        setLayerType(1, (Paint) null);
    }

    public void draw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        super.draw(canvas);
        canvas.translate((float) (this.f157143s / 2), (float) (this.f157144t / 2));
        long currentTimeMillis = System.currentTimeMillis() - this.f157135h;
        int i = this.f157136i;
        if (currentTimeMillis > ((long) i)) {
            this.f157132e = false;
            this.f157133f = true;
        }
        int i2 = this.f157137j;
        int i3 = this.f157138n;
        if (currentTimeMillis > ((long) ((i2 * i3) + i))) {
            this.f157133f = false;
        }
        int i4 = this.f157139o;
        if (currentTimeMillis > ((long) ((i2 * i3) + i + i4))) {
            this.f157134g = true;
        }
        if (currentTimeMillis > ((long) ((i2 * i3) + i + i4 + this.f157140p))) {
            this.f157134g = false;
            canvas.drawColor(0);
            return;
        }
        if (this.f157132e) {
            float f = (((float) (((long) i) - currentTimeMillis)) / (((float) i) * 1.0f)) + 1.0f;
            canvas.scale(f, f, (float) (this.f157143s / 2), (float) (this.f157144t / 2));
            this.f157131d.setAlpha((int) (((float) 255) * (2.0f - f)));
        } else {
            canvas.scale(1.0f, 1.0f);
        }
        if (this.f157133f) {
            int i5 = this.f157137j;
            float f2 = (((float) ((currentTimeMillis - ((long) this.f157136i)) % ((long) i5))) / (((float) i5) * 1.0f)) * 2.0f;
            this.f157131d.setAlpha((int) (((float) 127) + (((float) 128) * (f2 > 1.0f ? f2 - 1.0f : 1.0f - f2))));
        } else {
            this.f157131d.setAlpha(255);
        }
        if (this.f157134g) {
            this.f157131d.setAlpha((int) (((float) 255) * (1.0f - (((float) (currentTimeMillis - ((long) ((this.f157136i + (this.f157137j * this.f157138n)) + this.f157139o)))) / (((float) this.f157140p) * 1.0f)))));
        }
        canvas.drawLine(0.0f, 0.0f, (float) this.f157143s, 0.0f, this.f157131d);
        canvas.drawLine(0.0f, 0.0f, 0.0f, (float) this.f157144t, this.f157131d);
        int i6 = this.f157143s;
        canvas.drawLine((float) i6, 0.0f, (float) i6, (float) this.f157144t, this.f157131d);
        int i7 = this.f157144t;
        canvas.drawLine(0.0f, (float) i7, (float) this.f157143s, (float) i7, this.f157131d);
        int i8 = this.f157144t;
        canvas.drawLine(0.0f, (float) (i8 / 2), (float) (this.f157143s / 10), (float) (i8 / 2), this.f157131d);
        int i9 = this.f157143s;
        int i15 = this.f157144t;
        canvas.drawLine((float) i9, (float) (i15 / 2), (float) ((i9 * 9) / 10), (float) (i15 / 2), this.f157131d);
        int i16 = this.f157143s;
        Canvas canvas2 = canvas;
        canvas2.drawLine((float) (i16 / 2), 0.0f, (float) (i16 / 2), (float) (this.f157144t / 10), this.f157131d);
        int i17 = this.f157143s;
        int i18 = this.f157144t;
        canvas2.drawLine((float) (i17 / 2), (float) i18, (float) (i17 / 2), (float) ((i18 * 9) / 10), this.f157131d);
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveCameraFocusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        setVisibility(4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveCameraFocusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        setVisibility(4);
    }
}
