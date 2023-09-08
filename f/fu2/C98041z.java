package fu2;

import android.content.Context;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import eu2.C97727k;
import gy3.C87412m;
import iu2.C98799a;
import java.util.ArrayList;
import java.util.Iterator;
import jq3.C60905o;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: fu2.z */
public abstract class C98041z extends C97727k {

    /* renamed from: Q0 */
    public final ArrayList<C97987a> f287456Q0;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick", mo125469f = "ImproveTimelineItemClick.kt", mo125470l = {58}, mo125471m = "onBindViewHolder$suspendImpl")
    /* renamed from: fu2.z$a */
    public static final class C98042a extends C66704d {

        /* renamed from: d */
        public Object f287457d;

        /* renamed from: e */
        public Object f287458e;

        /* renamed from: f */
        public Object f287459f;

        /* renamed from: g */
        public /* synthetic */ Object f287460g;

        /* renamed from: h */
        public final /* synthetic */ C98041z f287461h;

        /* renamed from: i */
        public int f287462i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98042a(C98041z zVar, C15601d<? super C98042a> dVar) {
            super(dVar);
            this.f287461h = zVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick$onBindViewHolder$1");
            this.f287460g = obj;
            this.f287462i |= Integer.MIN_VALUE;
            Object L = C98041z.m126633L(this.f287461h, (C60905o) null, (C98799a) null, 0, false, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick$onBindViewHolder$1");
            return L;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98041z(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        ArrayList<C97987a> arrayList = new ArrayList<>();
        this.f287456Q0 = arrayList;
        C97998d dVar = new C97998d(context);
        C97987a.m126564l(dVar, getAvatarImage(), false, true, false, 10, (Object) null);
        arrayList.add(dVar);
        C98009h hVar = new C98009h(context);
        hVar.mo137317k(getContentText().getContentTv(), false, true, false);
        arrayList.add(hVar);
        arrayList.add(new C98011i(context));
        C98022p pVar = new C98022p(context);
        C97987a.m126564l(pVar, getCommentImage(), false, false, false, 14, (Object) null);
        arrayList.add(pVar);
        arrayList.add(new C98005g(context));
        arrayList.add(new C98013j(context));
        C45808b0 b0Var = new C45808b0(context);
        C97987a.m126564l(b0Var, getWeComTagImage(), false, false, false, 14, (Object) null);
        arrayList.add(b0Var);
        arrayList.add(new C98020o(context));
        arrayList.add(new C97995b(context));
        arrayList.add(new C98019n(context));
    }

    /* renamed from: K */
    public static final /* synthetic */ ArrayList m126632K(C98041z zVar) {
        SnsMethodCalculate.markStartTimeMs("access$getClickInstanceList", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick");
        ArrayList<C97987a> arrayList = zVar.f287456Q0;
        SnsMethodCalculate.markEndTimeMs("access$getClickInstanceList", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick");
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: iu2.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: jq3.o} */
    /* JADX WARNING: type inference failed for: r11v16, types: [fu2.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f A[LOOP:0: B:17:0x0069->B:19:0x006f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0097 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ef A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0147 A[EDGE_INSN: B:77:0x0147->B:62:0x0147 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m126633L(fu2.C98041z r9, jq3.C60905o r10, iu2.C98799a r11, int r12, boolean r13, wx3.C15601d r14) {
        /*
            java.lang.String r0 = "onBindViewHolder$suspendImpl"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r14 instanceof fu2.C98041z.C98042a
            if (r2 == 0) goto L_0x001b
            r2 = r14
            fu2.z$a r2 = (fu2.C98041z.C98042a) r2
            int r3 = r2.f287462i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001b
            int r3 = r3 - r4
            r2.f287462i = r3
            goto L_0x0020
        L_0x001b:
            fu2.z$a r2 = new fu2.z$a
            r2.<init>(r9, r14)
        L_0x0020:
            r8 = r2
            java.lang.Object r14 = r8.f287460g
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r8.f287462i
            r4 = 1
            if (r3 == 0) goto L_0x0049
            if (r3 != r4) goto L_0x003e
            java.lang.Object r9 = r8.f287459f
            r11 = r9
            iu2.a r11 = (iu2.C98799a) r11
            java.lang.Object r9 = r8.f287458e
            r10 = r9
            jq3.o r10 = (jq3.C60905o) r10
            java.lang.Object r9 = r8.f287457d
            fu2.z r9 = (fu2.C98041z) r9
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0063
        L_0x003e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r9
        L_0x0049:
            kotlin.ResultKt.throwOnFailure(r14)
            r8.f287457d = r9
            r8.f287458e = r10
            r8.f287459f = r11
            r8.f287462i = r4
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r12 = super.mo81006g(r4, r5, r6, r7, r8)
            if (r12 != r2) goto L_0x0063
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x0063:
            java.util.ArrayList<fu2.a> r12 = r9.f287456Q0
            java.util.Iterator r12 = r12.iterator()
        L_0x0069:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x007d
            java.lang.Object r13 = r12.next()
            fu2.a r13 = (fu2.C97987a) r13
            gu2.b r14 = r11.mo138170b()
            r13.mo137318m(r10, r14)
            goto L_0x0069
        L_0x007d:
            java.util.ArrayList r10 = m126632K(r9)
            java.util.Iterator r10 = r10.iterator()
        L_0x0085:
            boolean r11 = r10.hasNext()
            r12 = 0
            if (r11 == 0) goto L_0x0097
            java.lang.Object r11 = r10.next()
            fu2.a r11 = (fu2.C97987a) r11
            boolean r13 = r11 instanceof fu2.C98005g
            if (r13 == 0) goto L_0x0085
            goto L_0x0098
        L_0x0097:
            r11 = r12
        L_0x0098:
            r2 = r11
            fu2.g r2 = (fu2.C98005g) r2
            if (r2 == 0) goto L_0x00aa
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout r3 = r9.getCommentView()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 14
            r8 = 0
            fu2.C97987a.m126564l(r2, r3, r4, r5, r6, r7, r8)
        L_0x00aa:
            java.util.ArrayList r10 = m126632K(r9)
            java.util.Iterator r10 = r10.iterator()
        L_0x00b2:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00c3
            java.lang.Object r11 = r10.next()
            fu2.a r11 = (fu2.C97987a) r11
            boolean r13 = r11 instanceof fu2.C98013j
            if (r13 == 0) goto L_0x00b2
            goto L_0x00c4
        L_0x00c3:
            r11 = r12
        L_0x00c4:
            r2 = r11
            fu2.j r2 = (fu2.C98013j) r2
            if (r2 == 0) goto L_0x00d6
            android.view.View r3 = r9.getDelTextStub()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 14
            r8 = 0
            fu2.C97987a.m126564l(r2, r3, r4, r5, r6, r7, r8)
        L_0x00d6:
            java.util.ArrayList r10 = m126632K(r9)
            java.util.Iterator r10 = r10.iterator()
        L_0x00de:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00ef
            java.lang.Object r11 = r10.next()
            fu2.a r11 = (fu2.C97987a) r11
            boolean r13 = r11 instanceof fu2.C98020o
            if (r13 == 0) goto L_0x00de
            goto L_0x00f0
        L_0x00ef:
            r11 = r12
        L_0x00f0:
            r2 = r11
            fu2.o r2 = (fu2.C98020o) r2
            if (r2 == 0) goto L_0x0102
            android.view.View r3 = r9.getGroupImageStub()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 14
            r8 = 0
            fu2.C97987a.m126564l(r2, r3, r4, r5, r6, r7, r8)
        L_0x0102:
            java.util.ArrayList r10 = m126632K(r9)
            java.util.Iterator r10 = r10.iterator()
        L_0x010a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x011b
            java.lang.Object r11 = r10.next()
            fu2.a r11 = (fu2.C97987a) r11
            boolean r13 = r11 instanceof fu2.C97995b
            if (r13 == 0) goto L_0x010a
            goto L_0x011c
        L_0x011b:
            r11 = r12
        L_0x011c:
            r2 = r11
            fu2.b r2 = (fu2.C97995b) r2
            if (r2 == 0) goto L_0x012e
            android.view.View r3 = r9.getAddressStub()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 14
            r8 = 0
            fu2.C97987a.m126564l(r2, r3, r4, r5, r6, r7, r8)
        L_0x012e:
            java.util.ArrayList r10 = m126632K(r9)
            java.util.Iterator r10 = r10.iterator()
        L_0x0136:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0147
            java.lang.Object r11 = r10.next()
            fu2.a r11 = (fu2.C97987a) r11
            boolean r13 = r11 instanceof fu2.C98019n
            if (r13 == 0) goto L_0x0136
            r12 = r11
        L_0x0147:
            r2 = r12
            fu2.n r2 = (fu2.C98019n) r2
            if (r2 == 0) goto L_0x0159
            android.view.View r3 = r9.getGameAboutStub()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 14
            r8 = 0
            fu2.C97987a.m126564l(r2, r3, r4, r5, r6, r7, r8)
        L_0x0159:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: fu2.C98041z.m126633L(fu2.z, jq3.o, iu2.a, int, boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: g */
    public Object mo81006g(C60905o oVar, C98799a aVar, int i, boolean z, C15601d<? super C13598b0> dVar) {
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick");
        Object L = m126633L(this, oVar, aVar, i, z, dVar);
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick");
        return L;
    }

    public final <T> T getClickInstance() {
        SnsMethodCalculate.markStartTimeMs("getClickInstance", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick");
        Iterator it = m126632K(this).iterator();
        if (!it.hasNext()) {
            SnsMethodCalculate.markEndTimeMs("getClickInstance", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick");
            return null;
        }
        C97987a aVar = (C97987a) it.next();
        C87412m.m108602o();
        throw null;
    }

    public final ArrayList<C97987a> getClickInstanceList() {
        SnsMethodCalculate.markStartTimeMs("getClickInstanceList", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick");
        ArrayList<C97987a> arrayList = this.f287456Q0;
        SnsMethodCalculate.markEndTimeMs("getClickInstanceList", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick");
        return arrayList;
    }

    /* renamed from: h */
    public void mo81008h() {
        SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick");
        super.mo81008h();
        for (C97987a aVar : this.f287456Q0) {
            aVar.getClass();
            SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
            if (aVar.f287385f) {
                aVar.mo137312e().mo133564l();
            }
            SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        }
        SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick");
    }
}
