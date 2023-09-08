package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.WrapScollview */
public class WrapScollview extends NestedScrollView {

    /* renamed from: I */
    public boolean f279132I = true;

    /* renamed from: J */
    public boolean f279133J = true;

    /* renamed from: K */
    public int f279134K = -1;

    /* renamed from: L */
    public View f279135L;

    public WrapScollview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: b */
    public int mo133149b(Rect rect) {
        SnsMethodCalculate.markStartTimeMs("computeScrollDeltaToGetChildRectOnScreen", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        int b = super.mo133149b(rect);
        int i = !this.f279132I ? 0 : b;
        int i2 = this.f279134K;
        if (i2 != -1) {
            this.f279134K = 0;
            i = i2;
        }
        Log.m105919d("MicroMsg.SnsUpload.WrapScollview", "computeScrollDeltaToGetChildRectOnScreen: scrollHeight:%d, computeScrollHeight=%d", Integer.valueOf(i), Integer.valueOf(b));
        SnsMethodCalculate.markEndTimeMs("computeScrollDeltaToGetChildRectOnScreen", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        return i;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View view;
        SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        if (this.f279133J && (view = this.f279135L) != null) {
            SnsMethodCalculate.markStartTimeMs("checkArea", "com.tencent.mm.plugin.sns.ui.WrapScollview");
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            int width = view.getWidth() + i;
            boolean z = true;
            int i2 = iArr[1];
            int height = view.getHeight() + i2;
            if (((float) i) >= rawX || rawX >= ((float) width) || ((float) i2) >= rawY || rawY >= ((float) height)) {
                SnsMethodCalculate.markEndTimeMs("checkArea", "com.tencent.mm.plugin.sns.ui.WrapScollview");
                z = false;
            } else {
                SnsMethodCalculate.markEndTimeMs("checkArea", "com.tencent.mm.plugin.sns.ui.WrapScollview");
            }
            if (z) {
                Log.m105918d("MicroMsg.SnsUpload.WrapScollview", "onInterceptTouchEvent: false");
                SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.WrapScollview");
                return false;
            }
        }
        Log.m105918d("MicroMsg.SnsUpload.WrapScollview", "onInterceptTouchEvent: super");
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        return onInterceptTouchEvent;
    }

    public void setCheckInterceptTouchEventByCheckArea(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setCheckInterceptTouchEventByCheckArea", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        this.f279133J = z;
        SnsMethodCalculate.markEndTimeMs("setCheckInterceptTouchEventByCheckArea", "com.tencent.mm.plugin.sns.ui.WrapScollview");
    }

    public void setContentView(View view) {
        SnsMethodCalculate.markStartTimeMs("setContentView", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        this.f279135L = view;
        SnsMethodCalculate.markEndTimeMs("setContentView", "com.tencent.mm.plugin.sns.ui.WrapScollview");
    }

    public void setDoComputeScrollDeltaToGetChildRectOnScreen(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setDoComputeScrollDeltaToGetChildRectOnScreen", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        this.f279132I = z;
        SnsMethodCalculate.markEndTimeMs("setDoComputeScrollDeltaToGetChildRectOnScreen", "com.tencent.mm.plugin.sns.ui.WrapScollview");
    }

    public void setScrollDeltaOnFocusLocationChange(int i) {
        SnsMethodCalculate.markStartTimeMs("setScrollDeltaOnFocusLocationChange", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        this.f279134K = i;
        SnsMethodCalculate.markEndTimeMs("setScrollDeltaOnFocusLocationChange", "com.tencent.mm.plugin.sns.ui.WrapScollview");
    }

    public WrapScollview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
