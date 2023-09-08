package com.tencent.p014mm.plugin.mmsight.segment;

import com.tencent.p014mm.modelvideoh265toh264.C92862f;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.mmsight.segment.j */
public class C105486j {
    /* renamed from: a */
    public static C105477c m141676a(String str, int i, int i2, int i3) {
        Log.m105925i("MicroMsg.ThumbFetcherFactory", "get thumb fetcher, ish265: %s", Boolean.valueOf(C92862f.m117175h(str)));
        C105481e eVar = new C105481e();
        eVar.init(str, i, i2, i3);
        return eVar;
    }
}
