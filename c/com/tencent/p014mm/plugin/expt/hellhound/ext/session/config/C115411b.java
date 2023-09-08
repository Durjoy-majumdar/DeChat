package com.tencent.p014mm.plugin.expt.hellhound.ext.session.config;

import android.text.TextUtils;
import ba1.C113151b;
import ba1.C113153e;
import ba1.C16777c;
import ba1.C28274h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d91.C20449a;
import e91.C116711b;
import gy3.C8480h;
import gy3.C87412m;
import ha1.C20933a;
import ja1.C21208a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import op3.C117877b;
import op3.C117882j;
import sx3.C64197v;
import te3.C110971t14;
import te3.C110974w14;
import te3.C118439k14;
import te3.C118441l14;
import te3.C22505ka3;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.expt.hellhound.ext.session.config.b */
public final class C115411b {

    /* renamed from: a */
    public static final C115412a f345922a = new C115412a((C8480h) null);

    /* renamed from: b */
    public static final List<C28274h> f345923b = C64197v.m75537f(new C28274h("999", "MainUI", C64197v.m75534c("ChattingUIFragment", "ChattingUI")), new C28274h("998", "MainUI", C64197v.m75534c("BizConversationUI")), new C28274h("104", "MainUI", C64197v.m75534c("BizTimeLineUI")), new C28274h("105", "MainUI", C64197v.m75534c("AppBrandLaunchProxyUI", "AppBrandUI", "AppBrandUI1", "AppBrandUI2", "AppBrandUI3", "AppBrandUI4")), new C28274h("105", "MainUI", C64197v.m75534c("AppBrandUI", "AppBrandUI1", "AppBrandUI2", "AppBrandUI3", "AppBrandUI4")), new C28274h("105", "LauncherUI", C64197v.m75534c("AppBrandLaunchProxyUI", "AppBrandUI", "AppBrandUI1", "AppBrandUI2", "AppBrandUI3", "AppBrandUI4")), new C28274h("105", "LauncherUI", C64197v.m75534c("AppBrandUI", "AppBrandUI1", "AppBrandUI2", "AppBrandUI3", "AppBrandUI4")), new C28274h("105", "MainUI", C64197v.m75534c("AppBrandLauncherUI")), new C28274h("105", "LauncherUI", C64197v.m75534c("AppBrandLauncherUI")), new C28274h("105", "WXShortcutEntryActivity", C64197v.m75534c("AppBrandLaunchProxyUI", "AppBrandUI", "AppBrandUI1", "AppBrandUI2", "AppBrandUI3", "AppBrandUI4")), new C28274h("105", "AddressUIFragment", C64197v.m75534c("AppBrandLaunchProxyUI", "AppBrandUI", "AppBrandUI1", "AppBrandUI2", "AppBrandUI3", "AppBrandUI4")), new C28274h("105", "MvvmAddressUIFragment", C64197v.m75534c("AppBrandLaunchProxyUI", "AppBrandUI", "AppBrandUI1", "AppBrandUI2", "AppBrandUI3", "AppBrandUI4")), new C28274h("105", "FindMoreFriendsUI", C64197v.m75534c("AppBrandLaunchProxyUI", "AppBrandUI", "AppBrandUI1", "AppBrandUI2", "AppBrandUI3", "AppBrandUI4")), new C28274h("105", "MoreTabUI", C64197v.m75534c("AppBrandLaunchProxyUI", "AppBrandUI", "AppBrandUI1", "AppBrandUI2", "AppBrandUI3", "AppBrandUI4")), new C28274h("113", "MainUI", C64197v.m75534c("ReaderAppUI")), new C28274h("114", "AddressUIFragment", C64197v.m75534c("FTSMainUI")), new C28274h("114", "MvvmAddressUIFragment", C64197v.m75534c("FTSMainUI")), new C28274h("147", "FindMoreFriendsUI", C64197v.m75534c("FTSMainUI")), new C28274h("115", "AddressUIFragment", C64197v.m75534c("AddMoreFriendsUI")), new C28274h("115", "MvvmAddressUIFragment", C64197v.m75534c("AddMoreFriendsUI")), new C28274h("116", "AddressUIFragment", C64197v.m75534c("FMessageConversationUI")), new C28274h("116", "MvvmAddressUIFragment", C64197v.m75534c("FMessageConversationUI")), new C28274h("117", "AddressUIFragment", C64197v.m75534c("ChatroomContactUI")), new C28274h("117", "MvvmAddressUIFragment", C64197v.m75534c("ChatroomContactUI")), new C28274h("118", "AddressUIFragment", C64197v.m75534c("ContactLabelManagerUI")), new C28274h("118", "MvvmAddressUIFragment", C64197v.m75534c("ContactLabelManagerUI")), new C28274h("106", "MainUI", C64197v.m75534c("FTSMainUI")), new C28274h("107", "MainUI", C64197v.m75534c("SelectContactUI")), new C28274h("107", "AddressUIFragment", C64197v.m75534c("SelectContactUI")), new C28274h("107", "MvvmAddressUIFragment", C64197v.m75534c("SelectContactUI")), new C28274h("107", "FindMoreFriendsUI", C64197v.m75534c("SelectContactUI")), new C28274h("108", "MainUI", C64197v.m75534c("AddMoreFriendsUI")), new C28274h("108", "AddressUIFragment", C64197v.m75534c("AddMoreFriendsUI")), new C28274h("108", "MvvmAddressUIFragment", C64197v.m75534c("AddMoreFriendsUI")), new C28274h("108", "FindMoreFriendsUI", C64197v.m75534c("AddMoreFriendsUI")), new C28274h("109", "MainUI", C64197v.m75534c("BaseScanUI")), new C28274h("109", "AddressUIFragment", C64197v.m75534c("BaseScanUI")), new C28274h("109", "MvvmAddressUIFragment", C64197v.m75534c("BaseScanUI")), new C28274h("109", "FindMoreFriendsUI", C64197v.m75534c("BaseScanUI")), new C28274h("110", "MainUI", C64197v.m75534c("WalletOfflineEntranceUI")), new C28274h("110", "AddressUIFragment", C64197v.m75534c("WalletOfflineEntranceUI")), new C28274h("110", "MvvmAddressUIFragment", C64197v.m75534c("WalletOfflineEntranceUI")), new C28274h("110", "FindMoreFriendsUI", C64197v.m75534c("WalletOfflineEntranceUI")), new C28274h("119", "AddressUIFragment", C64197v.m75534c("BrandServiceIndexUI")), new C28274h("119", "MvvmAddressUIFragment", C64197v.m75534c("BrandServiceIndexUI")), new C28274h("120", "AddressUIFragment", C64197v.m75534c("EnterpriseBizContactListUI")), new C28274h("120", "MvvmAddressUIFragment", C64197v.m75534c("EnterpriseBizContactListUI")), new C28274h("121", "AddressUIFragment", C64197v.m75534c("OpenIMAddressUI")), new C28274h("121", "MvvmAddressUIFragment", C64197v.m75534c("OpenIMAddressUI")), new C28274h("122", "AddressUIFragment", C64197v.m75534c("ContactInfoUI")), new C28274h("122", "MvvmAddressUIFragment", C64197v.m75534c("ContactInfoUI")), new C28274h("123", "FindMoreFriendsUI", C64197v.m75534c("SnsTimeLineUI", "ImproveSnsTimelineUI")), new C28274h("124", "FindMoreFriendsUI", C64197v.m75534c("BaseScanUI")), new C28274h("125", "FindMoreFriendsUI", C64197v.m75534c("ShakeReportUI")), new C28274h("126", "FindMoreFriendsUI", C64197v.m75534c("TopStoryHomeUI")), new C28274h("127", "FindMoreFriendsUI", C64197v.m75534c("FTSSOSHomeWebViewUI")), new C28274h("128", "FindMoreFriendsUI", C64197v.m75534c("NearbyFriendsIntroUI", "NearbyFriendsUI", "NearbyPersonalInfoUI", "NearbyFriendShowSayHiUI")), new C28274h("129", "FindMoreFriendsUI", C64197v.m75534c("BottleBeachUI")), new C28274h("130", "FindMoreFriendsUI", C64197v.m75534c("AppBrandPluginUI")), new C28274h("131", "FindMoreFriendsUI", C64197v.m75534c("WebViewUI", "1", "jd_store")), new C28274h("131", "FindMoreFriendsUI", C64197v.m75534c("AppBrandLaunchProxyUI", "AppBrandUI", "AppBrandUI1", "AppBrandUI2", "AppBrandUI3", "AppBrandUI4")), new C28274h("132", "FindMoreFriendsUI", C64197v.m75534c("GameWebViewUI")), new C28274h("132", "FindMoreFriendsUI", C64197v.m75534c("GameCenterUI")), new C28274h("132", "FindMoreFriendsUI", C64197v.m75534c("LuggageGameWebViewUI")), new C28274h("133", "FindMoreFriendsUI", C64197v.m75534c("AppBrandLauncherUI")), new C28274h("134", "MoreTabUI", C64197v.m75534c("SettingsPersonalInfoUI")), new C28274h("135", "MoreTabUI", C64197v.m75534c("MallIndexUI", "MallIndexUIv2")), new C28274h("136", "MoreTabUI", C64197v.m75534c("FavoriteIndexUI")), new C28274h("137", "MoreTabUI", C64197v.m75534c("SnsUserUI", "AlbumUI")), new C28274h("138", "MoreTabUI", C64197v.m75534c("CardHomePageNewUI", "CardHomePageUI", "CardIndexUI", "CardInvalidCardUI", "CardViewUI", "ShareCardListUI", "CardHomePageV3UI")), new C28274h("139", "MoreTabUI", C64197v.m75534c("EmojiStoreV2UI", "MMFlutterActivity")), new C28274h("140", "MoreTabUI", C64197v.m75534c("SettingsUI")), new C28274h("141", "MoreTabUI", C64197v.m75534c("StoryCaptureUI", "MMRecordUI")), new C28274h("142", "MoreTabUI", C64197v.m75534c("StoryGalleryView", "StoryVideoView")), new C28274h("143", "FindMoreFriendsUI", C64197v.m75534c("FinderTimelineUI")), new C28274h("143", "FindMoreFriendsUI", C64197v.m75534c("FinderHomeUI")), new C28274h("143", "FindMoreFriendsUI", C64197v.m75534c("FinderHomeAffinityUI")), new C28274h("143", "FindMoreFriendsUI", C64197v.m75534c("FinderConversationUI")), new C28274h("143", "AddressUIFragment", C64197v.m75534c("FinderTimelineUI")), new C28274h("143", "MvvmAddressUIFragment", C64197v.m75534c("FinderTimelineUI")), new C28274h("143", "FinderHomeUI", C64197v.m75534c("FinderSelfUI")), new C28274h("996", "FindMoreFriendsUI", C64197v.m75534c("FinderMultiTaskRouterUI")), new C28274h("996", "ChattingUIFragment", C64197v.m75534c("FinderMultiTaskRouterUI")), new C28274h("996", "SnsTimeLineUI", C64197v.m75534c("FinderMultiTaskRouterUI")), new C28274h("145", "LauncherUI", C64197v.m75534c("FloatingBall")), new C28274h("146", "LauncherUI", C64197v.m75534c("VideoActivity")), new C28274h("149", "AddressUIFragment", C64197v.m75534c("OnlyChatContactMgrUI")), new C28274h("149", "MvvmAddressUIFragment", C64197v.m75534c("OnlyChatContactMgrUI")), new C28274h("150", "FindMoreFriendsUI", C64197v.m75534c("NearbyHomeUI", "OccupyFinderUI11", "NearbyUI")), new C28274h("151", "MoreTabUI", C64197v.m75534c("FinderProfileUI")), new C28274h("152", "FindMoreFriendsUI", C64197v.m75534c("FinderLiveFindPageUI")));

    /* renamed from: com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a */
    public static final class C115412a {
        public C115412a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo175244a(String str) {
            C87412m.m108594g(str, "session");
            if (str.length() <= 3) {
                return str;
            }
            if (C112550d0.m153801u(str, "_", false)) {
                return (String) C112550d0.m153785U(str, new String[]{"_"}, false, 0, 6, (Object) null).get(0);
            }
            String substring = str.substring(0, 3);
            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: b */
        public final boolean mo175245b() {
            if (!C20449a.m22052d()) {
                Log.m105924i("HABBYGE-MALI.HellKSessionConfig", "HellSessionMonitor monitor, fetchHellhoundConfig: FALSE");
                return true;
            }
            HellSessionCloudConfig.m162211a().getClass();
            C118441l14 a = C113151b.m154818a();
            if ((a == null ? true : a.f354092d) || C116711b.m164584i() == 0) {
                Log.m105924i("HABBYGE-MALI.HellKSessionConfig", "HellSessionMonitor monitor FALSE");
                return true;
            } else if (C20449a.m22053e()) {
                return false;
            } else {
                Log.m105924i("HABBYGE-MALI.HellKSessionConfig", "HellSessionMonitor monitor, close !!!");
                return true;
            }
        }

        /* renamed from: c */
        public final String mo175246c() {
            C22505ka3 e = C16777c.m16413e();
            String str = e == null ? null : e.f64087d;
            if (str == null) {
                return null;
            }
            return mo175244a(str);
        }

        /* renamed from: d */
        public final String mo175247d(int i) {
            HellSessionCloudConfig.m162211a().getClass();
            C118441l14 a = C113151b.m154818a();
            if (a == null) {
                return mo175248e(i);
            }
            if (a.f354092d) {
                Log.m105920e("HABBYGE-MALI.HellKSessionConfig", "getRealChatSid, configCloud.isDel");
                return "-1";
            }
            Iterator<C118439k14> it = a.f354095g.iterator();
            while (it.hasNext()) {
                C118439k14 next = it.next();
                if (next != null) {
                    Log.m105924i("HABBYGE-MALI.HellKSessionConfig", "getRealChatSid, chatConfig.expect=" + next.f354068g);
                    if (Util.getInt(next.f354068g, -1) == i) {
                        String str = next.f354065d;
                        C87412m.m108593f(str, "chatConfig.sid");
                        return str;
                    }
                }
            }
            return mo175248e(i);
        }

        /* renamed from: e */
        public final String mo175248e(int i) {
            String str = i != 0 ? i != 1 ? i != 2 ? i != 4 ? i != 5 ? "-1" : "112" : "111" : "103" : "102" : "101";
            Log.m105924i("HABBYGE-MALI.HellKSessionConfig", "getRealChatSidLocal: " + str);
            return str;
        }

        /* renamed from: f */
        public final String mo175249f(String str, String str2, List<String> list) {
            String h = C116711b.m164583h(str);
            String h2 = C116711b.m164583h(str2);
            Log.m105924i("HABBYGE-MALI.HellKSessionConfig", "getSessionIdLocal: " + h + ", " + h2);
            if ((C87412m.m108589b("ChattingUI", str2) || C87412m.m108589b("ChattingUIFragment", str2)) && (C87412m.m108589b("MainUI", h) || TextUtils.isEmpty(h))) {
                Log.m105924i("HABBYGE-MALI.HellKSessionConfig", "getSidId: 999");
                return "999";
            } else if (C87412m.m108589b("WebViewUI", h2) && ((C87412m.m108589b("FindMoreFriendsUI", h) || C87412m.m108589b("MainUI", h) || C87412m.m108589b("AddressUIFragment", h) || C87412m.m108589b("MvvmAddressUIFragment", h)) && C21208a.f59984c)) {
                return "148";
            } else {
                if (C87412m.m108589b("BaseScanUI", h2)) {
                    if (C20933a.f59283b) {
                        return "124";
                    }
                    if (C21208a.f59982a) {
                        return "109";
                    }
                }
                if (list == null || list.isEmpty()) {
                    for (C28274h next : C115411b.f345923b) {
                        if (TextUtils.isEmpty(h)) {
                            return null;
                        }
                        if (C87412m.m108589b(h, next.f77847b)) {
                            for (String b : next.f77848c) {
                                if (C87412m.m108589b(h2, b)) {
                                    return C87412m.m108589b(next.f77846a, "109") ? C21208a.f59982a ? "109" : "124" : (C87412m.m108589b(next.f77846a, "105") || C87412m.m108589b(next.f77846a, "131")) ? C20933a.f59282a ? "131" : "105" : next.f77846a;
                                }
                            }
                            continue;
                        }
                    }
                    return null;
                }
                boolean z = false;
                int i = 0;
                for (C28274h next2 : C115411b.f345923b) {
                    if (TextUtils.isEmpty(h)) {
                        return null;
                    }
                    if (C87412m.m108589b(h, next2.f77847b)) {
                        Iterator<String> it = next2.f77848c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String next3 = it.next();
                            if (z) {
                                if (i < list.size()) {
                                    int i2 = i + 1;
                                    if (!C87412m.m108589b(next3, list.get(i))) {
                                        z = false;
                                        i = 0;
                                        break;
                                    }
                                    i = i2;
                                } else {
                                    return next2.f77846a;
                                }
                            } else if (!C87412m.m108589b(h2, next3)) {
                                break;
                            } else {
                                z = true;
                                i = 0;
                            }
                        }
                        if (z) {
                            return next2.f77846a;
                        }
                    }
                }
                return null;
            }
        }

        /* renamed from: g */
        public final String mo175250g(String str) {
            if (str == null) {
                return null;
            }
            boolean z = true;
            if (C112550d0.m153801u(str, ".", false)) {
                if (C87412m.m108589b(str, "com.tencent.mm.ui.conversation.MainUI")) {
                    return "0";
                }
                if (!C87412m.m108589b(str, "com.tencent.mm.ui.contact.AddressUI.AddressUIFragment")) {
                    z = C87412m.m108589b(str, "com.tencent.mm.ui.contact.address.MvvmAddressUIFragment");
                }
                return z ? "1" : C87412m.m108589b(str, "com.tencent.mm.ui.FindMoreFriendsUI") ? "2" : C87412m.m108589b(str, "com.tencent.mm.ui.MoreTabUI") ? "3" : str;
            } else if (C87412m.m108589b(str, "MainUI")) {
                return "0";
            } else {
                if (!C87412m.m108589b(str, "AddressUIFragment")) {
                    z = C87412m.m108589b(str, "MvvmAddressUIFragment");
                }
                return z ? "1" : C87412m.m108589b(str, "FindMoreFriendsUI") ? "2" : C87412m.m108589b(str, "MoreTabUI") ? "3" : str;
            }
        }

        /* renamed from: h */
        public final boolean mo175251h(String str) {
            return C87412m.m108589b("101", str) || C87412m.m108589b("102", str) || C87412m.m108589b("103", str) || C87412m.m108589b("111", str) || C87412m.m108589b("112", str);
        }

        /* renamed from: i */
        public final boolean mo175252i(String str) {
            switch (str.hashCode()) {
                case 48:
                    if (str.equals("0")) {
                        return false;
                    }
                    break;
                case 49:
                    if (str.equals("1")) {
                        return false;
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        return false;
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        return false;
                    }
                    break;
            }
            return C116711b.m164591p(str);
        }

        /* renamed from: j */
        public final C117877b<String, String> mo175253j(String str) {
            if (str == null || C87412m.m108596i(str.length(), 4) <= 0) {
                return null;
            }
            List U = C112550d0.m153785U(str, new String[]{"_"}, false, 0, 6, (Object) null);
            if (C87412m.m108596i(U.size(), 2) != 0) {
                return null;
            }
            return C117882j.m166284c(U.get(0), U.get(1));
        }
    }

    /* renamed from: a */
    public static final void m162218a(C22505ka3 ka32) {
        C117877b<String, String> j;
        C115412a aVar = f345922a;
        if (ka32 != null && (j = aVar.mo175253j(ka32.f64087d)) != null && C87412m.m108589b("999", j.mo182596a(0))) {
            String d = aVar.mo175247d(ka32.f64091h);
            ka32.f64087d = d + '_' + j.mo182596a(1);
        }
    }

    /* renamed from: b */
    public static final String m162219b(String str) {
        return f345922a.mo175244a(str);
    }

    /* renamed from: c */
    public static final boolean m162220c() {
        return f345922a.mo175245b();
    }

    /* renamed from: d */
    public static final String m162221d(long j, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('_');
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: e */
    public static final String m162222e(C22505ka3 ka32) {
        C115412a aVar = f345922a;
        if (ka32 == null) {
            return null;
        }
        C117877b<String, String> j = aVar.mo175253j(ka32.f64087d);
        if (j == null) {
            return ka32.f64087d;
        }
        if (!C87412m.m108589b("999", j.mo182596a(0))) {
            String str = ka32.f64087d;
            C87412m.m108593f(str, "pageSession.sessionId");
            return aVar.mo175244a(str);
        }
        Log.m105924i("HABBYGE-MALI.HellKSessionConfig", "getRealChatSessionId: " + ka32.f64091h);
        return aVar.mo175247d(ka32.f64091h);
    }

    /* renamed from: f */
    public static final List<C110974w14> m162223f(String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return null;
        }
        HellSessionPageCloudConfig.m162212a().getClass();
        C110971t14 a = C113153e.m154822a();
        if (a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C110974w14> it = a.f332264d.iterator();
        while (it.hasNext()) {
            C110974w14 next = it.next();
            if (next != null && next.f332319i == 0) {
                if (C87412m.m108589b(next.f332314d, str) || C87412m.m108589b(next.f332314d, "-1")) {
                    if (z && !next.f332318h) {
                        next = null;
                    }
                    if (next != null) {
                        arrayList.add(next);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x025b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m162224g(android.app.Activity r22, java.lang.String r23, java.lang.String r24, java.util.List<java.lang.String> r25) {
        /*
            r0 = r24
            r1 = r25
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a r2 = f345922a
            java.lang.String r3 = e91.C116711b.m164583h(r23)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getSidId: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = ", "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "HABBYGE-MALI.HellKSessionConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionCloudConfig r4 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.HellSessionCloudConfig.m162211a()
            r4.getClass()
            te3.l14 r4 = ba1.C113151b.m154818a()
            java.lang.String r6 = "FinderHomeAffinityUI"
            java.lang.String r8 = "155"
            java.lang.String r9 = "148"
            if (r4 != 0) goto L_0x004a
            java.lang.String r7 = r2.mo175249f(r3, r0, r1)
            if (r7 != 0) goto L_0x0280
            boolean r0 = gy3.C87412m.m108589b(r6, r0)
            if (r0 == 0) goto L_0x0280
        L_0x0047:
            r7 = r8
            goto L_0x0280
        L_0x004a:
            boolean r10 = r4.f354092d
            if (r10 == 0) goto L_0x0056
            java.lang.String r0 = "getSidId, sessionCloud.isDel ture"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            r7 = 0
            goto L_0x0280
        L_0x0056:
            java.lang.String r10 = "ChattingUI"
            boolean r10 = gy3.C87412m.m108589b(r10, r0)
            java.lang.String r11 = "MainUI"
            if (r10 != 0) goto L_0x0068
            java.lang.String r10 = "ChattingUIFragment"
            boolean r10 = gy3.C87412m.m108589b(r10, r0)
            if (r10 == 0) goto L_0x0076
        L_0x0068:
            boolean r10 = gy3.C87412m.m108589b(r11, r3)
            if (r10 != 0) goto L_0x0279
            boolean r10 = android.text.TextUtils.isEmpty(r3)
            if (r10 == 0) goto L_0x0076
            goto L_0x0279
        L_0x0076:
            java.lang.String r10 = "WebViewUI"
            boolean r10 = gy3.C87412m.m108589b(r10, r0)
            java.lang.String r12 = "131"
            r13 = 0
            r14 = 1
            if (r10 == 0) goto L_0x00e0
            java.lang.String r10 = "FindMoreFriendsUI"
            boolean r10 = gy3.C87412m.m108589b(r10, r3)
            if (r10 == 0) goto L_0x00c1
            te3.m14 r10 = r4.f354096h
            if (r10 == 0) goto L_0x00ba
            if (r1 == 0) goto L_0x00e0
            int r9 = r25.size()
            r10 = 2
            if (r9 < r10) goto L_0x00e0
            te3.m14 r9 = r4.f354096h
            java.lang.String r9 = r9.f354132g
            java.lang.Object r10 = r1.get(r13)
            boolean r9 = gy3.C87412m.m108589b(r9, r10)
            if (r9 == 0) goto L_0x00e0
            te3.m14 r9 = r4.f354096h
            java.lang.String r9 = r9.f354133h
            java.lang.Object r10 = r1.get(r14)
            boolean r9 = gy3.C87412m.m108589b(r9, r10)
            if (r9 == 0) goto L_0x00e0
            java.lang.String r0 = "getSidId, SESSION_ID_WebViewUI_jd_store"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x018a
        L_0x00ba:
            boolean r10 = ja1.C21208a.f59984c
            if (r10 == 0) goto L_0x00e0
            ja1.C21208a.f59984c = r13
            goto L_0x00dd
        L_0x00c1:
            boolean r10 = gy3.C87412m.m108589b(r11, r3)
            if (r10 != 0) goto L_0x00d7
            java.lang.String r10 = "AddressUIFragment"
            boolean r10 = gy3.C87412m.m108589b(r10, r3)
            if (r10 != 0) goto L_0x00d7
            java.lang.String r10 = "MvvmAddressUIFragment"
            boolean r10 = gy3.C87412m.m108589b(r10, r3)
            if (r10 == 0) goto L_0x00e0
        L_0x00d7:
            boolean r10 = ja1.C21208a.f59984c
            if (r10 == 0) goto L_0x00e0
            ja1.C21208a.f59984c = r13
        L_0x00dd:
            r7 = r9
            goto L_0x0280
        L_0x00e0:
            java.lang.String r9 = "BaseScanUI"
            boolean r9 = gy3.C87412m.m108589b(r9, r0)
            java.lang.String r10 = "124"
            java.lang.String r11 = "109"
            if (r9 == 0) goto L_0x00fb
            boolean r9 = ha1.C20933a.f59283b
            if (r9 == 0) goto L_0x00f4
            ha1.C20933a.f59283b = r13
            goto L_0x016a
        L_0x00f4:
            boolean r9 = ja1.C21208a.f59982a
            if (r9 == 0) goto L_0x00fb
            ja1.C21208a.f59982a = r13
            goto L_0x0167
        L_0x00fb:
            if (r1 == 0) goto L_0x0103
            boolean r9 = r25.isEmpty()
            if (r9 == 0) goto L_0x0267
        L_0x0103:
            java.util.LinkedList<te3.n14> r4 = r4.f354094f
            java.util.Iterator r4 = r4.iterator()
        L_0x0109:
            boolean r9 = r4.hasNext()
            java.lang.String r15 = ","
            java.lang.String r7 = "config.pageName"
            if (r9 == 0) goto L_0x0193
            java.lang.Object r9 = r4.next()
            te3.n14 r9 = (te3.C118446n14) r9
            if (r9 != 0) goto L_0x011c
            goto L_0x0109
        L_0x011c:
            java.lang.String r14 = r9.f354147e
            boolean r14 = gy3.C87412m.m108589b(r14, r3)
            if (r14 == 0) goto L_0x0190
            java.lang.String r14 = r9.f354148f
            gy3.C87412m.m108593f(r14, r7)
            java.lang.String[] r17 = new java.lang.String[]{r15}
            r18 = 0
            r19 = 0
            r20 = 6
            r21 = 0
            r16 = r14
            java.util.List r7 = z04.C112550d0.m153785U(r16, r17, r18, r19, r20, r21)
            java.util.Iterator r7 = r7.iterator()
        L_0x013f:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L_0x0190
            java.lang.Object r14 = r7.next()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.CharSequence r14 = z04.C112550d0.m153799i0(r14)
            java.lang.String r14 = r14.toString()
            boolean r14 = gy3.C87412m.m108589b(r14, r0)
            if (r14 == 0) goto L_0x013f
            java.lang.String r0 = r9.f354146d
            boolean r0 = gy3.C87412m.m108589b(r0, r11)
            if (r0 == 0) goto L_0x016d
            boolean r0 = ja1.C21208a.f59982a
            if (r0 == 0) goto L_0x016a
            ja1.C21208a.f59982a = r13
        L_0x0167:
            r7 = r11
            goto L_0x0280
        L_0x016a:
            r7 = r10
            goto L_0x0280
        L_0x016d:
            java.lang.String r0 = r9.f354146d
            java.lang.String r1 = "105"
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 != 0) goto L_0x0184
            java.lang.String r0 = r9.f354146d
            boolean r0 = gy3.C87412m.m108589b(r0, r12)
            if (r0 == 0) goto L_0x0180
            goto L_0x0184
        L_0x0180:
            java.lang.String r7 = r9.f354146d
            goto L_0x0280
        L_0x0184:
            boolean r0 = ha1.C20933a.f59282a
            if (r0 == 0) goto L_0x018d
            ha1.C20933a.f59282a = r13
        L_0x018a:
            r7 = r12
            goto L_0x0280
        L_0x018d:
            r7 = r1
            goto L_0x0280
        L_0x0190:
            r14 = 1
            goto L_0x0109
        L_0x0193:
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionCloudConfig r4 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.HellSessionCloudConfig.m162211a()
            r4.getClass()
            te3.l14 r4 = ba1.C113151b.m154818a()
            if (r4 != 0) goto L_0x01a2
            goto L_0x0263
        L_0x01a2:
            java.util.LinkedList<te3.p14> r4 = r4.f354097i
            java.util.Iterator r4 = r4.iterator()
        L_0x01a8:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x0263
            java.lang.Object r9 = r4.next()
            te3.p14 r9 = (te3.C118455p14) r9
            if (r9 != 0) goto L_0x01b7
            goto L_0x01a8
        L_0x01b7:
            java.util.LinkedList<te3.o14> r10 = r9.f354217g
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x01c0
            goto L_0x01a8
        L_0x01c0:
            java.lang.String r10 = r9.f354215e
            boolean r10 = gy3.C87412m.m108589b(r10, r3)
            if (r10 != 0) goto L_0x01c9
            goto L_0x01a8
        L_0x01c9:
            java.lang.String r10 = r9.f354216f
            gy3.C87412m.m108593f(r10, r7)
            java.lang.String[] r17 = new java.lang.String[]{r15}
            r18 = 0
            r19 = 0
            r20 = 6
            r21 = 0
            r16 = r10
            java.util.List r10 = z04.C112550d0.m153785U(r16, r17, r18, r19, r20, r21)
            java.util.Iterator r10 = r10.iterator()
        L_0x01e4:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01a8
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.CharSequence r11 = z04.C112550d0.m153799i0(r11)
            java.lang.String r11 = r11.toString()
            boolean r11 = gy3.C87412m.m108589b(r11, r0)
            if (r11 == 0) goto L_0x01e4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "getIdentifySidExpect, sid: "
            r11.append(r12)
            java.lang.String r12 = r9.f354214d
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)
            java.util.LinkedList<te3.o14> r11 = r9.f354217g
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x021f
        L_0x021c:
            r17 = r4
            goto L_0x0253
        L_0x021f:
            java.util.LinkedList<te3.o14> r11 = r9.f354217g     // Catch:{ Exception -> 0x0255 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ Exception -> 0x0255 }
            r12 = r22
        L_0x0227:
            boolean r14 = r11.hasNext()     // Catch:{ Exception -> 0x0255 }
            if (r14 == 0) goto L_0x021c
            java.lang.Object r14 = r11.next()     // Catch:{ Exception -> 0x0255 }
            te3.o14 r14 = (te3.C118448o14) r14     // Catch:{ Exception -> 0x0255 }
            if (r12 != 0) goto L_0x0246
            java.lang.String r13 = "MoreTabUI"
            r17 = r4
            java.lang.String r4 = r9.f354215e     // Catch:{ Exception -> 0x0257 }
            boolean r4 = r13.equals(r4)     // Catch:{ Exception -> 0x0257 }
            if (r4 == 0) goto L_0x0248
            androidx.fragment.app.FragmentActivity r12 = e91.C116711b.m164582g()     // Catch:{ Exception -> 0x0257 }
            goto L_0x0248
        L_0x0246:
            r17 = r4
        L_0x0248:
            boolean r4 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115410a.m162217a(r12, r14)     // Catch:{ Exception -> 0x0257 }
            if (r4 != 0) goto L_0x024f
            goto L_0x0258
        L_0x024f:
            r4 = r17
            r13 = 0
            goto L_0x0227
        L_0x0253:
            r4 = 1
            goto L_0x0259
        L_0x0255:
            r17 = r4
        L_0x0257:
        L_0x0258:
            r4 = 0
        L_0x0259:
            if (r4 == 0) goto L_0x025f
            java.lang.String r4 = r9.f354214d
            r7 = r4
            goto L_0x0264
        L_0x025f:
            r4 = r17
            r13 = 0
            goto L_0x01e4
        L_0x0263:
            r7 = 0
        L_0x0264:
            if (r7 == 0) goto L_0x0267
            goto L_0x0280
        L_0x0267:
            boolean r4 = gy3.C87412m.m108589b(r6, r0)
            if (r4 == 0) goto L_0x026f
            goto L_0x0047
        L_0x026f:
            java.lang.String r4 = "get sid by cloud config, but NULL, dignose sid By local config !!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            java.lang.String r7 = r2.mo175249f(r3, r0, r1)
            goto L_0x0280
        L_0x0279:
            java.lang.String r0 = "getSidId: 999"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            java.lang.String r7 = "999"
        L_0x0280:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162224g(android.app.Activity, java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    /* renamed from: h */
    public static final String m162225h(String str) {
        return f345922a.mo175250g(str);
    }

    /* renamed from: i */
    public static final String m162226i(String str) {
        C115412a aVar = f345922a;
        if (str == null) {
            return null;
        }
        if (!C112550d0.m153801u(str, "_", false)) {
            return str;
        }
        List U = C112550d0.m153785U(str, new String[]{"_"}, false, 0, 6, (Object) null);
        return aVar.mo175250g((String) U.get(0)) + '_' + ((String) U.get(1));
    }

    /* renamed from: j */
    public static final boolean m162227j(String str) {
        C115412a aVar = f345922a;
        if (str == null) {
            return false;
        }
        String a = aVar.mo175244a(str);
        return C87412m.m108589b("999", a) || aVar.mo175251h(a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m162228k() {
        /*
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a r0 = f345922a
            java.lang.String r1 = r0.mo175246c()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x002c
            if (r1 != 0) goto L_0x0011
            goto L_0x0026
        L_0x0011:
            java.lang.String r0 = r0.mo175244a(r1)
            java.lang.String r1 = "104"
            boolean r1 = gy3.C87412m.m108589b(r1, r0)
            if (r1 != 0) goto L_0x0028
            java.lang.String r1 = "998"
            boolean r0 = gy3.C87412m.m108589b(r1, r0)
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            if (r0 == 0) goto L_0x002c
            r3 = 1
        L_0x002c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162228k():boolean");
    }

    /* renamed from: l */
    public static final boolean m162229l(String str) {
        C115412a aVar = f345922a;
        if (str == null) {
            return false;
        }
        return C87412m.m108589b("145", aVar.mo175244a(str));
    }

    /* renamed from: m */
    public static final String m162230m(C22505ka3 ka32) {
        C115412a aVar = f345922a;
        if (ka32 == null) {
            return null;
        }
        C117877b<String, String> j = aVar.mo175253j(ka32.f64087d);
        if (j == null) {
            return ka32.f64087d;
        }
        if (!C87412m.m108589b("999", j.mo182596a(0))) {
            Object a = j.mo182596a(0);
            if (!(a instanceof Integer) || -1 != ((Number) a).intValue()) {
                return ka32.f64087d;
            }
        }
        String str = aVar.mo175247d(ka32.f64091h) + '_' + j.mo182596a(1);
        ka32.f64087d = str;
        return str;
    }
}
