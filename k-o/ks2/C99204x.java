package ks2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.systemservicecache.NetworkCache;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.UUID;
import rx3.C13598b0;

/* renamed from: ks2.x */
public final class C99204x extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C99204x f290901d = new C99204x();

    public C99204x() {
        super(0);
    }

    public Object invoke() {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startSession$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startSession$1");
        synchronized (C99181f.m129202d()) {
            try {
                int iOSNetTypeFromCache = NetworkCache.INSTANCE.getIOSNetTypeFromCache(MMApplicationContext.getContext());
                SnsMethodCalculate.markStartTimeMs("access$setNetType$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                C99181f.f290862f = iOSNetTypeFromCache;
                SnsMethodCalculate.markEndTimeMs("access$setNetType$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                C99181f fVar = C99181f.f290857a;
                SnsMethodCalculate.markStartTimeMs("access$checkSessionValid", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                boolean i = fVar.mo138549i();
                SnsMethodCalculate.markEndTimeMs("access$checkSessionValid", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                if (i) {
                    Log.m105924i("MicroMsg.Image.SnsImageLoadReporter", "startSession, already has currentSession");
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startSession$1");
                } else {
                    C99181f.m129203e().clear();
                    SnsMethodCalculate.markStartTimeMs("access$getSessionLock$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    Object obj = C99181f.f290861e;
                    SnsMethodCalculate.markEndTimeMs("access$getSessionLock$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    synchronized (obj) {
                        String uuid = UUID.randomUUID().toString();
                        C87412m.m108593f(uuid, "randomUUID().toString()");
                        SnsMethodCalculate.markStartTimeMs("access$setCurrentSession$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                        C99181f.f290860d = uuid;
                        SnsMethodCalculate.markEndTimeMs("access$setCurrentSession$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                        StringBuilder sb = new StringBuilder();
                        sb.append("start new session:");
                        SnsMethodCalculate.markStartTimeMs("access$getCurrentSession$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                        String str = C99181f.f290860d;
                        SnsMethodCalculate.markEndTimeMs("access$getCurrentSession$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                        sb.append(str);
                        Log.m105924i("MicroMsg.Image.SnsImageLoadReporter", sb.toString());
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startSession$1");
                }
            } catch (Throwable th) {
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startSession$1");
                throw th;
            }
        }
        C13598b0 b0Var2 = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startSession$1");
        return b0Var2;
    }
}
