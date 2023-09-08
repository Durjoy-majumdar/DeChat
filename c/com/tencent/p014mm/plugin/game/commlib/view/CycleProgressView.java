package com.tencent.p014mm.plugin.game.commlib.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.wxmm.v2helper;
import p385u2.C111105a;

/* renamed from: com.tencent.mm.plugin.game.commlib.view.CycleProgressView */
public class CycleProgressView extends View {

    /* renamed from: d */
    public int f19178d = 0;

    /* renamed from: e */
    public Paint f19179e = new Paint();

    /* renamed from: f */
    public float f19180f;

    public CycleProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getProgress() {
        return this.f19178d;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        if (this.f19180f == 0.0f) {
            this.f19180f = (float) ((int) (((double) (getWidth() / 2)) * 0.167d));
        }
        float f = (float) width;
        float f2 = this.f19180f;
        int i = (int) (f - (f2 / 2.0f));
        this.f19179e.setStrokeWidth(f2);
        this.f19179e.setColor(C111105a.m151500b(getContext(), C0966R.color.BW_0_Alpha_0_1));
        this.f19179e.setAntiAlias(true);
        this.f19179e.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(f, f, (float) i, this.f19179e);
        this.f19179e.setStrokeWidth(this.f19180f);
        this.f19179e.setColor(C111105a.m151500b(getContext(), C0966R.color.al6));
        float f3 = (float) (width - i);
        float f4 = (float) (width + i);
        canvas.drawArc(new RectF(f3, f3, f4, f4), -90.0f, (float) ((this.f19178d * v2helper.VOIP_ENC_HEIGHT_LV1) / 100), false, this.f19179e);
        this.f19179e.setStrokeWidth(0.0f);
        this.f19179e.setStyle(Paint.Style.FILL);
    }

    public void setProgress(int i) {
        this.f19178d = Math.max(0, i);
        this.f19178d = Math.min(i, 100);
        invalidate();
    }

    public CycleProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
