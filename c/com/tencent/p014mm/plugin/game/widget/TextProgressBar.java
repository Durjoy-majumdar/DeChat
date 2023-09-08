package com.tencent.p014mm.plugin.game.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.game.widget.TextProgressBar */
public class TextProgressBar extends ProgressBar {

    /* renamed from: d */
    public String f198371d;

    /* renamed from: e */
    public Paint f198372e;

    /* renamed from: f */
    public Context f198373f;

    /* renamed from: g */
    public int f198374g;

    /* renamed from: h */
    public int f198375h;

    public TextProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f198373f = context;
    }

    private void setText(int i) {
        this.f198374g = i;
        this.f198371d = String.valueOf(i) + "%";
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        this.f198372e = paint;
        paint.setAntiAlias(true);
        this.f198372e.setColor(Color.rgb(69, 192, 26));
        this.f198372e.setTextSize((float) this.f198375h);
        Rect rect = new Rect();
        Paint paint2 = this.f198372e;
        String str = this.f198371d;
        paint2.getTextBounds(str, 0, str.length(), rect);
        float width = (float) ((getWidth() / 2) - rect.centerX());
        float height = (float) ((getHeight() / 2) - rect.centerY());
        canvas.drawText(this.f198371d, width, height, this.f198372e);
        float width2 = (((float) this.f198374g) / 100.0f) * ((float) getWidth());
        if (width2 > width) {
            Paint paint3 = new Paint();
            paint3.setColor(-1);
            paint3.setAntiAlias(true);
            paint3.setTextSize((float) this.f198375h);
            RectF rectF = new RectF(0.0f, 0.0f, width2, (float) getHeight());
            canvas.save();
            canvas.clipRect(rectF);
            canvas.drawText(this.f198371d, width, height, paint3);
            canvas.restore();
        }
    }

    public void setProgress(int i) {
        setText(i);
        super.setProgress(i);
    }

    public void setTextSize(int i) {
        this.f198375h = C76577a.m92151b(this.f198373f, i);
    }
}
