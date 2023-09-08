package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import t40.C77853a;

/* renamed from: com.tencent.mm.ui.widget.RoundCornerImageView */
public class RoundCornerImageView extends AppCompatImageView {

    /* renamed from: f */
    public int f220448f = 8;

    /* renamed from: g */
    public int f220449g = 8;

    /* renamed from: h */
    public Paint f220450h = new Paint();

    /* renamed from: i */
    public Path f220451i = new Path();

    /* renamed from: j */
    public RectF f220452j = new RectF();

    /* renamed from: n */
    public Paint f220453n;

    /* renamed from: o */
    public int f220454o = 0;

    /* renamed from: p */
    public int f220455p;

    public RoundCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo104339p(context, attributeSet);
    }

    public void draw(Canvas canvas) {
        if (getWidth() <= 0 || getHeight() <= 0) {
            super.draw(canvas);
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        if (createBitmap.isRecycled()) {
            createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            canvas2 = new Canvas(createBitmap);
        }
        super.draw(canvas2);
        this.f220450h.setAntiAlias(true);
        this.f220450h.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f220452j.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        this.f220451i.addRoundRect(this.f220452j, (float) this.f220448f, (float) this.f220449g, Path.Direction.CW);
        this.f220451i.setFillType(Path.FillType.INVERSE_WINDING);
        canvas2.drawPath(this.f220451i, this.f220450h);
        Paint paint = this.f220453n;
        if (paint != null) {
            float strokeWidth = paint.getStrokeWidth() / 2.0f;
            canvas2.drawRoundRect(new RectF(strokeWidth, strokeWidth, ((float) getWidth()) - strokeWidth, ((float) getHeight()) - strokeWidth), (float) this.f220448f, (float) this.f220449g, this.f220453n);
        }
        this.f220450h.reset();
        this.f220450h.setXfermode((Xfermode) null);
        int i = this.f220454o;
        if (i > 0) {
            float f = (float) 0;
            this.f220450h.setShadowLayer((float) i, f, f, this.f220455p);
        }
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, this.f220450h);
        createBitmap.recycle();
    }

    /* renamed from: p */
    public final void mo104339p(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226847B);
            this.f220448f = obtainStyledAttributes.getDimensionPixelSize(1, this.f220448f);
            this.f220449g = obtainStyledAttributes.getDimensionPixelSize(0, this.f220449g);
            obtainStyledAttributes.recycle();
            return;
        }
        float f = context.getResources().getDisplayMetrics().density;
        this.f220448f = (int) (((float) this.f220448f) * f);
        this.f220449g = (int) (((float) this.f220449g) * f);
    }

    /* renamed from: q */
    public void mo104340q(int i, int i2) {
        Paint paint = new Paint();
        this.f220453n = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f220453n.setStrokeWidth((float) i);
        this.f220453n.setAntiAlias(true);
        this.f220453n.setColor(i2);
    }

    public void setRoundHeight(int i) {
        this.f220449g = i;
    }

    public void setRoundWidth(int i) {
        this.f220448f = i;
    }

    public RoundCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo104339p(context, attributeSet);
    }

    public RoundCornerImageView(Context context) {
        super(context, (AttributeSet) null);
        mo104339p(context, (AttributeSet) null);
    }
}
