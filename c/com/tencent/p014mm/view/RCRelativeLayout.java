package com.tencent.p014mm.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import t40.C77853a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0011B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/view/RCRelativeLayout;", "Landroid/widget/RelativeLayout;", "", "r", "Lrx3/b0;", "setRadius", "Lcom/tencent/mm/view/RCRelativeLayout$a;", "cornerRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.RCRelativeLayout */
public final class RCRelativeLayout extends RelativeLayout {

    /* renamed from: d */
    public C7079a f24927d = new C7079a(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: e */
    public final Path f24928e = new Path();

    /* renamed from: com.tencent.mm.view.RCRelativeLayout$a */
    public static final class C7079a {

        /* renamed from: a */
        public float f24929a;

        /* renamed from: b */
        public float f24930b;

        /* renamed from: c */
        public float f24931c;

        /* renamed from: d */
        public float f24932d;

        public C7079a(float f, float f2, float f3, float f4) {
            this.f24929a = f;
            this.f24930b = f2;
            this.f24931c = f3;
            this.f24932d = f4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7079a)) {
                return false;
            }
            C7079a aVar = (C7079a) obj;
            return C87412m.m108589b(Float.valueOf(this.f24929a), Float.valueOf(aVar.f24929a)) && C87412m.m108589b(Float.valueOf(this.f24930b), Float.valueOf(aVar.f24930b)) && C87412m.m108589b(Float.valueOf(this.f24931c), Float.valueOf(aVar.f24931c)) && C87412m.m108589b(Float.valueOf(this.f24932d), Float.valueOf(aVar.f24932d));
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f24929a) * 31) + Float.floatToIntBits(this.f24930b)) * 31) + Float.floatToIntBits(this.f24931c)) * 31) + Float.floatToIntBits(this.f24932d);
        }

        public String toString() {
            return "topLeft:" + this.f24929a + ", topRight:" + this.f24930b + ", bottomLeft:" + this.f24931c + ", bottomRight:" + this.f24932d;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RCRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        if (attributeSet != null) {
            mo8150a(attributeSet, 0);
        }
    }

    /* renamed from: a */
    public final void mo8150a(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C77853a.f226878x, i, 0);
            C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…raintLayout, defStyle, 0)");
            if (obtainStyledAttributes.hasValue(0)) {
                float dimension = (float) ((int) obtainStyledAttributes.getDimension(0, ((float) C76577a.m92151b(getContext(), 4)) * 1.0f));
                C7079a aVar = this.f24927d;
                aVar.f24929a = dimension;
                aVar.f24930b = dimension;
                aVar.f24931c = dimension;
                aVar.f24932d = dimension;
                Log.m105924i("RCRelativeLayout", "initAttribute radius:" + this.f24927d);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void dispatchDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        C7079a aVar = this.f24927d;
        if (aVar.f24929a > 0.0f || aVar.f24930b > 0.0f || aVar.f24931c > 0.0f || aVar.f24932d > 0.0f) {
            this.f24928e.reset();
            RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            Path path = this.f24928e;
            C7079a aVar2 = this.f24927d;
            float f = aVar2.f24929a;
            float f2 = aVar2.f24930b;
            float f3 = aVar2.f24932d;
            float f4 = aVar2.f24931c;
            path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CCW);
            this.f24928e.close();
            canvas.clipPath(this.f24928e);
        }
        super.dispatchDraw(canvas);
    }

    public final void setRadius(C7079a aVar) {
        C87412m.m108594g(aVar, "cornerRadius");
        this.f24927d = aVar;
        requestLayout();
    }

    public final void setRadius(float f) {
        C7079a aVar = this.f24927d;
        aVar.f24929a = f;
        aVar.f24930b = f;
        aVar.f24931c = f;
        aVar.f24932d = f;
        requestLayout();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RCRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        if (attributeSet != null) {
            mo8150a(attributeSet, i);
        }
    }
}
