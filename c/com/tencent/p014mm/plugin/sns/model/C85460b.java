package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.sns.model.b */
public class C85460b extends LinkedHashMap<Long, Integer> {
    public C85460b(int i, float f) {
        super(i, f);
    }

    public boolean removeEldestEntry(Map.Entry<Long, Integer> entry) {
        SnsMethodCalculate.markStartTimeMs("removeEldestEntry", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic$2");
        if (size() > 500 && entry != null) {
            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "remove eldest ad snsId " + entry.getKey());
        }
        boolean z = size() > 500;
        SnsMethodCalculate.markEndTimeMs("removeEldestEntry", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic$2");
        return z;
    }
}
