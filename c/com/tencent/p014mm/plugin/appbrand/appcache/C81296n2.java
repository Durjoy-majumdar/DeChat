package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.sdk.platformtools.Util;
import ei0.C86516a;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.n2 */
public class C81296n2 extends C86516a {

    /* renamed from: q */
    public final String f238714q;

    public C81296n2(String str, int i, String str2, String str3, C86516a.C86517a aVar) {
        super(String.format("WxaDebugPkg_%s_%d_%s", new Object[]{str, Integer.valueOf(i), Util.nullAsNil(aVar.mo113492a())}), C81355t2.m99778d(str) + String.format("debug_%d_%d_%d", new Object[]{Integer.valueOf(str.hashCode()), Integer.valueOf(i), Integer.valueOf(Util.nullAsNil(aVar.mo113492a()).hashCode())}), str3, str, String.format("%s_%d_%s", new Object[]{str, Integer.valueOf(i), Util.nullAsNil(aVar.mo113492a())}).hashCode(), i);
        this.f238714q = str2;
    }
}
