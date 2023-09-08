package rm1;

import android.text.TextUtils;
import c30.C104289g;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct;
import com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment;
import com.tencent.p014mm.plugin.finder.nearby.live.localcity.NearbyLiveLocalCityFragment;
import com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment;
import com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import gg1.C32444a;
import gy3.C87412m;
import h81.C59774i;
import p565ir.C60606n;
import te3.C51942x91;
import z04.C112551y;

/* renamed from: rm1.a */
public final class C13087a {

    /* renamed from: a */
    public static final C13087a f37254a = new C13087a();

    /* renamed from: b */
    public static String f37255b = "";

    /* renamed from: c */
    public static String f37256c = "";

    /* renamed from: d */
    public static String f37257d = "";

    /* renamed from: e */
    public static long f37258e = 0;

    /* renamed from: f */
    public static boolean f37259f = true;

    /* renamed from: g */
    public static String f37260g = "";

    /* renamed from: h */
    public static int f37261h = -1;

    /* renamed from: i */
    public static int f37262i = -1;

    /* renamed from: j */
    public static boolean f37263j;

    /* renamed from: a */
    public final void mo12580a(String str, AbsNearByFragment absNearByFragment, String str2, String str3) {
        C87412m.m108594g(str, "contextId");
        C87412m.m108594g(absNearByFragment, "fragment");
        C87412m.m108594g(str2, "clickTabContextId");
        C87412m.m108594g(str3, "byPass");
        Log.m105924i("FinderLiveSquareTabLifeCycleReport", "enterLiveSquare contextId:" + str + " clickTabContextId:" + str2 + " byPass:" + str3);
        f37255b = str;
        absNearByFragment.mo3553U();
        f37258e = 0;
        f37256c = str2;
        f37260g = str3;
        if (absNearByFragment instanceof NearbyLiveSquareFragment) {
            C32444a aVar = C32444a.f86121a;
            f37261h = C32444a.f86187q1.mo60266n().intValue();
        }
    }

    /* renamed from: b */
    public final void mo12581b(AbsNearByFragment absNearByFragment) {
        String str;
        C51942x91 x912;
        if (f37263j) {
            Log.m105928w("FinderLiveSquareTabLifeCycleReport", "liveTabPageIn return for isInOnPauseState");
        } else if ((absNearByFragment instanceof NearbyLiveSquareTabFragment) || (absNearByFragment instanceof NearbyLiveLocalCityFragment)) {
            String U = absNearByFragment.mo3553U();
            String T = absNearByFragment.mo3552T();
            NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment = absNearByFragment instanceof NearbyLiveSquareTabFragment ? (NearbyLiveSquareTabFragment) absNearByFragment : null;
            if (nearbyLiveSquareTabFragment == null || (x912 = nearbyLiveSquareTabFragment.f15691s) == null || (str = Integer.valueOf(x912.f144531d).toString()) == null) {
                str = "";
            }
            int R = absNearByFragment.mo2203R();
            String str2 = "page_tab_" + U + '_' + T;
            String S = absNearByFragment.mo3551S();
            if (!(str.length() == 0)) {
                str2 = str2 + '_' + str;
            }
            if (TextUtils.isEmpty(f37257d)) {
                if (R / 100000 == 80 || R == 80) {
                    f37257d = "page_live_flow";
                }
            }
            String valueOf = String.valueOf(R);
            String str3 = f37257d;
            FinderBroadcastPageInStruct finderBroadcastPageInStruct = new FinderBroadcastPageInStruct();
            finderBroadcastPageInStruct.f9756d = C31543z5.m39453c();
            finderBroadcastPageInStruct.mo1022u(str2);
            finderBroadcastPageInStruct.f9758f = finderBroadcastPageInStruct.mo86045b("tab_id", U, true);
            finderBroadcastPageInStruct.f9759g = finderBroadcastPageInStruct.mo86045b("sub_tab_id", T, true);
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = "";
            }
            finderBroadcastPageInStruct.f9760h = finderBroadcastPageInStruct.mo86045b("sessionid", Wb, true);
            finderBroadcastPageInStruct.mo1021t(f37255b);
            finderBroadcastPageInStruct.f9762j = finderBroadcastPageInStruct.mo86045b("TabContextID", f37256c, true);
            finderBroadcastPageInStruct.f9763k = finderBroadcastPageInStruct.mo86045b("SubTabContextID", S, true);
            finderBroadcastPageInStruct.mo1023v("");
            finderBroadcastPageInStruct.f9765m = finderBroadcastPageInStruct.mo86045b("ref_page_id", str3, true);
            finderBroadcastPageInStruct.mo1020s(valueOf);
            C104289g gVar = new C104289g();
            int i = f37261h;
            if (i != -1) {
                gVar.mo145967r("is_new_square", Integer.valueOf(i));
                gVar.mo145967r("enter_type", Integer.valueOf(f37262i));
            }
            mo12583d(gVar);
            String gVar2 = gVar.toString();
            C87412m.m108593f(gVar2, "pgUdfKv.toString()");
            finderBroadcastPageInStruct.mo1023v(C112551y.m153814n(gVar2, ",", ";", false));
            finderBroadcastPageInStruct.f9767o = finderBroadcastPageInStruct.mo86045b("switch_extra", ((C60606n) C86312j.m106911c(C60606n.class)).tx0(), true);
            finderBroadcastPageInStruct.mo86054n();
            Log.m105924i("FinderLiveSquareTabLifeCycleReport", "liveTabPageIn " + finderBroadcastPageInStruct.mo1006q());
            f37257d = str2;
            f37258e = C31543z5.m39453c();
            f37259f = false;
        }
    }

    /* renamed from: c */
    public final void mo12582c(AbsNearByFragment absNearByFragment) {
        String str;
        C51942x91 x912;
        if (f37259f) {
            Log.m105928w("FinderLiveSquareTabLifeCycleReport", "liveTabPageOut return for isNeverPageIn");
        } else if ((absNearByFragment instanceof NearbyLiveSquareTabFragment) || (absNearByFragment instanceof NearbyLiveLocalCityFragment)) {
            String U = absNearByFragment.mo3553U();
            String T = absNearByFragment.mo3552T();
            NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment = absNearByFragment instanceof NearbyLiveSquareTabFragment ? (NearbyLiveSquareTabFragment) absNearByFragment : null;
            String str2 = "";
            if (nearbyLiveSquareTabFragment == null || (x912 = nearbyLiveSquareTabFragment.f15691s) == null || (str = Integer.valueOf(x912.f144531d).toString()) == null) {
                str = str2;
            }
            int R = absNearByFragment.mo2203R();
            String str3 = "page_tab_" + U + '_' + T;
            String S = absNearByFragment.mo3551S();
            if (!(str.length() == 0)) {
                str3 = str3 + '_' + str;
            }
            absNearByFragment.f15529q = str2;
            String valueOf = String.valueOf(R);
            FinderBroadcastPageOutStruct finderBroadcastPageOutStruct = new FinderBroadcastPageOutStruct();
            finderBroadcastPageOutStruct.f9768d = C31543z5.m39453c();
            finderBroadcastPageOutStruct.mo1026u(str3);
            finderBroadcastPageOutStruct.f9770f = finderBroadcastPageOutStruct.mo86045b("tab_id", U, true);
            finderBroadcastPageOutStruct.f9771g = finderBroadcastPageOutStruct.mo86045b("sub_tab_id", T, true);
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = str2;
            }
            finderBroadcastPageOutStruct.f9772h = finderBroadcastPageOutStruct.mo86045b("sessionid", Wb, true);
            finderBroadcastPageOutStruct.mo1025t(f37255b);
            finderBroadcastPageOutStruct.f9774j = finderBroadcastPageOutStruct.mo86045b("TabContextID", f37256c, true);
            finderBroadcastPageOutStruct.f9775k = finderBroadcastPageOutStruct.mo86045b("SubTabContextID", S, true);
            if (f37258e > 0) {
                C104289g gVar = new C104289g();
                gVar.mo145954o("staytime", C31543z5.m39453c() - f37258e);
                int i = f37261h;
                if (i != -1) {
                    gVar.mo145967r("is_new_square", Integer.valueOf(i));
                    gVar.mo145967r("enter_type", Integer.valueOf(f37262i));
                }
                mo12583d(gVar);
                String gVar2 = gVar.toString();
                C87412m.m108593f(gVar2, "pgUdfKv.toString()");
                str2 = C112551y.m153814n(gVar2, ",", ";", false);
            }
            finderBroadcastPageOutStruct.mo1027v(str2);
            finderBroadcastPageOutStruct.mo1024s(valueOf);
            finderBroadcastPageOutStruct.f9778n = finderBroadcastPageOutStruct.mo86045b("switch_extra", ((C60606n) C86312j.m106911c(C60606n.class)).tx0(), true);
            finderBroadcastPageOutStruct.mo86054n();
            Log.m105924i("FinderLiveSquareTabLifeCycleReport", "liveTabPageOut " + finderBroadcastPageOutStruct.mo1006q());
        }
    }

    /* renamed from: d */
    public final void mo12583d(C104289g gVar) {
        C87412m.m108594g(gVar, "jsonObject");
        if (TextUtils.isEmpty(f37260g)) {
            Log.m105924i("FinderLiveSquareTabLifeCycleReport", "parseByPassToJson byPass is empty.");
            return;
        }
        try {
            C104289g gVar2 = new C104289g(f37260g);
            String optString = gVar2.optString("appId");
            String optString2 = gVar2.optString("versionType");
            if (!TextUtils.isEmpty(optString)) {
                gVar.put("appid", optString);
            }
            if (!TextUtils.isEmpty(optString2)) {
                gVar.put("versiontype", optString2);
            }
        } catch (Throwable unused) {
            Log.m105924i("FinderLiveSquareTabLifeCycleReport", "parseByPassToJson error.");
        }
    }
}
