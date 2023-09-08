package eu2;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle.ImproveTimelineItemExposeHandle;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import gu2.C98214b;
import gy3.C87412m;
import iu2.C98799a;
import jq3.C60905o;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: eu2.k */
public abstract class C97727k extends C97737s {

    /* renamed from: eu2.k$a */
    public static final class C97728a extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C97727k f286687a;

        public C97728a(C97727k kVar) {
            this.f286687a = kVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0015, code lost:
            r5 = r5.mo138170b();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo52a(android.view.View r5) {
            /*
                r4 = this;
                java.lang.String r0 = "getExposedId"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemExpose$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                java.lang.String r2 = "view"
                gy3.C87412m.m108594g(r5, r2)
                eu2.k r5 = r4.f286687a
                iu2.a r5 = r5.getData()
                if (r5 == 0) goto L_0x0020
                gu2.b r5 = r5.mo138170b()
                if (r5 == 0) goto L_0x0020
                long r2 = r5.mo137526z2()
                goto L_0x0022
            L_0x0020:
                r2 = 0
            L_0x0022:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: eu2.C97727k.C97728a.mo52a(android.view.View):long");
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C98214b b;
            SnsInfo C2;
            SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemExpose$1");
            View view2 = view;
            C87412m.m108594g(view, "view");
            C98799a data = this.f286687a.getData();
            if (data == null || (b = data.mo138170b()) == null || (C2 = b.mo137505C2()) == null) {
                SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemExpose$1");
                return;
            }
            ImproveTimelineItemExposeHandle.INSTANCE.onViewExposed(C2, view, j, j2, z);
            SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemExpose$1");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemExpose", mo125469f = "ImproveTimelineItemExpose.kt", mo125470l = {44}, mo125471m = "onBindViewHolder$suspendImpl")
    /* renamed from: eu2.k$b */
    public static final class C97729b extends C66704d {

        /* renamed from: d */
        public Object f286688d;

        /* renamed from: e */
        public /* synthetic */ Object f286689e;

        /* renamed from: f */
        public final /* synthetic */ C97727k f286690f;

        /* renamed from: g */
        public int f286691g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97729b(C97727k kVar, C15601d<? super C97729b> dVar) {
            super(dVar);
            this.f286690f = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemExpose$onBindViewHolder$1");
            this.f286689e = obj;
            this.f286691g |= Integer.MIN_VALUE;
            Object J = C97727k.m126036J(this.f286690f, (C60905o) null, (C98799a) null, 0, false, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemExpose$onBindViewHolder$1");
            return J;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97727k(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        C23564m.m28138h(this, new C97728a(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: iu2.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m126036J(eu2.C97727k r9, jq3.C60905o r10, iu2.C98799a r11, int r12, boolean r13, wx3.C15601d r14) {
        /*
            java.lang.String r0 = "onBindViewHolder$suspendImpl"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemExpose"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r14 instanceof eu2.C97727k.C97729b
            if (r2 == 0) goto L_0x001b
            r2 = r14
            eu2.k$b r2 = (eu2.C97727k.C97729b) r2
            int r3 = r2.f286691g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001b
            int r3 = r3 - r4
            r2.f286691g = r3
            goto L_0x0020
        L_0x001b:
            eu2.k$b r2 = new eu2.k$b
            r2.<init>(r9, r14)
        L_0x0020:
            r8 = r2
            java.lang.Object r14 = r8.f286689e
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r8.f286691g
            r4 = 1
            if (r3 == 0) goto L_0x0040
            if (r3 != r4) goto L_0x0035
            java.lang.Object r9 = r8.f286688d
            r11 = r9
            iu2.a r11 = (iu2.C98799a) r11
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0056
        L_0x0035:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r9
        L_0x0040:
            kotlin.ResultKt.throwOnFailure(r14)
            r8.f286688d = r11
            r8.f286691g = r4
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r9 = super.mo81006g(r4, r5, r6, r7, r8)
            if (r9 != r2) goto L_0x0056
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x0056:
            gu2.b r9 = r11.mo138170b()
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r10 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            os2.n0 r11 = r9.mo137510H2()
            te3.k94 r12 = r9.mo137511I2()
            java.lang.String r9 = r9.getUserName()
            r10.mo131366a(r11, r12, r9)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: eu2.C97727k.m126036J(eu2.k, jq3.o, iu2.a, int, boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: g */
    public Object mo81006g(C60905o oVar, C98799a aVar, int i, boolean z, C15601d<? super C13598b0> dVar) {
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemExpose");
        Object J = m126036J(this, oVar, aVar, i, z, dVar);
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemExpose");
        return J;
    }
}
