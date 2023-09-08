package jp2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: jp2.c */
public class C98954c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98955d f290071d;

    public C98954c(C98955d dVar) {
        this.f290071d = dVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic$1");
        C98955d dVar = this.f290071d;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        boolean z = dVar.f290082a;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        if (!z) {
            C98955d dVar2 = this.f290071d;
            dVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("calc", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
            dVar2.mo138282a(false);
            SnsMethodCalculate.markEndTimeMs("calc", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic$1");
    }
}
