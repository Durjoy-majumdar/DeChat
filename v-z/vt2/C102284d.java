package vt2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32226l;
import fy3.C32227p;
import gu2.C98214b;
import gy3.C87412m;
import gy3.C87413o;
import iu2.C98799a;
import java.util.List;
import java.util.ListIterator;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$2", mo125469f = "ImproveDataUIC.kt", mo125470l = {269, 273}, mo125471m = "invokeSuspend")
/* renamed from: vt2.d */
public final class C102284d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f301255d;

    /* renamed from: e */
    public int f301256e;

    /* renamed from: f */
    public final /* synthetic */ C102279c f301257f;

    /* renamed from: vt2.d$a */
    public static final class C27699a extends C87413o implements C32226l<List<? extends C98799a>, C98214b> {

        /* renamed from: B */
        public static final C27699a f76719B = new C27699a();

        public C27699a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C98214b bVar;
            Object obj2;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$2$info$1");
            List list = (List) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$2$info$1");
            C87412m.m108594g(list, "list");
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                bVar = null;
                if (!listIterator.hasPrevious()) {
                    obj2 = null;
                    break;
                }
                obj2 = listIterator.previous();
                if (!((C98799a) obj2).mo138170b().isAd()) {
                    break;
                }
            }
            C98799a aVar = (C98799a) obj2;
            if (aVar != null) {
                bVar = aVar.mo138170b();
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$2$info$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$2$info$1");
            return bVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102284d(C102279c cVar, C15601d<? super C102284d> dVar) {
        super(2, dVar);
        this.f301257f = cVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$2");
        C102284d dVar2 = new C102284d(this.f301257f, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$2");
        return dVar2;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$2");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$2");
        Object invokeSuspend = ((C102284d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$2");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$2");
        return invokeSuspend;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = "invokeSuspend"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r0.f301256e
            java.lang.String r5 = "MicroMsg.Improve.DataFlow"
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0034
            if (r4 == r7) goto L_0x002e
            if (r4 != r6) goto L_0x0023
            java.lang.Object r3 = r0.f301255d
            gu2.b r3 = (gu2.C98214b) r3
            kotlin.ResultKt.throwOnFailure(r18)
            r7 = r18
            goto L_0x00b3
        L_0x0023:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            throw r3
        L_0x002e:
            kotlin.ResultKt.throwOnFailure(r18)
            r4 = r18
            goto L_0x0047
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r18)
            vt2.c r4 = r0.f301257f
            vt2.d$a r8 = vt2.C102284d.C27699a.f76719B
            r0.f301256e = r7
            java.lang.Object r4 = r4.mo141840a(r8, r0)
            if (r4 != r3) goto L_0x0047
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        L_0x0047:
            gu2.b r4 = (gu2.C98214b) r4
            if (r4 == 0) goto L_0x0057
            com.tencent.mm.plugin.sns.model.p1$a r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.dy0()
            long r9 = r4.mo142401p2()
            r11 = -1
            r8.mo6421r(r9, r11)
        L_0x0057:
            vt2.c r8 = r0.f301257f
            vt2.c$b r9 = vt2.C102279c.f301242j
            java.lang.String r9 = "access$getOnlineRepository$p"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository r8 = r8.f301247f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            r0.f301255d = r4
            r0.f301256e = r6
            r8.getClass()
            java.lang.String r6 = "doNextPageRequest"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r9)
            a14.m r10 = new a14.m
            wx3.d r11 = xx3.C66447b.m78392b(r17)
            r10.<init>(r11, r7)
            r10.mo74609p()
            java.lang.String r7 = "server doNextPageRequest"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            java.lang.String r7 = "access$setLoadMoreContinuation$p"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r9)
            r8.f279832g = r10
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r9)
            java.lang.String r7 = "access$getServer$p"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r9)
            com.tencent.mm.plugin.sns.model.p1$a r11 = r8.f279830e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r9)
            r12 = 1
            r14 = 0
            r15 = 0
            r16 = 0
            java.lang.String r13 = ""
            r11.mo6414e(r12, r13, r14, r15, r16)
            java.lang.Object r7 = r10.mo74608o()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r9)
            if (r7 != r3) goto L_0x00b2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        L_0x00b2:
            r3 = r4
        L_0x00b3:
            java.lang.Number r7 = (java.lang.Number) r7
            int r4 = r7.intValue()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "build load more key:"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r7 = " count:"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            vt2.c r5 = r0.f301257f
            com.tencent.mm.plugin.mvvmlist.MvvmList r5 = r5.mo141841d3()
            if (r3 == 0) goto L_0x00e2
            java.lang.String r3 = r3.getStringSeq()
            goto L_0x00e3
        L_0x00e2:
            r3 = 0
        L_0x00e3:
            if (r4 <= 0) goto L_0x00e6
            goto L_0x00e8
        L_0x00e6:
            r4 = 10
        L_0x00e8:
            r5.mo129603e(r3, r4)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vt2.C102284d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
