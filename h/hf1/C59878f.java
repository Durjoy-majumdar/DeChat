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

/* renamed from: hf1.f */
public final class C59878f implements C59872b {

    /* renamed from: a */
    public final FinderRedDotManager f170943a;

    /* renamed from: b */
    public final C11739f f170944b;

    /* renamed from: hf1.f$a */
    public static final class C59879a extends C87413o implements C32226l<C64586nn1, Boolean> {

        /* renamed from: d */
        public static final C59879a f170945d = new C59879a();

        public C59879a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = ((C64586nn1) obj).f184507i;
            return Boolean.valueOf(str == null || str.length() == 0);
        }
    }

    /* renamed from: hf1.f$b */
    public static final class C59880b extends C87413o implements C32226l<C64586nn1, Boolean> {

        /* renamed from: d */
        public static final C59880b f170946d = new C59880b();

        public C59880b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C64586nn1 nn12 = (C64586nn1) obj;
            boolean z = true;
            if (nn12.f184514s == 1 || !C87412m.m108589b(nn12.f184507i, "TLFollow")) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public C59878f(FinderRedDotManager finderRedDotManager) {
        C87412m.m108594g(finderRedDotManager, "manager");
        this.f170943a = finderRedDotManager;
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…meTabStateVM::class.java)");
        this.f170944b = (C11739f) a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:200:0x056a  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x056c  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0615  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0617  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x06c1  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x06c3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0 mo84825a(hf1.C59872b.C59874b r23) {
        /*
            r22 = this;
            r1 = r22
            java.lang.Class<ns3.d> r0 = ns3.C11266d.class
            java.lang.String r2 = "chain"
            r3 = r23
            gy3.C87412m.m108594g(r3, r2)
            te3.xi1 r2 = r23.mo84827b()
            java.util.LinkedList<te3.nn1> r4 = r2.f144672g
            if (r4 == 0) goto L_0x0018
            hf1.f$a r5 = hf1.C59878f.C59879a.f170945d
            sx3.C64175a0.m75512t(r4, r5)
        L_0x0018:
            com.tencent.mm.plugin.finder.extension.reddot.q0 r4 = com.tencent.p014mm.plugin.finder.extension.reddot.C55716q0.f158580a
            long r5 = eb0.C31543z5.m39453c()
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_EXIT_FINDER_TL_LONG_SYNC
            r9 = 0
            long r7 = r7.mo119673G(r8, r9)
            long r14 = r5 - r7
            hf1.b$a r5 = r23.mo84826a()
            if (r5 == 0) goto L_0x0039
            r5.getClass()
        L_0x0039:
            java.lang.String r5 = ""
            java.lang.String r6 = "FinderShell"
            boolean r6 = gy3.C87412m.m108589b(r5, r6)
            r16 = 10000(0x2710, double:4.9407E-320)
            if (r6 == 0) goto L_0x0142
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = r1.f170943a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "notifyTabTip#"
            r4.append(r6)
            r4.append(r5)
            java.lang.String r5 = r4.toString()
            r6 = 0
            r7 = 1
            r8 = 0
            r11 = 0
            hf1.b$a r3 = r23.mo84826a()
            if (r3 == 0) goto L_0x0067
            r9 = 0
            r3.getClass()
        L_0x0067:
            r12 = r9
            r18 = 0
            r19 = 164(0xa4, float:2.3E-43)
            r20 = 0
            r3 = r0
            r4 = r2
            r9 = r11
            r10 = r12
            r12 = r18
            r13 = r19
            r0 = r14
            r14 = r20
            com.tencent.mm.plugin.finder.extension.reddot.s0 r3 = ht1.C60152b4.C8759a.m8561a(r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14)
            java.lang.String r4 = "Finder.RedDotManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[notifyTabTip] successfully! ctrlType="
            r5.append(r6)
            if (r3 == 0) goto L_0x0094
            te3.xi1 r6 = r3.field_ctrInfo
            int r6 = r6.f144670e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0095
        L_0x0094:
            r6 = 0
        L_0x0095:
            r5.append(r6)
            java.lang.String r6 = " tabType="
            r5.append(r6)
            if (r3 == 0) goto L_0x00aa
            te3.yi1 r6 = r3.f158585F
            if (r6 == 0) goto L_0x00aa
            int r6 = r6.f186555p
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x00ab
        L_0x00aa:
            r6 = 0
        L_0x00ab:
            r5.append(r6)
            java.lang.String r6 = " isAiRedDot="
            r5.append(r6)
            if (r3 == 0) goto L_0x00c3
            long r6 = r3.field_aiScene
            int r8 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r8 < 0) goto L_0x00bd
            r6 = 1
            goto L_0x00be
        L_0x00bd:
            r6 = 0
        L_0x00be:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x00c4
        L_0x00c3:
            r6 = 0
        L_0x00c4:
            r5.append(r6)
            java.lang.String r6 = " extInfo="
            r5.append(r6)
            pe3.b r6 = r2.f144671f
            if (r6 == 0) goto L_0x00d2
            r6 = 1
            goto L_0x00d3
        L_0x00d2:
            r6 = 0
        L_0x00d3:
            r5.append(r6)
            java.lang.String r6 = " objectId="
            r5.append(r6)
            if (r3 == 0) goto L_0x00e4
            te3.xi1 r6 = r3.field_ctrInfo
            if (r6 == 0) goto L_0x00e4
            long r6 = r6.f144686x
            goto L_0x00e6
        L_0x00e4:
            r6 = 0
        L_0x00e6:
            java.lang.String r6 = o40.C61926c.m72691p(r6)
            r5.append(r6)
            java.lang.String r6 = " diffTime="
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = "ms isInFinder=$ currentTabType="
            r5.append(r0)
            r1 = r22
            os1.f r0 = r1.f170944b
            int r0 = r0.f34362i
            r5.append(r0)
            java.lang.String r0 = " showInfoSize="
            r5.append(r0)
            java.util.LinkedList<te3.nn1> r0 = r2.f144672g
            if (r0 == 0) goto L_0x0111
            int r0 = r0.size()
            goto L_0x0112
        L_0x0111:
            r0 = 0
        L_0x0112:
            r5.append(r0)
            java.lang.String r0 = " tabTipsByPassInfo="
            r5.append(r0)
            if (r3 == 0) goto L_0x0123
            te3.yi1 r0 = r3.f158585F
            if (r0 == 0) goto L_0x0123
            pe3.b r0 = r0.f186553n
            goto L_0x0124
        L_0x0123:
            r0 = 0
        L_0x0124:
            if (r0 == 0) goto L_0x0128
            r0 = 1
            goto L_0x0129
        L_0x0128:
            r0 = 0
        L_0x0129:
            r5.append(r0)
            java.lang.String r0 = " expiredTime="
            r5.append(r0)
            int r0 = r2.f144674i
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            return r3
        L_0x0142:
            r5 = 0
            r6 = 1
            java.lang.String r7 = "Finder.TabTipProcessInterceptor"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "[notifyTabTip] "
            r8.append(r9)
            java.lang.String r4 = r4.mo77303e(r2)
            r8.append(r4)
            java.lang.String r4 = " currentTabType="
            r8.append(r4)
            os1.f r4 = r1.f170944b
            int r4 = r4.f34362i
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            int r4 = r2.f144670e
            java.util.LinkedList<te3.nn1> r7 = r2.f144672g
            if (r7 == 0) goto L_0x0190
            java.util.Iterator r7 = r7.iterator()
        L_0x0174:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x018c
            java.lang.Object r8 = r7.next()
            r9 = r8
            te3.nn1 r9 = (te3.C64586nn1) r9
            java.lang.String r9 = r9.f184507i
            java.lang.String r10 = "FinderEntrance"
            boolean r9 = gy3.C87412m.m108589b(r9, r10)
            if (r9 == 0) goto L_0x0174
            goto L_0x018d
        L_0x018c:
            r8 = 0
        L_0x018d:
            te3.nn1 r8 = (te3.C64586nn1) r8
            goto L_0x0191
        L_0x0190:
            r8 = 0
        L_0x0191:
            r7 = 2
            switch(r4) {
                case 7: goto L_0x0440;
                case 8: goto L_0x03c3;
                case 9: goto L_0x037d;
                case 10: goto L_0x0337;
                case 11: goto L_0x0195;
                case 12: goto L_0x0195;
                case 13: goto L_0x037d;
                case 14: goto L_0x02f1;
                case 15: goto L_0x0195;
                case 16: goto L_0x01db;
                case 17: goto L_0x0197;
                default: goto L_0x0195;
            }
        L_0x0195:
            goto L_0x0484
        L_0x0197:
            if (r8 == 0) goto L_0x019f
            int r8 = r8.f184514s
            if (r8 != r6) goto L_0x019f
            r8 = 1
            goto L_0x01a0
        L_0x019f:
            r8 = 0
        L_0x01a0:
            if (r8 != 0) goto L_0x0484
            com.tencent.mm.plugin.finder.extension.reddot.t0 r8 = com.tencent.p014mm.plugin.finder.extension.reddot.C29945t0.f81101a
            long r9 = r8.mo57013f()
            int r11 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r11 > 0) goto L_0x0484
            com.tencent.mm.plugin.finder.extension.reddot.b0 r9 = com.tencent.p014mm.plugin.finder.extension.reddot.C55708b0.f158567a
            r10 = 0
            com.tencent.p014mm.plugin.finder.extension.reddot.C55708b0.m63389b(r9, r2, r5, r7, r10)
            java.lang.String r5 = "Finder.TabTipProcessInterceptor"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "[notifyTabTip] diffTime="
            r7.append(r9)
            r7.append(r14)
            java.lang.String r9 = "ms, moreTabFriendEntranceTimeMs="
            r7.append(r9)
            long r8 = r8.mo57013f()
            r7.append(r8)
            java.lang.String r8 = "ms, remove entrance path red dot"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r7)
            goto L_0x0484
        L_0x01db:
            r5 = 0
            vc1.b r7 = vc1.C37715b.f99914a
            boolean r7 = r7.mo61298a()
            if (r7 != 0) goto L_0x0269
            java.util.LinkedList<te3.nn1> r7 = r2.f144672g
            if (r7 == 0) goto L_0x0206
            java.util.Iterator r7 = r7.iterator()
        L_0x01ec:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0204
            java.lang.Object r8 = r7.next()
            r9 = r8
            te3.nn1 r9 = (te3.C64586nn1) r9
            java.lang.String r9 = r9.f184507i
            java.lang.String r10 = "NearbyEntrance"
            boolean r9 = gy3.C87412m.m108589b(r9, r10)
            if (r9 == 0) goto L_0x01ec
            r5 = r8
        L_0x0204:
            te3.nn1 r5 = (te3.C64586nn1) r5
        L_0x0206:
            long r7 = eb0.C31543z5.m39453c()
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            com.tencent.mm.storage.y1$a r10 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_EXIT_NEARBY_LONG_SYNC
            r11 = 0
            long r9 = r9.mo119673G(r10, r11)
            long r7 = r7 - r9
            if (r5 == 0) goto L_0x0223
            int r5 = r5.f184514s
            if (r5 != r6) goto L_0x0223
            r5 = 1
            goto L_0x0224
        L_0x0223:
            r5 = 0
        L_0x0224:
            if (r5 != 0) goto L_0x0484
            com.tencent.mm.plugin.finder.extension.reddot.t0 r5 = com.tencent.p014mm.plugin.finder.extension.reddot.C29945t0.f81101a
            long r9 = r5.mo57016i()
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0238
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r9 = r1.f170943a
            boolean r9 = r9.mo77229H5()
            if (r9 != 0) goto L_0x0484
        L_0x0238:
            if1.a r9 = if1.C60276a.f171840a
            r9.mo85255d(r2)
            r9.mo85254c(r2)
            java.lang.String r9 = "Finder.TabTipProcessInterceptor"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "[notifyTabTip] diffTime="
            r10.append(r11)
            r10.append(r7)
            java.lang.String r7 = "ms, moreTabNearbyEntranceTimeMs="
            r10.append(r7)
            long r7 = r5.mo57016i()
            r10.append(r7)
            java.lang.String r5 = "ms, remove entrance path red dot"
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r5)
            goto L_0x0484
        L_0x0269:
            r7 = 0
            java.util.LinkedList<te3.nn1> r5 = r2.f144672g
            if (r5 == 0) goto L_0x028f
            java.util.Iterator r5 = r5.iterator()
        L_0x0273:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x028b
            java.lang.Object r9 = r5.next()
            r10 = r9
            te3.nn1 r10 = (te3.C64586nn1) r10
            java.lang.String r10 = r10.f184507i
            java.lang.String r11 = "FinderLiveEntrance"
            boolean r10 = gy3.C87412m.m108589b(r10, r11)
            if (r10 == 0) goto L_0x0273
            goto L_0x028c
        L_0x028b:
            r9 = 0
        L_0x028c:
            te3.nn1 r9 = (te3.C64586nn1) r9
            goto L_0x0290
        L_0x028f:
            r9 = 0
        L_0x0290:
            long r10 = eb0.C31543z5.m39453c()
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            com.tencent.mm.storage.y1$a r12 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_EXIT_FINDER_LIVE_SQUARE_LONG_SYNC
            long r7 = r5.mo119673G(r12, r7)
            long r10 = r10 - r7
            if (r9 == 0) goto L_0x02ab
            int r5 = r9.f184514s
            if (r5 != r6) goto L_0x02ab
            r5 = 1
            goto L_0x02ac
        L_0x02ab:
            r5 = 0
        L_0x02ac:
            if (r5 != 0) goto L_0x0484
            com.tencent.mm.plugin.finder.extension.reddot.t0 r5 = com.tencent.p014mm.plugin.finder.extension.reddot.C29945t0.f81101a
            long r7 = r5.mo57009b()
            int r9 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x02c0
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r7 = r1.f170943a
            boolean r7 = r7.mo77235K5()
            if (r7 != 0) goto L_0x0484
        L_0x02c0:
            if1.a r7 = if1.C60276a.f171840a
            r7.mo85252a(r2)
            r7.mo85254c(r2)
            java.lang.String r7 = "Finder.TabTipProcessInterceptor"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "[notifyTabTip] diffTime="
            r8.append(r9)
            r8.append(r10)
            java.lang.String r9 = "ms, finderLiveEntranceEntranceTimeMs="
            r8.append(r9)
            long r9 = r5.mo57009b()
            r8.append(r9)
            java.lang.String r5 = "ms, remove entrance path red dot"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r5)
            goto L_0x0484
        L_0x02f1:
            if (r8 == 0) goto L_0x02f9
            int r5 = r8.f184514s
            if (r5 != r6) goto L_0x02f9
            r5 = 1
            goto L_0x02fa
        L_0x02f9:
            r5 = 0
        L_0x02fa:
            if (r5 != 0) goto L_0x0484
            com.tencent.mm.plugin.finder.extension.reddot.t0 r5 = com.tencent.p014mm.plugin.finder.extension.reddot.C29945t0.f81101a
            long r7 = r5.mo57017j()
            int r9 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0484
            com.tencent.mm.plugin.finder.extension.reddot.b0 r7 = com.tencent.p014mm.plugin.finder.extension.reddot.C55708b0.f158567a
            r8 = 2
            r9 = 0
            r10 = 0
            com.tencent.p014mm.plugin.finder.extension.reddot.C55708b0.m63389b(r7, r2, r10, r8, r9)
            java.lang.String r7 = "Finder.TabTipProcessInterceptor"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "[notifyTabTip] diffTime="
            r8.append(r9)
            r8.append(r14)
            java.lang.String r9 = "ms, moreTabHotEntranceTimeMs="
            r8.append(r9)
            long r9 = r5.mo57017j()
            r8.append(r9)
            java.lang.String r5 = "ms, remove entrance path red dot"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r5)
            goto L_0x0484
        L_0x0337:
            if (r8 == 0) goto L_0x033f
            int r5 = r8.f184514s
            if (r5 != r6) goto L_0x033f
            r5 = 1
            goto L_0x0340
        L_0x033f:
            r5 = 0
        L_0x0340:
            if (r5 != 0) goto L_0x0484
            com.tencent.mm.plugin.finder.extension.reddot.t0 r5 = com.tencent.p014mm.plugin.finder.extension.reddot.C29945t0.f81101a
            long r7 = r5.mo57014g()
            int r9 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0484
            com.tencent.mm.plugin.finder.extension.reddot.b0 r7 = com.tencent.p014mm.plugin.finder.extension.reddot.C55708b0.f158567a
            r8 = 2
            r9 = 0
            r10 = 0
            com.tencent.p014mm.plugin.finder.extension.reddot.C55708b0.m63389b(r7, r2, r10, r8, r9)
            java.lang.String r7 = "Finder.TabTipProcessInterceptor"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "[notifyTabTip] diffTime="
            r8.append(r9)
            r8.append(r14)
            java.lang.String r9 = "ms, moreTabHotEntranceTimeMs="
            r8.append(r9)
            long r9 = r5.mo57014g()
            r8.append(r9)
            java.lang.String r5 = "ms, remove entrance path red dot"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r5)
            goto L_0x0484
        L_0x037d:
            if (r8 == 0) goto L_0x0385
            int r5 = r8.f184514s
            if (r5 != r6) goto L_0x0385
            r5 = 1
            goto L_0x0386
        L_0x0385:
            r5 = 0
        L_0x0386:
            if (r5 != 0) goto L_0x0484
            com.tencent.mm.plugin.finder.extension.reddot.t0 r5 = com.tencent.p014mm.plugin.finder.extension.reddot.C29945t0.f81101a
            long r7 = r5.mo57015h()
            int r9 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0484
            com.tencent.mm.plugin.finder.extension.reddot.b0 r7 = com.tencent.p014mm.plugin.finder.extension.reddot.C55708b0.f158567a
            r8 = 2
            r9 = 0
            r10 = 0
            com.tencent.p014mm.plugin.finder.extension.reddot.C55708b0.m63389b(r7, r2, r10, r8, r9)
            java.lang.String r7 = "Finder.TabTipProcessInterceptor"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "[notifyTabTip] diffTime="
            r8.append(r9)
            r8.append(r14)
            java.lang.String r9 = "ms, moreTabLiveEntranceTimeMs="
            r8.append(r9)
            long r9 = r5.mo57015h()
            r8.append(r9)
            java.lang.String r5 = "ms, remove entrance path red dot"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r5)
            goto L_0x0484
        L_0x03c3:
            com.tencent.mm.plugin.finder.extension.reddot.t0 r5 = com.tencent.p014mm.plugin.finder.extension.reddot.C29945t0.f81101a
            long r9 = r5.mo57011d()
            int r7 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r7 > 0) goto L_0x03fd
            java.util.LinkedList<te3.nn1> r7 = r2.f144672g
            if (r7 == 0) goto L_0x03d6
            hf1.f$b r9 = hf1.C59878f.C59880b.f170946d
            o40.C61926c.m72675T(r7, r9)
        L_0x03d6:
            java.lang.String r7 = "Finder.TabTipProcessInterceptor"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "[notifyTabTip] diffTime="
            r9.append(r10)
            r9.append(r14)
            java.lang.String r10 = "ms, moreTabFollowTabTimeMs="
            r9.append(r10)
            long r10 = r5.mo57011d()
            r9.append(r10)
            java.lang.String r10 = "ms, remove this ctrInfo"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r9)
        L_0x03fd:
            if (r8 == 0) goto L_0x0405
            int r7 = r8.f184514s
            if (r7 != r6) goto L_0x0405
            r7 = 1
            goto L_0x0406
        L_0x0405:
            r7 = 0
        L_0x0406:
            if (r7 != 0) goto L_0x0484
            long r7 = r5.mo57010c()
            int r9 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0484
            com.tencent.mm.plugin.finder.extension.reddot.b0 r7 = com.tencent.p014mm.plugin.finder.extension.reddot.C55708b0.f158567a
            r8 = 2
            r9 = 0
            r10 = 0
            com.tencent.p014mm.plugin.finder.extension.reddot.C55708b0.m63389b(r7, r2, r10, r8, r9)
            java.lang.String r7 = "Finder.TabTipProcessInterceptor"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "[notifyTabTip] diffTime="
            r8.append(r9)
            r8.append(r14)
            java.lang.String r9 = "ms, moreTabFollowTabTimeMs="
            r8.append(r9)
            long r9 = r5.mo57010c()
            r8.append(r9)
            java.lang.String r5 = "ms, remove entrance path red dot"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r5)
            goto L_0x0484
        L_0x0440:
            if (r8 == 0) goto L_0x0448
            int r5 = r8.f184514s
            if (r5 != r6) goto L_0x0448
            r5 = 1
            goto L_0x0449
        L_0x0448:
            r5 = 0
        L_0x0449:
            if (r5 != 0) goto L_0x0484
            com.tencent.mm.plugin.finder.extension.reddot.t0 r5 = com.tencent.p014mm.plugin.finder.extension.reddot.C29945t0.f81101a
            long r7 = r5.mo57012e()
            int r9 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0484
            com.tencent.mm.plugin.finder.extension.reddot.b0 r7 = com.tencent.p014mm.plugin.finder.extension.reddot.C55708b0.f158567a
            r8 = 2
            r9 = 0
            r10 = 0
            com.tencent.p014mm.plugin.finder.extension.reddot.C55708b0.m63389b(r7, r2, r10, r8, r9)
            java.lang.String r7 = "Finder.TabTipProcessInterceptor"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "[notifyTabTip] diffTime="
            r8.append(r9)
            r8.append(r14)
            java.lang.String r9 = "ms, moreTabFriendEntranceTimeMs="
            r8.append(r9)
            long r9 = r5.mo57012e()
            r8.append(r9)
            java.lang.String r5 = "ms, remove entrance path red dot"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r5)
        L_0x0484:
            java.lang.Class<tf0.p1> r5 = tf0.C64916p1.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            tf0.p1 r5 = (tf0.C64916p1) r5
            boolean r13 = r5.mo59665N()
            if (r13 == 0) goto L_0x04be
            com.tencent.mm.plugin.finder.extension.reddot.b0 r5 = com.tencent.p014mm.plugin.finder.extension.reddot.C55708b0.f158567a
            r7 = 2
            r8 = 0
            r9 = 0
            com.tencent.p014mm.plugin.finder.extension.reddot.C55708b0.m63389b(r5, r2, r9, r7, r8)
            java.lang.String r5 = "Finder.TabTipProcessInterceptor"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[notifyTabTip] it is in finder now. just remove path of FINDER_ENTRANCE, currentTabType="
            r7.append(r8)
            os1.f r8 = r1.f170944b
            int r8 = r8.f34362i
            r7.append(r8)
            java.lang.String r8 = " type="
            r7.append(r8)
            int r8 = r2.f144670e
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r7)
        L_0x04be:
            di3.d r5 = di3.C86312j.m106911c(r0)
            ns3.d r5 = (ns3.C11266d) r5
            boolean r5 = r5.mo9197kQ()
            if (r5 == 0) goto L_0x04e7
            if1.a r5 = if1.C60276a.f171840a
            r5.mo85255d(r2)
            java.lang.String r5 = "Finder.TabTipProcessInterceptor"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[notifyTabTip] it is in nearby now. just remove path of NEARBY_ENTRANCE, type="
            r7.append(r8)
            int r8 = r2.f144670e
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r7)
        L_0x04e7:
            di3.d r0 = di3.C86312j.m106911c(r0)
            ns3.d r0 = (ns3.C11266d) r0
            boolean r0 = r0.mo9194go()
            if (r0 == 0) goto L_0x0510
            if1.a r0 = if1.C60276a.f171840a
            r0.mo85252a(r2)
            java.lang.String r0 = "Finder.TabTipProcessInterceptor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "[notifyTabTip] it is in finderLiveSquare now. just remove path of FinderLiveEntrance, type="
            r5.append(r7)
            int r7 = r2.f144670e
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r5)
        L_0x0510:
            com.tencent.mm.plugin.finder.extension.reddot.b0 r0 = com.tencent.p014mm.plugin.finder.extension.reddot.C55708b0.f158567a
            java.lang.String r5 = "finder_tl_hot_tab"
            boolean r5 = r0.mo77293a(r2, r5)
            if (r5 == 0) goto L_0x05be
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99440k4
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r6) goto L_0x052f
            r0 = 1
            goto L_0x0530
        L_0x052f:
            r0 = 0
        L_0x0530:
            java.util.LinkedList<te3.nn1> r5 = r2.f144672g
            if (r5 == 0) goto L_0x055c
            java.util.Iterator r5 = r5.iterator()
        L_0x0538:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0550
            java.lang.Object r7 = r5.next()
            r8 = r7
            te3.nn1 r8 = (te3.C64586nn1) r8
            java.lang.String r8 = r8.f184507i
            java.lang.String r9 = "finder_tl_hot_tab"
            boolean r8 = gy3.C87412m.m108589b(r8, r9)
            if (r8 == 0) goto L_0x0538
            goto L_0x0551
        L_0x0550:
            r7 = 0
        L_0x0551:
            te3.nn1 r7 = (te3.C64586nn1) r7
            if (r7 == 0) goto L_0x055c
            int r5 = r7.f184514s
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x055d
        L_0x055c:
            r5 = 0
        L_0x055d:
            os1.f r7 = r1.f170944b
            r8 = 4
            boolean r7 = r7.mo11603f3(r8)
            os1.f r9 = r1.f170944b
            int r9 = r9.f34362i
            if (r9 != r8) goto L_0x056c
            r8 = 1
            goto L_0x056d
        L_0x056c:
            r8 = 0
        L_0x056d:
            if (r5 != 0) goto L_0x0570
            goto L_0x0576
        L_0x0570:
            int r5 = r5.intValue()
            if (r5 == r6) goto L_0x0715
        L_0x0576:
            if (r0 == 0) goto L_0x0715
            if (r8 != 0) goto L_0x057c
            if (r7 != 0) goto L_0x0715
        L_0x057c:
            java.lang.String r3 = "Finder.TabTipProcessInterceptor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "ignore this reddot.ctrlType="
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = " tips_id="
            r5.append(r4)
            java.lang.String r2 = r2.f144673h
            r5.append(r2)
            java.lang.String r2 = " isInFinder="
            r5.append(r2)
            r5.append(r13)
            java.lang.String r2 = " isFilter="
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = " isInSelfTab="
            r5.append(r0)
            r5.append(r8)
            java.lang.String r0 = " isAutoRefresh="
            r5.append(r0)
            r5.append(r7)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            goto L_0x0713
        L_0x05be:
            java.lang.String r5 = "TLRecommendTab"
            boolean r5 = r0.mo77293a(r2, r5)
            if (r5 == 0) goto L_0x0669
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99448l4
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r6) goto L_0x05db
            r0 = 1
            goto L_0x05dc
        L_0x05db:
            r0 = 0
        L_0x05dc:
            java.util.LinkedList<te3.nn1> r5 = r2.f144672g
            if (r5 == 0) goto L_0x0608
            java.util.Iterator r5 = r5.iterator()
        L_0x05e4:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x05fc
            java.lang.Object r7 = r5.next()
            r8 = r7
            te3.nn1 r8 = (te3.C64586nn1) r8
            java.lang.String r8 = r8.f184507i
            java.lang.String r9 = "TLRecommendTab"
            boolean r8 = gy3.C87412m.m108589b(r8, r9)
            if (r8 == 0) goto L_0x05e4
            goto L_0x05fd
        L_0x05fc:
            r7 = 0
        L_0x05fd:
            te3.nn1 r7 = (te3.C64586nn1) r7
            if (r7 == 0) goto L_0x0608
            int r5 = r7.f184514s
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0609
        L_0x0608:
            r5 = 0
        L_0x0609:
            os1.f r7 = r1.f170944b
            boolean r7 = r7.mo11603f3(r6)
            os1.f r8 = r1.f170944b
            int r8 = r8.f34362i
            if (r8 != r6) goto L_0x0617
            r8 = 1
            goto L_0x0618
        L_0x0617:
            r8 = 0
        L_0x0618:
            if (r5 != 0) goto L_0x061b
            goto L_0x0621
        L_0x061b:
            int r5 = r5.intValue()
            if (r5 == r6) goto L_0x0715
        L_0x0621:
            if (r0 == 0) goto L_0x0715
            if (r8 != 0) goto L_0x0627
            if (r7 != 0) goto L_0x0715
        L_0x0627:
            java.lang.String r3 = "Finder.TabTipProcessInterceptor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "ignore this reddot.ctrlType="
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = " tips_id="
            r5.append(r4)
            java.lang.String r2 = r2.f144673h
            r5.append(r2)
            java.lang.String r2 = " isInFinder="
            r5.append(r2)
            r5.append(r13)
            java.lang.String r2 = " isFilter="
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = " isInSelfTab="
            r5.append(r0)
            r5.append(r8)
            java.lang.String r0 = " isAutoRefresh="
            r5.append(r0)
            r5.append(r7)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            goto L_0x0713
        L_0x0669:
            java.lang.String r5 = "TLFollow"
            boolean r0 = r0.mo77293a(r2, r5)
            if (r0 == 0) goto L_0x0715
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99456m4
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r6) goto L_0x0686
            r0 = 1
            goto L_0x0687
        L_0x0686:
            r0 = 0
        L_0x0687:
            java.util.LinkedList<te3.nn1> r5 = r2.f144672g
            if (r5 == 0) goto L_0x06b3
            java.util.Iterator r5 = r5.iterator()
        L_0x068f:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x06a7
            java.lang.Object r7 = r5.next()
            r8 = r7
            te3.nn1 r8 = (te3.C64586nn1) r8
            java.lang.String r8 = r8.f184507i
            java.lang.String r9 = "TLFollow"
            boolean r8 = gy3.C87412m.m108589b(r8, r9)
            if (r8 == 0) goto L_0x068f
            goto L_0x06a8
        L_0x06a7:
            r7 = 0
        L_0x06a8:
            te3.nn1 r7 = (te3.C64586nn1) r7
            if (r7 == 0) goto L_0x06b3
            int r5 = r7.f184514s
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x06b4
        L_0x06b3:
            r5 = 0
        L_0x06b4:
            os1.f r7 = r1.f170944b
            r8 = 3
            boolean r7 = r7.mo11603f3(r8)
            os1.f r9 = r1.f170944b
            int r9 = r9.f34362i
            if (r9 != r8) goto L_0x06c3
            r8 = 1
            goto L_0x06c4
        L_0x06c3:
            r8 = 0
        L_0x06c4:
            if (r5 != 0) goto L_0x06c7
            goto L_0x06cd
        L_0x06c7:
            int r5 = r5.intValue()
            if (r5 == r6) goto L_0x0715
        L_0x06cd:
            if (r0 == 0) goto L_0x0715
            if (r8 != 0) goto L_0x06d3
            if (r7 != 0) goto L_0x0715
        L_0x06d3:
            java.lang.String r3 = "Finder.TabTipProcessInterceptor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "ignore this reddot.ctrlType="
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = " tips_id="
            r5.append(r4)
            java.lang.String r2 = r2.f144673h
            r5.append(r2)
            java.lang.String r2 = " isInFinder="
            r5.append(r2)
            r5.append(r13)
            java.lang.String r2 = " isFilter="
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = " isInSelfTab="
            r5.append(r0)
            r5.append(r8)
            java.lang.String r0 = " isAutoRefresh="
            r5.append(r0)
            r5.append(r7)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
        L_0x0713:
            r0 = 0
            return r0
        L_0x0715:
            zc1.b r0 = zc1.C66785b.f191882e
            java.lang.String r0 = r0.mo90658I1()
            java.lang.String r4 = "username"
            gy3.C87412m.m108594g(r0, r4)
            int r4 = r2.f144670e
            r5 = 15
            if (r4 != r5) goto L_0x07df
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.LinkedList<te3.nn1> r6 = r2.f144672g
            java.util.Iterator r6 = r6.iterator()
        L_0x0732:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0748
            java.lang.Object r7 = r6.next()
            te3.nn1 r7 = (te3.C64586nn1) r7
            java.lang.String r7 = r7.f184507i
            if (r7 != 0) goto L_0x0744
            java.lang.String r7 = ""
        L_0x0744:
            r4.add(r7)
            goto L_0x0732
        L_0x0748:
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r6 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            com.tencent.mm.plugin.FinderCommonFeatureService r6 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r6
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r6 = r6.Nt0()
            com.tencent.mm.plugin.finder.extension.reddot.y r7 = com.tencent.p014mm.plugin.finder.extension.reddot.C2493y.f13012d
            java.util.HashMap r5 = r6.mo77278r(r5, r7, r0)
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0767:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x07a5
            java.lang.Object r7 = r5.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getValue()
            java.util.List r7 = (java.util.List) r7
            monitor-enter(r7)
            int r8 = r7.size()     // Catch:{ all -> 0x07a2 }
            java.util.ListIterator r8 = r7.listIterator(r8)     // Catch:{ all -> 0x07a2 }
        L_0x0782:
            boolean r9 = r8.hasPrevious()     // Catch:{ all -> 0x07a2 }
            if (r9 == 0) goto L_0x0798
            java.lang.Object r9 = r8.previous()     // Catch:{ all -> 0x07a2 }
            r10 = r9
            com.tencent.mm.plugin.finder.extension.reddot.s0 r10 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r10     // Catch:{ all -> 0x07a2 }
            java.lang.String r10 = r10.field_username     // Catch:{ all -> 0x07a2 }
            boolean r10 = gy3.C87412m.m108589b(r0, r10)     // Catch:{ all -> 0x07a2 }
            if (r10 == 0) goto L_0x0782
            goto L_0x0799
        L_0x0798:
            r9 = 0
        L_0x0799:
            monitor-exit(r7)
            com.tencent.mm.plugin.finder.extension.reddot.s0 r9 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r9
            if (r9 == 0) goto L_0x0767
            r6.add(r9)
            goto L_0x0767
        L_0x07a2:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x07a5:
            com.tencent.mm.plugin.finder.extension.reddot.x r0 = new com.tencent.mm.plugin.finder.extension.reddot.x
            r0.<init>()
            sx3.C110818d0.m150943o0(r6, r0)
            java.lang.Object r0 = sx3.C110818d0.m150924V(r6)
            com.tencent.mm.plugin.finder.extension.reddot.s0 r0 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r0
            if (r0 == 0) goto L_0x07df
            java.util.concurrent.ConcurrentHashMap<java.lang.String, te3.nn1> r5 = r0.f158583D
            java.util.Enumeration r5 = r5.keys()
            java.lang.String r6 = "showInfoMap.keys()"
            gy3.C87412m.m108593f(r5, r6)
        L_0x07c1:
            boolean r6 = r5.hasMoreElements()
            if (r6 == 0) goto L_0x07df
            java.lang.Object r6 = r5.nextElement()
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = r4.contains(r6)
            if (r7 != 0) goto L_0x07c1
            java.util.LinkedList<te3.nn1> r7 = r2.f144672g
            java.util.concurrent.ConcurrentHashMap<java.lang.String, te3.nn1> r8 = r0.f158583D
            java.lang.Object r6 = r8.get(r6)
            r7.add(r6)
            goto L_0x07c1
        L_0x07df:
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = r1.f170943a
            rx3.l r8 = r0.mo77232J(r2)
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = r1.f170943a
            int r4 = r2.f144670e
            r5 = 2
            r6 = 0
            ht1.C60152b4.C8759a.m8562b(r0, r4, r6, r5, r6)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = r1.f170943a
            java.lang.String r4 = "notifyTabTip"
            r0.mo77265f(r2, r4)
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = r1.f170943a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "notifyTabTip#"
            r4.append(r5)
            hf1.b$a r5 = r23.mo84826a()
            if (r5 == 0) goto L_0x080d
            r6 = 0
            r5.getClass()
        L_0x080d:
            r4.append(r6)
            java.lang.String r5 = r4.toString()
            r6 = 0
            r7 = 1
            r9 = 0
            hf1.b$a r3 = r23.mo84826a()
            if (r3 == 0) goto L_0x0823
            r10 = 0
            r3.getClass()
            goto L_0x0826
        L_0x0823:
            r3 = 0
            r10 = r3
        L_0x0826:
            r12 = 0
            r18 = 164(0xa4, float:2.3E-43)
            r19 = 0
            r20 = 0
            r3 = r0
            r4 = r2
            r0 = r13
            r13 = r18
            r18 = r0
            r0 = r14
            r14 = r19
            com.tencent.mm.plugin.finder.extension.reddot.s0 r3 = ht1.C60152b4.C8759a.m8561a(r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14)
            java.lang.String r4 = "Finder.TabTipProcessInterceptor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[notifyTabTip] successfully! ctrlType="
            r5.append(r6)
            if (r3 == 0) goto L_0x0852
            te3.xi1 r6 = r3.field_ctrInfo
            int r6 = r6.f144670e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0853
        L_0x0852:
            r6 = 0
        L_0x0853:
            r5.append(r6)
            java.lang.String r6 = " tabType="
            r5.append(r6)
            if (r3 == 0) goto L_0x0868
            te3.yi1 r6 = r3.f158585F
            if (r6 == 0) goto L_0x0868
            int r6 = r6.f186555p
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0869
        L_0x0868:
            r6 = 0
        L_0x0869:
            r5.append(r6)
            java.lang.String r6 = " isAiRedDot="
            r5.append(r6)
            if (r3 == 0) goto L_0x0881
            long r6 = r3.field_aiScene
            int r8 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r8 < 0) goto L_0x087b
            r6 = 1
            goto L_0x087c
        L_0x087b:
            r6 = 0
        L_0x087c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x0882
        L_0x0881:
            r6 = 0
        L_0x0882:
            r5.append(r6)
            java.lang.String r6 = " extInfo="
            r5.append(r6)
            pe3.b r6 = r2.f144671f
            if (r6 == 0) goto L_0x0890
            r6 = 1
            goto L_0x0891
        L_0x0890:
            r6 = 0
        L_0x0891:
            r5.append(r6)
            java.lang.String r6 = " objectId="
            r5.append(r6)
            if (r3 == 0) goto L_0x08a3
            te3.xi1 r6 = r3.field_ctrInfo
            if (r6 == 0) goto L_0x08a3
            long r6 = r6.f144686x
            r20 = r6
        L_0x08a3:
            java.lang.String r6 = o40.C61926c.m72691p(r20)
            r5.append(r6)
            java.lang.String r6 = " diffTime="
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = "ms isInFinder="
            r5.append(r0)
            r0 = r18
            r5.append(r0)
            java.lang.String r0 = " currentTabType="
            r5.append(r0)
            r1 = r22
            os1.f r0 = r1.f170944b
            int r0 = r0.f34362i
            r5.append(r0)
            java.lang.String r0 = " showInfoSize="
            r5.append(r0)
            java.util.LinkedList<te3.nn1> r0 = r2.f144672g
            if (r0 == 0) goto L_0x08d8
            int r0 = r0.size()
            goto L_0x08d9
        L_0x08d8:
            r0 = 0
        L_0x08d9:
            r5.append(r0)
            java.lang.String r0 = " tabTipsByPassInfo="
            r5.append(r0)
            if (r3 == 0) goto L_0x08ea
            te3.yi1 r0 = r3.f158585F
            if (r0 == 0) goto L_0x08ea
            pe3.b r0 = r0.f186553n
            goto L_0x08eb
        L_0x08ea:
            r0 = 0
        L_0x08eb:
            if (r0 == 0) goto L_0x08ef
            r0 = 1
            goto L_0x08f0
        L_0x08ef:
            r0 = 0
        L_0x08f0:
            r5.append(r0)
            java.lang.String r0 = " expiredTime="
            r5.append(r0)
            int r0 = r2.f144674i
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hf1.C59878f.mo84825a(hf1.b$b):com.tencent.mm.plugin.finder.extension.reddot.s0");
    }
}
