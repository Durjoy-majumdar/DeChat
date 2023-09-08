package pn1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C31922b1;
import gy3.C87412m;
import java.util.Map;
import ob0.C35136m;
import zc1.C66785b;

/* renamed from: pn1.i */
public final class C35576i implements C31922b1 {
    /* renamed from: X5 */
    public C35136m.C35139b mo10269X5(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_FINDER_REINIT_USER_VERSION_INT_SYNC;
        C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_MY_FINDER_REINIT_USERNAME_STRING_SYNC;
        C87412m.m108594g(map, "values");
        C87412m.m108594g(aVar, "p2");
        if (!C87412m.m108589b(str, "finderuserreinit")) {
            return null;
        }
        C115669n.INSTANCE.mo175913w(1279, 25, 1);
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_USER_VERSION_INT_SYNC, 0);
        int safeParseInt = Util.safeParseInt(map.get(".sysmsg.userver"));
        String str2 = map.get(".sysmsg.username");
        int safeParseInt2 = Util.safeParseInt(map.get(".sysmsg.usertype"));
        boolean z = safeParseInt2 == 1 ? C87412m.m108589b(C66785b.f191882e.mo90662O5(), str2) : !(safeParseInt2 != 2 || !C87412m.m108589b(C75592q0.m90789s(), str2));
        Log.m105924i("Finder.ReInitSysMsgConsumer", "[consumeNewXml] subType=" + str + " userVersion=" + safeParseInt + " curUserVersion=" + j + " username=" + str2 + " userType=" + safeParseInt2 + " isValid=" + z);
        if (!z) {
            return null;
        }
        if (safeParseInt2 == 1) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar3, "");
            C86709a0.m107535s().mo121142i().mo119677K(aVar2, 0);
        } else {
            C86709a0.m107535s().mo121142i().mo119677K(aVar3, str2);
            C86709a0.m107535s().mo121142i().mo119677K(aVar2, Integer.valueOf(safeParseInt));
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_USER_HARD_REINIT_INT_SYNC, 1);
        return null;
    }
}
