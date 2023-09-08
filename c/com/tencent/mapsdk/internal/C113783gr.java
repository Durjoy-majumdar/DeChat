package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.annotation.Json;
import com.tencent.mapsdk.shell.events.ReportEvent;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.tencent.mapsdk.internal.gr */
public final class C113783gr extends C113793gw {
    @Json(name = "loadSuccess")

    /* renamed from: a */
    private boolean f340401a = false;
    @Json(name = "loadSuccessTime")

    /* renamed from: b */
    private long f340402b = 0;
    @Json(name = "firstLoadTime")

    /* renamed from: c */
    private long f340403c = 0;
    @Json(name = "configUpdate")

    /* renamed from: d */
    private C113785b f340404d;
    @Json(name = "tileErrors")

    /* renamed from: e */
    private Set<C113788e> f340405e;
    @Json(name = "configError")

    /* renamed from: f */
    private C113784a f340406f;

    /* renamed from: com.tencent.mapsdk.internal.gr$a */
    public static class C113784a extends C113793gw {
        @Json(name = "failUpdates")

        /* renamed from: a */
        public Set<C113786c> f340407a;
        @Json(name = "missFiles")

        /* renamed from: b */
        public Set<C113787d> f340408b;

        public C113784a(long j) {
            super(j);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.gr$b */
    public static class C113785b extends C113793gw {
        @Json(name = "success")

        /* renamed from: a */
        public boolean f340409a = false;
        @Json(name = "loadBeginTime")

        /* renamed from: b */
        public long f340410b = 0;

        public C113785b(long j) {
            super(j);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.gr$c */
    public static class C113786c extends C113793gw {
        @Json(name = "name")

        /* renamed from: a */
        public String f340411a;
        @Json(name = "time")

        /* renamed from: b */
        public long f340412b;
        @Json(name = "expectMd5")

        /* renamed from: c */
        public String f340413c;
        @Json(name = "actualMd5")

        /* renamed from: d */
        public String f340414d;
        @Json(name = "localVer")

        /* renamed from: e */
        public int f340415e;
        @Json(name = "netError")

        /* renamed from: f */
        public int f340416f;

        public C113786c() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C113786c)) {
                return false;
            }
            return C40002he.m42806a(this.f340411a, ((C113786c) obj).f340411a);
        }

        public final int hashCode() {
            String str = this.f340411a;
            return str == null ? super.hashCode() : str.hashCode();
        }

        public C113786c(long j) {
            super(j);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.gr$d */
    public static class C113787d extends C113793gw {
        @Json(name = "name")

        /* renamed from: a */
        public String f340417a;
        @Json(name = "time")

        /* renamed from: b */
        public long f340418b;

        public C113787d(long j) {
            super(j);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C113787d)) {
                return false;
            }
            return C40002he.m42806a(this.f340417a, ((C113787d) obj).f340417a);
        }

        public final int hashCode() {
            String str = this.f340417a;
            return str == null ? super.hashCode() : str.hashCode();
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.gr$e */
    public static class C113788e extends C113793gw {
        @Json(name = "time")

        /* renamed from: a */
        public long f340419a;
        @Json(name = "tid")

        /* renamed from: b */
        public String f340420b;
        @Json(name = "netError")

        /* renamed from: c */
        public int f340421c;

        public C113788e(long j) {
            super(j);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C113788e)) {
                return false;
            }
            return C40002he.m42806a(this.f340420b, ((C113788e) obj).f340420b);
        }

        public final int hashCode() {
            String str = this.f340420b;
            return str == null ? super.hashCode() : str.hashCode();
        }
    }

    public C113783gr(long j) {
        super(j);
    }

    /* renamed from: a */
    public final void mo172145a(boolean z, long j) {
        this.f340401a = z;
        if (this.f340403c > 0) {
            this.f340402b = j - this.f340445g;
        } else {
            this.f340403c = j - this.f340445g;
        }
        this.f340402b = j;
        HashMap hashMap = new HashMap();
        hashMap.put("success", String.valueOf(z));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f340445g);
        hashMap.put("startTime", sb.toString());
        hashMap.put("endTime", String.valueOf(j));
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f340402b);
        hashMap.put("duration", sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f340403c);
        hashMap.put("firstDuration", sb5.toString());
        C114361u.m160481a();
        new ReportEvent("mapload", hashMap);
    }

    /* renamed from: b */
    public final void mo172146b(boolean z, long j) {
        C113785b bVar = new C113785b(mo172171r());
        this.f340404d = bVar;
        bVar.f340409a = z;
        long j2 = this.f340445g;
        if (j - j2 > 0) {
            bVar.f340410b = j - j2;
        }
    }

    /* renamed from: a */
    public final void mo172143a(long j, String str, int i) {
        if (this.f340405e == null) {
            this.f340405e = new CopyOnWriteArraySet();
        }
        if (this.f340405e.size() <= 9) {
            C113788e eVar = new C113788e(j);
            eVar.f340419a = j - this.f340445g;
            eVar.f340420b = str;
            eVar.f340421c = i;
            this.f340405e.add(eVar);
            HashMap hashMap = new HashMap();
            hashMap.put("tid", str);
            hashMap.put("netError", String.valueOf(i));
            StringBuilder sb = new StringBuilder();
            sb.append(this.f340445g);
            hashMap.put("startTime", sb.toString());
            hashMap.put("endTime", String.valueOf(j));
            C114361u.m160481a();
            new ReportEvent("mapload-tile", hashMap);
        }
    }

    /* renamed from: a */
    public final void mo172144a(C113786c cVar) {
        if (this.f340406f == null) {
            this.f340406f = new C113784a(mo172171r());
        }
        C113784a aVar = this.f340406f;
        if (aVar.f340407a == null) {
            aVar.f340407a = new CopyOnWriteArraySet();
        }
        if (this.f340406f.f340407a.size() <= 9) {
            this.f340406f.f340407a.add(cVar);
            HashMap hashMap = new HashMap();
            hashMap.put("name", cVar.f340411a);
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.f340415e);
            hashMap.put("localVer", sb.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(cVar.f340416f);
            hashMap.put("netError", sb4.toString());
            hashMap.put("expectMd5", cVar.f340413c);
            hashMap.put("actualMd5", cVar.f340414d);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.f340445g);
            hashMap.put("startTime", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(this.f340445g);
            sb6.append(cVar.f340412b);
            hashMap.put("endTime", sb6.toString());
            C114361u.m160481a();
            new ReportEvent("mapload-configfile", hashMap);
        }
    }

    /* renamed from: a */
    public final void mo172142a(long j, String str) {
        if (this.f340406f == null) {
            this.f340406f = new C113784a(mo172171r());
        }
        C113784a aVar = this.f340406f;
        if (aVar.f340408b == null) {
            aVar.f340408b = new CopyOnWriteArraySet();
        }
        if (this.f340406f.f340408b.size() <= 9) {
            C113787d dVar = new C113787d(this.f340445g);
            dVar.f340418b = j - this.f340445g;
            dVar.f340417a = str;
            this.f340406f.f340408b.add(dVar);
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f340445g);
            hashMap.put("startTime", sb.toString());
            hashMap.put("endTime", String.valueOf(j));
            C114361u.m160481a();
            new ReportEvent("mapload-missfile", hashMap);
        }
    }
}
