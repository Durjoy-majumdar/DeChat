package com.tencent.p014mm.plugin.appbrand.jsapi.video.p840ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.ui.AppBrandDotPercentIndicator */
public class AppBrandDotPercentIndicator extends LinearLayout {

    /* renamed from: d */
    public LayoutInflater f158109d;

    /* renamed from: e */
    public int f158110e;

    public AppBrandDotPercentIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f158109d = LayoutInflater.from(context);
    }

    public void setDotsNum(int i) {
        if (i <= 1) {
            i = 8;
        }
        this.f158110e = i;
        removeAllViews();
        for (int i2 = 0; i2 < this.f158110e; i2++) {
            addView((ImageView) this.f158109d.inflate(C0966R.C0971layout.f6398dr, this, false));
        }
    }

    public void setPercent(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        int rint = (int) Math.rint((double) (((float) this.f158110e) * f));
        int i = 0;
        Log.m105927v("MicroMsg.AppBrandDotPercentIndicator", "setPercent percent:%s dotsOnNum:%d", Float.valueOf(f), Integer.valueOf(rint));
        while (i < rint && i < getChildCount()) {
            ((ImageView) getChildAt(i)).setImageResource(C0966R.C0969drawable.f4432ci);
            i++;
        }
        while (i < getChildCount()) {
            ((ImageView) getChildAt(i)).setImageResource(C0966R.C0969drawable.f4431ch);
            i++;
        }
    }

    public AppBrandDotPercentIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f158109d = LayoutInflater.from(context);
    }
}
