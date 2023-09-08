package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.xweb.IXWebBroadcastListener;
import i72.C98607d;
import java.util.List;
import qs2.C101255a0;
import qs2.C101264f;
import zo2.C103049a;

/* renamed from: com.tencent.mm.plugin.sns.ui.c3 */
public class C95749c3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C101264f f279281d;

    /* renamed from: e */
    public final /* synthetic */ SnsAdNativeLandingPagesUI f279282e;

    public C95749c3(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI, C101264f fVar) {
        this.f279282e = snsAdNativeLandingPagesUI;
        this.f279281d = fVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$19");
        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f279282e;
        List<C101255a0> list = SnsAdNativeLandingPagesUI.f277498D2;
        SnsMethodCalculate.markStartTimeMs("access$5400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z = snsAdNativeLandingPagesUI.f277529N1;
        SnsMethodCalculate.markEndTimeMs("access$5400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (z) {
            C103049a a = C103049a.m136281a();
            String str = this.f279281d.f296495a;
            a.getClass();
            SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
            a.f304039e = str;
            C98607d dVar = a.f304040f;
            if (dVar != null) {
                dVar.enable();
                a.f304040f.f289116g = a;
            }
            SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$19");
    }
}
