package zg1;

import fj1.C45795b;
import gy3.C87412m;
import yg1.C16006g;

/* renamed from: zg1.c */
public final class C16168c extends C16006g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16168c(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r8 = r8.f144906h;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14632d(java.util.LinkedList<te3.C52013xs0> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "msgList"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.Object r8 = sx3.C110818d0.m150916N(r8)
            te3.xs0 r8 = (te3.C52013xs0) r8
            te3.dt0 r0 = new te3.dt0
            r0.<init>()
            r1 = 0
            if (r8 == 0) goto L_0x001c
            pe3.b r8 = r8.f144906h
            if (r8 == 0) goto L_0x001c
            byte[] r8 = r8.mo123703f()
            goto L_0x001d
        L_0x001c:
            r8 = r1
        L_0x001d:
            r2 = 0
            r3 = 1
            java.lang.String r4 = ""
            java.lang.String r5 = "safeParser"
            if (r8 != 0) goto L_0x0027
            goto L_0x0033
        L_0x0027:
            r0.parseFrom(r8)     // Catch:{ Exception -> 0x002b }
            goto L_0x0033
        L_0x002b:
            r8 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r8
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r4, r6)
        L_0x0033:
            te3.nf0 r8 = new te3.nf0
            r8.<init>()
            te3.ls0 r0 = r0.f132520d
            if (r0 == 0) goto L_0x0045
            pe3.b r0 = r0.f137622d
            if (r0 == 0) goto L_0x0045
            byte[] r0 = r0.mo123703f()
            goto L_0x0046
        L_0x0045:
            r0 = r1
        L_0x0046:
            if (r0 != 0) goto L_0x0049
            goto L_0x0056
        L_0x0049:
            r8.parseFrom(r0)     // Catch:{ Exception -> 0x004e }
            r1 = r8
            goto L_0x0056
        L_0x004e:
            r8 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r2] = r8
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r4, r0)
        L_0x0056:
            fj1.b r8 = r7.f43066a
            java.lang.Class<cl1.h1> r0 = cl1.C54979h1.class
            androidx.lifecycle.i0 r8 = r8.mo71262a(r0)
            cl1.h1 r8 = (cl1.C54979h1) r8
            r8.mo75945l3(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zg1.C16168c.mo14632d(java.util.LinkedList):void");
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20088};
    }
}
