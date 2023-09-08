package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;

/* renamed from: com.tencent.mm.ui.TabIconView */
public class TabIconView extends ImageView {

    /* renamed from: d */
    public Bitmap f214671d;

    /* renamed from: e */
    public Bitmap f214672e;

    /* renamed from: f */
    public Bitmap f214673f;

    /* renamed from: g */
    public Rect f214674g;

    /* renamed from: h */
    public Rect f214675h;

    /* renamed from: i */
    public Rect f214676i;

    /* renamed from: j */
    public Paint f214677j;

    /* renamed from: n */
    public Paint f214678n;

    /* renamed from: o */
    public int f214679o = 0;

    /* renamed from: p */
    public float f214680p = 1.1666666f;

    /* renamed from: q */
    public Context f214681q;

    public TabIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f214681q = context;
    }

    /* renamed from: a */
    public void mo101561a(int i, int i2, int i3, boolean z) {
        if (z) {
            this.f214680p *= 1.2f;
        }
        this.f214671d = BitmapUtil.getBitmapNative(i, this.f214680p);
        this.f214672e = BitmapUtil.getBitmapNative(i3, this.f214680p);
        this.f214673f = BitmapUtil.getBitmapNative(i2, this.f214680p);
        if (this.f214671d != null) {
            this.f214674g = new Rect(0, 0, this.f214671d.getWidth(), this.f214671d.getHeight());
        }
        if (this.f214672e != null) {
            this.f214675h = new Rect(0, 0, this.f214672e.getWidth(), this.f214672e.getHeight());
        }
        if (this.f214673f != null) {
            this.f214676i = new Rect(0, 0, this.f214673f.getWidth(), this.f214673f.getHeight());
        }
        this.f214677j = new Paint(1);
        Paint paint = new Paint(1);
        this.f214678n = paint;
        paint.setColorFilter(new PorterDuffColorFilter(this.f214681q.getResources().getColor(C0966R.color.FG_0), PorterDuff.Mode.SRC_ATOP));
        this.f214677j.setColorFilter(new PorterDuffColorFilter(this.f214681q.getResources().getColor(C0966R.color.akw), PorterDuff.Mode.SRC_ATOP));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f214677j;
        if (paint != null) {
            int i = this.f214679o;
            if (i < 128) {
                this.f214678n.setAlpha(255 - i);
                canvas.drawBitmap(this.f214672e, (Rect) null, this.f214675h, this.f214678n);
                this.f214677j.setAlpha(this.f214679o);
                canvas.drawBitmap(this.f214673f, (Rect) null, this.f214676i, this.f214677j);
                return;
            }
            paint.setAlpha(255 - i);
            canvas.drawBitmap(this.f214673f, (Rect) null, this.f214676i, this.f214677j);
            this.f214677j.setAlpha(this.f214679o);
            canvas.drawBitmap(this.f214671d, (Rect) null, this.f214674g, this.f214677j);
        }
    }

    public void setFocusAlpha(int i) {
        this.f214679o = i;
        invalidate();
    }

    public TabIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f214681q = context;
    }
}
