package com.tencent.p014mm.wallet_core.model;

import a14.C0000n0;
import a14.C0002w;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53896h0;
import a14.C53916l;
import a14.C53922m0;
import a14.C53930o0;
import a14.C53959v2;
import a14.C53973z1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import kotlin.Result;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98123f;
import p1081gi.C98124g;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: com.tencent.mm.wallet_core.model.u0 */
public final class C75142u0 {

    /* renamed from: a */
    public static final C75142u0 f221103a = new C75142u0();

    /* renamed from: b */
    public static final String f221104b = "MicroMsg.WalletPagDownloader";

    /* renamed from: c */
    public static final int f221105c = 10000;

    /* renamed from: d */
    public static final int f221106d = 10001;

    /* renamed from: e */
    public static final int f221107e = 10002;

    /* renamed from: f */
    public static final int f221108f = 10003;

    /* renamed from: g */
    public static final HashSet<String> f221109g = new HashSet<>();

    /* renamed from: h */
    public static final HashSet<C32224a<Boolean>> f221110h = new HashSet<>();

    /* renamed from: com.tencent.mm.wallet_core.model.u0$a */
    public static abstract class C75143a {

        /* renamed from: com.tencent.mm.wallet_core.model.u0$a$a */
        public static final class C75144a extends C75143a {

            /* renamed from: a */
            public final int f221111a;

            public C75144a(int i) {
                this.f221111a = i;
            }
        }

        /* renamed from: com.tencent.mm.wallet_core.model.u0$a$b */
        public static final class C75145b extends C75143a {

            /* renamed from: a */
            public final String f221112a;

            public C75145b(String str) {
                C87412m.m108594g(str, "path");
                this.f221112a = str;
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.wallet_core.model.WalletPagDownloader", mo125469f = "WalletPagDownloader.kt", mo125470l = {87, 328}, mo125471m = "downloadPAG")
    /* renamed from: com.tencent.mm.wallet_core.model.u0$b */
    public static final class C75146b extends C66704d {

        /* renamed from: d */
        public Object f221113d;

        /* renamed from: e */
        public Object f221114e;

        /* renamed from: f */
        public Object f221115f;

        /* renamed from: g */
        public /* synthetic */ Object f221116g;

        /* renamed from: h */
        public final /* synthetic */ C75142u0 f221117h;

        /* renamed from: i */
        public int f221118i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75146b(C75142u0 u0Var, C15601d<? super C75146b> dVar) {
            super(dVar);
            this.f221117h = u0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f221116g = obj;
            this.f221118i |= Integer.MIN_VALUE;
            return this.f221117h.mo104866b((String) null, (String) null, this);
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.model.u0$c */
    public static final class C75147c extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C98123f> f221119d;

        /* renamed from: e */
        public final /* synthetic */ String f221120e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75147c(C8479f0<C98123f> f0Var, String str) {
            super(1);
            this.f221119d = f0Var;
            this.f221120e = str;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C98123f fVar = (C98123f) this.f221119d.f27484d;
            if (fVar != null) {
                fVar.f287662f = null;
            }
            C75142u0.f221103a.mo104867c(this.f221120e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.model.u0$d */
    public static final class C75148d implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ String f221121d;

        /* renamed from: e */
        public final /* synthetic */ C53916l<C75143a> f221122e;

        /* renamed from: f */
        public final /* synthetic */ String f221123f;

        public C75148d(String str, C53916l<? super C75143a> lVar, String str2) {
            this.f221121d = str;
            this.f221122e = lVar;
            this.f221123f = str2;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            C87412m.m108594g(str, "mediaId");
            String str2 = C75142u0.f221104b;
            StringBuilder sb = new StringBuilder();
            sb.append("cdncallback, mediaId:");
            sb.append(str);
            sb.append(", startRet:");
            sb.append(i);
            sb.append(", ");
            sb.append(dVar != null ? Integer.valueOf(dVar.field_retCode) : null);
            Log.m105924i(str2, sb.toString());
            if (dVar == null) {
                return 0;
            }
            if (dVar.field_retCode != 0) {
                Log.m105924i(str2, "failed download, " + dVar.field_retCode);
                C115669n.INSTANCE.mo160131h(28153, this.f221123f, 3);
                C53916l<C75143a> lVar = this.f221122e;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(new C75143a.C75144a(dVar.field_retCode)));
            } else if (C86013q1.m106450k(this.f221121d)) {
                Log.m105924i(str2, "success download：" + str);
                C53916l<C75143a> lVar2 = this.f221122e;
                Result.Companion companion2 = Result.Companion;
                lVar2.resumeWith(Result.m168114constructorimpl(new C75143a.C75145b(this.f221121d)));
            } else {
                Log.m105924i(str2, "failed download：file not Exist");
                C115669n.INSTANCE.mo160131h(28153, this.f221123f, 3);
                C53916l<C75143a> lVar3 = this.f221122e;
                Result.Companion companion3 = Result.Companion;
                C75142u0.f221103a.getClass();
                lVar3.resumeWith(Result.m168114constructorimpl(new C75143a.C75144a(C75142u0.f221107e)));
            }
            return 0;
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(byteArrayOutputStream, "buff");
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(bArr, "inbuf");
            return new byte[0];
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.model.u0$e */
    public interface C75149e {
        /* renamed from: a */
        void mo95346a(C75143a aVar);
    }

    /* renamed from: a */
    public final C0000n0 mo104865a() {
        C0002w a = C53959v2.m60598a((C53973z1) null, 1, (Object) null);
        C53896h0 h0Var = C53872d1.f151117a;
        return C53930o0.m60554a(((C53884f2) a).plus(C58901s.f168555a).plus(new C53922m0("WalletPagDownloadScope")));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x023f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104866b(java.lang.String r13, java.lang.String r14, wx3.C15601d<? super com.tencent.p014mm.wallet_core.model.C75142u0.C75143a> r15) {
        /*
            r12 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            boolean r1 = r15 instanceof com.tencent.p014mm.wallet_core.model.C75142u0.C75146b
            if (r1 == 0) goto L_0x0015
            r1 = r15
            com.tencent.mm.wallet_core.model.u0$b r1 = (com.tencent.p014mm.wallet_core.model.C75142u0.C75146b) r1
            int r2 = r1.f221118i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f221118i = r2
            goto L_0x001a
        L_0x0015:
            com.tencent.mm.wallet_core.model.u0$b r1 = new com.tencent.mm.wallet_core.model.u0$b
            r1.<init>(r12, r15)
        L_0x001a:
            java.lang.Object r15 = r1.f221116g
            int r2 = r1.f221118i
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r5) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r13 = r1.f221114e
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r1.f221113d
            com.tencent.mm.wallet_core.model.u0 r14 = (com.tencent.p014mm.wallet_core.model.C75142u0) r14
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0240
        L_0x0034:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003c:
            java.lang.Object r13 = r1.f221115f
            r14 = r13
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r13 = r1.f221114e
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r2 = r1.f221113d
            com.tencent.mm.wallet_core.model.u0 r2 = (com.tencent.p014mm.wallet_core.model.C75142u0) r2
            kotlin.ResultKt.throwOnFailure(r15)
            r15 = r14
            r14 = r2
            goto L_0x00cf
        L_0x0050:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.String r15 = f221104b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "loadPag Corountine url:"
            r2.append(r6)
            r2.append(r13)
            java.lang.String r6 = ", path:"
            r2.append(r6)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
            r1.f221113d = r12
            r1.f221114e = r13
            r1.f221115f = r14
            r1.f221118i = r5
            a14.m r15 = new a14.m
            wx3.d r2 = xx3.C66447b.m78392b(r1)
            r15.<init>(r2, r5)
            r15.mo74609p()
            com.tencent.mm.wallet_core.model.u0 r2 = f221103a
            r2.getClass()
            java.util.HashSet<java.lang.String> r2 = f221109g
            monitor-enter(r2)
            boolean r6 = r2.contains(r13)     // Catch:{ all -> 0x0249 }
            if (r6 != 0) goto L_0x0099
            r2.add(r13)     // Catch:{ all -> 0x0249 }
            monitor-exit(r2)
            r6 = 1
            goto L_0x009d
        L_0x0099:
            rx3.b0 r6 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0249 }
            monitor-exit(r2)
            r6 = 0
        L_0x009d:
            if (r6 == 0) goto L_0x00ab
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            rx3.b0 r2 = rx3.C13598b0.f38549a
            java.lang.Object r2 = kotlin.Result.m168114constructorimpl(r2)
            r15.resumeWith(r2)
            goto L_0x00c1
        L_0x00ab:
            monitor-enter(r2)
            com.tencent.mm.wallet_core.model.w0 r6 = new com.tencent.mm.wallet_core.model.w0     // Catch:{ all -> 0x0246 }
            r6.<init>(r13, r15)     // Catch:{ all -> 0x0246 }
            java.util.HashSet<fy3.a<java.lang.Boolean>> r7 = f221110h     // Catch:{ all -> 0x0246 }
            r7.add(r6)     // Catch:{ all -> 0x0246 }
            com.tencent.mm.wallet_core.model.v0 r7 = new com.tencent.mm.wallet_core.model.v0     // Catch:{ all -> 0x0246 }
            r7.<init>(r6)     // Catch:{ all -> 0x0246 }
            r15.mo74599v(r7)     // Catch:{ all -> 0x0246 }
            rx3.b0 r6 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0246 }
            monitor-exit(r2)
        L_0x00c1:
            java.lang.Object r15 = r15.mo74608o()
            if (r15 != r0) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            rx3.b0 r15 = rx3.C13598b0.f38549a
        L_0x00ca:
            if (r15 != r0) goto L_0x00cd
            return r0
        L_0x00cd:
            r15 = r14
            r14 = r12
        L_0x00cf:
            r1.f221113d = r14
            r1.f221114e = r13
            r1.f221115f = r15
            r1.f221118i = r3
            a14.m r2 = new a14.m
            wx3.d r1 = xx3.C66447b.m78392b(r1)
            r2.<init>(r1, r5)
            r2.mo74609p()
            gy3.f0 r1 = new gy3.f0
            r1.<init>()
            com.tencent.mm.wallet_core.model.u0$c r3 = new com.tencent.mm.wallet_core.model.u0$c
            r3.<init>(r1, r13)
            r2.mo74599v(r3)
            if (r13 == 0) goto L_0x00fb
            int r3 = r13.length()
            if (r3 != 0) goto L_0x00f9
            goto L_0x00fb
        L_0x00f9:
            r3 = 0
            goto L_0x00fc
        L_0x00fb:
            r3 = 1
        L_0x00fc:
            if (r3 != 0) goto L_0x021d
            if (r15 == 0) goto L_0x0109
            int r3 = r15.length()
            if (r3 != 0) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r3 = 0
            goto L_0x010a
        L_0x0109:
            r3 = 1
        L_0x010a:
            if (r3 == 0) goto L_0x010e
            goto L_0x021d
        L_0x010e:
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r15)
            if (r3 == 0) goto L_0x012b
            java.lang.String r1 = f221104b
            java.lang.String r3 = "do not download：fileExist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            com.tencent.mm.wallet_core.model.u0$a$b r1 = new com.tencent.mm.wallet_core.model.u0$a$b
            r1.<init>(r15)
            java.lang.Object r15 = kotlin.Result.m168114constructorimpl(r1)
            r2.resumeWith(r15)
            goto L_0x0239
        L_0x012b:
            com.tencent.mm.wallet_core.model.u0 r3 = f221103a
            r3.getClass()
            java.lang.String r3 = ""
            r6 = 0
            gi.f r7 = new gi.f     // Catch:{ MalformedURLException -> 0x01a9 }
            r7.<init>()     // Catch:{ MalformedURLException -> 0x01a9 }
            java.lang.String r8 = "task_LuckyMoneyPagUploader"
            r7.f287660d = r8     // Catch:{ MalformedURLException -> 0x01a9 }
            java.net.URL r8 = new java.net.URL     // Catch:{ MalformedURLException -> 0x01a9 }
            r8.<init>(r13)     // Catch:{ MalformedURLException -> 0x01a9 }
            java.lang.String r8 = r8.getHost()     // Catch:{ MalformedURLException -> 0x01a9 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x01a9 }
            r9.<init>()     // Catch:{ MalformedURLException -> 0x01a9 }
            int r9 = com.tencent.p014mm.network.C81035d.m98965f(r8, r4, r9)     // Catch:{ MalformedURLException -> 0x01a9 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x01a9 }
            r10.<init>()     // Catch:{ MalformedURLException -> 0x01a9 }
            int r10 = com.tencent.p014mm.network.C81035d.m98965f(r8, r5, r10)     // Catch:{ MalformedURLException -> 0x01a9 }
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r13)     // Catch:{ MalformedURLException -> 0x01a9 }
            r7.field_mediaId = r11     // Catch:{ MalformedURLException -> 0x01a9 }
            r7.f287631R = r13     // Catch:{ MalformedURLException -> 0x01a9 }
            r7.f287633S = r8     // Catch:{ MalformedURLException -> 0x01a9 }
            r7.f287635U = r15     // Catch:{ MalformedURLException -> 0x01a9 }
            r7.f287638X = r9     // Catch:{ MalformedURLException -> 0x01a9 }
            r7.f287639Y = r10     // Catch:{ MalformedURLException -> 0x01a9 }
            r7.f287640Z = r4     // Catch:{ MalformedURLException -> 0x01a9 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x01a9 }
            r8.<init>()     // Catch:{ MalformedURLException -> 0x01a9 }
            r8.append(r3)     // Catch:{ MalformedURLException -> 0x01a9 }
            com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r9 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion     // Catch:{ MalformedURLException -> 0x01a9 }
            int r5 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion.getCompatMixStrength$default(r9, r4, r5, r6)     // Catch:{ MalformedURLException -> 0x01a9 }
            r8.append(r5)     // Catch:{ MalformedURLException -> 0x01a9 }
            java.lang.String r5 = r8.toString()     // Catch:{ MalformedURLException -> 0x01a9 }
            r7.f287641p0 = r5     // Catch:{ MalformedURLException -> 0x01a9 }
            r7.f287642x0 = r3     // Catch:{ MalformedURLException -> 0x01a9 }
            r7.f287630Q0 = r4     // Catch:{ MalformedURLException -> 0x01a9 }
            r7.f287632R0 = r4     // Catch:{ MalformedURLException -> 0x01a9 }
            java.lang.String r5 = f221104b     // Catch:{ MalformedURLException -> 0x01a9 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x01a9 }
            r8.<init>()     // Catch:{ MalformedURLException -> 0x01a9 }
            java.lang.String r9 = "attachPagTaskInfo mediaId:"
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x01a9 }
            java.lang.String r9 = r7.field_mediaId     // Catch:{ MalformedURLException -> 0x01a9 }
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x01a9 }
            java.lang.String r9 = " imageUrl:"
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x01a9 }
            r8.append(r13)     // Catch:{ MalformedURLException -> 0x01a9 }
            java.lang.String r8 = r8.toString()     // Catch:{ MalformedURLException -> 0x01a9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)     // Catch:{ MalformedURLException -> 0x01a9 }
            r6 = r7
            goto L_0x01c5
        L_0x01a9:
            r5 = move-exception
            java.lang.String r7 = f221104b
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r5, r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "attachPagTaskInfo fail:"
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r3)
        L_0x01c5:
            r1.f27484d = r6
            if (r6 != 0) goto L_0x01df
            kotlin.Result$Companion r15 = kotlin.Result.Companion
            com.tencent.mm.wallet_core.model.u0$a$a r15 = new com.tencent.mm.wallet_core.model.u0$a$a
            com.tencent.mm.wallet_core.model.u0 r1 = f221103a
            r1.getClass()
            int r1 = f221105c
            r15.<init>(r1)
            java.lang.Object r15 = kotlin.Result.m168114constructorimpl(r15)
            r2.resumeWith(r15)
            goto L_0x0239
        L_0x01df:
            com.tencent.mm.wallet_core.model.u0$d r3 = new com.tencent.mm.wallet_core.model.u0$d
            r3.<init>(r15, r2, r13)
            r6.f287662f = r3
            java.lang.Class<qo.l> r15 = p663qo.C101213l.class
            di3.d r15 = di3.C86312j.m106911c(r15)
            qo.l r15 = (p663qo.C101213l) r15
            T r1 = r1.f27484d
            gi.g r1 = (p1081gi.C98124g) r1
            boolean r15 = r15.xf0(r1)
            if (r15 == 0) goto L_0x0200
            java.lang.String r15 = f221104b
            java.lang.String r1 = "addRecvTask success."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            goto L_0x0239
        L_0x0200:
            java.lang.String r15 = f221104b
            java.lang.String r1 = "addRecvTask failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            kotlin.Result$Companion r15 = kotlin.Result.Companion
            com.tencent.mm.wallet_core.model.u0$a$a r15 = new com.tencent.mm.wallet_core.model.u0$a$a
            com.tencent.mm.wallet_core.model.u0 r1 = f221103a
            r1.getClass()
            int r1 = f221106d
            r15.<init>(r1)
            java.lang.Object r15 = kotlin.Result.m168114constructorimpl(r15)
            r2.resumeWith(r15)
            goto L_0x0239
        L_0x021d:
            java.lang.String r15 = f221104b
            java.lang.String r1 = "do not download：url or path is null，"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            kotlin.Result$Companion r15 = kotlin.Result.Companion
            com.tencent.mm.wallet_core.model.u0$a$a r15 = new com.tencent.mm.wallet_core.model.u0$a$a
            com.tencent.mm.wallet_core.model.u0 r1 = f221103a
            r1.getClass()
            int r1 = f221108f
            r15.<init>(r1)
            java.lang.Object r15 = kotlin.Result.m168114constructorimpl(r15)
            r2.resumeWith(r15)
        L_0x0239:
            java.lang.Object r15 = r2.mo74608o()
            if (r15 != r0) goto L_0x0240
            return r0
        L_0x0240:
            com.tencent.mm.wallet_core.model.u0$a r15 = (com.tencent.p014mm.wallet_core.model.C75142u0.C75143a) r15
            r14.mo104867c(r13)
            return r15
        L_0x0246:
            r13 = move-exception
            monitor-exit(r2)
            throw r13
        L_0x0249:
            r13 = move-exception
            monitor-exit(r2)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.wallet_core.model.C75142u0.mo104866b(java.lang.String, java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: c */
    public final void mo104867c(String str) {
        HashSet<String> hashSet = f221109g;
        synchronized (hashSet) {
            hashSet.remove(str);
            HashSet hashSet2 = new HashSet();
            for (C32224a aVar : f221110h) {
                if (((Boolean) aVar.invoke()).booleanValue()) {
                    hashSet2.add(aVar);
                }
            }
            f221110h.removeAll(hashSet2);
        }
    }
}
