package sz0;

import com.tencent.p014mm.plugin.card.p031ui.p032v2.CardInvalidTicketListUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C51196s30;
import wz0.C22945n;

/* renamed from: sz0.e */
public final class C48512e<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ CardInvalidTicketListUI f129746a;

    /* renamed from: b */
    public final /* synthetic */ String f129747b;

    public C48512e(CardInvalidTicketListUI cardInvalidTicketListUI, String str) {
        this.f129746a = cardInvalidTicketListUI;
        this.f129747b = str;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.CardInvalidTicketListUI", "errtype: %s, errcode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            T t = cVar.f256796d;
            CardInvalidTicketListUI cardInvalidTicketListUI = this.f129746a;
            String str = this.f129747b;
            C51196s30 s302 = (C51196s30) t;
            Log.m105925i("MicroMsg.CardInvalidTicketListUI", "retCode: %s", Integer.valueOf(s302.f141290d));
            if (s302.f141290d == 0) {
                cardInvalidTicketListUI.mo63843M7().mo73145O4(str);
            } else {
                C22945n.m27018r(cardInvalidTicketListUI, s302.f141291e);
            }
        } else {
            C22945n.m27017q(this.f129746a, "");
        }
        CardInvalidTicketListUI cardInvalidTicketListUI2 = this.f129746a;
        Boolean bool = Boolean.FALSE;
        int i = CardInvalidTicketListUI.f109914v;
        cardInvalidTicketListUI2.mo63845O7(bool);
        return C13598b0.f38549a;
    }
}
