package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.model.g2 */
public class C94878g2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C94952t2 f274939d;

    /* renamed from: e */
    public final /* synthetic */ boolean f274940e;

    /* renamed from: f */
    public final /* synthetic */ C94869f2 f274941f;

    public C94878g2(C94869f2 f2Var, C94952t2 t2Var, boolean z) {
        this.f274941f = f2Var;
        this.f274939d = t2Var;
        this.f274940e = z;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$7");
        try {
            String str = this.f274939d.f275259f;
            SnsInfo DN = C94866e1.Yx0().mo139798DN(C102260r.m134869i(str, this.f274939d.f275257d.f298689d + "_"));
            this.f274939d.f275254a = DN != null ? DN.getUserName() : "";
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SnsVideoService", e.toString());
        }
        Log.m105925i("MicroMsg.SnsVideoService", "offer [%b] video task[%s] to queue ", Boolean.valueOf(this.f274940e), this.f274939d);
        if (this.f274940e) {
            C94869f2.m120305c(this.f274941f).offerFirst(this.f274939d);
        } else {
            C94869f2.m120305c(this.f274941f).offerLast(this.f274939d);
        }
        C94869f2 f2Var = this.f274941f;
        SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        Map<String, C94952t2> map = f2Var.f274916c;
        SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        C94952t2 t2Var = this.f274939d;
        ((ConcurrentHashMap) map).put(t2Var.f275255b, t2Var);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$7");
    }
}
