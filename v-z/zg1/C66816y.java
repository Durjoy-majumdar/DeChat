package zg1;

import fj1.C45795b;
import gy3.C87412m;
import yg1.C16006g;

/* renamed from: zg1.y */
public final class C66816y extends C16006g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66816y(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0009 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14632d(java.util.LinkedList<te3.C52013xs0> r5) {
        /*
            r4 = this;
            java.lang.String r0 = "msgList"
            gy3.C87412m.m108594g(r5, r0)
            java.util.Iterator r5 = r5.iterator()
        L_0x0009:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0089
            java.lang.Object r0 = r5.next()
            te3.xs0 r0 = (te3.C52013xs0) r0
            int r1 = r0.f144903e
            r2 = 20068(0x4e64, float:2.8121E-41)
            if (r1 != r2) goto L_0x0009
            te3.gv0 r1 = new te3.gv0
            r1.<init>()
            pe3.b r0 = r0.f144906h
            r2 = 0
            if (r0 == 0) goto L_0x002a
            byte[] r0 = r0.mo123703f()
            goto L_0x002b
        L_0x002a:
            r0 = r2
        L_0x002b:
            if (r0 != 0) goto L_0x002e
            goto L_0x0040
        L_0x002e:
            r1.parseFrom(r0)     // Catch:{ Exception -> 0x0032 }
            goto L_0x0041
        L_0x0032:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r0
            java.lang.String r0 = "safeParser"
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r3, r1)
        L_0x0040:
            r1 = r2
        L_0x0041:
            if (r1 == 0) goto L_0x0009
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "handleMultiStream object_id: "
            r0.append(r2)
            long r2 = r1.f183357d
            r0.append(r2)
            java.lang.String r2 = " live_id: "
            r0.append(r2)
            long r2 = r1.f183358e
            r0.append(r2)
            java.lang.String r2 = " deleteStreamId: "
            r0.append(r2)
            java.lang.String r2 = r1.f183359f
            r0.append(r2)
            java.lang.String r2 = " seq: "
            r0.append(r2)
            long r2 = r1.f183360g
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicIntercomMsgInterceptor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            fj1.b r0 = r4.f43066a
            java.lang.Class<cl1.v1> r2 = cl1.C55004v1.class
            androidx.lifecycle.i0 r0 = r0.mo71262a(r2)
            cl1.v1 r0 = (cl1.C55004v1) r0
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<te3.gv0> r0 = r0.f154439j
            r0.postValue(r1)
            goto L_0x0009
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zg1.C66816y.mo14632d(java.util.LinkedList):void");
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20068};
    }
}
