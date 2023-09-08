package wp1;

import cm1.C55015f1;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.FrequentLimiter;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o40.C61926c;
import p749xh.C66273s3;
import rx3.C13598b0;
import up1.C65427x;

/* renamed from: wp1.g */
public final class C66167g {

    /* renamed from: a */
    public static final C66167g f190173a = new C66167g();

    /* renamed from: b */
    public static final C65427x f190174b;

    /* renamed from: c */
    public static final ConcurrentHashMap<String, C55015f1> f190175c = new ConcurrentHashMap<>(100);

    /* renamed from: d */
    public static final ReentrantReadWriteLock f190176d = new ReentrantReadWriteLock();

    /* renamed from: wp1.g$a */
    public static final class C66168a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C55015f1 f190177d;

        /* renamed from: e */
        public final /* synthetic */ boolean f190178e;

        /* renamed from: f */
        public final /* synthetic */ String f190179f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66168a(C55015f1 f1Var, boolean z, String str) {
            super(0);
            this.f190177d = f1Var;
            this.f190178e = z;
            this.f190179f = str;
        }

        /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: a */
        public static final boolean m78066a(boolean r7, java.lang.String r8, cm1.C55015f1 r9, java.lang.String r10, cm1.C55015f1 r11) {
            /*
                java.lang.String r0 = " cache:"
                java.lang.String r1 = " mediaId:"
                java.lang.String r2 = "Finder.MediaCacheLogic"
                r3 = 0
                if (r7 == 0) goto L_0x0090
                wp1.g r7 = wp1.C66167g.f190173a
                java.lang.String r4 = r11.field_mediaId
                java.lang.String r5 = "mediaCache.field_mediaId"
                gy3.C87412m.m108593f(r4, r5)
                r7.getClass()
                java.util.concurrent.locks.ReentrantReadWriteLock r7 = wp1.C66167g.f190176d
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r7.readLock()
                r5.lock()
                up1.x r6 = wp1.C66167g.f190174b     // Catch:{ all -> 0x008b }
                boolean r4 = r6.Ft0(r4)     // Catch:{ all -> 0x008b }
                r5.unlock()
                if (r4 != 0) goto L_0x0090
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r7.readLock()
                int r5 = r7.getWriteHoldCount()
                if (r5 != 0) goto L_0x0038
                int r5 = r7.getReadHoldCount()
                goto L_0x0039
            L_0x0038:
                r5 = 0
            L_0x0039:
                r6 = 0
            L_0x003a:
                if (r6 >= r5) goto L_0x0042
                r4.unlock()
                int r6 = r6 + 1
                goto L_0x003a
            L_0x0042:
                java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r7 = r7.writeLock()
                r7.lock()
                up1.x r6 = wp1.C66167g.f190174b     // Catch:{ all -> 0x007e }
                boolean r11 = r6.insert(r11)     // Catch:{ all -> 0x007e }
            L_0x004f:
                if (r3 >= r5) goto L_0x0057
                r4.lock()
                int r3 = r3 + 1
                goto L_0x004f
            L_0x0057:
                r7.unlock()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r10)
                java.lang.String r10 = " insert "
                r7.append(r10)
                r7.append(r11)
                r7.append(r1)
                r7.append(r8)
                r7.append(r0)
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
                goto L_0x00e6
            L_0x007e:
                r8 = move-exception
            L_0x007f:
                if (r3 >= r5) goto L_0x0087
                r4.lock()
                int r3 = r3 + 1
                goto L_0x007f
            L_0x0087:
                r7.unlock()
                throw r8
            L_0x008b:
                r7 = move-exception
                r5.unlock()
                throw r7
            L_0x0090:
                java.util.concurrent.locks.ReentrantReadWriteLock r7 = wp1.C66167g.f190176d
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r7.readLock()
                int r5 = r7.getWriteHoldCount()
                if (r5 != 0) goto L_0x00a1
                int r5 = r7.getReadHoldCount()
                goto L_0x00a2
            L_0x00a1:
                r5 = 0
            L_0x00a2:
                r6 = 0
            L_0x00a3:
                if (r6 >= r5) goto L_0x00ab
                r4.unlock()
                int r6 = r6 + 1
                goto L_0x00a3
            L_0x00ab:
                java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r7 = r7.writeLock()
                r7.lock()
                up1.x r6 = wp1.C66167g.f190174b     // Catch:{ all -> 0x00e7 }
                boolean r11 = r6.mo89547Yt(r11)     // Catch:{ all -> 0x00e7 }
            L_0x00b8:
                if (r3 >= r5) goto L_0x00c0
                r4.lock()
                int r3 = r3 + 1
                goto L_0x00b8
            L_0x00c0:
                r7.unlock()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r10)
                java.lang.String r10 = " update "
                r7.append(r10)
                r7.append(r11)
                r7.append(r1)
                r7.append(r8)
                r7.append(r0)
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            L_0x00e6:
                return r11
            L_0x00e7:
                r8 = move-exception
            L_0x00e8:
                if (r3 >= r5) goto L_0x00f0
                r4.lock()
                int r3 = r3 + 1
                goto L_0x00e8
            L_0x00f0:
                r7.unlock()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: wp1.C66167g.C66168a.m78066a(boolean, java.lang.String, cm1.f1, java.lang.String, cm1.f1):boolean");
        }

        public Object invoke() {
            try {
                C55015f1 f1Var = this.f190177d;
                if (f1Var != null) {
                    m78066a(this.f190178e, this.f190179f, f1Var, "syncMemoryCacheToDB from cache", f1Var);
                } else {
                    C66167g gVar = C66167g.f190173a;
                    String str = this.f190179f;
                    boolean z = this.f190178e;
                    C55015f1 f1Var2 = C66167g.f190175c.get(str);
                    if (f1Var2 != null) {
                        m78066a(z, str, f1Var, "syncMemoryCacheToDB from id", f1Var2);
                    } else {
                        Log.m105928w("Finder.MediaCacheLogic", "syncMemoryCacheToDB noting for cache mediaId:" + str + " cache:" + f1Var);
                    }
                }
            } catch (Throwable th) {
                Log.m105928w("Finder.MediaCacheLogic", "syncMemoryCacheToDB throwable e:" + th);
            }
            return C13598b0.f38549a;
        }
    }

    static {
        FinderCommonFeatureService finderCommonFeatureService = (FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class);
        finderCommonFeatureService.getClass();
        C86709a0.m107523b().mo121108c();
        C65427x xVar = finderCommonFeatureService.f157812x;
        if (xVar == null) {
            xVar = new C65427x(finderCommonFeatureService.mo76790Np());
        }
        finderCommonFeatureService.f157812x = xVar;
        f190174b = xVar;
    }

    /* renamed from: b */
    public static void m78054b(C66167g gVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = FrequentLimiter.WEEK_MILLS;
        }
        gVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() - j;
        long currentTimeMillis2 = System.currentTimeMillis();
        int run = C66273s3.f190623B.delete().where(C66273s3.f190624C.smallerThan((Number) Long.valueOf(currentTimeMillis))).build().run(f190174b.f188283d);
        long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
        Log.m105924i("Finder.MediaCacheLogic", "[deleteExpired] before=" + currentTimeMillis + " ret=" + run + " cost=" + currentTimeMillis3 + LocaleUtil.MALAY);
    }

    /* renamed from: d */
    public static /* synthetic */ C55015f1 m78055d(C66167g gVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return gVar.mo90234c(str, z);
    }

    /* renamed from: h */
    public static /* synthetic */ void m78056h(C66167g gVar, String str, String str2, String str3, int i, String str4, int i2, long j, long j2, int i3, int i4, String str5, String str6, boolean z, int i5, Object obj) {
        gVar.mo90237g(str, str2, str3, i, str4, i2, j, j2, i3, i4, str5, str6, (i5 & 4096) != 0 ? false : z);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public final boolean mo90233a() {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f190176d
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            up1.x r4 = f190174b     // Catch:{ all -> 0x0062 }
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r4.f188283d     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = r4.getTableName()     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = "rowid >= ?"
            java.lang.String r7 = "0"
            java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch:{ all -> 0x0062 }
            int r4 = r5.delete(r4, r6, r7)     // Catch:{ all -> 0x0062 }
            r5 = 0
        L_0x0038:
            if (r5 >= r2) goto L_0x0040
            r1.lock()
            int r5 = r5 + 1
            goto L_0x0038
        L_0x0040:
            r0.unlock()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[deleteAll] ret="
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.MediaCacheLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cm1.f1> r0 = f190175c
            r0.clear()
            if (r4 < 0) goto L_0x0061
            r3 = 1
        L_0x0061:
            return r3
        L_0x0062:
            r4 = move-exception
        L_0x0063:
            if (r3 >= r2) goto L_0x006b
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0063
        L_0x006b:
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wp1.C66167g.mo90233a():boolean");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0054, code lost:
        if (r3 == null) goto L_0x0056;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final cm1.C55015f1 mo90234c(java.lang.String r10, boolean r11) {
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
            cm1.f1 r11 = new cm1.f1
            r11.<init>()
            r11.field_mediaId = r10
            return r11
        L_0x001a:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cm1.f1> r0 = f190175c
            java.lang.Object r3 = r0.get(r10)
            cm1.f1 r3 = (cm1.C55015f1) r3
            java.lang.String r4 = ", memoryCache size:"
            java.lang.String r5 = "[query] mediaId="
            java.lang.String r6 = "Finder.MediaCacheLogic"
            if (r3 == 0) goto L_0x0056
            java.lang.Object r3 = r0.get(r10)
            cm1.f1 r3 = (cm1.C55015f1) r3
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
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = f190176d
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()
            r3.lock()
            up1.x r7 = f190174b     // Catch:{ all -> 0x00f1 }
            cm1.f1 r7 = r7.mo89548jo(r10)     // Catch:{ all -> 0x00f1 }
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
            java.lang.String r11 = r3.mo76071l2()
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r1 = 0
        L_0x009e:
            if (r1 == 0) goto L_0x00f0
            java.lang.String r11 = r3.mo76071l2()
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r11)
            if (r11 != 0) goto L_0x00f0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r5)
            r11.append(r10)
            java.lang.String r10 = " not found file. cache:"
            r11.append(r10)
            r11.append(r3)
            java.lang.String r10 = " filePath="
            r11.append(r10)
            java.lang.String r10 = r3.mo76071l2()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)
            r10 = 0
            r3.field_cacheSize = r10
            r3.field_totalSize = r10
            r3.field_hasPlayed = r2
            r3.field_reqFormat = r2
            java.lang.String r10 = ""
            r3.field_fileFormat = r10
            r3.field_moovReady = r2
            r3.field_audioBitrate = r2
            r3.field_videoBitrate = r2
            r3.field_frameRate = r2
            r3.field_netProfile = r10
            r10 = -2
            r3.field_state = r10
            java.lang.String r10 = "query"
            r9.mo90236f(r3, r10)
        L_0x00f0:
            return r3
        L_0x00f1:
            r10 = move-exception
            r3.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wp1.C66167g.mo90234c(java.lang.String, boolean):cm1.f1");
    }

    /* renamed from: e */
    public final List<C55015f1> mo90235e(String str) {
        C87412m.m108594g(str, "originalMediaId");
        ReentrantReadWriteLock.ReadLock readLock = f190176d.readLock();
        readLock.lock();
        try {
            return f190174b.mo89546Lo(str);
        } finally {
            readLock.unlock();
        }
    }

    /* renamed from: f */
    public final void mo90236f(C55015f1 f1Var, String str) {
        C87412m.m108594g(f1Var, XWalkPlugin.PRIVATE_CACHE_DIR_NAME);
        C87412m.m108594g(str, "invokeSource");
        f1Var.field_updateTime = C31543z5.m39453c();
        ConcurrentHashMap<String, C55015f1> concurrentHashMap = f190175c;
        String str2 = f1Var.field_mediaId;
        C87412m.m108593f(str2, "cache.field_mediaId");
        concurrentHashMap.put(str2, f1Var);
        String str3 = f1Var.field_mediaId;
        C87412m.m108593f(str3, "cache.field_mediaId");
        mo90238i(str3, f1Var, true);
        Log.m105924i("Finder.MediaCacheLogic", "replaced " + str + ' ' + f1Var + ' ');
    }

    /* renamed from: g */
    public final void mo90237g(String str, String str2, String str3, int i, String str4, int i2, long j, long j2, int i3, int i4, String str5, String str6, boolean z) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(str2, "originalMediaId");
        C87412m.m108594g(str3, "url");
        C87412m.m108594g(str4, "specFormat");
        C55015f1 c = mo90234c(str, false);
        c.field_mediaId = str;
        c.field_originMediaId = str2;
        c.field_url = str3;
        c.field_reqFormat = i;
        c.field_fileFormat = str4;
        c.field_dynamicRangeType = i2;
        c.field_cacheSize = j;
        c.field_totalSize = j2;
        c.field_state = i3;
        c.field_duration = i4;
        c.field_urlToken = str5;
        c.field_decodeKey = str6;
        if (z) {
            c.field_moovReady = true;
        }
        mo90236f(c, "store");
        Log.m105924i("Finder.MediaCacheLogic", "store mediaId:" + str + " cache:" + c);
    }

    /* renamed from: i */
    public final void mo90238i(String str, C55015f1 f1Var, boolean z) {
        C61926c.m72660E("FinderMediaCacheUpdateThread", false, new C66168a(f1Var, z, str));
    }

    /* renamed from: j */
    public final C55015f1 mo90239j(String str, String str2) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(str2, "fileFormat");
        C55015f1 c = mo90234c(str, false);
        c.field_moovReady = true;
        if (!C87412m.m108589b(c.field_fileFormat, str2)) {
            c.field_fileFormat = str2;
        }
        mo90238i(str, c, false);
        return c;
    }

    /* renamed from: k */
    public final void mo90240k(String str, String str2) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(str2, Scopes.PROFILE);
        if (str2.length() != 0) {
            try {
                C55015f1 c = mo90234c(str, false);
                Log.m105924i("Finder.MediaCacheLogic", "[netprofile] update " + str + " with " + str2);
                c.field_netProfile = str2;
                f190174b.mo89547Yt(c);
            } catch (Exception e) {
                Log.m105920e("Finder.MediaCacheLogic", "[netprofile] update " + str + " failed " + e.getLocalizedMessage());
            }
        }
    }

    /* renamed from: l */
    public final C55015f1 mo90241l(String str, long j, long j2, int i) {
        C87412m.m108594g(str, "mediaId");
        C55015f1 c = mo90234c(str, false);
        c.field_cacheSize = j;
        c.field_totalSize = j2;
        c.field_state = i;
        mo90238i(str, c, false);
        return c;
    }
}
