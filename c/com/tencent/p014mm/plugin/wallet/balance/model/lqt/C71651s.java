package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75097a;
import f40.C86709a0;
import java.io.IOException;
import ob0.C89132b;
import s24.C77613a;
import te3.C49335eu3;
import te3.C78012xd3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.s */
public class C71651s extends C75097a<C78012xd3, CgiLqtPlanIndex> {
    /* renamed from: a */
    public C49335eu3 mo66604a() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LQT_PLAN_INDEX_CACHE_STRING_SYNC, "");
        if (Util.isNullOrNil(str)) {
            return null;
        }
        try {
            return (C78012xd3) new C78012xd3().parseFrom(str.getBytes(C77613a.f226275a));
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.CgiPlanIndexAsyncLoader", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public void mo66605b(C89132b.C89134c<C78012xd3> cVar) {
        Log.m105925i("MicroMsg.CgiPlanIndexAsyncLoader", "errType: %s, errCode: %s", Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            T t = cVar.f256796d;
            if (((C78012xd3) t).f228407d == 0) {
                try {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LQT_PLAN_INDEX_CACHE_STRING_SYNC, new String(((C78012xd3) t).toByteArray(), C77613a.f226275a));
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.CgiPlanIndexAsyncLoader", e, "", new Object[0]);
                }
            }
        }
    }
}
