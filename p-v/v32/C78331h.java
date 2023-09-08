package v32;

import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.p886hk.p887ui.LuckyMoneyHKReceiveUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import te3.C64476jq1;
import u32.C65210b;

/* renamed from: v32.h */
public class C78331h extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C64476jq1 f229536g;

    /* renamed from: h */
    public final /* synthetic */ C78333j f229537h;

    public C78331h(C78333j jVar, C64476jq1 jq12) {
        this.f229537h = jVar;
        this.f229536g = jq12;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.LuckyMoneyHKReceiveUI", "open btn click!");
        this.f229537h.f229539a.f198916o.setClickable(false);
        LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI = this.f229537h.f229539a;
        C64476jq1 jq12 = this.f229536g;
        luckyMoneyHKReceiveUI.getClass();
        Log.m105924i("MicroMsg.LuckyMoneyHKReceiveUI", "do open hb");
        new C65210b(luckyMoneyHKReceiveUI.f198925x, luckyMoneyHKReceiveUI.f198924w, luckyMoneyHKReceiveUI.getIntent().getStringExtra("key_username"), 1, luckyMoneyHKReceiveUI.f198926y, jq12.f183828q).mo9225i().mo123062e(new C78328e(luckyMoneyHKReceiveUI)).mo11397F(luckyMoneyHKReceiveUI);
        luckyMoneyHKReceiveUI.f198916o.setVisibility(8);
        C69242l1.m81617w(luckyMoneyHKReceiveUI.f198917p, 0);
    }
}
