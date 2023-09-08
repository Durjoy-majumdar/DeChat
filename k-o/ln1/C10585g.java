package ln1;

import androidx.fragment.app.FragmentActivity;
import bl3.C39818r;
import com.tencent.p014mm.autogen.mmdata.rpt.NearbyStayandSwitchTabStruct;
import com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58398q1;
import dp1.C58417y0;
import eb0.C31543z5;
import gy3.C87412m;
import h81.C59774i;
import ht1.C60200t1;
import ns3.C11268g;
import p185kq.C10383h;
import rs1.C13442s8;

/* renamed from: ln1.g */
public final class C10585g implements C11268g {

    /* renamed from: a */
    public static final C10585g f31933a = new C10585g();

    /* renamed from: b */
    public static String f31934b = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76802R1(12, 1, 94);

    /* renamed from: c */
    public static long f31935c = C31543z5.m39453c();

    /* renamed from: d */
    public static long f31936d = C31543z5.m39453c();

    /* renamed from: e */
    public static String f31937e = "";

    /* renamed from: f */
    public static String f31938f = "1001";

    /* renamed from: a */
    public void mo10843a(String str) {
        C87412m.m108594g(str, "contextId");
        Log.m105924i("NearbyTabLifecycleReporter", "Nearby setContextId:" + str);
        f31934b = str;
    }

    /* renamed from: b */
    public String mo10844b() {
        return f31938f;
    }

    /* renamed from: c */
    public final void mo10845c() {
        mo10846d("all", f31935c, C31543z5.m39453c(), f31938f, 1);
    }

    /* renamed from: d */
    public final void mo10846d(String str, long j, long j2, String str2, long j3) {
        long j4 = j;
        long j5 = j2;
        NearbyStayandSwitchTabStruct nearbyStayandSwitchTabStruct = new NearbyStayandSwitchTabStruct();
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        nearbyStayandSwitchTabStruct.f10010d = nearbyStayandSwitchTabStruct.mo86045b("SessionID", Wb, true);
        String str3 = str;
        nearbyStayandSwitchTabStruct.f10011e = nearbyStayandSwitchTabStruct.mo86045b("PageName", str, true);
        long j6 = j5 - j4;
        if (j6 <= 0) {
            j6 = 0;
        }
        nearbyStayandSwitchTabStruct.f10012f = j6;
        nearbyStayandSwitchTabStruct.mo86046c("StayTimeMs", j6);
        nearbyStayandSwitchTabStruct.f10013g = j4;
        nearbyStayandSwitchTabStruct.mo86046c("EnterTimeMs", j4);
        nearbyStayandSwitchTabStruct.f10014h = j5;
        nearbyStayandSwitchTabStruct.mo86046c("ExitTimeMs", j5);
        nearbyStayandSwitchTabStruct.f10015i = nearbyStayandSwitchTabStruct.mo86045b("ClickTabContextID", str2, true);
        nearbyStayandSwitchTabStruct.f10016j = nearbyStayandSwitchTabStruct.mo86045b("Sid", "", true);
        nearbyStayandSwitchTabStruct.f10017k = j3;
        nearbyStayandSwitchTabStruct.f10018l = nearbyStayandSwitchTabStruct.mo86045b("ContextID", f31934b, true);
        nearbyStayandSwitchTabStruct.mo86054n();
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(nearbyStayandSwitchTabStruct);
    }

    /* renamed from: e */
    public final void mo10847e(AbsNearByFragment absNearByFragment) {
        String str;
        FragmentActivity activity;
        if (absNearByFragment == null || (str = absNearByFragment.mo3553U()) == null) {
            str = "";
        }
        f31938f = str + '-' + C31543z5.m39453c();
        StringBuilder sb = new StringBuilder();
        sb.append("switchInNearbyTab: currentClickTabContextID=");
        sb.append(f31938f);
        Log.m105924i("NearbyTabLifecycleReporter", sb.toString());
        if (absNearByFragment != null && (activity = absNearByFragment.getActivity()) != null) {
            C13442s8 f = C13442s8.f38060Q0.mo12873f(activity);
            if (f != null) {
                f.f38100p = f31938f;
                C58398q1 q1Var = f.f38071F;
                if (q1Var != null) {
                    q1Var.mo83246K1(f.mo12861q3());
                }
            }
            C13442s8 s8Var = (C13442s8) C39818r.f106831a.mo62445d(absNearByFragment).mo75002a(C13442s8.class);
            s8Var.f38100p = f31938f;
            C58398q1 q1Var2 = s8Var.f38071F;
            if (q1Var2 != null) {
                q1Var2.mo83246K1(s8Var.mo12861q3());
            }
        }
    }

    /* renamed from: f */
    public final void mo10848f(AbsNearByFragment absNearByFragment) {
        String str;
        Class cls = C10383h.class;
        if (absNearByFragment == null || (str = absNearByFragment.mo3554V()) == null) {
            str = "";
        }
        long c = C31543z5.m39453c();
        ((C10383h) C86312j.m106911c(cls)).mo10697OK(f31934b);
        ((C10383h) C86312j.m106911c(cls)).rn0(f31938f);
        mo10846d(str, f31936d, c, f31938f, 0);
        f31937e = f31938f;
        f31936d = c;
    }

    public String getContextId() {
        return f31934b;
    }
}
