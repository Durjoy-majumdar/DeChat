package kz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C51606uw1;
import te3.C51750vw1;
import te3.C51997xn;
import z04.C119027c;

/* renamed from: kz0.l */
public final class C46820l extends C46827q<C51750vw1> {

    /* renamed from: i */
    public static final C46821a f125957i = new C46821a((C8480h) null);

    /* renamed from: kz0.l$a */
    public static final class C46821a {

        /* renamed from: kz0.l$a$a */
        public static final class C46822a<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public static final C46822a<_Ret, _Var> f125958a = new C46822a<>();

            public Object call(Object obj) {
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                Log.m105925i("MicroMsg.CgiGetCardEntranceStyle", "errtype: %s, errcode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
                if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                    C51750vw1 vw12 = (C51750vw1) cVar.f256796d;
                    Log.m105925i("MicroMsg.CgiGetCardEntranceStyle", "retCode: %s", Integer.valueOf(vw12.f143742d));
                    if (vw12.f143742d == 0) {
                        boolean z = vw12.f143744f;
                        Log.m105925i("MicroMsg.CgiGetCardEntranceStyle", "new version: %s, new version style: %s, trade area: %s, is_card_home_page_v2: %s", Boolean.valueOf(z), Integer.valueOf(vw12.f143745g), Integer.valueOf(vw12.f143746h), Boolean.valueOf(vw12.f143748j));
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_ENTRANCE_SWITCH_INT_SYNC, Integer.valueOf(z ? 1 : 0));
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_ENTRANCE_SHOW_SORT_INT_SYNC, Integer.valueOf(vw12.f143745g));
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_ENTRANCE_TRADE_AREA_INT_SYNC, Integer.valueOf(vw12.f143746h));
                        vw12.f143748j = true;
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_ENTRANCE_SWITCH_V2_BOOLEAN_SYNC, Boolean.valueOf(vw12.f143748j));
                        C51997xn xnVar = vw12.f143747i;
                        if (xnVar != null) {
                            byte[] byteArray = xnVar.toByteArray();
                            C87412m.m108593f(byteArray, "trade_area_version_mini_app_info.toByteArray()");
                            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_ENTRANCE_TRADE_AREA_INFO_STRING_SYNC, new String(byteArray, C119027c.f356489b));
                        }
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C46821a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo72032a(boolean z) {
            Log.m105925i("MicroMsg.CgiGetCardEntranceStyle", "trigger get card entrance: %s", Boolean.valueOf(z));
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_CARD_ENTRANCE_LAST_TIMESTAMP_LONG_SYNC;
            Object f = i.mo119685f(aVar, 0L);
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Long");
            long currentTimeMillis = System.currentTimeMillis() - ((Long) f).longValue();
            if (z || currentTimeMillis > 86400000) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(System.currentTimeMillis()));
                new C46820l().mo9225i().mo123064p(C46822a.f125958a);
            }
        }
    }

    public C46820l() {
        mo72033k(new C51606uw1(), new C51750vw1(), 2793, "/cgi-bin/mmpay-bin/mktgetcardentrancestyle");
        Log.m105924i("MicroMsg.CgiGetCardEntranceStyle", "do get card entrance style");
    }
}
