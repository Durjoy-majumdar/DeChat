package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsBrowseInfoHelper;

/* renamed from: com.tencent.mm.plugin.sns.model.m2 */
public class C94895m2 implements C94851d1 {

    /* renamed from: a */
    public SnsBrowseInfoHelper f274986a;

    public C94895m2(int i) {
    }

    /* renamed from: a */
    public SnsBrowseInfoHelper mo130970a() {
        SnsMethodCalculate.markStartTimeMs("getSnsBrowseInfoHelper", "com.tencent.mm.plugin.sns.model.TimelineContext");
        SnsBrowseInfoHelper snsBrowseInfoHelper = this.f274986a;
        SnsMethodCalculate.markEndTimeMs("getSnsBrowseInfoHelper", "com.tencent.mm.plugin.sns.model.TimelineContext");
        return snsBrowseInfoHelper;
    }

    public int getScene() {
        SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.model.TimelineContext");
        SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.model.TimelineContext");
        return 1;
    }
}
