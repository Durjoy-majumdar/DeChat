package com.tencent.p014mm.plugin.appbrand.page;

import p225rc.C89925n;

/* renamed from: com.tencent.mm.plugin.appbrand.page.m4 */
public final class C83853m4 {

    /* renamed from: a */
    public final String f244831a;

    /* renamed from: b */
    public final String f244832b;

    /* renamed from: c */
    public final int f244833c;

    /* renamed from: d */
    public final long f244834d;

    public C83853m4(String str, int i, long j) {
        this.f244831a = str;
        this.f244832b = C89925n.m112488a(str);
        this.f244833c = i;
        this.f244834d = j;
    }

    /* renamed from: a */
    public int mo116405a() {
        return this.f244833c;
    }

    /* renamed from: b */
    public String mo116406b() {
        return this.f244831a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C83853m4) && ((C83853m4) obj).f244833c == this.f244833c;
    }

    public int hashCode() {
        return this.f244833c;
    }
}
