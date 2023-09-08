package o32;

import android.view.View;
import com.tencent.p014mm.p136ui.C30870z1;
import com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.receive.WxaLuckyMoneyReceiveUI;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.sdk.platformtools.Log;
import k32.C46638c;

/* renamed from: o32.c */
public class C76988c extends C30870z1 {

    /* renamed from: e */
    public final /* synthetic */ WxaLuckyMoneyReceiveUI f224976e;

    public C76988c(WxaLuckyMoneyReceiveUI wxaLuckyMoneyReceiveUI) {
        this.f224976e = wxaLuckyMoneyReceiveUI;
    }

    /* renamed from: a */
    public void mo57772a(View view) {
        WxaLuckyMoneyReceiveUI wxaLuckyMoneyReceiveUI = this.f224976e;
        wxaLuckyMoneyReceiveUI.f198858r.setVisibility(8);
        C69242l1.m81617w(wxaLuckyMoneyReceiveUI.f198859s, 0);
        C76987a aVar = this.f224976e.f198853j;
        if (aVar != null) {
            C76990f fVar = (C76990f) aVar;
            int i = fVar.f224984g;
            if (i != 0) {
                Log.m105925i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onOpenBtnClick return state = %d", Integer.valueOf(i));
            } else if (fVar.f224978a == null) {
                Log.m105924i("MicroMsg.WxaReceiveLuckyMoneyLogic", "openLuckyMoney ui == null");
            } else {
                new C46638c(fVar.f224979b, fVar.f224980c, fVar.f224981d).mo71901a(new C76989e(fVar));
            }
        }
    }
}
