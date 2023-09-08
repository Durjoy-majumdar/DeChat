package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.x5 */
public class C96314x5 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ SnsSightPlayerUI f281689d;

    public C96314x5(SnsSightPlayerUI snsSightPlayerUI) {
        this.f281689d = snsSightPlayerUI;
    }

    public boolean onPreDraw() {
        SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$11");
        this.f281689d.f278470t.getViewTreeObserver().removeOnPreDrawListener(this);
        SnsSightPlayerUI snsSightPlayerUI = this.f281689d;
        C45059m0 m0Var = snsSightPlayerUI.f278443J;
        ViewGroup viewGroup = snsSightPlayerUI.f278470t;
        SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        ImageView imageView = snsSightPlayerUI.f278438E;
        SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        m0Var.mo70408c(viewGroup, imageView, (C45059m0.C45068i) null);
        SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$11");
        return true;
    }
}
