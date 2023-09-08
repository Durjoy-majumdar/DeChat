package com.tencent.p014mm.recoveryv2;

import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import p329d3.C106986f;

/* renamed from: com.tencent.mm.recoveryv2.k */
public final class C85692k {

    /* renamed from: com.tencent.mm.recoveryv2.k$a */
    public static class C85693a {

        /* renamed from: a */
        public static final List<C85694b> f249688a = new LinkedList();

        /* renamed from: a */
        public static void m105840a(int i, String str, String str2) {
            C85694b a = C85694b.f249689f.mo157419a();
            if (a == null) {
                a = new C85694b();
            }
            long currentTimeMillis = System.currentTimeMillis();
            String name = Thread.currentThread().getName();
            a.f249691a = i;
            a.f249692b = currentTimeMillis;
            a.f249693c = str;
            a.f249695e = name;
            a.f249694d = str2;
            synchronized (C85693a.class) {
                ((LinkedList) f249688a).add(a);
            }
        }
    }

    /* renamed from: com.tencent.mm.recoveryv2.k$b */
    public static class C85694b {

        /* renamed from: f */
        public static final C106986f<C85694b> f249689f = new C106986f<>(20);

        /* renamed from: g */
        public static final SimpleDateFormat f249690g = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);

        /* renamed from: a */
        public int f249691a;

        /* renamed from: b */
        public long f249692b;

        /* renamed from: c */
        public String f249693c;

        /* renamed from: d */
        public String f249694d;

        /* renamed from: e */
        public String f249695e;

        /* renamed from: a */
        public String mo119280a() {
            StringBuilder sb = new StringBuilder();
            sb.append(f249690g.format(Long.valueOf(this.f249692b)));
            sb.append("  ");
            int i = this.f249691a;
            sb.append(i != 4 ? i != 5 ? "UNKNOWN" : "WARN" : "INFO");
            sb.append("/");
            sb.append(this.f249693c);
            sb.append("  ");
            sb.append("[");
            sb.append(this.f249695e);
            sb.append("]  ");
            sb.append(this.f249694d);
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static void m105839a(String str, String str2, Throwable th) {
        C85693a.m105840a(5, str, str2 + " : " + Log.getStackTraceString(th));
    }
}
