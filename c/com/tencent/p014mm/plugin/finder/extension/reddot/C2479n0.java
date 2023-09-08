package com.tencent.p014mm.plugin.finder.extension.reddot;

import androidx.lifecycle.C54219z;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.rtmp.TXLiveConstants;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C60152b4;
import java.util.HashSet;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C51978xi1;
import te3.C64586nn1;
import zc1.C66785b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.n0 */
public final class C2479n0 {

    /* renamed from: A */
    public static final C54219z<C2480a> f12944A = new C54219z<>();

    /* renamed from: B */
    public static final C54219z<C2480a> f12945B = new C54219z<>();

    /* renamed from: C */
    public static final C54219z<C2480a> f12946C = new C54219z<>();

    /* renamed from: D */
    public static final C54219z<C2480a> f12947D = new C54219z<>();

    /* renamed from: E */
    public static final C54219z<C2480a> f12948E = new C54219z<>();

    /* renamed from: F */
    public static final C54219z<C2480a> f12949F = new C54219z<>();

    /* renamed from: G */
    public static final C54219z<C2480a> f12950G = new C54219z<>();

    /* renamed from: H */
    public static final C54219z<C2480a> f12951H = new C54219z<>();

    /* renamed from: I */
    public static final C54219z<C2480a> f12952I = new C54219z<>();

    /* renamed from: J */
    public static final C54219z<C2480a> f12953J = new C54219z<>();

    /* renamed from: K */
    public static final HashSet<String> f12954K;

    /* renamed from: a */
    public static final C2479n0 f12955a = new C2479n0();

    /* renamed from: b */
    public static final C54219z<C2480a> f12956b = new C54219z<>();

    /* renamed from: c */
    public static final C54219z<C2480a> f12957c = new C54219z<>();

    /* renamed from: d */
    public static final C54219z<C2480a> f12958d = new C54219z<>();

    /* renamed from: e */
    public static final C54219z<C2480a> f12959e = new C54219z<>();

    /* renamed from: f */
    public static final C54219z<C2480a> f12960f = new C54219z<>();

    /* renamed from: g */
    public static final C54219z<C2480a> f12961g = new C54219z<>();

    /* renamed from: h */
    public static final C54219z<C2480a> f12962h = new C54219z<>();

    /* renamed from: i */
    public static final C54219z<C2480a> f12963i = new C54219z<>();

    /* renamed from: j */
    public static final C54219z<C2480a> f12964j = new C54219z<>();

    /* renamed from: k */
    public static final C54219z<C2480a> f12965k = new C54219z<>();

    /* renamed from: l */
    public static final C54219z<C2480a> f12966l = new C54219z<>();

    /* renamed from: m */
    public static final C54219z<C2480a> f12967m = new C54219z<>();

    /* renamed from: n */
    public static final C54219z<C2480a> f12968n = new C54219z<>();

    /* renamed from: o */
    public static final C54219z<C2480a> f12969o = new C54219z<>();

    /* renamed from: p */
    public static final C54219z<C2480a> f12970p = new C54219z<>();

    /* renamed from: q */
    public static final C54219z<C2480a> f12971q = new C54219z<>();

    /* renamed from: r */
    public static final C54219z<C2480a> f12972r = new C54219z<>();

    /* renamed from: s */
    public static final C54219z<C2480a> f12973s = new C54219z<>();

    /* renamed from: t */
    public static final C54219z<C2480a> f12974t = new C54219z<>();

    /* renamed from: u */
    public static final C54219z<C2480a> f12975u = new C54219z<>();

    /* renamed from: v */
    public static final C54219z<C2480a> f12976v = new C54219z<>();

    /* renamed from: w */
    public static final C54219z<C2480a> f12977w = new C54219z<>();

    /* renamed from: x */
    public static final C54219z<C2480a> f12978x = new C54219z<>();

    /* renamed from: y */
    public static final C54219z<C2480a> f12979y = new C54219z<>();

    /* renamed from: z */
    public static final C54219z<C2480a> f12980z = new C54219z<>();

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.n0$a */
    public static final class C2480a extends C2458a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2480a(boolean z, C64586nn1 nn12, C55718s0 s0Var, String str) {
            super(z, nn12, s0Var, str);
            C87412m.m108594g(str, "finderUserName");
        }

        public String toString() {
            C51978xi1 xi12;
            StringBuilder sb = new StringBuilder();
            sb.append("tipId=");
            C55718s0 s0Var = this.f12910c;
            Integer num = null;
            sb.append(s0Var != null ? s0Var.field_tipsId : null);
            sb.append(" type=");
            C55718s0 s0Var2 = this.f12910c;
            sb.append((s0Var2 == null || (xi12 = s0Var2.field_ctrInfo) == null) ? null : Integer.valueOf(xi12.f144670e));
            sb.append(" isShow=");
            sb.append(this.f12908a);
            sb.append(" path=");
            C64586nn1 nn12 = this.f12909b;
            sb.append(nn12 != null ? nn12.f184507i : null);
            sb.append(" showType=");
            C64586nn1 nn13 = this.f12909b;
            sb.append(nn13 != null ? Integer.valueOf(nn13.f184502d) : null);
            sb.append(" title=");
            C64586nn1 nn14 = this.f12909b;
            sb.append(nn14 != null ? nn14.f184504f : null);
            sb.append(" path:");
            sb.append(this.f12912e);
            sb.append(" count:");
            C64586nn1 nn15 = this.f12909b;
            if (nn15 != null) {
                num = Integer.valueOf(nn15.f184503e);
            }
            sb.append(num);
            return sb.toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.n0$b */
    public static final class C2481b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f12981d;

        /* renamed from: e */
        public final /* synthetic */ String f12982e;

        public C2481b(String str, String str2) {
            this.f12981d = str;
            this.f12982e = str2;
        }

        public final void run() {
            boolean z;
            Class cls = FinderCommonFeatureService.class;
            FinderCommonFeatureService finderCommonFeatureService = (FinderCommonFeatureService) C86312j.m106911c(cls);
            synchronized (finderCommonFeatureService.f157798g) {
                z = finderCommonFeatureService.f157798g[0] != null;
            }
            if (!z || !C86709a0.m107522a()) {
                Log.m105928w("Finder.RedDotNotifier", "checkPathAndNotify not ready!");
                return;
            }
            try {
                C55718s0 i = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77269i(this.f12981d, this.f12982e);
                if (i != null) {
                    C64586nn1 o2 = i.mo77308o2(this.f12981d);
                    if (o2 != null) {
                        C2479n0 n0Var = C2479n0.f12955a;
                        n0Var.mo2446a(i);
                        C2479n0.m2356f(n0Var, true, this.f12981d, o2, i, (String) null, 16, (Object) null);
                        return;
                    }
                    C2479n0.f12955a.mo2449e(false, this.f12981d, (C64586nn1) null, i, this.f12982e);
                    return;
                }
                C2479n0.f12955a.mo2449e(false, this.f12981d, (C64586nn1) null, (C55718s0) null, this.f12982e);
            } catch (Exception e) {
                Log.printErrStackTrace("Finder.RedDotNotifier", e, "checkPathAndNotify exception!", new Object[0]);
            }
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("FinderEntrance");
        hashSet.add("Discovery");
        hashSet.add("TLPersonalCenter");
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("FinderMentionEntrance");
        hashSet2.add("finder_private_msg_entrance");
        hashSet2.add("AuthorProfileNotify");
        hashSet2.add("NotificationCenterLike");
        hashSet2.add("NotificationCenterComment");
        hashSet2.add("NotificationCenterFollow");
        hashSet2.add("CreatorCenter");
        hashSet2.add("FinderPosterEntrance");
        hashSet2.add("FinderEntrance");
        hashSet2.add("Discovery");
        hashSet2.add("TLPersonalCenter");
        hashSet2.add("FinderSwitchAccount");
        f12954K = hashSet2;
    }

    /* renamed from: c */
    public static /* synthetic */ void m2355c(C2479n0 n0Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = C66785b.f191882e.mo90662O5();
        }
        n0Var.mo2447b(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r11 = r10.field_ctrInfo;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m2356f(com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0 r6, boolean r7, java.lang.String r8, te3.C64586nn1 r9, com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0 r10, java.lang.String r11, int r12, java.lang.Object r13) {
        /*
            r12 = r12 & 16
            if (r12 == 0) goto L_0x0012
            if (r10 == 0) goto L_0x000d
            te3.xi1 r11 = r10.field_ctrInfo
            if (r11 == 0) goto L_0x000d
            java.lang.String r11 = r11.f144679q
            goto L_0x000e
        L_0x000d:
            r11 = 0
        L_0x000e:
            if (r11 != 0) goto L_0x0012
            java.lang.String r11 = ""
        L_0x0012:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.mo2449e(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.m2356f(com.tencent.mm.plugin.finder.extension.reddot.n0, boolean, java.lang.String, te3.nn1, com.tencent.mm.plugin.finder.extension.reddot.s0, java.lang.String, int, java.lang.Object):void");
    }

    /* renamed from: g */
    public static void m2357g(C2479n0 n0Var, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = C66785b.f191882e.mo90662O5();
        }
        n0Var.getClass();
        C87412m.m108594g(str, "lastFinderUsername");
        C87412m.m108594g(str2, "finderUsername");
        if (C87412m.m108589b(str, str2)) {
            Log.m105928w("Finder.RedDotNotifier", "return for notifySwitchAccountRedDot on same username:" + str + '!');
            return;
        }
        Log.m105924i("Finder.RedDotNotifier", "notifySwitchAccountRedDot lastFinderUsername:" + str + " finderUsername:" + str2);
        FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
        boolean z2 = false;
        for (String str3 : C66785b.f191882e.mo90675o1(true)) {
            if (!C87412m.m108589b(str3, str2)) {
                C64586nn1 y = Nx0.mo77285y("AuthorProfileNotify", str3);
                if (y != null) {
                    Log.m105924i("Finder.RedDotNotifier", "isExistOtherAccountRedDot:" + true + " username:" + y + "  FinderPosterEntrance");
                } else {
                    C64586nn1 y2 = Nx0.mo77285y("finder_private_msg_entrance", str3);
                    if (y2 != null) {
                        Log.m105924i("Finder.RedDotNotifier", "isExistOtherAccountRedDot:" + true + " username:" + y2 + " FINDER_TL_PERSONAL_CENTER");
                    }
                }
                z2 = true;
            }
        }
        Log.m105924i("Finder.RedDotNotifier", "isExistOtherAccountRedDot:" + z2);
        if (z2) {
            n0Var.mo2448d(str2);
        } else {
            Nx0.mo77241N5(TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, str);
        }
    }

    /* renamed from: a */
    public final void mo2446a(C55718s0 s0Var) {
        C13598b0 b0Var;
        boolean z = true;
        if (!(s0Var != null && s0Var.field_ctrInfo.f144670e == 2)) {
            if (s0Var == null || s0Var.field_ctrInfo.f144670e != 1006) {
                z = false;
            }
            if (!z) {
                return;
            }
        }
        C66785b bVar = C66785b.f191882e;
        String I1 = Util.isNullOrNil(bVar.mo90662O5()) ? bVar.mo90658I1() : bVar.mo90662O5();
        Log.m105924i("Finder.RedDotNotifier", "checkNotifyShowInfoPath curFinderUsername: " + I1 + " field_username:" + s0Var.field_username);
        if (C87412m.m108589b(s0Var.field_username, I1)) {
            return;
        }
        if (s0Var.mo77306m2("AuthorProfileNotify") || s0Var.mo77306m2("finder_private_msg_entrance")) {
            if (((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77246R5("FinderSwitchAccount") != null) {
                Log.m105924i("Finder.RedDotNotifier", "checkNotifyShowInfoPath already has");
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                mo2448d(I1);
            }
        }
    }

    /* renamed from: b */
    public final void mo2447b(String str, String str2) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(str2, "username");
        ((C119157j) C119157j.f356862d).mo183875f(new C2481b(str, str2));
    }

    /* renamed from: d */
    public final void mo2448d(String str) {
        Log.m105924i("Finder.RedDotNotifier", "insertLocalSwitchRedDot finderUsername:" + str);
        FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
        C51978xi1 xi12 = new C51978xi1();
        xi12.f144673h = String.valueOf(C31543z5.m39453c());
        xi12.f144670e = TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED;
        xi12.f144669d = 400000;
        xi12.f144679q = str;
        C64586nn1 nn12 = new C64586nn1();
        nn12.f184507i = "FinderSwitchAccount";
        nn12.f184502d = 1;
        nn12.f184506h = 1;
        nn12.f184521z = str;
        C64586nn1 nn13 = new C64586nn1();
        nn13.f184507i = "TLPersonalCenter";
        nn13.f184502d = 1;
        nn13.f184506h = 1;
        nn13.f184521z = str;
        xi12.f144672g.add(nn12);
        xi12.f144672g.add(nn13);
        C60152b4.C8759a.m8561a(Nx0, xi12, "switchAccount", (HashSet) null, true, (C13604l) null, (C32226l) null, 0, false, 244, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
        r2 = r7.field_ctrInfo;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2449e(boolean r4, java.lang.String r5, te3.C64586nn1 r6, com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0 r7, java.lang.String r8) {
        /*
            r3 = this;
            java.lang.String r0 = "path"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "username"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[notify] tipsId="
            r0.append(r1)
            r1 = 0
            if (r7 == 0) goto L_0x001f
            te3.xi1 r2 = r7.field_ctrInfo
            if (r2 == 0) goto L_0x001f
            java.lang.String r2 = r2.f144673h
            goto L_0x0020
        L_0x001f:
            r2 = r1
        L_0x0020:
            r0.append(r2)
            java.lang.String r2 = " isShow="
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = " path="
            r0.append(r2)
            r0.append(r5)
            java.lang.String r2 = " show_type="
            r0.append(r2)
            if (r6 == 0) goto L_0x0041
            int r2 = r6.f184502d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0042
        L_0x0041:
            r2 = r1
        L_0x0042:
            r0.append(r2)
            java.lang.String r2 = " count="
            r0.append(r2)
            if (r6 == 0) goto L_0x0053
            int r2 = r6.f184503e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0054
        L_0x0053:
            r2 = r1
        L_0x0054:
            r0.append(r2)
            java.lang.String r2 = " title="
            r0.append(r2)
            if (r6 == 0) goto L_0x0061
            java.lang.String r2 = r6.f184504f
            goto L_0x0062
        L_0x0061:
            r2 = r1
        L_0x0062:
            r0.append(r2)
            java.lang.String r2 = " clear_type="
            r0.append(r2)
            if (r6 == 0) goto L_0x0073
            int r2 = r6.f184506h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0074
        L_0x0073:
            r2 = r1
        L_0x0074:
            r0.append(r2)
            java.lang.String r2 = " parent="
            r0.append(r2)
            if (r6 == 0) goto L_0x0081
            java.lang.String r2 = r6.f184508j
            goto L_0x0082
        L_0x0081:
            r2 = r1
        L_0x0082:
            r0.append(r2)
            java.lang.String r2 = " icon="
            r0.append(r2)
            if (r6 == 0) goto L_0x008f
            java.lang.String r2 = r6.f184505g
            goto L_0x0090
        L_0x008f:
            r2 = r1
        L_0x0090:
            r0.append(r2)
            java.lang.String r2 = " username="
            r0.append(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Finder.RedDotNotifier"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t1 r0 = (ht1.C60200t1) r0
            ht1.b4 r0 = r0.Nt0()
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager"
            gy3.C87412m.m108592e(r0, r2)
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = (com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager) r0
            if (r4 == 0) goto L_0x00df
            java.lang.Class<ht1.v4> r2 = ht1.C8808v4.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.v4 r2 = (ht1.C8808v4) r2
            boolean r2 = r2.mo9636zX()
            if (r2 == 0) goto L_0x00df
            if (r7 == 0) goto L_0x00d1
            te3.xi1 r1 = r7.field_ctrInfo
            int r1 = r1.f144670e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x00d1:
            boolean r0 = r0.mo77252X5(r1)
            if (r0 != 0) goto L_0x00df
            java.lang.String r4 = "Finder.RedDotManager"
            java.lang.String r5 = "[notify] 青少年模式且只看关注的模式下只notify关注的红点展示"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            return
        L_0x00df:
            com.tencent.mm.plugin.finder.extension.reddot.n0$a r0 = new com.tencent.mm.plugin.finder.extension.reddot.n0$a
            r0.<init>(r4, r6, r7, r8)
            r0.f12912e = r5
            r3.mo2446a(r7)
            int r4 = r5.hashCode()
            switch(r4) {
                case -2022470391: goto L_0x032a;
                case -2012091709: goto L_0x031b;
                case -1310893465: goto L_0x030c;
                case -1189042725: goto L_0x02fd;
                case -1122322075: goto L_0x02ee;
                case -961813849: goto L_0x02df;
                case -673664605: goto L_0x02ce;
                case -318065288: goto L_0x02bd;
                case -293714827: goto L_0x02ac;
                case -111863496: goto L_0x029b;
                case -58348260: goto L_0x028a;
                case -52816461: goto L_0x0279;
                case 4283335: goto L_0x0268;
                case 345890211: goto L_0x0257;
                case 418234311: goto L_0x0246;
                case 691368744: goto L_0x0235;
                case 748937620: goto L_0x0224;
                case 842235754: goto L_0x0213;
                case 885710185: goto L_0x0202;
                case 935133594: goto L_0x01f1;
                case 1109065661: goto L_0x01e0;
                case 1122432629: goto L_0x01cf;
                case 1207859273: goto L_0x01be;
                case 1266477644: goto L_0x01ad;
                case 1270511455: goto L_0x019c;
                case 1379387998: goto L_0x018b;
                case 1397734293: goto L_0x017a;
                case 1449007057: goto L_0x0169;
                case 1563304561: goto L_0x0158;
                case 1635977002: goto L_0x0147;
                case 1740085121: goto L_0x0136;
                case 1882760592: goto L_0x0125;
                case 1965523069: goto L_0x0114;
                case 1990415181: goto L_0x0103;
                case 2101591951: goto L_0x00f2;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            goto L_0x0339
        L_0x00f2:
            java.lang.String r4 = "FinderProfileBanner"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x00fc
            goto L_0x0339
        L_0x00fc:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12979y
            r4.postValue(r0)
            goto L_0x0344
        L_0x0103:
            java.lang.String r4 = "TLPersonalCenter"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x010d
            goto L_0x0339
        L_0x010d:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12965k
            r4.postValue(r0)
            goto L_0x0344
        L_0x0114:
            java.lang.String r4 = "TLPostCamera"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x011e
            goto L_0x0339
        L_0x011e:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12959e
            r4.postValue(r0)
            goto L_0x0344
        L_0x0125:
            java.lang.String r4 = "Discovery"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x012f
            goto L_0x0339
        L_0x012f:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12956b
            r4.postValue(r0)
            goto L_0x0344
        L_0x0136:
            java.lang.String r4 = "CreatorCenter"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0140
            goto L_0x0339
        L_0x0140:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12977w
            r4.postValue(r0)
            goto L_0x0344
        L_0x0147:
            java.lang.String r4 = "FinderSetting"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0151
            goto L_0x0339
        L_0x0151:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12967m
            r4.postValue(r0)
            goto L_0x0344
        L_0x0158:
            java.lang.String r4 = "FinderLiveIncomeEntrance"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0162
            goto L_0x0339
        L_0x0162:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12948E
            r4.postValue(r0)
            goto L_0x0344
        L_0x0169:
            java.lang.String r4 = "TLRecommendTab"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0173
            goto L_0x0339
        L_0x0173:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12969o
            r4.postValue(r0)
            goto L_0x0344
        L_0x017a:
            java.lang.String r4 = "finder_tl_hot_tab"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0184
            goto L_0x0339
        L_0x0184:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12971q
            r4.postValue(r0)
            goto L_0x0344
        L_0x018b:
            java.lang.String r4 = "AuthorProfileFans"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0195
            goto L_0x0339
        L_0x0195:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12963i
            r4.postValue(r0)
            goto L_0x0344
        L_0x019c:
            java.lang.String r4 = "ProfileEntrance"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x01a6
            goto L_0x0339
        L_0x01a6:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12961g
            r4.postValue(r0)
            goto L_0x0344
        L_0x01ad:
            java.lang.String r4 = "WxMessageEntry"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x01b7
            goto L_0x0339
        L_0x01b7:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12953J
            r4.postValue(r0)
            goto L_0x0344
        L_0x01be:
            java.lang.String r4 = "TLFollow"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x01c8
            goto L_0x0339
        L_0x01c8:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12968n
            r4.postValue(r0)
            goto L_0x0344
        L_0x01cf:
            java.lang.String r4 = "NearbyEntrance"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x01d9
            goto L_0x0339
        L_0x01d9:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12947D
            r4.postValue(r0)
            goto L_0x0344
        L_0x01e0:
            java.lang.String r4 = "TLCamera"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x01ea
            goto L_0x0339
        L_0x01ea:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12958d
            r4.postValue(r0)
            goto L_0x0344
        L_0x01f1:
            java.lang.String r4 = "FinderMentionEntrance"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x01fb
            goto L_0x0339
        L_0x01fb:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12951H
            r4.postValue(r0)
            goto L_0x0344
        L_0x0202:
            java.lang.String r4 = "finder_private_msg_entrance"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x020c
            goto L_0x0339
        L_0x020c:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12973s
            r4.postValue(r0)
            goto L_0x0344
        L_0x0213:
            java.lang.String r4 = "NearbyLiveTab"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x021d
            goto L_0x0339
        L_0x021d:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12944A
            r4.postValue(r0)
            goto L_0x0344
        L_0x0224:
            java.lang.String r4 = "FinderSelfLiveEntrance"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x022e
            goto L_0x0339
        L_0x022e:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12976v
            r4.postValue(r0)
            goto L_0x0344
        L_0x0235:
            java.lang.String r4 = "FinderLiveEntrance"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x023f
            goto L_0x0339
        L_0x023f:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12946C
            r4.postValue(r0)
            goto L_0x0344
        L_0x0246:
            java.lang.String r4 = "Personal_Center_FavList_Entrance"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0250
            goto L_0x0339
        L_0x0250:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12970p
            r4.postValue(r0)
            goto L_0x0344
        L_0x0257:
            java.lang.String r4 = "finder_tl_nearby_tab"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0261
            goto L_0x0339
        L_0x0261:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12972r
            r4.postValue(r0)
            goto L_0x0344
        L_0x0268:
            java.lang.String r4 = "OriginalEntrance"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0272
            goto L_0x0339
        L_0x0272:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12966l
            r4.postValue(r0)
            goto L_0x0344
        L_0x0279:
            java.lang.String r4 = "FinderSwitchAccount"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0283
            goto L_0x0339
        L_0x0283:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12952I
            r4.postValue(r0)
            goto L_0x0344
        L_0x028a:
            java.lang.String r4 = "FinderEntrance"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0294
            goto L_0x0339
        L_0x0294:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12957c
            r4.postValue(r0)
            goto L_0x0344
        L_0x029b:
            java.lang.String r4 = "CreateFinderEntrance"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x02a5
            goto L_0x0339
        L_0x02a5:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12978x
            r4.postValue(r0)
            goto L_0x0344
        L_0x02ac:
            java.lang.String r4 = "finder_wx_private_msg_entrance"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x02b6
            goto L_0x0339
        L_0x02b6:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12974t
            r4.postValue(r0)
            goto L_0x0344
        L_0x02bd:
            java.lang.String r4 = "NearbyFeedTab"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x02c7
            goto L_0x0339
        L_0x02c7:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12980z
            r4.postValue(r0)
            goto L_0x0344
        L_0x02ce:
            java.lang.String r4 = "FinderMyTab"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x02d8
            goto L_0x0339
        L_0x02d8:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12962h
            r4.postValue(r0)
            goto L_0x0344
        L_0x02df:
            java.lang.String r4 = "NearbyPeopleTab"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x02e8
            goto L_0x0339
        L_0x02e8:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12945B
            r4.postValue(r0)
            goto L_0x0344
        L_0x02ee:
            java.lang.String r4 = "TLWxBubble"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x02f7
            goto L_0x0339
        L_0x02f7:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12960f
            r4.postValue(r0)
            goto L_0x0344
        L_0x02fd:
            java.lang.String r4 = "FinderSettingLiveTask"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0306
            goto L_0x0339
        L_0x0306:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12949F
            r4.postValue(r0)
            goto L_0x0344
        L_0x030c:
            java.lang.String r4 = "AuthorProfileNotify"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0315
            goto L_0x0339
        L_0x0315:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12964j
            r4.postValue(r0)
            goto L_0x0344
        L_0x031b:
            java.lang.String r4 = "TLWxPrivateMsgBubble"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0324
            goto L_0x0339
        L_0x0324:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12975u
            r4.postValue(r0)
            goto L_0x0344
        L_0x032a:
            java.lang.String r4 = "FinderPosterEntrance"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0333
            goto L_0x0339
        L_0x0333:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = f12950G
            r4.postValue(r0)
            goto L_0x0344
        L_0x0339:
            java.lang.Class<tf0.r1> r4 = tf0.C64918r1.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            tf0.r1 r4 = (tf0.C64918r1) r4
            r4.mo89042Nu(r0)
        L_0x0344:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.mo2449e(boolean, java.lang.String, te3.nn1, com.tencent.mm.plugin.finder.extension.reddot.s0, java.lang.String):void");
    }
}
