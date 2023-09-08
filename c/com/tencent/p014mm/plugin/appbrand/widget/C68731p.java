package com.tencent.p014mm.plugin.appbrand.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.p */
public class C68731p extends Drawable {

    /* renamed from: e */
    public static final /* synthetic */ int f197406e = 0;

    /* renamed from: a */
    public final Rect f197407a = new Rect();

    /* renamed from: b */
    public final Rect f197408b = new Rect();

    /* renamed from: c */
    public final Paint f197409c = new Paint();

    /* renamed from: d */
    public int f197410d = 0;

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.width() > 0 && bounds.height() > 0) {
            int min = Math.min(bounds.top + this.f197407a.top, bounds.bottom);
            int min2 = Math.min(bounds.left + this.f197407a.left, bounds.right);
            int max = Math.max(bounds.right - this.f197407a.right, bounds.left);
            int max2 = Math.max(bounds.bottom - this.f197407a.bottom, bounds.top);
            if (this.f197410d != 0) {
                if (this.f197407a.left > 0) {
                    this.f197408b.set(bounds.left, min, min2, max2);
                    this.f197409c.setColor(this.f197410d);
                    canvas.drawRect(this.f197408b, this.f197409c);
                }
                if (this.f197407a.right > 0) {
                    this.f197408b.set(max, min, bounds.right, max2);
                    this.f197409c.setColor(this.f197410d);
                    canvas.drawRect(this.f197408b, this.f197409c);
                }
                if (this.f197407a.bottom > 0) {
                    this.f197408b.set(min2, max2, max, bounds.bottom);
                    this.f197409c.setColor(this.f197410d);
                    canvas.drawRect(this.f197408b, this.f197409c);
                }
            }
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
