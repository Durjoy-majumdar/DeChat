package com.tencent.p014mm.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import t40.C77853a;

/* renamed from: com.tencent.mm.view.RoundedCornerHardTouchableLayout */
public class RoundedCornerHardTouchableLayout extends HardTouchableLayout {

    /* renamed from: s */
    public C57900a f165665s;

    /* renamed from: com.tencent.mm.view.RoundedCornerHardTouchableLayout$a */
    public class C57900a {

        /* renamed from: a */
        public float f165666a;

        /* renamed from: b */
        public float f165667b;

        /* renamed from: c */
        public float f165668c;

        /* renamed from: d */
        public float f165669d;

        public C57900a(RoundedCornerHardTouchableLayout roundedCornerHardTouchableLayout, float f, float f2, float f3, float f4) {
            this.f165666a = f;
            this.f165667b = f2;
            this.f165668c = f3;
            this.f165669d = f4;
        }
    }

    public RoundedCornerHardTouchableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo82524g(context, attributeSet, 0);
    }

    public void dispatchDraw(Canvas canvas) {
        Path path = new Path();
        RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        C57900a aVar = this.f165665s;
        float f = aVar.f165666a;
        float f2 = aVar.f165667b;
        float f3 = aVar.f165669d;
        float f4 = aVar.f165668c;
        path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
    }

    /* renamed from: g */
    public final void mo82524g(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226850E, i, 0);
        this.f165665s = new C57900a(this, obtainStyledAttributes.getDimension(2, 0.0f), obtainStyledAttributes.getDimension(3, 0.0f), obtainStyledAttributes.getDimension(0, 0.0f), obtainStyledAttributes.getDimension(1, 0.0f));
        obtainStyledAttributes.recycle();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setRadius(float f) {
        C57900a aVar = this.f165665s;
        aVar.f165666a = f;
        aVar.f165667b = f;
        aVar.f165668c = f;
        aVar.f165669d = f;
        postInvalidate();
    }

    public RoundedCornerHardTouchableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo82524g(context, attributeSet, i);
    }
}
