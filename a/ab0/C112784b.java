package ab0;

import bb0.C113157b;
import bb0.C113158c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o40.C61926c;
import p328cz.C20373i;
import zh3.C91753f;

/* renamed from: ab0.b */
public final class C112784b {

    /* renamed from: a */
    public static final C112784b f337700a = new C112784b();

    /* renamed from: b */
    public static final C113158c f337701b;

    /* renamed from: c */
    public static final ConcurrentHashMap<String, C113157b> f337702c = new ConcurrentHashMap<>(100);

    /* renamed from: d */
    public static final ReentrantReadWriteLock f337703d = new ReentrantReadWriteLock();

    static {
        C20373i iVar = (C20373i) C86312j.m106911c(C20373i.class);
        iVar.getClass();
        C86709a0.m107523b().mo121108c();
        C113158c cVar = iVar.f57096j;
        if (cVar == null) {
            iVar.requireAccountInitialized();
            iVar.wx0();
            C91753f fVar = iVar.f57094h;
            C87412m.m108591d(fVar);
            cVar = new C113158c(fVar);
        }
        iVar.f57096j = cVar;
        f337701b = cVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C113157b m154286b(C112784b bVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return bVar.mo164535a(str, z);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0054, code lost:
        if (r3 == null) goto L_0x0056;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final bb0.C113157b mo164535a(java.lang.String r10, boolean r11) {
        /*
            r9 = this;
            java.lang.String r0 = "mediaId"
            gy3.C87412m.m108594g(r10, r0)
            int r0 = r10.length()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x000f
            r0 = 1
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r0 == 0) goto L_0x001a
            bb0.b r11 = new bb0.b
            r11.<init>()
            r11.field_mediaId = r10
            return r11
        L_0x001a:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, bb0.b> r0 = f337702c
            java.lang.Object r3 = r0.get(r10)
            bb0.b r3 = (bb0.C113157b) r3
            java.lang.String r4 = ", memoryCache size:"
            java.lang.String r5 = "[query] mediaId="
            java.lang.String r6 = "Finder.MediaCacheLogic"
            if (r3 == 0) goto L_0x0056
            java.lang.Object r3 = r0.get(r10)
            bb0.b r3 = (bb0.C113157b) r3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r10)
            java.lang.String r8 = " hit memory cache:"
            r7.append(r8)
            r7.append(r3)
            r7.append(r4)
            int r8 = r0.size()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            if (r3 != 0) goto L_0x0090
        L_0x0056:
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = f337703d
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()
            r3.lock()
            bb0.c r7 = f337701b     // Catch:{ all -> 0x00f1 }
            bb0.b r7 = r7.mo165662jo(r10)     // Catch:{ all -> 0x00f1 }
            r3.unlock()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r10)
            java.lang.String r8 = " hit db cache:"
            r3.append(r8)
            r3.append(r7)
            r3.append(r4)
            int r4 = r0.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            r0.put(r10, r7)
            r3 = r7
        L_0x0090:
            if (r11 == 0) goto L_0x00f0
            java.lang.String r11 = r3.mo165658l2()
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r1 = 0
        L_0x009e:
            if (r1 == 0) goto L_0x00f0
            java.lang.String r11 = r3.mo165658l2()
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r11)
            if (r11 != 0) goto L_0x00f0
            r0 = 0
            r3.field_cacheSize = r0
            r3.field_totalSize = r0
            r3.field_hasPlayed = r2
            java.lang.String r11 = ""
            r3.field_specFormat = r11
            r3.field_codecFormat = r2
            r3.field_moovReady = r2
            r3.field_audioBitrate = r2
            r3.field_videoBitrate = r2
            r3.field_frameRate = r2
            r3.field_netProfile = r11
            r11 = -2
            r3.field_state = r11
            java.lang.String r11 = "query"
            r9.mo164536c(r3, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r5)
            r11.append(r10)
            java.lang.String r10 = " not found file. cache:"
            r11.append(r10)
            r11.append(r3)
            java.lang.String r10 = " filePath="
            r11.append(r10)
            java.lang.String r10 = r3.mo165658l2()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)
        L_0x00f0:
            return r3
        L_0x00f1:
            r10 = move-exception
            r3.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ab0.C112784b.mo164535a(java.lang.String, boolean):bb0.b");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final void mo164536c(C113157b bVar, String str) {
        C87412m.m108594g(bVar, XWalkPlugin.PRIVATE_CACHE_DIR_NAME);
        C87412m.m108594g(str, "invokeSource");
        bVar.field_updateTime = C31543z5.m39453c();
        ConcurrentHashMap<String, C113157b> concurrentHashMap = f337702c;
        String str2 = bVar.field_mediaId;
        C87412m.m108593f(str2, "cache.field_mediaId");
        concurrentHashMap.put(str2, bVar);
        String str3 = bVar.field_mediaId;
        C87412m.m108593f(str3, "cache.field_mediaId");
        C61926c.m72660E("FinderMediaCacheUpdateThread", false, new C112783a(bVar, str3));
        StringBuilder sb = new StringBuilder();
        sb.append("replaced ");
        sb.append(str);
        sb.append(" isExist=");
        String str4 = bVar.field_mediaId;
        C87412m.m108593f(str4, "cache.field_mediaId");
        ReentrantReadWriteLock.ReadLock readLock = f337703d.readLock();
        readLock.lock();
        try {
            boolean Ft0 = f337701b.Ft0(str4);
            readLock.unlock();
            sb.append(Ft0);
            sb.append(' ');
            sb.append(bVar);
            sb.append(' ');
            Log.m105924i("Finder.MediaCacheLogic", sb.toString());
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    /* renamed from: d */
    public final void mo164537d(String str, String str2, String str3, int i, String str4, int i2, long j, long j2, int i3, int i4, String str5, String str6) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(str2, "originalMediaId");
        C87412m.m108594g(str3, "url");
        C87412m.m108594g(str4, "specFormat");
        C113157b a = mo164535a(str, false);
        a.field_mediaId = str;
        a.field_originMediaId = str2;
        a.field_url = str3;
        a.field_specFormat = str4;
        a.field_codecFormat = i;
        a.field_dynamicRangeType = i2;
        a.field_cacheSize = j;
        a.field_totalSize = j2;
        a.field_state = i3;
        a.field_duration = i4;
        a.field_urlToken = str5;
        a.field_decodeKey = str6;
        mo164536c(a, "store");
        Log.m105924i("Finder.MediaCacheLogic", "store mediaId:" + str + " cache:" + a);
    }
}
