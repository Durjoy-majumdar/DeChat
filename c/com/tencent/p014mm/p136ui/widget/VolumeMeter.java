package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;

/* renamed from: com.tencent.mm.ui.widget.VolumeMeter */
public class VolumeMeter extends ImageView implements Runnable {

    /* renamed from: d */
    public Paint f24828d;

    /* renamed from: e */
    public Context f24829e;

    /* renamed from: f */
    public View f24830f;

    /* renamed from: g */
    public int f24831g = -1;

    /* renamed from: h */
    public int f24832h = -1;

    /* renamed from: i */
    public float f24833i;

    /* renamed from: j */
    public int f24834j = -6751336;

    /* renamed from: n */
    public int f24835n = 70;

    /* renamed from: o */
    public float f24836o;

    /* renamed from: p */
    public float f24837p;

    /* renamed from: q */
    public float f24838q = 0.0f;

    public VolumeMeter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24829e = context;
        this.f24828d = new Paint();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getWidth();
        getHeight();
        View view = this.f24830f;
        if (!(view == null || view.getVisibility() == 4)) {
            int[] iArr = new int[2];
            this.f24830f.getLocationInWindow(iArr);
            if (!(iArr[0] == 0 || iArr[1] == 0)) {
                int width = this.f24830f.getWidth();
                int height = this.f24830f.getHeight();
                if (!(width == 0 || height == 0)) {
                    int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f24829e, 50.0f);
                    int i = width / 2;
                    this.f24831g = iArr[0] + i;
                    this.f24832h = (iArr[1] + (height / 2)) - (fromDPToPix / 2);
                    float f = (float) i;
                    this.f24837p = f;
                    this.f24836o = f * 2.0f;
                }
            }
        }
        if (this.f24831g >= 0 && this.f24832h >= 0) {
            this.f24828d.setColor(this.f24834j);
            this.f24828d.setAlpha(this.f24835n);
            float fromDPToPix2 = (float) BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f24829e, this.f24838q);
            float f2 = this.f24836o;
            if (fromDPToPix2 > f2) {
                fromDPToPix2 = f2;
            }
            float f3 = this.f24837p;
            if (fromDPToPix2 < f3) {
                fromDPToPix2 = f3;
            }
            canvas.drawCircle((float) this.f24831g, (float) this.f24832h, fromDPToPix2, this.f24828d);
        }
    }

    public void run() {
    }

    public void setArchView(View view) {
        this.f24830f = view;
    }

    public void setVolume(float f) {
        this.f24833i = f;
    }

    public VolumeMeter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24829e = context;
        this.f24828d = new Paint();
    }
}
