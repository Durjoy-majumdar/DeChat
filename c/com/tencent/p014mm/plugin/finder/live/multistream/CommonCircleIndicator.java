package com.tencent.p014mm.plugin.finder.live.multistream;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import eg1.C58591p0;
import gy3.C87412m;
import java.util.Iterator;
import kotlin.Metadata;
import my3.C61595o;
import p385u2.C111105a;
import sx3.C36904l0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0002@BX\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/multistream/CommonCircleIndicator;", "Landroid/view/View;", "", "getIndicatorHeight", "", "value", "j", "I", "setSelected", "(I)V", "selected", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.multistream.CommonCircleIndicator */
public final class CommonCircleIndicator extends View {

    /* renamed from: d */
    public int f159414d;

    /* renamed from: e */
    public Paint f159415e;

    /* renamed from: f */
    public int f159416f;

    /* renamed from: g */
    public int f159417g;

    /* renamed from: h */
    public float f159418h;

    /* renamed from: i */
    public float f159419i;

    /* renamed from: j */
    public int f159420j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommonCircleIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    private final void setSelected(int i) {
        this.f159420j = Math.min(this.f159414d - 1, i);
        invalidate();
    }

    /* renamed from: a */
    public final void mo77661a(int i) {
        int i2 = this.f159414d;
        if (i >= i2) {
            i = i2 - 1;
        }
        setSelected(i);
        invalidate();
    }

    public final float getIndicatorHeight() {
        return this.f159418h;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        super.onDraw(canvas);
        Iterator it = C61595o.m72301i(0, this.f159414d).iterator();
        while (it.hasNext()) {
            int a = ((C36904l0) it).mo59695a();
            if (a == this.f159420j) {
                this.f159415e.setColor(this.f159416f);
            } else {
                this.f159415e.setColor(this.f159417g);
            }
            float f = this.f159418h;
            canvas.drawCircle((((float) a) * (this.f159419i + f)) + (f / 2.0f), f / 2.0f, f / 2.0f, this.f159415e);
        }
    }

    public void onMeasure(int i, int i2) {
        float f = this.f159418h;
        int i3 = this.f159414d;
        setMeasuredDimension(i3 > 0 ? (int) ((((float) i3) * f) + (this.f159419i * ((float) (i3 - 1)))) : 0, (int) f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonCircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f159415e = new Paint(1);
        this.f159416f = C111105a.m151500b(context, C0966R.color.BW_100_Alpha_0_6);
        this.f159417g = C111105a.m151500b(context, C0966R.color.BW_100_Alpha_0_3);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C58591p0.f167749a, i, 0);
            C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…dicator, defStyleAttr, 0)");
            this.f159416f = obtainStyledAttributes.getColor(3, getResources().getColor(C0966R.color.al6));
            this.f159417g = obtainStyledAttributes.getColor(2, getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
            this.f159418h = obtainStyledAttributes.getDimension(1, 12.0f);
            this.f159419i = obtainStyledAttributes.getDimension(0, 16.0f);
            obtainStyledAttributes.recycle();
        }
    }
}
