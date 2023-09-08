package ds2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.List;
import os2.C100404f0;
import sx3.C110818d0;

/* renamed from: ds2.g */
public final class C97534g implements Runnable {

    /* renamed from: d */
    public static final C97534g f286228d = new C97534g();

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$getBeforeMinToPredict$1");
        Log.m105924i("MicroMsg.SnsKaraOptionConfig", "getBeforeMinToPredict >> " + C97535h.m125671b());
        if (C97535h.m125671b() == 0) {
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$getBeforeMinToPredict$1");
            return;
        }
        List<SnsInfo> b = C100404f0.f294118a.mo139846b(C97535h.m125671b(), 50);
        Log.m105924i("MicroMsg.SnsKaraOptionConfig", "getBeforeMinToPredict getSnsInfoSmallThanCreateTimeAndLimit >> " + b.size());
        if (!b.isEmpty()) {
            int createTime = ((SnsInfo) C110818d0.m150923U(b)).getCreateTime();
            SnsMethodCalculate.markStartTimeMs("access$setMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            C97535h.f286235g = createTime;
            SnsMethodCalculate.markEndTimeMs("access$setMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            C97535h.m125672c(C97535h.f286229a, (ArrayList) b, true, C97531c.BEFORE_MIN);
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$getBeforeMinToPredict$1");
    }
}
