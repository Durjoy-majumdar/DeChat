package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.HashMap;
import os2.C100398c0;

/* renamed from: com.tencent.mm.plugin.sns.model.j1 */
public class C30410j1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C30413l1 f82020d;

    public C30410j1(C30413l1 l1Var) {
        this.f82020d = l1Var;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsExtCache$2");
        C30413l1 l1Var = this.f82020d;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        HashMap<String, C100398c0> hashMap = l1Var.f82026a;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        C30413l1.m39073a(l1Var, hashMap.size());
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsExtCache$2");
    }
}
