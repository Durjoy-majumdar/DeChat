package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectedRouterStateView */
public class ExdeviceConnectedRouterStateView extends ImageView {

    /* renamed from: d */
    public MMHandler f197913d;

    /* renamed from: e */
    public Context f197914e;

    /* renamed from: f */
    public Paint f197915f;

    /* renamed from: g */
    public int f197916g;

    /* renamed from: h */
    public int f197917h;

    /* renamed from: i */
    public int f197918i;

    /* renamed from: j */
    public int f197919j;

    /* renamed from: n */
    public int f197920n;

    /* renamed from: o */
    public int f197921o;

    /* renamed from: p */
    public int f197922p;

    /* renamed from: q */
    public Runnable f197923q;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectedRouterStateView$a */
    public class C68884a implements Runnable {
        public C68884a() {
        }

        public void run() {
            ExdeviceConnectedRouterStateView.this.invalidate();
        }
    }

    public ExdeviceConnectedRouterStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f197922p == 1) {
            int width = getWidth() / 2;
            this.f197915f.setARGB(255, 103, 209, 79);
            this.f197915f.setStrokeWidth((float) this.f197921o);
            if (this.f197919j == -1) {
                this.f197919j = (width * 2) - this.f197917h;
            }
            if (this.f197920n == -1) {
                this.f197920n = this.f197919j;
            }
            canvas.drawArc(new RectF((float) this.f197917h, (float) this.f197918i, (float) this.f197919j, (float) this.f197920n), 270.0f, (float) this.f197916g, false, this.f197915f);
            int i = this.f197916g + 5;
            this.f197916g = i;
            if (i > 365) {
                this.f197916g = 0;
            }
            this.f197913d.removeCallbacks(this.f197923q);
            this.f197913d.postDelayed(this.f197923q, (long) 100);
        }
    }

    public void setState(int i) {
        this.f197922p = i;
        this.f197913d.removeCallbacks(this.f197923q);
        this.f197913d.postDelayed(this.f197923q, (long) 10);
    }

    public ExdeviceConnectedRouterStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f197916g = 2;
        this.f197917h = -1;
        this.f197918i = -1;
        this.f197919j = -1;
        this.f197920n = -1;
        this.f197921o = -1;
        this.f197923q = new C68884a();
        this.f197914e = context;
        Paint paint = new Paint();
        this.f197915f = paint;
        paint.setAntiAlias(true);
        this.f197915f.setStyle(Paint.Style.STROKE);
        int b = C76577a.m92151b(this.f197914e, 2);
        this.f197917h = b;
        this.f197918i = b;
        this.f197921o = C76577a.m92151b(this.f197914e, 3);
        this.f197913d = new MMHandler(Looper.getMainLooper());
    }
}
