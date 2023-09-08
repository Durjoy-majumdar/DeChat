package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.memory.C92714n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.model.q */
public class C94936q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f275143d;

    /* renamed from: e */
    public final /* synthetic */ String f275144e;

    /* renamed from: f */
    public final /* synthetic */ C92714n f275145f;

    /* renamed from: g */
    public final /* synthetic */ C94901o f275146g;

    public C94936q(C94901o oVar, int i, String str, C92714n nVar) {
        this.f275146g = oVar;
        this.f275143d = i;
        this.f275144e = str;
        this.f275145f = nVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$13");
        C92714n nVar = this.f275145f;
        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        this.f275146g.mo131087G(this.f275143d + "-" + this.f275144e, nVar);
        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$13");
    }
}
