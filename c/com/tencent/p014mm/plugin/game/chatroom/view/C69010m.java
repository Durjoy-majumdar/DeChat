package com.tencent.p014mm.plugin.game.chatroom.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ImageSpan;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.m */
public class C69010m extends ImageSpan {

    /* renamed from: d */
    public String f198312d;

    /* renamed from: e */
    public int f198313e;

    /* renamed from: f */
    public int f198314f;

    /* renamed from: g */
    public int f198315g;

    /* renamed from: h */
    public int f198316h;

    /* renamed from: i */
    public int f198317i;

    /* renamed from: j */
    public int f198318j;

    /* renamed from: n */
    public int f198319n;

    /* renamed from: o */
    public int f198320o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C69010m(java.lang.String r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13) {
        /*
            r4 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            float r1 = (float) r8
            r0.setTextSize(r1)
            int r1 = r5.length()
            r2 = 0
            float r0 = r0.measureText(r5, r2, r1)
            int r0 = (int) r0
            int r0 = r0 + r10
            int r0 = r0 + r11
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r3 = 1
            r1.setBounds(r2, r2, r0, r3)
            r4.<init>(r1, r3)
            r4.f198312d = r5
            r4.f198313e = r6
            r4.f198314f = r7
            r4.f198315g = r8
            r4.f198316h = r9
            r4.f198317i = r10
            r4.f198318j = r11
            r4.f198319n = r12
            r4.f198320o = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.C69010m.<init>(java.lang.String, int, int, int, int, int, int, int, int):void");
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2 = f;
        Paint paint2 = paint;
        try {
            int color = paint.getColor();
            float textSize = paint.getTextSize();
            paint2.setTextSize((float) this.f198315g);
            paint2.setAntiAlias(true);
            paint2.setColor(this.f198313e);
            RectF rectF = new RectF();
            rectF.left = f2;
            float f3 = (float) i4;
            rectF.top = (paint.ascent() + f3) - ((float) this.f198319n);
            int i6 = i;
            rectF.right = paint2.measureText(this.f198312d, i, i2) + f2 + ((float) this.f198317i) + ((float) this.f198318j);
            rectF.bottom = paint.descent() + f3 + ((float) this.f198320o);
            int i7 = this.f198316h;
            Canvas canvas2 = canvas;
            canvas.drawRoundRect(rectF, (float) i7, (float) i7, paint2);
            paint2.setColor(this.f198314f);
            canvas.drawText(this.f198312d, i, i2, f2 + ((float) this.f198317i), f3, paint);
            paint2.setColor(color);
            paint2.setTextSize(textSize);
        } catch (Exception unused) {
        }
    }
}
