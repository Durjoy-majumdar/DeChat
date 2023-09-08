package com.tencent.p014mm.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import t40.C77853a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0011B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/view/RCConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "r", "Lrx3/b0;", "setRadius", "Lcom/tencent/mm/view/RCConstraintLayout$a;", "cornerRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.RCConstraintLayout */
public final class RCConstraintLayout extends ConstraintLayout {

    /* renamed from: v */
    public C7078a f24921v = new C7078a(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: w */
    public final Path f24922w = new Path();

    /* renamed from: com.tencent.mm.view.RCConstraintLayout$a */
    public static final class C7078a {

        /* renamed from: a */
        public float f24923a;

        /* renamed from: b */
        public float f24924b;

        /* renamed from: c */
        public float f24925c;

        /* renamed from: d */
        public float f24926d;

        public C7078a(float f, float f2, float f3, float f4) {
            this.f24923a = f;
            this.f24924b = f2;
            this.f24925c = f3;
            this.f24926d = f4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7078a)) {
                return false;
            }
            C7078a aVar = (C7078a) obj;
            return C87412m.m108589b(Float.valueOf(this.f24923a), Float.valueOf(aVar.f24923a)) && C87412m.m108589b(Float.valueOf(this.f24924b), Float.valueOf(aVar.f24924b)) && C87412m.m108589b(Float.valueOf(this.f24925c), Float.valueOf(aVar.f24925c)) && C87412m.m108589b(Float.valueOf(this.f24926d), Float.valueOf(aVar.f24926d));
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f24923a) * 31) + Float.floatToIntBits(this.f24924b)) * 31) + Float.floatToIntBits(this.f24925c)) * 31) + Float.floatToIntBits(this.f24926d);
        }

        public String toString() {
            return "topLeft:" + this.f24923a + ", topRight:" + this.f24924b + ", bottomLeft:" + this.f24925c + ", bottomRight:" + this.f24926d;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RCConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        if (attributeSet != null) {
            mo8144r(attributeSet, 0);
        }
    }

    public void dispatchDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        C7078a aVar = this.f24921v;
        if (aVar.f24923a > 0.0f || aVar.f24924b > 0.0f || aVar.f24925c > 0.0f || aVar.f24926d > 0.0f) {
            this.f24922w.reset();
            RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            Path path = this.f24922w;
            C7078a aVar2 = this.f24921v;
            float f = aVar2.f24923a;
            float f2 = aVar2.f24924b;
            float f3 = aVar2.f24926d;
            float f4 = aVar2.f24925c;
            path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CCW);
            this.f24922w.close();
            canvas.clipPath(this.f24922w);
        }
        super.dispatchDraw(canvas);
    }

    /* renamed from: r */
    public final void mo8144r(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C77853a.f226878x, i, 0);
            C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…raintLayout, defStyle, 0)");
            if (obtainStyledAttributes.hasValue(0)) {
                float dimension = (float) ((int) obtainStyledAttributes.getDimension(0, ((float) C76577a.m92151b(getContext(), 4)) * 1.0f));
                C7078a aVar = this.f24921v;
                aVar.f24923a = dimension;
                aVar.f24924b = dimension;
                aVar.f24925c = dimension;
                aVar.f24926d = dimension;
                Log.m105924i("RCConstraintLayout", "initAttribute radius:" + this.f24921v);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void setRadius(C7078a aVar) {
        C87412m.m108594g(aVar, "cornerRadius");
        this.f24921v = aVar;
        requestLayout();
    }

    public final void setRadius(float f) {
        C7078a aVar = this.f24921v;
        aVar.f24923a = f;
        aVar.f24924b = f;
        aVar.f24925c = f;
        aVar.f24926d = f;
        requestLayout();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RCConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        if (attributeSet != null) {
            mo8144r(attributeSet, i);
        }
    }
}
