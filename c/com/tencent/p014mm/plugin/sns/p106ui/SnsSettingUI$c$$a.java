package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.SnsSettingUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import mr2.C34652d;
import qo3.C47883u;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$c$$a */
public final /* synthetic */ class SnsSettingUI$c$$a implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ SnsSettingUI.C30439c f82114a;

    public /* synthetic */ SnsSettingUI$c$$a(SnsSettingUI.C30439c cVar) {
        this.f82114a = cVar;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        SnsSettingUI.C30439c cVar = this.f82114a;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$onClick$0", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$12");
        SnsSettingUI.this.hideVKB();
        if (z) {
            int i = Util.getInt(str, -1);
            SnsMethodCalculate.markStartTimeMs("setCleanInterval", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
            if (i < 0) {
                SnsMethodCalculate.markEndTimeMs("setCleanInterval", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
            } else {
                C34652d.f93174a = (long) i;
                Log.m105924i("MicroMsg.SnsPostMediaCleanManager", "setCleanInterval " + i);
                SnsMethodCalculate.markEndTimeMs("setCleanInterval", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
            }
        }
        SnsMethodCalculate.markEndTimeMs("lambda$onClick$0", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$12");
    }
}
