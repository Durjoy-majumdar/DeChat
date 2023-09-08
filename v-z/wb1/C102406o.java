package wb1;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.fav.model.service.FavCheckCdnFSC$start$1", mo125469f = "FavCheckCdnFSC.kt", mo125470l = {60, 63, 65, 66}, mo125471m = "invokeSuspend")
/* renamed from: wb1.o */
public final class C102406o extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f301622d;

    /* renamed from: e */
    public Object f301623e;

    /* renamed from: f */
    public Object f301624f;

    /* renamed from: g */
    public int f301625g;

    /* renamed from: h */
    public final /* synthetic */ C102402n f301626h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102406o(C102402n nVar, C15601d<? super C102406o> dVar) {
        super(2, dVar);
        this.f301626h = nVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C102406o(this.f301626h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C102406o) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x016c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r14.f301625g
            r2 = 2
            r3 = 3
            r4 = 4
            java.lang.String r5 = "MicroMsg.Fav.FavCheckCdnFSC"
            r6 = 1
            if (r1 == 0) goto L_0x0065
            if (r1 == r6) goto L_0x0061
            if (r1 == r2) goto L_0x004a
            if (r1 == r3) goto L_0x0033
            if (r1 != r4) goto L_0x002b
            java.lang.Object r1 = r14.f301624f
            pb1.z r1 = (pb1.C100755z) r1
            java.lang.Object r6 = r14.f301623e
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r14.f301622d
            wb1.n r7 = (wb1.C102402n) r7
            kotlin.ResultKt.throwOnFailure(r15)
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r14
            goto L_0x016d
        L_0x002b:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0033:
            java.lang.Object r1 = r14.f301624f
            pb1.z r1 = (pb1.C100755z) r1
            java.lang.Object r6 = r14.f301623e
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r14.f301622d
            wb1.n r7 = (wb1.C102402n) r7
            kotlin.ResultKt.throwOnFailure(r15)
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r14
            goto L_0x014e
        L_0x004a:
            java.lang.Object r1 = r14.f301624f
            pb1.z r1 = (pb1.C100755z) r1
            java.lang.Object r6 = r14.f301623e
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r14.f301622d
            wb1.n r7 = (wb1.C102402n) r7
            kotlin.ResultKt.throwOnFailure(r15)
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r14
            goto L_0x0121
        L_0x0061:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x007d
        L_0x0065:
            kotlin.ResultKt.throwOnFailure(r15)
            wb1.n r15 = r14.f301626h
            rx3.g r15 = r15.f301599g
            rx3.n r15 = (rx3.C36570n) r15
            java.lang.Object r15 = r15.getValue()
            com.tencent.mm.sdk.coroutines.FlowController r15 = (com.tencent.p014mm.sdk.coroutines.FlowController) r15
            r14.f301625g = r6
            java.lang.Object r15 = r15.currentFlowInfo(r14)
            if (r15 != r0) goto L_0x007d
            return r0
        L_0x007d:
            wb1.n r1 = r14.f301626h
            java.util.List r15 = (java.util.List) r15
            int r7 = r15.size()
            if (r7 >= r6) goto L_0x0199
            java.lang.Class<pb1.j1> r15 = pb1.C100718j1.class
            di3.d r15 = di3.C86312j.m106911c(r15)
            pb1.j1 r15 = (pb1.C100718j1) r15
            pb1.w0 r15 = r15.mo128199Jq()
            xb1.d r15 = (xb1.C102614d) r15
            r15.getClass()
            com.tencent.mm.sdk.storage.sql.SingleTable r7 = p749xh.C102666r2.f302877B
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            com.tencent.mm.sdk.storage.sql.Column r10 = p749xh.C102666r2.f302878C
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            com.tencent.mm.sdk.storage.sql.SingleCondition r10 = r10.equal((java.lang.Number) r11)
            r11 = 0
            com.tencent.mm.sdk.storage.sql.SelectSql$Limit r12 = new com.tencent.mm.sdk.storage.sql.SelectSql$Limit
            r12.<init>(r6, r11)
            com.tencent.mm.sdk.storage.sql.SingleTable r6 = p749xh.C102666r2.f302877B
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r6 = r6.select((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlColumn>) r7)
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r6 = r6.where(r10)
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r6 = r6.orderBy((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlOrder>) r8)
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r6 = r6.groupBy((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.Column>) r9)
            int r7 = r12.getLimit()
            int r8 = r12.getOffset()
            r6.limit(r7, r8)
            com.tencent.mm.sdk.storage.sql.SelectSql r6 = r6.build()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r15 = r15.f302175d
            java.lang.Class<pb1.z> r7 = pb1.C100755z.class
            java.util.List r15 = r6.multiQuery(r15, r7)
            java.lang.String r6 = "getService(IPluginFav::c…ge.getDataUncheckItems(1)"
            gy3.C87412m.m108593f(r15, r6)
            java.util.Iterator r15 = r15.iterator()
            r6 = r15
            r7 = r1
            r15 = r14
        L_0x00ee:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x01ae
            java.lang.Object r1 = r6.next()
            pb1.z r1 = (pb1.C100755z) r1
            rx3.g r8 = r7.f301599g
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            com.tencent.mm.sdk.coroutines.FlowController r8 = (com.tencent.p014mm.sdk.coroutines.FlowController) r8
            long r9 = r1.field_localId
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r15.f301622d = r7
            r15.f301623e = r6
            r15.f301624f = r1
            r15.f301625g = r2
            java.lang.Object r8 = r8.inFlow(r9, r15)
            if (r8 != r0) goto L_0x0119
            return r0
        L_0x0119:
            r13 = r0
            r0 = r15
            r15 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r1
            r1 = r13
        L_0x0121:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x0192
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r9 = "int flow id:"
            r15.append(r9)
            long r9 = r5.field_localId
            r15.append(r9)
            java.lang.String r15 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r15)
            r0.f301622d = r8
            r0.f301623e = r7
            r0.f301624f = r5
            r0.f301625g = r3
            java.lang.Object r15 = r8.mo141982j3(r5, r0)
            if (r15 != r1) goto L_0x014e
            return r1
        L_0x014e:
            rx3.g r15 = r8.f301599g
            rx3.n r15 = (rx3.C36570n) r15
            java.lang.Object r15 = r15.getValue()
            com.tencent.mm.sdk.coroutines.FlowController r15 = (com.tencent.p014mm.sdk.coroutines.FlowController) r15
            long r9 = r5.field_localId
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r0.f301622d = r8
            r0.f301623e = r7
            r0.f301624f = r5
            r0.f301625g = r4
            java.lang.Object r15 = r15.outFlow(r9, r0)
            if (r15 != r1) goto L_0x016d
            return r1
        L_0x016d:
            java.lang.Number r15 = (java.lang.Number) r15
            long r9 = r15.longValue()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r11 = "out flow id:"
            r15.append(r11)
            long r11 = r5.field_localId
            r15.append(r11)
            java.lang.String r5 = " cost:"
            r15.append(r5)
            r15.append(r9)
            java.lang.String r15 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r15)
        L_0x0192:
            r15 = r0
            r0 = r1
            r5 = r6
            r6 = r7
            r7 = r8
            goto L_0x00ee
        L_0x0199:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "startCheckCDN max flow, do not add cdn info "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r15)
        L_0x01ae:
            rx3.b0 r15 = rx3.C13598b0.f38549a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: wb1.C102406o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
