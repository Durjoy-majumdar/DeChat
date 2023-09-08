package com.tencent.p014mm.plugin.finder.extension.reddot;

import bd1.C54446b;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.JsApiNFCStartHCE;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1824s;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import dp1.C20480e0;
import dp1.C58413v0;
import dp1.C58417y0;
import eb0.C31543z5;
import er1.C58739j4;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import h81.C59774i;
import ht1.C60165e4;
import p147ea.C7606d;
import p274xx.C66446g;
import rx3.C13604l;
import te3.C49712hj1;
import te3.C51978xi1;
import te3.C64586nn1;
import up1.C37521f;
import vc1.C37715b;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.o0 */
public final class C2483o0 {

    /* renamed from: a */
    public static final C2484a f12984a = new C2484a((C8480h) null);

    /* renamed from: b */
    public static String f12985b = "";

    /* renamed from: c */
    public static String f12986c = "";

    /* renamed from: d */
    public static String f12987d = "";

    /* renamed from: e */
    public static C13604l<C55718s0, ? extends C64586nn1> f12988e = null;

    /* renamed from: f */
    public static String f12989f = "";

    /* renamed from: g */
    public static String f12990g = "";

    /* renamed from: h */
    public static String f12991h = "";

    /* renamed from: i */
    public static String f12992i = "";

    /* renamed from: j */
    public static String f12993j = "";

    /* renamed from: k */
    public static String f12994k = "";

    /* renamed from: l */
    public static String f12995l = "";

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.o0$a */
    public static final class C2484a {
        public C2484a(C8480h hVar) {
        }

        /* renamed from: a */
        public static int[] m2362a(C2484a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = C66785b.f191882e.mo90662O5();
            }
            aVar.getClass();
            C87412m.m108594g(str, "username");
            FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
            C64586nn1 y = Nx0.mo77285y("NotificationCenterLike", str);
            int i2 = y != null ? y.f184503e : 0;
            C64586nn1 y2 = Nx0.mo77285y("NotificationCenterComment", str);
            int i3 = y2 != null ? y2.f184503e : 0;
            C64586nn1 y3 = Nx0.mo77285y("NotificationCenterFollow", str);
            int i4 = y3 != null ? y3.f184503e : 0;
            C64586nn1 y4 = Nx0.mo77285y("AuthorProfileNotify", str);
            return new int[]{i2, i3, i4, y4 != null ? y4.f184503e : 0};
        }

        /* renamed from: b */
        public final void mo2452b(String str, int i, C60165e4.C46105a aVar) {
            Class cls = FinderCommonFeatureService.class;
            C87412m.m108594g(str, "contextId");
            C87412m.m108594g(aVar, "dslRenderInfo");
            if (((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77229H5()) {
                C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("FinderLiveEntrance");
                C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("FinderLiveEntrance");
                C58784w3 w3Var = C58784w3.f168295a;
                C51978xi1 xi12 = G5 != null ? G5.field_ctrInfo : null;
                C58739j4 j4Var = C58739j4.f168176a;
                if (R5 != null && xi12 != null) {
                    int i2 = (xi12.f144670e == 16 || R5.f184502d == 6) ? 2 : 3;
                    StringBuilder sb = new StringBuilder();
                    sb.append(((C7606d) C86312j.m106911c(C7606d.class)).mo8743rq());
                    sb.append('-');
                    sb.append(C31543z5.m39453c());
                    String sb4 = sb.toString();
                    C58413v0 v0Var = C58413v0.f167346a;
                    C87412m.m108591d(G5);
                    C58413v0.m67779g(v0Var, "1", G5, R5, i2, str, i, "8001-" + C31543z5.m39453c(), sb4, 0, aVar, 256, (Object) null);
                }
            }
        }

        /* renamed from: c */
        public final void mo2453c(String str, int i) {
            boolean z;
            Class cls = FinderCommonFeatureService.class;
            C87412m.m108594g(str, "contextId");
            if (C37715b.f99914a.mo61298a()) {
                ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0();
                z = ((C66446g) C86312j.m106911c(C66446g.class)).mo61610jK();
            } else {
                z = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77229H5();
            }
            if (z) {
                C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("NearbyEntrance");
                C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("NearbyEntrance");
                C58784w3 w3Var = C58784w3.f168295a;
                C51978xi1 xi12 = G5 != null ? G5.field_ctrInfo : null;
                C58739j4 j4Var = C58739j4.f168176a;
                if (R5 != null && xi12 != null) {
                    int i2 = (xi12.f144670e == 16 || R5.f184502d == 6) ? 2 : 3;
                    C58413v0 v0Var = C58413v0.f167346a;
                    C87412m.m108591d(G5);
                    C58413v0.m67778f(v0Var, "1", G5, R5, i2, str, i, 0, 0, 192, (Object) null);
                }
            }
        }

        /* renamed from: d */
        public final String mo2454d(String str, int i, int i2, C60165e4.C46105a aVar) {
            C87412m.m108594g(str, "contextId");
            C87412m.m108594g(aVar, "dslRenderInfo");
            if (!((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77253Y5()) {
                return null;
            }
            String e = mo2455e("FinderEntrance", str, i, i2, aVar);
            mo2455e("FinderMentionEntrance", str, i, i2, new C60165e4.C46105a(0, 0, 3, (C8480h) null));
            return e;
        }

        /* renamed from: e */
        public final String mo2455e(String str, String str2, int i, int i2, C60165e4.C46105a aVar) {
            String str3 = str;
            Class cls = FinderCommonFeatureService.class;
            C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5(str3);
            C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5(str3);
            C58784w3 w3Var = C58784w3.f168295a;
            C51978xi1 xi12 = G5 != null ? G5.field_ctrInfo : null;
            C58739j4 j4Var = C58739j4.f168176a;
            if (R5 == null || xi12 == null) {
                return "";
            }
            String str4 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77275o(str3).report_ext_info;
            String str5 = str4 == null ? "" : str4;
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
            int i3 = xi12.f144670e;
            String str6 = xi12.f144673h;
            String str7 = str6 == null ? "" : str6;
            String nullAs = Util.nullAs(R5.f184504f, "");
            C87412m.m108593f(nullAs, "nullAs(showInfo.title, \"\")");
            y0Var.Mx0("1", i3, 2, 0, str7, nullAs, xi12.f144686x, str2, R5.f184502d, str5, i);
            C58413v0 v0Var = C58413v0.f167346a;
            C87412m.m108591d(G5);
            v0Var.getClass();
            C87412m.m108594g(aVar, "dslRenderInfo");
            C49712hj1 hj12 = new C49712hj1();
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = "";
            }
            hj12.f134670d = Wb;
            hj12.f134671e = str2;
            hj12.f134672f = "";
            C51978xi1 xi13 = xi12;
            C58413v0.m67780h(v0Var, "1", G5, R5, 2, hj12, i, 0, (String) null, 0, i2, (String) null, 0, aVar, C1824s.CTRL_INDEX, (Object) null);
            if (C87412m.m108589b(str3, "FinderEntrance") && i == 0) {
                C20480e0 e0Var = C20480e0.f57583a;
                C20480e0.f57586d = G5;
            }
            return xi13.f144673h;
        }

        /* renamed from: f */
        public final void mo2456f(int i, C49712hj1 hj12, int i2, boolean z) {
            int i3 = i;
            C87412m.m108594g(hj12, "contextObj");
            FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
            C64586nn1 R5 = Nx0.mo77246R5("TLFollow");
            C55718s0 G5 = Nx0.mo77227G5("TLFollow");
            C58784w3 w3Var = C58784w3.f168295a;
            C51978xi1 xi12 = G5 != null ? G5.field_ctrInfo : null;
            C58739j4 j4Var = C58739j4.f168176a;
            if (R5 != null && xi12 != null) {
                String str = xi12.f144673h;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                if (i3 != 2 || !C87412m.m108589b(C2483o0.f12986c, str2)) {
                    C7335d c = C86312j.m106911c(C58417y0.class);
                    C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                    String str3 = str2;
                    C55718s0 s0Var = G5;
                    C58417y0.Nx0((C58417y0) c, "2", 7, i, 1, 0, 0, str2, (String) null, xi12.f144686x, hj12, i2, z ? 1 : 0, 128, (Object) null);
                    C58413v0 v0Var = C58413v0.f167346a;
                    C87412m.m108591d(s0Var);
                    C58413v0.m67780h(v0Var, "2", s0Var, R5, i, hj12, z ? 1 : 0, i2, (String) null, 0, 0, (String) null, 0, (C60165e4.C46105a) null, 8064, (Object) null);
                    if (i == 2) {
                        C2483o0.f12986c = str3;
                    }
                }
            }
        }

        /* renamed from: g */
        public final void mo2457g(int i, C49712hj1 hj12, int i2, boolean z) {
            int i3 = i;
            C87412m.m108594g(hj12, "contextObj");
            FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
            C64586nn1 R5 = Nx0.mo77246R5("TLRecommendTab");
            C55718s0 G5 = Nx0.mo77227G5("TLRecommendTab");
            C58784w3 w3Var = C58784w3.f168295a;
            C51978xi1 xi12 = G5 != null ? G5.field_ctrInfo : null;
            C58739j4 j4Var = C58739j4.f168176a;
            if (R5 != null && xi12 != null) {
                String str = xi12.f144673h;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                if (i3 != 2 || !C87412m.m108589b(C2483o0.f12985b, str2)) {
                    C7335d c = C86312j.m106911c(C58417y0.class);
                    C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                    String str3 = str2;
                    C55718s0 s0Var = G5;
                    C58417y0.Nx0((C58417y0) c, "2", 8, i, 1, 0, 0, str2, (String) null, xi12.f144686x, hj12, i2, z ? 1 : 0, 128, (Object) null);
                    C58413v0 v0Var = C58413v0.f167346a;
                    C87412m.m108591d(s0Var);
                    C58413v0.m67780h(v0Var, "2", s0Var, R5, i, hj12, z ? 1 : 0, i2, (String) null, 0, 0, (String) null, 0, (C60165e4.C46105a) null, 8064, (Object) null);
                    if (i == 2) {
                        C2483o0.f12985b = str3;
                    }
                }
            }
        }

        /* renamed from: h */
        public final void mo2458h(int i, C49712hj1 hj12) {
            C87412m.m108594g(hj12, "contextObj");
            FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
            C64586nn1 R5 = Nx0.mo77246R5("finder_tl_nearby_tab");
            C55718s0 G5 = Nx0.mo77227G5("finder_tl_nearby_tab");
            C58784w3 w3Var = C58784w3.f168295a;
            C51978xi1 xi12 = G5 != null ? G5.field_ctrInfo : null;
            C58739j4 j4Var = C58739j4.f168176a;
            if (R5 != null && xi12 != null) {
                C7335d c = C86312j.m106911c(C58417y0.class);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                C58417y0 y0Var = (C58417y0) c;
                String str = xi12.f144673h;
                if (str == null) {
                    str = "";
                }
                C58417y0.Nx0(y0Var, "2", 3, i, 1, 1, 0, str, (String) null, 0, hj12, 0, 0, 3456, (Object) null);
                C58413v0 v0Var = C58413v0.f167346a;
                C87412m.m108591d(G5);
                C58413v0.m67781i(v0Var, "2", G5, R5, i, hj12, 0, (String) null, 2, 0, JsApiNFCStartHCE.CTRL_INDEX, (Object) null);
            }
        }

        /* renamed from: i */
        public final void mo2459i(int i, C49712hj1 hj12, int i2, boolean z) {
            int i3 = i;
            C87412m.m108594g(hj12, "contextObj");
            FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
            C64586nn1 R5 = Nx0.mo77246R5("finder_tl_hot_tab");
            C55718s0 G5 = Nx0.mo77227G5("finder_tl_hot_tab");
            C58784w3 w3Var = C58784w3.f168295a;
            C51978xi1 xi12 = G5 != null ? G5.field_ctrInfo : null;
            C58739j4 j4Var = C58739j4.f168176a;
            if (R5 != null && xi12 != null) {
                String str = xi12.f144673h;
                String str2 = str == null ? "" : str;
                if (i3 != 2 || !C87412m.m108589b(C2483o0.f12987d, str2)) {
                    C7335d c = C86312j.m106911c(C58417y0.class);
                    C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                    C58417y0 y0Var = (C58417y0) c;
                    String str3 = xi12.f144673h;
                    String str4 = str2;
                    C55718s0 s0Var = G5;
                    C58417y0.Nx0(y0Var, "2", 3, i, 1, 2, 0, str3 == null ? "" : str3, (String) null, 0, hj12, i2, z ? 1 : 0, 384, (Object) null);
                    C58413v0 v0Var = C58413v0.f167346a;
                    C87412m.m108591d(s0Var);
                    C58413v0.m67780h(v0Var, "2", s0Var, R5, i, hj12, z ? 1 : 0, i2, (String) null, 0, 0, (String) null, 0, (C60165e4.C46105a) null, 8064, (Object) null);
                    if (i == 2) {
                        C2483o0.f12987d = str4;
                    }
                }
            }
        }

        /* renamed from: j */
        public final String mo2460j(int i, C49712hj1 hj12, String str) {
            String str2 = str;
            Class cls = C58417y0.class;
            Class cls2 = FinderCommonFeatureService.class;
            C87412m.m108594g(str2, "lastExposeTipsId");
            FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0();
            C64586nn1 R5 = Nx0.mo77246R5("TLPersonalCenter");
            C55718s0 G5 = Nx0.mo77227G5("TLPersonalCenter");
            C58784w3 w3Var = C58784w3.f168295a;
            C51978xi1 xi12 = null;
            C51978xi1 xi13 = G5 != null ? G5.field_ctrInfo : null;
            C58739j4 j4Var = C58739j4.f168176a;
            String str3 = "";
            if (R5 == null || xi13 == null) {
                return str3;
            }
            if (i == 1) {
                String str4 = xi13.f144673h;
                if (str4 != null) {
                    str3 = str4;
                }
                if (C87412m.m108589b(str2, str3)) {
                    return str3;
                }
            }
            String str5 = str3;
            C58413v0 v0Var = C58413v0.f167346a;
            C87412m.m108591d(G5);
            C58413v0.m67781i(v0Var, "2", G5, R5, i, hj12, 0, (String) null, 0, 0, 480, (Object) null);
            C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
            int i2 = c != null ? c.field_systemMsgCount : 0;
            C37521f.f99374d.getClass();
            int i3 = C37521f.f99420i1.mo60266n().intValue() == 1 ? 0 : 2;
            if (i2 > 0) {
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
                C58417y0.Nx0((C58417y0) c2, "2", 4, i, 1, i3, i2, (String) null, (String) null, 0, hj12, 0, 0, 3520, (Object) null);
            } else {
                C64586nn1 R52 = Nx0.mo77246R5("Personal_Center_FavList_Entrance");
                C55718s0 G52 = Nx0.mo77227G5("Personal_Center_FavList_Entrance");
                if (G52 != null) {
                    xi12 = G52.field_ctrInfo;
                }
                if (!(R52 == null || xi12 == null)) {
                    C7335d c3 = C86312j.m106911c(cls);
                    C87412m.m108593f(c3, "getService(FinderReportLogic::class.java)");
                    C58417y0.Nx0((C58417y0) c3, "2", 6, i, 1, 0, 0, (String) null, (String) null, 0, hj12, 0, 0, 3520, (Object) null);
                    C87412m.m108591d(G52);
                    C58413v0.m67781i(v0Var, "2", G52, R52, i, hj12, 0, (String) null, 0, 0, 480, (Object) null);
                }
                C64586nn1 R53 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77246R5("TLCamera");
                C55718s0 G53 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77227G5("TLCamera");
                if (!(R53 == null || G53 == null)) {
                    C7335d c4 = C86312j.m106911c(cls);
                    C87412m.m108593f(c4, "getService(FinderReportLogic::class.java)");
                    C58417y0.Nx0((C58417y0) c4, "2", 2, i, 1, 1, 0, (String) null, (String) null, 0, hj12, 0, 0, 3520, (Object) null);
                    C58413v0.m67781i(v0Var, "2", G53, R53, i, hj12, 0, (String) null, 0, 0, 480, (Object) null);
                }
            }
            return str5;
        }

        /* renamed from: k */
        public final void mo2461k(int i, C49712hj1 hj12, int i2, String str) {
            String str2;
            String str3;
            int i3 = i;
            C49712hj1 hj13 = hj12;
            C87412m.m108594g(str, "clickSubTabContext");
            FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
            C64586nn1 R5 = Nx0.mo77246R5("NearbyLiveTab");
            C55718s0 G5 = Nx0.mo77227G5("NearbyLiveTab");
            C58784w3 w3Var = C58784w3.f168295a;
            C51978xi1 xi12 = G5 != null ? G5.field_ctrInfo : null;
            C58739j4 j4Var = C58739j4.f168176a;
            if (R5 != null && xi12 != null) {
                String str4 = xi12.f144673h;
                String str5 = str4 == null ? "" : str4;
                if (i3 != 2 || !C87412m.m108589b(C2483o0.f12994k, str5)) {
                    String str6 = (hj13 == null || (str3 = hj13.f134671e) == null) ? "" : str3;
                    String str7 = (hj13 == null || (str2 = hj13.f134672f) == null) ? "" : str2;
                    C58413v0 v0Var = C58413v0.f167346a;
                    C87412m.m108591d(G5);
                    C58413v0.m67779g(v0Var, "9", G5, R5, i, str6, i2, str7, str, 0, (C60165e4.C46105a) null, 768, (Object) null);
                    if (i3 == 2) {
                        C2483o0.f12994k = str5;
                    }
                }
            }
        }

        /* renamed from: l */
        public final void mo2462l(int i, C49712hj1 hj12) {
            int i2 = i;
            FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
            C64586nn1 R5 = Nx0.mo77246R5("NearbyPeopleTab");
            C55718s0 G5 = Nx0.mo77227G5("NearbyPeopleTab");
            C58784w3 w3Var = C58784w3.f168295a;
            C51978xi1 xi12 = G5 != null ? G5.field_ctrInfo : null;
            C58739j4 j4Var = C58739j4.f168176a;
            if (R5 != null && xi12 != null) {
                String str = xi12.f144673h;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                if (i2 != 3 || !C87412m.m108589b(C2483o0.f12995l, str2)) {
                    C58413v0 v0Var = C58413v0.f167346a;
                    C87412m.m108591d(G5);
                    C58413v0.m67781i(v0Var, "9", G5, R5, i, hj12, 0, (String) null, 0, 0, 480, (Object) null);
                    if (i2 == 3) {
                        C2483o0.f12995l = str2;
                    }
                }
            }
        }

        /* renamed from: m */
        public final void mo2463m(int i, C49712hj1 hj12) {
            int i2 = i;
            FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
            C64586nn1 R5 = Nx0.mo77246R5("NearbyFeedTab");
            C55718s0 G5 = Nx0.mo77227G5("NearbyFeedTab");
            C58784w3 w3Var = C58784w3.f168295a;
            C51978xi1 xi12 = G5 != null ? G5.field_ctrInfo : null;
            C58739j4 j4Var = C58739j4.f168176a;
            if (R5 != null && xi12 != null) {
                String str = xi12.f144673h;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                if (i2 != 2 || !C87412m.m108589b(C2483o0.f12993j, str2)) {
                    C58413v0 v0Var = C58413v0.f167346a;
                    C87412m.m108591d(G5);
                    C58413v0.m67781i(v0Var, "9", G5, R5, i, hj12, 0, (String) null, 0, 0, 480, (Object) null);
                    if (i2 == 2) {
                        C2483o0.f12993j = str2;
                    }
                }
            }
        }
    }
}
