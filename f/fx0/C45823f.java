package fx0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C19627t;
import di3.C86312j;
import ex0.C45696d;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kr0.C88262c1;
import kr0.C88273g1;
import kr0.C88274h0;
import ob0.C47350c;
import ob0.C89144l0;
import pe3.C47465a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49004ci;
import te3.C49148di;
import te3.gr4;

/* renamed from: fx0.f */
public final class C45823f {

    /* renamed from: a */
    public static int f123722a = ((C19627t.f55586a.mo25839m() ? 16 : 0) | 4010);

    /* renamed from: b */
    public static final C13601g f123723b = C36568h.m40985a(C32204a.f85606d);

    /* renamed from: c */
    public static long f123724c;

    /* renamed from: fx0.f$a */
    public static final class C32204a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C32204a f85606d = new C32204a();

        public C32204a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getSingleMMKV("brandService");
        }
    }

    /* renamed from: a */
    public static final void m51112a() {
        Log.m105925i("MicroMsg.BizStrategyManager", "alvinluo BizStrategyManager init requestType: %d", Integer.valueOf(f123722a));
        C45825h hVar = C45825h.f123727a;
        int i = hVar.mo71291b().getInt("top_bar_video_channel_switch_option", 0);
        boolean z = hVar.mo71291b().getInt("top_bar_video_channel_switch_option", 0) == 1;
        C45825h.f123729c = Boolean.valueOf(i == 2);
        Log.m105925i("MicroMsg.BizVideoChannelStrategy", "alvinluo updateBizProfileEntryStatus server isEntryOpen: %b,needSave: %b", Boolean.valueOf(z), Boolean.FALSE);
    }

    /* renamed from: b */
    public static final void m51113b() {
        String str;
        C13601g gVar = f123723b;
        long abs = Math.abs(System.currentTimeMillis() - ((MultiProcessMMKV) ((C36570n) gVar).getValue()).getLong("biz_time_line_strategy_last_time", 0));
        if (abs < ((MultiProcessMMKV) ((C36570n) gVar).getValue()).getLong("biz_time_line_fetch_interval", 1800000)) {
            Log.m105924i("MicroMsg.BizStrategyManager", "fetchBizStrategy delta < interval, return");
        } else {
            Log.m105925i("MicroMsg.BizStrategyManager", "alvinluo fetchBizStrategy %d, requestType: %d", Long.valueOf(abs), Integer.valueOf(f123722a));
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C49004ci();
            bVar.f127067b = new C49148di();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/timeline/bizstrategy";
            bVar.f127069d = 1806;
            C47350c a = bVar.mo72403a();
            C47465a aVar = a.f127055a.f127080a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizStrategyReq");
            ((C49004ci) aVar).f131731d = f123722a;
            C89144l0.m111429e(a, C45822e.f123721d, false);
        }
        if (C45825h.m51116h()) {
            C45825h.f123727a.mo71292c((C45696d.C45697b) null);
            ((C88274h0) C86312j.m106911c(C88274h0.class)).mo113305TH(C88273g1.BIZ_TIME_LINE);
            gr4 f = C45825h.m51115f();
            if (f != null && (str = f.f134230t) != null && System.currentTimeMillis() - f123724c >= 3600000) {
                f123724c = System.currentTimeMillis();
                ((C88262c1) C86312j.m106911c(C88262c1.class)).mo113580Dm(str, 0);
            }
        }
    }
}
