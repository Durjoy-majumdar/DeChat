package p164hp;

import a14.C53872d1;
import a14.C53895h;
import a70.C112760b;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import k14.C60949f;
import k14.C99088c;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: hp.d */
public final class C20992d {

    /* renamed from: c */
    public static final String f59435c;

    /* renamed from: d */
    public static final String f59436d;

    /* renamed from: a */
    public final Map<String, C20994a> f59437a = new LinkedHashMap();

    /* renamed from: b */
    public final C99088c f59438b = C60949f.m71437a(false, 1, (Object) null);

    @C91590f(mo125468c = "com.tencent.mm.feature.checkresupdate.superdownloader.WrapCore", mo125469f = "WrapCore.kt", mo125470l = {458}, mo125471m = "isDownloading")
    /* renamed from: hp.d$b */
    public static final class C20993b extends C66704d {

        /* renamed from: d */
        public Object f59439d;

        /* renamed from: e */
        public Object f59440e;

        /* renamed from: f */
        public Object f59441f;

        /* renamed from: g */
        public /* synthetic */ Object f59442g;

        /* renamed from: h */
        public final /* synthetic */ C20992d f59443h;

        /* renamed from: i */
        public int f59444i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20993b(C20992d dVar, C15601d<? super C20993b> dVar2) {
            super(dVar2);
            this.f59443h = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f59442g = obj;
            this.f59444i |= Integer.MIN_VALUE;
            return this.f59443h.mo32721e((String) null, this);
        }
    }

    /* renamed from: hp.d$a */
    public static final class C20994a {

        /* renamed from: a */
        public final String f59445a;

        /* renamed from: b */
        public final C99088c f59446b;

        /* renamed from: c */
        public int f59447c;

        public C20994a(String str, C99088c cVar, int i, int i2, C8480h hVar) {
            cVar = (i2 & 2) != 0 ? C60949f.m71437a(false, 1, (Object) null) : cVar;
            i = (i2 & 4) != 0 ? 0 : i;
            C87412m.m108594g(str, "key");
            C87412m.m108594g(cVar, "lock");
            this.f59445a = str;
            this.f59446b = cVar;
            this.f59447c = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20994a)) {
                return false;
            }
            C20994a aVar = (C20994a) obj;
            return C87412m.m108589b(this.f59445a, aVar.f59445a) && C87412m.m108589b(this.f59446b, aVar.f59446b) && this.f59447c == aVar.f59447c;
        }

        public int hashCode() {
            return (((this.f59445a.hashCode() * 31) + this.f59446b.hashCode()) * 31) + this.f59447c;
        }

        public String toString() {
            return "MutexWrap(key=" + this.f59445a + ", lock=" + this.f59446b + ", refCount=" + this.f59447c + ')';
        }
    }

    static {
        String str = C112760b.m154231g() + "resource_downloader";
        f59435c = str + "/url_origin";
        f59436d = str + "/url_unzip";
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m23173a(p164hp.C20992d r16, java.lang.String r17, java.lang.String r18, wx3.C15601d r19) {
        /*
            r0 = r17
            r1 = r19
            r16.getClass()
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            java.lang.String r3 = ""
            boolean r4 = r1 instanceof p164hp.C20995e
            if (r4 == 0) goto L_0x001e
            r4 = r1
            hp.e r4 = (p164hp.C20995e) r4
            int r5 = r4.f59454j
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001e
            int r5 = r5 - r6
            r4.f59454j = r5
            goto L_0x0025
        L_0x001e:
            hp.e r4 = new hp.e
            r5 = r16
            r4.<init>(r5, r1)
        L_0x0025:
            java.lang.Object r1 = r4.f59452h
            int r5 = r4.f59454j
            r6 = 1
            if (r5 == 0) goto L_0x003b
            if (r5 != r6) goto L_0x0033
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x01c6
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = f59435c
            r1.append(r5)
            r5 = 47
            r1.append(r5)
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r17)
            r1.append(r5)
            java.lang.String r11 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "#downloadUrlRes url="
            r1.append(r5)
            r1.append(r0)
            java.lang.String r7 = " targetLocalPath="
            r1.append(r7)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            java.lang.String r13 = "Download.SuperDownloaderWrapCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r11)
            if (r1 == 0) goto L_0x009c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r0)
            java.lang.String r0 = " already exist. return"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            rx3.l r2 = new rx3.l
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.<init>(r0, r11)
            goto L_0x01c9
        L_0x009c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r5 = "_temp"
            r1.append(r5)
            java.lang.String r8 = r1.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r11)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r8)
            r4.f59448d = r0
            r1 = r18
            r4.f59449e = r1
            r4.f59450f = r11
            r4.f59451g = r8
            r4.f59454j = r6
            a14.m r5 = new a14.m
            wx3.d r4 = xx3.C66447b.m78392b(r4)
            r5.<init>(r4, r6)
            r5.mo74609p()
            gy3.a0 r4 = new gy3.a0
            r4.<init>()
            r7 = 0
            r9 = 0
            gi.f r10 = new gi.f     // Catch:{ MalformedURLException -> 0x014b }
            r10.<init>()     // Catch:{ MalformedURLException -> 0x014b }
            java.lang.String r12 = "task_FinderCdnDownloader"
            r10.f287660d = r12     // Catch:{ MalformedURLException -> 0x014b }
            java.net.URL r12 = new java.net.URL     // Catch:{ MalformedURLException -> 0x014b }
            r12.<init>(r0)     // Catch:{ MalformedURLException -> 0x014b }
            java.lang.String r12 = r12.getHost()     // Catch:{ MalformedURLException -> 0x014b }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x014b }
            r14.<init>()     // Catch:{ MalformedURLException -> 0x014b }
            int r14 = com.tencent.p014mm.network.C81035d.m98965f(r12, r7, r14)     // Catch:{ MalformedURLException -> 0x014b }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x014b }
            r15.<init>()     // Catch:{ MalformedURLException -> 0x014b }
            int r15 = com.tencent.p014mm.network.C81035d.m98965f(r12, r6, r15)     // Catch:{ MalformedURLException -> 0x014b }
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r17)     // Catch:{ MalformedURLException -> 0x014b }
            r10.field_mediaId = r6     // Catch:{ MalformedURLException -> 0x014b }
            r10.f287631R = r0     // Catch:{ MalformedURLException -> 0x014b }
            r10.f287633S = r12     // Catch:{ MalformedURLException -> 0x014b }
            r10.f287635U = r8     // Catch:{ MalformedURLException -> 0x014b }
            r10.f287638X = r14     // Catch:{ MalformedURLException -> 0x014b }
            r10.f287639Y = r15     // Catch:{ MalformedURLException -> 0x014b }
            r10.f287640Z = r7     // Catch:{ MalformedURLException -> 0x014b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x014b }
            r6.<init>()     // Catch:{ MalformedURLException -> 0x014b }
            r6.append(r3)     // Catch:{ MalformedURLException -> 0x014b }
            com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r12 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion     // Catch:{ MalformedURLException -> 0x014b }
            r14 = 1
            int r12 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion.getCompatMixStrength$default(r12, r7, r14, r9)     // Catch:{ MalformedURLException -> 0x014b }
            r6.append(r12)     // Catch:{ MalformedURLException -> 0x014b }
            java.lang.String r6 = r6.toString()     // Catch:{ MalformedURLException -> 0x014b }
            r10.f287641p0 = r6     // Catch:{ MalformedURLException -> 0x014b }
            r10.f287642x0 = r3     // Catch:{ MalformedURLException -> 0x014b }
            r6 = 150(0x96, float:2.1E-43)
            r10.f287630Q0 = r6     // Catch:{ MalformedURLException -> 0x014b }
            r6 = 20201(0x4ee9, float:2.8308E-41)
            r10.f287632R0 = r6     // Catch:{ MalformedURLException -> 0x014b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x014b }
            r6.<init>()     // Catch:{ MalformedURLException -> 0x014b }
            java.lang.String r12 = "#generateTaskInfo mediaId:"
            r6.append(r12)     // Catch:{ MalformedURLException -> 0x014b }
            java.lang.String r12 = r10.field_mediaId     // Catch:{ MalformedURLException -> 0x014b }
            r6.append(r12)     // Catch:{ MalformedURLException -> 0x014b }
            java.lang.String r12 = " resCdnUrl:"
            r6.append(r12)     // Catch:{ MalformedURLException -> 0x014b }
            r6.append(r0)     // Catch:{ MalformedURLException -> 0x014b }
            java.lang.String r0 = r6.toString()     // Catch:{ MalformedURLException -> 0x014b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)     // Catch:{ MalformedURLException -> 0x014b }
            r0 = r10
            goto L_0x0166
        L_0x014b:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r7]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r3, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "#generateTaskInfo fail:"
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            r0 = r9
        L_0x0166:
            if (r0 != 0) goto L_0x0180
            boolean r0 = r4.f27482d
            if (r0 != 0) goto L_0x01bf
            r1 = 1
            r4.f27482d = r1
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            rx3.l r0 = new rx3.l
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.<init>(r1, r3)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
            r5.resumeWith(r0)
            goto L_0x01bf
        L_0x0180:
            hp.f r6 = new hp.f
            r7 = r6
            r9 = r18
            r10 = r4
            r12 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            r0.f287662f = r6
            java.lang.Class<qo.l> r1 = p663qo.C101213l.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            qo.l r1 = (p663qo.C101213l) r1
            boolean r1 = r1.xf0(r0)
            if (r1 == 0) goto L_0x01a3
            hp.g r1 = new hp.g
            r1.<init>(r0)
            r5.mo74599v(r1)
            goto L_0x01bf
        L_0x01a3:
            java.lang.String r0 = "#downloadUrlRes addRecvTask failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            boolean r0 = r4.f27482d
            if (r0 != 0) goto L_0x01bf
            r1 = 1
            r4.f27482d = r1
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            rx3.l r0 = new rx3.l
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.<init>(r1, r3)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
            r5.resumeWith(r0)
        L_0x01bf:
            java.lang.Object r1 = r5.mo74608o()
            if (r1 != r2) goto L_0x01c6
            goto L_0x01c9
        L_0x01c6:
            r2 = r1
            rx3.l r2 = (rx3.C13604l) r2
        L_0x01c9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p164hp.C20992d.m23173a(hp.d, java.lang.String, java.lang.String, wx3.d):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r5v7, types: [k14.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0083 A[Catch:{ all -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m23174b(p164hp.C20992d r5, p164hp.C20992d.C20994a r6, wx3.C15601d r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof p164hp.C20996i
            if (r0 == 0) goto L_0x0016
            r0 = r7
            hp.i r0 = (p164hp.C20996i) r0
            int r1 = r0.f59460i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f59460i = r1
            goto L_0x001b
        L_0x0016:
            hp.i r0 = new hp.i
            r0.<init>(r5, r7)
        L_0x001b:
            java.lang.Object r7 = r0.f59458g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f59460i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r4) goto L_0x0039
            java.lang.Object r5 = r0.f59457f
            k14.c r5 = (k14.C99088c) r5
            java.lang.Object r6 = r0.f59456e
            hp.d$a r6 = (p164hp.C20992d.C20994a) r6
            java.lang.Object r0 = r0.f59455d
            hp.d r0 = (p164hp.C20992d) r0
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r5
            r5 = r0
            goto L_0x0057
        L_0x0039:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r7)
            k14.c r7 = r5.f59438b
            r0.f59455d = r5
            r0.f59456e = r6
            r0.f59457f = r7
            r0.f59460i = r4
            k14.d r7 = (k14.C60942d) r7
            java.lang.Object r0 = r7.mo85908b(r3, r0)
            if (r0 != r1) goto L_0x0057
            goto L_0x0091
        L_0x0057:
            int r0 = r6.f59447c     // Catch:{ all -> 0x0092 }
            int r0 = r0 + -1
            r6.f59447c = r0     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "Download.SuperDownloaderWrapCore"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            r1.<init>()     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = "#releaseDownloadJob key="
            r1.append(r2)     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = r6.f59445a     // Catch:{ all -> 0x0092 }
            r1.append(r2)     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = " ref="
            r1.append(r2)     // Catch:{ all -> 0x0092 }
            int r2 = r6.f59447c     // Catch:{ all -> 0x0092 }
            r1.append(r2)     // Catch:{ all -> 0x0092 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0092 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0092 }
            int r0 = r6.f59447c     // Catch:{ all -> 0x0092 }
            if (r0 > 0) goto L_0x008a
            java.util.Map<java.lang.String, hp.d$a> r5 = r5.f59437a     // Catch:{ all -> 0x0092 }
            java.lang.String r6 = r6.f59445a     // Catch:{ all -> 0x0092 }
            r5.remove(r6)     // Catch:{ all -> 0x0092 }
        L_0x008a:
            rx3.b0 r5 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0092 }
            r7.mo85909c(r3)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0091:
            return r1
        L_0x0092:
            r5 = move-exception
            r7.mo85909c(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p164hp.C20992d.m23174b(hp.d, hp.d$a, wx3.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: xx3.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: xx3.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: hp.d$a} */
    /* JADX WARNING: type inference failed for: r11v9, types: [k14.c] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        if (r13.mo85908b((java.lang.Object) null, r0) == r1) goto L_0x009c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063 A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m23175c(p164hp.C20992d r11, java.lang.String r12, wx3.C15601d r13) {
        /*
            r11.getClass()
            boolean r0 = r13 instanceof p164hp.C20997j
            if (r0 == 0) goto L_0x0016
            r0 = r13
            hp.j r0 = (p164hp.C20997j) r0
            int r1 = r0.f59466i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f59466i = r1
            goto L_0x001b
        L_0x0016:
            hp.j r0 = new hp.j
            r0.<init>(r11, r13)
        L_0x001b:
            java.lang.Object r13 = r0.f59464g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f59466i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r4) goto L_0x0039
            java.lang.Object r11 = r0.f59463f
            k14.c r11 = (k14.C99088c) r11
            java.lang.Object r12 = r0.f59462e
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r0 = r0.f59461d
            hp.d r0 = (p164hp.C20992d) r0
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r11
            r11 = r0
            goto L_0x0057
        L_0x0039:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r13)
            k14.c r13 = r11.f59438b
            r0.f59461d = r11
            r0.f59462e = r12
            r0.f59463f = r13
            r0.f59466i = r4
            k14.d r13 = (k14.C60942d) r13
            java.lang.Object r0 = r13.mo85908b(r3, r0)
            if (r0 != r1) goto L_0x0057
            goto L_0x009c
        L_0x0057:
            java.util.Map<java.lang.String, hp.d$a> r0 = r11.f59437a     // Catch:{ all -> 0x009d }
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch:{ all -> 0x009d }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x009d }
            hp.d$a r0 = (p164hp.C20992d.C20994a) r0     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x0073
            hp.d$a r0 = new hp.d$a     // Catch:{ all -> 0x009d }
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r0
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x009d }
            java.util.Map<java.lang.String, hp.d$a> r11 = r11.f59437a     // Catch:{ all -> 0x009d }
            r11.put(r12, r0)     // Catch:{ all -> 0x009d }
        L_0x0073:
            r1 = r0
            int r11 = r1.f59447c     // Catch:{ all -> 0x009d }
            int r11 = r11 + r4
            r1.f59447c = r11     // Catch:{ all -> 0x009d }
            java.lang.String r11 = "Download.SuperDownloaderWrapCore"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x009d }
            r0.<init>()     // Catch:{ all -> 0x009d }
            java.lang.String r2 = "#requestUrlDownloadJob key="
            r0.append(r2)     // Catch:{ all -> 0x009d }
            r0.append(r12)     // Catch:{ all -> 0x009d }
            java.lang.String r12 = " ref="
            r0.append(r12)     // Catch:{ all -> 0x009d }
            int r12 = r1.f59447c     // Catch:{ all -> 0x009d }
            r0.append(r12)     // Catch:{ all -> 0x009d }
            java.lang.String r12 = r0.toString()     // Catch:{ all -> 0x009d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)     // Catch:{ all -> 0x009d }
            r13.mo85909c(r3)
        L_0x009c:
            return r1
        L_0x009d:
            r11 = move-exception
            r13.mo85909c(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p164hp.C20992d.m23175c(hp.d, java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: d */
    public static final Object m23176d(C20992d dVar, String str, String str2, C15601d dVar2) {
        dVar.getClass();
        Log.m105924i("Download.SuperDownloaderWrapCore", "#unzipToFolder zipFilePath=" + str + " unzipFolder=" + str2);
        Object g = C53895h.m60469g(C53872d1.f151119c, new C8647k(str2, str, (C15601d<? super C8647k>) null), dVar2);
        return g == C15911a.COROUTINE_SUSPENDED ? g : C13598b0.f38549a;
    }

    /* JADX WARNING: type inference failed for: r7v10, types: [k14.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085 A[Catch:{ all -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32721e(java.lang.String r7, wx3.C15601d<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p164hp.C20992d.C20993b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            hp.d$b r0 = (p164hp.C20992d.C20993b) r0
            int r1 = r0.f59444i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f59444i = r1
            goto L_0x0018
        L_0x0013:
            hp.d$b r0 = new hp.d$b
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f59442g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f59444i
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r5) goto L_0x0037
            java.lang.Object r7 = r0.f59441f
            k14.c r7 = (k14.C99088c) r7
            java.lang.Object r1 = r0.f59440e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f59439d
            hp.d r0 = (p164hp.C20992d) r0
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            r7 = r1
            goto L_0x0067
        L_0x0037:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r8)
            if (r7 == 0) goto L_0x004d
            int r8 = r7.length()
            if (r8 != 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r8 = 0
            goto L_0x004e
        L_0x004d:
            r8 = 1
        L_0x004e:
            if (r8 == 0) goto L_0x0053
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x0053:
            k14.c r8 = r6.f59438b
            r0.f59439d = r6
            r0.f59440e = r7
            r0.f59441f = r8
            r0.f59444i = r5
            k14.d r8 = (k14.C60942d) r8
            java.lang.Object r0 = r8.mo85908b(r4, r0)
            if (r0 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r0 = r6
        L_0x0067:
            java.util.Map<java.lang.String, hp.d$a> r0 = r0.f59437a     // Catch:{ all -> 0x008e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r1.<init>()     // Catch:{ all -> 0x008e }
            java.lang.String r2 = "url_"
            r1.append(r2)     // Catch:{ all -> 0x008e }
            r1.append(r7)     // Catch:{ all -> 0x008e }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x008e }
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch:{ all -> 0x008e }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x008e }
            hp.d$a r7 = (p164hp.C20992d.C20994a) r7     // Catch:{ all -> 0x008e }
            if (r7 == 0) goto L_0x0086
            r3 = 1
        L_0x0086:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x008e }
            r8.mo85909c(r4)
            return r7
        L_0x008e:
            r7 = move-exception
            r8.mo85909c(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p164hp.C20992d.mo32721e(java.lang.String, wx3.d):java.lang.Object");
    }
}
