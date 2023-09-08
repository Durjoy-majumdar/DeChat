package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import android.util.Pair;
import com.tencent.mapsdk.internal.C113905ky;
import com.tencent.xweb.file.XVFSFile;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.mapsdk.internal.kq */
public final class C113896kq implements C0950kp {

    /* renamed from: Y */
    private static final HashSet<String> f340734Y = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public static final C113905ky.C113916g<C113898a> f340735Z = C113905ky.m157771a(30, new C113905ky.C113914e<C113898a>() {
        /* renamed from: b */
        private static C113898a m157688b() {
            return new C113898a();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo172330a() {
            return new C113898a();
        }
    });
    /* access modifiers changed from: private */

    /* renamed from: aa */
    public static final AtomicInteger f340736aa = new AtomicInteger();

    /* renamed from: ab */
    private static final Map<String, Map<String, C113900c>> f340737ab = Collections.synchronizedMap(new Hashtable());

    /* renamed from: ac */
    private static Pair<String, StringBuilder> f340738ac;

    /* renamed from: com.tencent.mapsdk.internal.kq$b */
    public interface C113899b {
        /* renamed from: a */
        void mo172333a();
    }

    static {
        m157679g(C0949kl.f2246p);
        m157679g(C0949kl.f2232b);
        m157679g(C0949kl.f2248r);
        m157679g(C0949kl.f2250t);
    }

    /* renamed from: d */
    private static boolean m157672d() {
        return C113889km.m157556d(C0949kl.f2234d);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.tencent.mapsdk.internal.kq$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m157673e(java.lang.String r3, java.lang.String r4) {
        /*
            boolean r0 = m157681h(r3)
            r1 = -1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = m157681h(r3)
            if (r0 == 0) goto L_0x003a
            r0 = 0
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mapsdk.internal.kq$c>> r2 = f340737ab
            java.lang.Object r2 = r2.get(r3)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L_0x0020
            java.lang.Object r3 = r2.get(r3)
            r0 = r3
            com.tencent.mapsdk.internal.kq$c r0 = (com.tencent.mapsdk.internal.C113896kq.C113900c) r0
        L_0x0020:
            if (r0 == 0) goto L_0x003a
            java.lang.Object r3 = r0.mo172337b((java.lang.String) r4)
            boolean r1 = r3 instanceof java.util.concurrent.atomic.AtomicInteger
            if (r1 == 0) goto L_0x0031
            java.util.concurrent.atomic.AtomicInteger r3 = (java.util.concurrent.atomic.AtomicInteger) r3
            int r3 = r3.incrementAndGet()
            return r3
        L_0x0031:
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r3.<init>(r1)
            r0.mo172335a((java.lang.String) r4, (java.lang.Object) r3)
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113896kq.m157673e(java.lang.String, java.lang.String):int");
    }

    /* renamed from: f */
    public static long m157676f(String str, String str2) {
        if (!m157681h(str)) {
            return 0;
        }
        C113900c i = m157682i(str, str2);
        if (i != null) {
            i.f340747g = "End";
        }
        long a = m157645a(i);
        if (a != -1) {
            f340737ab.remove(str);
        }
        return a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.tencent.mapsdk.internal.kq$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m157678g(java.lang.String r3, java.lang.String r4) {
        /*
            boolean r0 = m157681h(r3)
            r1 = -1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = m157681h(r3)
            if (r0 == 0) goto L_0x0038
            r0 = 0
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mapsdk.internal.kq$c>> r2 = f340737ab
            java.lang.Object r2 = r2.get(r3)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L_0x0020
            java.lang.Object r3 = r2.get(r3)
            r0 = r3
            com.tencent.mapsdk.internal.kq$c r0 = (com.tencent.mapsdk.internal.C113896kq.C113900c) r0
        L_0x0020:
            if (r0 == 0) goto L_0x0038
            java.lang.Object r3 = r0.mo172337b((java.lang.String) r4)
            boolean r4 = r3 instanceof java.util.concurrent.atomic.AtomicInteger
            if (r4 == 0) goto L_0x0038
            java.util.concurrent.atomic.AtomicInteger r3 = (java.util.concurrent.atomic.AtomicInteger) r3
            int r4 = r3.decrementAndGet()
            r0 = 0
            if (r4 >= 0) goto L_0x0037
            r3.set(r0)
            r4 = 0
        L_0x0037:
            return r4
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113896kq.m157678g(java.lang.String, java.lang.String):int");
    }

    /* renamed from: h */
    private static boolean m157681h(String str) {
        return C113889km.m157556d(C0949kl.f2234d) && !f340734Y.contains(str);
    }

    /* renamed from: i */
    private static C113900c m157682i(String str, String str2) {
        Map map = f340737ab.get(str);
        C113900c cVar = map != null ? (C113900c) map.get(str2) : null;
        if (cVar == null || !cVar.mo172336a(str2)) {
            return null;
        }
        return cVar;
    }

    /* renamed from: i */
    private static String m157683i(String str) {
        return str;
    }

    /* renamed from: j */
    private static boolean m157685j(String str, String str2) {
        return m157682i(str, str2) != null;
    }

    /* renamed from: k */
    private static void m157686k(String str) {
        String d = C113891ko.m157604d();
        Pair<String, StringBuilder> pair = f340738ac;
        if (pair != null && !((String) pair.first).equals(d)) {
            m157675e();
        }
        if (f340738ac == null) {
            f340738ac = new Pair<>(d, new StringBuilder());
        }
        Pair<String, StringBuilder> pair2 = f340738ac;
        StringBuilder sb = (StringBuilder) pair2.second;
        synchronized (pair2) {
            sb.append(System.currentTimeMillis());
            sb.append(" : ");
            sb.append(str);
        }
        if (sb.length() >= 10240) {
            C113889km.m157562f(C0949kl.f2234d, sb.toString());
            f340738ac = null;
        }
    }

    /* renamed from: l */
    private static String m157687l(String str) {
        return str;
    }

    /* renamed from: com.tencent.mapsdk.internal.kq$a */
    public static class C113898a implements C113905ky.C113917h {

        /* renamed from: a */
        public int f340739a = 3;

        /* renamed from: b */
        public String f340740b = C0949kl.f2234d;

        /* renamed from: a */
        private C113898a m157692a(String str) {
            C113896kq.f340736aa.incrementAndGet();
            this.f340740b = str;
            return this;
        }

        /* renamed from: a */
        private C113898a m157691a(int i) {
            C113896kq.f340736aa.incrementAndGet();
            this.f340739a = i;
            return this;
        }

        /* renamed from: a */
        public final void mo172332a(Object... objArr) {
            C113896kq.f340736aa.incrementAndGet();
            C113896kq.m157662b(this.f340739a, this.f340740b, objArr);
            C113896kq.f340735Z.mo172344a(this);
        }

        /* renamed from: a */
        public final C113905ky.C113923l mo172331a() {
            return new C113905ky.C113913d();
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.kq$c */
    public static class C113900c {

        /* renamed from: a */
        public AtomicInteger f340741a;

        /* renamed from: b */
        public String f340742b;

        /* renamed from: c */
        public List<Long> f340743c = new CopyOnWriteArrayList();

        /* renamed from: d */
        public C113899b f340744d;

        /* renamed from: e */
        public Map<String, Object> f340745e;

        /* renamed from: f */
        public String f340746f;

        /* renamed from: g */
        public String f340747g;

        /* renamed from: h */
        private String f340748h;

        public C113900c(String str, String str2) {
            this.f340748h = str;
            this.f340742b = str2;
            this.f340741a = new AtomicInteger(0);
        }

        public final String toString() {
            return "TraceInfo{id='" + this.f340742b + '\'' + ", values=" + this.f340745e + '}';
        }

        /* renamed from: b */
        public final Object mo172337b(String str) {
            Map<String, Object> map = this.f340745e;
            if (map != null) {
                return map.get(str);
            }
            return null;
        }

        /* renamed from: a */
        public final boolean mo172336a(String str) {
            return this.f340742b.equals(str);
        }

        /* renamed from: a */
        public final String mo172334a() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            if (!TextUtils.isEmpty(this.f340747g)) {
                sb.append(this.f340747g);
            }
            if (!this.f340748h.equals(this.f340742b)) {
                sb.append("|");
                sb.append(this.f340748h);
                sb.append("|");
                sb.append(this.f340742b);
            } else {
                sb.append("|");
                sb.append(this.f340748h);
            }
            if (!TextUtils.isEmpty(this.f340746f)) {
                sb.append("|");
                sb.append(this.f340746f);
            }
            sb.append("]");
            return sb.toString();
        }

        /* renamed from: b */
        public final void mo172338b() {
            this.f340741a.set(0);
            this.f340743c.clear();
            this.f340744d = null;
            Map<String, Object> map = this.f340745e;
            if (map != null) {
                map.clear();
            }
        }

        /* renamed from: a */
        public final void mo172335a(String str, Object obj) {
            if (!TextUtils.isEmpty(str)) {
                if (this.f340745e == null) {
                    this.f340745e = new Hashtable();
                }
                this.f340745e.put(str, obj);
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0063 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069 A[Catch:{ GeneralSecurityException -> 0x006e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m157649a(java.lang.String r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0070
            boolean r0 = com.tencent.mapsdk.internal.C114207sl.f341932d
            if (r0 == 0) goto L_0x000b
            goto L_0x0070
        L_0x000b:
            r0 = 0
            java.io.File r1 = new java.io.File
            java.lang.String r2 = com.tencent.mapsdk.internal.C113889km.m157533a()
            java.lang.String r3 = "kv"
            r1.<init>(r2, r3)
            java.util.List r1 = com.tencent.mapsdk.internal.C113884kf.m157505d(r1)
            if (r1 == 0) goto L_0x0038
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0038
            r2 = 0
            java.lang.Object r4 = r1.get(r2)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0031
            goto L_0x0038
        L_0x0031:
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0063
        L_0x0038:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.tencent.mapsdk.internal.C113798hb.m157068a()
            r1.append(r2)
            java.lang.String r2 = com.tencent.mapsdk.internal.C114207sl.f341938j
            r1.append(r2)
            int r2 = com.tencent.mapsdk.internal.C114207sl.f341937i
            r1.append(r2)
            java.lang.String r2 = com.tencent.mapsdk.internal.C114207sl.f341931c
            r1.append(r2)
            java.lang.String r2 = com.tencent.mapsdk.internal.C114207sl.f341930b
            r1.append(r2)
            java.lang.String r1 = r1.toString()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException -> 0x0063 }
            java.lang.String r0 = com.tencent.mapsdk.internal.C80347kr.m97860a((java.lang.String) r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException -> 0x0063 }
            com.tencent.mapsdk.internal.C113889km.m157562f((java.lang.String) r3, (java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException -> 0x0063 }
        L_0x0063:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ GeneralSecurityException -> 0x006e }
            if (r1 != 0) goto L_0x006e
            java.lang.String r5 = com.tencent.mapsdk.internal.C80347kr.m97861a(r0, r5)     // Catch:{ GeneralSecurityException -> 0x006e }
            return r5
        L_0x006e:
            java.lang.String r5 = ""
        L_0x0070:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113896kq.m157649a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static void m157663b(String str) {
        if (m157681h(str)) {
            m157654a(str, str, (C113899b) null);
        }
    }

    /* renamed from: c */
    public static void m157668c(String str) {
        if (m157681h(str)) {
            m157654a(str, str, (C113899b) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.tencent.mapsdk.internal.kq$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m157669d(java.lang.String r3, java.lang.String r4) {
        /*
            boolean r0 = m157681h(r3)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = m157681h(r3)
            if (r0 == 0) goto L_0x0031
            r0 = 0
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mapsdk.internal.kq$c>> r2 = f340737ab
            java.lang.Object r2 = r2.get(r3)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L_0x0020
            java.lang.Object r3 = r2.get(r3)
            r0 = r3
            com.tencent.mapsdk.internal.kq$c r0 = (com.tencent.mapsdk.internal.C113896kq.C113900c) r0
        L_0x0020:
            if (r0 == 0) goto L_0x0031
            java.lang.Object r3 = r0.mo172337b((java.lang.String) r4)
            boolean r4 = r3 instanceof java.util.concurrent.atomic.AtomicInteger
            if (r4 == 0) goto L_0x0031
            java.util.concurrent.atomic.AtomicInteger r3 = (java.util.concurrent.atomic.AtomicInteger) r3
            int r3 = r3.get()
            return r3
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113896kq.m157669d(java.lang.String, java.lang.String):int");
    }

    /* renamed from: h */
    private static long m157680h(String str, String str2) {
        if (!m157681h(str)) {
            return 0;
        }
        return m157646a(str, str, str2, "", (Object) null);
    }

    /* renamed from: j */
    private static boolean m157684j(String str) {
        return m157682i(str, str) != null;
    }

    /* renamed from: b */
    public static void m157664b(String str, String str2) {
        if (m157681h(str)) {
            m157654a(str, str2, (C113899b) null);
        }
    }

    /* renamed from: c */
    public static Object m157667c(String str, String str2) {
        if (m157681h(str) && m157681h(str)) {
            Map map = f340737ab.get(str);
            C113900c cVar = map != null ? (C113900c) map.get(str) : null;
            if (cVar != null) {
                return cVar.mo172337b(str2);
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.tencent.mapsdk.internal.kq$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m157659b(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            boolean r0 = m157681h(r3)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 0
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mapsdk.internal.kq$c>> r2 = f340737ab
            java.lang.Object r3 = r2.get(r3)
            java.util.Map r3 = (java.util.Map) r3
            if (r3 == 0) goto L_0x001a
            java.lang.Object r3 = r3.get(r4)
            r0 = r3
            com.tencent.mapsdk.internal.kq$c r0 = (com.tencent.mapsdk.internal.C113896kq.C113900c) r0
        L_0x001a:
            if (r0 == 0) goto L_0x002b
            java.lang.Object r3 = r0.mo172337b((java.lang.String) r5)
            boolean r4 = r3 instanceof java.util.concurrent.atomic.AtomicInteger
            if (r4 == 0) goto L_0x002b
            java.util.concurrent.atomic.AtomicInteger r3 = (java.util.concurrent.atomic.AtomicInteger) r3
            int r3 = r3.get()
            return r3
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113896kq.m157659b(java.lang.String, java.lang.String, java.lang.String):int");
    }

    /* renamed from: f */
    public static C113898a m157677f(String str) {
        f340736aa.incrementAndGet();
        C113898a a = f340735Z.mo172343a();
        a.f340740b = str;
        return a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.tencent.mapsdk.internal.kq$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m157665c(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            boolean r0 = m157681h(r3)
            r1 = -1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 0
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mapsdk.internal.kq$c>> r2 = f340737ab
            java.lang.Object r3 = r2.get(r3)
            java.util.Map r3 = (java.util.Map) r3
            if (r3 == 0) goto L_0x001a
            java.lang.Object r3 = r3.get(r4)
            r0 = r3
            com.tencent.mapsdk.internal.kq$c r0 = (com.tencent.mapsdk.internal.C113896kq.C113900c) r0
        L_0x001a:
            if (r0 == 0) goto L_0x0035
            java.lang.Object r3 = r0.mo172337b((java.lang.String) r5)
            boolean r4 = r3 instanceof java.util.concurrent.atomic.AtomicInteger
            if (r4 == 0) goto L_0x002b
            java.util.concurrent.atomic.AtomicInteger r3 = (java.util.concurrent.atomic.AtomicInteger) r3
            int r3 = r3.incrementAndGet()
            return r3
        L_0x002b:
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r4 = 1
            r3.<init>(r4)
            r0.mo172335a((java.lang.String) r5, (java.lang.Object) r3)
            return r4
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113896kq.m157665c(java.lang.String, java.lang.String, java.lang.String):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.tencent.mapsdk.internal.kq$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m157670d(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            boolean r0 = m157681h(r3)
            r1 = -1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 0
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mapsdk.internal.kq$c>> r2 = f340737ab
            java.lang.Object r3 = r2.get(r3)
            java.util.Map r3 = (java.util.Map) r3
            if (r3 == 0) goto L_0x001a
            java.lang.Object r3 = r3.get(r4)
            r0 = r3
            com.tencent.mapsdk.internal.kq$c r0 = (com.tencent.mapsdk.internal.C113896kq.C113900c) r0
        L_0x001a:
            if (r0 == 0) goto L_0x0032
            java.lang.Object r3 = r0.mo172337b((java.lang.String) r5)
            boolean r4 = r3 instanceof java.util.concurrent.atomic.AtomicInteger
            if (r4 == 0) goto L_0x0032
            java.util.concurrent.atomic.AtomicInteger r3 = (java.util.concurrent.atomic.AtomicInteger) r3
            int r4 = r3.decrementAndGet()
            r5 = 0
            if (r4 >= 0) goto L_0x0031
            r3.set(r5)
            r4 = 0
        L_0x0031:
            return r4
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113896kq.m157670d(java.lang.String, java.lang.String, java.lang.String):int");
    }

    /* renamed from: e */
    public static long m157674e(String str) {
        if (m157681h(str) && m157681h(str)) {
            return m157646a(str, str, str, "", (Object) null);
        }
        return 0;
    }

    /* renamed from: g */
    public static void m157679g(String str) {
        f340734Y.add(str);
    }

    /* renamed from: b */
    public static long m157660b(String str, String str2, Object obj) {
        if (!m157681h(str)) {
            return 0;
        }
        return m157646a(str, str, "", str2, obj);
    }

    /* renamed from: e */
    private static void m157675e() {
        Object obj;
        Pair<String, StringBuilder> pair = f340738ac;
        if (pair != null && (obj = pair.second) != null && ((StringBuilder) obj).length() != 0) {
            String d = C113891ko.m157604d();
            Pair<String, StringBuilder> pair2 = f340738ac;
            StringBuilder sb = (StringBuilder) pair2.second;
            String str = C0949kl.f2234d;
            if (!((String) pair2.first).equals(d)) {
                str = "TT-" + ((String) f340738ac.first);
            }
            synchronized (f340738ac) {
                sb.append("\n ============= \n");
            }
            C113889km.m157562f(str, sb.toString());
            f340738ac = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m157662b(int i, String str, Object... objArr) {
        if (C113889km.m157556d(C0949kl.f2234d)) {
            if (f340734Y.contains(str)) {
                f340736aa.set(0);
                return;
            }
            Thread currentThread = Thread.currentThread();
            StackTraceElement[] stackTrace = currentThread.getStackTrace();
            if (stackTrace != null) {
                int length = stackTrace.length;
                AtomicInteger atomicInteger = f340736aa;
                if (length > atomicInteger.get() + 3) {
                    StackTraceElement stackTraceElement = stackTrace[atomicInteger.get() + 3];
                    atomicInteger.set(0);
                    StringBuilder sb = new StringBuilder();
                    Class[] clsArr = null;
                    try {
                        Method[] declaredMethods = Class.forName(stackTraceElement.getClassName()).getDeclaredMethods();
                        int length2 = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length2) {
                                break;
                            }
                            Method method = declaredMethods[i2];
                            if (method.getName().equals(stackTraceElement.getMethodName())) {
                                clsArr = method.getParameterTypes();
                                break;
                            }
                            i2++;
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                    if (stackTraceElement.isNativeMethod()) {
                        sb.append("(Native Method)");
                    } else if (stackTraceElement.getFileName() != null) {
                        if (stackTraceElement.getLineNumber() >= 0) {
                            sb.append("(");
                            sb.append(stackTraceElement.getFileName());
                            sb.append(XVFSFile.PATH_SEPARATOR);
                            sb.append(stackTraceElement.getLineNumber());
                            sb.append(")");
                        } else {
                            sb.append("(");
                            sb.append(stackTraceElement.getFileName());
                            sb.append(")");
                        }
                    } else if (stackTraceElement.getLineNumber() >= 0) {
                        sb.append("(Unknown Source:");
                        sb.append(stackTraceElement.getLineNumber());
                        sb.append(")");
                    } else {
                        sb.append("(Unknown Source)");
                    }
                    sb.append("==");
                    sb.append(currentThread.getName());
                    sb.append(XVFSFile.PATH_SEPARATOR);
                    sb.append(currentThread.getId());
                    sb.append("==");
                    sb.append("#");
                    sb.append(stackTraceElement.getMethodName());
                    sb.append("(");
                    if (clsArr != null && clsArr.length > 0) {
                        int i3 = 0;
                        for (Class simpleName : clsArr) {
                            sb.append(simpleName.getSimpleName());
                            if (i3 != clsArr.length - 1) {
                                sb.append(",");
                            }
                            i3++;
                        }
                    }
                    sb.append(")");
                    StringBuilder sb4 = new StringBuilder();
                    int i4 = 0;
                    for (Object append : objArr) {
                        i4++;
                        sb4.append("[");
                        sb4.append(i4);
                        sb4.append("] ");
                        sb4.append(append);
                    }
                    if (i4 > 0) {
                        sb.append(sb4);
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = C0949kl.f2234d;
                    }
                    if (i == 2) {
                        C113889km.m157538a(str, sb.toString());
                    } else if (i == 3) {
                        C113889km.m157545b(str, sb.toString());
                    } else if (i == 4) {
                        C113889km.m157550c(str, sb.toString());
                    } else if (i == 5) {
                        C113889km.m157553d(str, sb.toString());
                    } else if (i == 6) {
                        C113889km.m157558e(str, sb.toString());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m157653a(String str, String str2) {
        if (m157681h(str)) {
            m157654a(str, str2, (C113899b) null);
        }
    }

    /* renamed from: d */
    public static long m157671d(String str) {
        if (!m157681h(str)) {
            return 0;
        }
        return m157676f(str, str);
    }

    /* renamed from: a */
    private static void m157652a(String str, C113899b bVar) {
        if (m157681h(str)) {
            m157654a(str, str, bVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.tencent.mapsdk.internal.kq$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m157654a(java.lang.String r3, java.lang.String r4, com.tencent.mapsdk.internal.C113896kq.C113899b r5) {
        /*
            boolean r0 = m157681h(r3)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mapsdk.internal.kq$c>> r0 = f340737ab
            java.lang.Object r1 = r0.get(r3)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x0022
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.tencent.mapsdk.internal.kq$c r2 = new com.tencent.mapsdk.internal.kq$c
            r2.<init>(r3, r4)
            r1.put(r4, r2)
            r0.put(r3, r1)
            goto L_0x0037
        L_0x0022:
            java.lang.Object r0 = r1.get(r4)
            r2 = r0
            com.tencent.mapsdk.internal.kq$c r2 = (com.tencent.mapsdk.internal.C113896kq.C113900c) r2
            if (r2 != 0) goto L_0x0034
            com.tencent.mapsdk.internal.kq$c r2 = new com.tencent.mapsdk.internal.kq$c
            r2.<init>(r3, r4)
            r1.put(r4, r2)
            goto L_0x0037
        L_0x0034:
            r2.mo172338b()
        L_0x0037:
            r2.f340742b = r4
            r2.f340744d = r5
            java.util.List<java.lang.Long> r3 = r2.f340743c
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.add(r4)
            java.lang.String r3 = "Begin"
            r2.f340747g = r3
            m157645a((com.tencent.mapsdk.internal.C113896kq.C113900c) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113896kq.m157654a(java.lang.String, java.lang.String, com.tencent.mapsdk.internal.kq$b):void");
    }

    /* renamed from: a */
    public static void m157655a(String str, String str2, Object obj) {
        if (m157681h(str)) {
            m157656a(str, str, str2, obj);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.tencent.mapsdk.internal.kq$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m157656a(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.Object r5) {
        /*
            boolean r0 = m157681h(r2)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 0
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mapsdk.internal.kq$c>> r1 = f340737ab
            java.lang.Object r2 = r1.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L_0x0019
            java.lang.Object r2 = r2.get(r3)
            r0 = r2
            com.tencent.mapsdk.internal.kq$c r0 = (com.tencent.mapsdk.internal.C113896kq.C113900c) r0
        L_0x0019:
            if (r0 == 0) goto L_0x004a
            r0.mo172335a((java.lang.String) r4, (java.lang.Object) r5)
            java.lang.String r2 = "Set"
            r0.f340747g = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.mo172334a()
            r2.append(r3)
            java.lang.String r3 = ":"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = "=>"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = "\n"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            m157686k(r2)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113896kq.m157656a(java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void");
    }

    /* renamed from: a */
    private static Object m157648a(String str, String str2, String str3) {
        if (!m157681h(str)) {
            return null;
        }
        Map map = f340737ab.get(str);
        C113900c cVar = map != null ? (C113900c) map.get(str2) : null;
        if (cVar != null) {
            return cVar.mo172337b(str3);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.tencent.mapsdk.internal.kq$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m157644a(java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6) {
        /*
            boolean r0 = m157681h(r3)
            r1 = -1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 0
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mapsdk.internal.kq$c>> r2 = f340737ab
            java.lang.Object r3 = r2.get(r3)
            java.util.Map r3 = (java.util.Map) r3
            if (r3 == 0) goto L_0x001a
            java.lang.Object r3 = r3.get(r4)
            r0 = r3
            com.tencent.mapsdk.internal.kq$c r0 = (com.tencent.mapsdk.internal.C113896kq.C113900c) r0
        L_0x001a:
            if (r0 == 0) goto L_0x003b
            java.lang.Object r3 = r0.mo172337b((java.lang.String) r5)
            boolean r4 = r3 instanceof java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            if (r4 == 0) goto L_0x0033
            if (r6 > 0) goto L_0x0028
            r6 = 1
        L_0x0028:
            java.util.concurrent.atomic.AtomicInteger r3 = (java.util.concurrent.atomic.AtomicInteger) r3
            int r4 = r3.get()
            int r4 = r4 + r6
            r3.set(r4)
            return r4
        L_0x0033:
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r3.<init>(r1)
            r0.mo172335a((java.lang.String) r5, (java.lang.Object) r3)
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113896kq.m157644a(java.lang.String, java.lang.String, java.lang.String, int):int");
    }

    /* renamed from: a */
    private static long m157646a(String str, String str2, String str3, String str4, Object obj) {
        if (!m157681h(str)) {
            return 0;
        }
        m157656a(str, str2, str4, obj);
        C113900c i = m157682i(str, str2);
        if (i != null) {
            i.f340747g = "Log";
            i.f340741a.incrementAndGet();
            i.f340746f = str3;
            i.f340743c.add(Long.valueOf(System.currentTimeMillis()));
        }
        return m157645a(i);
    }

    /* renamed from: a */
    private static long m157645a(C113900c cVar) {
        long j;
        long j2 = -1;
        if (cVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (cVar.f340743c.size() > 0) {
                j2 = currentTimeMillis - cVar.f340743c.get(0).longValue();
                List<Long> list = cVar.f340743c;
                j = currentTimeMillis - list.get(list.size() - 1).longValue();
            } else {
                j = -1;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.mo172334a());
            sb.append("\n");
            if (cVar.f340741a.get() != 0) {
                sb.append("idx:");
                sb.append(cVar.f340741a.get());
                sb.append("\n");
            }
            if (j2 > 0) {
                sb.append("ut:");
                sb.append(j2);
                sb.append("ms\n");
            }
            if (j > 0) {
                sb.append("it:");
                sb.append(j);
                sb.append("ms\n");
            }
            Map<String, Object> map = cVar.f340745e;
            if (map != null && !map.isEmpty()) {
                sb.append("val:");
                sb.append(cVar.f340745e);
                sb.append("\n");
            }
            String sb4 = sb.toString();
            C113889km.m157550c(C0949kl.f2234d, sb4);
            m157686k(sb4);
        }
        return j2;
    }

    /* renamed from: a */
    private static C113898a m157647a(int i) {
        f340736aa.incrementAndGet();
        C113898a a = f340735Z.mo172343a();
        a.f340739a = i;
        return a;
    }

    /* renamed from: a */
    private static void m157657a(Throwable th) {
        if (th != null) {
            StringBuilder sb = new StringBuilder();
            try {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                    cause.printStackTrace(printWriter);
                }
                printWriter.close();
                sb.append(stringWriter.toString());
                sb.append("\n =============== ");
            } catch (Throwable unused) {
            }
            C113889km.m157562f("CRASH", sb.toString());
        }
    }

    /* renamed from: a */
    public static void m157650a() {
        m157675e();
    }

    /* renamed from: a */
    public static void m157658a(Object... objArr) {
        if (C113889km.m157556d(C0949kl.f2234d)) {
            f340736aa.incrementAndGet();
            m157662b(3, C0949kl.f2234d, objArr);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.tencent.mapsdk.internal.kq$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m157643a(java.lang.String r3, java.lang.String r4, int r5) {
        /*
            boolean r0 = m157681h(r3)
            if (r0 == 0) goto L_0x003a
            r0 = 0
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mapsdk.internal.kq$c>> r1 = f340737ab
            java.lang.Object r1 = r1.get(r3)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x0018
            java.lang.Object r3 = r1.get(r3)
            r0 = r3
            com.tencent.mapsdk.internal.kq$c r0 = (com.tencent.mapsdk.internal.C113896kq.C113900c) r0
        L_0x0018:
            if (r0 == 0) goto L_0x003a
            java.lang.Object r3 = r0.mo172337b((java.lang.String) r4)
            boolean r1 = r3 instanceof java.util.concurrent.atomic.AtomicInteger
            r2 = 1
            if (r1 == 0) goto L_0x0031
            if (r5 > 0) goto L_0x0026
            r5 = 1
        L_0x0026:
            java.util.concurrent.atomic.AtomicInteger r3 = (java.util.concurrent.atomic.AtomicInteger) r3
            int r4 = r3.get()
            int r4 = r4 + r5
            r3.set(r4)
            return r4
        L_0x0031:
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r3.<init>(r2)
            r0.mo172335a((java.lang.String) r4, (java.lang.Object) r3)
            return r2
        L_0x003a:
            r3 = -1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113896kq.m157643a(java.lang.String, java.lang.String, int):int");
    }
}
