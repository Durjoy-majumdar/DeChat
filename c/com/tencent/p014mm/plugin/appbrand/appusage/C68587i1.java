package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.sdk.storage.IStorage;
import di3.C7335d;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.i1 */
public interface C68587i1 extends C7335d, IStorage {
    List<LocalUsageInfo> Oe0(int i);

    /* renamed from: Xs */
    List<LocalUsageInfo> mo94249Xs(int i, int i2);

    /* renamed from: gC */
    List<LocalUsageInfo> mo94250gC(long j, int i);

    int getCount();

    /* renamed from: nw */
    boolean mo94252nw(String str, int i);
}
