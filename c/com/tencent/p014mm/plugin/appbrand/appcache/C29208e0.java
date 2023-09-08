package com.tencent.p014mm.plugin.appbrand.appcache;

import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.e0 */
public class C29208e0 {

    /* renamed from: a */
    public final String f79853a;

    /* renamed from: b */
    public final int f79854b;

    public C29208e0(String str, int i) {
        this.f79853a = str;
        this.f79854b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C29208e0.class != obj.getClass()) {
            return false;
        }
        C29208e0 e0Var = (C29208e0) obj;
        return this.f79854b == e0Var.f79854b && this.f79853a.equals(e0Var.f79853a);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f79853a, Integer.valueOf(this.f79854b)});
    }

    public String toString() {
        return "AppPkg{appId='" + this.f79853a + '\'' + ", versionType=" + this.f79854b + '}';
    }
}
