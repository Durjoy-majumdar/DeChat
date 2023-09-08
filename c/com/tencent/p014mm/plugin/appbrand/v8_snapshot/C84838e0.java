package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.tencent.p014mm.plugin.appbrand.appcache.AssetReader;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.e0 */
public final class C84838e0 {
    /* renamed from: a */
    public static final String m104510a(ICommLibReader iCommLibReader) {
        C87412m.m108594g(iCommLibReader, "<this>");
        String checksumMd5 = iCommLibReader.mo113379c().checksumMd5();
        return checksumMd5 == null ? "" : checksumMd5;
    }

    /* renamed from: b */
    public static final String m104511b(ICommLibReader iCommLibReader) {
        C87412m.m108594g(iCommLibReader, "<this>");
        String pkgPath = iCommLibReader.mo113379c().pkgPath();
        return (!(pkgPath == null || pkgPath.length() == 0) || !(iCommLibReader instanceof AssetReader)) ? pkgPath : "/assets/wxa_library";
    }
}
