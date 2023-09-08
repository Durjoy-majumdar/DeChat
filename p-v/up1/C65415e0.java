package up1;

import bp3.C104160f;
import com.tencent.p014mm.autogen.mmdata.rpt.MvCardActionReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import ht1.C60205t5;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C62602o;
import rc0.C63389c;
import te3.C64488kb1;
import te3.C64719t23;

/* renamed from: up1.e0 */
public final class C65415e0 {

    /* renamed from: a */
    public static final C65415e0 f188260a = new C65415e0();

    /* renamed from: a */
    public final C101106m mo89503a(C64488kb1 kb12, String str, int i) {
        C101106m mVar = new C101106m();
        mVar.f295959d = i;
        mVar.f295960e = str;
        mVar.f295972t = kb12.f183907g;
        mVar.f295964i = kb12.f183911n;
        mVar.f295962g = kb12.f183904d;
        mVar.f295963h = kb12.f183905e;
        String str2 = kb12.f183912o;
        mVar.f295965j = str2;
        mVar.f295976x = str2;
        mVar.f295968p = kb12.f183908h;
        mVar.f295966n = kb12.f183906f;
        boolean z = true;
        mVar.f295958T = true;
        if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_new_music_use_network_data_play, C104160f.RepairerConfig_Mv_UseNetworkDataPlay_Int, 0) != 1) {
            z = false;
        }
        mVar.f295952M = z;
        if (!Util.isNullOrNil(kb12.f183922y)) {
            mVar.f295954P = kb12.f183922y;
        }
        return mVar;
    }

    /* renamed from: b */
    public final void mo89504b(C64488kb1 kb12, String str, int i, C64719t23 t232) {
        C101106m a = mo89503a(kb12, str, i);
        ((C63389c) C86312j.m106911c(C63389c.class)).mo88294IM(a, C62602o.m73561a(str, t232));
        if (t232 != null) {
            if (!(!Util.isNullOrNil(t232.f185470r))) {
                t232 = null;
            }
            if (t232 != null) {
                a.f295954P = t232.f185470r;
            }
        }
        C101093a.m132488j(a);
        MvCardActionReportStruct mvCardActionReportStruct = new MvCardActionReportStruct();
        mvCardActionReportStruct.f156518j = 1;
        mvCardActionReportStruct.f156519k = 8;
        C60205t5.m70388b(mvCardActionReportStruct);
    }

    /* renamed from: c */
    public final boolean mo89505c(String str) {
        C87412m.m108594g(str, "playId");
        C101106m b = C101093a.m132480b();
        if ((b != null ? b.f295960e : null) != null && b.f295959d == 0 && C101093a.m132481c()) {
            try {
                if (Util.isEqual(b.f295960e, str)) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void mo89506d(C64488kb1 kb12, String str, int i, String str2) {
        C87412m.m108594g(kb12, "musicSongInfo");
        C87412m.m108594g(str, "musicId");
        C87412m.m108594g(str2, "musicCoverUrl");
        if (!mo89505c(str)) {
            Log.m105924i("FinderMvLogic", "playMusic");
            C101106m a = mo89503a(kb12, str, i);
            ((C63389c) C86312j.m106911c(C63389c.class)).mo88294IM(a, C62602o.m73562b(str, (C64719t23) null, str2));
            C101093a.m132488j(a);
            return;
        }
        Log.m105924i("FinderMvLogic", "same music");
    }

    /* renamed from: e */
    public final void mo89507e(C64488kb1 kb12, String str, int i, C64719t23 t232) {
        C87412m.m108594g(kb12, "musicSongInfo");
        C87412m.m108594g(str, "musicId");
        if (!mo89505c(str)) {
            Log.m105924i("FinderMvLogic", "playMusic");
            C101106m a = mo89503a(kb12, str, i);
            ((C63389c) C86312j.m106911c(C63389c.class)).mo88294IM(a, C62602o.m73561a(str, t232));
            if (t232 != null) {
                if (!(!Util.isNullOrNil(t232.f185470r))) {
                    t232 = null;
                }
                if (t232 != null) {
                    a.f295954P = t232.f185470r;
                }
            }
            C101093a.m132488j(a);
            return;
        }
        Log.m105924i("FinderMvLogic", "same music");
    }

    /* renamed from: f */
    public final void mo89508f(C64488kb1 kb12, C64719t23 t232, String str, int i, String str2) {
        C87412m.m108594g(kb12, "musicSongInfo");
        C87412m.m108594g(str, "musicId");
        C101106m a = mo89503a(kb12, str, i);
        a.f295953N = false;
        if (t232 != null) {
            C64719t23 t233 = Util.isNullOrNil(t232.f185470r) ^ true ? t232 : null;
            if (t233 != null) {
                a.f295954P = t233.f185470r;
            }
        }
        ((C63389c) C86312j.m106911c(C63389c.class)).mo88294IM(a, C62602o.m73562b(str, t232, str2));
        C101093a.m132488j(a);
    }
}
