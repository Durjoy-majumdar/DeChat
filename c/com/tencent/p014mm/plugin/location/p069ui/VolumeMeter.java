package com.tencent.p014mm.plugin.location.p069ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: com.tencent.mm.plugin.location.ui.VolumeMeter */
public class VolumeMeter extends ImageView implements Runnable {

    /* renamed from: A */
    public float f346401A = 30.0f;

    /* renamed from: B */
    public Runnable f346402B = new C115524a();

    /* renamed from: d */
    public boolean f346403d = false;

    /* renamed from: e */
    public boolean f346404e = false;

    /* renamed from: f */
    public Paint f346405f;

    /* renamed from: g */
    public Context f346406g;

    /* renamed from: h */
    public View f346407h;

    /* renamed from: i */
    public int f346408i = -1;

    /* renamed from: j */
    public int f346409j = -1;

    /* renamed from: n */
    public MMHandler f346410n = null;

    /* renamed from: o */
    public float f346411o;

    /* renamed from: p */
    public float f346412p;

    /* renamed from: q */
    public float f346413q;

    /* renamed from: r */
    public int f346414r = -6751336;

    /* renamed from: s */
    public int f346415s = 70;

    /* renamed from: t */
    public float f346416t = 0.5f;

    /* renamed from: u */
    public float f346417u = 0.001f;

    /* renamed from: v */
    public int f346418v = 20;

    /* renamed from: w */
    public float f346419w;

    /* renamed from: x */
    public float f346420x;

    /* renamed from: y */
    public float f346421y = 0.0f;

    /* renamed from: z */
    public float f346422z = 40.0f;

    /* renamed from: com.tencent.mm.plugin.location.ui.VolumeMeter$a */
    public class C115524a implements Runnable {
        public C115524a() {
        }

        public void run() {
            VolumeMeter volumeMeter = VolumeMeter.this;
            volumeMeter.f346404e = true;
            volumeMeter.f346403d = false;
            MMHandler mMHandler = volumeMeter.f346410n;
            if (mMHandler != null) {
                mMHandler.getSerial().f328238b.mo182313f();
                VolumeMeter.this.f346410n = null;
            }
        }
    }

    public VolumeMeter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f346406g = context;
        this.f346405f = new Paint();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getWidth();
        getHeight();
        View view = this.f346407h;
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            if (!(iArr[0] == 0 || iArr[1] == 0)) {
                int width = this.f346407h.getWidth();
                int height = this.f346407h.getHeight();
                if (!(width == 0 || height == 0)) {
                    int i = width / 2;
                    this.f346408i = iArr[0] + i;
                    this.f346409j = iArr[1] + (height / 2);
                    float f = (float) i;
                    this.f346420x = f;
                    this.f346419w = f * 2.0f;
                }
            }
        }
        if (this.f346408i >= 0 && this.f346409j >= 0) {
            this.f346405f.setColor(this.f346414r);
            this.f346405f.setAlpha(this.f346415s);
            float fromDPToPix = (float) BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f346406g, this.f346421y);
            float f2 = this.f346419w;
            if (fromDPToPix > f2) {
                fromDPToPix = f2;
            }
            float f3 = this.f346420x;
            if (fromDPToPix < f3) {
                fromDPToPix = f3;
            }
            canvas.drawCircle((float) this.f346408i, (float) this.f346409j, fromDPToPix, this.f346405f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r2 < r1) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r1 < r2) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            boolean r0 = r5.f346403d
            if (r0 == 0) goto L_0x0062
            float r0 = r5.f346413q
            float r1 = r5.f346412p
            float r2 = r5.f346411o
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0023
            float r1 = r1 - r2
            float r2 = r5.f346401A
            float r1 = r1 / r2
            float r2 = r5.f346416t
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x001a
        L_0x0018:
            r1 = r2
            goto L_0x0021
        L_0x001a:
            float r2 = r5.f346417u
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            goto L_0x0018
        L_0x0021:
            float r0 = r0 + r1
            goto L_0x003b
        L_0x0023:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x003b
            float r2 = r2 - r1
            float r1 = r5.f346422z
            float r2 = r2 / r1
            float r1 = r5.f346416t
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0033
        L_0x0031:
            r2 = r1
            goto L_0x003a
        L_0x0033:
            float r1 = r5.f346417u
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x003a
            goto L_0x0031
        L_0x003a:
            float r0 = r0 - r2
        L_0x003b:
            r5.f346413q = r0
            r1 = 4643281584563159040(0x4070400000000000, double:260.0)
            double r3 = (double) r0
            double r3 = java.lang.Math.sqrt(r3)
            double r3 = r3 * r1
            r0 = 1124204544(0x43020000, float:130.0)
            float r1 = r5.f346413q
            float r1 = r1 * r0
            double r0 = (double) r1
            double r3 = r3 - r0
            float r0 = (float) r3
            r1 = 1069547520(0x3fc00000, float:1.5)
            float r0 = r0 / r1
            r5.f346421y = r0
            r5.postInvalidate()
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r5.f346410n
            int r1 = r5.f346418v
            long r1 = (long) r1
            r0.postDelayed(r5, r1)
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.location.p069ui.VolumeMeter.run():void");
    }

    public void setArchView(View view) {
        this.f346407h = view;
    }

    public void setVolume(float f) {
        this.f346411o = this.f346412p;
        this.f346412p = f;
    }

    public VolumeMeter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f346406g = context;
        this.f346405f = new Paint();
    }
}
