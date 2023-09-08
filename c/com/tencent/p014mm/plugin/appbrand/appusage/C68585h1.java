package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.sdk.storage.IStorage;
import di3.C7335d;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.h1 */
public interface C68585h1 extends C7335d, IStorage {

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.h1$a */
    public enum C68586a {
        DESC,
        ASC,
        UPDATE_TIME_DESC
    }

    boolean Fq0(List<LocalUsageInfo> list, int i);

    /* renamed from: G7 */
    boolean mo94240G7(String str, int i);

    /* renamed from: Tk */
    int mo94241Tk();

    int getCount();

    /* renamed from: l8 */
    boolean mo94243l8(String str, int i);

    /* renamed from: mJ */
    boolean mo94244mJ(String str, int i);

    /* renamed from: pM */
    List<LocalUsageInfo> mo94245pM(int i, C68586a aVar);

    int rg0(String str, int i);

    List<LocalUsageInfo> tl0(int i, C68586a aVar, int i2);
}
