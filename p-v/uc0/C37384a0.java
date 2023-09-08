package uc0;

import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: uc0.a0 */
public class C37384a0 extends IStaticListener<PostSyncTaskEvent> {
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r12) {
        /*
            r11 = this;
            com.tencent.mm.autogen.events.PostSyncTaskEvent r12 = (com.tencent.p014mm.autogen.events.PostSyncTaskEvent) r12
            f40.e r12 = f40.C86709a0.m107523b()
            boolean r12 = r12.mo121114l()
            r0 = 1
            r1 = 0
            if (r12 == 0) goto L_0x0019
            f40.C86709a0.m107523b()
            boolean r12 = f40.C86718e.m107551r()
            if (r12 != 0) goto L_0x0019
            r12 = 1
            goto L_0x001a
        L_0x0019:
            r12 = 0
        L_0x001a:
            java.lang.String r2 = "MicroMsg.PostTaskReportEgg"
            if (r12 == 0) goto L_0x0122
            f40.o r12 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r12 = r12.mo121142i()
            r3 = 0
            r4 = 68097(0x10a01, float:9.5424E-41)
            java.lang.Object r12 = r12.mo119684e(r4, r3)
            java.lang.Long r12 = (java.lang.Long) r12
            r5 = 0
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Long) r12, (long) r5)
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r5)
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 <= 0) goto L_0x0047
            r12 = 1
            goto L_0x0048
        L_0x0047:
            r12 = 0
        L_0x0048:
            if (r12 == 0) goto L_0x0122
            java.util.LinkedList r12 = new java.util.LinkedList
            r12.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            f40.o r5 = f40.C86709a0.m107535s()
            java.lang.String r5 = r5.f251807e
            r3.append(r5)
            java.lang.String r5 = "eggresult.rep"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r6 = -1
            byte[] r3 = com.tencent.p014mm.vfs.C86013q1.m106433O(r3, r1, r6)
            if (r3 != 0) goto L_0x006f
            goto L_0x0127
        L_0x006f:
            uc0.k r6 = new uc0.k     // Catch:{ Exception -> 0x00f8 }
            r6.<init>()     // Catch:{ Exception -> 0x00f8 }
            pe3.a r3 = r6.parseFrom(r3)     // Catch:{ Exception -> 0x00f8 }
            uc0.k r3 = (uc0.C52519k) r3     // Catch:{ Exception -> 0x00f8 }
            java.util.LinkedList<uc0.j> r3 = r3.f146686d     // Catch:{ Exception -> 0x00f8 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x00f8 }
        L_0x0080:
            boolean r6 = r3.hasNext()     // Catch:{ Exception -> 0x00f8 }
            if (r6 == 0) goto L_0x00df
            java.lang.Object r6 = r3.next()     // Catch:{ Exception -> 0x00f8 }
            uc0.j r6 = (uc0.C52518j) r6     // Catch:{ Exception -> 0x00f8 }
            int r7 = r6.f146684e     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r8 = ","
            if (r7 == 0) goto L_0x00b6
            te3.ul2 r7 = new te3.ul2     // Catch:{ Exception -> 0x00f8 }
            r7.<init>()     // Catch:{ Exception -> 0x00f8 }
            r9 = 17
            r7.f185759d = r9     // Catch:{ Exception -> 0x00f8 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f8 }
            r9.<init>()     // Catch:{ Exception -> 0x00f8 }
            int r10 = r6.f146683d     // Catch:{ Exception -> 0x00f8 }
            r9.append(r10)     // Catch:{ Exception -> 0x00f8 }
            r9.append(r8)     // Catch:{ Exception -> 0x00f8 }
            int r10 = r6.f146684e     // Catch:{ Exception -> 0x00f8 }
            r9.append(r10)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00f8 }
            r7.f185760e = r9     // Catch:{ Exception -> 0x00f8 }
            r12.add(r7)     // Catch:{ Exception -> 0x00f8 }
        L_0x00b6:
            int r7 = r6.f146685f     // Catch:{ Exception -> 0x00f8 }
            if (r7 == 0) goto L_0x0080
            te3.ul2 r7 = new te3.ul2     // Catch:{ Exception -> 0x00f8 }
            r7.<init>()     // Catch:{ Exception -> 0x00f8 }
            r9 = 18
            r7.f185759d = r9     // Catch:{ Exception -> 0x00f8 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f8 }
            r9.<init>()     // Catch:{ Exception -> 0x00f8 }
            int r10 = r6.f146683d     // Catch:{ Exception -> 0x00f8 }
            r9.append(r10)     // Catch:{ Exception -> 0x00f8 }
            r9.append(r8)     // Catch:{ Exception -> 0x00f8 }
            int r6 = r6.f146685f     // Catch:{ Exception -> 0x00f8 }
            r9.append(r6)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r6 = r9.toString()     // Catch:{ Exception -> 0x00f8 }
            r7.f185760e = r6     // Catch:{ Exception -> 0x00f8 }
            r12.add(r7)     // Catch:{ Exception -> 0x00f8 }
            goto L_0x0080
        L_0x00df:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f8 }
            r3.<init>()     // Catch:{ Exception -> 0x00f8 }
            f40.o r6 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r6 = r6.f251807e     // Catch:{ Exception -> 0x00f8 }
            r3.append(r6)     // Catch:{ Exception -> 0x00f8 }
            r3.append(r5)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00f8 }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r3)     // Catch:{ Exception -> 0x00f8 }
            goto L_0x0106
        L_0x00f8:
            r3 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r3)
            r0[r1] = r3
            java.lang.String r3 = "exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r0)
        L_0x0106:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0122
            eb0.C116756s5.m164690c(r12)
            f40.o r12 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r12 = r12.mo121142i()
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r12.mo119676J(r4, r0)
        L_0x0122:
            java.lang.String r12 = "report egg done"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r12)
        L_0x0127:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uc0.C37384a0.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
