package com.tencent.p014mm.plugin.facedetectaction.p046ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.facedetectaction.ui.FaceActionMask */
public class FaceActionMask extends RelativeLayout {

    /* renamed from: d */
    public Paint f12409d;

    /* renamed from: e */
    public Paint f12410e;

    /* renamed from: f */
    public PorterDuffXfermode f12411f;

    /* renamed from: g */
    public Rect f12412g = new Rect();

    public FaceActionMask(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f12409d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f12410e = new Paint(1);
        setWillNotDraw(false);
        this.f12411f = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        setLayerType(1, (Paint) null);
    }

    public void onDraw(Canvas canvas) {
        canvas.save();
        float width = (float) (((double) getWidth()) * 0.5d);
        float height = (float) (((double) getHeight()) * 0.4d);
        Rect rect = this.f12412g;
        rect.left = 0;
        rect.right = getWidth();
        Rect rect2 = this.f12412g;
        rect2.top = 0;
        rect2.bottom = getHeight();
        this.f12409d.setColor(getContext().getResources().getColor(C0966R.color.al6));
        canvas.drawARGB(255, 0, 0, 0);
        canvas.drawRect(this.f12412g, this.f12409d);
        this.f12410e.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f12410e.setXfermode(this.f12411f);
        canvas.drawCircle(width, height, (float) (((double) getWidth()) * 0.35d), this.f12410e);
        canvas.restore();
    }
}
