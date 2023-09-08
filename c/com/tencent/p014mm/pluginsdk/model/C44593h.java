package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import java.util.Map;

/* renamed from: com.tencent.mm.pluginsdk.model.h */
public final class C44593h implements Runnable {

    /* renamed from: d */
    public static final C44593h f120905d = new C44593h();

    public final void run() {
        for (Map.Entry next : C19428d.f54861f.entrySet()) {
            C19428d dVar = C19428d.f54856a;
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            C87412m.m108594g(str, "bizUserName");
            C87412m.m108594g(str2, "finderFeedExportId");
            int currentTimeMillis = (int) (System.currentTimeMillis() / 86400000);
            if (!dVar.mo25184s(str, str2)) {
                MMKVSlotManager mMKVSlotManager = C19428d.f54858c;
                int decodeInt = mMKVSlotManager.decodeInt("date-" + currentTimeMillis + "-expose-live-bar-" + str, 0) + 1;
                ((MultiProcessMMKV) mMKVSlotManager.getSlotForWrite()).encode("date-" + currentTimeMillis + "-expose-live-bar-" + str, decodeInt);
                StringBuilder sb = new StringBuilder();
                sb.append("updateLiveBarExposeTimes currentExposeTimes = ");
                sb.append(decodeInt);
                Log.m105918d("MicroMsg.BizFinderLiveLogic", sb.toString());
            }
            ((MultiProcessMMKV) C19428d.f54858c.getSlotForWrite()).encode("live_bar_expose-exportId-" + ((String) next.getKey()), (String) next.getValue());
        }
        C19428d.f54861f.clear();
        C19428d.f54875t.clear();
    }
}
