package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import gy3.C87412m;
import kotlin.Metadata;
import t40.C77853a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/OutRoundCornerLayout;", "Landroid/widget/FrameLayout;", "", "radius", "Lrx3/b0;", "setRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.OutRoundCornerLayout */
public final class OutRoundCornerLayout extends FrameLayout {

    /* renamed from: d */
    public C105311a f312912d;

    /* renamed from: e */
    public Path f312913e = new Path();

    /* renamed from: com.tencent.mm.plugin.finder.view.OutRoundCornerLayout$a */
    public static final class C105311a {

        /* renamed from: a */
        public float f312914a;

        /* renamed from: b */
        public float f312915b;

        /* renamed from: c */
        public float f312916c;

        /* renamed from: d */
        public float f312917d;

        public C105311a(float f, float f2, float f3, float f4) {
            this.f312914a = f;
            this.f312915b = f2;
            this.f312916c = f3;
            this.f312917d = f4;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OutRoundCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226849D, 0, 0);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…FrameLayout, defStyle, 0)");
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f312912d = new C105311a(dimension, dimension, dimension, dimension);
        setWillNotDraw(false);
    }

    /* renamed from: a */
    public final void mo149779a() {
        C105311a aVar;
        if (getWidth() > 0 && getHeight() > 0 && (aVar = this.f312912d) != null) {
            this.f312913e.reset();
            RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            Path path = this.f312913e;
            float f = aVar.f312914a;
            float f2 = aVar.f312915b;
            float f3 = aVar.f312917d;
            float f4 = aVar.f312916c;
            path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CCW);
            this.f312913e.close();
        }
    }

    public void draw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        if (this.f312913e.isEmpty()) {
            mo149779a();
        }
        int save = canvas.save();
        canvas.clipPath(this.f312913e, Region.Op.DIFFERENCE);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo149779a();
    }

    public final void setRadius(float f) {
        C105311a aVar = this.f312912d;
        C87412m.m108591d(aVar);
        aVar.f312914a = f;
        C105311a aVar2 = this.f312912d;
        C87412m.m108591d(aVar2);
        aVar2.f312915b = f;
        C105311a aVar3 = this.f312912d;
        C87412m.m108591d(aVar3);
        aVar3.f312916c = f;
        C105311a aVar4 = this.f312912d;
        C87412m.m108591d(aVar4);
        aVar4.f312917d = f;
        mo149779a();
        postInvalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OutRoundCornerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226849D, i, 0);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…FrameLayout, defStyle, 0)");
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f312912d = new C105311a(dimension, dimension, dimension, dimension);
        setWillNotDraw(false);
    }
}
