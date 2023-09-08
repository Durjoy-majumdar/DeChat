package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.mm.plugin.sns.model.h2 */
public class C94881h2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C94869f2 f274950d;

    public C94881h2(C94869f2 f2Var) {
        this.f274950d = f2Var;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$9");
        if (this.f274950d.f274914a != null) {
            Log.m105925i("MicroMsg.SnsVideoService", "download video finish cdnmediaId %s", this.f274950d.f274914a.f275255b);
            C94869f2 f2Var = this.f274950d;
            SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            Map<String, C94952t2> map = f2Var.f274916c;
            SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            ((ConcurrentHashMap) map).remove(this.f274950d.f274914a.f275255b);
        }
        this.f274950d.f274914a = null;
        this.f274950d.mo131039y();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$9");
    }
}
