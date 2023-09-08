package com.tencent.p014mm.plugin.appbrand.appcache;

import a70.C112760b;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.StatFs;
import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.autogen.events.WxaPkgCDNDownloaderEventEvent;
import com.tencent.p014mm.ipcinvoker.C40319a0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81282k1;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85630d;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85631f;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85632g;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85638o;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85639p;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85640q;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di0.C86296l;
import di3.C86312j;
import ei0.C86516a;
import ei0.C86518b;
import ei0.C86520c;
import ei0.C86521d;
import f40.C86709a0;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import js0.C46574u;
import js0.C9514m;
import p156gj.C87198e0;
import p224ra.C89909e;
import qd3.C89599a;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.t2 */
public final class C81355t2 {

    /* renamed from: a */
    public final C81359d f238836a = new C81359d();

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.t2$b */
    public static final class C81357b implements C81358c {
        public C81357b(C81356a aVar) {
        }

        /* renamed from: a */
        public C85639p mo113632a(C81360e eVar) {
            MTimerHandler mTimerHandler;
            C81360e eVar2 = eVar;
            String f = eVar.mo119192f();
            try {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                C9514m mVar = new C9514m();
                Req req = eVar2.f249577d;
                C86516a aVar = (C86516a) req;
                C81282k1.C81283a aVar2 = eVar2.f238839j;
                if (((C86516a) req).f251360o) {
                    t2$b$$a t2_b__a = r1;
                    Looper looper = ((HandlerThread) C40319a0.m43493a().f108392a.getLooper().getThread()).getLooper();
                    t2$b$$a t2_b__a2 = new t2$b$$a(f, aVar2, aVar, mVar, countDownLatch);
                    mTimerHandler = new MTimerHandler(looper, (MTimerHandler.CallBack) t2_b__a, false);
                } else {
                    mTimerHandler = null;
                }
                CronetLogic.CronetRequestParams cronetRequestParams = new CronetLogic.CronetRequestParams();
                cronetRequestParams.url = aVar.f249586f;
                cronetRequestParams.taskId = f;
                cronetRequestParams.savePath = C86013q1.m106448i(aVar.f249583c, true);
                cronetRequestParams.method = "GET";
                cronetRequestParams.needWirteCache = true;
                cronetRequestParams.useHttp2 = true;
                cronetRequestParams.useQuic = true;
                cronetRequestParams.useNewdns = true;
                cronetRequestParams.useMemoryCache = false;
                HashMap hashMap = new HashMap();
                hashMap.put("Accept-Encoding", "gzip,compress,br,deflate");
                hashMap.put("User-Agent", C46574u.m51897a(MMApplicationContext.getContext(), Util.nullAsNil(System.getProperty("http.agent")), (C46574u.C46575a) C89909e.m112436a(C46574u.C46575a.class)));
                cronetRequestParams.makeRequestHeader(hashMap);
                cronetRequestParams.taskType = 2;
                C86516a aVar3 = aVar;
                CronetLogic.startCronetDownloadTask(cronetRequestParams, new t2$b$$b(this, mTimerHandler, mVar, countDownLatch, eVar, f));
                Log.m105925i("MicroMsg.AppBrand.CronetHttpsDownloadPerformer", "downloadUsingCronet, request made, useHttp2:%b, useQuic:%b, useNewDns:%b, url %s", Boolean.valueOf(cronetRequestParams.useHttp2), Boolean.valueOf(cronetRequestParams.useQuic), Boolean.valueOf(cronetRequestParams.useNewdns), eVar2.f238838i);
                if (mTimerHandler != null) {
                    mTimerHandler.startTimer((long) aVar3.f249589i);
                }
                try {
                    countDownLatch.await();
                    return (C85639p) mVar.f29691a;
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrand.CronetHttpsDownloadPerformer", "cdn https perform, urlKey %s semaphore await e = %s", f, e);
                    return null;
                }
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrand.CronetHttpsDownloadPerformer", "perform urlKey %s exp %s", f, e2);
                return null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.t2$c */
    public interface C81358c {
        /* renamed from: a */
        C85639p mo113632a(C81360e eVar);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.t2$d */
    public static final class C81359d extends C85640q {
        public C81359d() {
            super("WxaPkgDownload", new C81362f());
        }

        /* renamed from: h */
        public int mo113634h(C85638o oVar) {
            int h = super.mo113634h(oVar);
            if (h != 1) {
                return h;
            }
            mo119167g(oVar);
            return 2;
        }

        /* renamed from: i */
        public C85632g.C85636d<C86516a> mo113633f(C85638o oVar) {
            C81360e eVar = new C81360e((C86516a) oVar);
            eVar.f249607g = this.f249603d;
            return eVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.t2$e */
    public static final class C81360e extends C85640q.C85641a<C86516a> {

        /* renamed from: n */
        public static final ThreadLocal<C81358c> f238837n = new C81361a();

        /* renamed from: i */
        public String f238838i = null;

        /* renamed from: j */
        public final C81282k1.C81283a f238839j;

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.t2$e$a */
        public class C81361a extends ThreadLocal<C81358c> {
            public Object initialValue() {
                return new C81357b((C81356a) null);
            }
        }

        public C81360e(C86516a aVar) {
            super(aVar);
            Object[] array;
            C81282k1.C81283a aVar2;
            C81282k1.C81283a aVar3 = null;
            Set<C81282k1.C81284b> set = C81282k1.f238688a;
            synchronized (set) {
                array = set.toArray();
            }
            int length = array.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    aVar2 = null;
                    break;
                }
                aVar2 = ((C81282k1.C81284b) array[i]).mo113473a(aVar);
                if (aVar2 != null) {
                    break;
                }
                i++;
            }
            this.f238839j = aVar2 != null ? aVar2 : aVar3;
        }

        /* renamed from: a */
        public String mo113636a() {
            return this.f238838i;
        }

        /* renamed from: b */
        public boolean mo113637b(long j) {
            C86009m1 l = new C86009m1(mo119191e()).mo119974l();
            if (l == null) {
                return true;
            }
            StatFs statFs = new StatFs(l.mo119971i());
            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            return availableBlocksLong < 0 || availableBlocksLong > j;
        }

        /* renamed from: c */
        public C85632g.C85634b mo113638c() {
            return (C86516a) this.f249577d;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
            if (r5.f249598g == 3) goto L_0x0027;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0061 A[RETURN] */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.pluginsdk.res.downloader.model.C85639p mo113639g(com.tencent.p014mm.pluginsdk.res.downloader.model.C85637n r10) {
            /*
                r9 = this;
                java.lang.String r0 = "MicroMsg.WxaPkgDownloadPerformer"
                r1 = 3
                r2 = 0
                r3 = 0
                Req r4 = r9.f249577d     // Catch:{ Exception -> 0x004e }
                ei0.a r4 = (ei0.C86516a) r4     // Catch:{ Exception -> 0x004e }
                java.lang.String r5 = r4.f249583c     // Catch:{ Exception -> 0x004e }
                com.tencent.p014mm.vfs.C86013q1.m106447h(r5)     // Catch:{ Exception -> 0x004e }
                java.lang.String r5 = r4.f249586f     // Catch:{ Exception -> 0x004e }
                r9.f238838i = r5     // Catch:{ Exception -> 0x004e }
                com.tencent.mm.plugin.appbrand.appcache.k1$a r6 = r9.f238839j     // Catch:{ Exception -> 0x004e }
                java.lang.String r7 = "https"
                boolean r5 = r5.startsWith(r7)     // Catch:{ Exception -> 0x004e }
                r6.mo113475b(r5)     // Catch:{ Exception -> 0x004e }
                com.tencent.mm.pluginsdk.res.downloader.model.p r5 = r9.mo113641h()     // Catch:{ Exception -> 0x004e }
                if (r5 == 0) goto L_0x0027
                int r6 = r5.f249598g     // Catch:{ Exception -> 0x004c }
                if (r6 != r1) goto L_0x0046
            L_0x0027:
                java.lang.String r6 = "onCDNDownloaderFailed key:%s"
                r7 = 1
                java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x004c }
                java.lang.String r4 = r4.f249581a     // Catch:{ Exception -> 0x004c }
                r8[r2] = r4     // Catch:{ Exception -> 0x004c }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r6, r8)     // Catch:{ Exception -> 0x004c }
                com.tencent.mm.plugin.appbrand.appcache.k1$a r4 = r9.f238839j     // Catch:{ Exception -> 0x004c }
                r4.mo113481h()     // Catch:{ Exception -> 0x004c }
                com.tencent.mm.pluginsdk.res.downloader.model.p r10 = super.mo113639g(r10)     // Catch:{ Exception -> 0x004c }
                if (r10 == 0) goto L_0x0045
                android.os.Bundle r4 = r10.f249601j     // Catch:{ Exception -> 0x004c }
                java.lang.String r6 = "RESPONSE_KEY_FALLBACK_USE_SYSTEM_URL_CONNECTION"
                r4.putBoolean(r6, r7)     // Catch:{ Exception -> 0x004c }
            L_0x0045:
                r5 = r10
            L_0x0046:
                com.tencent.mm.plugin.appbrand.appcache.k1$a r10 = r9.f238839j     // Catch:{ Exception -> 0x004c }
                r10.mo113478e(r5)     // Catch:{ Exception -> 0x004c }
                goto L_0x0058
            L_0x004c:
                r10 = move-exception
                goto L_0x0050
            L_0x004e:
                r10 = move-exception
                r5 = r3
            L_0x0050:
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r4 = "perform failed"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r10, r4, r2)
            L_0x0058:
                if (r5 != 0) goto L_0x0061
                com.tencent.mm.pluginsdk.res.downloader.model.p r10 = new com.tencent.mm.pluginsdk.res.downloader.model.p
                r0 = -1
                r10.<init>((com.tencent.p014mm.pluginsdk.res.downloader.model.C85631f) r9, (java.lang.Exception) r3, (int) r0, (int) r1)
                return r10
            L_0x0061:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81355t2.C81360e.mo113639g(com.tencent.mm.pluginsdk.res.downloader.model.n):com.tencent.mm.pluginsdk.res.downloader.model.p");
        }

        public String getGroupId() {
            return "AppBrandWxaPkgDownloader";
        }

        /* renamed from: h */
        public final C85639p mo113641h() {
            C81358c cVar = f238837n.get();
            Objects.requireNonNull(cVar);
            WxaPkgCDNDownloaderEventEvent wxaPkgCDNDownloaderEventEvent = new WxaPkgCDNDownloaderEventEvent();
            WxaPkgCDNDownloaderEventEvent.C80748a aVar = wxaPkgCDNDownloaderEventEvent.f236311d;
            aVar.f236313b = (C86516a) this.f249577d;
            aVar.f236312a = 1;
            wxaPkgCDNDownloaderEventEvent.asyncPublish(Looper.getMainLooper());
            C85639p a = cVar.mo113632a(this);
            WxaPkgCDNDownloaderEventEvent wxaPkgCDNDownloaderEventEvent2 = new WxaPkgCDNDownloaderEventEvent();
            WxaPkgCDNDownloaderEventEvent.C80748a aVar2 = wxaPkgCDNDownloaderEventEvent2.f236311d;
            aVar2.f236313b = (C86516a) this.f249577d;
            aVar2.f236314c = a;
            aVar2.f236312a = 2;
            wxaPkgCDNDownloaderEventEvent2.asyncPublish(Looper.getMainLooper());
            return a;
        }

        public boolean retry() {
            if (C87198e0.m108253a() != 1) {
                return false;
            }
            return super.retry();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.t2$f */
    public static final class C81362f implements C85630d {

        /* renamed from: a */
        public final MMHandler f238840a = new MMHandler("WxaPkgDownloadPerformerEventDispatchThread");

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.t2$f$a */
        public class C81363a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C85639p f238841d;

            /* renamed from: e */
            public final /* synthetic */ C85631f f238842e;

            public C81363a(C85639p pVar, C85631f fVar) {
                this.f238841d = pVar;
                this.f238842e = fVar;
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(16:87|88|89|90|91|92|93|(2:94|(1:96)(1:156))|97|98|99|100|101|103|125|(2:127|167)(2:128|(2:130|168)(2:131|169))) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x02b5 */
            /* JADX WARNING: Removed duplicated region for block: B:117:0x02d6 A[SYNTHETIC, Splitter:B:117:0x02d6] */
            /* JADX WARNING: Removed duplicated region for block: B:121:0x02dd A[SYNTHETIC, Splitter:B:121:0x02dd] */
            /* JADX WARNING: Removed duplicated region for block: B:127:0x02fb  */
            /* JADX WARNING: Removed duplicated region for block: B:128:0x0314  */
            /* JADX WARNING: Removed duplicated region for block: B:135:0x034d A[SYNTHETIC, Splitter:B:135:0x034d] */
            /* JADX WARNING: Removed duplicated region for block: B:139:0x0354 A[SYNTHETIC, Splitter:B:139:0x0354] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r22 = this;
                    r1 = r22
                    ei0.b$a r2 = ei0.C86518b.C86519a.ENV_ERR
                    com.tencent.mm.pluginsdk.res.downloader.model.p r3 = r1.f238841d
                    int r0 = r3.f249598g
                    r4 = 4
                    r5 = 2
                    r6 = 3
                    if (r0 == r5) goto L_0x002f
                    if (r0 == r6) goto L_0x0021
                    if (r0 == r4) goto L_0x0013
                    goto L_0x039a
                L_0x0013:
                    com.tencent.mm.plugin.appbrand.appcache.t2$f r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81355t2.C81362f.this
                    com.tencent.mm.pluginsdk.res.downloader.model.f r2 = r1.f238842e
                    r0.getClass()
                    com.tencent.mm.plugin.appbrand.appcache.t2$e r2 = (com.tencent.p014mm.plugin.appbrand.appcache.C81355t2.C81360e) r2
                    r0.mo113647d(r2, r3)
                    goto L_0x039a
                L_0x0021:
                    com.tencent.mm.plugin.appbrand.appcache.t2$f r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81355t2.C81362f.this
                    com.tencent.mm.pluginsdk.res.downloader.model.f r2 = r1.f238842e
                    r0.getClass()
                    com.tencent.mm.plugin.appbrand.appcache.t2$e r2 = (com.tencent.p014mm.plugin.appbrand.appcache.C81355t2.C81360e) r2
                    r0.mo113647d(r2, r3)
                    goto L_0x039a
                L_0x002f:
                    com.tencent.mm.plugin.appbrand.appcache.t2$f r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81355t2.C81362f.this
                    com.tencent.mm.pluginsdk.res.downloader.model.f r7 = r1.f238842e
                    r0.getClass()
                    java.lang.Class<di0.l> r0 = di0.C86296l.class
                    r8 = r7
                    com.tencent.mm.plugin.appbrand.appcache.t2$e r8 = (com.tencent.p014mm.plugin.appbrand.appcache.C81355t2.C81360e) r8
                    Req r9 = r8.f249577d
                    ei0.a r9 = (ei0.C86516a) r9
                    boolean r10 = r9 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81300o2
                    r11 = 0
                    r12 = 1
                    r13 = 0
                    if (r10 == 0) goto L_0x0206
                    com.tencent.mm.plugin.appbrand.appcache.o2 r9 = (com.tencent.p014mm.plugin.appbrand.appcache.C81300o2) r9
                    com.tencent.mm.plugin.appbrand.appcache.k1$a r3 = r8.f238839j
                    di3.d r0 = di3.C86312j.m106911c(r0)
                    di0.l r0 = (di0.C86296l) r0
                    com.tencent.mm.plugin.appbrand.appcache.h3 r7 = r0.mo113349uv()
                    if (r7 != 0) goto L_0x005f
                    java.lang.String r0 = r9.f249581a
                    java.lang.String r3 = r9.f251357l
                    com.tencent.p014mm.plugin.appbrand.appcache.C81293m3.m99676b(r0, r3, r2, r13)
                    goto L_0x039a
                L_0x005f:
                    java.lang.String r0 = r9.f251357l
                    int r8 = r9.f238724q
                    int r10 = r9.f238725r
                    java.lang.String r15 = r9.mo113571j()
                    java.lang.String r14 = "pkgPath"
                    java.lang.String[] r14 = new java.lang.String[]{r14}
                    com.tencent.mm.plugin.appbrand.appcache.z2 r14 = r7.mo113533pl(r0, r8, r11, r14)
                    if (r14 != 0) goto L_0x0090
                    java.lang.String r3 = "MicroMsg.AppBrand.IncrementalPkgLogic[incremental]"
                    java.lang.String r4 = "onIncrementalPkgDownloadComplete, get NULL oldInfo with appId[%s] version[%d]"
                    java.lang.Object[] r5 = new java.lang.Object[r5]
                    r5[r11] = r0
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
                    r5[r12] = r0
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r5)
                    java.lang.String r0 = r9.f249581a
                    java.lang.String r3 = r9.f251357l
                    com.tencent.p014mm.plugin.appbrand.appcache.C81293m3.m99676b(r0, r3, r2, r13)
                    goto L_0x039a
                L_0x0090:
                    r3.mo113482i()
                    long r16 = android.os.SystemClock.elapsedRealtime()
                    java.lang.String r8 = r14.field_pkgPath
                    java.lang.String r13 = r9.f249583c
                    java.lang.Class<com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService> r0 = com.tencent.p014mm.plugin.appbrand.service.IBSPatchJNIService.class
                    di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x00a8 }
                    com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService r0 = (com.tencent.p014mm.plugin.appbrand.service.IBSPatchJNIService) r0     // Catch:{ Exception -> 0x00a8 }
                    int r0 = r0.bspatch(r8, r15, r13)     // Catch:{ Exception -> 0x00a8 }
                    goto L_0x00bc
                L_0x00a8:
                    r0 = move-exception
                    java.lang.Object[] r6 = new java.lang.Object[r4]
                    r6[r11] = r0
                    r6[r12] = r8
                    r6[r5] = r15
                    r8 = 3
                    r6[r8] = r13
                    java.lang.String r0 = "MicroMsg.AppBrand.IncrementalPkgLogic[incremental]"
                    java.lang.String r8 = "mergeDiffPkg e = %s, old[%s], new[%s], diff[%s]"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r8, r6)
                    r0 = 1
                L_0x00bc:
                    long r18 = android.os.SystemClock.elapsedRealtime()
                    long r18 = r18 - r16
                    java.lang.String r6 = "MicroMsg.AppBrand.IncrementalPkgLogic[incremental]"
                    java.lang.String r8 = "applyPkgPatch, appId[%s], oldPath[%s], newPath[%s], patchPath[%s], cost %d, ret %d"
                    r13 = 6
                    java.lang.Object[] r13 = new java.lang.Object[r13]
                    java.lang.String r4 = r9.f251357l
                    r13[r11] = r4
                    java.lang.String r4 = r14.field_pkgPath
                    r13[r12] = r4
                    r13[r5] = r15
                    java.lang.String r4 = r9.f249583c
                    r14 = 3
                    r13[r14] = r4
                    java.lang.Long r4 = java.lang.Long.valueOf(r18)
                    r14 = 4
                    r13[r14] = r4
                    r4 = 5
                    java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
                    r13[r4] = r14
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r13)
                    r3.mo113484k(r0)
                    com.tencent.mm.plugin.appbrand.appcache.m3$$b r4 = r9.f238726s
                    boolean r4 = r4 instanceof ei0.C86520c
                    if (r0 != 0) goto L_0x01a3
                    java.lang.String r0 = r9.f249581a
                    java.util.Collection r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81293m3.m99680f(r0, r12)
                    js0.m r6 = new js0.m
                    r6.<init>()
                    js0.m r8 = new js0.m
                    r8.<init>()
                    js0.m r13 = new js0.m
                    r13.<init>()
                    com.tencent.mm.plugin.appbrand.appcache.r0 r14 = new com.tencent.mm.plugin.appbrand.appcache.r0
                    r14.<init>(r6, r8, r13)
                    java.lang.String r5 = r9.f249581a
                    com.tencent.p014mm.plugin.appbrand.appcache.C81293m3.m99675a(r5, r14)
                    java.lang.String r14 = r9.f249581a
                    java.lang.String r5 = r9.f251357l
                    r18 = 0
                    r19 = 0
                    r21 = r15
                    r15 = r5
                    r16 = r21
                    r17 = r10
                    r20 = r3
                    com.tencent.p014mm.plugin.appbrand.appcache.C81293m3.m99679e(r14, r15, r16, r17, r18, r19, r20)
                    ei0.b$a r3 = ei0.C86518b.C86519a.OK
                    T r5 = r8.f29691a
                    if (r3 != r5) goto L_0x012d
                    r3 = 1
                    goto L_0x012e
                L_0x012d:
                    r3 = 0
                L_0x012e:
                    java.lang.String r5 = "MicroMsg.AppBrand.IncrementalPkgLogic[incremental]"
                    java.lang.String r10 = "onIncrementalPkgDownloadComplete, urlKey[%s] verifyOk[%s] canFallback[%b]"
                    r14 = 3
                    java.lang.Object[] r14 = new java.lang.Object[r14]
                    java.lang.String r15 = r9.f249581a
                    r14[r11] = r15
                    java.lang.Boolean r15 = java.lang.Boolean.valueOf(r3)
                    r14[r12] = r15
                    java.lang.Boolean r15 = java.lang.Boolean.valueOf(r4)
                    r16 = 2
                    r14[r16] = r15
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r14)
                    if (r3 != 0) goto L_0x0181
                    if (r4 != 0) goto L_0x014f
                    goto L_0x0181
                L_0x014f:
                    java.lang.String r3 = r9.f249581a
                    boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                    if (r4 != 0) goto L_0x01a5
                    if (r0 == 0) goto L_0x01a5
                    boolean r4 = r0.isEmpty()
                    if (r4 != 0) goto L_0x01a5
                    com.tencent.mm.plugin.appbrand.appcache.m3 r4 = com.tencent.p014mm.plugin.appbrand.appcache.C81293m3.m99678d()
                    if (r4 != 0) goto L_0x0166
                    goto L_0x01a5
                L_0x0166:
                    js0.l<java.lang.String, com.tencent.mm.plugin.appbrand.appcache.m3$$b> r4 = r4.f238705a
                    r4.getClass()
                    if (r3 == 0) goto L_0x01a5
                    boolean r5 = r0.isEmpty()
                    if (r5 == 0) goto L_0x0174
                    goto L_0x01a5
                L_0x0174:
                    java.util.Set r3 = r4.mo122462c(r3, r12)
                    monitor-enter(r3)
                    r3.addAll(r0)     // Catch:{ all -> 0x017e }
                    monitor-exit(r3)     // Catch:{ all -> 0x017e }
                    goto L_0x01a5
                L_0x017e:
                    r0 = move-exception
                    monitor-exit(r3)     // Catch:{ all -> 0x017e }
                    throw r0
                L_0x0181:
                    if (r0 == 0) goto L_0x039a
                    java.util.Iterator r0 = r0.iterator()
                L_0x0187:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L_0x039a
                    java.lang.Object r2 = r0.next()
                    com.tencent.mm.plugin.appbrand.appcache.m3$$b r2 = (com.tencent.p014mm.plugin.appbrand.appcache.m3$$b) r2
                    T r3 = r6.f29691a
                    java.lang.String r3 = (java.lang.String) r3
                    T r4 = r8.f29691a
                    ei0.b$a r4 = (ei0.C86518b.C86519a) r4
                    T r5 = r13.f29691a
                    com.tencent.mm.plugin.appbrand.appcache.m3$$c r5 = (com.tencent.p014mm.plugin.appbrand.appcache.m3$$c) r5
                    r2.mo113493a(r3, r4, r5)
                    goto L_0x0187
                L_0x01a3:
                    r21 = r15
                L_0x01a5:
                    com.tencent.p014mm.vfs.C86013q1.m106447h(r21)
                    java.lang.String r0 = r9.f249583c
                    com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
                    java.lang.String r0 = r9.f249581a
                    java.util.Collection r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81293m3.m99680f(r0, r12)
                    com.tencent.mm.plugin.appbrand.appcache.s0 r3 = new com.tencent.mm.plugin.appbrand.appcache.s0
                    r3.<init>(r0, r9)
                    com.tencent.mm.plugin.appbrand.appcache.m3$$b r0 = r9.f238726s
                    boolean r4 = r0 instanceof ei0.C86520c
                    if (r4 == 0) goto L_0x01c4
                    ei0.c r0 = (ei0.C86520c) r0
                    r4 = 0
                    r0.mo120991a(r4)
                L_0x01c4:
                    java.lang.String r0 = r9.f251357l
                    int r4 = r9.f238725r
                    java.lang.String r5 = "downloadURL"
                    java.lang.String[] r5 = new java.lang.String[]{r5}
                    com.tencent.mm.plugin.appbrand.appcache.z2 r0 = r7.mo113533pl(r0, r4, r11, r5)
                    if (r0 == 0) goto L_0x01f1
                    java.lang.String r4 = r0.field_downloadURL
                    boolean r4 = android.text.TextUtils.isEmpty(r4)
                    if (r4 == 0) goto L_0x01dd
                    goto L_0x01f1
                L_0x01dd:
                    java.lang.String r4 = r9.f251357l
                    int r5 = r9.f238725r
                    java.lang.String r0 = r0.field_downloadURL
                    boolean r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81293m3.m99683i(r4, r11, r5, r0, r3)
                    if (r0 != 0) goto L_0x039a
                    java.lang.String r0 = r9.f251357l
                    r4 = 0
                    r3.mo113493a(r0, r2, r4)
                    goto L_0x039a
                L_0x01f1:
                    r4 = 0
                    java.lang.String r0 = "MicroMsg.AppBrand.IncrementalPkgLogic[incremental]"
                    java.lang.String r5 = "onIncrementalPkgDownloadComplete, fallback non-incremental get EMPTY url with key[%s]"
                    java.lang.Object[] r6 = new java.lang.Object[r12]
                    java.lang.String r7 = r9.f249581a
                    r6[r11] = r7
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r5, r6)
                    java.lang.String r0 = r9.f251357l
                    r3.mo113493a(r0, r2, r4)
                    goto L_0x039a
                L_0x0206:
                    boolean r4 = r9 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81234b4
                    if (r4 == 0) goto L_0x0358
                    com.tencent.mm.plugin.appbrand.appcache.b4 r9 = (com.tencent.p014mm.plugin.appbrand.appcache.C81234b4) r9
                    com.tencent.mm.plugin.appbrand.appcache.k1$a r3 = r8.f238839j
                    int r4 = com.tencent.p014mm.plugin.appbrand.appcache.C81237c4.f238632a
                    di3.d r0 = di3.C86312j.m106911c(r0)
                    di0.l r0 = (di0.C86296l) r0
                    com.tencent.mm.plugin.appbrand.appcache.h3 r4 = r0.mo113349uv()
                    if (r4 != 0) goto L_0x0226
                    java.lang.String r0 = r9.f249581a
                    java.lang.String r3 = r9.f251357l
                    r4 = 0
                    com.tencent.p014mm.plugin.appbrand.appcache.C81293m3.m99676b(r0, r3, r2, r4)
                    goto L_0x039a
                L_0x0226:
                    r3.mo113479f()
                    java.lang.String r0 = r9.f249583c
                    android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
                    java.lang.String r6 = r5.getPath()
                    if (r6 == 0) goto L_0x024f
                    java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r11, r11)
                    java.lang.String r7 = r5.getPath()
                    boolean r7 = r7.equals(r6)
                    if (r7 != 0) goto L_0x024f
                    android.net.Uri$Builder r5 = r5.buildUpon()
                    android.net.Uri$Builder r5 = r5.path(r6)
                    android.net.Uri r5 = r5.build()
                L_0x024f:
                    com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                    r7 = 0
                    com.tencent.mm.vfs.f0$h r6 = r6.mo177799l(r5, r7)
                    boolean r7 = r6.mo177810a()
                    if (r7 != 0) goto L_0x025e
                    r6 = 0
                    goto L_0x0266
                L_0x025e:
                    com.tencent.mm.vfs.FileSystem$c r7 = r6.f348991a
                    java.lang.String r6 = r6.f348992b
                    boolean r6 = r7.mo119948x(r6)
                L_0x0266:
                    java.lang.String r7 = "MicroMsg.AppBrand.ZstdLogic"
                    if (r6 != 0) goto L_0x0271
                    java.lang.String r0 = "mayProcessZstd downloadFile not exists"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
                    goto L_0x02e2
                L_0x0271:
                    com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
                    java.lang.String r8 = r9.mo113488i()
                    r6.<init>((java.lang.String) r8)
                    boolean r8 = r6.mo119967g()
                    if (r8 == 0) goto L_0x028c
                    boolean r8 = r6.mo119966f()
                    if (r8 != 0) goto L_0x028c
                    java.lang.String r0 = "mayProcessZstd targetFile delete failed"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
                    goto L_0x02e2
                L_0x028c:
                    com.tencent.mars.zstd.ZstdInputStream r8 = new com.tencent.mars.zstd.ZstdInputStream     // Catch:{ Exception -> 0x02c8, all -> 0x02c3 }
                    java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163865u(r5)     // Catch:{ Exception -> 0x02c8, all -> 0x02c3 }
                    java.io.InputStream r5 = com.tencent.p014mm.vfs.C86013q1.m106423E(r5)     // Catch:{ Exception -> 0x02c8, all -> 0x02c3 }
                    r8.<init>(r5)     // Catch:{ Exception -> 0x02c8, all -> 0x02c3 }
                    java.io.OutputStream r5 = com.tencent.p014mm.vfs.C86013q1.m106426H(r6)     // Catch:{ Exception -> 0x02c0, all -> 0x02be }
                    r6 = 8192(0x2000, float:1.14794E-41)
                    byte[] r10 = new byte[r6]     // Catch:{ Exception -> 0x02bc }
                L_0x02a1:
                    int r13 = r8.read(r10, r11, r6)     // Catch:{ Exception -> 0x02bc }
                    r14 = -1
                    if (r13 == r14) goto L_0x02ac
                    r5.write(r10, r11, r13)     // Catch:{ Exception -> 0x02bc }
                    goto L_0x02a1
                L_0x02ac:
                    r5.flush()     // Catch:{ Exception -> 0x02bc }
                    com.tencent.p014mm.vfs.C86013q1.m106447h(r0)     // Catch:{ Exception -> 0x02bc }
                    r5.close()     // Catch:{ IOException -> 0x02b5 }
                L_0x02b5:
                    r8.close()     // Catch:{ IOException -> 0x02b9 }
                    goto L_0x02ba
                L_0x02b9:
                L_0x02ba:
                    r0 = 1
                    goto L_0x02e3
                L_0x02bc:
                    r0 = move-exception
                    goto L_0x02cb
                L_0x02be:
                    r0 = move-exception
                    goto L_0x02c5
                L_0x02c0:
                    r0 = move-exception
                    r5 = 0
                    goto L_0x02cb
                L_0x02c3:
                    r0 = move-exception
                    r8 = 0
                L_0x02c5:
                    r13 = 0
                    goto L_0x034b
                L_0x02c8:
                    r0 = move-exception
                    r5 = 0
                    r8 = 0
                L_0x02cb:
                    java.lang.String r6 = "mayProcessZstd exp: %s"
                    java.lang.Object[] r10 = new java.lang.Object[r12]     // Catch:{ all -> 0x0349 }
                    r10[r11] = r0     // Catch:{ all -> 0x0349 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r6, r10)     // Catch:{ all -> 0x0349 }
                    if (r5 == 0) goto L_0x02db
                    r5.close()     // Catch:{ IOException -> 0x02da }
                    goto L_0x02db
                L_0x02da:
                L_0x02db:
                    if (r8 == 0) goto L_0x02e2
                    r8.close()     // Catch:{ IOException -> 0x02e1 }
                    goto L_0x02e2
                L_0x02e1:
                L_0x02e2:
                    r0 = 0
                L_0x02e3:
                    r3.mo113474a(r0)
                    r5 = 2
                    java.lang.Object[] r5 = new java.lang.Object[r5]
                    java.lang.String r6 = r9.f251357l
                    r5[r11] = r6
                    java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
                    r5[r12] = r6
                    java.lang.String r6 = "processZstd, appId:%s, success:%b"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r6, r5)
                    if (r0 == 0) goto L_0x0314
                    java.lang.String r13 = r9.f249581a
                    java.lang.String r14 = r9.f251357l
                    java.lang.String r15 = r9.mo113488i()
                    int r0 = r9.f238620q
                    int r2 = r9.f251359n
                    r18 = 0
                    r16 = r0
                    r17 = r2
                    r19 = r3
                    com.tencent.p014mm.plugin.appbrand.appcache.C81293m3.m99679e(r13, r14, r15, r16, r17, r18, r19)
                    goto L_0x039a
                L_0x0314:
                    java.lang.String r0 = r9.mo113488i()
                    com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
                    java.lang.String r0 = r9.f251357l
                    int r3 = r9.f238620q
                    int r5 = r9.f251359n
                    java.lang.String r6 = "downloadURL"
                    java.lang.String[] r6 = new java.lang.String[]{r6}
                    com.tencent.mm.plugin.appbrand.appcache.z2 r0 = r4.mo113533pl(r0, r3, r5, r6)
                    if (r0 != 0) goto L_0x0336
                    java.lang.String r0 = r9.f249581a
                    java.lang.String r3 = r9.f251357l
                    r4 = 0
                    com.tencent.p014mm.plugin.appbrand.appcache.C81293m3.m99676b(r0, r3, r2, r4)
                    goto L_0x039a
                L_0x0336:
                    java.lang.String r2 = r9.f249581a
                    com.tencent.p014mm.plugin.appbrand.appcache.C81293m3.m99680f(r2, r12)
                    java.lang.String r2 = r9.f251357l
                    int r3 = r9.f251359n
                    int r4 = r9.f238620q
                    java.lang.String r0 = r0.field_downloadURL
                    com.tencent.mm.plugin.appbrand.appcache.m3$$b r5 = r9.f238621r
                    com.tencent.p014mm.plugin.appbrand.appcache.C81293m3.m99683i(r2, r3, r4, r0, r5)
                    goto L_0x039a
                L_0x0349:
                    r0 = move-exception
                    r13 = r5
                L_0x034b:
                    if (r13 == 0) goto L_0x0352
                    r13.close()     // Catch:{ IOException -> 0x0351 }
                    goto L_0x0352
                L_0x0351:
                L_0x0352:
                    if (r8 == 0) goto L_0x0357
                    r8.close()     // Catch:{ IOException -> 0x0357 }
                L_0x0357:
                    throw r0
                L_0x0358:
                    boolean r0 = r9 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81297o
                    if (r0 == 0) goto L_0x0366
                    com.tencent.mm.plugin.appbrand.appcache.n r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81294n.INSTANCE
                    com.tencent.mm.plugin.appbrand.appcache.o r9 = (com.tencent.p014mm.plugin.appbrand.appcache.C81297o) r9
                    com.tencent.mm.plugin.appbrand.appcache.k1$a r2 = r8.f238839j
                    r0.mo113569b(r9, r3, r2)
                    goto L_0x039a
                L_0x0366:
                    java.lang.String r4 = r9.f251357l
                    int r15 = r9.f251358m
                    int r0 = r9.f251359n
                    boolean r5 = r9 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81296n2     // Catch:{ Exception -> 0x038a }
                    if (r5 == 0) goto L_0x0377
                    com.tencent.mm.plugin.appbrand.appcache.n2 r9 = (com.tencent.p014mm.plugin.appbrand.appcache.C81296n2) r9     // Catch:{ Exception -> 0x038a }
                    java.lang.String r5 = r9.f238714q     // Catch:{ Exception -> 0x038a }
                    r17 = r5
                    goto L_0x0379
                L_0x0377:
                    r17 = 0
                L_0x0379:
                    java.lang.String r12 = r3.f249592a     // Catch:{ Exception -> 0x038a }
                    java.lang.String r14 = r3.f249594c     // Catch:{ Exception -> 0x038a }
                    com.tencent.mm.plugin.appbrand.appcache.t2$e r7 = (com.tencent.p014mm.plugin.appbrand.appcache.C81355t2.C81360e) r7     // Catch:{ Exception -> 0x038a }
                    com.tencent.mm.plugin.appbrand.appcache.k1$a r5 = r7.f238839j     // Catch:{ Exception -> 0x038a }
                    r13 = r4
                    r16 = r0
                    r18 = r5
                    com.tencent.p014mm.plugin.appbrand.appcache.C81293m3.m99679e(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x038a }
                    goto L_0x039a
                L_0x038a:
                    r0 = move-exception
                    java.lang.String r5 = "MicroMsg.WxaPkgDownloadPerformer"
                    java.lang.String r6 = "dispatchComplete"
                    java.lang.Object[] r7 = new java.lang.Object[r11]
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r6, r7)
                    java.lang.String r0 = r3.f249592a
                    r3 = 0
                    com.tencent.p014mm.plugin.appbrand.appcache.C81293m3.m99676b(r0, r4, r2, r3)
                L_0x039a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81355t2.C81362f.C81363a.run():void");
            }
        }

        /* renamed from: a */
        public void mo113644a(String str, int i, int i2) {
        }

        /* renamed from: b */
        public void mo113645b(String str, long j) {
        }

        /* renamed from: c */
        public void mo113646c(C85631f fVar, C85639p pVar) {
            this.f238840a.post(new C81363a(pVar, fVar));
        }

        /* renamed from: d */
        public final void mo113647d(C81360e eVar, C85639p pVar) {
            C86518b.C86519a aVar = C86518b.C86519a.FAILED;
            C86518b.C86519a aVar2 = C86518b.C86519a.ENV_ERR;
            Class cls = C86296l.class;
            C86013q1.m106447h(pVar.f249594c);
            C86516a aVar3 = (C86516a) eVar.f249577d;
            if (aVar3 instanceof C81297o) {
                C81294n.INSTANCE.mo113569b((C81297o) aVar3, pVar, eVar.f238839j);
            } else if (aVar3 instanceof C81300o2) {
                C81300o2 o2Var = (C81300o2) aVar3;
                C81282k1.C81283a aVar4 = eVar.f238839j;
                Log.m105921e("MicroMsg.AppBrand.IncrementalPkgLogic[incremental]", "onIncrementalPkgDownloadFail, request(%s %d->%d)", o2Var.f251357l, Integer.valueOf(o2Var.f238724q), Integer.valueOf(o2Var.f238725r));
                aVar4.mo113478e(pVar);
                C81258h3 uv = ((C86296l) C86312j.m106911c(cls)).mo113349uv();
                if (uv == null) {
                    Log.m105920e("MicroMsg.AppBrand.IncrementalPkgLogic[incremental]", "onIncrementalPkgDownloadFail, before fallback full_pkg, nil storage");
                    C81293m3.m99676b(o2Var.f249581a, o2Var.f251357l, aVar2, (m3$$c) null);
                    return;
                }
                C81293m3.m99680f(o2Var.f249581a, true);
                C29315z2 m = uv.mo113533pl(o2Var.f251357l, o2Var.f238725r, 0, "downloadURL");
                if (m == null) {
                    Log.m105921e("MicroMsg.AppBrand.IncrementalPkgLogic[incremental]", "onIncrementalPkgDownloadFail, before fallback full_pkg, nil record(%s %d)", o2Var.f251357l, Integer.valueOf(o2Var.f238725r));
                    return;
                }
                m3$$b m3__b = o2Var.f238726s;
                if (m3__b instanceof C86520c) {
                    ((C86520c) m3__b).mo120991a(pVar);
                }
                C81293m3.m99683i(o2Var.f251357l, 0, o2Var.f238725r, m.field_downloadURL, o2Var.f238726s);
            } else if (aVar3 instanceof C81234b4) {
                C81234b4 b4Var = (C81234b4) aVar3;
                C81282k1.C81283a aVar5 = eVar.f238839j;
                int i = C81237c4.f238632a;
                Log.m105921e("MicroMsg.AppBrand.ZstdLogic", "onZstdPkgDownloadFail, request(%s %d)", b4Var.f251357l, Integer.valueOf(b4Var.f238620q));
                aVar5.mo113478e(pVar);
                C81258h3 uv4 = ((C86296l) C86312j.m106911c(cls)).mo113349uv();
                if (uv4 == null) {
                    Log.m105920e("MicroMsg.AppBrand.ZstdLogic", "onZstdPkgDownloadFail, before fallback full_pkg, nil storage");
                    C81293m3.m99676b(b4Var.f249581a, b4Var.f251357l, aVar2, (m3$$c) null);
                    return;
                }
                C81293m3.m99680f(b4Var.f249581a, true);
                m3$$b m3__b2 = b4Var.f238621r;
                if (m3__b2 instanceof C86521d) {
                    ((C86521d) m3__b2).mo120992a(pVar);
                    C29315z2 m2 = uv4.mo113533pl(b4Var.f251357l, b4Var.f238620q, b4Var.f251359n, "downloadURL");
                    if (m2 == null) {
                        Log.m105921e("MicroMsg.AppBrand.ZstdLogic", "onZstdPkgDownloadFail, before fallback full_pkg, nil record(%s %d)", b4Var.f251357l, Integer.valueOf(b4Var.f238620q));
                    } else if (!C81293m3.m99683i(b4Var.f251357l, b4Var.f251359n, b4Var.f238620q, m2.field_downloadURL, b4Var.f238621r)) {
                        b4Var.f238621r.mo113493a(b4Var.f251357l, aVar2, null);
                    }
                } else {
                    m3__b2.mo113493a(b4Var.f251357l, aVar, null);
                }
            } else {
                String str = aVar3.f251357l;
                if (pVar.f249599h instanceof C89599a) {
                    aVar = C86518b.C86519a.DISK_FULL;
                } else {
                    int i2 = pVar.f249600i;
                    if (i2 == 403 || i2 == 404) {
                        aVar = C86518b.C86519a.SEVER_FILE_NOT_FOUND;
                    }
                }
                String str2 = pVar.f249592a;
                if (C81293m3.m99678d() == null) {
                    Log.m105920e("MicroMsg.WxaPkgUpdater", "onDownloadFail, get instance null !!!");
                } else {
                    C81293m3.m99676b(str2, str, aVar, (m3$$c) null);
                }
            }
        }
    }

    /* renamed from: b */
    public static String m99776b() {
        String str;
        synchronized (C112760b.class) {
            str = C112760b.m154225d() + "appbrand/pkg/";
        }
        FilePathGenerator.checkMkdir(str);
        return str;
    }

    /* renamed from: c */
    public static String m99777c() {
        String str = C86709a0.m107535s().f251807e;
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        String str2 = str + "appbrand/pkg/";
        FilePathGenerator.checkMkdir(str2);
        return str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a2, code lost:
        cy3.C58003b.m67160a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
        throw r1;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m99778d(java.lang.String r6) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x000b
            goto L_0x00aa
        L_0x000b:
            java.lang.String r0 = "@LibraryAppId"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x0016
            r2 = 1
            goto L_0x00aa
        L_0x0016:
            java.lang.Class<kr0.b1> r0 = kr0.C33987b1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl"
            gy3.C87412m.m108592e(r0, r4)
            com.tencent.mm.plugin.appbrand.appcache.predownload.export.p r0 = (com.tencent.p014mm.plugin.appbrand.appcache.predownload.export.C81331p) r0
            java.util.List r0 = r0.vx0()
            java.util.Iterator r0 = r0.iterator()
        L_0x002b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0045
            java.lang.Object r4 = r0.next()
            com.tencent.mm.plugin.appbrand.appcache.predownload.export.p$b r4 = (com.tencent.p014mm.plugin.appbrand.appcache.predownload.export.C81331p.C29266b) r4
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            java.lang.String r4 = r4.f79951d
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L_0x002b
            r4 = 1
            goto L_0x00a7
        L_0x0045:
            java.lang.Class<com.tencent.mm.plugin.appbrand.appusage.d0> r0 = com.tencent.p014mm.plugin.appbrand.appusage.C81477d0.class
            java.lang.Object r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)
            com.tencent.mm.plugin.appbrand.appusage.d0 r0 = (com.tencent.p014mm.plugin.appbrand.appusage.C81477d0) r0
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 == 0) goto L_0x0054
            goto L_0x0060
        L_0x0054:
            r4 = 36
            int r4 = r6.indexOf(r4)
            if (r4 < 0) goto L_0x0060
            java.lang.String r6 = r6.substring(r2, r4)
        L_0x0060:
            r0.getClass()
            if (r6 != 0) goto L_0x0066
            goto L_0x00a6
        L_0x0066:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "select count(*) from AppBrandMessInfoRecord where appId = '"
            r4.append(r5)
            r4.append(r6)
            java.lang.String r6 = "' and (wechatPluginApp > 0 or appServiceType = 7)"
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            java.lang.String[] r4 = new java.lang.String[r2]
            android.database.Cursor r6 = r0.rawQuery(r6, r4)
            if (r6 == 0) goto L_0x00a6
            r0 = 0
            boolean r4 = r6.moveToFirst()     // Catch:{ all -> 0x009f }
            if (r4 == 0) goto L_0x0099
            int r4 = r6.getInt(r2)     // Catch:{ all -> 0x009f }
            if (r4 <= 0) goto L_0x0094
            r4 = 1
            goto L_0x0095
        L_0x0094:
            r4 = 0
        L_0x0095:
            cy3.C58003b.m67160a(r6, r0)
            goto L_0x00a7
        L_0x0099:
            rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x009f }
            cy3.C58003b.m67160a(r6, r0)
            goto L_0x00a6
        L_0x009f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r1 = move-exception
            cy3.C58003b.m67160a(r6, r0)
            throw r1
        L_0x00a6:
            r4 = 0
        L_0x00a7:
            if (r4 == 0) goto L_0x00aa
            r2 = 2
        L_0x00aa:
            if (r2 == r3) goto L_0x00e0
            if (r2 == r1) goto L_0x00c7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = m99776b()
            r6.append(r0)
            java.lang.String r0 = "general/"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.FilePathGenerator.checkMkdir(r6)
            goto L_0x00f8
        L_0x00c7:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = m99776b()
            r6.append(r0)
            java.lang.String r0 = "firstParty/"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.FilePathGenerator.checkMkdir(r6)
            goto L_0x00f8
        L_0x00e0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = m99776b()
            r6.append(r0)
            java.lang.String r0 = "commLib/"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.FilePathGenerator.checkMkdir(r6)
        L_0x00f8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81355t2.m99778d(java.lang.String):java.lang.String");
    }

    /* renamed from: e */
    public static void m99779e(String str, List<C86009m1> list) {
        C86009m1[] u;
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119967g() && m1Var.mo119977o() && (u = m1Var.mo119984u()) != null) {
            for (C86009m1 m1Var2 : u) {
                if (m1Var2.mo119978p()) {
                    list.add(m1Var2);
                } else if (m1Var2.mo119977o()) {
                    m99779e(m1Var2.mo119971i(), list);
                }
            }
        }
    }

    /* renamed from: a */
    public int mo113631a(C86516a aVar) {
        if (this.f238836a.mo119166e(aVar.f249581a)) {
            Log.m105925i("MicroMsg.WxaPkgDownloadPerformer", "addRequestIfNotRunning, urlKey %s already in queue", aVar.f249581a);
            return 0;
        }
        int h = this.f238836a.mo113634h(aVar);
        Log.m105925i("MicroMsg.WxaPkgDownloadPerformer", "addRequestIfNotRunning, urlKey %s, addResult %d", aVar.f249581a, Integer.valueOf(h));
        return h;
    }
}
