package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75097a;
import di3.C86312j;
import java.io.IOException;
import ob0.C89132b;
import s24.C77613a;
import te3.C49335eu3;
import te3.C49703hg3;
import ub3.C78144b;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.t */
public class C43318t extends C75097a<C49703hg3, C43305l> {
    /* renamed from: a */
    public C49335eu3 mo66604a() {
        if (((C43305l) this.f221004c).f117141p == 2) {
            return null;
        }
        String str = (String) ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119992d(C72994y1.C72995a.USERINFO_LQT_PLAN_ADD_CACHE_STRING_SYNC, "");
        if (Util.isNullOrNil(str)) {
            return null;
        }
        try {
            return (C49703hg3) new C49703hg3().parseFrom(str.getBytes(C77613a.f226275a));
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.CgiPlanIndexAsyncLoader", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public void mo66605b(C89132b.C89134c<C49703hg3> cVar) {
        Log.m105925i("MicroMsg.CgiPlanIndexAsyncLoader", "errType: %s, errCode: %s", Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a));
        if (((C43305l) this.f221004c).f117141p != 2 && cVar.f256793a == 0 && cVar.f256794b == 0) {
            T t = cVar.f256796d;
            if (((C49703hg3) t).f134617d == 0) {
                try {
                    ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119993e(C72994y1.C72995a.USERINFO_LQT_PLAN_ADD_CACHE_STRING_SYNC, new String(((C49703hg3) t).toByteArray(), C77613a.f226275a));
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.CgiPlanIndexAsyncLoader", e, "", new Object[0]);
                }
            }
        }
    }
}
