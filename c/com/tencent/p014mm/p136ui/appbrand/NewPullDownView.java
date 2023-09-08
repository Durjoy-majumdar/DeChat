package com.tencent.p014mm.p136ui.appbrand;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.appbrand.NewPullDownView */
public class NewPullDownView extends View {

    /* renamed from: d */
    public float f24171d = 0.0f;

    /* renamed from: e */
    public float f24172e = (getResources().getDisplayMetrics().density * 20.0f);

    /* renamed from: f */
    public float f24173f = ((getResources().getDisplayMetrics().density * 14.0f) - (getResources().getDisplayMetrics().density * 4.0f));

    /* renamed from: g */
    public Paint f24174g;

    /* renamed from: h */
    public Paint f24175h;

    public NewPullDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f24174g = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f24174g.setColor(-4408132);
        Paint paint2 = new Paint(1);
        this.f24175h = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f24175h.setColor(0);
        this.f24175h.setStrokeWidth(getResources().getDisplayMetrics().density * 4.0f);
        this.f24175h.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = (float) (getMeasuredWidth() / 2);
        float measuredHeight = (float) (getMeasuredHeight() / 2);
        canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null, 31);
        canvas.drawCircle(measuredWidth, measuredHeight, (this.f24171d * this.f24172e) / 2.0f, this.f24174g);
        float f = this.f24171d;
        if (f >= 0.4f) {
            canvas.drawCircle(measuredWidth, measuredHeight, (((f - 0.4f) / 0.6f) * this.f24173f) / 2.0f, this.f24175h);
        }
        canvas.restore();
    }

    public void setVerticalScrollPercent(float f) {
        Log.m105925i("MicroMsg.PullDownView", "[setVerticalScrollPercent] percent:%s", Float.valueOf(f));
        this.f24171d = Math.max(0.0f, Math.min(f, 1.0f));
        postInvalidate();
    }
}
