package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import t40.C77853a;

/* renamed from: com.tencent.mm.ui.widget.RoundedCornerFrameLayout */
public class RoundedCornerFrameLayout extends FrameLayout {

    /* renamed from: d */
    public C106766a f319191d;

    /* renamed from: e */
    public Paint f319192e;

    /* renamed from: f */
    public Bitmap f319193f;

    /* renamed from: com.tencent.mm.ui.widget.RoundedCornerFrameLayout$a */
    public class C106766a {

        /* renamed from: a */
        public float f319194a;

        /* renamed from: b */
        public float f319195b;

        /* renamed from: c */
        public float f319196c;

        /* renamed from: d */
        public float f319197d;

        public C106766a(RoundedCornerFrameLayout roundedCornerFrameLayout, float f, float f2, float f3, float f4) {
            this.f319194a = f;
            this.f319195b = f2;
            this.f319196c = f3;
            this.f319197d = f4;
        }
    }

    public RoundedCornerFrameLayout(Context context) {
        super(context);
        m144175a(context, (AttributeSet) null, 0, 0);
    }

    /* renamed from: a */
    private void m144175a(Context context, AttributeSet attributeSet, int i, int i2) {
        float dimension = context.obtainStyledAttributes(attributeSet, C77853a.f226849D, i, i2).getDimension(0, 0.0f);
        this.f319191d = new C106766a(this, dimension, dimension, dimension, dimension);
        Paint paint = new Paint(1);
        this.f319192e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        setWillNotDraw(false);
    }

    /* renamed from: b */
    public void mo153905b(float f, float f2, float f3, float f4) {
        C106766a aVar = this.f319191d;
        aVar.f319194a = f;
        aVar.f319195b = f2;
        aVar.f319196c = f3;
        aVar.f319197d = f4;
        if (this.f319193f != null) {
            this.f319193f = null;
            postInvalidate();
        }
    }

    public void draw(Canvas canvas) {
        if (canvas.getWidth() > 0 && canvas.getHeight() > 0) {
            int saveLayer = canvas.saveLayer(new RectF(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight()), (Paint) null, 31);
            super.draw(canvas);
            C106766a aVar = this.f319191d;
            if (aVar.f319194a > 0.0f || aVar.f319195b > 0.0f || aVar.f319196c > 0.0f || aVar.f319197d > 0.0f) {
                if (this.f319193f == null) {
                    int width = canvas.getWidth();
                    int height = canvas.getHeight();
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ALPHA_8);
                    Canvas canvas2 = new Canvas(createBitmap);
                    Path path = new Path();
                    RectF rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
                    C106766a aVar2 = this.f319191d;
                    float f = aVar2.f319194a;
                    float f2 = aVar2.f319195b;
                    float f3 = aVar2.f319197d;
                    float f4 = aVar2.f319196c;
                    path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CCW);
                    path.setFillType(Path.FillType.WINDING);
                    canvas2.drawPath(path, new Paint(1));
                    this.f319193f = createBitmap;
                }
                canvas.drawBitmap(this.f319193f, 0.0f, 0.0f, this.f319192e);
            }
            canvas.restoreToCount(saveLayer);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f319193f = null;
    }

    public void setRadius(float f) {
        mo153905b(f, f, f, f);
    }

    public RoundedCornerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m144175a(context, attributeSet, 0, 0);
    }

    public RoundedCornerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m144175a(context, attributeSet, i, 0);
    }

    public RoundedCornerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m144175a(context, attributeSet, i, 0);
    }
}
