package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import te3.C101804kv2;

/* renamed from: com.tencent.mm.plugin.sns.model.p */
public class C94924p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C101804kv2 f275097d;

    /* renamed from: e */
    public final /* synthetic */ C94901o f275098e;

    public C94924p(C94901o oVar, C101804kv2 kv22) {
        this.f275098e = oVar;
        this.f275097d = kv22;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$12");
        C94901o.m120383a(this.f275098e, 1, this.f275097d, false);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$12");
    }
}
