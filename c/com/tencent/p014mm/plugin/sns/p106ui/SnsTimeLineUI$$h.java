package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import hp3.C87581a;
import jr2.C99014h;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$h */
public class SnsTimeLineUI$$h implements C87581a<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ C99014h f278748a;

    /* renamed from: b */
    public final /* synthetic */ boolean f278749b;

    /* renamed from: c */
    public final /* synthetic */ int f278750c;

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f278751d;

    public SnsTimeLineUI$$h(SnsTimeLineUI snsTimeLineUI, C99014h hVar, boolean z, int i) {
        this.f278751d = snsTimeLineUI;
        this.f278748a = hVar;
        this.f278749b = z;
        this.f278750c = i;
    }

    public Object call(Object obj) {
        SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$25");
        Void voidR = (Void) obj;
        SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$25");
        if (SnsTimeLineUI.m122285M7(this.f278751d) != null) {
            SnsTimeLineUI snsTimeLineUI = this.f278751d;
            SnsMethodCalculate.markStartTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            snsTimeLineUI.f278622D = false;
            SnsMethodCalculate.markEndTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            SnsTimeLineUI.m122285M7(this.f278751d).mo133008b();
        }
        SnsTimeLineUI.m122302d8(this.f278751d).f278863s = this.f278748a.mo131175t0();
        SnsUIAction d8 = SnsTimeLineUI.m122302d8(this.f278751d);
        d8.getClass();
        SnsMethodCalculate.markStartTimeMs("isPendingBottomLoadData", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        boolean z = d8.f278838M;
        SnsMethodCalculate.markEndTimeMs("isPendingBottomLoadData", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        if (z) {
            Log.m105924i("MicroMsg.SnsTimeLineUI", "onNpSize: do PendingBottomLoadData");
            SnsTimeLineUI.m122302d8(this.f278751d).mo133030h();
        }
        SnsTimeLineUI snsTimeLineUI2 = this.f278751d;
        if (snsTimeLineUI2.f278646P1 == 0) {
            Log.m105919d("MicroMsg.SnsTimeLineUI", "onNpSize %s", Boolean.valueOf(this.f278748a.mo131175t0()));
            if (this.f278748a.mo131175t0()) {
                SnsTimeLineUI.m122302d8(this.f278751d).mo133043u(this.f278748a.mo131161C());
            }
            SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$25");
        } else {
            if (this.f278749b) {
                SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                String str = snsTimeLineUI2.f278653S;
                SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                if (!str.equals(SnsTimeLineUI.m122287O7(this.f278751d))) {
                    SnsTimeLineUI.m122302d8(this.f278751d).f278863s = true;
                    SnsTimeLineUI.m122302d8(this.f278751d).mo133045w(this.f278750c, this.f278748a.mo131161C());
                    SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$25");
                }
            }
            SnsTimeLineUI snsTimeLineUI3 = this.f278751d;
            SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            String str2 = snsTimeLineUI3.f278653S;
            SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            if (str2.equals(SnsTimeLineUI.m122287O7(this.f278751d)) && this.f278748a.mo131174p0() != 0) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SNS_RECENT_LIMITED_ID_LONG_SYNC, Long.valueOf(this.f278748a.mo131174p0()));
            }
            if (this.f278748a.mo131175t0()) {
                SnsTimeLineUI.m122302d8(this.f278751d).mo133043u(this.f278748a.mo131161C());
            }
            SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$25");
        }
        SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$25");
        return voidR;
    }
}
