package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.scanner.ui.StrokedImageView */
public class StrokedImageView extends ImageView {

    /* renamed from: d */
    public int f20591d;

    public StrokedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20591d = context.getResources().getColor(C0966R.color.a_x);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect clipBounds = canvas.getClipBounds();
        clipBounds.left++;
        clipBounds.top++;
        clipBounds.bottom--;
        clipBounds.right--;
        Paint paint = new Paint();
        paint.setColor(this.f20591d);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(1.5f);
        canvas.drawRect(clipBounds, paint);
    }

    public void setStrokeColor(int i) {
        this.f20591d = i;
    }
}
