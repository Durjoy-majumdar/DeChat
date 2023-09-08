package ds2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.List;
import os2.C100404f0;
import sx3.C110818d0;

/* renamed from: ds2.f */
public final class C97533f implements Runnable {

    /* renamed from: d */
    public static final C97533f f286227d = new C97533f();

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$getAfterMaxToPredict$1");
        Log.m105924i("MicroMsg.SnsKaraOptionConfig", "getAfterMaxToPredict >> " + C97535h.m125670a());
        if (C97535h.m125670a() == 0) {
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$getAfterMaxToPredict$1");
            return;
        }
        List<SnsInfo> a = C100404f0.f294118a.mo139845a(C97535h.m125670a());
        Log.m105924i("MicroMsg.SnsKaraOptionConfig", "getAfterMaxToPredict getSnsInfoLargeThanCreateTime >> " + a.size());
        if (!a.isEmpty()) {
            int createTime = ((SnsInfo) C110818d0.m150914L(a)).getCreateTime();
            SnsMethodCalculate.markStartTimeMs("access$setMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            C97535h.f286234f = createTime;
            SnsMethodCalculate.markEndTimeMs("access$setMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            C97535h.m125672c(C97535h.f286229a, (ArrayList) a, true, C97531c.AFTER_MAX);
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$getAfterMaxToPredict$1");
    }
}
