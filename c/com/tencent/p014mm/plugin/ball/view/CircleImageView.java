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
import androidx.appcompat.widget.AppCompatImageView;
import com.tencent.p014mm.C0966R;
import kg3.C76577a;
import p385u2.C111105a;

/* renamed from: com.tencent.mm.plugin.ball.view.CircleImageView */
public class CircleImageView extends AppCompatImageView {

    /* renamed from: f */
    public int f197427f;

    /* renamed from: g */
    public int f197428g;

    /* renamed from: h */
    public long f197429h = -2147483648L;

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f197427f = C76577a.m92155f(context, C0966R.dimen.a_o);
        this.f197428g = C76577a.m92155f(context, C0966R.dimen.a_o);
    }

    public void draw(Canvas canvas) {
        int width = getWidth() > 0 ? getWidth() : getMeasuredWidth() > 0 ? getMeasuredWidth() : this.f197427f;
        int width2 = getWidth() > 0 ? getWidth() : getMeasuredHeight() > 0 ? getMeasuredHeight() : this.f197428g;
        Bitmap createBitmap = Bitmap.createBitmap(width, width2, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        if (createBitmap.isRecycled()) {
            createBitmap = Bitmap.createBitmap(width, width2, Bitmap.Config.ARGB_8888);
            canvas2 = new Canvas(createBitmap);
        }
        Canvas canvas3 = canvas2;
        super.draw(canvas3);
        if (this.f197429h >= 0) {
            float width3 = (float) (getWidth() > 0 ? getWidth() : getMeasuredWidth() > 0 ? getMeasuredWidth() : this.f197427f);
            float f = width3 / 2.0f;
            float width4 = ((float) (getWidth() > 0 ? getWidth() : getMeasuredHeight() > 0 ? getMeasuredHeight() : this.f197428g)) / 2.0f;
            float a = (float) C76577a.m92150a(getContext(), 1.5f);
            float f2 = ((width3 * 0.7083333f) / 2.0f) - a;
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(a);
            paint.setColor(C111105a.m151500b(getContext(), C0966R.color.BW_0_Alpha_0_1));
            canvas3.drawCircle(f, width4, f2, paint);
            paint.setColor(C111105a.m151500b(getContext(), C0966R.color.akw));
            canvas3.drawArc(f - f2, width4 - f2, f + f2, width4 + f2, -90.0f, (((float) this.f197429h) / 100.0f) * 360.0f, false, paint);
        }
        int width5 = getWidth() > 0 ? getWidth() : getMeasuredWidth() > 0 ? getMeasuredWidth() : this.f197427f;
        int width6 = getWidth() > 0 ? getWidth() : getMeasuredHeight() > 0 ? getMeasuredHeight() : this.f197428g;
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
        this.f197429h = j;
        postInvalidate();
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197427f = C76577a.m92155f(context, C0966R.dimen.a_o);
        this.f197428g = C76577a.m92155f(context, C0966R.dimen.a_o);
    }
}
