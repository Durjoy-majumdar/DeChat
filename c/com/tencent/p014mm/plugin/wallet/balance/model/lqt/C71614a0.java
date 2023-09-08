package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import hp3.C87581a;
import lp3.C46888b;
import ob0.C89132b;
import te3.C64578nc0;
import te3.C78015xr2;
import te3.C78016y53;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.a0 */
public class C71614a0 implements C87581a<Void, C89132b.C89134c<C78016y53>> {

    /* renamed from: a */
    public final /* synthetic */ C46888b f207586a;

    public C71614a0(C43287e0 e0Var, C46888b bVar) {
        this.f207586a = bVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.LqtDetailInteractor", "lqtOnClickRedeem end, errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            if (((C78016y53) cVar.f256796d).f228549B != null) {
                WCPayLqtSaveFetchUIShowDialogEvent wCPayLqtSaveFetchUIShowDialogEvent = new WCPayLqtSaveFetchUIShowDialogEvent();
                wCPayLqtSaveFetchUIShowDialogEvent.f107805d.f107806a = ((C78016y53) cVar.f256796d).f228549B;
                wCPayLqtSaveFetchUIShowDialogEvent.publish();
            }
            C71648n1.m84125c(((C78016y53) cVar.f256796d).f228550C);
            C71647n0.m84120b().mo98816c((C78016y53) cVar.f256796d);
            C71654w wVar = C71654w.f207659q;
            C78016y53 y532 = (C78016y53) cVar.f256796d;
            String str = y532.f228562r;
            C64578nc0 nc02 = y532.f228563s;
            wVar.f207674m = str;
            wVar.f207675n = nc02;
            if (y532.f228551d != 0 && !Util.isNullOrNil(y532.f228552e)) {
                C78016y53 y533 = (C78016y53) cVar.f256796d;
                if (y533.f228549B == null) {
                    wVar.mo98822e(y533.f228557j, false, true, y533.f228552e);
                }
            }
            wVar.mo98822e(((C78016y53) cVar.f256796d).f228557j, false, false, "");
        } else {
            C71654w.f207659q.mo98822e((C78015xr2) null, false, true, "");
        }
        this.f207586a.resume();
        return null;
    }
}
