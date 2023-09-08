package com.tencent.p014mm.plugin.card.p031ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: com.tencent.mm.plugin.card.ui.view.CircularImageView */
public class CircularImageView extends ImageView {

    /* renamed from: d */
    public Paint f197613d;

    public CircularImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            RectF rectF = new RectF(rect);
            this.f197613d.setAntiAlias(true);
            this.f197613d.setDither(true);
            this.f197613d.setFlags(1);
            canvas2.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            canvas2.drawARGB(0, 0, 0, 0);
            float f = (float) 20;
            canvas2.drawRoundRect(rectF, f, f, this.f197613d);
            this.f197613d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas2.drawBitmap(bitmap, rect, rect, this.f197613d);
            Rect rect2 = new Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
            Rect rect3 = new Rect(0, 0, getWidth(), getHeight());
            this.f197613d.reset();
            canvas.drawBitmap(createBitmap, rect2, rect3, this.f197613d);
            canvas.save();
            return;
        }
        super.onDraw(canvas);
    }

    public CircularImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f197613d = new Paint();
    }
}
