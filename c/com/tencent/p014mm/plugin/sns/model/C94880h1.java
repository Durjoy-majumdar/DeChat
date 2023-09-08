package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsBrowseInfoHelper;

/* renamed from: com.tencent.mm.plugin.sns.model.h1 */
public class C94880h1 implements C94851d1 {

    /* renamed from: a */
    public SnsBrowseInfoHelper f274949a;

    public C94880h1(int i) {
    }

    /* renamed from: a */
    public SnsBrowseInfoHelper mo130970a() {
        SnsMethodCalculate.markStartTimeMs("getSnsBrowseInfoHelper", "com.tencent.mm.plugin.sns.model.SnsDetailContext");
        if (this.f274949a == null) {
            this.f274949a = new SnsBrowseInfoHelper();
        }
        SnsBrowseInfoHelper snsBrowseInfoHelper = this.f274949a;
        SnsMethodCalculate.markEndTimeMs("getSnsBrowseInfoHelper", "com.tencent.mm.plugin.sns.model.SnsDetailContext");
        return snsBrowseInfoHelper;
    }

    public int getScene() {
        SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.model.SnsDetailContext");
        SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.model.SnsDetailContext");
        return 2;
    }
}
