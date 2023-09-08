package com.tencent.p014mm.plugin.appbrand.appstorage;

import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.g0 */
public interface C81414g0 {

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.g0$a */
    public enum C29326a {
        NONE,
        UNKNOWN,
        MISSING_PARAMS,
        NO_SUCH_KEY,
        QUOTA_REACHED,
        MEMORY_ISSUE,
        VALUE_PROCESS_FAIL
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.g0$b */
    public static class C29327b {

        /* renamed from: a */
        public String f80075a;

        /* renamed from: b */
        public String f80076b;

        /* renamed from: c */
        public String f80077c;

        public C29327b(String str, String str2, String str3) {
            this.f80075a = str;
            this.f80076b = str2;
            this.f80077c = str3;
        }
    }

    /* renamed from: Bh */
    Object[] mo56588Bh(int i, String str);

    /* renamed from: Bk */
    int mo56589Bk(String str);

    /* renamed from: S */
    void mo56590S(int i, String str);

    /* renamed from: T0 */
    C29326a mo56591T0(int i, String str, List<C29327b> list);

    /* renamed from: cg */
    C29326a mo56593cg(int i, String str, String str2);

    /* renamed from: g5 */
    List<Object[]> mo56594g5(int i, String str, List<String> list);

    /* renamed from: j0 */
    C29326a mo56595j0(int i, String str, String str2, String str3, String str4);

    /* renamed from: xf */
    Object[] mo56596xf(int i, String str, String str2);
}
