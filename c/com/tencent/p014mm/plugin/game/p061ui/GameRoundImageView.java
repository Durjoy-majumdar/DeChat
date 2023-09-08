package com.tencent.p014mm.plugin.game.p061ui;

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

/* renamed from: com.tencent.mm.plugin.game.ui.GameRoundImageView */
public class GameRoundImageView extends AppCompatImageView {

    /* renamed from: j */
    public static final PorterDuffXfermode f162844j = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);

    /* renamed from: f */
    public Bitmap f162845f;

    /* renamed from: g */
    public RectF f162846g;

    /* renamed from: h */
    public Rect f162847h;

    /* renamed from: i */
    public Bitmap f162848i;

    public GameRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        if (this.f162847h == null) {
            this.f162847h = new Rect(0, 0, getWidth(), getHeight());
        }
        if (this.f162846g == null) {
            this.f162846g = new RectF(this.f162847h);
        }
        if (!(this.f162845f == null || this.f162848i == null)) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (Paint) null, 31);
            Bitmap bitmap = this.f162848i;
            Rect rect = this.f162847h;
            canvas.drawBitmap(bitmap, rect, rect, paint);
            paint.setXfermode(f162844j);
            canvas.drawBitmap(this.f162845f, (Rect) null, this.f162847h, paint);
            canvas.restoreToCount(saveLayer);
            paint.setXfermode((Xfermode) null);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        paint.setColor(getResources().getColor(C0966R.color.f3503vk));
        canvas.drawRoundRect(this.f162846g, 18.0f, 18.0f, paint);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f162846g = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        this.f162847h = new Rect(0, 0, i, i2);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        canvas.drawRoundRect(this.f162846g, 18.0f, 18.0f, paint);
        this.f162848i = createBitmap;
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f162845f = bitmap;
        super.setImageBitmap(bitmap);
    }
}
