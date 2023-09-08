package v32;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.p886hk.p887ui.LuckyMoneyHKBeforeDetailUI;
import com.tencent.p014mm.plugin.luckymoney.p886hk.p887ui.LuckyMoneyHKReceiveUI;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import j20.C117292a;
import k20.C9556a;

/* renamed from: v32.i */
public class C78332i extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C78333j f229538g;

    public C78332i(C78333j jVar) {
        this.f229538g = jVar;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Intent intent = new Intent();
        intent.setClass(this.f229538g.f229539a.getContext(), LuckyMoneyHKBeforeDetailUI.class);
        intent.putExtra("key_native_url", this.f229538g.f229539a.f198925x);
        intent.putExtra("key_sendid", this.f229538g.f229539a.f198924w);
        intent.putExtra("key_lucky_money_can_received", true);
        intent.putExtra("key_username", this.f229538g.f229539a.getIntent().getStringExtra("key_username"));
        intent.putExtra("key_msgid", this.f229538g.f229539a.f198927z);
        LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI = this.f229538g.f229539a;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI2 = luckyMoneyHKReceiveUI;
        C117292a.m165358d(luckyMoneyHKReceiveUI2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6$2", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyHKReceiveUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(luckyMoneyHKReceiveUI2, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6$2", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f229538g.f229539a.finish();
    }
}
