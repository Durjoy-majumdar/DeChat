package com.tencent.p014mm.plugin.finder.feed.model;

import gy3.C8479f0;
import hp3.C87581a;
import java.util.LinkedList;
import rx3.C13604l;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.f0 */
public final class C41415f0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C55757d0 f111506a;

    /* renamed from: b */
    public final /* synthetic */ C8479f0<LinkedList<C13604l<Long, String>>> f111507b;

    public C41415f0(C55757d0 d0Var, C8479f0<LinkedList<C13604l<Long, String>>> f0Var) {
        this.f111506a = d0Var;
        this.f111507b = f0Var;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public java.lang.Object call(java.lang.Object r12) {
        /*
            r11 = this;
            ob0.b$c r12 = (ob0.C89132b.C89134c) r12
            com.tencent.mm.plugin.finder.feed.model.d0 r0 = r11.f111506a
            java.lang.String r0 = r0.f158740g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[onCgiBack] errType="
            r1.append(r2)
            int r2 = r12.f256793a
            r1.append(r2)
            java.lang.String r2 = " errCode="
            r1.append(r2)
            int r2 = r12.f256794b
            r1.append(r2)
            java.lang.String r2 = " thread="
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r0 = 10
            r1 = 0
            int r2 = r12.f256793a     // Catch:{ all -> 0x01a7 }
            if (r2 != 0) goto L_0x0174
            int r2 = r12.f256794b     // Catch:{ all -> 0x01a7 }
            if (r2 != 0) goto L_0x0174
            T r2 = r12.f256796d     // Catch:{ all -> 0x01a7 }
            if (r2 == 0) goto L_0x0174
            com.tencent.mm.plugin.finder.feed.model.d0 r2 = r11.f111506a     // Catch:{ all -> 0x01a7 }
            java.lang.String r2 = r2.f158740g     // Catch:{ all -> 0x01a7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a7 }
            r3.<init>()     // Catch:{ all -> 0x01a7 }
            java.lang.String r4 = "result object id size = "
            r3.append(r4)     // Catch:{ all -> 0x01a7 }
            T r4 = r12.f256796d     // Catch:{ all -> 0x01a7 }
            te3.mg0 r4 = (te3.C50397mg0) r4     // Catch:{ all -> 0x01a7 }
            java.util.LinkedList<te3.ue1> r4 = r4.f138011d     // Catch:{ all -> 0x01a7 }
            int r4 = r4.size()     // Catch:{ all -> 0x01a7 }
            r3.append(r4)     // Catch:{ all -> 0x01a7 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01a7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x01a7 }
            T r2 = r12.f256796d     // Catch:{ all -> 0x01a7 }
            te3.mg0 r2 = (te3.C50397mg0) r2     // Catch:{ all -> 0x01a7 }
            java.util.LinkedList<te3.ue1> r2 = r2.f138011d     // Catch:{ all -> 0x01a7 }
            java.lang.String r3 = "it.resp.object_async_info_map"
            gy3.C87412m.m108593f(r2, r3)     // Catch:{ all -> 0x01a7 }
            com.tencent.mm.plugin.finder.feed.model.d0 r3 = r11.f111506a     // Catch:{ all -> 0x01a7 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x01a7 }
        L_0x0074:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x01a7 }
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x01a7 }
            te3.ue1 r4 = (te3.C51533ue1) r4     // Catch:{ all -> 0x01a7 }
            java.util.Vector<java.lang.Long> r5 = r3.f158745o     // Catch:{ all -> 0x01a7 }
            long r6 = r4.f142797d     // Catch:{ all -> 0x01a7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01a7 }
            r5.add(r4)     // Catch:{ all -> 0x01a7 }
            goto L_0x0074
        L_0x008c:
            java.util.LinkedList r2 = new java.util.LinkedList     // Catch:{ all -> 0x01a7 }
            r2.<init>()     // Catch:{ all -> 0x01a7 }
            java.util.LinkedList r3 = new java.util.LinkedList     // Catch:{ all -> 0x01a7 }
            r3.<init>()     // Catch:{ all -> 0x01a7 }
            T r12 = r12.f256796d     // Catch:{ all -> 0x01a7 }
            te3.mg0 r12 = (te3.C50397mg0) r12     // Catch:{ all -> 0x01a7 }
            java.util.LinkedList<te3.ei0> r12 = r12.f138012e     // Catch:{ all -> 0x01a7 }
            java.lang.String r4 = "it.resp.contact_async_info_map"
            gy3.C87412m.m108593f(r12, r4)     // Catch:{ all -> 0x01a7 }
            com.tencent.mm.plugin.finder.feed.model.d0 r4 = r11.f111506a     // Catch:{ all -> 0x01a7 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x01a7 }
        L_0x00a7:
            boolean r5 = r12.hasNext()     // Catch:{ all -> 0x01a7 }
            if (r5 == 0) goto L_0x013c
            java.lang.Object r5 = r12.next()     // Catch:{ all -> 0x01a7 }
            te3.ei0 r5 = (te3.C49288ei0) r5     // Catch:{ all -> 0x01a7 }
            er1.j4 r6 = er1.C58739j4.f168176a     // Catch:{ all -> 0x01a7 }
            java.lang.String r6 = r5.f132936d     // Catch:{ all -> 0x01a7 }
            te3.d51 r7 = r5.f132937e     // Catch:{ all -> 0x01a7 }
            if (r6 == 0) goto L_0x0103
            if (r7 == 0) goto L_0x0103
            com.tencent.mm.plugin.finder.feed.model.v r8 = com.tencent.p014mm.plugin.finder.feed.model.C2816v.f14072a     // Catch:{ all -> 0x01a7 }
            te3.d51 r9 = r8.mo2914c(r6)     // Catch:{ all -> 0x01a7 }
            if (r9 != 0) goto L_0x0103
            java.lang.String r9 = r7.f132122h     // Catch:{ all -> 0x01a7 }
            if (r9 == 0) goto L_0x00d2
            int r9 = r9.length()     // Catch:{ all -> 0x01a7 }
            if (r9 != 0) goto L_0x00d0
            goto L_0x00d2
        L_0x00d0:
            r9 = 0
            goto L_0x00d3
        L_0x00d2:
            r9 = 1
        L_0x00d3:
            if (r9 != 0) goto L_0x0103
            java.lang.String r9 = r7.f132122h     // Catch:{ all -> 0x01a7 }
            java.lang.String r10 = ""
            if (r9 != 0) goto L_0x00dc
            r9 = r10
        L_0x00dc:
            r8.mo2912a(r6, r9, r7)     // Catch:{ all -> 0x01a7 }
            rx3.l r8 = new rx3.l     // Catch:{ all -> 0x01a7 }
            r8.<init>(r6, r7)     // Catch:{ all -> 0x01a7 }
            r2.add(r8)     // Catch:{ all -> 0x01a7 }
            java.lang.String r6 = r4.f158740g     // Catch:{ all -> 0x01a7 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a7 }
            r8.<init>()     // Catch:{ all -> 0x01a7 }
            java.lang.String r9 = "response notice, noticeId: "
            r8.append(r9)     // Catch:{ all -> 0x01a7 }
            java.lang.String r7 = r7.f132122h     // Catch:{ all -> 0x01a7 }
            if (r7 != 0) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r10 = r7
        L_0x00f9:
            r8.append(r10)     // Catch:{ all -> 0x01a7 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x01a7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ all -> 0x01a7 }
        L_0x0103:
            java.lang.String r6 = r5.f132936d     // Catch:{ all -> 0x01a7 }
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.f132938f     // Catch:{ all -> 0x01a7 }
            if (r6 == 0) goto L_0x00a7
            if (r5 == 0) goto L_0x00a7
            com.tencent.mm.plugin.finder.feed.model.v r7 = com.tencent.p014mm.plugin.finder.feed.model.C2816v.f14072a     // Catch:{ all -> 0x01a7 }
            r7.mo2913b(r6, r5)     // Catch:{ all -> 0x01a7 }
            rx3.l r7 = new rx3.l     // Catch:{ all -> 0x01a7 }
            r7.<init>(r6, r5)     // Catch:{ all -> 0x01a7 }
            r3.add(r7)     // Catch:{ all -> 0x01a7 }
            java.lang.String r6 = r4.f158740g     // Catch:{ all -> 0x01a7 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a7 }
            r7.<init>()     // Catch:{ all -> 0x01a7 }
            java.lang.String r8 = "response living tips, liveId: "
            r7.append(r8)     // Catch:{ all -> 0x01a7 }
            te3.c21 r5 = r5.liveInfo     // Catch:{ all -> 0x01a7 }
            if (r5 == 0) goto L_0x012f
            long r8 = r5.f182392d     // Catch:{ all -> 0x01a7 }
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x01a7 }
            goto L_0x0130
        L_0x012f:
            r5 = 0
        L_0x0130:
            r7.append(r5)     // Catch:{ all -> 0x01a7 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x01a7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)     // Catch:{ all -> 0x01a7 }
            goto L_0x00a7
        L_0x013c:
            com.tencent.mm.plugin.finder.feed.model.d0 r12 = r11.f111506a     // Catch:{ all -> 0x01a7 }
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r12.mo77358E1()     // Catch:{ all -> 0x01a7 }
            int r5 = r12.f158751u     // Catch:{ all -> 0x01a7 }
            r4.removeMessages(r5)     // Catch:{ all -> 0x01a7 }
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r12.mo77358E1()     // Catch:{ all -> 0x01a7 }
            com.tencent.mm.sdk.platformtools.MMHandler r5 = r12.mo77358E1()     // Catch:{ all -> 0x01a7 }
            int r12 = r12.f158751u     // Catch:{ all -> 0x01a7 }
            android.os.Message r12 = r5.obtainMessage(r12, r2)     // Catch:{ all -> 0x01a7 }
            r4.sendMessage(r12)     // Catch:{ all -> 0x01a7 }
            com.tencent.mm.plugin.finder.feed.model.d0 r12 = r11.f111506a     // Catch:{ all -> 0x01a7 }
            com.tencent.mm.sdk.platformtools.MMHandler r2 = r12.mo77358E1()     // Catch:{ all -> 0x01a7 }
            int r4 = r12.f158753w     // Catch:{ all -> 0x01a7 }
            r2.removeMessages(r4)     // Catch:{ all -> 0x01a7 }
            com.tencent.mm.sdk.platformtools.MMHandler r2 = r12.mo77358E1()     // Catch:{ all -> 0x01a7 }
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r12.mo77358E1()     // Catch:{ all -> 0x01a7 }
            int r12 = r12.f158753w     // Catch:{ all -> 0x01a7 }
            android.os.Message r12 = r4.obtainMessage(r12, r3)     // Catch:{ all -> 0x01a7 }
            r2.sendMessage(r12)     // Catch:{ all -> 0x01a7 }
        L_0x0174:
            com.tencent.mm.plugin.finder.feed.model.d0 r12 = r11.f111506a
            java.util.Vector<java.lang.Long> r12 = r12.f158744n
            gy3.f0<java.util.LinkedList<rx3.l<java.lang.Long, java.lang.String>>> r1 = r11.f111507b
            T r1 = r1.f27484d
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = sx3.C36907w.m41090l(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
        L_0x018b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01e6
            java.lang.Object r1 = r0.next()
            rx3.l r1 = (rx3.C13604l) r1
            A r1 = r1.f38555d
            java.lang.Number r1 = (java.lang.Number) r1
            long r3 = r1.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.add(r1)
            goto L_0x018b
        L_0x01a7:
            r12 = move-exception
            com.tencent.mm.plugin.finder.feed.model.d0 r2 = r11.f111506a     // Catch:{ all -> 0x01ec }
            java.lang.String r2 = r2.f158740g     // Catch:{ all -> 0x01ec }
            java.lang.String r3 = "preLoadFinderLiveNoticeInfo exception"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x01ec }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r12, r3, r1)     // Catch:{ all -> 0x01ec }
            com.tencent.mm.plugin.finder.feed.model.d0 r12 = r11.f111506a
            java.util.Vector<java.lang.Long> r12 = r12.f158744n
            gy3.f0<java.util.LinkedList<rx3.l<java.lang.Long, java.lang.String>>> r1 = r11.f111507b
            T r1 = r1.f27484d
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = sx3.C36907w.m41090l(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
        L_0x01ca:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01e6
            java.lang.Object r1 = r0.next()
            rx3.l r1 = (rx3.C13604l) r1
            A r1 = r1.f38555d
            java.lang.Number r1 = (java.lang.Number) r1
            long r3 = r1.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.add(r1)
            goto L_0x01ca
        L_0x01e6:
            r12.removeAll(r2)
            rx3.b0 r12 = rx3.C13598b0.f38549a
            return r12
        L_0x01ec:
            r12 = move-exception
            com.tencent.mm.plugin.finder.feed.model.d0 r1 = r11.f111506a
            java.util.Vector<java.lang.Long> r1 = r1.f158744n
            gy3.f0<java.util.LinkedList<rx3.l<java.lang.Long, java.lang.String>>> r2 = r11.f111507b
            T r2 = r2.f27484d
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = sx3.C36907w.m41090l(r2, r0)
            r3.<init>(r0)
            java.util.Iterator r0 = r2.iterator()
        L_0x0204:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0220
            java.lang.Object r2 = r0.next()
            rx3.l r2 = (rx3.C13604l) r2
            A r2 = r2.f38555d
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r3.add(r2)
            goto L_0x0204
        L_0x0220:
            r1.removeAll(r3)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.C41415f0.call(java.lang.Object):java.lang.Object");
    }
}
