package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: com.tencent.mapsdk.internal.qb */
public final class C104567qb extends LinearLayout {

    /* renamed from: a */
    private Path f309965a;

    /* renamed from: b */
    private Paint f309966b;

    /* renamed from: c */
    private Paint f309967c;

    /* renamed from: d */
    private RectF f309968d;

    /* renamed from: e */
    private float f309969e;

    /* renamed from: f */
    private float f309970f;

    /* renamed from: g */
    private int f309971g = -1;

    public C104567qb(Context context) {
        super(context);
        m140077a();
    }

    /* renamed from: a */
    private void m140077a() {
        this.f309970f = getResources().getDisplayMetrics().density / 2.0f;
        this.f309965a = new Path();
        m140079b();
    }

    /* renamed from: b */
    private void m140079b() {
        Paint paint = new Paint();
        this.f309966b = paint;
        paint.setColor(this.f309971g);
        this.f309966b.setAntiAlias(true);
        this.f309966b.setStyle(Paint.Style.FILL);
        this.f309966b.setShadowLayer(this.f309970f, 0.0f, 0.0f, -1);
        Paint paint2 = new Paint();
        this.f309967c = paint2;
        paint2.setColor(this.f309971g);
        this.f309967c.setAntiAlias(true);
        this.f309967c.setStyle(Paint.Style.STROKE);
        this.f309967c.setShadowLayer(this.f309970f, 0.0f, 0.0f, -16777216);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int saveLayer = canvas.saveLayer(this.f309968d, (Paint) null, 31);
        canvas.drawColor(this.f309971g);
        canvas.drawPath(this.f309965a, this.f309967c);
        if (Build.VERSION.SDK_INT <= 27) {
            this.f309966b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawPath(this.f309965a, this.f309966b);
        } else {
            this.f309966b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            Path path = new Path();
            path.addRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), Path.Direction.CW);
            path.op(this.f309965a, Path.Op.DIFFERENCE);
            canvas.drawPath(path, this.f309966b);
        }
        canvas.restoreToCount(saveLayer);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f309968d == null) {
            this.f309968d = new RectF();
        }
        this.f309968d.right = (float) getMeasuredWidth();
        this.f309968d.bottom = (float) getMeasuredHeight();
        if (this.f309968d.width() < this.f309968d.height()) {
            this.f309969e = this.f309968d.width() / 2.0f;
        } else {
            this.f309969e = this.f309968d.height() / 2.0f;
        }
        this.f309965a.reset();
        Path path = this.f309965a;
        RectF rectF = this.f309968d;
        float f = this.f309969e;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    public final void setDarkStyle(boolean z) {
        if (z) {
            this.f309971g = Color.parseColor("#2C2C2C");
        } else {
            this.f309971g = -1;
        }
        m140079b();
        invalidate();
    }

    private C104567qb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m140077a();
    }

    /* renamed from: a */
    private void m140078a(Canvas canvas) {
        if (Build.VERSION.SDK_INT <= 27) {
            this.f309966b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawPath(this.f309965a, this.f309966b);
            return;
        }
        this.f309966b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Path path = new Path();
        path.addRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), Path.Direction.CW);
        path.op(this.f309965a, Path.Op.DIFFERENCE);
        canvas.drawPath(path, this.f309966b);
    }
}
