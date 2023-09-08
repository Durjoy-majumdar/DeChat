package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.HashMap;
import os2.C100398c0;

/* renamed from: com.tencent.mm.plugin.sns.model.i1 */
public class C30408i1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C30413l1 f82016d;

    public C30408i1(C30413l1 l1Var) {
        this.f82016d = l1Var;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsExtCache$1");
        C30413l1 l1Var = this.f82016d;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        HashMap<String, C100398c0> hashMap = l1Var.f82026a;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        if (hashMap.size() > 50) {
            C30413l1.m39073a(this.f82016d, 10);
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsExtCache$1");
    }
}
