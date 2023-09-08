package wb1;

import a14.C0000n0;
import a14.C53934p0;
import android.content.Context;
import com.tencent.p014mm.modelcdntran.C92798v;
import com.tencent.p014mm.sdk.coroutines.FlowController;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.vfs.C86013q1;
import d14.C45253g;
import d14.C58097y0;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import i40.C98598e;
import kotlin.ResultKt;
import p1081gi.C98124g;
import p663qo.C77384i;
import p749xh.C102657n2;
import p749xh.C102670ua;
import pb1.C100746u;
import rx3.C13598b0;
import rx3.C13600d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: wb1.c */
public final class C102386c extends C102384a {

    /* renamed from: g */
    public final C13601g f301547g = C36568h.m40985a(C102389b.f301556d);

    @C91590f(mo125468c = "com.tencent.mm.plugin.fav.model.service.FavCdnDownloadServiceFSC$cancelTask$1", mo125469f = "FavCdnDownloadServiceFSC.kt", mo125470l = {64}, mo125471m = "invokeSuspend")
    /* renamed from: wb1.c$a */
    public static final class C102387a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f301548d;

        /* renamed from: e */
        public /* synthetic */ Object f301549e;

        /* renamed from: f */
        public final /* synthetic */ C58097y0<C92798v> f301550f;

        /* renamed from: g */
        public final /* synthetic */ String f301551g;

        /* renamed from: h */
        public final /* synthetic */ C102386c f301552h;

        /* renamed from: wb1.c$a$a */
        public static final class C102388a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ String f301553d;

            /* renamed from: e */
            public final /* synthetic */ C0000n0 f301554e;

            /* renamed from: f */
            public final /* synthetic */ C102386c f301555f;

            public C102388a(String str, C0000n0 n0Var, C102386c cVar) {
                this.f301553d = str;
                this.f301554e = n0Var;
                this.f301555f = cVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                C92798v vVar = (C92798v) obj;
                Log.m105924i("MicroMsg.Fav.FavCdnDownloadServiceFSC", "cancelTask " + vVar.f267130a + ' ' + vVar.f267131b + ' ' + vVar.f267132c);
                SelectSql l2 = C102657n2.m135634l2(this.f301553d);
                if (C102670ua.f303014i == null) {
                    C102670ua.f303014i = new C102670ua();
                }
                C102670ua uaVar = C102670ua.f303014i;
                boolean z = true;
                if (uaVar == null || !uaVar.mo125628r()) {
                    z = false;
                }
                if (!z) {
                    uaVar = null;
                }
                C100746u uVar = (C100746u) l2.singleQuery(uaVar, C100746u.class);
                if (uVar != null) {
                    this.f301555f.mo141968g3(uVar);
                } else {
                    C98124g gVar = vVar.f267133d;
                    if (gVar != null) {
                        C86013q1.m106445f(gVar.field_fullpath);
                        Log.m105924i("MicroMsg.Fav.FavCdnDownloadServiceFSC", "cancel task delete temp file " + gVar.field_fullpath);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102387a(C58097y0<C92798v> y0Var, String str, C102386c cVar, C15601d<? super C102387a> dVar) {
            super(2, dVar);
            this.f301550f = y0Var;
            this.f301551g = str;
            this.f301552h = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C102387a aVar = new C102387a(this.f301550f, this.f301551g, this.f301552h, dVar);
            aVar.f301549e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C102387a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f301548d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0000n0 n0Var = (C0000n0) this.f301549e;
                C58097y0<C92798v> y0Var = this.f301550f;
                if (y0Var == null) {
                    return C13598b0.f38549a;
                }
                C102388a aVar2 = new C102388a(this.f301551g, n0Var, this.f301552h);
                this.f301548d = 1;
                if (y0Var.mo31880a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            throw new C13600d();
        }
    }

    /* renamed from: wb1.c$b */
    public static final class C102389b extends C87413o implements C32224a<FlowController> {

        /* renamed from: d */
        public static final C102389b f301556d = new C102389b();

        public C102389b() {
            super(0);
        }

        public Object invoke() {
            return new FlowController(4, C15060d.f41194d);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.fav.model.service.FavCdnDownloadServiceFSC$start$1", mo125469f = "FavCdnDownloadServiceFSC.kt", mo125470l = {43, 48}, mo125471m = "invokeSuspend")
    /* renamed from: wb1.c$c */
    public static final class C102390c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f301557d;

        /* renamed from: e */
        public Object f301558e;

        /* renamed from: f */
        public Object f301559f;

        /* renamed from: g */
        public int f301560g;

        /* renamed from: h */
        public final /* synthetic */ C102386c f301561h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102390c(C102386c cVar, C15601d<? super C102390c> dVar) {
            super(2, dVar);
            this.f301561h = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C102390c(this.f301561h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C102390c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x0151  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x017e  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0214  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f301560g
                r4 = 10
                r5 = 2
                r6 = 4
                r7 = 1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9 = 0
                java.lang.String r10 = "MicroMsg.Fav.FavCdnDownloadServiceFSC"
                if (r2 == 0) goto L_0x003a
                if (r2 == r7) goto L_0x0034
                if (r2 != r5) goto L_0x002c
                java.lang.Object r2 = r0.f301559f
                pb1.u r2 = (pb1.C100746u) r2
                java.lang.Object r8 = r0.f301558e
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r11 = r0.f301557d
                wb1.c r11 = (wb1.C102386c) r11
                kotlin.ResultKt.throwOnFailure(r20)
                r12 = r20
                r3 = r0
                goto L_0x0176
            L_0x002c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0034:
                kotlin.ResultKt.throwOnFailure(r20)
                r2 = r20
                goto L_0x004c
            L_0x003a:
                kotlin.ResultKt.throwOnFailure(r20)
                wb1.c r2 = r0.f301561h
                com.tencent.mm.sdk.coroutines.FlowController r2 = r2.mo141976G3()
                r0.f301560g = r7
                java.lang.Object r2 = r2.currentFlowInfo(r0)
                if (r2 != r1) goto L_0x004c
                return r1
            L_0x004c:
                wb1.c r11 = r0.f301561h
                java.util.List r2 = (java.util.List) r2
                int r12 = r2.size()
                if (r12 >= r6) goto L_0x0218
                r2 = 3
                r12 = 180000(0x2bf20, double:8.8932E-319)
                com.tencent.mm.sdk.storage.sql.Column r14 = p749xh.C102657n2.f302702y
                com.tencent.mm.sdk.storage.sql.SingleCondition r14 = r14.equal((java.lang.Number) r8)
                com.tencent.mm.sdk.storage.sql.Column r15 = p749xh.C102657n2.f302701x
                com.tencent.mm.sdk.storage.sql.SingleCondition r15 = r15.equal((java.lang.Number) r8)
                com.tencent.mm.sdk.storage.sql.ISqlCondition r14 = r14.and(r15)
                com.tencent.mm.sdk.storage.sql.Column r15 = p749xh.C102657n2.f302679A
                java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
                com.tencent.mm.sdk.storage.sql.SingleCondition r3 = r15.equal((java.lang.Number) r3)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                com.tencent.mm.sdk.storage.sql.ISqlCondition r2 = r15.between(r2, r8, r9, r7)
                com.tencent.mm.sdk.storage.sql.Column r8 = p749xh.C102657n2.f302703z
                long r16 = eb0.C31543z5.m39453c()
                long r16 = r16 - r12
                java.lang.Long r12 = java.lang.Long.valueOf(r16)
                com.tencent.mm.sdk.storage.sql.SingleCondition r12 = r8.smallerEqual((java.lang.Number) r12)
                com.tencent.mm.sdk.storage.sql.ISqlCondition r2 = r2.and(r12)
                com.tencent.mm.sdk.storage.sql.ISqlCondition r2 = r3.mo81855or(r2)
                com.tencent.mm.sdk.storage.sql.ISqlCondition r2 = r14.and(r2)
                java.util.LinkedList r3 = new java.util.LinkedList
                r3.<init>()
                java.util.LinkedList r12 = new java.util.LinkedList
                r12.<init>()
                java.util.LinkedList r13 = new java.util.LinkedList
                r13.<init>()
                com.tencent.mm.sdk.storage.sql.ISqlOrder r8 = r8.orderDesc()
                r12.add(r8)
                com.tencent.mm.sdk.storage.sql.SelectSql$Limit r8 = new com.tencent.mm.sdk.storage.sql.SelectSql$Limit
                r8.<init>(r6, r9)
                com.tencent.mm.sdk.storage.sql.SingleTable r14 = p749xh.C102657n2.f302698u
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r3 = r14.select((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlColumn>) r3)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r2 = r3.where(r2)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r2 = r2.orderBy((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlOrder>) r12)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r2 = r2.groupBy((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.Column>) r13)
                int r3 = r8.getLimit()
                int r8 = r8.getOffset()
                r2.limit(r3, r8)
                com.tencent.mm.sdk.storage.sql.SelectSql r2 = r2.build()
                java.lang.String r3 = "select().selectAllColumn…).limit(limit, 0).build()"
                gy3.C87412m.m108593f(r2, r3)
                xh.ua r3 = p749xh.C102670ua.f303014i
                if (r3 != 0) goto L_0x00e5
                xh.ua r3 = new xh.ua
                r3.<init>()
                p749xh.C102670ua.f303014i = r3
            L_0x00e5:
                xh.ua r3 = p749xh.C102670ua.f303014i
                if (r3 == 0) goto L_0x00f1
                boolean r8 = r3.mo125628r()
                if (r8 != r7) goto L_0x00f1
                r8 = 1
                goto L_0x00f2
            L_0x00f1:
                r8 = 0
            L_0x00f2:
                if (r8 == 0) goto L_0x00f5
                goto L_0x00f6
            L_0x00f5:
                r3 = 0
            L_0x00f6:
                java.lang.Class<pb1.u> r8 = pb1.C100746u.class
                java.util.List r2 = r2.multiQuery(r3, r8)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r8 = "getNeedDownloadInfoList "
                r3.append(r8)
                java.util.ArrayList r8 = new java.util.ArrayList
                int r12 = sx3.C36907w.m41090l(r2, r4)
                r8.<init>(r12)
                java.util.Iterator r12 = r2.iterator()
            L_0x0113:
                boolean r13 = r12.hasNext()
                if (r13 == 0) goto L_0x013b
                java.lang.Object r13 = r12.next()
                pb1.u r13 = (pb1.C100746u) r13
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = r13.field_dataId
                r14.append(r15)
                r15 = 95
                r14.append(r15)
                int r13 = r13.field_retryTime
                r14.append(r13)
                java.lang.String r13 = r14.toString()
                r8.add(r13)
                goto L_0x0113
            L_0x013b:
                r3.append(r8)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
                java.util.Iterator r2 = r2.iterator()
                r8 = r2
                r2 = r0
            L_0x014b:
                boolean r3 = r8.hasNext()
                if (r3 == 0) goto L_0x022d
                java.lang.Object r3 = r8.next()
                pb1.u r3 = (pb1.C100746u) r3
                com.tencent.mm.sdk.coroutines.FlowController r12 = r11.mo141976G3()
                java.lang.String r13 = r3.field_dataId
                java.lang.String r14 = "cdnInfo.field_dataId"
                gy3.C87412m.m108593f(r13, r14)
                r2.f301557d = r11
                r2.f301558e = r8
                r2.f301559f = r3
                r2.f301560g = r5
                java.lang.Object r12 = r12.inFlow(r13, r2)
                if (r12 != r1) goto L_0x0171
                return r1
            L_0x0171:
                r18 = r3
                r3 = r2
                r2 = r18
            L_0x0176:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto L_0x0214
                r11.getClass()
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "startCdnTask:"
                r12.append(r13)
                org.json.JSONObject r13 = r2.toJSON()
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r12)
                gi.g r12 = new gi.g
                r12.<init>()
                java.lang.String r13 = "task_FavCdnService"
                r12.f287660d = r13
                java.lang.String r13 = r2.field_dataId
                r12.field_mediaId = r13
                r12.f287663g = r5
                r12.field_appType = r4
                r12.f287661e = r9
                int r13 = r2.field_totalLen
                r12.field_totalLen = r13
                java.lang.String r13 = r2.field_cdnKey
                r12.field_aesKey = r13
                java.lang.String r13 = r2.field_cdnUrl
                r12.field_fileId = r13
                r12.field_priority = r5
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r2.field_path
                java.lang.String r14 = com.tencent.p014mm.vfs.C86013q1.m106448i(r14, r9)
                r13.append(r14)
                java.lang.String r14 = ".temp"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r12.field_fullpath = r13
                r12.field_needStorage = r7
                int r13 = r2.field_dataType
                if (r13 != r6) goto L_0x01dd
                r14 = 1
                goto L_0x01de
            L_0x01dd:
                r14 = 0
            L_0x01de:
                r12.field_isStreamMedia = r14
                r12.f287657N = r6
                if (r13 != r6) goto L_0x01e6
                r13 = 1
                goto L_0x01e7
            L_0x01e6:
                r13 = 0
            L_0x01e7:
                if (r13 == 0) goto L_0x01f2
                r13 = 10002(0x2712, float:1.4016E-41)
                int r13 = r11.mo141970j3(r2, r13)
                r12.field_fileType = r13
                goto L_0x01fa
            L_0x01f2:
                r13 = 10001(0x2711, float:1.4014E-41)
                int r13 = r11.mo141970j3(r2, r13)
                r12.field_fileType = r13
            L_0x01fa:
                java.lang.Class<qo.i> r13 = p663qo.C77384i.class
                di3.d r13 = di3.C86312j.m106911c(r13)
                qo.i r13 = (p663qo.C77384i) r13
                d14.y0 r12 = r13.mo107508xZ(r12)
                com.tencent.mm.sdk.coroutines.LifecycleScope r13 = r11.mo141971k3()
                wb1.f r14 = new wb1.f
                r15 = 0
                r14.<init>(r12, r11, r2, r15)
                com.tencent.p014mm.sdk.coroutines.LifecycleScope.launchDefault$default(r13, r15, r14, r7, r15)
                goto L_0x0215
            L_0x0214:
                r15 = 0
            L_0x0215:
                r2 = r3
                goto L_0x014b
            L_0x0218:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "startDownload max flow, do not add cdn info "
                r1.append(r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            L_0x022d:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: wb1.C102386c.C102390c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102386c(C98598e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "plugin");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r5v15, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r5v16, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r5v47 */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03f8, code lost:
        if (r3.outFlow(r2, r6) == r7) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0463, code lost:
        if (r11 != null) goto L_0x0480;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0246 A[SYNTHETIC, Splitter:B:127:0x0246] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0253 A[SYNTHETIC, Splitter:B:132:0x0253] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x026d A[SYNTHETIC, Splitter:B:142:0x026d] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x027b A[SYNTHETIC, Splitter:B:147:0x027b] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x028c A[SYNTHETIC, Splitter:B:154:0x028c] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01d8 A[SYNTHETIC, Splitter:B:86:0x01d8] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e7 A[SYNTHETIC, Splitter:B:92:0x01e7] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: o3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m135115o3(wb1.C102386c r22, java.lang.String r23, com.tencent.p014mm.modelcdntran.C92798v r24, wx3.C15601d r25) {
        /*
            r1 = r22
            r2 = r23
            r0 = r24
            r3 = r25
            r22.getClass()
            java.lang.Class<pb1.j1> r4 = pb1.C100718j1.class
            boolean r5 = r3 instanceof wb1.C102391e
            if (r5 == 0) goto L_0x0020
            r5 = r3
            wb1.e r5 = (wb1.C102391e) r5
            int r6 = r5.f301567i
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x0020
            int r6 = r6 - r7
            r5.f301567i = r6
            goto L_0x0025
        L_0x0020:
            wb1.e r5 = new wb1.e
            r5.<init>(r1, r3)
        L_0x0025:
            java.lang.Object r3 = r5.f301565g
            xx3.a r6 = xx3.C15911a.COROUTINE_SUSPENDED
            int r7 = r5.f301567i
            java.lang.String r8 = "MicroMsg.Fav.FavCdnDownloadServiceFSC"
            r9 = 2
            r10 = 1
            if (r7 == 0) goto L_0x0062
            if (r7 == r10) goto L_0x0054
            if (r7 != r9) goto L_0x004c
            java.lang.Object r0 = r5.f301564f
            com.tencent.mm.modelcdntran.v r0 = (com.tencent.p014mm.modelcdntran.C92798v) r0
            java.lang.Object r1 = r5.f301563e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r5.f301562d
            wb1.c r2 = (wb1.C102386c) r2
            kotlin.ResultKt.throwOnFailure(r3)
            r5 = r8
            r21 = r2
            r2 = r1
            r1 = r21
            goto L_0x03fc
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0054:
            java.lang.Object r0 = r5.f301563e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r5.f301562d
            wb1.c r1 = (wb1.C102386c) r1
            kotlin.ResultKt.throwOnFailure(r3)
            r5 = r8
            goto L_0x0367
        L_0x0062:
            kotlin.ResultKt.throwOnFailure(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "handleCdnDownloadEvent "
            r3.append(r7)
            r3.append(r2)
            r7 = 32
            r3.append(r7)
            com.tencent.mm.modelcdntran.v$a r12 = r0.f267130a
            r3.append(r12)
            r3.append(r7)
            int r12 = r0.f267132c
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
            com.tencent.mm.sdk.storage.sql.SelectSql r3 = p749xh.C102657n2.m135634l2(r23)
            xh.ua r12 = p749xh.C102670ua.f303014i
            if (r12 != 0) goto L_0x009a
            xh.ua r12 = new xh.ua
            r12.<init>()
            p749xh.C102670ua.f303014i = r12
        L_0x009a:
            xh.ua r12 = p749xh.C102670ua.f303014i
            r13 = 0
            if (r12 == 0) goto L_0x00a7
            boolean r14 = r12.mo125628r()
            if (r14 != r10) goto L_0x00a7
            r14 = 1
            goto L_0x00a8
        L_0x00a7:
            r14 = 0
        L_0x00a8:
            if (r14 == 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r12 = 0
        L_0x00ac:
            java.lang.Class<pb1.u> r14 = pb1.C100746u.class
            com.tencent.mm.sdk.storage.IAutoDBItem r3 = r3.singleQuery(r12, r14)
            pb1.u r3 = (pb1.C100746u) r3
            if (r3 == 0) goto L_0x0466
            com.tencent.mm.modelcdntran.v$a r12 = r0.f267130a
            int r12 = r12.ordinal()
            java.lang.String r14 = "dataId"
            r15 = 3
            if (r12 == 0) goto L_0x0396
            if (r12 == r10) goto L_0x011d
            if (r12 == r15) goto L_0x00d4
            switch(r12) {
                case 7: goto L_0x0396;
                case 8: goto L_0x0396;
                case 9: goto L_0x00d1;
                case 10: goto L_0x00cb;
                case 11: goto L_0x0396;
                default: goto L_0x00c8;
            }
        L_0x00c8:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0115
        L_0x00cb:
            r1.mo141968g3(r3)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0115
        L_0x00d1:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0115
        L_0x00d4:
            gi.c r0 = r0.f267134e
            if (r0 == 0) goto L_0x0119
            java.lang.Object[] r5 = new java.lang.Object[r15]
            r5[r13] = r2
            long r6 = r0.field_finishedLength
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r6)
            r5[r10] = r11
            long r6 = r0.field_toltalLength
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r6)
            r5[r9] = r11
            java.lang.String r6 = "cdn download progress %s %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r6, r5)
            long r5 = r0.field_finishedLength
            int r6 = (int) r5
            r3.field_offset = r6
            long r5 = r0.field_toltalLength
            int r0 = (int) r5
            r3.field_totalLen = r0
            r3.field_status = r10
            di3.d r0 = di3.C86312j.m106911c(r4)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.n0 r0 = r0.mo128198DE()
            java.lang.String[] r4 = new java.lang.String[r13]
            xb1.a r0 = (xb1.C102612a) r0
            boolean r0 = r0.update(r3, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0115:
            r11 = r0
            r5 = r8
            goto L_0x0463
        L_0x0119:
            r5 = r8
            r11 = 0
            goto L_0x0463
        L_0x011d:
            gi.d r12 = r0.f267135f
            if (r12 == 0) goto L_0x033a
            gi.g r0 = r0.f267133d
            if (r0 == 0) goto L_0x0129
            java.lang.String r0 = r0.field_fullpath
            r10 = r0
            goto L_0x012a
        L_0x0129:
            r10 = 0
        L_0x012a:
            java.lang.String r15 = r3.field_path
            int r0 = r3.field_dataType
            java.lang.String r9 = "#!AMR\n"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "renameAndCopyFile "
            r11.append(r13)
            r11.append(r10)
            r11.append(r7)
            r11.append(r15)
            r11.append(r7)
            r11.append(r0)
            java.lang.String r7 = r11.toString()
            java.lang.String r11 = "MicroMsg.Fav.BaseFavCdnServiceFSC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r7)
            java.lang.String r7 = ""
            if (r10 == 0) goto L_0x02ca
            if (r15 != 0) goto L_0x015b
            goto L_0x02ca
        L_0x015b:
            r13 = -2
            if (r0 != r13) goto L_0x0299
            r18 = r6
            r13 = 0
            java.io.RandomAccessFile r6 = com.tencent.p014mm.vfs.C86013q1.m106420B(r10, r13)     // Catch:{ Exception -> 0x01c9, all -> 0x01c4 }
            r0 = 6
            r19 = r5
            byte[] r5 = new byte[r0]     // Catch:{ Exception -> 0x01bf }
            int r0 = r6.read(r5, r13, r0)     // Catch:{ Exception -> 0x01bf }
            r13 = -1
            if (r0 != r13) goto L_0x0182
            r6.close()     // Catch:{ IOException -> 0x0175 }
            goto L_0x017d
        L_0x0175:
            r0 = move-exception
            r5 = r0
            r6 = 0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r5, r7, r0)
        L_0x017d:
            r16 = r8
            r5 = 0
            r13 = 0
            goto L_0x01e3
        L_0x0182:
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x01bf }
            java.nio.charset.Charset r13 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x01bf }
            r0.<init>(r5, r13)     // Catch:{ Exception -> 0x01bf }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01bf }
            r5.<init>()     // Catch:{ Exception -> 0x01bf }
            java.lang.String r13 = "head "
            r5.append(r13)     // Catch:{ Exception -> 0x01bf }
            r5.append(r0)     // Catch:{ Exception -> 0x01bf }
            java.lang.String r13 = "   AmrFileOperator.AMR_NB_HEAD #!AMR\n"
            r5.append(r13)     // Catch:{ Exception -> 0x01bf }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01bf }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r5)     // Catch:{ Exception -> 0x01bf }
            r16 = r8
            r5 = 2
            r8 = 0
            r13 = 0
            boolean r20 = z04.C112551y.m153808h(r0, r9, r8, r5, r13)     // Catch:{ Exception -> 0x01ba }
            r6.close()     // Catch:{ IOException -> 0x01af }
            goto L_0x01b6
        L_0x01af:
            r0 = move-exception
            r5 = r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r5, r7, r0)
        L_0x01b6:
            r17 = r20
            r5 = 0
            goto L_0x01e5
        L_0x01ba:
            r0 = move-exception
            goto L_0x01d0
        L_0x01bc:
            r0 = move-exception
            goto L_0x0288
        L_0x01bf:
            r0 = move-exception
            r16 = r8
            r13 = 0
            goto L_0x01d0
        L_0x01c4:
            r0 = move-exception
            r13 = 0
            r1 = r0
            goto L_0x028a
        L_0x01c9:
            r0 = move-exception
            r19 = r5
            r16 = r8
            r13 = 0
            r6 = r13
        L_0x01d0:
            r5 = 0
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x01bc }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r7, r8)     // Catch:{ all -> 0x01bc }
            if (r6 == 0) goto L_0x01e3
            r6.close()     // Catch:{ IOException -> 0x01dc }
            goto L_0x01e3
        L_0x01dc:
            r0 = move-exception
            r6 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r6, r7, r0)
        L_0x01e3:
            r17 = 0
        L_0x01e5:
            if (r17 != 0) goto L_0x029f
            java.io.InputStream r6 = com.tencent.p014mm.vfs.C86013q1.m106423E(r10)     // Catch:{ Exception -> 0x023c, all -> 0x0238 }
            java.io.OutputStream r8 = com.tencent.p014mm.vfs.C86013q1.m106429K(r15, r5)     // Catch:{ Exception -> 0x0234, all -> 0x022f }
            r0 = 16384(0x4000, float:2.2959E-41)
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x022c, all -> 0x0229 }
            java.nio.charset.Charset r5 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x022c, all -> 0x0229 }
            byte[] r5 = r9.getBytes(r5)     // Catch:{ Exception -> 0x022c, all -> 0x0229 }
            java.lang.String r9 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r5, r9)     // Catch:{ Exception -> 0x022c, all -> 0x0229 }
            r8.write(r5)     // Catch:{ Exception -> 0x022c, all -> 0x0229 }
        L_0x0202:
            int r5 = r6.read(r0)     // Catch:{ Exception -> 0x022c, all -> 0x0229 }
            r9 = -1
            if (r5 == r9) goto L_0x020e
            r13 = 0
            r8.write(r0, r13, r5)     // Catch:{ Exception -> 0x022c, all -> 0x0229 }
            goto L_0x0202
        L_0x020e:
            r6.close()     // Catch:{ IOException -> 0x0214 }
            r0 = 1
            r6 = 0
            goto L_0x021d
        L_0x0214:
            r0 = move-exception
            r5 = r0
            r6 = 0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r5, r7, r0)
            r0 = 0
        L_0x021d:
            r8.close()     // Catch:{ IOException -> 0x0221 }
            goto L_0x025f
        L_0x0221:
            r0 = move-exception
            r5 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r5, r7, r0)
            goto L_0x025e
        L_0x0229:
            r0 = move-exception
            r13 = r8
            goto L_0x0230
        L_0x022c:
            r0 = move-exception
            r13 = r8
            goto L_0x0235
        L_0x022f:
            r0 = move-exception
        L_0x0230:
            r1 = r0
            r5 = r13
            r13 = r6
            goto L_0x026b
        L_0x0234:
            r0 = move-exception
        L_0x0235:
            r5 = r13
            r13 = r6
            goto L_0x023e
        L_0x0238:
            r0 = move-exception
            r1 = r0
            r5 = r13
            goto L_0x026b
        L_0x023c:
            r0 = move-exception
            r5 = r13
        L_0x023e:
            r6 = 0
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x0269 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r7, r8)     // Catch:{ all -> 0x0269 }
            if (r13 == 0) goto L_0x0251
            r13.close()     // Catch:{ IOException -> 0x024a }
            goto L_0x0251
        L_0x024a:
            r0 = move-exception
            r8 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r8, r7, r0)
        L_0x0251:
            if (r5 == 0) goto L_0x025e
            r5.close()     // Catch:{ IOException -> 0x0257 }
            goto L_0x025e
        L_0x0257:
            r0 = move-exception
            r5 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r5, r7, r0)
        L_0x025e:
            r0 = 0
        L_0x025f:
            if (r0 == 0) goto L_0x029f
            java.lang.String r0 = "renameAndCopyFile write amr head ok!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            goto L_0x02d0
        L_0x0269:
            r0 = move-exception
            r1 = r0
        L_0x026b:
            if (r13 == 0) goto L_0x0279
            r13.close()     // Catch:{ IOException -> 0x0271 }
            goto L_0x0279
        L_0x0271:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r2, r7, r0)
        L_0x0279:
            if (r5 == 0) goto L_0x0287
            r5.close()     // Catch:{ IOException -> 0x027f }
            goto L_0x0287
        L_0x027f:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r2, r7, r0)
        L_0x0287:
            throw r1
        L_0x0288:
            r1 = r0
            r13 = r6
        L_0x028a:
            if (r13 == 0) goto L_0x0298
            r13.close()     // Catch:{ IOException -> 0x0290 }
            goto L_0x0298
        L_0x0290:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r2, r7, r0)
        L_0x0298:
            throw r1
        L_0x0299:
            r19 = r5
            r18 = r6
            r16 = r8
        L_0x029f:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            r0.<init>((java.lang.String) r10)
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1
            r5.<init>((java.lang.String) r15)
            boolean r6 = r0.mo119967g()
            if (r6 == 0) goto L_0x02d0
            boolean r0 = r0.mo119988y(r5)
            r6 = 3
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6 = 0
            r8[r6] = r0
            r6 = 1
            r8[r6] = r10
            r6 = 2
            r8[r6] = r5
            java.lang.String r0 = "rename file suc:%b, old:%s, new:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r0, r8)
            goto L_0x02d0
        L_0x02ca:
            r19 = r5
            r18 = r6
            r16 = r8
        L_0x02d0:
            java.lang.String r0 = r3.field_path
            if (r0 != 0) goto L_0x02d5
            goto L_0x02d6
        L_0x02d5:
            r7 = r0
        L_0x02d6:
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r7)
            r7 = 3
            r3.field_status = r7
            int r0 = (int) r5
            r3.field_offset = r0
            r3.field_totalLen = r0
            di3.d r0 = di3.C86312j.m106911c(r4)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.n0 r0 = r0.mo128198DE()
            r7 = 0
            java.lang.String[] r8 = new java.lang.String[r7]
            xb1.a r0 = (xb1.C102612a) r0
            r0.update(r3, r8)
            r1.mo141972l3(r3, r12)
            di3.d r0 = di3.C86312j.m106911c(r4)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.n0 r0 = r0.mo128198DE()
            java.lang.String[] r4 = new java.lang.String[]{r14}
            xb1.a r0 = (xb1.C102612a) r0
            r0.delete(r3, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "transfer done, mediaid="
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = " filesize="
            r0.append(r3)
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r5, r3)
            r0.append(r3)
            java.lang.String r3 = " completeInfo="
            r0.append(r3)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r5 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            rx3.b0 r11 = rx3.C13598b0.f38549a
            goto L_0x0341
        L_0x033a:
            r19 = r5
            r18 = r6
            r5 = r8
            r13 = 0
            r11 = r13
        L_0x0341:
            r3 = 1
            if (r11 != 0) goto L_0x034f
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r4 = 0
            r0[r4] = r2
            java.lang.String r4 = "sceneResult is null %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r4, r0)
        L_0x034f:
            com.tencent.mm.sdk.coroutines.FlowController r0 = r22.mo141976G3()
            r6 = r19
            r6.f301562d = r1
            r6.f301563e = r2
            r6.f301567i = r3
            java.lang.Object r3 = r0.outFlow(r2, r6)
            r7 = r18
            if (r3 != r7) goto L_0x0366
        L_0x0363:
            r6 = r7
            goto L_0x0482
        L_0x0366:
            r0 = r2
        L_0x0367:
            java.lang.Number r3 = (java.lang.Number) r3
            long r2 = r3.longValue()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "download success mediaId:"
            r4.append(r6)
            r4.append(r0)
            java.lang.String r6 = " cost:"
            r4.append(r6)
            long r6 = eb0.C31543z5.m39453c()
            long r6 = r6 - r2
            r4.append(r6)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            r1.mo141977I3()
            rx3.b0 r11 = rx3.C13598b0.f38549a
            r2 = r0
            goto L_0x0463
        L_0x0396:
            r7 = r6
            r6 = r5
            r5 = r8
            int r8 = r0.f267132c
            r9 = -21006(0xffffffffffffadf2, float:NaN)
            if (r8 == r9) goto L_0x045e
            int r8 = r3.field_retryTime
            r9 = 4
            r10 = 3
            if (r8 > r10) goto L_0x03ab
            r10 = 1
            int r8 = r8 + r10
            r3.field_retryTime = r8
            r8 = 0
            goto L_0x03b6
        L_0x03ab:
            r8 = 0
            r3.field_retryTime = r8
            r3.field_status = r9
            java.lang.String r10 = "mark cdnInfo Error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
        L_0x03b6:
            long r10 = eb0.C31543z5.m39453c()
            r3.field_modifyTime = r10
            di3.d r10 = di3.C86312j.m106911c(r4)
            pb1.j1 r10 = (pb1.C100718j1) r10
            pb1.n0 r10 = r10.mo128198DE()
            java.lang.String[] r8 = new java.lang.String[r8]
            xb1.a r10 = (xb1.C102612a) r10
            r10.update(r3, r8)
            r1.mo141968g3(r3)
            int r8 = r3.field_status
            if (r8 != r9) goto L_0x03e7
            di3.d r4 = di3.C86312j.m106911c(r4)
            pb1.j1 r4 = (pb1.C100718j1) r4
            pb1.n0 r4 = r4.mo128198DE()
            java.lang.String[] r8 = new java.lang.String[]{r14}
            xb1.a r4 = (xb1.C102612a) r4
            r4.delete(r3, r8)
        L_0x03e7:
            com.tencent.mm.sdk.coroutines.FlowController r3 = r22.mo141976G3()
            r6.f301562d = r1
            r6.f301563e = r2
            r6.f301564f = r0
            r4 = 2
            r6.f301567i = r4
            java.lang.Object r3 = r3.outFlow(r2, r6)
            if (r3 != r7) goto L_0x03fc
            goto L_0x0363
        L_0x03fc:
            r3 = -6101(0xffffffffffffe82b, float:NaN)
            int r0 = r0.f267132c
            if (r3 != r0) goto L_0x0408
            r3 = 1
            r1.mo141973m3(r3)
            goto L_0x045e
        L_0x0408:
            r3 = -5103015(0xffffffffffb22259, float:NaN)
            if (r0 == r3) goto L_0x0459
            r3 = -21020(0xffffffffffffade4, float:NaN)
            if (r0 == r3) goto L_0x0453
            r3 = -21014(0xffffffffffffadea, float:NaN)
            if (r0 == r3) goto L_0x044d
            r3 = -21009(0xffffffffffffadef, float:NaN)
            if (r0 == r3) goto L_0x0447
            r3 = -21000(0xffffffffffffadf8, float:NaN)
            if (r0 == r3) goto L_0x0441
            r3 = -10012(0xffffffffffffd8e4, float:NaN)
            if (r0 == r3) goto L_0x043b
            r3 = -10005(0xffffffffffffd8eb, float:NaN)
            if (r0 == r3) goto L_0x0435
            r3 = -10003(0xffffffffffffd8ed, float:NaN)
            if (r0 == r3) goto L_0x042f
            r3 = 0
            r1.mo141973m3(r3)
            goto L_0x045e
        L_0x042f:
            r3 = 2
            r1.mo141973m3(r3)
            goto L_0x045e
        L_0x0435:
            r3 = 3
            r1.mo141973m3(r3)
            goto L_0x045e
        L_0x043b:
            r3 = 9
            r1.mo141973m3(r3)
            goto L_0x045e
        L_0x0441:
            r3 = 4
            r1.mo141973m3(r3)
            goto L_0x045e
        L_0x0447:
            r3 = 5
            r1.mo141973m3(r3)
            goto L_0x045e
        L_0x044d:
            r3 = 6
            r1.mo141973m3(r3)
            goto L_0x045e
        L_0x0453:
            r3 = 7
            r1.mo141973m3(r3)
            goto L_0x045e
        L_0x0459:
            r3 = 8
            r1.mo141973m3(r3)
        L_0x045e:
            r1.mo141977I3()
            rx3.b0 r11 = rx3.C13598b0.f38549a
        L_0x0463:
            if (r11 != 0) goto L_0x0480
            goto L_0x0467
        L_0x0466:
            r5 = r8
        L_0x0467:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "get cdn info is null "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r1.mo141975F3(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0480:
            rx3.b0 r6 = rx3.C13598b0.f38549a
        L_0x0482:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wb1.C102386c.m135115o3(wb1.c, java.lang.String, com.tencent.mm.modelcdntran.v, wx3.d):java.lang.Object");
    }

    /* renamed from: F3 */
    public final void mo141975F3(String str) {
        C87412m.m108594g(str, "mediaId");
        Log.m105924i("MicroMsg.Fav.FavCdnDownloadServiceFSC", "cancelTask " + str);
        LifecycleScope.launchDefault$default(mo141971k3(), (C53934p0) null, new C102387a(((C77384i) C86312j.m106911c(C77384i.class)).mo107505nD(str), str, this, (C15601d<? super C102387a>) null), 1, (Object) null);
    }

    /* renamed from: G3 */
    public final FlowController mo141976G3() {
        return (FlowController) ((C36570n) this.f301547g).getValue();
    }

    /* renamed from: I3 */
    public final void mo141977I3() {
        LifecycleScope.launchDefault$default(mo141971k3(), (C53934p0) null, new C102390c(this, (C15601d<? super C102390c>) null), 1, (Object) null);
    }

    /* renamed from: d3 */
    public void mo57310d3(Context context) {
        C87412m.m108594g(context, "context");
        mo141977I3();
    }
}
