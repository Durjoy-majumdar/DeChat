package com.tencent.p014mm.plugin.priority.model.precheck.downloader;

import a14.C0000n0;
import a14.C53934p0;
import androidx.lifecycle.C0125s;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlCondition;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SingleCondition;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import k14.C60949f;
import k14.C99088c;
import ke2.C99129c;
import kotlin.ResultKt;
import p749xh.C102676x0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import ue2.C102006d;
import ue2.C102007e;
import ue2.C102013f;
import ve2.C102174a;
import ve2.C102179e;
import ve2.C102182g;
import wx3.C15601d;
import xe2.C102630a;
import xe2.C102631b;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader */
public final class C2CMsgPreDownloader implements C102182g {

    /* renamed from: a */
    public C102179e f272429a;

    /* renamed from: b */
    public long f272430b;

    /* renamed from: c */
    public final C99088c f272431c = C60949f.m71437a(false, 1, (Object) null);

    /* renamed from: d */
    public boolean f272432d;

    /* renamed from: e */
    public long f272433e = -1;

    /* renamed from: f */
    public int f272434f = -1;

    /* renamed from: g */
    public final C13601g f272435g = C36568h.m40985a(C94299e.f272454d);

    /* renamed from: h */
    public final C13601g f272436h = C36568h.m40985a(C94297c.f272447d);

    /* renamed from: i */
    public final C2CMsgPreDownloader$onlineVideoListener$1 f272437i = new C2CMsgPreDownloader$onlineVideoListener$1(this, (C99129c) C86312j.m106911c(C99129c.class));

    @C91590f(mo125468c = "com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader", mo125469f = "C2CMsgPreDownloader.kt", mo125470l = {278}, mo125471m = "finishTask")
    /* renamed from: com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader$a */
    public static final class C94295a extends C66704d {

        /* renamed from: d */
        public Object f272438d;

        /* renamed from: e */
        public Object f272439e;

        /* renamed from: f */
        public /* synthetic */ Object f272440f;

        /* renamed from: g */
        public final /* synthetic */ C2CMsgPreDownloader f272441g;

        /* renamed from: h */
        public int f272442h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94295a(C2CMsgPreDownloader c2CMsgPreDownloader, C15601d<? super C94295a> dVar) {
            super(dVar);
            this.f272441g = c2CMsgPreDownloader;
        }

        public final Object invokeSuspend(Object obj) {
            this.f272440f = obj;
            this.f272442h |= Integer.MIN_VALUE;
            return this.f272441g.mo129637f(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader$onC2CPreDownloadEnd$1", mo125469f = "C2CMsgPreDownloader.kt", mo125470l = {196, 199}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader$b */
    public static final class C94296b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f272443d;

        /* renamed from: e */
        public final /* synthetic */ boolean f272444e;

        /* renamed from: f */
        public final /* synthetic */ C2CMsgPreDownloader f272445f;

        /* renamed from: g */
        public final /* synthetic */ String f272446g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94296b(boolean z, C2CMsgPreDownloader c2CMsgPreDownloader, String str, C15601d<? super C94296b> dVar) {
            super(2, dVar);
            this.f272444e = z;
            this.f272445f = c2CMsgPreDownloader;
            this.f272446g = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C94296b(this.f272444e, this.f272445f, this.f272446g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C94296b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f272443d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.f272444e) {
                    C2CMsgPreDownloader c2CMsgPreDownloader = this.f272445f;
                    this.f272443d = 1;
                    if (c2CMsgPreDownloader.mo129637f(this) == aVar) {
                        return aVar;
                    }
                } else {
                    String str = this.f272446g;
                    this.f272443d = 2;
                    if (((C102007e) ((C36570n) this.f272445f.f272435g).getValue()).mo141504b(str, this) == aVar) {
                        return aVar;
                    }
                    return C13598b0.f38549a;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f272445f.mo129639h(false);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader$c */
    public static final class C94297c extends C87413o implements C32224a<LifecycleScope> {

        /* renamed from: d */
        public static final C94297c f272447d = new C94297c();

        public C94297c() {
            super(0);
        }

        public Object invoke() {
            return new LifecycleScope("C2CPreDownloadService", (C0125s) C86312j.m106911c(C99129c.class), 0, 4, (C8480h) null);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader$startPreDownloadTask$1", mo125469f = "C2CMsgPreDownloader.kt", mo125470l = {64, 66, 78, 82, 86, 90, 100, 106, 109}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader$d */
    public static final class C94298d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f272448d;

        /* renamed from: e */
        public Object f272449e;

        /* renamed from: f */
        public Object f272450f;

        /* renamed from: g */
        public int f272451g;

        /* renamed from: h */
        public final /* synthetic */ C2CMsgPreDownloader f272452h;

        /* renamed from: i */
        public final /* synthetic */ boolean f272453i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94298d(C2CMsgPreDownloader c2CMsgPreDownloader, boolean z, C15601d<? super C94298d> dVar) {
            super(2, dVar);
            this.f272452h = c2CMsgPreDownloader;
            this.f272453i = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C94298d(this.f272452h, this.f272453i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C94298d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0136, code lost:
            if (r8 != false) goto L_0x0138;
         */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x02b3  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x02c7  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x02e0  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f272451g
                r3 = 2
                java.lang.String r4 = ", downloadLen:"
                java.lang.String r5 = ", quota:"
                java.lang.String r6 = ", msgSvrId:"
                java.lang.String r7 = "MicroMsg.C2CMsgPreDownloader"
                r8 = 0
                r9 = 1
                r10 = 0
                switch(r2) {
                    case 0: goto L_0x007f;
                    case 1: goto L_0x0074;
                    case 2: goto L_0x006f;
                    case 3: goto L_0x005e;
                    case 4: goto L_0x004d;
                    case 5: goto L_0x003c;
                    case 6: goto L_0x002b;
                    case 7: goto L_0x0022;
                    case 8: goto L_0x001d;
                    case 9: goto L_0x001d;
                    default: goto L_0x0015;
                }
            L_0x0015:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x001d:
                kotlin.ResultKt.throwOnFailure(r17)
                goto L_0x030c
            L_0x0022:
                java.lang.Object r2 = r0.f272448d
                xe2.a r2 = (xe2.C102630a) r2
                kotlin.ResultKt.throwOnFailure(r17)
                goto L_0x02e8
            L_0x002b:
                java.lang.Object r2 = r0.f272450f
                xe2.a r2 = (xe2.C102630a) r2
                java.lang.Object r3 = r0.f272449e
                com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader r3 = (com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader) r3
                java.lang.Object r11 = r0.f272448d
                xe2.a r11 = (xe2.C102630a) r11
                kotlin.ResultKt.throwOnFailure(r17)
                goto L_0x01e1
            L_0x003c:
                java.lang.Object r2 = r0.f272450f
                xe2.a r2 = (xe2.C102630a) r2
                java.lang.Object r3 = r0.f272449e
                com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader r3 = (com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader) r3
                java.lang.Object r11 = r0.f272448d
                xe2.a r11 = (xe2.C102630a) r11
                kotlin.ResultKt.throwOnFailure(r17)
                goto L_0x0193
            L_0x004d:
                java.lang.Object r2 = r0.f272450f
                xe2.a r2 = (xe2.C102630a) r2
                java.lang.Object r3 = r0.f272449e
                com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader r3 = (com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader) r3
                java.lang.Object r11 = r0.f272448d
                xe2.a r11 = (xe2.C102630a) r11
                kotlin.ResultKt.throwOnFailure(r17)
                goto L_0x022e
            L_0x005e:
                java.lang.Object r2 = r0.f272450f
                xe2.a r2 = (xe2.C102630a) r2
                java.lang.Object r3 = r0.f272449e
                com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader r3 = (com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader) r3
                java.lang.Object r11 = r0.f272448d
                xe2.a r11 = (xe2.C102630a) r11
                kotlin.ResultKt.throwOnFailure(r17)
                goto L_0x027a
            L_0x006f:
                kotlin.ResultKt.throwOnFailure(r17)
                goto L_0x0145
            L_0x0074:
                java.lang.Object r2 = r0.f272448d
                xe2.a r2 = (xe2.C102630a) r2
                kotlin.ResultKt.throwOnFailure(r17)
                r11 = r17
                goto L_0x0111
            L_0x007f:
                kotlin.ResultKt.throwOnFailure(r17)
                java.lang.Class<ke2.c> r2 = ke2.C99129c.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                ke2.c r2 = (ke2.C99129c) r2
                r2.requireAccountInitialized()
                xe2.b r2 = r2.f290673z
                r2.getClass()
                long r11 = eb0.C31543z5.m39453c()
                r13 = 86400000(0x5265c00, double:4.2687272E-316)
                long r11 = r11 - r13
                com.tencent.mm.sdk.storage.sql.Column r13 = p749xh.C102676x0.f303110C
                java.lang.Long r11 = java.lang.Long.valueOf(r11)
                com.tencent.mm.sdk.storage.sql.SingleCondition r11 = r13.largerEqual((java.lang.Number) r11)
                com.tencent.mm.sdk.storage.sql.Column r12 = p749xh.C102676x0.f303133y
                java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
                com.tencent.mm.sdk.storage.sql.SingleCondition r12 = r12.equal((java.lang.Number) r14)
                com.tencent.mm.sdk.storage.sql.ISqlCondition r11 = r11.and(r12)
                com.tencent.mm.sdk.storage.sql.Column r12 = p749xh.C102676x0.f303109B
                com.tencent.mm.sdk.storage.sql.SingleCondition r12 = r12.notEqual((java.lang.Number) r14)
                com.tencent.mm.sdk.storage.sql.ISqlCondition r11 = r11.and(r12)
                com.tencent.mm.sdk.storage.sql.Column r12 = p749xh.C102676x0.f303108A
                java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
                com.tencent.mm.sdk.storage.sql.SingleCondition r14 = r12.notEqual((java.lang.Number) r14)
                com.tencent.mm.sdk.storage.sql.ISqlCondition r11 = r11.and(r14)
                com.tencent.mm.sdk.storage.sql.SingleTable r14 = p749xh.C102676x0.f303129u
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r14 = r14.selectAll()
                java.lang.String r15 = "MicroMsg.C2CPreDownloadStorage"
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r14 = r14.log(r15)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r11 = r14.where(r11)
                com.tencent.mm.sdk.storage.sql.ISqlOrder[] r14 = new com.tencent.p014mm.sdk.storage.sql.ISqlOrder[r3]
                com.tencent.mm.sdk.storage.sql.ISqlOrder r12 = r12.orderDesc()
                r14[r8] = r12
                com.tencent.mm.sdk.storage.sql.ISqlOrder r12 = r13.orderDesc()
                r14[r9] = r12
                java.util.List r12 = sx3.C64197v.m75537f(r14)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r11 = r11.orderBy((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlOrder>) r12)
                com.tencent.mm.sdk.storage.sql.SelectSql r11 = r11.build()
                com.tencent.mm.sdk.storage.mvvm.IMvvmDBProvider r2 = r2.getDbProvider()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r2.getDB()
                java.lang.Class<xe2.a> r12 = xe2.C102630a.class
                com.tencent.mm.sdk.storage.IAutoDBItem r2 = r11.singleQuery(r2, r12)
                xe2.a r2 = (xe2.C102630a) r2
                com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader r11 = r0.f272452h
                r0.f272448d = r2
                r0.f272451g = r9
                java.lang.Object r11 = com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader.m119248c(r11, r0)
                if (r11 != r1) goto L_0x0111
                return r1
            L_0x0111:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L_0x0148
                boolean r4 = r0.f272453i
                if (r4 != 0) goto L_0x0138
                com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader r4 = r0.f272452h
                if (r2 == 0) goto L_0x0133
                ve2.e r4 = r4.f272429a
                if (r4 == 0) goto L_0x0136
                int r2 = r2.mo142479t2()
                xe2.a r4 = r4.f300868e
                int r4 = r4.mo142479t2()
                if (r2 <= r4) goto L_0x0136
                r8 = 1
                goto L_0x0136
            L_0x0133:
                r4.getClass()
            L_0x0136:
                if (r8 == 0) goto L_0x0145
            L_0x0138:
                com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader r2 = r0.f272452h
                r0.f272448d = r10
                r0.f272451g = r3
                java.lang.Object r2 = com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader.m119247b(r2, r0)
                if (r2 != r1) goto L_0x0145
                return r1
            L_0x0145:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            L_0x0148:
                com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader r11 = r0.f272452h
                long[] r12 = com.tencent.mars.cdn.CdnLogic.queryAvailableQuota()
                r13 = r12[r8]
                r11.f272430b = r13
                com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader r11 = r0.f272452h
                long r11 = r11.f272430b
                r13 = 0
                int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r15 <= 0) goto L_0x02fd
                android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r11 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifiFromCache(r11)
                if (r11 == 0) goto L_0x02fd
                if (r2 == 0) goto L_0x02e8
                com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader r11 = r0.f272452h
                int r12 = r2.mo142477s2()
                r13 = 3
                if (r12 == r9) goto L_0x0264
                r14 = 4
                if (r12 == r3) goto L_0x0218
                if (r12 == r13) goto L_0x01ca
                if (r12 == r14) goto L_0x017c
                r3 = r11
                r11 = r2
                goto L_0x02af
            L_0x017c:
                ve2.b r3 = new ve2.b
                r3.<init>(r2)
                r0.f272448d = r2
                r0.f272449e = r11
                r0.f272450f = r2
                r12 = 5
                r0.f272451g = r12
                java.lang.Object r3 = com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader.m119249d(r11, r3, r0)
                if (r3 != r1) goto L_0x0191
                return r1
            L_0x0191:
                r3 = r11
                r11 = r2
            L_0x0193:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "start C2C file pre download task, msgId:"
                r12.append(r13)
                long r13 = r2.getMsgId()
                r12.append(r13)
                r12.append(r6)
                java.lang.String r6 = r2.mo142476r2()
                r12.append(r6)
                r12.append(r5)
                long r5 = r3.f272430b
                r12.append(r5)
                r12.append(r4)
                long r4 = r2.mo142475q2()
                r12.append(r4)
                java.lang.String r4 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
                goto L_0x02af
            L_0x01ca:
                ve2.f r3 = new ve2.f
                r3.<init>(r2)
                r0.f272448d = r2
                r0.f272449e = r11
                r0.f272450f = r2
                r12 = 6
                r0.f272451g = r12
                java.lang.Object r3 = com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader.m119249d(r11, r3, r0)
                if (r3 != r1) goto L_0x01df
                return r1
            L_0x01df:
                r3 = r11
                r11 = r2
            L_0x01e1:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "start C2C video pre download task, msgId:"
                r12.append(r13)
                long r13 = r2.getMsgId()
                r12.append(r13)
                r12.append(r6)
                java.lang.String r6 = r2.mo142476r2()
                r12.append(r6)
                r12.append(r5)
                long r5 = r3.f272430b
                r12.append(r5)
                r12.append(r4)
                long r4 = r2.mo142475q2()
                r12.append(r4)
                java.lang.String r4 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
                goto L_0x02af
            L_0x0218:
                ve2.c r3 = new ve2.c
                r3.<init>(r2)
                r0.f272448d = r2
                r0.f272449e = r11
                r0.f272450f = r2
                r0.f272451g = r14
                java.lang.Object r3 = com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader.m119249d(r11, r3, r0)
                if (r3 != r1) goto L_0x022c
                return r1
            L_0x022c:
                r3 = r11
                r11 = r2
            L_0x022e:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "start C2C large image pre download task, msgId:"
                r12.append(r13)
                long r13 = r2.getMsgId()
                r12.append(r13)
                r12.append(r6)
                java.lang.String r6 = r2.mo142476r2()
                r12.append(r6)
                r12.append(r5)
                long r5 = r3.f272430b
                r12.append(r5)
                r12.append(r4)
                long r4 = r2.mo142475q2()
                r12.append(r4)
                java.lang.String r4 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
                goto L_0x02af
            L_0x0264:
                ve2.d r3 = new ve2.d
                r3.<init>(r2)
                r0.f272448d = r2
                r0.f272449e = r11
                r0.f272450f = r2
                r0.f272451g = r13
                java.lang.Object r3 = com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader.m119249d(r11, r3, r0)
                if (r3 != r1) goto L_0x0278
                return r1
            L_0x0278:
                r3 = r11
                r11 = r2
            L_0x027a:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "start C2C mid image pre download task, msgId:"
                r12.append(r13)
                long r13 = r2.getMsgId()
                r12.append(r13)
                r12.append(r6)
                java.lang.String r6 = r2.mo142476r2()
                r12.append(r6)
                r12.append(r5)
                long r5 = r3.f272430b
                r12.append(r5)
                r12.append(r4)
                long r4 = r2.mo142475q2()
                r12.append(r4)
                java.lang.String r4 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            L_0x02af:
                ve2.e r4 = r3.f272429a
                if (r4 == 0) goto L_0x02b5
                r4.f300858d = r3
            L_0x02b5:
                long r4 = r2.getMsgId()
                long r6 = r3.f272433e
                int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r12 != 0) goto L_0x02e0
                int r2 = r2.mo142477s2()
                int r4 = r3.f272434f
                if (r2 != r4) goto L_0x02e0
                ve2.e r2 = r3.f272429a
                if (r2 == 0) goto L_0x02ce
                ve2.C102174a.m134628b(r2, r8, r9, r10)
            L_0x02ce:
                r0.f272448d = r11
                r0.f272449e = r10
                r0.f272450f = r10
                r2 = 7
                r0.f272451g = r2
                java.lang.Object r2 = r3.mo129637f(r0)
                if (r2 != r1) goto L_0x02de
                return r1
            L_0x02de:
                r2 = r11
                goto L_0x02e8
            L_0x02e0:
                ve2.e r2 = r3.f272429a
                if (r2 == 0) goto L_0x02de
                r2.mo141717c()
                goto L_0x02de
            L_0x02e8:
                if (r2 != 0) goto L_0x030c
                com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader r2 = r0.f272452h
                r0.f272448d = r10
                r0.f272449e = r10
                r0.f272450f = r10
                r3 = 8
                r0.f272451g = r3
                java.lang.Object r2 = r2.mo129637f(r0)
                if (r2 != r1) goto L_0x030c
                return r1
            L_0x02fd:
                com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader r2 = r0.f272452h
                r0.f272448d = r10
                r3 = 9
                r0.f272451g = r3
                java.lang.Object r2 = r2.mo129637f(r0)
                if (r2 != r1) goto L_0x030c
                return r1
            L_0x030c:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader.C94298d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader$e */
    public static final class C94299e extends C87413o implements C32224a<C102007e> {

        /* renamed from: d */
        public static final C94299e f272454d = new C94299e();

        public C94299e() {
            super(0);
        }

        public Object invoke() {
            return new C102007e();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m119247b(com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader r4, wx3.C15601d r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof ue2.C102003a
            if (r0 == 0) goto L_0x0016
            r0 = r5
            ue2.a r0 = (ue2.C102003a) r0
            int r1 = r0.f300327g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f300327g = r1
            goto L_0x001b
        L_0x0016:
            ue2.a r0 = new ue2.a
            r0.<init>(r4, r5)
        L_0x001b:
            java.lang.Object r5 = r0.f300325e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f300327g
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r4 = r0.f300324d
            com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader r4 = (com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader) r4
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x004c
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r5)
            ve2.e r5 = r4.f272429a
            if (r5 == 0) goto L_0x0041
            r2 = 6
            r5.mo141716a(r2)
        L_0x0041:
            r0.f300324d = r4
            r0.f300327g = r3
            java.lang.Object r5 = r4.mo129637f(r0)
            if (r5 != r1) goto L_0x004c
            goto L_0x0066
        L_0x004c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "cancel now pre download task, task:"
            r5.append(r0)
            ve2.e r4 = r4.f272429a
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "MicroMsg.C2CMsgPreDownloader"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader.m119247b(com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [k14.c] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        if (r6.mo85908b((java.lang.Object) null, r0) == r1) goto L_0x0060;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055 A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056 A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m119248c(com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader r5, wx3.C15601d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof ue2.C102004b
            if (r0 == 0) goto L_0x0016
            r0 = r6
            ue2.b r0 = (ue2.C102004b) r0
            int r1 = r0.f300332h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f300332h = r1
            goto L_0x001b
        L_0x0016:
            ue2.b r0 = new ue2.b
            r0.<init>(r5, r6)
        L_0x001b:
            java.lang.Object r6 = r0.f300330f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f300332h
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r4) goto L_0x0035
            java.lang.Object r5 = r0.f300329e
            k14.c r5 = (k14.C99088c) r5
            java.lang.Object r0 = r0.f300328d
            com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader r0 = (com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader) r0
            kotlin.ResultKt.throwOnFailure(r6)
            r6 = r5
            r5 = r0
            goto L_0x0051
        L_0x0035:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r6)
            k14.c r6 = r5.f272431c
            r0.f300328d = r5
            r0.f300329e = r6
            r0.f300332h = r4
            k14.d r6 = (k14.C60942d) r6
            java.lang.Object r0 = r6.mo85908b(r3, r0)
            if (r0 != r1) goto L_0x0051
            goto L_0x0060
        L_0x0051:
            boolean r0 = r5.f272432d     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0056
            goto L_0x0059
        L_0x0056:
            r5.f272432d = r4     // Catch:{ all -> 0x0061 }
            r4 = 0
        L_0x0059:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0061 }
            r6.mo85909c(r3)
        L_0x0060:
            return r1
        L_0x0061:
            r5 = move-exception
            r6.mo85909c(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader.m119248c(com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader, wx3.d):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r5v6, types: [k14.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m119249d(com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader r5, ve2.C102179e r6, wx3.C15601d r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof ue2.C102005c
            if (r0 == 0) goto L_0x0016
            r0 = r7
            ue2.c r0 = (ue2.C102005c) r0
            int r1 = r0.f300338i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f300338i = r1
            goto L_0x001b
        L_0x0016:
            ue2.c r0 = new ue2.c
            r0.<init>(r5, r7)
        L_0x001b:
            java.lang.Object r7 = r0.f300336g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f300338i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r4) goto L_0x0039
            java.lang.Object r5 = r0.f300335f
            k14.c r5 = (k14.C99088c) r5
            java.lang.Object r6 = r0.f300334e
            ve2.e r6 = (ve2.C102179e) r6
            java.lang.Object r0 = r0.f300333d
            com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader r0 = (com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader) r0
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
            k14.c r7 = r5.f272431c
            r0.f300333d = r5
            r0.f300334e = r6
            r0.f300335f = r7
            r0.f300338i = r4
            k14.d r7 = (k14.C60942d) r7
            java.lang.Object r0 = r7.mo85908b(r3, r0)
            if (r0 != r1) goto L_0x0057
            goto L_0x0060
        L_0x0057:
            r5.f272429a = r6     // Catch:{ all -> 0x0061 }
            rx3.b0 r5 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0061 }
            r7.mo85909c(r3)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0060:
            return r1
        L_0x0061:
            r5 = move-exception
            r7.mo85909c(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader.m119249d(com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader, ve2.e, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0057, code lost:
        if (r9 != 7) goto L_0x0182;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo129635a(int r9, int r10, java.lang.String r11, long r12, boolean r14) {
        /*
            r8 = this;
            java.lang.Class<ke2.c> r0 = ke2.C99129c.class
            java.lang.String r1 = "msgItemId"
            gy3.C87412m.m108594g(r11, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "C2CPreDownloadTask End, preDownloadErrType:"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = ", errCode:"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = ", msgId:"
            r1.append(r2)
            r1.append(r11)
            java.lang.String r3 = ", isDownloadNow:"
            r1.append(r3)
            r1.append(r14)
            java.lang.String r3 = ", quota:"
            r1.append(r3)
            long[] r3 = com.tencent.mars.cdn.CdnLogic.queryAvailableQuota()
            r4 = 0
            r5 = r3[r4]
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "MicroMsg.C2CMsgPreDownloader"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            r1 = 1
            java.lang.String r3 = "MicroMsg.C2CPreDownloadPLC"
            if (r9 == r1) goto L_0x0156
            r5 = 2
            r6 = 7
            r7 = 4
            if (r9 == r5) goto L_0x00cc
            if (r9 == r7) goto L_0x009f
            r10 = 5
            if (r9 == r10) goto L_0x0090
            r10 = 6
            if (r9 == r10) goto L_0x005b
            if (r9 == r6) goto L_0x0090
            goto L_0x0182
        L_0x005b:
            di3.d r9 = di3.C86312j.m106911c(r0)
            ke2.c r9 = (ke2.C99129c) r9
            te2.c r9 = r9.Bx0()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "c2c pre download canceled, msgItemId:"
            r10.append(r12)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            if (r14 == 0) goto L_0x0080
            r9.mo141178l3(r11)
            goto L_0x0182
        L_0x0080:
            di3.d r9 = di3.C86312j.m106911c(r0)
            ke2.c r9 = (ke2.C99129c) r9
            r9.requireAccountInitialized()
            xe2.b r9 = r9.f290673z
            r9.mo142290g3(r11, r1)
            goto L_0x0182
        L_0x0090:
            di3.d r9 = di3.C86312j.m106911c(r0)
            ke2.c r9 = (ke2.C99129c) r9
            te2.c r9 = r9.Bx0()
            r9.mo141174g3(r11)
            goto L_0x0182
        L_0x009f:
            di3.d r9 = di3.C86312j.m106911c(r0)
            ke2.c r9 = (ke2.C99129c) r9
            r9.Bx0()
            di3.d r9 = di3.C86312j.m106911c(r0)
            ke2.c r9 = (ke2.C99129c) r9
            r9.requireAccountInitialized()
            xe2.b r9 = r9.f290673z
            r9.mo142286c3(r11)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "c2c pre download fail, deleted, msgSvrId_type:"
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            goto L_0x0182
        L_0x00cc:
            di3.d r9 = di3.C86312j.m106911c(r0)
            ke2.c r9 = (ke2.C99129c) r9
            te2.c r9 = r9.Bx0()
            int r5 = r9.f297823g
            if (r10 != r5) goto L_0x00fe
            di3.d r9 = di3.C86312j.m106911c(r0)
            ke2.c r9 = (ke2.C99129c) r9
            r9.requireAccountInitialized()
            xe2.b r9 = r9.f290673z
            r9.mo142290g3(r11, r6)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "c2c pre download failed, msg expired, msgId:"
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            goto L_0x0182
        L_0x00fe:
            int r5 = r9.f297822f
            if (r10 != r5) goto L_0x0103
            goto L_0x0107
        L_0x0103:
            int r9 = r9.f297824h
            if (r10 != r9) goto L_0x0108
        L_0x0107:
            r4 = 1
        L_0x0108:
            if (r4 == 0) goto L_0x012d
            di3.d r9 = di3.C86312j.m106911c(r0)
            ke2.c r9 = (ke2.C99129c) r9
            r9.requireAccountInitialized()
            xe2.b r9 = r9.f290673z
            r9.mo142289f3(r11, r12)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "c2c pre download failed, quota error, msgId:"
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            goto L_0x0182
        L_0x012d:
            di3.d r9 = di3.C86312j.m106911c(r0)
            ke2.c r9 = (ke2.C99129c) r9
            r9.requireAccountInitialized()
            xe2.b r9 = r9.f290673z
            r9.mo142290g3(r11, r7)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "c2c pre download failed, errorCode:"
            r9.append(r12)
            r9.append(r10)
            r9.append(r2)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            goto L_0x0182
        L_0x0156:
            di3.d r9 = di3.C86312j.m106911c(r0)
            ke2.c r9 = (ke2.C99129c) r9
            r9.Bx0()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "c2c pre download end, msgItemId:"
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            di3.d r9 = di3.C86312j.m106911c(r0)
            ke2.c r9 = (ke2.C99129c) r9
            r9.requireAccountInitialized()
            xe2.b r9 = r9.f290673z
            r10 = 3
            r9.mo142290g3(r11, r10)
        L_0x0182:
            rx3.g r9 = r8.f272436h
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            com.tencent.mm.sdk.coroutines.LifecycleScope r9 = (com.tencent.p014mm.sdk.coroutines.LifecycleScope) r9
            com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader$b r10 = new com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader$b
            r12 = 0
            r10.<init>(r14, r8, r11, r12)
            com.tencent.p014mm.sdk.coroutines.LifecycleScope.launchDefault$default(r9, r12, r10, r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader.mo129635a(int, int, java.lang.String, long, boolean):void");
    }

    /* renamed from: e */
    public final void mo129636e(long j, int i, long j2) {
        Log.m105924i("MicroMsg.C2CMsgPreDownloader", "c2c pre download: try cancel msgId:" + j + ", msgType:" + i);
        StringBuilder sb = new StringBuilder();
        sb.append(j2);
        sb.append('_');
        sb.append(i);
        String sb4 = sb.toString();
        C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
        cVar.requireAccountInitialized();
        cVar.f290673z.mo142290g3(sb4, 5);
        C102179e eVar = this.f272429a;
        if (eVar != null && eVar.f300868e.getMsgId() == j && eVar.f300868e.mo142477s2() == i) {
            C102174a.m134628b(eVar, 0, 1, (Object) null);
        }
        C102007e eVar2 = (C102007e) ((C36570n) this.f272435g).getValue();
        LifecycleScope lifecycleScope = (LifecycleScope) ((C36570n) this.f272436h).getValue();
        eVar2.getClass();
        C87412m.m108594g(lifecycleScope, "scope");
        C102179e eVar3 = eVar2.f300344c;
        if (eVar3 != null && C87412m.m108589b(eVar3.f300868e.mo142476r2(), sb4)) {
            C102174a.m134628b(eVar3, 0, 1, (Object) null);
        }
        LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C102013f(eVar2, sb4, (C15601d<? super C102013f>) null), 1, (Object) null);
        this.f272433e = j;
        this.f272434f = i;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo129637f(wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader.C94295a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader$a r0 = (com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader.C94295a) r0
            int r1 = r0.f272442h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f272442h = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader$a r0 = new com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f272440f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f272442h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r1 = r0.f272439e
            k14.c r1 = (k14.C99088c) r1
            java.lang.Object r0 = r0.f272438d
            com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader r0 = (com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004e
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r6)
            k14.c r6 = r5.f272431c
            r0.f272438d = r5
            r0.f272439e = r6
            r0.f272442h = r3
            k14.d r6 = (k14.C60942d) r6
            java.lang.Object r0 = r6.mo85908b(r4, r0)
            if (r0 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r5
            r1 = r6
        L_0x004e:
            r6 = 0
            r0.f272432d = r6     // Catch:{ all -> 0x005b }
            r0.f272429a = r4     // Catch:{ all -> 0x005b }
            rx3.b0 r6 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x005b }
            r1.mo85909c(r4)
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        L_0x005b:
            r6 = move-exception
            r1.mo85909c(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader.mo129637f(wx3.d):java.lang.Object");
    }

    /* renamed from: g */
    public final void mo129638g() {
        if (!NetStatusUtil.isWifiFromCache(MMApplicationContext.getContext())) {
            Log.m105928w("MicroMsg.C2CMsgPreDownloader", "pre download now task find start, is not wifi");
            return;
        }
        C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
        cVar.requireAccountInitialized();
        C102631b bVar = cVar.f290673z;
        bVar.getClass();
        Column column = C102676x0.f303110C;
        SingleCondition largerEqual = column.largerEqual((Number) Long.valueOf(C31543z5.m39453c() - 300000));
        Column column2 = C102676x0.f303133y;
        ISqlCondition and = largerEqual.and(column2.inNumber(C64197v.m75537f(1, 2))).and(C102676x0.f303109B.equal((Number) 1)).and(C102676x0.f303108A.notEqual((Number) 0));
        C102630a aVar = (C102630a) C102676x0.f303129u.selectAll().log("MicroMsg.C2CPreDownloadStorage").where(and).orderBy((List<? extends ISqlOrder>) C64197v.m75537f(column2.orderDesc(), column.orderInc())).build().singleQuery(bVar.getDbProvider().getDB(), C102630a.class);
        if (aVar != null) {
            Log.m105924i("MicroMsg.C2CMsgPreDownloader", "pre download test, item status:" + aVar.getStatus() + ", svrId" + aVar.mo142476r2());
            String r2 = aVar.mo142476r2();
            C87412m.m108593f(r2, "it.msgItemId");
            LifecycleScope.launchDefault$default((LifecycleScope) ((C36570n) this.f272436h).getValue(), (C53934p0) null, new C102006d(r2, this, (C15601d<? super C102006d>) null), 1, (Object) null);
        }
    }

    /* renamed from: h */
    public final void mo129639h(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("try start pre download, quota:");
        sb.append(CdnLogic.queryAvailableQuota()[0]);
        sb.append(", downloadingTask:");
        C102179e eVar = this.f272429a;
        sb.append(eVar != null ? Long.valueOf(eVar.f300869f) : null);
        Log.m105924i("MicroMsg.C2CMsgPreDownloader", sb.toString());
        LifecycleScope.launchDefault$default((LifecycleScope) ((C36570n) this.f272436h).getValue(), (C53934p0) null, new C94298d(this, z, (C15601d<? super C94298d>) null), 1, (Object) null);
    }
}
