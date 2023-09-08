package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.tencent.p014mm.C0966R;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.g5 */
public class C69599g5 extends Drawable {

    /* renamed from: a */
    public Context f200933a;

    /* renamed from: b */
    public Drawable f200934b;

    /* renamed from: c */
    public Drawable f200935c;

    /* renamed from: d */
    public Paint f200936d = new Paint(1);

    /* renamed from: e */
    public int f200937e;

    /* renamed from: f */
    public int f200938f;

    /* renamed from: g */
    public int f200939g;

    /* renamed from: h */
    public int f200940h;

    /* renamed from: i */
    public int f200941i;

    /* renamed from: j */
    public boolean f200942j = false;

    /* renamed from: k */
    public int f200943k;

    /* renamed from: l */
    public int f200944l;

    /* renamed from: m */
    public int f200945m = 2;

    /* renamed from: n */
    public int f200946n = 2;

    public C69599g5(Context context) {
        this.f200933a = context;
        C76577a.m92153d(context, C0966R.color.aou);
        C76577a.m92153d(context, C0966R.color.a7b);
        this.f200934b = context.getResources().getDrawable(C0966R.C0969drawable.f357262cr1);
        this.f200935c = context.getResources().getDrawable(C0966R.C0969drawable.f357263cr2);
        this.f200940h = C76577a.m92151b(context, 24);
        this.f200941i = C76577a.m92151b(context, 34);
        this.f200937e = C76577a.m92153d(context, C0966R.color.aot);
        this.f200944l = C76577a.m92150a(context, 40.0f);
        this.f200938f = C76577a.m92150a(context, 40.0f);
        this.f200939g = C76577a.m92150a(context, 56.0f);
    }

    /* renamed from: a */
    public final void mo95846a(Canvas canvas, boolean z) {
        Drawable drawable;
        int i;
        if (this.f200934b != null) {
            if (!(canvas == null || canvas.getWidth() == 0 || canvas.getHeight() == 0)) {
                if (z) {
                    drawable = this.f200935c;
                    i = this.f200941i;
                } else {
                    drawable = this.f200934b;
                    i = this.f200940h;
                }
                int width = canvas.getWidth() / 2;
                int height = canvas.getHeight() / 2;
                drawable.setBounds(width - i, height - i, width + i, height + i);
                drawable.draw(canvas);
            }
        }
    }

    public void draw(Canvas canvas) {
        int i = this.f200945m;
        if (i == 6 || i == 7) {
            if (!(canvas == null || canvas.getWidth() == 0 || canvas.getHeight() == 0)) {
                int width = canvas.getWidth() >> 1;
                int height = canvas.getHeight() >> 1;
                this.f200936d.setShader((Shader) null);
                this.f200936d.setStyle(Paint.Style.FILL);
                this.f200936d.setColor(this.f200937e);
                if (this.f200945m == 7) {
                    if (this.f200942j) {
                        this.f200944l -= this.f200946n;
                    } else {
                        this.f200944l += this.f200946n;
                    }
                    int min = Math.min(Math.max(this.f200938f, this.f200944l), this.f200939g);
                    this.f200944l = min;
                    canvas.drawCircle((float) width, (float) height, (float) min, this.f200936d);
                } else {
                    canvas.drawCircle((float) width, (float) height, (float) this.f200938f, this.f200936d);
                }
            }
        }
        int i2 = this.f200945m;
        if (i2 == 6 || i2 == 7) {
            mo95846a(canvas, true);
        } else {
            mo95846a(canvas, false);
        }
    }

    public int getIntrinsicHeight() {
        return this.f200940h * 2;
    }

    public int getIntrinsicWidth() {
        Context context = this.f200933a;
        if (context == null) {
            return 0;
        }
        return C76577a.m92145A(context);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
