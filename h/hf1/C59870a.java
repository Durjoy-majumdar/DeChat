package hf1;

import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import os1.C11739f;
import te3.C64586nn1;

/* renamed from: hf1.a */
public final class C59870a implements C59872b {

    /* renamed from: a */
    public final FinderRedDotManager f170934a;

    /* renamed from: b */
    public final C11739f f170935b;

    /* renamed from: hf1.a$a */
    public static final class C59871a extends C87413o implements C32226l<C64586nn1, Boolean> {

        /* renamed from: d */
        public static final C59871a f170936d = new C59871a();

        public C59871a() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(C87412m.m108589b(((C64586nn1) obj).f184507i, "FinderEntrance"));
        }
    }

    public C59870a(FinderRedDotManager finderRedDotManager) {
        C87412m.m108594g(finderRedDotManager, "manager");
        this.f170934a = finderRedDotManager;
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…meTabStateVM::class.java)");
        this.f170935b = (C11739f) a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:0x02ad A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x016b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0 mo84825a(hf1.C59872b.C59874b r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.String r2 = "chain"
            gy3.C87412m.m108594g(r0, r2)
            te3.xi1 r2 = r17.mo84827b()
            int r3 = r2.f144670e
            r4 = 17
            r5 = 16
            r6 = 13
            r7 = 9
            r8 = 8
            r9 = 7
            if (r3 == r9) goto L_0x0028
            if (r3 == r8) goto L_0x0028
            if (r3 == r7) goto L_0x0028
            if (r3 == r6) goto L_0x0028
            if (r3 == r5) goto L_0x0028
            if (r3 == r4) goto L_0x0028
            goto L_0x02af
        L_0x0028:
            boolean r10 = com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager.f158523z
            r11 = 0
            if (r10 == 0) goto L_0x0038
            java.util.LinkedList<te3.nn1> r10 = r2.f144672g
            if (r10 == 0) goto L_0x0036
            hf1.a$a r12 = hf1.C59870a.C59871a.f170936d
            sx3.C64175a0.m75512t(r10, r12)
        L_0x0036:
            com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager.f158523z = r11
        L_0x0038:
            java.lang.Class<tf0.p1> r10 = tf0.C64916p1.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            tf0.p1 r10 = (tf0.C64916p1) r10
            boolean r10 = r10.mo59665N()
            java.util.LinkedList<te3.nn1> r12 = r2.f144672g
            r13 = 0
            if (r12 == 0) goto L_0x0080
            java.util.Iterator r12 = r12.iterator()
        L_0x004d:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x0080
            java.lang.Object r14 = r12.next()
            te3.nn1 r14 = (te3.C64586nn1) r14
            if (r10 == 0) goto L_0x004d
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r15 = r1.f170934a
            java.util.concurrent.ConcurrentSkipListSet<java.lang.String> r15 = r15.f158530g
            java.lang.String r14 = r14.f184507i
            boolean r14 = r15.contains(r14)
            if (r14 == 0) goto L_0x004d
            java.lang.String r0 = "Finder.FilterTabTipInterceptor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[filterNotifyTabTip] FinderFriendTabLikeTipsView isShowing, ignore this tabTip "
            r3.append(r4)
            java.lang.String r2 = r2.f144673h
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            return r13
        L_0x0080:
            int r10 = r2.f144676n
            if (r10 <= 0) goto L_0x00f7
            os1.f r12 = r1.f170935b
            int r14 = r12.f34363j
            int r15 = r12.f34362i
            boolean r10 = r12.mo11603f3(r10)
            java.lang.String r12 = "Finder.FilterTabTipInterceptor"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r5 = "[filterNotifyTabTip] currentTabType="
            r11.append(r5)
            r11.append(r15)
            java.lang.String r5 = " lastTabType="
            r11.append(r5)
            r11.append(r14)
            java.lang.String r5 = "  ignore_tab_type="
            r11.append(r5)
            int r5 = r2.f144676n
            r11.append(r5)
            java.lang.String r5 = " isAutoRefresh="
            r11.append(r5)
            r11.append(r10)
            java.lang.String r5 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)
            boolean r5 = r2.f144677o
            if (r5 == 0) goto L_0x00f7
            if (r15 > 0) goto L_0x00ca
            int r5 = r2.f144676n
            if (r5 != r14) goto L_0x00ca
            if (r10 == 0) goto L_0x00ce
        L_0x00ca:
            int r5 = r2.f144676n
            if (r15 != r5) goto L_0x00f7
        L_0x00ce:
            java.lang.String r0 = "Finder.FilterTabTipInterceptor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[filterNotifyTabTip] remove this ctrlInfo type="
            r3.append(r4)
            int r2 = r2.f144670e
            r3.append(r2)
            java.lang.String r2 = " currentTabType="
            r3.append(r2)
            r3.append(r15)
            java.lang.String r2 = " lastTabType="
            r3.append(r2)
            r3.append(r14)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            return r13
        L_0x00f7:
            java.util.LinkedList<te3.nn1> r5 = r2.f144672g
            r11 = 1
            if (r5 == 0) goto L_0x014e
            java.util.Iterator r5 = r5.iterator()
            r12 = 0
        L_0x0101:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto L_0x014e
            java.lang.Object r14 = r5.next()
            te3.nn1 r14 = (te3.C64586nn1) r14
            java.lang.String r15 = "Finder.FilterTabTipInterceptor"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "[filterNotifyTabTip] path:"
            r10.append(r13)
            java.lang.String r13 = r14.f184507i
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r10)
            java.lang.String r10 = r14.f184507i
            java.lang.String r13 = "FinderEntrance"
            boolean r10 = gy3.C87412m.m108589b(r10, r13)
            if (r10 != 0) goto L_0x0146
            java.lang.String r10 = r14.f184507i
            java.lang.String r13 = "NearbyEntrance"
            boolean r10 = gy3.C87412m.m108589b(r10, r13)
            if (r10 != 0) goto L_0x0146
            java.lang.String r10 = r14.f184507i
            java.lang.String r13 = "FinderLiveEntrance"
            boolean r10 = gy3.C87412m.m108589b(r10, r13)
            if (r10 == 0) goto L_0x0144
            goto L_0x0146
        L_0x0144:
            r10 = 0
            goto L_0x0147
        L_0x0146:
            r10 = 1
        L_0x0147:
            if (r10 == 0) goto L_0x014a
            goto L_0x014f
        L_0x014a:
            int r12 = r12 + 1
            r13 = 0
            goto L_0x0101
        L_0x014e:
            r12 = -1
        L_0x014f:
            if (r12 < 0) goto L_0x016b
            java.lang.String r3 = "Finder.FilterTabTipInterceptor"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[filterNotifyTabTip] has FINDER_ENTRANCE or NEARBY_ENTRANCE or FINDER_LIVE_ENTRANCE type="
            r4.append(r5)
            int r5 = r2.f144670e
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            goto L_0x02ab
        L_0x016b:
            if (r3 == r8) goto L_0x024d
            if (r3 != r7) goto L_0x0171
            goto L_0x024d
        L_0x0171:
            if (r3 == r9) goto L_0x01ea
            if (r3 == r6) goto L_0x01ea
            if (r3 != r4) goto L_0x0179
            goto L_0x01ea
        L_0x0179:
            r5 = 16
            if (r3 != r5) goto L_0x01e7
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r3 = r1.f170934a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.tencent.mm.plugin.finder.extension.reddot.s0>> r3 = r3.f158543t
            vc1.b r4 = vc1.C37715b.f99914a
            boolean r4 = r4.mo61298a()
            if (r4 == 0) goto L_0x018c
            java.lang.String r4 = "FinderLiveEntrance"
            goto L_0x018e
        L_0x018c:
            java.lang.String r4 = "NearbyEntrance"
        L_0x018e:
            java.lang.Object r3 = r3.get(r4)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x01c0
            monitor-enter(r3)
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x01bd }
            r5 = 0
        L_0x019c:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x01bd }
            if (r6 == 0) goto L_0x01ba
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x01bd }
            com.tencent.mm.plugin.finder.extension.reddot.s0 r6 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r6     // Catch:{ all -> 0x01bd }
            te3.xi1 r6 = r6.field_ctrInfo     // Catch:{ all -> 0x01bd }
            int r6 = r6.f144670e     // Catch:{ all -> 0x01bd }
            r7 = 16
            if (r6 != r7) goto L_0x01b2
            r6 = 1
            goto L_0x01b3
        L_0x01b2:
            r6 = 0
        L_0x01b3:
            if (r6 == 0) goto L_0x01b7
            r10 = r5
            goto L_0x01bb
        L_0x01b7:
            int r5 = r5 + 1
            goto L_0x019c
        L_0x01ba:
            r10 = -1
        L_0x01bb:
            monitor-exit(r3)
            goto L_0x01c1
        L_0x01bd:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01c0:
            r10 = -1
        L_0x01c1:
            if (r10 < 0) goto L_0x01c5
            r3 = 1
            goto L_0x01c6
        L_0x01c5:
            r3 = 0
        L_0x01c6:
            java.lang.String r4 = "Finder.FilterTabTipInterceptor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[filterNotifyTabTip] ignore["
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = "] this tabTip type="
            r5.append(r6)
            int r6 = r2.f144670e
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            goto L_0x024b
        L_0x01e7:
            r11 = 0
            goto L_0x02ab
        L_0x01ea:
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r5 = r1.f170934a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.tencent.mm.plugin.finder.extension.reddot.s0>> r5 = r5.f158543t
            java.lang.String r7 = "FinderEntrance"
            java.lang.Object r5 = r5.get(r7)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x0225
            monitor-enter(r5)
            java.util.Iterator r7 = r5.iterator()     // Catch:{ all -> 0x0222 }
            r8 = 0
        L_0x01fe:
            boolean r10 = r7.hasNext()     // Catch:{ all -> 0x0222 }
            if (r10 == 0) goto L_0x021f
            java.lang.Object r10 = r7.next()     // Catch:{ all -> 0x0222 }
            com.tencent.mm.plugin.finder.extension.reddot.s0 r10 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r10     // Catch:{ all -> 0x0222 }
            te3.xi1 r10 = r10.field_ctrInfo     // Catch:{ all -> 0x0222 }
            int r10 = r10.f144670e     // Catch:{ all -> 0x0222 }
            if (r10 == r9) goto L_0x0217
            if (r3 == r6) goto L_0x0217
            if (r3 != r4) goto L_0x0215
            goto L_0x0217
        L_0x0215:
            r10 = 0
            goto L_0x0218
        L_0x0217:
            r10 = 1
        L_0x0218:
            if (r10 == 0) goto L_0x021c
            r10 = r8
            goto L_0x0220
        L_0x021c:
            int r8 = r8 + 1
            goto L_0x01fe
        L_0x021f:
            r10 = -1
        L_0x0220:
            monitor-exit(r5)
            goto L_0x0226
        L_0x0222:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0225:
            r10 = -1
        L_0x0226:
            if (r10 < 0) goto L_0x022a
            r3 = 1
            goto L_0x022b
        L_0x022a:
            r3 = 0
        L_0x022b:
            java.lang.String r4 = "Finder.FilterTabTipInterceptor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[filterNotifyTabTip] ignore["
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = "] this tabTip type="
            r5.append(r6)
            int r6 = r2.f144670e
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
        L_0x024b:
            r11 = r11 ^ r3
            goto L_0x02ab
        L_0x024d:
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r4 = r1.f170934a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.tencent.mm.plugin.finder.extension.reddot.s0>> r4 = r4.f158543t
            java.lang.String r5 = "FinderEntrance"
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x0286
            monitor-enter(r4)
            java.util.Iterator r5 = r4.iterator()     // Catch:{ all -> 0x0283 }
            r6 = 0
        L_0x0261:
            boolean r9 = r5.hasNext()     // Catch:{ all -> 0x0283 }
            if (r9 == 0) goto L_0x0280
            java.lang.Object r9 = r5.next()     // Catch:{ all -> 0x0283 }
            com.tencent.mm.plugin.finder.extension.reddot.s0 r9 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r9     // Catch:{ all -> 0x0283 }
            te3.xi1 r9 = r9.field_ctrInfo     // Catch:{ all -> 0x0283 }
            int r9 = r9.f144670e     // Catch:{ all -> 0x0283 }
            if (r9 == r8) goto L_0x0278
            if (r9 != r7) goto L_0x0276
            goto L_0x0278
        L_0x0276:
            r9 = 0
            goto L_0x0279
        L_0x0278:
            r9 = 1
        L_0x0279:
            if (r9 == 0) goto L_0x027d
            r10 = r6
            goto L_0x0281
        L_0x027d:
            int r6 = r6 + 1
            goto L_0x0261
        L_0x0280:
            r10 = -1
        L_0x0281:
            monitor-exit(r4)
            goto L_0x0287
        L_0x0283:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0286:
            r10 = -1
        L_0x0287:
            if (r10 < 0) goto L_0x028b
            r4 = 1
            goto L_0x028c
        L_0x028b:
            r4 = 0
        L_0x028c:
            java.lang.String r5 = "Finder.FilterTabTipInterceptor"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "[filterNotifyTabTip] ignore["
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = "] this tabTip type="
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            r11 = r11 ^ r4
        L_0x02ab:
            if (r11 != 0) goto L_0x02af
            r3 = 0
            return r3
        L_0x02af:
            com.tencent.mm.plugin.finder.extension.reddot.s0 r0 = r0.mo84828c(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hf1.C59870a.mo84825a(hf1.b$b):com.tencent.mm.plugin.finder.extension.reddot.s0");
    }
}
