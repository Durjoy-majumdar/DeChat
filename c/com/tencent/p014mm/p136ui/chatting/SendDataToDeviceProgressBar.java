package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.wxmm.v2helper;

/* renamed from: com.tencent.mm.ui.chatting.SendDataToDeviceProgressBar */
public class SendDataToDeviceProgressBar extends ImageView {

    /* renamed from: d */
    public MMHandler f24308d;

    /* renamed from: e */
    public Context f24309e;

    /* renamed from: f */
    public Paint f24310f;

    /* renamed from: g */
    public volatile int f24311g;

    /* renamed from: h */
    public int f24312h;

    /* renamed from: i */
    public int f24313i;

    /* renamed from: j */
    public int f24314j;

    /* renamed from: n */
    public int f24315n;

    /* renamed from: o */
    public int f24316o;

    /* renamed from: p */
    public Runnable f24317p;

    /* renamed from: com.tencent.mm.ui.chatting.SendDataToDeviceProgressBar$a */
    public class C6774a implements Runnable {
        public C6774a() {
        }

        public void run() {
            SendDataToDeviceProgressBar.this.invalidate();
        }
    }

    public SendDataToDeviceProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int getProgress() {
        return (int) ((((float) this.f24311g) / 360.0f) * 100.0f);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        this.f24310f.setColor(this.f24309e.getResources().getColor(C0966R.color.a9_));
        this.f24310f.setStrokeWidth((float) this.f24316o);
        if (this.f24314j == -1) {
            this.f24314j = (width * 2) - this.f24312h;
        }
        if (this.f24315n == -1) {
            this.f24315n = this.f24314j;
        }
        RectF rectF = new RectF((float) this.f24312h, (float) this.f24313i, (float) this.f24314j, (float) this.f24315n);
        canvas.drawArc(rectF, 270.0f, (float) this.f24311g, false, this.f24310f);
        int i = this.f24311g + 270;
        if (i > 360) {
            i -= 360;
        }
        this.f24310f.setColor(this.f24309e.getResources().getColor(C0966R.color.a97));
        canvas.drawArc(rectF, (float) i, (float) (v2helper.VOIP_ENC_HEIGHT_LV1 - this.f24311g), false, this.f24310f);
    }

    public void setProgress(int i) {
        if (i >= 100) {
            i = 100;
        }
        this.f24311g = (int) ((((float) i) / 100.0f) * 360.0f);
        this.f24308d.removeCallbacks(this.f24317p);
        this.f24308d.postDelayed(this.f24317p, (long) 0);
    }

    public SendDataToDeviceProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24311g = 2;
        this.f24312h = -1;
        this.f24313i = -1;
        this.f24314j = -1;
        this.f24315n = -1;
        this.f24316o = -1;
        this.f24317p = new C6774a();
        setImageResource(C0966R.C0969drawable.an9);
        this.f24309e = context;
        Paint paint = new Paint();
        this.f24310f = paint;
        paint.setAntiAlias(true);
        this.f24310f.setStyle(Paint.Style.STROKE);
        int dimensionPixelSize = this.f24309e.getResources().getDimensionPixelSize(C0966R.dimen.am_);
        this.f24312h = dimensionPixelSize;
        this.f24313i = dimensionPixelSize;
        this.f24316o = this.f24309e.getResources().getDimensionPixelSize(C0966R.dimen.ama);
        this.f24308d = new MMHandler(Looper.getMainLooper());
    }
}
