package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import gy3.C87412m;
import kotlin.Metadata;
import t40.C77853a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/RoundCornerRelativeLayout;", "Landroid/widget/RelativeLayout;", "", "radius", "Lrx3/b0;", "setRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.RoundCornerRelativeLayout */
public class RoundCornerRelativeLayout extends RelativeLayout {

    /* renamed from: d */
    public C57861a f165518d;

    /* renamed from: e */
    public Path f165519e = new Path();

    /* renamed from: com.tencent.mm.ui.widget.RoundCornerRelativeLayout$a */
    public static final class C57861a {

        /* renamed from: a */
        public float f165520a;

        /* renamed from: b */
        public float f165521b;

        /* renamed from: c */
        public float f165522c;

        /* renamed from: d */
        public float f165523d;

        public C57861a(float f, float f2, float f3, float f4) {
            this.f165520a = f;
            this.f165521b = f2;
            this.f165522c = f3;
            this.f165523d = f4;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundCornerRelativeLayout(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        mo82315a(context, (AttributeSet) null, 0);
    }

    /* renamed from: a */
    public final void mo82315a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226849D, i, 0);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…FrameLayout, defStyle, 0)");
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f165518d = new C57861a(dimension, dimension, dimension, dimension);
        setWillNotDraw(false);
    }

    /* renamed from: b */
    public final void mo82316b() {
        C57861a aVar;
        if (getWidth() > 0 && getHeight() > 0 && (aVar = this.f165518d) != null) {
            this.f165519e.reset();
            RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            Path path = this.f165519e;
            float f = aVar.f165520a;
            float f2 = aVar.f165521b;
            float f3 = aVar.f165523d;
            float f4 = aVar.f165522c;
            path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CCW);
            this.f165519e.close();
        }
    }

    /* renamed from: c */
    public final void mo82317c(float f, float f2, float f3, float f4) {
        C57861a aVar = this.f165518d;
        C87412m.m108591d(aVar);
        aVar.f165520a = f;
        C57861a aVar2 = this.f165518d;
        C87412m.m108591d(aVar2);
        aVar2.f165521b = f2;
        C57861a aVar3 = this.f165518d;
        C87412m.m108591d(aVar3);
        aVar3.f165522c = f3;
        C57861a aVar4 = this.f165518d;
        C87412m.m108591d(aVar4);
        aVar4.f165523d = f4;
        mo82316b();
        postInvalidate();
    }

    public void draw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        if (this.f165519e.isEmpty()) {
            mo82316b();
        }
        int save = canvas.save();
        canvas.clipPath(this.f165519e);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo82316b();
    }

    public final void setRadius(float f) {
        mo82317c(f, f, f, f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo82315a(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo82315a(context, attributeSet, i);
    }
}
