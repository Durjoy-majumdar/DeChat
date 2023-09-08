package com.tencent.tencentmap.mapsdk.vector.compat.utils.p847ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.wxmm.v2helper;

/* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.ui.RotationLayout */
public class RotationLayout extends FrameLayout {

    /* renamed from: a */
    private int f165816a;

    public RotationLayout(Context context) {
        super(context);
    }

    public void dispatchDraw(Canvas canvas) {
        int i = this.f165816a;
        if (i == 0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (i == 1) {
            canvas.translate((float) getWidth(), 0.0f);
            canvas.rotate(90.0f, (float) (getWidth() / 2), 0.0f);
            canvas.translate((float) (getHeight() / 2), (float) (getWidth() / 2));
        } else if (i == 2) {
            canvas.rotate(180.0f, (float) (getWidth() / 2), (float) (getHeight() / 2));
        } else {
            canvas.translate(0.0f, (float) getHeight());
            canvas.rotate(270.0f, (float) (getWidth() / 2), 0.0f);
            canvas.translate((float) (getHeight() / 2), (float) ((-getWidth()) / 2));
        }
        super.dispatchDraw(canvas);
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.f165816a;
        if (i3 == 1 || i3 == 3) {
            super.onMeasure(i, i2);
            setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setViewRotation(int i) {
        this.f165816a = ((i + v2helper.VOIP_ENC_HEIGHT_LV1) % v2helper.VOIP_ENC_HEIGHT_LV1) / 90;
    }

    public RotationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RotationLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
