package com.tencent.p014mm.plugin.appbrand.appcache;

import java.io.InputStream;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.o0 */
public interface C81298o0 {

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.o0$a */
    public static class C81299a {

        /* renamed from: a */
        public String f238716a;

        /* renamed from: b */
        public int f238717b;

        /* renamed from: c */
        public String f238718c;

        /* renamed from: d */
        public WxaPkg f238719d;

        /* renamed from: e */
        public String f238720e;

        /* renamed from: f */
        public String f238721f;

        /* renamed from: g */
        public int f238722g;

        /* renamed from: h */
        public int f238723h;
    }

    /* renamed from: a */
    List<ModulePkgInfo> mo113497a();

    /* renamed from: b */
    WxaPkg mo113498b(String str);

    /* renamed from: c */
    boolean mo113499c(String str, boolean z);

    void close();

    /* renamed from: d */
    boolean mo113501d(String str);

    /* renamed from: e */
    List<String> mo113502e();

    /* renamed from: g */
    InputStream mo113504g(String str);

    /* renamed from: h */
    void mo113505h();

    C81299a openReadPartialInfo(String str);
}
