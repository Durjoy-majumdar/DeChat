package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.tencent.mm.plugin.mv.ui.view.LyricFadeLayout */
public class LyricFadeLayout extends FrameLayout {

    /* renamed from: d */
    public Paint f20050d;

    /* renamed from: e */
    public int f20051e;

    /* renamed from: f */
    public int f20052f;

    /* renamed from: g */
    public boolean f20053g;

    public LyricFadeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        if (!this.f20053g) {
            return super.drawChild(canvas, view, j);
        }
        Canvas canvas2 = canvas;
        int saveLayer = canvas2.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (Paint) null);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas2.drawRect(0.0f, 0.0f, (float) this.f20051e, (float) this.f20052f, this.f20050d);
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f20050d.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (float) i2, new int[]{-1, 0, -1}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP));
        this.f20051e = i;
        this.f20052f = i2;
    }

    public void setFade(boolean z) {
        this.f20053g = z;
        invalidate();
    }

    public LyricFadeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.f20050d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f20050d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }
}
