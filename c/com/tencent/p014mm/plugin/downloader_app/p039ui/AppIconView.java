package com.tencent.p014mm.plugin.downloader_app.p039ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.AppIconView */
public class AppIconView extends AppCompatImageView {

    /* renamed from: j */
    public static final PorterDuffXfermode f158307j = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);

    /* renamed from: f */
    public Bitmap f158308f;

    /* renamed from: g */
    public RectF f158309g;

    /* renamed from: h */
    public Rect f158310h;

    /* renamed from: i */
    public Bitmap f158311i;

    public AppIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        if (this.f158310h == null) {
            this.f158310h = new Rect(0, 0, getWidth(), getHeight());
        }
        if (this.f158309g == null) {
            this.f158309g = new RectF(this.f158310h);
        }
        if (!(this.f158308f == null || this.f158311i == null)) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (Paint) null);
            Bitmap bitmap = this.f158311i;
            Rect rect = this.f158310h;
            canvas.drawBitmap(bitmap, rect, rect, paint);
            paint.setXfermode(f158307j);
            canvas.drawBitmap(this.f158308f, (Rect) null, this.f158310h, paint);
            canvas.restoreToCount(saveLayer);
            paint.setXfermode((Xfermode) null);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        paint.setColor(getResources().getColor(C0966R.color.f3098f7));
        canvas.drawRoundRect(this.f158309g, 32.0f, 32.0f, paint);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f158309g = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        this.f158310h = new Rect(0, 0, i, i2);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(getResources().getColor(C0966R.color.f3097f6));
        canvas.drawRoundRect(this.f158309g, 32.0f, 32.0f, paint);
        this.f158311i = createBitmap;
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f158308f = bitmap;
        super.setImageBitmap(bitmap);
    }
}
