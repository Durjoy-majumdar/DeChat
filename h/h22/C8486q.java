package h22;

import com.tencent.p014mm.autogen.events.FinderTeenModeChangeEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: h22.q */
public final class C8486q extends IStaticListener<FinderTeenModeChangeEvent> {
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r19) {
        /*
            r18 = this;
            r0 = r19
            com.tencent.mm.autogen.events.FinderTeenModeChangeEvent r0 = (com.tencent.p014mm.autogen.events.FinderTeenModeChangeEvent) r0
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r1 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            java.lang.String r2 = "MicroMsg.FinderTeenModeEventListener"
            java.lang.String r3 = "event"
            gy3.C87412m.m108594g(r0, r3)
            r3 = 1
            r4 = 0
            r5 = 0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x004b }
            java.lang.String r6 = "activity"
            java.lang.Object r0 = r0.getSystemService(r6)     // Catch:{ all -> 0x004b }
            boolean r6 = r0 instanceof android.app.ActivityManager     // Catch:{ all -> 0x004b }
            if (r6 == 0) goto L_0x0021
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ all -> 0x004b }
            goto L_0x0022
        L_0x0021:
            r0 = r5
        L_0x0022:
            if (r0 == 0) goto L_0x0055
            java.util.List r0 = r0.getRunningTasks(r3)     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)     // Catch:{ all -> 0x004b }
            android.app.ActivityManager$RunningTaskInfo r0 = (android.app.ActivityManager.RunningTaskInfo) r0     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0055
            android.content.ComponentName r0 = r0.baseActivity     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = r0.getClassName()     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0055
            java.lang.Class<com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI> r6 = com.tencent.p014mm.plugin.finder.p056ui.FinderHomeAffinityUI.class
            ny3.d r6 = gy3.C24560g0.m30725a(r6)     // Catch:{ all -> 0x004b }
            java.lang.String r6 = r6.mo51262e()     // Catch:{ all -> 0x004b }
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x004b }
            goto L_0x0056
        L_0x004b:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r4] = r0
            java.lang.String r0 = "FinderTeenModeEventListener callback: ams is dead"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r6)
        L_0x0055:
            r0 = 0
        L_0x0056:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "finderTeenModeEvent: teen mode change， isFinderTaskForeground = "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            if (r0 != 0) goto L_0x007c
            java.lang.Class<ht1.t3> r0 = ht1.C60204t3.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r2 = "getService(IFinderMultiTaskService::class.java)"
            gy3.C87412m.m108593f(r0, r2)
            ht1.t3 r0 = (ht1.C60204t3) r0
            ht1.C60204t3.C8805a.m8622a(r0, r4, r3, r5)
        L_0x007c:
            di3.d r0 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            r0.getClass()
            java.lang.Class<ky2.i> r2 = ky2.C10432i.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ky2.i r2 = (ky2.C10432i) r2
            boolean r2 = r2.mo10750e()
            if (r2 == 0) goto L_0x01cd
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r6 = r2.mo62446e(r1)
            java.lang.Class<com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore> r7 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class
            androidx.lifecycle.i0 r6 = r6.mo75002a(r7)
            com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore r6 = (com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) r6
            java.util.List<do1.h> r6 = r6.f160333e
            java.util.Iterator r6 = r6.iterator()
        L_0x00a7:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b9
            java.lang.Object r7 = r6.next()
            do1.h r7 = (do1.C58341h) r7
            java.lang.String r8 = "clearAllCache"
            r7.mo83089e(r3, r8)
            goto L_0x00a7
        L_0x00b9:
            vp1.o$a r6 = vp1.C14937o.f40972a
            r6.mo13982c()
            vp1.e r6 = vp1.C65834e.f189316a
            r6.getClass()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "cacheItems size "
            r6.append(r7)
            com.tencent.mm.sdk.platformtools.ConcurrentLruCache<java.lang.Long, com.tencent.mm.plugin.finder.storage.FinderItem> r7 = vp1.C65834e.f189317b
            int r8 = r7.size()
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "Finder.FinderCache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
            r7.clear()
            java.util.HashMap<java.lang.Integer, android.util.LongSparseArray<java.lang.Long>> r6 = vp1.C65834e.f189318c
            r6.clear()
            bl3.r$a r6 = r2.mo62446e(r1)
            java.lang.Class<os1.f> r7 = os1.C11739f.class
            androidx.lifecycle.i0 r6 = r6.mo75002a(r7)
            os1.f r6 = (os1.C11739f) r6
            r6.mo11605i3()
            bl3.r$a r1 = r2.mo62446e(r1)
            java.lang.Class<os1.w> r2 = os1.C11759w.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            os1.w r1 = (os1.C11759w) r1
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, os1.w$a> r2 = r1.f34424e
            r2.clear()
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, os1.w$b> r2 = r1.f34425f
            r2.clear()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, it1.k<ob0.y>> r1 = r1.f34426g
            r1.clear()
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = r0.Nt0()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.tencent.mm.plugin.finder.extension.reddot.s0>> r1 = r0.f158543t
            java.util.Enumeration r1 = r1.keys()
            java.lang.String r2 = "pathToCtrInfoMap.keys()"
            gy3.C87412m.m108593f(r1, r2)
            java.util.ArrayList r1 = java.util.Collections.list(r1)
            java.lang.String r2 = "list(this)"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "resetNotifyAllPathWithCrlInfo#reset, list:"
            r2.append(r6)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "Finder.RedDotManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            java.util.HashMap r2 = new java.util.HashMap
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.tencent.mm.plugin.finder.extension.reddot.s0>> r6 = r0.f158543t
            r2.<init>(r6)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.tencent.mm.plugin.finder.extension.reddot.s0>> r0 = r0.f158543t
            r0.clear()
            java.util.Iterator r0 = r1.iterator()
        L_0x014f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01c2
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r6 = r2.get(r1)
            java.util.List r6 = (java.util.List) r6
            java.lang.String r7 = "path"
            if (r6 == 0) goto L_0x018e
            int r8 = r6.size()
            java.util.ListIterator r6 = r6.listIterator(r8)
        L_0x016d:
            boolean r8 = r6.hasPrevious()
            if (r8 == 0) goto L_0x0189
            java.lang.Object r8 = r6.previous()
            r9 = r8
            com.tencent.mm.plugin.finder.extension.reddot.s0 r9 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r9
            gy3.C87412m.m108593f(r1, r7)
            te3.nn1 r9 = r9.mo77308o2(r1)
            if (r9 == 0) goto L_0x0185
            r9 = 1
            goto L_0x0186
        L_0x0185:
            r9 = 0
        L_0x0186:
            if (r9 == 0) goto L_0x016d
            goto L_0x018a
        L_0x0189:
            r8 = r5
        L_0x018a:
            com.tencent.mm.plugin.finder.extension.reddot.s0 r8 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r8
            r14 = r8
            goto L_0x018f
        L_0x018e:
            r14 = r5
        L_0x018f:
            com.tencent.mm.plugin.finder.extension.reddot.n0 r6 = com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.f12955a
            r8 = 0
            gy3.C87412m.m108593f(r1, r7)
            if (r14 == 0) goto L_0x019d
            te3.nn1 r7 = r14.mo77308o2(r1)
            r9 = r7
            goto L_0x019e
        L_0x019d:
            r9 = r5
        L_0x019e:
            r11 = 0
            r12 = 16
            r13 = 0
            r7 = r8
            r8 = r1
            r10 = r14
            com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.m2356f(r6, r7, r8, r9, r10, r11, r12, r13)
            dp1.v0 r9 = dp1.C58413v0.f167346a
            if (r14 == 0) goto L_0x01b2
            te3.nn1 r1 = r14.mo77308o2(r1)
            r11 = r1
            goto L_0x01b3
        L_0x01b2:
            r11 = r5
        L_0x01b3:
            r12 = 11
            r13 = 0
            r6 = 0
            r16 = 24
            r17 = 0
            r10 = r14
            r14 = r6
            dp1.C58413v0.m67783l(r9, r10, r11, r12, r13, r14, r16, r17)
            goto L_0x014f
        L_0x01c2:
            java.lang.Class<ht1.v1> r0 = ht1.C60208v1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.v1 r0 = (ht1.C60208v1) r0
            r0.mo78706TU()
        L_0x01cd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h22.C8486q.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
