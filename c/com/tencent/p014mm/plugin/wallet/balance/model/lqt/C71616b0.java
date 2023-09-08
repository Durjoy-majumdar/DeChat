package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import hp3.C87581a;
import lp3.C46888b;
import ob0.C89132b;
import p910lj.C76701a;
import te3.C78002u53;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.b0 */
public class C71616b0 implements C87581a<Void, C89132b.C89134c<C78002u53>> {

    /* renamed from: a */
    public final /* synthetic */ int f207587a;

    /* renamed from: b */
    public final /* synthetic */ C46888b f207588b;

    public C71616b0(C43287e0 e0Var, int i, C46888b bVar) {
        this.f207587a = i;
        this.f207588b = bVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.LqtDetailInteractor", "lqtOnClickPurchase end, errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            if (((C78002u53) cVar.f256796d).f228280A != null) {
                WCPayLqtSaveFetchUIShowDialogEvent wCPayLqtSaveFetchUIShowDialogEvent = new WCPayLqtSaveFetchUIShowDialogEvent();
                wCPayLqtSaveFetchUIShowDialogEvent.f107805d.f107806a = ((C78002u53) cVar.f256796d).f228280A;
                wCPayLqtSaveFetchUIShowDialogEvent.publish();
            }
            C71648n1.m84125c(((C78002u53) cVar.f256796d).f228281B);
            C71654w wVar = C71654w.f207659q;
            wVar.mo98822e(((C78002u53) cVar.f256796d).f228284f, true, false, "");
            wVar.mo98823f((C78002u53) cVar.f256796d, this.f207587a);
        } else {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.l_3), 1).show();
        }
        this.f207588b.resume();
        return null;
    }
}
