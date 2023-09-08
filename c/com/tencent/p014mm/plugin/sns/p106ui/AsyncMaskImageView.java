package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.plugin.sns.ui.AsyncMaskImageView */
public class AsyncMaskImageView extends ImageView {

    /* renamed from: h */
    public static final /* synthetic */ int f276665h = 0;

    /* renamed from: d */
    public MMHandler f276666d;

    /* renamed from: e */
    public Runnable f276667e;

    /* renamed from: f */
    public int f276668f = 90;

    /* renamed from: g */
    public boolean f276669g = true;

    public AsyncMaskImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        this.f276666d = new MMHandler();
        this.f276667e = new C96003l(this);
        super.setOnTouchListener(new C96062m(this));
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        super.onAttachedToWindow();
        Log.m105918d("MicroMsg.MaskImageView", "onAttachedToWindow");
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        super.onDetachedFromWindow();
        Log.m105918d("MicroMsg.MaskImageView", "onDetachedFromWindow");
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
    }

    public void onDraw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        super.onDraw(canvas);
        if (isPressed()) {
            canvas.drawARGB(this.f276668f, 0, 0, 0);
        }
        SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
    }

    @Deprecated
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        SnsMethodCalculate.markStartTimeMs("setOnTouchListener", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        Assert.assertTrue(false);
        SnsMethodCalculate.markEndTimeMs("setOnTouchListener", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
    }

    public void settouchEnable(boolean z) {
        SnsMethodCalculate.markStartTimeMs("settouchEnable", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        this.f276669g = z;
        SnsMethodCalculate.markEndTimeMs("settouchEnable", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
    }
}
