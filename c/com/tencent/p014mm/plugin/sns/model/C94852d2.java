package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.sns.model.d2 */
public class C94852d2 {

    /* renamed from: a */
    public boolean f274813a = true;

    /* renamed from: a */
    public void mo130972a(String str, boolean z, int i, long j, int i2) {
        int i3 = i2;
        SnsMethodCalculate.markStartTimeMs("doSpecificFetch", "com.tencent.mm.plugin.sns.model.SnsUpDownServerHelper");
        if (i3 == 2) {
            this.f274813a = false;
            C94897n1.f274989c = 0;
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(new C94941r0(str, j, z, i, 0, 0, z ? 4 : 8, 2));
        } else {
            if (i3 == 1) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(68377, "");
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C94916o0(j, 0, 0));
            }
        }
        SnsMethodCalculate.markEndTimeMs("doSpecificFetch", "com.tencent.mm.plugin.sns.model.SnsUpDownServerHelper");
    }

    /* renamed from: b */
    public void mo130973b(String str, boolean z, int i, long j, int i2) {
        int i3 = i2;
        SnsMethodCalculate.markStartTimeMs("doUpFetch", "com.tencent.mm.plugin.sns.model.SnsUpDownServerHelper");
        if (i3 == 2) {
            C94897n1.f274989c = C94897n1.f274987a;
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(new C94941r0(str, C94897n1.f274987a, z, i, 1, 0, z ? 4 : 8, 2));
        } else if (i3 == 1) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(68377, "");
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(new C94916o0(0, j, 1));
        }
        SnsMethodCalculate.markEndTimeMs("doUpFetch", "com.tencent.mm.plugin.sns.model.SnsUpDownServerHelper");
    }
}
