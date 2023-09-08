package fn3;

import android.text.TextUtils;
import com.tencent.p014mm.autogen.mmdata.rpt.DiscoverNearbyEntranceStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderRedDotNewStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C31543z5;
import gt1.C20838b;
import h81.C59774i;
import ht1.C60165e4;
import ht1.C60200t1;
import ht1.C76243a5;
import ns3.C11266d;
import p147ea.C7606d;

/* renamed from: fn3.a */
public final class C59263a {

    /* renamed from: a */
    public static final C59263a f169449a = new C59263a();

    /* renamed from: b */
    public static String f169450b = "";

    /* renamed from: c */
    public static String f169451c = "";

    /* renamed from: a */
    public static final String m69189a() {
        if (TextUtils.isEmpty(f169451c)) {
            f169451c = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76802R1(23, 2, ((C7606d) C86312j.m106911c(C7606d.class)).K80(94));
        }
        return f169451c;
    }

    /* renamed from: b */
    public static final String m69190b() {
        Class cls = C60200t1.class;
        Class cls2 = C11266d.class;
        if (TextUtils.isEmpty(f169450b)) {
            if (((C20838b) C86312j.m106911c(C20838b.class)).mo32540ag()) {
                f169450b = ((C60200t1) C86312j.m106911c(cls)).mo76802R1(12, 2, ((C11266d) C86312j.m106911c(cls2)).l00());
            } else {
                f169450b = ((C60200t1) C86312j.m106911c(cls)).mo76802R1(12, 2, ((C11266d) C86312j.m106911c(cls2)).l00());
            }
        }
        return f169450b;
    }

    /* renamed from: c */
    public static final void m69191c(long j) {
        long j2 = 2;
        long j3 = j != 0 ? 2 : 1;
        FinderRedDotNewStruct finderRedDotNewStruct = new FinderRedDotNewStruct();
        finderRedDotNewStruct.f155960m = finderRedDotNewStruct.mo86045b("CurrUI", "1", true);
        finderRedDotNewStruct.f155967t = finderRedDotNewStruct.mo86045b("SessionID", Util.nullAsNil(((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb()), true);
        finderRedDotNewStruct.f155961n = finderRedDotNewStruct.mo86045b("ContextID", m69190b(), true);
        finderRedDotNewStruct.f155951d = 1011;
        finderRedDotNewStruct.f155952e = finderRedDotNewStruct.mo86045b("RedDotTipsID", "FinderLocal_" + ((((float) C31543z5.m39453c()) * 1.0f) / ((float) 100000)), true);
        finderRedDotNewStruct.f155953f = finderRedDotNewStruct.mo86045b("RedDotShowInfoPath", "NearbyEntrance", true);
        finderRedDotNewStruct.f155954g = finderRedDotNewStruct.mo86045b("RedDotShowInfoParentPath", "Discovery", true);
        finderRedDotNewStruct.f155955h = j3;
        finderRedDotNewStruct.f155956i = j;
        finderRedDotNewStruct.f155957j = finderRedDotNewStruct.mo86045b("RedDotShowInfoTitle", "", true);
        finderRedDotNewStruct.f155958k = finderRedDotNewStruct.mo86045b("RedDotShowInfoExt", "", true);
        finderRedDotNewStruct.f155959l = (long) 1;
        finderRedDotNewStruct.f155962o = finderRedDotNewStruct.mo86045b("ClickTabContextID", "1011-" + C31543z5.m39453c(), true);
        finderRedDotNewStruct.f155963p = 1;
        finderRedDotNewStruct.f155964q = 1;
        finderRedDotNewStruct.f155965r = 1;
        finderRedDotNewStruct.f155966s = ((C60165e4) C86312j.m106911c(C60165e4.class)).mo85165dP();
        finderRedDotNewStruct.f155968u = C31543z5.m39453c() / ((long) 1000);
        finderRedDotNewStruct.f155969v = finderRedDotNewStruct.mo86045b("RedDotShowInfoIconUrl", "", true);
        finderRedDotNewStruct.f155970w = 1;
        if (((C76243a5) C86312j.m106911c(C76243a5.class)).mo13242lh()) {
            j2 = 1;
        }
        finderRedDotNewStruct.f155971x = j2;
        finderRedDotNewStruct.mo86054n();
    }

    /* renamed from: d */
    public static final void m69192d() {
        f169449a.mo84408e(2, ((C20838b) C86312j.m106911c(C20838b.class)).mo32539RP() ? 3 : 1, m69189a());
    }

    /* renamed from: e */
    public final void mo84408e(long j, long j2, String str) {
        DiscoverNearbyEntranceStruct discoverNearbyEntranceStruct = new DiscoverNearbyEntranceStruct();
        discoverNearbyEntranceStruct.f154971d = C31543z5.m39453c();
        discoverNearbyEntranceStruct.f154972e = j;
        discoverNearbyEntranceStruct.f154974g = discoverNearbyEntranceStruct.mo86045b("ContextID", str, true);
        discoverNearbyEntranceStruct.f154973f = discoverNearbyEntranceStruct.mo86045b("SessionID", Util.nullAsNil(((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb()), true);
        discoverNearbyEntranceStruct.f154975h = j2;
        discoverNearbyEntranceStruct.mo86054n();
        Log.m105924i("FindMoreFriendsReporter", "report " + discoverNearbyEntranceStruct.mo1006q());
    }
}
