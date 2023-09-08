package com.tencent.p014mm.plugin.sns.statistics;

import ad0.C91998s;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: com.tencent.mm.plugin.sns.statistics.a0 */
public abstract class C94991a0 {

    /* renamed from: a */
    public Vector<C91998s> f275599a = new Vector<>();

    /* renamed from: a */
    public C91998s mo131396a(C91998s sVar) {
        SnsMethodCalculate.markStartTimeMs("createOplog", "com.tencent.mm.plugin.sns.statistics.Ss_log_base_helper");
        this.f275599a.add(sVar);
        SnsMethodCalculate.markEndTimeMs("createOplog", "com.tencent.mm.plugin.sns.statistics.Ss_log_base_helper");
        return sVar;
    }

    /* renamed from: b */
    public C91998s mo131397b(Object obj) {
        SnsMethodCalculate.markStartTimeMs("getByBindKey", "com.tencent.mm.plugin.sns.statistics.Ss_log_base_helper");
        if (obj == null) {
            SnsMethodCalculate.markEndTimeMs("getByBindKey", "com.tencent.mm.plugin.sns.statistics.Ss_log_base_helper");
            return null;
        }
        try {
            Iterator<C91998s> it = this.f275599a.iterator();
            while (it.hasNext()) {
                C91998s next = it.next();
                if (obj.equals(next.f263359a)) {
                    this.f275599a.remove(next);
                    SnsMethodCalculate.markEndTimeMs("getByBindKey", "com.tencent.mm.plugin.sns.statistics.Ss_log_base_helper");
                    return next;
                }
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.Ss_log_base_helper", "report by key " + e.getMessage() + " " + obj);
        }
        SnsMethodCalculate.markEndTimeMs("getByBindKey", "com.tencent.mm.plugin.sns.statistics.Ss_log_base_helper");
        return null;
    }

    /* renamed from: c */
    public boolean mo131398c(C91998s sVar) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("updateBySeq", "com.tencent.mm.plugin.sns.statistics.Ss_log_base_helper");
        Iterator<C91998s> it = this.f275599a.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C91998s next = it.next();
            if (next.f263363e == sVar.f263363e) {
                this.f275599a.remove(next);
                z = true;
                break;
            }
        }
        this.f275599a.add(sVar);
        SnsMethodCalculate.markEndTimeMs("updateBySeq", "com.tencent.mm.plugin.sns.statistics.Ss_log_base_helper");
        return z;
    }
}
