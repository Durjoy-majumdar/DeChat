package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import in3.C87771d;

/* renamed from: com.tencent.mm.plugin.sns.ui.k6 */
public class C96002k6 implements C87771d.C46280b {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f280329d;

    public C96002k6(SnsTimeLineUI snsTimeLineUI) {
        this.f280329d = snsTimeLineUI;
    }

    /* renamed from: U3 */
    public void mo6344U3(int i) {
        SnsMethodCalculate.markStartTimeMs("onStatusBarHeightChange", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$29");
        SnsTimeLineUI snsTimeLineUI = this.f280329d;
        Boolean bool = SnsTimeLineUI.f278611T1;
        SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        View view = snsTimeLineUI.f278703z1;
        SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        view.setPadding(0, i, 0, 0);
        SnsMethodCalculate.markEndTimeMs("onStatusBarHeightChange", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$29");
    }
}
