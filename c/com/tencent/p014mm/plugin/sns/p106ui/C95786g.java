package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.sns.ui.g */
public class C95786g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f279447d;

    /* renamed from: e */
    public final /* synthetic */ boolean f279448e;

    /* renamed from: f */
    public final /* synthetic */ C95772f f279449f;

    public C95786g(C95772f fVar, List list, boolean z) {
        this.f279449f = fVar;
        this.f279447d = list;
        this.f279448e = z;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.AdapterLoader$2");
        this.f279449f.mo133174c(this.f279447d);
        C95772f fVar = this.f279449f;
        boolean z = this.f279448e;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        fVar.getClass();
        SnsMethodCalculate.markStartTimeMs("removeState", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        C94866e1.my0().post(new C95797h(fVar, z));
        SnsMethodCalculate.markEndTimeMs("removeState", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.AdapterLoader$2");
    }
}
