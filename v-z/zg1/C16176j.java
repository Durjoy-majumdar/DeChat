package zg1;

import fj1.C45795b;
import gy3.C87412m;
import yg1.C16006g;

/* renamed from: zg1.j */
public final class C16176j extends C16006g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16176j(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: te3.xs0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14632d(java.util.LinkedList<te3.C52013xs0> r15) {
        /*
            r14 = this;
            java.lang.String r0 = "msgList"
            gy3.C87412m.m108594g(r15, r0)
            java.util.Iterator r0 = r15.iterator()
        L_0x0009:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0112
            java.lang.Object r1 = r0.next()
            te3.xs0 r1 = (te3.C52013xs0) r1
            int r2 = r1.f144903e
            java.lang.String r3 = ""
            java.lang.String r4 = "safeParser"
            r5 = 20038(0x4e46, float:2.8079E-41)
            r6 = 0
            r7 = 1
            r8 = 0
            if (r2 == r5) goto L_0x0055
            r5 = 20075(0x4e6b, float:2.8131E-41)
            if (r2 == r5) goto L_0x0028
            goto L_0x0009
        L_0x0028:
            te3.dv0 r2 = new te3.dv0
            r2.<init>()
            pe3.b r1 = r1.f144906h
            if (r1 == 0) goto L_0x0036
            byte[] r1 = r1.mo123703f()
            goto L_0x0037
        L_0x0036:
            r1 = r8
        L_0x0037:
            if (r1 != 0) goto L_0x003a
            goto L_0x0047
        L_0x003a:
            r2.parseFrom(r1)     // Catch:{ Exception -> 0x003f }
            r8 = r2
            goto L_0x0047
        L_0x003f:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r6] = r1
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r3, r2)
        L_0x0047:
            fj1.b r1 = r14.f43066a
            java.lang.Class<cl1.m> r2 = cl1.C54985m.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r2)
            cl1.m r1 = (cl1.C54985m) r1
            r1.mo75951e3(r8)
            goto L_0x0009
        L_0x0055:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            androidx.lifecycle.i0 r1 = r1.mo77630e(r2)
            cl1.o r1 = (cl1.C54991o) r1
            if (r1 == 0) goto L_0x0009
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r15.iterator()
        L_0x006a:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0084
            java.lang.Object r10 = r9.next()
            r11 = r10
            te3.xs0 r11 = (te3.C52013xs0) r11
            int r11 = r11.f144903e
            if (r11 != r5) goto L_0x007d
            r11 = 1
            goto L_0x007e
        L_0x007d:
            r11 = 0
        L_0x007e:
            if (r11 == 0) goto L_0x006a
            r2.add(r10)
            goto L_0x006a
        L_0x0084:
            java.util.Iterator r2 = r2.iterator()
            boolean r5 = r2.hasNext()
            if (r5 != 0) goto L_0x008f
            goto L_0x00b6
        L_0x008f:
            java.lang.Object r5 = r2.next()
            boolean r8 = r2.hasNext()
            if (r8 != 0) goto L_0x009b
        L_0x0099:
            r8 = r5
            goto L_0x00b6
        L_0x009b:
            r8 = r5
            te3.xs0 r8 = (te3.C52013xs0) r8
            long r8 = r8.f144913r
        L_0x00a0:
            java.lang.Object r10 = r2.next()
            r11 = r10
            te3.xs0 r11 = (te3.C52013xs0) r11
            long r11 = r11.f144913r
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x00af
            r5 = r10
            r8 = r11
        L_0x00af:
            boolean r10 = r2.hasNext()
            if (r10 != 0) goto L_0x00a0
            goto L_0x0099
        L_0x00b6:
            te3.xs0 r8 = (te3.C52013xs0) r8
            if (r8 == 0) goto L_0x0009
            pe3.b r2 = r8.f144906h
            if (r2 == 0) goto L_0x0009
            java.lang.String r5 = r1.f154311f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "localCheerInfo:"
            r8.append(r9)
            cl1.o$a r9 = r1.f154278X1
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
            cl1.o$a r5 = r1.f154278X1
            int r5 = r5.f1589e
            if (r5 != 0) goto L_0x0009
            te3.ev0 r5 = new te3.ev0
            r5.<init>()
            byte[] r2 = r2.mo123703f()
            r5.parseFrom(r2)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00f1
        L_0x00e9:
            r2 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r3, r7)
        L_0x00f1:
            java.lang.String r2 = r1.f154311f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "remoteCheerInfo:"
            r3.append(r4)
            org.json.JSONObject r4 = o40.C61937h.m72709h(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            te3.uw0 r2 = r5.f133132d
            r1.mo75970L4(r2)
            goto L_0x0009
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zg1.C16176j.mo14632d(java.util.LinkedList):void");
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20038, 20075};
    }
}
