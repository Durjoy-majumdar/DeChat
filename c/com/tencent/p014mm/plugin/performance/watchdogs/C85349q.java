package com.tencent.p014mm.plugin.performance.watchdogs;

import com.tencent.xweb.XWebSdk;
import java.util.HashMap;
import java.util.Map;
import p757xv.C91350o;
import r70.C89892d;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.q */
public class C85349q {

    /* renamed from: a */
    public static final C85351b f248706a = new C85351b((C85350a) null);

    /* renamed from: b */
    public static boolean f248707b;

    /* renamed from: c */
    public static final C85352c f248708c = new C85352c((C85350a) null);

    /* renamed from: com.tencent.mm.plugin.performance.watchdogs.q$b */
    public static class C85351b implements C91350o {
        public C85351b(C85350a aVar) {
        }

        /* renamed from: a */
        public String mo116860a() {
            return null;
        }

        /* renamed from: b */
        public String mo116861b() {
            return null;
        }

        /* renamed from: c */
        public String mo116862c() {
            return String.valueOf(XWebSdk.getXWebSdkVersion());
        }

        /* renamed from: d */
        public String mo116863d() {
            return null;
        }

        /* renamed from: e */
        public String mo116864e() {
            return String.valueOf(0);
        }

        public Map<String, String> getExtra() {
            HashMap hashMap = new HashMap();
            hashMap.put("TbsVersion", String.valueOf(0));
            hashMap.put("XWalkSdkVersion", mo116862c());
            return hashMap;
        }

        public String getTag() {
            return "WebViewVer";
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.watchdogs.q$c */
    public static class C85352c implements C89892d.C89893a {
        public C85352c(C85350a aVar) {
        }
    }
}
