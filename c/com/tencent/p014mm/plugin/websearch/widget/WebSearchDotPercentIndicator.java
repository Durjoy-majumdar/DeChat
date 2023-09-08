package com.tencent.p014mm.plugin.websearch.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.websearch.widget.WebSearchDotPercentIndicator */
public class WebSearchDotPercentIndicator extends LinearLayout {

    /* renamed from: d */
    public LayoutInflater f164746d;

    /* renamed from: e */
    public int f164747e;

    public WebSearchDotPercentIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f164746d = LayoutInflater.from(context);
    }

    public void setDotsNum(int i) {
        if (i <= 1) {
            i = 8;
        }
        this.f164747e = i;
        removeAllViews();
        for (int i2 = 0; i2 < this.f164747e; i2++) {
            addView((ImageView) this.f164746d.inflate(C0966R.C0971layout.atw, this, false));
        }
    }

    public void setPercent(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        int rint = (int) Math.rint((double) (((float) this.f164747e) * f));
        int i = 0;
        Log.m105927v("MicroMsg.AppBrandDotPercentIndicator", "setPercent percent:%s dotsOnNum:%d", Float.valueOf(f), Integer.valueOf(rint));
        while (i < rint && i < getChildCount()) {
            ((ImageView) getChildAt(i)).setImageResource(C0966R.C0969drawable.f357211a70);
            i++;
        }
        while (i < getChildCount()) {
            ((ImageView) getChildAt(i)).setImageResource(C0966R.C0969drawable.a6z);
            i++;
        }
    }

    public WebSearchDotPercentIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f164746d = LayoutInflater.from(context);
    }
}
