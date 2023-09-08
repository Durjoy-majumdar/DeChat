package com.tencent.p014mm.plugin.fts.p059ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.b */
public class C68992b extends Drawable {

    /* renamed from: a */
    public Context f198240a;

    /* renamed from: b */
    public Drawable f198241b;

    /* renamed from: c */
    public Drawable f198242c;

    /* renamed from: d */
    public int f198243d = 0;

    /* renamed from: e */
    public int f198244e = 0;

    /* renamed from: f */
    public Paint f198245f = new Paint(1);

    /* renamed from: g */
    public int f198246g;

    /* renamed from: h */
    public int f198247h;

    /* renamed from: i */
    public int f198248i;

    /* renamed from: j */
    public int f198249j;

    /* renamed from: k */
    public int f198250k = 0;

    /* renamed from: l */
    public boolean f198251l = false;

    /* renamed from: m */
    public int f198252m;

    /* renamed from: n */
    public int f198253n = 2;

    /* renamed from: o */
    public int f198254o = 0;

    public C68992b(Context context) {
        this.f198240a = context;
        this.f198243d = C76577a.m92153d(context, C0966R.color.akw);
        this.f198244e = C76577a.m92153d(context, C0966R.color.al6);
        this.f198241b = context.getResources().getDrawable(C0966R.C0969drawable.c3d);
        this.f198242c = context.getResources().getDrawable(C0966R.C0969drawable.c3e);
        this.f198250k = C76577a.m92151b(context, 24);
        this.f198246g = C76577a.m92153d(context, C0966R.color.aid);
        this.f198249j = C76577a.m92153d(context, C0966R.color.aie);
        this.f198252m = C76577a.m92151b(context, 47);
        this.f198247h = C76577a.m92151b(context, 47);
        this.f198248i = C76577a.m92151b(context, 60);
        this.f198254o = 4;
        Log.m105919d("MicroMsg.FTSVoiceInputDrawable", "waveStep %s", 4);
    }

    /* renamed from: a */
    public final boolean mo94948a(Canvas canvas) {
        return canvas == null || canvas.getWidth() == 0 || canvas.getHeight() == 0;
    }

    /* renamed from: b */
    public final void mo94949b(Canvas canvas, boolean z) {
        Drawable drawable;
        int i;
        if (this.f198241b != null && !mo94948a(canvas)) {
            if (z) {
                drawable = this.f198242c;
                i = this.f198243d;
            } else {
                drawable = this.f198241b;
                i = this.f198244e;
            }
            int width = canvas.getWidth() / 2;
            int height = canvas.getHeight() / 2;
            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
            this.f198245f.setShader((Shader) null);
            this.f198245f.setStyle(Paint.Style.FILL);
            this.f198245f.setColor(i);
            canvas.drawCircle((float) width, (float) height, (float) this.f198250k, this.f198245f);
            drawable.setBounds(width - intrinsicWidth, height - intrinsicHeight, width + intrinsicWidth, height + intrinsicHeight);
            drawable.draw(canvas);
        }
    }

    /* renamed from: c */
    public void mo94950c() {
        Log.m105919d("MicroMsg.FTSVoiceInputDrawable", "readyState %s", Integer.valueOf(this.f198253n));
        this.f198253n = 2;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        int i = this.f198253n;
        if ((i == 6 || i == 7) && !mo94948a(canvas)) {
            int width = canvas.getWidth() >> 1;
            int height = canvas.getHeight() >> 1;
            this.f198245f.setShader((Shader) null);
            this.f198245f.setStyle(Paint.Style.FILL);
            this.f198245f.setColor(this.f198246g);
            if (this.f198253n == 7) {
                if (this.f198251l) {
                    this.f198252m -= this.f198254o;
                } else {
                    this.f198252m += this.f198254o;
                }
                int min = Math.min(Math.max(this.f198247h, this.f198252m), this.f198248i);
                this.f198252m = min;
                canvas.drawCircle((float) width, (float) height, (float) min, this.f198245f);
            } else {
                canvas.drawCircle((float) width, (float) height, (float) this.f198247h, this.f198245f);
            }
        }
        int i2 = this.f198253n;
        if (i2 == 6 || i2 == 7) {
            mo94949b(canvas, true);
        } else {
            mo94949b(canvas, false);
        }
        int i3 = this.f198253n;
        if ((i3 == 6 || i3 == 7) && !mo94948a(canvas)) {
            this.f198245f.setStyle(Paint.Style.FILL);
            this.f198245f.setColor(this.f198249j);
            canvas.drawCircle((float) (canvas.getWidth() >> 1), (float) (canvas.getHeight() >> 1), (float) this.f198250k, this.f198245f);
        }
    }

    public int getIntrinsicHeight() {
        return this.f198250k * 2;
    }

    public int getIntrinsicWidth() {
        Context context = this.f198240a;
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
