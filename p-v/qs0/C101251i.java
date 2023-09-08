package qs0;

import android.net.Uri;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import k34.C117388a;
import qs0.C101246f;
import qs0.C101249h;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: qs0.i */
public final class C101251i extends C117388a {

    /* renamed from: p */
    public static final AtomicInteger f296478p = new AtomicInteger(1);

    /* renamed from: d */
    public final String f296479d;

    /* renamed from: e */
    public final C32227p<Long, Long, C13598b0> f296480e;

    /* renamed from: f */
    public final String f296481f;

    /* renamed from: g */
    public final C101246f.C101248b f296482g;

    /* renamed from: h */
    public final String f296483h;

    /* renamed from: i */
    public final String f296484i;

    /* renamed from: j */
    public volatile Boolean f296485j;

    /* renamed from: n */
    public final C32226l<Boolean, C13598b0> f296486n;

    /* renamed from: o */
    public final C32227p<Long, Long, C13598b0> f296487o;

    /* renamed from: qs0.i$a */
    public static final class C36077a extends C87413o implements C32224a<List<? extends String>> {

        /* renamed from: d */
        public static final C36077a f96163d = new C36077a();

        public C36077a() {
            super(0);
        }

        public Object invoke() {
            C101249h.f296467d.getClass();
            ReentrantLock reentrantLock = C101249h.f296468e;
            reentrantLock.lock();
            try {
                Set<String> keySet = C101249h.f296469f.keySet();
                C87412m.m108593f(keySet, "taskInfos.keys");
                return C110818d0.m150953y0(keySet);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: qs0.i$c */
    public static final class C36078c extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101251i f96164d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36078c(C101251i iVar) {
            super(1);
            this.f96164d = iVar;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            String str = this.f96164d.f296481f;
            Log.m105924i(str, "startCallback, startRet: " + booleanValue);
            this.f96164d.f296485j = Boolean.valueOf(booleanValue);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qs0.i$b */
    public static final class C101252b extends C87413o implements C32227p<Long, Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101251i f296488d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101252b(C101251i iVar) {
            super(2);
            this.f296488d = iVar;
        }

        public Object invoke(Object obj, Object obj2) {
            long longValue = ((Number) obj).longValue();
            long longValue2 = ((Number) obj2).longValue();
            String str = this.f296488d.f296481f;
            Log.m105924i(str, "progressCallback, finished: " + longValue + ", total: " + longValue2);
            C32227p<Long, Long, C13598b0> pVar = this.f296488d.f296480e;
            if (pVar != null) {
                pVar.invoke(Long.valueOf(longValue), Long.valueOf(longValue2));
            }
            if (longValue >= longValue2) {
                C101246f fVar = C101246f.f296460a;
                C101246f.C101248b bVar = this.f296488d.f296482g;
                C87412m.m108594g(bVar, "cacheInfoHolder");
                C101246f.C101247a aVar = bVar.f296466a;
                Log.m105924i("MicroMsg.AppBrand.ThumbCdnCacheManager", "onCacheFinish, cacheInfo: " + aVar);
                C101246f.C101247a a = C101246f.C101247a.m132824a(aVar, (String) null, (String) null, (String) null, true, 7, (Object) null);
                bVar.f296466a = a;
                fVar.mo140716a(a);
            } else {
                C101246f.f296460a.mo140718c(this.f296488d.f296482g);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C101251i(java.lang.String r13, fy3.C32227p<? super java.lang.Long, ? super java.lang.Long, rx3.C13598b0> r14) {
        /*
            r12 = this;
            java.lang.String r0 = "srcUrl"
            gy3.C87412m.m108594g(r13, r0)
            r12.<init>()
            r12.f296479d = r13
            r12.f296480e = r14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MicroMsg.AppBrand.ThumbCdnResourceLoader#"
            r0.append(r1)
            int r1 = r12.hashCode()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.f296481f = r0
            qs0.f r1 = qs0.C101246f.f296460a
            java.nio.charset.Charset r2 = z04.C119027c.f356488a
            byte[] r2 = r13.getBytes(r2)
            java.lang.String r3 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.String r2 = p823sg.C90193h.m112878f(r2)
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1
            com.tencent.mm.vfs.m1 r4 = r1.mo140717b()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r6 = ".res"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r3.<init>((com.tencent.p014mm.vfs.C86009m1) r4, (java.lang.String) r5)
            com.tencent.mm.vfs.m1 r1 = r1.mo140717b()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r5 = ".mark"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 0
            if (r1 != 0) goto L_0x006a
            r1 = r5
            goto L_0x006c
        L_0x006a:
            android.net.Uri r1 = r1.f250486d
        L_0x006c:
            if (r1 != 0) goto L_0x0078
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            android.net.Uri$Builder r1 = r1.path(r4)
            goto L_0x0085
        L_0x0078:
            android.net.Uri$Builder r1 = r1.buildUpon()
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L_0x0085
            r1.appendPath(r4)
        L_0x0085:
            android.net.Uri r4 = r1.build()
            java.lang.String r6 = r4.getPath()
            r7 = 0
            if (r6 == 0) goto L_0x00a6
            java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r7, r7)
            java.lang.String r8 = r4.getPath()
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x00a6
            android.net.Uri$Builder r1 = r1.path(r6)
            android.net.Uri r4 = r1.build()
        L_0x00a6:
            boolean r1 = r3.mo119967g()
            if (r1 == 0) goto L_0x00c6
            com.tencent.mm.vfs.f0 r1 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r1 = r1.mo177799l(r4, r5)
            boolean r4 = r1.mo177810a()
            if (r4 != 0) goto L_0x00ba
            r1 = 0
            goto L_0x00c2
        L_0x00ba:
            com.tencent.mm.vfs.FileSystem$c r4 = r1.f348991a
            java.lang.String r1 = r1.f348992b
            boolean r1 = r4.mo119948x(r1)
        L_0x00c2:
            if (r1 == 0) goto L_0x00c6
            r1 = 1
            goto L_0x00c7
        L_0x00c6:
            r1 = 0
        L_0x00c7:
            java.lang.String r3 = r3.mo119971i()
            r4 = r1 ^ 1
            java.lang.String r3 = com.tencent.p014mm.vfs.C86013q1.m106448i(r3, r4)
            if (r3 != 0) goto L_0x00d5
            java.lang.String r3 = ""
        L_0x00d5:
            qs0.f$a r4 = new qs0.f$a
            java.lang.String r6 = "downloadId"
            gy3.C87412m.m108593f(r2, r6)
            r4.<init>(r13, r2, r3, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getCacheInfo, cacheInfo: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.AppBrand.ThumbCdnCacheManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            qs0.f$b r1 = new qs0.f$b
            r1.<init>(r4)
            r12.f296482g = r1
            qs0.f$a r3 = r1.f296466a
            java.lang.String r4 = r3.f296463b
            r12.f296483h = r4
            java.lang.String r3 = r3.f296464c
            r12.f296484i = r3
            qs0.i$c r8 = new qs0.i$c
            r8.<init>(r12)
            r12.f296486n = r8
            qs0.i$b r9 = new qs0.i$b
            r9.<init>(r12)
            r12.f296487o = r9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "<init>, srcUrl: "
            r10.append(r11)
            r10.append(r13)
            java.lang.String r13 = ", downloadId: "
            r10.append(r13)
            r10.append(r4)
            java.lang.String r13 = ", cachePath: "
            r10.append(r13)
            r10.append(r3)
            java.lang.String r13 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)
            qs0.f$a r13 = r1.f296466a
            boolean r13 = r13.f296465d
            if (r13 != 0) goto L_0x01f0
            qs0.h r13 = qs0.C101249h.f296467d
            r13.getClass()
            gy3.C87412m.m108594g(r4, r6)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "listenDownload, downloadId: "
            r13.append(r14)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "MicroMsg.AppBrand.ThumbCdnDownloadManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r13)
            java.util.concurrent.locks.ReentrantLock r13 = qs0.C101249h.f296474n
            r13.lock()
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.ref.WeakReference<fy3.p<java.lang.Long, java.lang.Long, rx3.b0>>>> r14 = qs0.C101249h.f296475o     // Catch:{ all -> 0x01eb }
            java.lang.Object r0 = r14.get(r4)     // Catch:{ all -> 0x01eb }
            if (r0 != 0) goto L_0x0172
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x01eb }
            r0.<init>()     // Catch:{ all -> 0x01eb }
            r14.put(r4, r0)     // Catch:{ all -> 0x01eb }
        L_0x0172:
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x01eb }
            java.lang.ref.WeakReference r14 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x01eb }
            r14.<init>(r9)     // Catch:{ all -> 0x01eb }
            r0.add(r14)     // Catch:{ all -> 0x01eb }
            r13.unlock()
            java.util.concurrent.locks.ReentrantLock r13 = qs0.C101249h.f296471h
            r13.lock()
            java.util.HashMap<java.lang.String, java.lang.Boolean> r14 = qs0.C101249h.f296472i     // Catch:{ all -> 0x01e6 }
            java.lang.Object r14 = r14.get(r4)     // Catch:{ all -> 0x01e6 }
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ all -> 0x01e6 }
            if (r14 != 0) goto L_0x01ac
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.ref.WeakReference<fy3.l<java.lang.Boolean, rx3.b0>>>> r14 = qs0.C101249h.f296473j     // Catch:{ all -> 0x01e6 }
            java.lang.Object r0 = r14.get(r4)     // Catch:{ all -> 0x01e6 }
            if (r0 != 0) goto L_0x019e
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x01e6 }
            r0.<init>()     // Catch:{ all -> 0x01e6 }
            r14.put(r4, r0)     // Catch:{ all -> 0x01e6 }
        L_0x019e:
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x01e6 }
            java.lang.ref.WeakReference r14 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x01e6 }
            r14.<init>(r8)     // Catch:{ all -> 0x01e6 }
            r0.add(r14)     // Catch:{ all -> 0x01e6 }
            r13.unlock()
            goto L_0x01ba
        L_0x01ac:
            r13.unlock()
            boolean r13 = r14.booleanValue()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r8.invoke(r13)
        L_0x01ba:
            qs0.i$a r13 = qs0.C101251i.C36077a.f96163d
            java.lang.String r14 = "downloadingTasksResolver"
            gy3.C87412m.m108594g(r13, r14)
            qs0.f$a r14 = r1.f296466a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onCacheStart, cacheInfo: "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r14)
            zt3.t r14 = zt3.C119157j.f356862d
            qs0.g r0 = new qs0.g
            r0.<init>(r13)
            zt3.j r14 = (zt3.C119157j) r14
            r14.mo183876g(r0, r2)
            goto L_0x025a
        L_0x01e6:
            r14 = move-exception
            r13.unlock()
            throw r14
        L_0x01eb:
            r14 = move-exception
            r13.unlock()
            throw r14
        L_0x01f0:
            java.lang.String r13 = "<init>, already cached, startRet: true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r12.f296485j = r13
            android.net.Uri r13 = com.tencent.p014mm.vfs.C116299g2.m163858n(r3)
            java.lang.String r1 = r13.getPath()
            if (r1 == 0) goto L_0x021d
            java.lang.String r1 = com.tencent.p014mm.vfs.C116299g2.m163855k(r1, r7, r7)
            java.lang.String r2 = r13.getPath()
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x021d
            android.net.Uri$Builder r13 = r13.buildUpon()
            android.net.Uri$Builder r13 = r13.path(r1)
            android.net.Uri r13 = r13.build()
        L_0x021d:
            com.tencent.mm.vfs.f0 r1 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r13 = r1.mo177799l(r13, r5)
            boolean r1 = r13.mo177810a()
            r2 = 0
            if (r1 != 0) goto L_0x022c
            goto L_0x0239
        L_0x022c:
            com.tencent.mm.vfs.FileSystem$c r1 = r13.f348991a
            java.lang.String r13 = r13.f348992b
            com.tencent.mm.vfs.b0 r13 = r1.mo119945q(r13)
            if (r13 != 0) goto L_0x0237
            goto L_0x0239
        L_0x0237:
            long r2 = r13.f250473c
        L_0x0239:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "<init>, already cached, total: "
            r13.append(r1)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)
            if (r14 == 0) goto L_0x025a
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r14.invoke(r13, r0)
        L_0x025a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qs0.C101251i.<init>(java.lang.String, fy3.p):void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.ref.WeakReference} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.ref.WeakReference} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.ref.WeakReference} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.ref.WeakReference} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo140724a() {
        /*
            r12 = this;
            java.lang.String r0 = r12.f296481f
            java.lang.String r1 = "onRelease"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            qs0.f$b r0 = r12.f296482g
            qs0.f$a r0 = r0.f296466a
            boolean r0 = r0.f296465d
            if (r0 != 0) goto L_0x014d
            r12.mo140726d()
            qs0.h r0 = qs0.C101249h.f296467d
            java.lang.String r1 = r12.f296483h
            fy3.l<java.lang.Boolean, rx3.b0> r2 = r12.f296486n
            fy3.p<java.lang.Long, java.lang.Long, rx3.b0> r3 = r12.f296487o
            r0.getClass()
            java.lang.String r0 = "downloadId"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "startCallback"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "progressCallback"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "unListenDownload, downloadId: "
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "MicroMsg.AppBrand.ThumbCdnDownloadManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            java.util.concurrent.locks.ReentrantLock r0 = qs0.C101249h.f296471h
            r0.lock()
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.ref.WeakReference<fy3.l<java.lang.Boolean, rx3.b0>>>> r4 = qs0.C101249h.f296473j     // Catch:{ all -> 0x0148 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x0148 }
            java.util.HashSet r4 = (java.util.HashSet) r4     // Catch:{ all -> 0x0148 }
            r5 = 0
            r6 = 1
            r7 = 0
            if (r4 != 0) goto L_0x0059
            goto L_0x00c1
        L_0x0059:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0148 }
            r8.<init>()     // Catch:{ all -> 0x0148 }
            java.util.Iterator r9 = r4.iterator()     // Catch:{ all -> 0x0148 }
        L_0x0062:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0148 }
            if (r10 == 0) goto L_0x007e
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0148 }
            r11 = r10
            java.lang.ref.WeakReference r11 = (java.lang.ref.WeakReference) r11     // Catch:{ all -> 0x0148 }
            java.lang.Object r11 = r11.get()     // Catch:{ all -> 0x0148 }
            if (r11 != 0) goto L_0x0077
            r11 = 1
            goto L_0x0078
        L_0x0077:
            r11 = 0
        L_0x0078:
            if (r11 == 0) goto L_0x0062
            r8.add(r10)     // Catch:{ all -> 0x0148 }
            goto L_0x0062
        L_0x007e:
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0148 }
        L_0x0082:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0148 }
            if (r9 == 0) goto L_0x0092
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0148 }
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9     // Catch:{ all -> 0x0148 }
            r4.remove(r9)     // Catch:{ all -> 0x0148 }
            goto L_0x0082
        L_0x0092:
            java.util.Iterator r8 = r4.iterator()     // Catch:{ all -> 0x0148 }
        L_0x0096:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0148 }
            if (r9 == 0) goto L_0x00ae
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0148 }
            r10 = r9
            java.lang.ref.WeakReference r10 = (java.lang.ref.WeakReference) r10     // Catch:{ all -> 0x0148 }
            java.lang.Object r10 = r10.get()     // Catch:{ all -> 0x0148 }
            boolean r10 = gy3.C87412m.m108589b(r2, r10)     // Catch:{ all -> 0x0148 }
            if (r10 == 0) goto L_0x0096
            goto L_0x00af
        L_0x00ae:
            r9 = r5
        L_0x00af:
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9     // Catch:{ all -> 0x0148 }
            if (r9 == 0) goto L_0x00b6
            r4.remove(r9)     // Catch:{ all -> 0x0148 }
        L_0x00b6:
            boolean r2 = r4.isEmpty()     // Catch:{ all -> 0x0148 }
            if (r2 == 0) goto L_0x00c1
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.ref.WeakReference<fy3.l<java.lang.Boolean, rx3.b0>>>> r2 = qs0.C101249h.f296473j     // Catch:{ all -> 0x0148 }
            r2.remove(r1)     // Catch:{ all -> 0x0148 }
        L_0x00c1:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0148 }
            r0.unlock()
            java.util.concurrent.locks.ReentrantLock r0 = qs0.C101249h.f296474n
            r0.lock()
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.ref.WeakReference<fy3.p<java.lang.Long, java.lang.Long, rx3.b0>>>> r2 = qs0.C101249h.f296475o     // Catch:{ all -> 0x0143 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0143 }
            java.util.HashSet r2 = (java.util.HashSet) r2     // Catch:{ all -> 0x0143 }
            if (r2 != 0) goto L_0x00d6
            goto L_0x013d
        L_0x00d6:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0143 }
            r4.<init>()     // Catch:{ all -> 0x0143 }
            java.util.Iterator r8 = r2.iterator()     // Catch:{ all -> 0x0143 }
        L_0x00df:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0143 }
            if (r9 == 0) goto L_0x00fb
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0143 }
            r10 = r9
            java.lang.ref.WeakReference r10 = (java.lang.ref.WeakReference) r10     // Catch:{ all -> 0x0143 }
            java.lang.Object r10 = r10.get()     // Catch:{ all -> 0x0143 }
            if (r10 != 0) goto L_0x00f4
            r10 = 1
            goto L_0x00f5
        L_0x00f4:
            r10 = 0
        L_0x00f5:
            if (r10 == 0) goto L_0x00df
            r4.add(r9)     // Catch:{ all -> 0x0143 }
            goto L_0x00df
        L_0x00fb:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0143 }
        L_0x00ff:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x0143 }
            if (r6 == 0) goto L_0x010f
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x0143 }
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6     // Catch:{ all -> 0x0143 }
            r2.remove(r6)     // Catch:{ all -> 0x0143 }
            goto L_0x00ff
        L_0x010f:
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x0143 }
        L_0x0113:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x0143 }
            if (r6 == 0) goto L_0x012b
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x0143 }
            r7 = r6
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7     // Catch:{ all -> 0x0143 }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x0143 }
            boolean r7 = gy3.C87412m.m108589b(r3, r7)     // Catch:{ all -> 0x0143 }
            if (r7 == 0) goto L_0x0113
            r5 = r6
        L_0x012b:
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch:{ all -> 0x0143 }
            if (r5 == 0) goto L_0x0132
            r2.remove(r5)     // Catch:{ all -> 0x0143 }
        L_0x0132:
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0143 }
            if (r2 == 0) goto L_0x013d
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.ref.WeakReference<fy3.p<java.lang.Long, java.lang.Long, rx3.b0>>>> r2 = qs0.C101249h.f296475o     // Catch:{ all -> 0x0143 }
            r2.remove(r1)     // Catch:{ all -> 0x0143 }
        L_0x013d:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0143 }
            r0.unlock()
            goto L_0x0155
        L_0x0143:
            r1 = move-exception
            r0.unlock()
            throw r1
        L_0x0148:
            r1 = move-exception
            r0.unlock()
            throw r1
        L_0x014d:
            java.lang.String r0 = r12.f296481f
            java.lang.String r1 = "onRelease, already cached"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x0155:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qs0.C101251i.mo140724a():void");
    }

    /* renamed from: c */
    public final void mo140725c() {
        if (!this.f296482g.f296466a.f296465d) {
            Log.m105924i(this.f296481f, "startDownload");
            C101249h.f296467d.mo140722a(this, this.f296479d, this.f296483h, this.f296484i, 0, -1);
            return;
        }
        Log.m105924i(this.f296481f, "startDownload, already cached");
    }

    /* renamed from: d */
    public final void mo140726d() {
        if (!this.f296482g.f296466a.f296465d) {
            Log.m105924i(this.f296481f, "stopDownload");
            try {
                C101249h.f296467d.mo140723b(this, this.f296483h);
            } catch (ConcurrentModificationException e) {
                Log.printErrStackTrace(this.f296481f, e, "stopDownload failure, ConcurrentModificationException", new Object[0]);
            }
        } else {
            Log.m105924i(this.f296481f, "stopDownload, already cached");
        }
    }

    public String getContentType(int i, String str) {
        return MimeTypes.VIDEO_MP4;
    }

    public String getDataFilePath(int i, String str) {
        return this.f296484i;
    }

    public long getDataTotalSize(int i, String str) {
        C86001b0 q;
        long j = 0;
        if (!this.f296482g.f296466a.f296465d) {
            C101249h hVar = C101249h.f296467d;
            String str2 = this.f296483h;
            hVar.getClass();
            C87412m.m108594g(str2, "downloadId");
            ReentrantLock reentrantLock = C101249h.f296468e;
            reentrantLock.lock();
            try {
                C101249h.C101250a aVar = C101249h.f296469f.get(str2);
                if (aVar != null) {
                    j = aVar.f296477b;
                    reentrantLock.unlock();
                }
                return j;
            } finally {
                reentrantLock.unlock();
            }
        } else {
            Log.m105924i(this.f296481f, "getDataTotalSize, already cached");
            Uri n = C116299g2.m163858n(this.f296484i);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
                return q.f250473c;
            }
            return 0;
        }
    }

    /* JADX INFO: finally extract failed */
    public int onReadData(int i, String str, long j, long j2) {
        int i2;
        long j3 = j;
        long j4 = j2;
        if (0 >= j4) {
            return 0;
        }
        if (!this.f296482g.f296466a.f296465d) {
            C101249h hVar = C101249h.f296467d;
            String str2 = this.f296483h;
            hVar.getClass();
            C87412m.m108594g(str2, "downloadId");
            ReentrantLock reentrantLock = C101249h.f296468e;
            reentrantLock.lock();
            try {
                C101249h.C101250a aVar = C101249h.f296469f.get(str2);
                if (aVar == null) {
                    reentrantLock.unlock();
                    i2 = 0;
                } else {
                    long j5 = aVar.f296477b;
                    if (0 == j5 || j5 != aVar.f296476a) {
                        C13598b0 b0Var = C13598b0.f38549a;
                        reentrantLock.unlock();
                        long[] jArr = new long[2];
                        if (CdnLogic.queryContinuousSize(str2, j3, jArr) == 0) {
                            long j6 = jArr[0];
                            if (-1 != j6) {
                                if (j6 > j4) {
                                    j6 = j4;
                                }
                                i2 = (int) j6;
                                Log.m105924i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "getCachedLength, downloadId: " + str2 + ", offset: " + j3 + ", expectedLength: " + j4 + ", lengthRet: " + i2);
                            }
                        }
                        i2 = 0;
                        Log.m105924i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "getCachedLength, downloadId: " + str2 + ", offset: " + j3 + ", expectedLength: " + j4 + ", lengthRet: " + i2);
                    } else {
                        long j7 = j5 - j3;
                        if (j4 <= j7) {
                            j7 = j4;
                        }
                        i2 = (int) j7;
                        reentrantLock.unlock();
                    }
                }
                if (i2 != 0) {
                    String str3 = this.f296481f;
                    Log.m105924i(str3, "onReadData, hasCachedLength: " + i2);
                    return i2;
                }
                hVar.mo140722a(this, this.f296479d, this.f296483h, this.f296484i, j, j2);
                return 0;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } else {
            Log.m105924i(this.f296481f, "onReadData, already cached");
            C101246f.f296460a.mo140718c(this.f296482g);
            return (int) j4;
        }
    }

    public int onStartReadData(int i, String str, long j, long j2) {
        mo140725c();
        Boolean bool = this.f296485j;
        if (!(bool != null ? bool.booleanValue() : false)) {
            Log.m105924i(this.f296481f, "onStartReadData, start fail");
        }
        int andIncrement = f296478p.getAndIncrement();
        String str2 = this.f296481f;
        Log.m105924i(str2, "onStartReadData, requestId: " + andIncrement);
        return andIncrement;
    }

    public int onStopReadData(int i, String str, int i2) {
        return 0;
    }
}
