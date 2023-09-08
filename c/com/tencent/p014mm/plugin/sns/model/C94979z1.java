package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;

/* renamed from: com.tencent.mm.plugin.sns.model.z1 */
public class C94979z1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C94974y1 f275382d;

    public C94979z1(C94974y1 y1Var) {
        this.f275382d = y1Var;
    }

    public void run() {
        SnsInfo SE;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$2");
        if (!(this.f275382d.f275366u == null || (SE = C94866e1.Yx0().mo139806SE(this.f275382d.f275366u.f292914e)) == null)) {
            C94974y1 y1Var = this.f275382d;
            SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            y1Var.f275338B = (long) (SE.field_createTime + 1);
            SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$2");
    }
}
