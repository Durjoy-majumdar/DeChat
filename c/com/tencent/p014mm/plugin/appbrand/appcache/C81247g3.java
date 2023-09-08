package com.tencent.p014mm.plugin.appbrand.appcache;

import android.text.TextUtils;
import android.webkit.URLUtil;
import android.webkit.WebResourceResponse;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appcache.C81298o0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81364t3;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.MimeTypeUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import js0.C88016e;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.g3 */
public final class C81247g3 implements C81301p0, C81364t3.C81366b {

    /* renamed from: f */
    public static final Map<AppBrandRuntime, C81247g3> f238648f = new HashMap();

    /* renamed from: a */
    public final C81298o0 f238649a;

    /* renamed from: b */
    public final String f238650b;

    /* renamed from: c */
    public final AppBrandRuntime f238651c;

    /* renamed from: d */
    public final LinkedList<String> f238652d;

    /* renamed from: e */
    public boolean f238653e = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.g3$b */
    public static final class C81249b implements C81250c<byte[]> {
        public C81249b(C81248a aVar) {
        }

        /* renamed from: a */
        public Object mo113508a(String str, InputStream inputStream) {
            return C88016e.m109545b(inputStream);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.g3$c */
    public interface C81250c<T> {

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.g3$c$a */
        public static class C81251a {

            /* renamed from: a */
            public static final Map<Class, C81250c> f238654a;

            static {
                HashMap hashMap = new HashMap();
                f238654a = hashMap;
                hashMap.put(InputStream.class, new C81252d((C81248a) null));
                hashMap.put(WebResourceResponse.class, new C81254f((C81248a) null));
                hashMap.put(String.class, new C81253e((C81248a) null));
                hashMap.put(byte[].class, new C81249b((C81248a) null));
            }
        }

        /* renamed from: a */
        T mo113508a(String str, InputStream inputStream);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.g3$d */
    public static final class C81252d implements C81250c<InputStream> {
        public C81252d(C81248a aVar) {
        }

        /* renamed from: a */
        public Object mo113508a(String str, InputStream inputStream) {
            return inputStream;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.g3$e */
    public static final class C81253e implements C81250c<String> {
        public C81253e(C81248a aVar) {
        }

        /* renamed from: a */
        public Object mo113508a(String str, InputStream inputStream) {
            return C88016e.m109547d(inputStream);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.g3$f */
    public static final class C81254f implements C81250c<WebResourceResponse> {
        public C81254f(C81248a aVar) {
        }

        /* renamed from: a */
        public Object mo113508a(String str, InputStream inputStream) {
            return new WebResourceResponse(MimeTypeUtil.getMimeTypeByFilePath(str), "UTF-8", inputStream);
        }
    }

    public C81247g3(AppBrandRuntime appBrandRuntime) {
        String str = appBrandRuntime.f238147j;
        this.f238650b = str;
        this.f238651c = appBrandRuntime;
        Log.m105925i("MicroMsg.WxaPkgRuntimeReader", "<init> appId[%s] sysConfig.class[%s], stacktrace=%s", str, appBrandRuntime.mo113051d0().getClass().getName(), android.util.Log.getStackTraceString(new Throwable()));
        LinkedList<String> linkedList = new LinkedList<>();
        this.f238652d = linkedList;
        if (!TextUtils.isEmpty("__plugin__/")) {
            linkedList.add("__plugin__/");
        }
        if (!TextUtils.isEmpty(WxaPluginPkgInfo.PREFIX_EXTENDED)) {
            linkedList.add(WxaPluginPkgInfo.PREFIX_EXTENDED);
        }
        C81364t3 t3Var = new C81364t3(appBrandRuntime, this);
        this.f238649a = t3Var;
        t3Var.mo113505h();
        this.f238653e = true;
    }

    /* renamed from: j */
    public static boolean m99554j(String str) {
        if (Util.isNullOrNil(str) || URLUtil.isAboutUrl(str)) {
            return true;
        }
        return (!Util.isNullOrNil(str) && (URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str))) || URLUtil.isFileUrl(str);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: k */
    public static com.tencent.p014mm.plugin.appbrand.appcache.C81301p0 m99555k(com.tencent.p014mm.plugin.appbrand.AppBrandRuntime r3, boolean r4) {
        /*
            if (r3 == 0) goto L_0x0064
            boolean r0 = r3.mo113064k0()
            if (r0 == 0) goto L_0x0009
            goto L_0x0064
        L_0x0009:
            wi0.l r0 = r3.mo113051d0()
            if (r0 != 0) goto L_0x002d
            java.lang.String r4 = "MicroMsg.WxaPkgRuntimeReader"
            java.lang.String r0 = "obtainReader with runtime(%s) sysConfig(NULL), stack=%s"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r3 = r3.f238147j
            r1[r2] = r3
            r3 = 1
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>()
            java.lang.String r2 = android.util.Log.getStackTraceString(r2)
            r1[r3] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r1)
            com.tencent.mm.plugin.appbrand.appcache.p0 r3 = com.tencent.p014mm.plugin.appbrand.appcache.C81301p0.C81302a.f238727a
            return r3
        L_0x002d:
            java.util.Map<com.tencent.mm.plugin.appbrand.AppBrandRuntime, com.tencent.mm.plugin.appbrand.appcache.g3> r0 = f238648f
            monitor-enter(r0)
            r1 = r0
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x0050 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x0050 }
            com.tencent.mm.plugin.appbrand.appcache.g3 r1 = (com.tencent.p014mm.plugin.appbrand.appcache.C81247g3) r1     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x003d
            if (r4 == 0) goto L_0x0060
        L_0x003d:
            if (r4 == 0) goto L_0x0055
            monitor-enter(r0)     // Catch:{ all -> 0x0050 }
            r4 = r0
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x0052 }
            java.lang.Object r4 = r4.remove(r3)     // Catch:{ all -> 0x0052 }
            com.tencent.mm.plugin.appbrand.appcache.g3 r4 = (com.tencent.p014mm.plugin.appbrand.appcache.C81247g3) r4     // Catch:{ all -> 0x0052 }
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            if (r4 == 0) goto L_0x0055
            r4.close()     // Catch:{ all -> 0x0050 }
            goto L_0x0055
        L_0x0050:
            r3 = move-exception
            goto L_0x0062
        L_0x0052:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            throw r3     // Catch:{ all -> 0x0050 }
        L_0x0055:
            com.tencent.mm.plugin.appbrand.appcache.g3 r1 = new com.tencent.mm.plugin.appbrand.appcache.g3     // Catch:{ all -> 0x0050 }
            r1.<init>(r3)     // Catch:{ all -> 0x0050 }
            r4 = r0
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x0050 }
            r4.put(r3, r1)     // Catch:{ all -> 0x0050 }
        L_0x0060:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r1
        L_0x0062:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r3
        L_0x0064:
            com.tencent.mm.plugin.appbrand.appcache.p0 r3 = com.tencent.p014mm.plugin.appbrand.appcache.C81301p0.C81302a.f238727a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81247g3.m99555k(com.tencent.mm.plugin.appbrand.AppBrandRuntime, boolean):com.tencent.mm.plugin.appbrand.appcache.p0");
    }

    /* renamed from: l */
    public static String m99556l(AppBrandRuntime appBrandRuntime, String str) {
        return Util.nullAsNil((String) m99555k(appBrandRuntime, false).mo113503f(str, String.class));
    }

    /* renamed from: m */
    public static InputStream m99557m(AppBrandRuntime appBrandRuntime, String str) {
        return (InputStream) m99555k(appBrandRuntime, false).mo113503f(str, InputStream.class);
    }

    /* renamed from: a */
    public List<ModulePkgInfo> mo113497a() {
        return ((C81364t3) this.f238649a).mo113497a();
    }

    /* renamed from: b */
    public WxaPkg mo113498b(String str) {
        try {
            return ((C81364t3) this.f238649a).mo113498b(mo113506i(str));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final boolean mo113499c(String str, boolean z) {
        try {
            return ((C81364t3) this.f238649a).mo113499c(mo113506i(str), z);
        } catch (IllegalArgumentException e) {
            Log.m105921e("MicroMsg.WxaPkgRuntimeReader", "canAccessFile, appId:%s, url:%s, checkCorrectReqURL get exception:%s", this.f238650b, str, e);
            return false;
        }
    }

    public void close() {
        ((C81364t3) this.f238649a).close();
    }

    /* renamed from: d */
    public boolean mo113501d(String str) {
        return mo113499c(str, false);
    }

    /* renamed from: e */
    public List<String> mo113502e() {
        return ((C81364t3) this.f238649a).mo113502e();
    }

    /* renamed from: f */
    public <T> T mo113503f(String str, Class<T> cls) {
        T t = null;
        try {
            String i = mo113506i(str);
            long currentTimeMillis = System.currentTimeMillis();
            InputStream g = mo113504g(i);
            int i2 = -1;
            boolean z = true;
            if (g != null) {
                try {
                    i2 = g.available();
                } catch (IOException e) {
                    Log.m105921e("MicroMsg.WxaPkgRuntimeReader", "openRead, appId = %s, reqURL = %s, access stream.available e = %s", this.f238650b, i, e);
                }
                t = ((C81250c) ((HashMap) C81250c.C81251a.f238654a).get(cls)).mo113508a(i, g);
            }
            Object[] objArr = new Object[6];
            objArr[0] = this.f238650b;
            objArr[1] = i;
            if (t != null) {
                z = false;
            }
            objArr[2] = Boolean.valueOf(z);
            objArr[3] = cls.getName();
            objArr[4] = Integer.valueOf(i2);
            objArr[5] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
            Log.m105925i("MicroMsg.WxaPkgRuntimeReader", "openRead, appId = %s, reqURL = %s, null(%B), type = %s, length = %d, cost = %dms", objArr);
        } catch (IllegalArgumentException unused) {
        }
        return t;
    }

    /* renamed from: g */
    public final InputStream mo113504g(String str) {
        try {
            return ((C81364t3) this.f238649a).mo113504g(mo113506i(str));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public void mo113505h() {
        this.f238649a.mo113505h();
    }

    /* renamed from: i */
    public String mo113506i(String str) {
        Iterator<String> it = this.f238652d.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return str;
            }
        }
        if (!m99554j(str)) {
            String b = C81412d0.m99868b(str, true);
            return b.startsWith("/__APP__") ? C81412d0.m99868b(b.substring(8), true) : b;
        }
        throw new IllegalArgumentException("Invalid URL");
    }

    public C81298o0.C81299a openReadPartialInfo(String str) {
        try {
            return ((C81364t3) this.f238649a).openReadPartialInfo(mo113506i(str));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
