package com.tencent.p014mm.plugin.appbrand.performance;

import java.net.URLEncoder;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.performance.d */
public class C83997d {

    /* renamed from: a */
    public static long f245230a;

    /* renamed from: b */
    public static final List<C83998a> f245231b = Collections.synchronizedList(new LinkedList());

    /* renamed from: com.tencent.mm.plugin.appbrand.performance.d$a */
    public static class C83998a {

        /* renamed from: a */
        public String f245232a;

        /* renamed from: b */
        public String f245233b;

        /* renamed from: c */
        public String f245234c;

        /* renamed from: d */
        public String f245235d;

        /* renamed from: e */
        public long f245236e;

        /* renamed from: f */
        public long f245237f;

        /* renamed from: g */
        public String f245238g;

        public String toString() {
            return this.f245235d + "," + this.f245233b + "," + this.f245234c + "," + (this.f245236e - C83997d.f245230a) + "," + (this.f245237f - C83997d.f245230a) + "," + this.f245238g;
        }
    }

    /* renamed from: a */
    public static void m103518a(String str, String str2, String str3, long j, long j2, String str4) {
        m103520c(str, str2, str3, "X", j, j2, str4);
    }

    /* renamed from: b */
    public static void m103519b(String str, String str2, String str3, double d) {
        long currentTimeMillis = System.currentTimeMillis();
        m103520c(str, str2, str3, "C", currentTimeMillis, currentTimeMillis, String.format("{\"%s\":%f}", new Object[]{str3, Double.valueOf(d)}));
    }

    /* renamed from: c */
    public static void m103520c(String str, String str2, String str3, String str4, long j, long j2, String str5) {
        C83998a aVar = new C83998a();
        aVar.f245232a = str;
        aVar.f245235d = str3;
        aVar.f245233b = str2;
        aVar.f245234c = str4;
        aVar.f245236e = j;
        aVar.f245237f = j2;
        aVar.f245238g = str5 != null ? URLEncoder.encode(str5) : "";
        List<C83998a> list = f245231b;
        if (list.size() < 10000) {
            list.add(aVar);
        }
    }

    /* renamed from: d */
    public static void m103521d(String str, String str2, long j, long j2) {
        m103518a(str, "Native", str2, j, j2, (String) null);
    }
}
