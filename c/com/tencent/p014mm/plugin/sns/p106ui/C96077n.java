package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.n */
public class C96077n extends LinearLayout {

    /* renamed from: d */
    public int f280557d = 0;

    /* renamed from: e */
    public int f280558e = 6;

    /* renamed from: f */
    public Context f280559f;

    /* renamed from: g */
    public LinearLayout f280560g;

    public C96077n(Context context) {
        super(context);
        this.f280559f = context;
        setOrientation(1);
    }

    public void addView(View view) {
        SnsMethodCalculate.markStartTimeMs("addView", "com.tencent.mm.plugin.sns.ui.AutoLayout");
        if (this.f280557d % this.f280558e == 0) {
            LinearLayout linearLayout = new LinearLayout(this.f280559f);
            this.f280560g = linearLayout;
            linearLayout.setOrientation(0);
            this.f280560g.addView(view);
            super.addView(this.f280560g);
        } else {
            this.f280560g.addView(view);
        }
        this.f280557d++;
        SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.ui.AutoLayout");
    }

    public void setLineMaxCounte(int i) {
        SnsMethodCalculate.markStartTimeMs("setLineMaxCounte", "com.tencent.mm.plugin.sns.ui.AutoLayout");
        if (i > 0) {
            this.f280558e = i;
        }
        SnsMethodCalculate.markEndTimeMs("setLineMaxCounte", "com.tencent.mm.plugin.sns.ui.AutoLayout");
    }
}
