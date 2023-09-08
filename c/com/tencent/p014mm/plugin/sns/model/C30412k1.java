package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.HashMap;
import os2.C100398c0;

/* renamed from: com.tencent.mm.plugin.sns.model.k1 */
public class C30412k1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C100398c0 f82024d;

    /* renamed from: e */
    public final /* synthetic */ C30413l1 f82025e;

    public C30412k1(C30413l1 l1Var, C100398c0 c0Var) {
        this.f82025e = l1Var;
        this.f82024d = c0Var;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsExtCache$3");
        C30413l1 l1Var = this.f82025e;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        HashMap<String, C100398c0> hashMap = l1Var.f82026a;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        C100398c0 c0Var = this.f82024d;
        hashMap.put(c0Var.field_userName, c0Var);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsExtCache$3");
    }
}
