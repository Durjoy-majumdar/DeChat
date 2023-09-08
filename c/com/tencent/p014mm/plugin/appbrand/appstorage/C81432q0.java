package com.tencent.p014mm.plugin.appbrand.appstorage;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.q0 */
public class C81432q0 extends FileStructStat implements C81415h0.C81416a {

    /* renamed from: d */
    public final String f238976d;

    public C81432q0(String str) {
        this.f238976d = str;
    }

    /* renamed from: a */
    public String mo113671a() {
        return this.f238976d;
    }

    /* renamed from: b */
    public long mo113672b() {
        return this.st_size;
    }

    public long lastModified() {
        return this.st_mtime;
    }
}
