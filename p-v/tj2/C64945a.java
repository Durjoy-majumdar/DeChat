package tj2;

import a14.C0000n0;
import fy3.C32227p;
import java.util.List;
import rx3.C13598b0;
import ve3.C52851s;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.history.RingtoneHistoryDataSource$analyseHistoryRingBackInfo$1", mo125469f = "RingtoneHistoryDataSource.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: tj2.a */
public final class C64945a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ boolean f187014d;

    /* renamed from: e */
    public final /* synthetic */ List<C52851s> f187015e;

    /* renamed from: f */
    public final /* synthetic */ C52348b f187016f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64945a(boolean z, List<? extends C52851s> list, C52348b bVar, C15601d<? super C64945a> dVar) {
        super(2, dVar);
        this.f187014d = z;
        this.f187015e = list;
        this.f187016f = bVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C64945a(this.f187014d, this.f187015e, this.f187016f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64945a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x002b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.ResultKt.throwOnFailure(r14)
            boolean r14 = r13.f187014d
            r0 = 0
            if (r14 != 0) goto L_0x0023
            java.util.List<ve3.s> r14 = r13.f187015e
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x0023
            tj2.b r14 = r13.f187016f
            java.util.ArrayList<pj2.e> r14 = r14.f146321h
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x0023
            tj2.b r14 = r13.f187016f
            androidx.lifecycle.z<java.util.List<pj2.e>> r14 = r14.f146317d
            r14.postValue(r0)
            goto L_0x00ab
        L_0x0023:
            java.util.List<ve3.s> r14 = r13.f187015e
            tj2.b r1 = r13.f187016f
            java.util.Iterator r14 = r14.iterator()
        L_0x002b:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x00a2
            java.lang.Object r2 = r14.next()
            ve3.s r2 = (ve3.C52851s) r2
            ve3.n0 r12 = r2.f147625d
            if (r12 != 0) goto L_0x003c
            goto L_0x002b
        L_0x003c:
            long r3 = r1.f146319f
            long r5 = r2.f147627f
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0046
            r1.f146319f = r5
        L_0x0046:
            wj2.h$a r3 = wj2.C66135h.f190107E
            int r2 = r12.f189020d
            r4 = 1
            if (r2 == r4) goto L_0x006b
            r4 = 2
            if (r2 == r4) goto L_0x0055
            wj2.f r2 = r3.mo90187b()
            goto L_0x007e
        L_0x0055:
            ve3.g r2 = r12.f189022f
            if (r2 != 0) goto L_0x005a
            goto L_0x007d
        L_0x005a:
            wj2.f r2 = r3.mo90189e(r2, r12)
            r3 = 0
            r2.f190080c = r3
            r2.f190079b = r3
            r2.f190083f = r12
            ve3.a1 r3 = r12.f189026j
            r2.f190095r = r3
            goto L_0x007e
        L_0x006b:
            r4 = 0
            r6 = 0
            r9 = 0
            r10 = 8
            r11 = 0
            r8 = r12
            wj2.f r2 = wj2.C66135h.C66136a.m77957h(r3, r4, r6, r8, r9, r10, r11)
            if (r2 == 0) goto L_0x007d
            r2.f190083f = r12
            goto L_0x007e
        L_0x007d:
            r2 = r0
        L_0x007e:
            if (r2 != 0) goto L_0x0081
            goto L_0x002b
        L_0x0081:
            long r3 = r2.f190092o
            rj2.C63449b.m74792c(r3, r2)
            java.lang.String r2 = r2.mo90174e()
            java.util.HashSet<java.lang.String> r3 = r1.f146320g
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L_0x002b
            java.util.HashSet<java.lang.String> r3 = r1.f146320g
            r3.add(r2)
            java.util.ArrayList<pj2.e> r2 = r1.f146321h
            pj2.e r3 = new pj2.e
            r3.<init>(r12)
            r2.add(r3)
            goto L_0x002b
        L_0x00a2:
            tj2.b r14 = r13.f187016f
            androidx.lifecycle.z<java.util.List<pj2.e>> r0 = r14.f146317d
            java.util.ArrayList<pj2.e> r14 = r14.f146321h
            r0.postValue(r14)
        L_0x00ab:
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: tj2.C64945a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
