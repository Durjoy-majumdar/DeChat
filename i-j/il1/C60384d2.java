package il1;

import a14.C0000n0;
import fy3.C32227p;
import il1.C60557z1;
import rx3.C13598b0;
import te3.C64807wo2;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.FinderLiveElementWidget$ElementViewHolder$onSelectExecute$1", mo125469f = "FinderLiveElementWidget.kt", mo125470l = {304, 313}, mo125471m = "invokeSuspend")
/* renamed from: il1.d2 */
public final class C60384d2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f172182d;

    /* renamed from: e */
    public Object f172183e;

    /* renamed from: f */
    public Object f172184f;

    /* renamed from: g */
    public Object f172185g;

    /* renamed from: h */
    public int f172186h;

    /* renamed from: i */
    public final /* synthetic */ C64807wo2 f172187i;

    /* renamed from: j */
    public final /* synthetic */ C60557z1 f172188j;

    /* renamed from: n */
    public final /* synthetic */ C60557z1.C60562e f172189n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60384d2(C64807wo2 wo22, C60557z1 z1Var, C60557z1.C60562e eVar, C15601d<? super C60384d2> dVar) {
        super(2, dVar);
        this.f172187i = wo22;
        this.f172188j = z1Var;
        this.f172189n = eVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C60384d2(this.f172187i, this.f172188j, this.f172189n, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60384d2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Class<fp.h> r1 = p523fp.C59265h.class
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r0.f172186h
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0044
            if (r3 == r6) goto L_0x0029
            if (r3 != r5) goto L_0x0021
            java.lang.Object r1 = r0.f172183e
            te3.wo2 r1 = (te3.C64807wo2) r1
            java.lang.Object r2 = r0.f172182d
            il1.z1 r2 = (il1.C60557z1) r2
            kotlin.ResultKt.throwOnFailure(r21)
            r8 = r1
            r1 = r21
            goto L_0x00d0
        L_0x0021:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0029:
            java.lang.Object r3 = r0.f172185g
            te3.vo2 r3 = (te3.C64780vo2) r3
            java.lang.Object r7 = r0.f172184f
            il1.z1$e r7 = (il1.C60557z1.C60562e) r7
            java.lang.Object r8 = r0.f172183e
            te3.wo2 r8 = (te3.C64807wo2) r8
            java.lang.Object r9 = r0.f172182d
            il1.z1 r9 = (il1.C60557z1) r9
            kotlin.ResultKt.throwOnFailure(r21)
            r10 = r21
            r19 = r9
            r9 = r7
            r7 = r19
            goto L_0x0095
        L_0x0044:
            kotlin.ResultKt.throwOnFailure(r21)
            te3.wo2 r3 = r0.f172187i
            java.lang.String r3 = r3.f186145d
            java.lang.String r7 = "-1"
            boolean r3 = gy3.C87412m.m108589b(r3, r7)
            if (r3 == 0) goto L_0x0064
            il1.z1 r1 = r0.f172188j
            il1.z1$f r2 = new il1.z1$f
            te3.wo2 r3 = il1.C60557z1.f172604i
            java.lang.String r4 = ""
            r2.<init>(r3, r4)
            r1.mo85525c(r2)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x0064:
            te3.wo2 r3 = il1.C60557z1.f172604i
            te3.wo2 r3 = r0.f172187i
            java.util.LinkedList<te3.vo2> r3 = r3.f186149h
            if (r3 == 0) goto L_0x0073
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            te3.vo2 r3 = (te3.C64780vo2) r3
            goto L_0x0074
        L_0x0073:
            r3 = r4
        L_0x0074:
            if (r3 == 0) goto L_0x011e
            il1.z1 r7 = r0.f172188j
            te3.wo2 r8 = r0.f172187i
            il1.z1$e r9 = r0.f172189n
            di3.d r10 = di3.C86312j.m106911c(r1)
            fp.h r10 = (p523fp.C59265h) r10
            java.lang.String r11 = r3.f185964e
            r0.f172182d = r7
            r0.f172183e = r8
            r0.f172184f = r9
            r0.f172185g = r3
            r0.f172186h = r6
            java.lang.Object r10 = r10.mo58905bi(r11, r0)
            if (r10 != r2) goto L_0x0095
            return r2
        L_0x0095:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x00ba
            di3.d r1 = di3.C86312j.m106911c(r1)
            fp.h r1 = (p523fp.C59265h) r1
            java.lang.String r10 = r3.f185964e
            boolean r1 = r1.Ft0(r10)
            if (r1 != 0) goto L_0x00ba
            r12 = 5
            java.lang.String r13 = r8.f186145d
            java.lang.String r14 = r8.f186146e
            r15 = 0
            r17 = 8
            r18 = 0
            r11 = r7
            il1.C60557z1.m70748b(r11, r12, r13, r14, r15, r17, r18)
        L_0x00ba:
            java.lang.String r1 = r3.f185964e
            java.lang.String r3 = r3.f185965f
            r0.f172182d = r7
            r0.f172183e = r8
            r0.f172184f = r4
            r0.f172185g = r4
            r0.f172186h = r5
            java.lang.Object r1 = r9.mo85528y(r1, r6, r3, r0)
            if (r1 != r2) goto L_0x00cf
            return r2
        L_0x00cf:
            r2 = r7
        L_0x00d0:
            rx3.o r1 = (rx3.C13605o) r1
            C r3 = r1.f38559f
            java.lang.String r3 = (java.lang.String) r3
            r5 = 0
            java.lang.Iterable r3 = com.tencent.p014mm.vfs.C86013q1.m106459t(r3, r5)
            if (r3 == 0) goto L_0x00e7
            java.lang.Object r3 = sx3.C110818d0.m150915M(r3)
            com.tencent.mm.vfs.b0 r3 = (com.tencent.p014mm.vfs.C86001b0) r3
            if (r3 == 0) goto L_0x00e7
            java.lang.String r4 = r3.f250472b
        L_0x00e7:
            A r3 = r1.f38557d
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x011e
            if (r4 == 0) goto L_0x00f4
            goto L_0x00f5
        L_0x00f4:
            r6 = 0
        L_0x00f5:
            if (r6 == 0) goto L_0x011e
            il1.z1$f r3 = new il1.z1$f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            C r1 = r1.f38559f
            java.lang.String r1 = (java.lang.String) r1
            r5.append(r1)
            r1 = 47
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            r3.<init>(r8, r1)
            te3.wo2 r1 = il1.C60557z1.f172604i
            r2.mo85525c(r3)
            il1.z1$d r1 = r2.f172608d
            r1.notifyDataSetChanged()
        L_0x011e:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C60384d2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
