package com.tencent.p014mm.plugin.ball.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import kg3.C76577a;
import p385u2.C111105a;

/* renamed from: com.tencent.mm.plugin.ball.view.CircleAnimateView */
public class CircleAnimateView extends MMAnimateView {

    /* renamed from: n */
    public int f197424n;

    /* renamed from: o */
    public int f197425o;

    /* renamed from: p */
    public long f197426p = -2147483648L;

    public CircleAnimateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f197424n = C76577a.m92155f(context, C0966R.dimen.a8s);
        this.f197425o = C76577a.m92155f(context, C0966R.dimen.a8s);
    }

    public void draw(Canvas canvas) {
        int width = getWidth() > 0 ? getWidth() : getMeasuredWidth() > 0 ? getMeasuredWidth() : this.f197424n;
        int width2 = getWidth() > 0 ? getWidth() : getMeasuredHeight() > 0 ? getMeasuredHeight() : this.f197425o;
        Bitmap createBitmap = Bitmap.createBitmap(width, width2, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        if (createBitmap.isRecycled()) {
            createBitmap = Bitmap.createBitmap(width, width2, Bitmap.Config.ARGB_8888);
            canvas2 = new Canvas(createBitmap);
        }
        Canvas canvas3 = canvas2;
        super.draw(canvas3);
        if (this.f197426p >= 0) {
            float width3 = (float) (getWidth() > 0 ? getWidth() : getMeasuredWidth() > 0 ? getMeasuredWidth() : this.f197424n);
            float f = width3 / 2.0f;
            float width4 = ((float) (getWidth() > 0 ? getWidth() : getMeasuredHeight() > 0 ? getMeasuredHeight() : this.f197425o)) / 2.0f;
            float a = (float) C76577a.m92150a(getContext(), 1.5f);
            float f2 = ((width3 * 0.9166667f) / 2.0f) - a;
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(a);
            paint.setColor(C111105a.m151500b(getContext(), C0966R.color.BW_0_Alpha_0_1));
            canvas3.drawCircle(f, width4, f2, paint);
            paint.setColor(C111105a.m151500b(getContext(), C0966R.color.akw));
            canvas3.drawArc(f - f2, width4 - f2, f + f2, width4 + f2, -90.0f, (((float) this.f197426p) / 100.0f) * 360.0f, false, paint);
        }
        int width5 = getWidth() > 0 ? getWidth() : getMeasuredWidth() > 0 ? getMeasuredWidth() : this.f197424n;
        int width6 = getWidth() > 0 ? getWidth() : getMeasuredHeight() > 0 ? getMeasuredHeight() : this.f197425o;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Path path = new Path();
        float f3 = (float) width5;
        float f4 = (float) width6;
        path.addRoundRect(new RectF(0.0f, 0.0f, f3, f4), f3, f4, Path.Direction.CW);
        path.setFillType(Path.FillType.INVERSE_WINDING);
        canvas3.drawPath(path, paint2);
        Paint paint3 = new Paint();
        paint3.setXfermode((Xfermode) null);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint3);
        createBitmap.recycle();
    }

    public void setProgress(long j) {
        this.f197426p = j;
        postInvalidate();
    }

    public CircleAnimateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197424n = C76577a.m92155f(context, C0966R.dimen.a8s);
        this.f197425o = C76577a.m92155f(context, C0966R.dimen.a8s);
    }
}
