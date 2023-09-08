package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.ScrollView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallFeedbackScrollView */
public class IPCallFeedbackScrollView extends ScrollView {
    public IPCallFeedbackScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        try {
            Display defaultDisplay = ((Activity) getContext()).getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            i2 = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels / 2, Integer.MIN_VALUE);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.IPCallFeedbackScrollView", e, "", new Object[0]);
        }
        super.onMeasure(i, i2);
    }

    public IPCallFeedbackScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
