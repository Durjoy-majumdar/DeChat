package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.sns.ui.h */
public class C95797h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f279548d;

    /* renamed from: e */
    public final /* synthetic */ C95772f f279549e;

    public C95797h(C95772f fVar, boolean z) {
        this.f279549e = fVar;
        this.f279548d = z;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.AdapterLoader$3");
        if (this.f279548d) {
            C95772f fVar = this.f279549e;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
            fVar.getClass();
            SnsMethodCalculate.markStartTimeMs("removeType", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
            if (((LinkedList) fVar.f279398b).size() > 1) {
                ((LinkedList) fVar.f279398b).remove(0);
            }
            SnsMethodCalculate.markEndTimeMs("removeType", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.AdapterLoader$3");
    }
}
