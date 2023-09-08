package zg1;

import fj1.C45795b;
import gy3.C87412m;
import yg1.C16006g;

/* renamed from: zg1.z */
public final class C66817z extends C16006g {

    /* renamed from: c */
    public final String f191937c = "LiveProductOrCuponAppMsgInterceptor";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66817z(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0182 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01b7  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14632d(java.util.LinkedList<te3.C52013xs0> r19) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            java.lang.String r0 = "msgList"
            gy3.C87412m.m108594g(r2, r0)
            fj1.b r3 = r1.f43066a
            java.lang.Class<cl1.h1> r4 = cl1.C54979h1.class
            int r0 = r19.size()
            java.util.ListIterator r0 = r2.listIterator(r0)
        L_0x0015:
            boolean r5 = r0.hasPrevious()
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0030
            java.lang.Object r5 = r0.previous()
            r9 = r5
            te3.xs0 r9 = (te3.C52013xs0) r9
            int r9 = r9.f144903e
            r10 = 20025(0x4e39, float:2.8061E-41)
            if (r9 != r10) goto L_0x002c
            r9 = 1
            goto L_0x002d
        L_0x002c:
            r9 = 0
        L_0x002d:
            if (r9 == 0) goto L_0x0015
            goto L_0x0031
        L_0x0030:
            r5 = 0
        L_0x0031:
            te3.xs0 r5 = (te3.C52013xs0) r5
            if (r5 == 0) goto L_0x0038
            pe3.b r0 = r5.f144906h
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            java.lang.String r9 = "safeParser"
            java.lang.String r10 = ""
            if (r0 == 0) goto L_0x0064
            te3.ru0 r0 = new te3.ru0
            r0.<init>()
            pe3.b r5 = r5.f144906h
            if (r5 == 0) goto L_0x004d
            byte[] r5 = r5.mo123703f()
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            if (r5 != 0) goto L_0x0051
            goto L_0x005e
        L_0x0051:
            r0.parseFrom(r5)     // Catch:{ Exception -> 0x0055 }
            goto L_0x005f
        L_0x0055:
            r0 = move-exception
            r5 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r7] = r5
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r10, r0)
        L_0x005e:
            r0 = 0
        L_0x005f:
            if (r0 == 0) goto L_0x0064
            te3.fp1 r0 = r0.f141150e
            goto L_0x0065
        L_0x0064:
            r0 = 0
        L_0x0065:
            java.lang.String r5 = ", local productId:"
            java.lang.String r11 = ",localPromoting:"
            java.lang.String r12 = " promoting:"
            java.lang.String r13 = "PARAM_FINDER_LIVE_PROMOTE_DATA"
            if (r0 == 0) goto L_0x0159
            androidx.lifecycle.i0 r14 = r3.mo71262a(r4)
            cl1.h1 r14 = (cl1.C54979h1) r14
            cm1.i2 r14 = r14.f154147v
            java.lang.String r15 = r1.f191937c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r6 = "filterPromoteProduct remotePromoting:"
            r8.append(r6)
            java.lang.String r6 = r0.f183177e
            r8.append(r6)
            r8.append(r11)
            if (r14 == 0) goto L_0x00ac
            boolean r6 = r14 instanceof sk1.C13697w
            if (r6 == 0) goto L_0x0095
            r6 = r14
            sk1.w r6 = (sk1.C13697w) r6
            goto L_0x00ac
        L_0x0095:
            boolean r6 = r14 instanceof sk1.C63964u
            if (r6 == 0) goto L_0x009d
            r6 = r14
            sk1.u r6 = (sk1.C63964u) r6
            goto L_0x00ac
        L_0x009d:
            boolean r6 = r14 instanceof sk1.C63965x
            if (r6 == 0) goto L_0x00a5
            r6 = r14
            sk1.x r6 = (sk1.C63965x) r6
            goto L_0x00ac
        L_0x00a5:
            boolean r6 = r14 instanceof sk1.C13696v
            if (r6 == 0) goto L_0x00ac
            r6 = r14
            sk1.v r6 = (sk1.C13696v) r6
        L_0x00ac:
            r8.append(r10)
            java.lang.String r6 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r6)
            boolean r6 = r14 instanceof sk1.C63965x
            if (r6 == 0) goto L_0x00cb
            r6 = r14
            sk1.x r6 = (sk1.C63965x) r6
            long r7 = r6.f181347t
            r6 = r3
            r16 = r4
            long r3 = r0.f183176d
            int r17 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r17 == 0) goto L_0x00c9
            goto L_0x00ce
        L_0x00c9:
            r3 = 0
            goto L_0x00cf
        L_0x00cb:
            r6 = r3
            r16 = r4
        L_0x00ce:
            r3 = 1
        L_0x00cf:
            if (r14 == 0) goto L_0x0120
            int r4 = r0.f183186q
            if (r4 != 0) goto L_0x0120
            if (r3 == 0) goto L_0x0120
            java.lang.String r3 = r1.f191937c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "filterPromoteProduct remote productId:"
            r4.append(r7)
            long r7 = r0.f183176d
            r4.append(r7)
            r4.append(r12)
            int r0 = r0.f183186q
            r4.append(r0)
            r4.append(r5)
            long r7 = r14.getItemId()
            r4.append(r7)
            r4.append(r12)
            boolean r0 = r14 instanceof sk1.C13697w
            if (r0 == 0) goto L_0x0105
            sk1.w r14 = (sk1.C13697w) r14
        L_0x0103:
            r7 = 0
            goto L_0x0113
        L_0x0105:
            boolean r0 = r14 instanceof sk1.C63964u
            if (r0 == 0) goto L_0x010c
            sk1.u r14 = (sk1.C63964u) r14
            goto L_0x0103
        L_0x010c:
            boolean r0 = r14 instanceof sk1.C63965x
            if (r0 == 0) goto L_0x0103
            sk1.x r14 = (sk1.C63965x) r14
            goto L_0x0103
        L_0x0113:
            r4.append(r7)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015c
        L_0x0120:
            sk1.x r3 = new sk1.x
            r3.<init>(r0)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            com.tencent.mm.plugin.finder.live.view.b r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r0 == 0) goto L_0x015c
            d60.b$b r4 = d60.C58124b.C58125b.FINDER_LIVE_PROMTE_ADD
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            te3.x51 r8 = new te3.x51
            r8.<init>()
            r14 = 5
            r8.f186254d = r14
            pe3.b r14 = new pe3.b
            pe3.a r3 = r3.mo13073b()
            byte[] r3 = r3.toByteArray()
            r14.<init>(r3)
            r8.f186256f = r14
            rx3.b0 r3 = rx3.C13598b0.f38549a
            byte[] r3 = r8.toByteArray()
            r7.putByteArray(r13, r3)
            r0.statusChange(r4, r7)
            goto L_0x015c
        L_0x0159:
            r6 = r3
            r16 = r4
        L_0x015c:
            int r0 = r19.size()
            java.util.ListIterator r0 = r2.listIterator(r0)
        L_0x0164:
            boolean r3 = r0.hasPrevious()
            r4 = 20022(0x4e36, float:2.8057E-41)
            r7 = 20021(0x4e35, float:2.8055E-41)
            if (r3 == 0) goto L_0x0182
            java.lang.Object r3 = r0.previous()
            r8 = r3
            te3.xs0 r8 = (te3.C52013xs0) r8
            int r8 = r8.f144903e
            if (r8 == r7) goto L_0x017e
            if (r8 != r4) goto L_0x017c
            goto L_0x017e
        L_0x017c:
            r8 = 0
            goto L_0x017f
        L_0x017e:
            r8 = 1
        L_0x017f:
            if (r8 == 0) goto L_0x0164
            goto L_0x0183
        L_0x0182:
            r3 = 0
        L_0x0183:
            te3.xs0 r3 = (te3.C52013xs0) r3
            if (r3 == 0) goto L_0x018d
            int r0 = r3.f144903e
            if (r0 != r7) goto L_0x018d
            r0 = 1
            goto L_0x018e
        L_0x018d:
            r0 = 0
        L_0x018e:
            if (r0 == 0) goto L_0x01b7
            te3.qu0 r0 = new te3.qu0
            r0.<init>()
            pe3.b r3 = r3.f144906h
            if (r3 == 0) goto L_0x019e
            byte[] r3 = r3.mo123703f()
            goto L_0x019f
        L_0x019e:
            r3 = 0
        L_0x019f:
            if (r3 != 0) goto L_0x01a2
            goto L_0x01b1
        L_0x01a2:
            r0.parseFrom(r3)     // Catch:{ Exception -> 0x01a6 }
            goto L_0x01b2
        L_0x01a6:
            r0 = move-exception
            r3 = r0
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r4 = 0
            r0[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r10, r0)
        L_0x01b1:
            r0 = 0
        L_0x01b2:
            if (r0 == 0) goto L_0x01e9
            te3.s81 r0 = r0.f185079d
            goto L_0x01ea
        L_0x01b7:
            if (r3 == 0) goto L_0x01bf
            int r0 = r3.f144903e
            if (r0 != r4) goto L_0x01bf
            r0 = 1
            goto L_0x01c0
        L_0x01bf:
            r0 = 0
        L_0x01c0:
            if (r0 == 0) goto L_0x01e9
            te3.yt0 r0 = new te3.yt0
            r0.<init>()
            pe3.b r3 = r3.f144906h
            if (r3 == 0) goto L_0x01d0
            byte[] r3 = r3.mo123703f()
            goto L_0x01d1
        L_0x01d0:
            r3 = 0
        L_0x01d1:
            if (r3 != 0) goto L_0x01d4
            goto L_0x01e3
        L_0x01d4:
            r0.parseFrom(r3)     // Catch:{ Exception -> 0x01d8 }
            goto L_0x01e4
        L_0x01d8:
            r0 = move-exception
            r3 = r0
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r4 = 0
            r0[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r10, r0)
        L_0x01e3:
            r0 = 0
        L_0x01e4:
            if (r0 == 0) goto L_0x01e9
            te3.s81 r0 = r0.f186601d
            goto L_0x01ea
        L_0x01e9:
            r0 = 0
        L_0x01ea:
            if (r0 == 0) goto L_0x02d2
            r3 = r16
            androidx.lifecycle.i0 r4 = r6.mo71262a(r3)
            cl1.h1 r4 = (cl1.C54979h1) r4
            cm1.i2 r4 = r4.f154147v
            java.lang.String r7 = r1.f191937c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r14 = "ad filterPromoteProduct remotePromoting:"
            r8.append(r14)
            java.lang.String r14 = r0.f185376f
            r8.append(r14)
            r8.append(r11)
            if (r4 == 0) goto L_0x022b
            boolean r14 = r4 instanceof sk1.C13697w
            if (r14 == 0) goto L_0x0214
            r14 = r4
            sk1.w r14 = (sk1.C13697w) r14
            goto L_0x022b
        L_0x0214:
            boolean r14 = r4 instanceof sk1.C63964u
            if (r14 == 0) goto L_0x021c
            r14 = r4
            sk1.u r14 = (sk1.C63964u) r14
            goto L_0x022b
        L_0x021c:
            boolean r14 = r4 instanceof sk1.C63965x
            if (r14 == 0) goto L_0x0224
            r14 = r4
            sk1.x r14 = (sk1.C63965x) r14
            goto L_0x022b
        L_0x0224:
            boolean r14 = r4 instanceof sk1.C13696v
            if (r14 == 0) goto L_0x022b
            r14 = r4
            sk1.v r14 = (sk1.C13696v) r14
        L_0x022b:
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            boolean r7 = r4 instanceof sk1.C63964u
            if (r7 == 0) goto L_0x0247
            r7 = r4
            sk1.u r7 = (sk1.C63964u) r7
            long r7 = r7.f181326t
            long r14 = r0.f185374d
            int r17 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r17 == 0) goto L_0x0245
            goto L_0x0247
        L_0x0245:
            r15 = 0
            goto L_0x0248
        L_0x0247:
            r15 = 1
        L_0x0248:
            if (r4 == 0) goto L_0x0299
            int r7 = r0.f185381n
            if (r7 != 0) goto L_0x0299
            if (r15 == 0) goto L_0x0299
            java.lang.String r7 = r1.f191937c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r14 = "ad filterPromoteProduct remote productId:"
            r8.append(r14)
            long r14 = r0.f185374d
            r8.append(r14)
            r8.append(r12)
            int r0 = r0.f185381n
            r8.append(r0)
            r8.append(r5)
            long r14 = r4.getItemId()
            r8.append(r14)
            r8.append(r12)
            boolean r0 = r4 instanceof sk1.C13697w
            if (r0 == 0) goto L_0x027e
            sk1.w r4 = (sk1.C13697w) r4
        L_0x027c:
            r4 = 0
            goto L_0x028c
        L_0x027e:
            boolean r0 = r4 instanceof sk1.C63964u
            if (r0 == 0) goto L_0x0285
            sk1.u r4 = (sk1.C63964u) r4
            goto L_0x027c
        L_0x0285:
            boolean r0 = r4 instanceof sk1.C63965x
            if (r0 == 0) goto L_0x027c
            sk1.x r4 = (sk1.C63965x) r4
            goto L_0x027c
        L_0x028c:
            r8.append(r4)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x02d4
        L_0x0299:
            sk1.u r4 = new sk1.u
            r4.<init>(r0)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            com.tencent.mm.plugin.finder.live.view.b r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r0 == 0) goto L_0x02d4
            d60.b$b r5 = d60.C58124b.C58125b.FINDER_LIVE_PROMTE_ADD
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            te3.x51 r8 = new te3.x51
            r8.<init>()
            r12 = 4
            r8.f186254d = r12
            pe3.b r12 = new pe3.b
            pe3.a r4 = r4.mo13073b()
            byte[] r4 = r4.toByteArray()
            r12.<init>(r4)
            r8.f186256f = r12
            rx3.b0 r4 = rx3.C13598b0.f38549a
            byte[] r4 = r8.toByteArray()
            r7.putByteArray(r13, r4)
            r0.statusChange(r5, r7)
            goto L_0x02d4
        L_0x02d2:
            r3 = r16
        L_0x02d4:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r19.iterator()
        L_0x02e2:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x02fe
            java.lang.Object r5 = r2.next()
            r7 = r5
            te3.xs0 r7 = (te3.C52013xs0) r7
            int r7 = r7.f144903e
            r8 = 20037(0x4e45, float:2.8078E-41)
            if (r7 != r8) goto L_0x02f7
            r7 = 1
            goto L_0x02f8
        L_0x02f7:
            r7 = 0
        L_0x02f8:
            if (r7 == 0) goto L_0x02e2
            r0.add(r5)
            goto L_0x02e2
        L_0x02fe:
            java.util.Iterator r2 = r0.iterator()
        L_0x0302:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0360
            java.lang.Object r0 = r2.next()
            te3.xs0 r0 = (te3.C52013xs0) r0
            pe3.b r5 = r0.f144906h
            if (r5 == 0) goto L_0x0337
            te3.fu0 r5 = new te3.fu0
            r5.<init>()
            pe3.b r0 = r0.f144906h
            if (r0 == 0) goto L_0x0320
            byte[] r0 = r0.mo123703f()
            goto L_0x0321
        L_0x0320:
            r0 = 0
        L_0x0321:
            if (r0 != 0) goto L_0x0325
            r5 = 0
            goto L_0x0328
        L_0x0325:
            r5.parseFrom(r0)     // Catch:{ Exception -> 0x032b }
        L_0x0328:
            r7 = 1
            r8 = 0
            goto L_0x033a
        L_0x032b:
            r0 = move-exception
            r5 = r0
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r5
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r10, r0)
            goto L_0x0339
        L_0x0337:
            r7 = 1
            r8 = 0
        L_0x0339:
            r5 = 0
        L_0x033a:
            if (r5 == 0) goto L_0x0302
            te3.uk1 r0 = r5.f133685d
            if (r0 == 0) goto L_0x0351
            sk1.v r12 = new sk1.v
            r12.<init>(r0)
            int r0 = r5.f133686e
            if (r0 > 0) goto L_0x034b
            r0 = 1
            goto L_0x034c
        L_0x034b:
            r0 = 0
        L_0x034c:
            r12.f38758E = r0
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0352
        L_0x0351:
            r12 = 0
        L_0x0352:
            if (r12 == 0) goto L_0x035d
            java.lang.String r0 = r12.f38763u
            if (r0 == 0) goto L_0x035d
            r4.put(r0, r12)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x035d:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0302
        L_0x0360:
            r7 = 1
            androidx.lifecycle.i0 r0 = r6.mo71262a(r3)
            cl1.h1 r0 = (cl1.C54979h1) r0
            cm1.i2 r0 = r0.f154147v
            java.util.Collection r2 = r4.values()
            java.lang.String r3 = "stockIdToCouponItem.values"
            gy3.C87412m.m108593f(r2, r3)
            java.util.List r2 = sx3.C110818d0.m150936h0(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x037b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0431
            java.lang.Object r3 = r2.next()
            sk1.v r3 = (sk1.C13696v) r3
            java.lang.String r4 = r1.f191937c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "coupon filterPromoteProduct "
            r5.append(r6)
            boolean r6 = r3.f38758E
            r5.append(r6)
            java.lang.String r6 = " remotePromoting:"
            r5.append(r6)
            r5.append(r3)
            r5.append(r11)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            boolean r4 = r3.f38758E
            r5 = 6
            if (r4 != 0) goto L_0x03ff
            if (r0 != 0) goto L_0x03b6
            r4 = 1
            goto L_0x03b8
        L_0x03b6:
            boolean r4 = r0 instanceof sk1.C13696v
        L_0x03b8:
            if (r4 == 0) goto L_0x037b
            java.lang.String r4 = r3.f38763u
            r6 = r0
            sk1.v r6 = (sk1.C13696v) r6
            if (r6 == 0) goto L_0x03c4
            java.lang.String r6 = r6.f38763u
            goto L_0x03c5
        L_0x03c4:
            r6 = 0
        L_0x03c5:
            boolean r4 = gy3.C87412m.m108589b(r4, r6)
            if (r4 == 0) goto L_0x037b
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r4.getClass()
            com.tencent.mm.plugin.finder.live.view.b r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r4 == 0) goto L_0x037b
            d60.b$b r6 = d60.C58124b.C58125b.FINDER_LIVE_PROMTE_ADD
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            te3.x51 r9 = new te3.x51
            r9.<init>()
            r9.f186254d = r5
            pe3.b r5 = new pe3.b
            pe3.a r3 = r3.mo13073b()
            byte[] r3 = r3.toByteArray()
            r5.<init>(r3)
            r9.f186256f = r5
            rx3.b0 r3 = rx3.C13598b0.f38549a
            byte[] r3 = r9.toByteArray()
            r8.putByteArray(r13, r3)
            r4.statusChange(r6, r8)
            goto L_0x037b
        L_0x03ff:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            com.tencent.mm.plugin.finder.live.view.b r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r0 == 0) goto L_0x0431
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_PROMTE_ADD
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            te3.x51 r6 = new te3.x51
            r6.<init>()
            r6.f186254d = r5
            pe3.b r5 = new pe3.b
            pe3.a r3 = r3.mo13073b()
            byte[] r3 = r3.toByteArray()
            r5.<init>(r3)
            r6.f186256f = r5
            rx3.b0 r3 = rx3.C13598b0.f38549a
            byte[] r3 = r6.toByteArray()
            r4.putByteArray(r13, r3)
            r0.statusChange(r2, r4)
        L_0x0431:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zg1.C66817z.mo14632d(java.util.LinkedList):void");
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20025, 20021, 20022, 20037};
    }
}
