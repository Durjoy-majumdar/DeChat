package s52;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C45128u;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import eb0.C75576f4;
import f40.C86709a0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import s24.C77613a;
import te3.C51264sl3;
import ub3.C78144b;

/* renamed from: s52.m */
public class C48235m {

    /* renamed from: a */
    public static boolean f129230a;

    /* renamed from: b */
    public static List<C48236a> f129231b = new ArrayList();

    /* renamed from: s52.m$a */
    public interface C48236a {
        /* renamed from: a */
        void mo66646a(C51264sl3 sl32);

        /* renamed from: b */
        void mo66647b(C51264sl3 sl32);
    }

    /* renamed from: a */
    public static void m53574a(C48236a aVar, boolean z, boolean z2, int i) {
        boolean z3 = false;
        Log.m105925i("MicroMsg.QueryWeChatWalletManager", "do query wechat wallet: %s", Boolean.valueOf(z));
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.QueryWeChatWalletManager", "account not ready");
            return;
        }
        C51264sl3 sl32 = new C51264sl3();
        String str = (String) ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119992d(C72994y1.C72995a.USERINFO_WALLET_RESP_CACHE_STRING_SYNC, (Object) null);
        if (!Util.isNullOrNil(str)) {
            try {
                sl32.parseFrom(str.getBytes(C77613a.f226275a));
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.QueryWeChatWalletManager", e, "", new Object[0]);
            }
        }
        if (z2) {
            if (aVar != null) {
                aVar.mo66647b(sl32);
            }
            z3 = true;
        }
        if ((z2 && !z3) || z) {
            if (aVar != null && !((ArrayList) f129231b).contains(aVar)) {
                ((ArrayList) f129231b).add(aVar);
            }
            if (f129230a) {
                Log.m105924i("MicroMsg.QueryWeChatWalletManager", "is quering");
            } else {
                f129230a = true;
                C48232j jVar = new C48232j(i, sl32);
                Pattern pattern = C75228t.f221346a;
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C75576f4(new C45128u("wallet_balance_version", jVar), (String) null));
            }
            if (!z3 && !z) {
                C115669n.INSTANCE.mo175911u(997, 1);
            }
        }
    }
}
