package com.tencent.p014mm.plugin.sns.p104ad.widget.interactionlabel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView */
public class ShakeCoverAnimView extends ViewGroup {

    /* renamed from: d */
    public View f249069d;

    /* renamed from: e */
    public float f249070e;

    public ShakeCoverAnimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView");
        int b = C76577a.m92151b(getContext(), 32);
        if (this.f249069d == null) {
            View view = new View(getContext());
            this.f249069d = view;
            view.setLayoutParams(new ViewGroup.LayoutParams(b, b));
            this.f249069d.setBackgroundResource(C0966R.C0969drawable.asw);
            addView(this.f249069d);
        }
        int measuredHeight = getMeasuredHeight();
        this.f249069d.layout(0, measuredHeight, b + 0, measuredHeight + b);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight2 > 0) {
            int i5 = b / 2;
            int i6 = measuredWidth - i5;
            int i7 = measuredHeight2 + i5;
            this.f249070e = ((float) ((Math.sqrt((double) ((i6 * i6) + (i7 * i7))) * 2.0d) / ((double) b))) + 0.5f;
        }
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView");
    }

    public ShakeCoverAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }
}
