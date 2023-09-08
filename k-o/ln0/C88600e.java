package ln0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.io.File;
import java.util.NavigableSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import k40.C88076b;
import lu3.C34379c;
import p300c8.C79946g;
import p953d8.C86199a;
import p953d8.C86207e;
import p953d8.C86208f;
import p953d8.C86209g;
import p953d8.C86215l;
import ym0.C91509g;
import ym0.C91512j;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: ln0.e */
public class C88600e implements C91509g, C88076b {

    /* renamed from: h */
    public static C88600e f255871h;

    /* renamed from: d */
    public C86199a f255872d;

    /* renamed from: e */
    public C86207e f255873e;

    /* renamed from: f */
    public C88596c f255874f = null;

    /* renamed from: g */
    public boolean f255875g = false;

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ce A[Catch:{ all -> 0x0154 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C88600e() {
        /*
            r17 = this;
            r1 = r17
            r17.<init>()
            r2 = 0
            r1.f255874f = r2
            r3 = 0
            r1.f255875g = r3
            java.lang.String r4 = "MicroMsg.SameLayer.ExoVideoCacheHandler"
            java.lang.String r5 = r17.mo123043g()
            java.lang.String r0 = a70.C112760b.m154195C()
            java.lang.String r6 = "/"
            boolean r7 = r0.endsWith(r6)
            if (r7 != 0) goto L_0x002c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = r7.toString()
        L_0x002c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r0 = "wxavideocache/"
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r7 = 1
            com.tencent.p014mm.vfs.C86013q1.m106445f(r0)     // Catch:{ all -> 0x0043 }
            goto L_0x004e
        L_0x0043:
            r0 = move-exception
            r8 = r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r3] = r8
            java.lang.String r8 = "cleanOldVideoCacheFolder exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r8, r0)
        L_0x004e:
            java.lang.String r0 = a70.C112760b.m154195C()
            boolean r8 = r0.endsWith(r6)
            if (r8 != 0) goto L_0x0067
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r6)
            java.lang.String r0 = r8.toString()
        L_0x0067:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r0 = "videocache/"
            r8.append(r0)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r0 = r8.toString()
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106461v(r0)     // Catch:{ all -> 0x0154 }
            if (r5 != 0) goto L_0x00e3
            java.lang.String r5 = "mkdirs fail 1, maybe file exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r5)     // Catch:{ all -> 0x0154 }
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)     // Catch:{ all -> 0x0154 }
            java.lang.String r6 = r5.getPath()     // Catch:{ all -> 0x0154 }
            if (r6 == 0) goto L_0x00ae
            java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r3, r3)     // Catch:{ all -> 0x0154 }
            java.lang.String r8 = r5.getPath()     // Catch:{ all -> 0x0154 }
            boolean r8 = r8.equals(r6)     // Catch:{ all -> 0x0154 }
            if (r8 != 0) goto L_0x00ae
            android.net.Uri$Builder r5 = r5.buildUpon()     // Catch:{ all -> 0x0154 }
            android.net.Uri$Builder r5 = r5.path(r6)     // Catch:{ all -> 0x0154 }
            android.net.Uri r5 = r5.build()     // Catch:{ all -> 0x0154 }
        L_0x00ae:
            com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ all -> 0x0154 }
            com.tencent.mm.vfs.f0$h r2 = r6.mo177799l(r5, r2)     // Catch:{ all -> 0x0154 }
            boolean r5 = r2.mo177810a()     // Catch:{ all -> 0x0154 }
            if (r5 != 0) goto L_0x00bb
            goto L_0x00cb
        L_0x00bb:
            com.tencent.mm.vfs.FileSystem$c r5 = r2.f348991a     // Catch:{ all -> 0x0154 }
            java.lang.String r2 = r2.f348992b     // Catch:{ all -> 0x0154 }
            com.tencent.mm.vfs.b0 r2 = r5.mo119945q(r2)     // Catch:{ all -> 0x0154 }
            if (r2 == 0) goto L_0x00cb
            boolean r2 = r2.f250476f     // Catch:{ all -> 0x0154 }
            if (r2 == 0) goto L_0x00cb
            r2 = 1
            goto L_0x00cc
        L_0x00cb:
            r2 = 0
        L_0x00cc:
            if (r2 != 0) goto L_0x00e3
            java.lang.String r2 = "mkdirs fail, not dir"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)     // Catch:{ all -> 0x0154 }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)     // Catch:{ all -> 0x0154 }
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106461v(r0)     // Catch:{ all -> 0x0154 }
            if (r2 != 0) goto L_0x00e3
            java.lang.String r0 = "mkdirs fail 2, no space?"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)     // Catch:{ all -> 0x0154 }
            goto L_0x015e
        L_0x00e3:
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            r2.<init>((java.lang.String) r0)
            java.io.File r0 = new java.io.File
            java.lang.String r5 = r2.mo119971i()
            java.lang.String r5 = com.tencent.p014mm.vfs.C86013q1.m106448i(r5, r7)
            r0.<init>(r5)
            d8.k r5 = new d8.k
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            r5.<init>(r8)
            d8.a r0 = r1.mo123041c(r0, r5)
            r1.f255872d = r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r2 = r2.mo119971i()
            r0[r3] = r2
            java.lang.String r2 = "initVideoCacheDataSource, cacheFolder:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            c8.o r10 = new c8.o
            mn0.b r2 = kn0.C88235m.f255053a
            java.lang.String r12 = in0.C87762h.m109196a(r0)
            kn0.b r5 = new kn0.b
            r14 = 8000(0x1f40, float:1.121E-41)
            r15 = 8000(0x1f40, float:1.121E-41)
            r16 = 1
            r11 = r5
            r13 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            r10.<init>(r0, r2, r5)
            d8.c r12 = new d8.c
            d8.a r0 = r1.f255872d
            r5 = 10485760(0xa00000, double:5.180654E-317)
            r12.<init>(r0, r5)
            d8.e r2 = new d8.e
            c8.s r11 = new c8.s
            r11.<init>()
            r13 = 2
            ln0.d r14 = new ln0.d
            r14.<init>(r1)
            r8 = r2
            r9 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r1.f255873e = r2
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r3] = r0
            java.lang.String r0 = "initVideoCacheDataSource, cache:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r2)
            goto L_0x015e
        L_0x0154:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r3] = r0
            java.lang.String r0 = "mkdirs exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r2)
        L_0x015e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ln0.C88600e.<init>():void");
    }

    /* renamed from: f */
    public static C88600e m110458f() {
        if (f255871h == null) {
            synchronized (C88600e.class) {
                if (f255871h == null) {
                    f255871h = new C88600e();
                }
            }
        }
        return f255871h;
    }

    /* renamed from: D */
    public long mo123036D(String str, long j, long j2) {
        if (this.f255872d == null) {
            Log.m105928w("MicroMsg.SameLayer.ExoVideoCacheHandler", "getCachedBytes, cache is null");
            return 0;
        }
        long D = this.f255872d.mo120611D(C91512j.m114810c().mo125425b(str), j, j2);
        Log.m105925i("MicroMsg.SameLayer.ExoVideoCacheHandler", "getCachedBytes, cachedSize:%s, position:%s, length:%s, url:%s", Long.valueOf(D), Long.valueOf(j), Long.valueOf(j2), str);
        return D;
    }

    /* renamed from: a */
    public void mo109766a() {
        Log.m105924i("MicroMsg.SameLayer.ExoVideoCacheHandler", "unregister VideoCacheService#ExoVideoCacheHandler");
    }

    /* renamed from: b */
    public void mo109767b() {
        Log.m105924i("MicroMsg.SameLayer.ExoVideoCacheHandler", "register VideoCacheService#ExoVideoCacheHandler");
    }

    /* renamed from: c */
    public C86199a mo123041c(File file, C86208f fVar) {
        return new C86215l(file, fVar);
    }

    /* renamed from: d */
    public void mo123042d(String str, long j, long j2) {
        C86207e eVar;
        synchronized (this) {
            if (!this.f255875g) {
                C86199a aVar = this.f255872d;
                if (!(aVar == null || (eVar = this.f255873e) == null)) {
                    this.f255874f = new C88596c(aVar, eVar);
                }
                this.f255875g = true;
            }
        }
        C88596c cVar = this.f255874f;
        if (cVar != null) {
            C87412m.m108594g(str, "url");
            ConcurrentHashMap<String, Future<?>> concurrentHashMap = cVar.f255865c;
            C119179t tVar = C119157j.f356862d;
            C88594b bVar = new C88594b(str, j, j2, cVar);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            C34379c<?> i = jVar.mo183878i(bVar, 0);
            C87412m.m108593f(i, "fun cache(url: String, o…        }\n        )\n    }");
            concurrentHashMap.put(str, i);
        }
    }

    public String f00(String str) {
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r1 = (r1 = r0.indexOf(com.tencent.xweb.file.XVFSFile.PATH_SEPARATOR)) + 1;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo123043g() {
        /*
            r3 = this;
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x001f
            java.lang.String r1 = ":"
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L_0x001f
            int r2 = r0.length()
            int r1 = r1 + 1
            if (r2 < r1) goto L_0x001f
            java.lang.String r0 = r0.substring(r1)
            goto L_0x0021
        L_0x001f:
            java.lang.String r0 = "main"
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ln0.C88600e.mo123043g():java.lang.String");
    }

    /* renamed from: hU */
    public void mo123038hU(String str) {
        Log.m105925i("MicroMsg.SameLayer.ExoVideoCacheHandler", "removeCache, url: %s", str);
        if (str != null) {
            if (this.f255872d == null) {
                Log.m105928w("MicroMsg.SameLayer.ExoVideoCacheHandler", "removeCache, cache is null");
                return;
            }
            String b = C91512j.m114810c().mo125425b(str);
            C86199a aVar = this.f255872d;
            NavigableSet<C86209g> O = aVar.mo120622O(b);
            if (O != null) {
                for (C86209g I : O) {
                    try {
                        aVar.mo120616I(I);
                    } catch (C86199a.C86200a unused) {
                    }
                }
            }
        }
    }

    /* renamed from: pR */
    public C79946g.C79947a mo123039pR() {
        return this.f255873e;
    }
}
