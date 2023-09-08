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
import te3.C64719t23;
import te3.C64726td1;

/* renamed from: up1.k0 */
public final class C65417k0 {

    /* renamed from: a */
    public static final C65417k0 f188264a = new C65417k0();

    /* renamed from: a */
    public final C101106m mo89510a(C64726td1 td12, String str, int i) {
        C87412m.m108594g(td12, "musicInfo");
        C87412m.m108594g(str, "musicId");
        C101106m mVar = new C101106m();
        mVar.f295959d = i;
        mVar.f295960e = str;
        mVar.f295972t = td12.f185540j;
        mVar.f295964i = td12.f185538h;
        mVar.f295962g = td12.f185536f;
        mVar.f295963h = td12.f185537g;
        mVar.f295965j = td12.f185542o;
        mVar.f295976x = td12.f185535e;
        mVar.f295968p = td12.f185541n;
        mVar.f295966n = td12.f185539i;
        boolean z = true;
        mVar.f295958T = true;
        mVar.f295954P = td12.f185534d;
        if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_new_music_use_network_data_play, C104160f.RepairerConfig_Mv_UseNetworkDataPlay_Int, 0) != 1) {
            z = false;
        }
        mVar.f295952M = z;
        return mVar;
    }

    /* renamed from: b */
    public final void mo89511b(C64726td1 td12, String str, int i, C64719t23 t232) {
        C101106m a = mo89510a(td12, str, i);
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
    }

    /* renamed from: c */
    public final boolean mo89512c(C64726td1 td12, String str, int i, C64719t23 t232) {
        C87412m.m108594g(td12, "musicSongInfo");
        C87412m.m108594g(str, "musicId");
        C101106m b = C101093a.m132480b();
        if ((b != null ? b.f295960e : null) == null || !Util.isEqual(b.f295960e, str)) {
            Log.m105924i("FinderMvLogic", "playMusic");
            mo89511b(td12, str, i, t232);
            return false;
        } else if (C101093a.m132481c()) {
            MvCardActionReportStruct mvCardActionReportStruct = new MvCardActionReportStruct();
            mvCardActionReportStruct.f156518j = 2;
            mvCardActionReportStruct.f156519k = 8;
            C60205t5.m70388b(mvCardActionReportStruct);
            C101093a.m132490l();
            return true;
        } else {
            mo89511b(td12, str, i, t232);
            return false;
        }
    }
}
