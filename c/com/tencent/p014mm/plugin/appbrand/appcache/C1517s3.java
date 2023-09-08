package com.tencent.p014mm.plugin.appbrand.appcache;

import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.s3 */
public final class C1517s3 {

    /* renamed from: a */
    public final String f10868a;

    public C1517s3(String str) {
        C87412m.m108594g(str, "provider");
        this.f10868a = str;
    }

    public boolean equals(Object obj) {
        String str = null;
        C1517s3 s3Var = obj instanceof C1517s3 ? (C1517s3) obj : null;
        if (s3Var != null) {
            str = s3Var.f10868a;
        }
        return C87412m.m108589b(str, this.f10868a);
    }

    public int hashCode() {
        return this.f10868a.hashCode();
    }

    public String toString() {
        return "PLUGIN(provider=" + this.f10868a + ')';
    }
}
