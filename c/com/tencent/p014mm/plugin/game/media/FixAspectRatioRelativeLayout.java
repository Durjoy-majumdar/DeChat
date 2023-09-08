package com.tencent.p014mm.plugin.game.media;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import s10.C77600a;

/* renamed from: com.tencent.mm.plugin.game.media.FixAspectRatioRelativeLayout */
public class FixAspectRatioRelativeLayout extends RelativeLayout {

    /* renamed from: d */
    public float f198331d;

    public FixAspectRatioRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77600a.f226230a, 0, 0);
        this.f198331d = obtainStyledAttributes.getFloat(0, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = (int) (this.f198331d * ((float) size));
        Log.m105925i("MicroMsg.FixAspectRatioRelativeLayout", "width = %d, height = %d, ratioHeight = %d", Integer.valueOf(size), Integer.valueOf(size2), Integer.valueOf(i3));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public FixAspectRatioRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77600a.f226230a, i, 0);
        this.f198331d = obtainStyledAttributes.getFloat(0, 0.0f);
        obtainStyledAttributes.recycle();
    }
}
