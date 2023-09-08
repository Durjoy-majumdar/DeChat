package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75097a;
import f40.C86709a0;
import java.io.IOException;
import ob0.C89132b;
import s24.C77613a;
import te3.C78007w82;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.p */
public class C42519p extends C75097a<C78007w82, C42516e> {

    /* renamed from: f */
    public static C42519p f115068f;

    /* renamed from: g */
    public static C42519p m46167g() {
        if (f115068f == null) {
            f115068f = new C42519p();
        }
        return f115068f;
    }

    /* renamed from: b */
    public void mo66605b(C89132b.C89134c<C78007w82> cVar) {
        Log.m105925i("MicroMsg.GetShowSourceAsyncLoader", "errType: %s, errCode: %s", Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            T t = cVar.f256796d;
            if (((C78007w82) t).f228340d == 0) {
                try {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_ENVELOPE_SNAPSHOT_STRING_SYNC, new String(((C78007w82) t).toByteArray(), C77613a.f226275a));
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.GetShowSourceAsyncLoader", e, "", new Object[0]);
                }
            }
        }
    }

    /* renamed from: f */
    public C78007w82 mo66604a() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_ENVELOPE_SNAPSHOT_STRING_SYNC, "");
        if (Util.isNullOrNil(str)) {
            return null;
        }
        try {
            return (C78007w82) new C78007w82().parseFrom(str.getBytes(C77613a.f226275a));
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.GetShowSourceAsyncLoader", e, "", new Object[0]);
            return null;
        }
    }
}
