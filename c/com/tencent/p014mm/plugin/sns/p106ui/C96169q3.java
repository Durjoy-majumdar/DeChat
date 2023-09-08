package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.q3 */
public class C96169q3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsAdProxyUI f280949d;

    public C96169q3(SnsAdProxyUI snsAdProxyUI) {
        this.f280949d = snsAdProxyUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI$1");
        SnsAdProxyUI snsAdProxyUI = this.f280949d;
        int i = SnsAdProxyUI.f277698e;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        boolean z = snsAdProxyUI.f277699d;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        if (z) {
            Log.m105924i("MicroMsg.SnsAdBlankUI", "finish, after delay");
            SnsAdProxyUI snsAdProxyUI2 = this.f280949d;
            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
            snsAdProxyUI2.f277699d = false;
            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
            this.f280949d.finish();
            this.f280949d.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI$1");
    }
}
