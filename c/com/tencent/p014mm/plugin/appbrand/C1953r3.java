package com.tencent.p014mm.plugin.appbrand;

import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.r3 */
public final class C1953r3 {

    /* renamed from: a */
    public String f11860a;

    /* renamed from: b */
    public int f11861b;

    /* renamed from: c */
    public ArrayList<String> f11862c;

    public C1953r3(String str, int i, ArrayList<String> arrayList) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(arrayList, "files");
        this.f11860a = str;
        this.f11861b = i;
        this.f11862c = arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1953r3)) {
            return false;
        }
        C1953r3 r3Var = (C1953r3) obj;
        return C87412m.m108589b(this.f11860a, r3Var.f11860a) && this.f11861b == r3Var.f11861b && C87412m.m108589b(this.f11862c, r3Var.f11862c);
    }

    public int hashCode() {
        return (((this.f11860a.hashCode() * 31) + this.f11861b) * 31) + this.f11862c.hashCode();
    }

    public String toString() {
        return "PkgStorageInfo(appId=" + this.f11860a + ", storageUsage=" + this.f11861b + ", files=" + this.f11862c + ')';
    }
}
