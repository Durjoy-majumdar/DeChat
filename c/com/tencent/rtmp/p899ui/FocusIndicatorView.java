package com.tencent.rtmp.p899ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.ScaleAnimation;

/* renamed from: com.tencent.rtmp.ui.FocusIndicatorView */
public class FocusIndicatorView extends View {

    /* renamed from: a */
    public final ScaleAnimation f221372a;

    /* renamed from: b */
    private final Paint f221373b;

    /* renamed from: c */
    private final int f221374c;

    /* renamed from: d */
    private final Rect f221375d;

    public FocusIndicatorView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void onDraw(Canvas canvas) {
        int i = this.f221374c / 2;
        Rect rect = this.f221375d;
        rect.left = i;
        rect.top = i;
        rect.right = getWidth() - i;
        this.f221375d.bottom = getHeight() - i;
        canvas.drawRect(this.f221375d, this.f221373b);
    }

    public FocusIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FocusIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f221375d = new Rect();
        int i2 = (int) ((getResources().getDisplayMetrics().density * 1.0f) + 0.5f);
        this.f221374c = i2;
        Paint paint = new Paint();
        this.f221373b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) i2);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.3f, 1.0f, 1.3f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f221372a = scaleAnimation;
        scaleAnimation.setDuration(200);
    }
}
