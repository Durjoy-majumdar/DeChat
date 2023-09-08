package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import gy3.C87412m;
import kotlin.Metadata;
import t40.C77853a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/TopRoundCornerConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "radius", "Lrx3/b0;", "setRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.TopRoundCornerConstraintLayout */
public final class TopRoundCornerConstraintLayout extends ConstraintLayout {

    /* renamed from: v */
    public C57862a f165524v;

    /* renamed from: w */
    public Path f165525w = new Path();

    /* renamed from: com.tencent.mm.ui.widget.TopRoundCornerConstraintLayout$a */
    public static final class C57862a {

        /* renamed from: a */
        public float f165526a;

        /* renamed from: b */
        public float f165527b;

        public C57862a(float f, float f2, float f3, float f4) {
            this.f165526a = f;
            this.f165527b = f2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopRoundCornerConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226849D, 0, 0);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…FrameLayout, defStyle, 0)");
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f165524v = new C57862a(dimension, dimension, 0.0f, 0.0f);
        setWillNotDraw(false);
    }

    public void draw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        if (this.f165525w.isEmpty()) {
            mo82322r();
        }
        int save = canvas.save();
        canvas.clipPath(this.f165525w);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo82322r();
    }

    /* renamed from: r */
    public final void mo82322r() {
        C57862a aVar;
        if (getWidth() > 0 && getHeight() > 0 && (aVar = this.f165524v) != null) {
            this.f165525w.reset();
            RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            Path path = this.f165525w;
            float f = aVar.f165526a;
            float f2 = aVar.f165527b;
            path.addRoundRect(rectF, new float[]{f, f, f2, f2, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
            this.f165525w.close();
        }
    }

    public final void setRadius(float f) {
        C57862a aVar = this.f165524v;
        C87412m.m108591d(aVar);
        aVar.f165526a = f;
        C57862a aVar2 = this.f165524v;
        C87412m.m108591d(aVar2);
        aVar2.f165527b = f;
        mo82322r();
        postInvalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopRoundCornerConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226849D, i, 0);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…FrameLayout, defStyle, 0)");
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f165524v = new C57862a(dimension, dimension, 0.0f, 0.0f);
        setWillNotDraw(false);
    }
}
