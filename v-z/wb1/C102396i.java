package wb1;

import a14.C0000n0;
import a14.C53934p0;
import android.content.Context;
import com.tencent.p014mm.sdk.coroutines.FlowController;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import i40.C98598e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: wb1.i */
public final class C102396i extends C102384a {

    /* renamed from: g */
    public final C13601g f301581g = C36568h.m40985a(C102398b.f301587d);

    @C91590f(mo125468c = "com.tencent.mm.plugin.fav.model.service.FavCdnUploadServiceFSC$start$1", mo125469f = "FavCdnUploadServiceFSC.kt", mo125470l = {46, 51}, mo125471m = "invokeSuspend")
    /* renamed from: wb1.i$a */
    public static final class C102397a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f301582d;

        /* renamed from: e */
        public Object f301583e;

        /* renamed from: f */
        public Object f301584f;

        /* renamed from: g */
        public int f301585g;

        /* renamed from: h */
        public final /* synthetic */ C102396i f301586h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102397a(C102396i iVar, C15601d<? super C102397a> dVar) {
            super(2, dVar);
            this.f301586h = iVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C102397a(this.f301586h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C102397a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x012f  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x015f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f301585g
                r3 = 0
                r4 = 10
                r5 = 2
                r6 = 1
                r7 = 0
                java.lang.String r8 = "MicroMsg.Fav.FavCdnUploadServicePLC"
                if (r2 == 0) goto L_0x0039
                if (r2 == r6) goto L_0x0033
                if (r2 != r5) goto L_0x002b
                java.lang.Object r2 = r0.f301584f
                pb1.u r2 = (pb1.C100746u) r2
                java.lang.Object r9 = r0.f301583e
                java.util.Iterator r9 = (java.util.Iterator) r9
                java.lang.Object r10 = r0.f301582d
                wb1.i r10 = (wb1.C102396i) r10
                kotlin.ResultKt.throwOnFailure(r18)
                r12 = r18
                r11 = r10
                r10 = r9
                r9 = r8
                r8 = r0
                goto L_0x0157
            L_0x002b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0033:
                kotlin.ResultKt.throwOnFailure(r18)
                r2 = r18
                goto L_0x004b
            L_0x0039:
                kotlin.ResultKt.throwOnFailure(r18)
                wb1.i r2 = r0.f301586h
                com.tencent.mm.sdk.coroutines.FlowController r2 = r2.mo141978F3()
                r0.f301585g = r6
                java.lang.Object r2 = r2.currentFlowInfo(r0)
                if (r2 != r1) goto L_0x004b
                return r1
            L_0x004b:
                wb1.i r9 = r0.f301586h
                java.util.List r2 = (java.util.List) r2
                int r10 = r2.size()
                if (r10 >= r5) goto L_0x0259
                com.tencent.mm.sdk.storage.sql.SingleTable r2 = p749xh.C102657n2.f302698u
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                java.util.LinkedList r10 = new java.util.LinkedList
                r10.<init>()
                java.util.LinkedList r11 = new java.util.LinkedList
                r11.<init>()
                com.tencent.mm.sdk.storage.sql.Column r12 = p749xh.C102657n2.f302702y
                java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
                com.tencent.mm.sdk.storage.sql.SingleCondition r12 = r12.equal((java.lang.Number) r13)
                com.tencent.mm.sdk.storage.sql.Column r13 = p749xh.C102657n2.f302701x
                java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
                com.tencent.mm.sdk.storage.sql.SingleCondition r13 = r13.equal((java.lang.Number) r14)
                com.tencent.mm.sdk.storage.sql.ISqlCondition r12 = r12.and(r13)
                com.tencent.mm.sdk.storage.sql.Column r13 = p749xh.C102657n2.f302703z
                com.tencent.mm.sdk.storage.sql.ISqlOrder r13 = r13.orderDesc()
                r10.add(r13)
                com.tencent.mm.sdk.storage.sql.SelectSql$Limit r13 = new com.tencent.mm.sdk.storage.sql.SelectSql$Limit
                r13.<init>(r5, r7)
                com.tencent.mm.sdk.storage.sql.SingleTable r14 = p749xh.C102657n2.f302698u
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r2 = r14.select((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlColumn>) r2)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r2 = r2.where(r12)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r2 = r2.orderBy((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlOrder>) r10)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r2 = r2.groupBy((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.Column>) r11)
                int r10 = r13.getLimit()
                int r11 = r13.getOffset()
                r2.limit(r10, r11)
                com.tencent.mm.sdk.storage.sql.SelectSql r2 = r2.build()
                java.lang.String r10 = "select().selectAllColumn…).limit(limit, 0).build()"
                gy3.C87412m.m108593f(r2, r10)
                xh.ua r10 = p749xh.C102670ua.f303014i
                if (r10 != 0) goto L_0x00be
                xh.ua r10 = new xh.ua
                r10.<init>()
                p749xh.C102670ua.f303014i = r10
            L_0x00be:
                xh.ua r10 = p749xh.C102670ua.f303014i
                if (r10 == 0) goto L_0x00ca
                boolean r11 = r10.mo125628r()
                if (r11 != r6) goto L_0x00ca
                r11 = 1
                goto L_0x00cb
            L_0x00ca:
                r11 = 0
            L_0x00cb:
                if (r11 == 0) goto L_0x00ce
                goto L_0x00cf
            L_0x00ce:
                r10 = r3
            L_0x00cf:
                java.lang.Class<pb1.u> r11 = pb1.C100746u.class
                java.util.List r2 = r2.multiQuery(r10, r11)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "getNeedUploadInfoList "
                r10.append(r11)
                java.util.ArrayList r11 = new java.util.ArrayList
                int r12 = sx3.C36907w.m41090l(r2, r4)
                r11.<init>(r12)
                java.util.Iterator r12 = r2.iterator()
            L_0x00ec:
                boolean r13 = r12.hasNext()
                if (r13 == 0) goto L_0x0118
                java.lang.Object r13 = r12.next()
                pb1.u r13 = (pb1.C100746u) r13
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = r13.field_dataId
                r14.append(r15)
                r15 = 95
                r14.append(r15)
                java.lang.String r13 = r13.field_path
                boolean r13 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
                r14.append(r13)
                java.lang.String r13 = r14.toString()
                r11.add(r13)
                goto L_0x00ec
            L_0x0118:
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
                java.util.Iterator r2 = r2.iterator()
                r10 = r9
                r9 = r2
                r2 = r0
            L_0x0129:
                boolean r11 = r9.hasNext()
                if (r11 == 0) goto L_0x026e
                java.lang.Object r11 = r9.next()
                pb1.u r11 = (pb1.C100746u) r11
                com.tencent.mm.sdk.coroutines.FlowController r12 = r10.mo141978F3()
                java.lang.String r13 = r11.field_dataId
                java.lang.String r14 = "cdnInfo.field_dataId"
                gy3.C87412m.m108593f(r13, r14)
                r2.f301582d = r10
                r2.f301583e = r9
                r2.f301584f = r11
                r2.f301585g = r5
                java.lang.Object r12 = r12.inFlow(r13, r2)
                if (r12 != r1) goto L_0x014f
                return r1
            L_0x014f:
                r16 = r8
                r8 = r2
                r2 = r11
                r11 = r10
                r10 = r9
                r9 = r16
            L_0x0157:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto L_0x024d
                r11.getClass()
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "startCdnTask:"
                r12.append(r13)
                org.json.JSONObject r13 = r2.toJSON()
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r12)
                java.lang.String r12 = r2.field_path
                boolean r12 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
                r13 = 10001(0x2711, float:1.4014E-41)
                r14 = 4
                if (r12 != 0) goto L_0x01db
                java.lang.String r12 = "startCdnTask upload, but file not exist"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r12)
                r4 = 255(0xff, double:1.26E-321)
                r11.mo141974n3(r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                int r5 = r2.field_type
                r4.append(r5)
                r5 = 58
                r4.append(r5)
                int r12 = r2.field_dataType
                r4.append(r12)
                r4.append(r5)
                java.lang.String r5 = r2.field_dataId
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r5 = 20001(0x4e21, float:2.8027E-41)
                pb1.C100745t.m131894f(r5, r13, r4)
                r2.field_status = r14
                java.lang.Class<pb1.j1> r4 = pb1.C100718j1.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                pb1.j1 r4 = (pb1.C100718j1) r4
                pb1.n0 r4 = r4.mo128198DE()
                java.lang.String[] r5 = new java.lang.String[r7]
                xb1.a r4 = (xb1.C102612a) r4
                r4.update(r2, r5)
                r11.mo141968g3(r2)
                com.tencent.mm.sdk.coroutines.LifecycleScope r4 = r11.mo141971k3()
                wb1.j r5 = new wb1.j
                r5.<init>(r11, r2, r3)
                com.tencent.p014mm.sdk.coroutines.LifecycleScope.launchDefault$default(r4, r3, r5, r6, r3)
                goto L_0x024d
            L_0x01db:
                gi.g r4 = new gi.g
                r4.<init>()
                java.lang.String r5 = "task_FavCdnService"
                r4.f287660d = r5
                java.lang.String r5 = r2.field_dataId
                r4.field_mediaId = r5
                r5 = 2
                r4.f287663g = r5
                r5 = 10
                r4.field_appType = r5
                r4.f287661e = r6
                r4.field_priority = r6
                r4.field_needStorage = r6
                int r12 = r2.field_totalLen
                r4.field_totalLen = r12
                java.lang.String r12 = r2.field_cdnKey
                r4.field_aesKey = r12
                java.lang.String r12 = r2.field_cdnUrl
                r4.field_fileId = r12
                int r12 = r2.field_dataType
                if (r12 != r14) goto L_0x0208
                r12 = 1
                goto L_0x0209
            L_0x0208:
                r12 = 0
            L_0x0209:
                r4.field_isStreamMedia = r12
                java.lang.String r12 = r2.field_path
                java.lang.String r12 = com.tencent.p014mm.vfs.C86013q1.m106448i(r12, r7)
                r4.field_fullpath = r12
                r4.field_use_multithread = r7
                int r12 = r2.field_dataType
                if (r12 != r14) goto L_0x021b
                r12 = 1
                goto L_0x021c
            L_0x021b:
                r12 = 0
            L_0x021c:
                if (r12 == 0) goto L_0x0227
                r12 = 10002(0x2712, float:1.4016E-41)
                int r12 = r11.mo141970j3(r2, r12)
                r4.field_fileType = r12
                goto L_0x022d
            L_0x0227:
                int r12 = r11.mo141970j3(r2, r13)
                r4.field_fileType = r12
            L_0x022d:
                r4.field_force_aeskeycdn = r6
                r4.field_trysafecdn = r7
                r12 = 2
                r4.f287657N = r12
                java.lang.Class<qo.i> r13 = p663qo.C77384i.class
                di3.d r13 = di3.C86312j.m106911c(r13)
                qo.i r13 = (p663qo.C77384i) r13
                d14.y0 r4 = r13.Mi0(r4)
                com.tencent.mm.sdk.coroutines.LifecycleScope r13 = r11.mo141971k3()
                wb1.k r14 = new wb1.k
                r14.<init>(r4, r11, r2, r3)
                com.tencent.p014mm.sdk.coroutines.LifecycleScope.launchDefault$default(r13, r3, r14, r6, r3)
                goto L_0x0250
            L_0x024d:
                r5 = 10
                r12 = 2
            L_0x0250:
                r2 = r8
                r8 = r9
                r9 = r10
                r10 = r11
                r4 = 10
                r5 = 2
                goto L_0x0129
            L_0x0259:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "startUpload max flow, do not add cdn info "
                r1.append(r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            L_0x026e:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: wb1.C102396i.C102397a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: wb1.i$b */
    public static final class C102398b extends C87413o implements C32224a<FlowController> {

        /* renamed from: d */
        public static final C102398b f301587d = new C102398b();

        public C102398b() {
            super(0);
        }

        public Object invoke() {
            return new FlowController(2, C15061l.f41195d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102396i(C98598e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "service");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02bd, code lost:
        if (r2 == null) goto L_0x02bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0034  */
    /* renamed from: o3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m135123o3(wb1.C102396i r17, java.lang.String r18, com.tencent.p014mm.modelcdntran.C92798v r19, wx3.C15601d r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r17.getClass()
            java.lang.Class<pb1.j1> r4 = pb1.C100718j1.class
            boolean r5 = r3 instanceof wb1.C102395h
            if (r5 == 0) goto L_0x0020
            r5 = r3
            wb1.h r5 = (wb1.C102395h) r5
            int r6 = r5.f301580i
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x0020
            int r6 = r6 - r7
            r5.f301580i = r6
            goto L_0x0025
        L_0x0020:
            wb1.h r5 = new wb1.h
            r5.<init>(r0, r3)
        L_0x0025:
            java.lang.Object r3 = r5.f301578g
            xx3.a r6 = xx3.C15911a.COROUTINE_SUSPENDED
            int r7 = r5.f301580i
            r8 = 2
            r9 = 3
            r10 = 0
            java.lang.String r11 = "MicroMsg.Fav.FavCdnUploadServicePLC"
            r12 = 1
            r13 = 4
            if (r7 == 0) goto L_0x0087
            if (r7 == r12) goto L_0x0075
            if (r7 == r8) goto L_0x0063
            if (r7 == r9) goto L_0x004d
            if (r7 != r13) goto L_0x0045
            java.lang.Object r0 = r5.f301575d
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x02d4
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004d:
            java.lang.Object r0 = r5.f301577f
            com.tencent.mm.modelcdntran.v r0 = (com.tencent.p014mm.modelcdntran.C92798v) r0
            java.lang.Object r1 = r5.f301576e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r5.f301575d
            wb1.i r2 = (wb1.C102396i) r2
            kotlin.ResultKt.throwOnFailure(r3)
            r16 = r2
            r2 = r0
            r0 = r16
            goto L_0x0255
        L_0x0063:
            java.lang.Object r0 = r5.f301576e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r5.f301575d
            wb1.i r1 = (wb1.C102396i) r1
            kotlin.ResultKt.throwOnFailure(r3)
            r16 = r1
            r1 = r0
            r0 = r16
            goto L_0x02bc
        L_0x0075:
            java.lang.Object r0 = r5.f301576e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r5.f301575d
            wb1.i r1 = (wb1.C102396i) r1
            kotlin.ResultKt.throwOnFailure(r3)
            r16 = r1
            r1 = r0
            r0 = r16
            goto L_0x01ea
        L_0x0087:
            kotlin.ResultKt.throwOnFailure(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "handleCdnUploadEvent "
            r3.append(r7)
            r3.append(r1)
            r7 = 32
            r3.append(r7)
            com.tencent.mm.modelcdntran.v$a r14 = r2.f267130a
            r3.append(r14)
            r3.append(r7)
            int r7 = r2.f267132c
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
            com.tencent.mm.sdk.storage.sql.SelectSql r3 = p749xh.C102657n2.m135634l2(r18)
            xh.ua r7 = p749xh.C102670ua.f303014i
            if (r7 != 0) goto L_0x00bf
            xh.ua r7 = new xh.ua
            r7.<init>()
            p749xh.C102670ua.f303014i = r7
        L_0x00bf:
            xh.ua r7 = p749xh.C102670ua.f303014i
            r14 = 0
            if (r7 == 0) goto L_0x00cc
            boolean r15 = r7.mo125628r()
            if (r15 != r12) goto L_0x00cc
            r15 = 1
            goto L_0x00cd
        L_0x00cc:
            r15 = 0
        L_0x00cd:
            if (r15 == 0) goto L_0x00d0
            goto L_0x00d1
        L_0x00d0:
            r7 = r10
        L_0x00d1:
            java.lang.Class<pb1.u> r15 = pb1.C100746u.class
            com.tencent.mm.sdk.storage.IAutoDBItem r3 = r3.singleQuery(r7, r15)
            pb1.u r3 = (pb1.C100746u) r3
            if (r3 == 0) goto L_0x02bf
            com.tencent.mm.modelcdntran.v$a r7 = r2.f267130a
            int r7 = r7.ordinal()
            if (r7 == r13) goto L_0x0219
            r15 = 5
            if (r7 == r15) goto L_0x0154
            r15 = 6
            if (r7 == r15) goto L_0x010d
            switch(r7) {
                case 13: goto L_0x00fb;
                case 14: goto L_0x00f7;
                case 15: goto L_0x00fb;
                case 16: goto L_0x00f0;
                case 17: goto L_0x0219;
                default: goto L_0x00ec;
            }
        L_0x00ec:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x02bd
        L_0x00f0:
            r0.mo141968g3(r3)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x02bd
        L_0x00f7:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x02bd
        L_0x00fb:
            com.tencent.mm.sdk.coroutines.FlowController r2 = r17.mo141978F3()
            r5.f301575d = r0
            r5.f301576e = r1
            r5.f301580i = r8
            java.lang.Object r3 = r2.outFlow(r1, r5)
            if (r3 != r6) goto L_0x02bc
            goto L_0x02ff
        L_0x010d:
            gi.c r2 = r2.f267134e
            if (r2 == 0) goto L_0x0151
            java.lang.Object[] r7 = new java.lang.Object[r9]
            r7[r14] = r1
            long r13 = r2.field_finishedLength
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r13)
            r7[r12] = r9
            long r13 = r2.field_toltalLength
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r13)
            r7[r8] = r9
            java.lang.String r8 = "cdn upload progress %s %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r8, r7)
            long r7 = r2.field_finishedLength
            int r8 = (int) r7
            r3.field_offset = r8
            long r7 = r2.field_toltalLength
            int r2 = (int) r7
            r3.field_totalLen = r2
            r3.field_status = r12
            di3.d r2 = di3.C86312j.m106911c(r4)
            pb1.j1 r2 = (pb1.C100718j1) r2
            pb1.n0 r2 = r2.mo128198DE()
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]
            xb1.a r2 = (xb1.C102612a) r2
            boolean r2 = r2.update(r3, r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x02bd
        L_0x0151:
            r2 = r10
            goto L_0x02bd
        L_0x0154:
            gi.d r2 = r2.f267135f
            if (r2 == 0) goto L_0x01ca
            java.lang.String r7 = r3.field_path
            long r7 = com.tencent.p014mm.vfs.C86013q1.m106451l(r7)
            r3.field_status = r9
            java.lang.String r9 = r2.field_aesKey
            r3.field_cdnKey = r9
            java.lang.String r9 = r2.field_fileId
            r3.field_cdnUrl = r9
            di3.d r9 = di3.C86312j.m106911c(r4)
            pb1.j1 r9 = (pb1.C100718j1) r9
            pb1.n0 r9 = r9.mo128198DE()
            r13 = 0
            java.lang.String[] r14 = new java.lang.String[r13]
            xb1.a r9 = (xb1.C102612a) r9
            r9.update(r3, r14)
            r0.mo141972l3(r3, r2)
            di3.d r4 = di3.C86312j.m106911c(r4)
            pb1.j1 r4 = (pb1.C100718j1) r4
            pb1.n0 r4 = r4.mo128198DE()
            java.lang.String r9 = "dataId"
            java.lang.String[] r9 = new java.lang.String[]{r9}
            xb1.a r4 = (xb1.C102612a) r4
            r4.delete(r3, r9)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "transfer done, mediaid="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = " aeskey="
            r3.append(r4)
            java.lang.String r4 = r2.field_aesKey
            r3.append(r4)
            java.lang.String r4 = " filesize="
            r3.append(r4)
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r7, r13)
            r3.append(r4)
            java.lang.String r4 = " completeInfo="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x01cb
        L_0x01ca:
            r2 = r10
        L_0x01cb:
            if (r2 != 0) goto L_0x01d8
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r3 = 0
            r2[r3] = r1
            java.lang.String r3 = "sceneResult is null %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r3, r2)
        L_0x01d8:
            com.tencent.mm.sdk.coroutines.FlowController r2 = r17.mo141978F3()
            r5.f301575d = r0
            r5.f301576e = r1
            r5.f301580i = r12
            java.lang.Object r3 = r2.outFlow(r1, r5)
            if (r3 != r6) goto L_0x01ea
            goto L_0x02ff
        L_0x01ea:
            java.lang.Number r3 = (java.lang.Number) r3
            long r2 = r3.longValue()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "upload success mediaId:"
            r4.append(r7)
            r4.append(r1)
            java.lang.String r7 = "  cost:"
            r4.append(r7)
            long r7 = eb0.C31543z5.m39453c()
            long r7 = r7 - r2
            r4.append(r7)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            r0.mo141979G3()
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x02bc
        L_0x0219:
            int r7 = r2.f267132c
            r8 = -21005(0xffffffffffffadf3, float:NaN)
            if (r7 != r8) goto L_0x0226
            r2 = 20
            r0.mo141974n3(r2)
            goto L_0x02b7
        L_0x0226:
            r7 = 4
            r3.field_status = r7
            long r7 = eb0.C31543z5.m39453c()
            r3.field_modifyTime = r7
            di3.d r4 = di3.C86312j.m106911c(r4)
            pb1.j1 r4 = (pb1.C100718j1) r4
            pb1.n0 r4 = r4.mo128198DE()
            r7 = 0
            java.lang.String[] r7 = new java.lang.String[r7]
            xb1.a r4 = (xb1.C102612a) r4
            r4.update(r3, r7)
            com.tencent.mm.sdk.coroutines.FlowController r3 = r17.mo141978F3()
            r5.f301575d = r0
            r5.f301576e = r1
            r5.f301577f = r2
            r5.f301580i = r9
            java.lang.Object r3 = r3.outFlow(r1, r5)
            if (r3 != r6) goto L_0x0255
            goto L_0x02ff
        L_0x0255:
            r3 = -6101(0xffffffffffffe82b, float:NaN)
            int r2 = r2.f267132c
            if (r3 != r2) goto L_0x0261
            r2 = 11
            r0.mo141974n3(r2)
            goto L_0x02b7
        L_0x0261:
            r3 = -5103015(0xffffffffffb22259, float:NaN)
            if (r2 == r3) goto L_0x02b2
            r3 = -21020(0xffffffffffffade4, float:NaN)
            if (r2 == r3) goto L_0x02ac
            r3 = -21014(0xffffffffffffadea, float:NaN)
            if (r2 == r3) goto L_0x02a6
            r3 = -21009(0xffffffffffffadef, float:NaN)
            if (r2 == r3) goto L_0x02a0
            r3 = -21000(0xffffffffffffadf8, float:NaN)
            if (r2 == r3) goto L_0x029a
            r3 = -10012(0xffffffffffffd8e4, float:NaN)
            if (r2 == r3) goto L_0x0294
            r3 = -10005(0xffffffffffffd8eb, float:NaN)
            if (r2 == r3) goto L_0x028e
            r3 = -10003(0xffffffffffffd8ed, float:NaN)
            if (r2 == r3) goto L_0x0288
            r2 = 10
            r0.mo141974n3(r2)
            goto L_0x02b7
        L_0x0288:
            r2 = 12
            r0.mo141974n3(r2)
            goto L_0x02b7
        L_0x028e:
            r2 = 13
            r0.mo141974n3(r2)
            goto L_0x02b7
        L_0x0294:
            r2 = 19
            r0.mo141974n3(r2)
            goto L_0x02b7
        L_0x029a:
            r2 = 14
            r0.mo141974n3(r2)
            goto L_0x02b7
        L_0x02a0:
            r2 = 15
            r0.mo141974n3(r2)
            goto L_0x02b7
        L_0x02a6:
            r2 = 16
            r0.mo141974n3(r2)
            goto L_0x02b7
        L_0x02ac:
            r2 = 17
            r0.mo141974n3(r2)
            goto L_0x02b7
        L_0x02b2:
            r2 = 18
            r0.mo141974n3(r2)
        L_0x02b7:
            r0.mo141979G3()
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x02bc:
            r2 = r3
        L_0x02bd:
            if (r2 != 0) goto L_0x02fd
        L_0x02bf:
            com.tencent.mm.sdk.coroutines.FlowController r0 = r0.mo141978F3()
            r5.f301575d = r1
            r5.f301576e = r10
            r5.f301577f = r10
            r2 = 4
            r5.f301580i = r2
            java.lang.Object r3 = r0.outFlow(r1, r5)
            if (r3 != r6) goto L_0x02d3
            goto L_0x02ff
        L_0x02d3:
            r0 = r1
        L_0x02d4:
            java.lang.Number r3 = (java.lang.Number) r3
            long r1 = r3.longValue()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get cdn info is null "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " cost:"
            r3.append(r0)
            long r4 = eb0.C31543z5.m39453c()
            long r4 = r4 - r1
            r3.append(r4)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x02fd:
            rx3.b0 r6 = rx3.C13598b0.f38549a
        L_0x02ff:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wb1.C102396i.m135123o3(wb1.i, java.lang.String, com.tencent.mm.modelcdntran.v, wx3.d):java.lang.Object");
    }

    /* renamed from: F3 */
    public final FlowController mo141978F3() {
        return (FlowController) ((C36570n) this.f301581g).getValue();
    }

    /* renamed from: G3 */
    public final void mo141979G3() {
        LifecycleScope.launchDefault$default(mo141971k3(), (C53934p0) null, new C102397a(this, (C15601d<? super C102397a>) null), 1, (Object) null);
    }

    /* renamed from: d3 */
    public void mo57310d3(Context context) {
        C87412m.m108594g(context, "context");
        mo141979G3();
    }
}
