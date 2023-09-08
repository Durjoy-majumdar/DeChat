package com.tencent.p014mm.plugin.appbrand.appstorage;

import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.p */
public final class C81427p {

    /* renamed from: a */
    public final String f238965a;

    /* renamed from: b */
    public final String f238966b;

    /* renamed from: c */
    public final String f238967c;

    /* renamed from: d */
    public final long f238968d;

    /* renamed from: e */
    public final Boolean f238969e;

    public C81427p(String str, String str2, String str3, long j, Boolean bool) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "iconUrl");
        C87412m.m108594g(str3, "displayName");
        this.f238965a = str;
        this.f238966b = str2;
        this.f238967c = str3;
        this.f238968d = j;
        this.f238969e = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C81427p)) {
            return false;
        }
        C81427p pVar = (C81427p) obj;
        return C87412m.m108589b(this.f238965a, pVar.f238965a) && C87412m.m108589b(this.f238966b, pVar.f238966b) && C87412m.m108589b(this.f238967c, pVar.f238967c) && this.f238968d == pVar.f238968d && C87412m.m108589b(this.f238969e, pVar.f238969e);
    }

    public int hashCode() {
        long j = this.f238968d;
        int hashCode = ((((((this.f238965a.hashCode() * 31) + this.f238966b.hashCode()) * 31) + this.f238967c.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        Boolean bool = this.f238969e;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "AppBrandStorageUsageInfo(appId=" + this.f238965a + ", iconUrl=" + this.f238966b + ", displayName=" + this.f238967c + ", cacheSize=" + this.f238968d + ", isAlive=" + this.f238969e + ')';
    }
}
