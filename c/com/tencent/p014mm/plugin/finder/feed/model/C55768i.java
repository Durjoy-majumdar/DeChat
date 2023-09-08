package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import ef1.C7637b;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.i */
public final class C55768i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C7637b f158782d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList<C0740i2> f158783e;

    /* renamed from: f */
    public final /* synthetic */ C55763h f158784f;

    public C55768i(C7637b bVar, LinkedList<C0740i2> linkedList, C55763h hVar) {
        this.f158782d = bVar;
        this.f158783e = linkedList;
        this.f158784f = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0127 A[Catch:{ all -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0082 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r1 = r20
            ef1.b r0 = r1.f158782d
            ef1.k r0 = (ef1.C7642k) r0
            int r0 = r0.f25953d
            int r2 = r0 + 5
            java.lang.String r3 = "Finder.AdInfoPreLoader"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onScrollEvent:"
            r4.append(r5)
            ef1.b r5 = r1.f158782d
            r4.append(r5)
            java.lang.String r5 = " type: "
            r4.append(r5)
            ef1.b r5 = r1.f158782d
            ef1.k r5 = (ef1.C7642k) r5
            int r5 = r5.f25951b
            r4.append(r5)
            java.lang.String r5 = " firstItemPos:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = " lastItemPos:"
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = " feeds.size: "
            r4.append(r0)
            java.util.LinkedList<cm1.i2> r0 = r1.f158783e
            if (r0 == 0) goto L_0x004b
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            com.tencent.mm.plugin.finder.feed.model.h r3 = r1.f158784f
            java.util.LinkedList<cm1.i2> r0 = r1.f158783e
            monitor-enter(r3)
            r4 = 1
            if (r0 == 0) goto L_0x0164
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x00b7 }
            r5.<init>()     // Catch:{ all -> 0x00b7 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x00b7 }
        L_0x0067:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x00b7 }
            if (r7 == 0) goto L_0x0079
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x00b7 }
            boolean r8 = r7 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed     // Catch:{ all -> 0x00b7 }
            if (r8 == 0) goto L_0x0067
            r5.add(r7)     // Catch:{ all -> 0x00b7 }
            goto L_0x0067
        L_0x0079:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x00b7 }
            r6.<init>()     // Catch:{ all -> 0x00b7 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x00b7 }
        L_0x0082:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x00b7 }
            if (r7 == 0) goto L_0x012c
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x00b7 }
            r8 = r7
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r8     // Catch:{ all -> 0x00b7 }
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r8.mo3513o()     // Catch:{ all -> 0x00b7 }
            long r9 = r9.getExpectId()     // Catch:{ all -> 0x00b7 }
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r8.mo3513o()     // Catch:{ all -> 0x00b7 }
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r11.getFeedObject()     // Catch:{ all -> 0x00b7 }
            int r11 = r11.adFlag     // Catch:{ all -> 0x00b7 }
            int r12 = r3.f158772j     // Catch:{ all -> 0x00b7 }
            r13 = r11 & r12
            if (r13 != r12) goto L_0x00a9
            r12 = 1
            goto L_0x00aa
        L_0x00a9:
            r12 = 0
        L_0x00aa:
            if (r12 == 0) goto L_0x00ba
            java.util.Set<java.lang.Long> r13 = r3.f158770h     // Catch:{ all -> 0x00b7 }
            java.lang.Long r15 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x00b7 }
            boolean r13 = r13.contains(r15)     // Catch:{ all -> 0x00b7 }
            goto L_0x00bb
        L_0x00b7:
            r0 = move-exception
            goto L_0x01d9
        L_0x00ba:
            r13 = 0
        L_0x00bb:
            com.tencent.mm.plugin.finder.storage.FinderItem r15 = r8.mo3513o()     // Catch:{ all -> 0x00b7 }
            long r15 = r15.getExpectId()     // Catch:{ all -> 0x00b7 }
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r8.mo3513o()     // Catch:{ all -> 0x00b7 }
            java.lang.String r8 = r8.getObjectNonceId()     // Catch:{ all -> 0x00b7 }
            r17 = 0
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 == 0) goto L_0x00da
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ all -> 0x00b7 }
            if (r8 == 0) goto L_0x00d8
            goto L_0x00da
        L_0x00d8:
            r8 = 1
            goto L_0x00e2
        L_0x00da:
            java.lang.String r8 = "Finder.AdInfoPreLoader"
            java.lang.String r15 = "requestLoad block"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r15)     // Catch:{ all -> 0x00b7 }
            r8 = 0
        L_0x00e2:
            java.lang.String r15 = "Finder.AdInfoPreLoader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b7 }
            r2.<init>()     // Catch:{ all -> 0x00b7 }
            java.lang.String r14 = "scrollRequest id"
            r2.append(r14)     // Catch:{ all -> 0x00b7 }
            java.lang.String r9 = o40.C61926c.m72691p(r9)     // Catch:{ all -> 0x00b7 }
            r2.append(r9)     // Catch:{ all -> 0x00b7 }
            java.lang.String r9 = " adType:"
            r2.append(r9)     // Catch:{ all -> 0x00b7 }
            r2.append(r11)     // Catch:{ all -> 0x00b7 }
            java.lang.String r9 = " isAdType:"
            r2.append(r9)     // Catch:{ all -> 0x00b7 }
            r2.append(r12)     // Catch:{ all -> 0x00b7 }
            java.lang.String r9 = " isFilter: "
            r2.append(r9)     // Catch:{ all -> 0x00b7 }
            r2.append(r8)     // Catch:{ all -> 0x00b7 }
            java.lang.String r9 = " isInCache:"
            r2.append(r9)     // Catch:{ all -> 0x00b7 }
            r2.append(r13)     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00b7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)     // Catch:{ all -> 0x00b7 }
            if (r12 == 0) goto L_0x0124
            if (r8 == 0) goto L_0x0124
            if (r13 != 0) goto L_0x0124
            r14 = 1
            goto L_0x0125
        L_0x0124:
            r14 = 0
        L_0x0125:
            if (r14 == 0) goto L_0x0082
            r6.add(r7)     // Catch:{ all -> 0x00b7 }
            goto L_0x0082
        L_0x012c:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00b7 }
            r5 = 10
            int r5 = sx3.C36907w.m41090l(r6, r5)     // Catch:{ all -> 0x00b7 }
            r2.<init>(r5)     // Catch:{ all -> 0x00b7 }
            java.util.Iterator r5 = r6.iterator()     // Catch:{ all -> 0x00b7 }
        L_0x013b:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x00b7 }
            if (r6 == 0) goto L_0x0165
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x00b7 }
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r6     // Catch:{ all -> 0x00b7 }
            rx3.l r7 = new rx3.l     // Catch:{ all -> 0x00b7 }
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r6.mo3513o()     // Catch:{ all -> 0x00b7 }
            long r8 = r8.getExpectId()     // Catch:{ all -> 0x00b7 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x00b7 }
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo3513o()     // Catch:{ all -> 0x00b7 }
            java.lang.String r6 = r6.getObjectNonceId()     // Catch:{ all -> 0x00b7 }
            r7.<init>(r8, r6)     // Catch:{ all -> 0x00b7 }
            r2.add(r7)     // Catch:{ all -> 0x00b7 }
            goto L_0x013b
        L_0x0164:
            r2 = 0
        L_0x0165:
            java.lang.String r5 = "Finder.AdInfoPreLoader"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b7 }
            r6.<init>()     // Catch:{ all -> 0x00b7 }
            java.lang.String r7 = "requestIds "
            r6.append(r7)     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x017c
            int r7 = r2.size()     // Catch:{ all -> 0x00b7 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00b7 }
            goto L_0x017d
        L_0x017c:
            r7 = 0
        L_0x017d:
            r6.append(r7)     // Catch:{ all -> 0x00b7 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00b7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x01ac
            boolean r5 = r2.isEmpty()     // Catch:{ all -> 0x00b7 }
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x0191
            goto L_0x0192
        L_0x0191:
            r2 = 0
        L_0x0192:
            if (r2 == 0) goto L_0x01ac
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r3.mo77377x()     // Catch:{ all -> 0x00b7 }
            r5 = 1000(0x3e8, float:1.401E-42)
            r4.removeMessages(r5)     // Catch:{ all -> 0x00b7 }
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r3.mo77377x()     // Catch:{ all -> 0x00b7 }
            com.tencent.mm.sdk.platformtools.MMHandler r6 = r3.mo77377x()     // Catch:{ all -> 0x00b7 }
            android.os.Message r2 = r6.obtainMessage(r5, r2)     // Catch:{ all -> 0x00b7 }
            r4.sendMessage(r2)     // Catch:{ all -> 0x00b7 }
        L_0x01ac:
            java.lang.String r2 = "Finder.AdInfoPreLoader"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b7 }
            r4.<init>()     // Catch:{ all -> 0x00b7 }
            java.lang.String r5 = "scrollRequest commentScene:"
            r4.append(r5)     // Catch:{ all -> 0x00b7 }
            int r5 = r3.mo77376w()     // Catch:{ all -> 0x00b7 }
            r4.append(r5)     // Catch:{ all -> 0x00b7 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00b7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ all -> 0x00b7 }
            rx3.g r2 = r3.f158763a     // Catch:{ all -> 0x00b7 }
            rx3.n r2 = (rx3.C36570n) r2     // Catch:{ all -> 0x00b7 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00b7 }
            pf1.n r2 = (pf1.C62273n) r2     // Catch:{ all -> 0x00b7 }
            int r4 = r3.mo77376w()     // Catch:{ all -> 0x00b7 }
            r2.mo87344m3(r0, r4)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r3)
            return
        L_0x01d9:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.C55768i.run():void");
    }
}
