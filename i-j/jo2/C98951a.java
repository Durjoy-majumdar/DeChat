package jo2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import ko2.C99152c;
import rq2.C101425k;

/* renamed from: jo2.a */
public final class C98951a {

    /* renamed from: b */
    public static C98951a f290046b = new C98951a();

    /* renamed from: a */
    public C99152c f290047a = new C99152c();

    /* renamed from: a */
    public void mo138280a(String str, String[] strArr) {
        C99152c.C99154b bVar;
        SnsMethodCalculate.markStartTimeMs("publish", "com.tencent.mm.plugin.sns.ad.h5.H5PrefetchManager");
        try {
            C99152c cVar = this.f290047a;
            cVar.getClass();
            SnsMethodCalculate.markStartTimeMs("publish", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
            SnsMethodCalculate.markStartTimeMs("offerTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
            if (str != null) {
                if (!C101425k.m133099c(strArr)) {
                    bVar = cVar.mo138522a(new C99152c.C99154b(str, strArr));
                    SnsMethodCalculate.markEndTimeMs("offerTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                    cVar.mo138523b(bVar);
                    SnsMethodCalculate.markEndTimeMs("publish", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                    SnsMethodCalculate.markEndTimeMs("publish", "com.tencent.mm.plugin.sns.ad.h5.H5PrefetchManager");
                }
            }
            bVar = null;
            SnsMethodCalculate.markEndTimeMs("offerTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
            cVar.mo138523b(bVar);
            SnsMethodCalculate.markEndTimeMs("publish", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("publish", "com.tencent.mm.plugin.sns.ad.h5.H5PrefetchManager");
    }
}
