package v32;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch;
import com.tencent.p014mm.plugin.luckymoney.p886hk.p887ui.LuckyMoneyHKBeforeDetailUI;
import com.tencent.p014mm.plugin.luckymoney.p886hk.p887ui.LuckyMoneyHKReceiveUI;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import j20.C117292a;
import k20.C9556a;
import te3.C77936gq1;

/* renamed from: v32.f */
public class C78329f extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C77936gq1 f229533g;

    /* renamed from: h */
    public final /* synthetic */ LuckyMoneyHKReceiveUI f229534h;

    public C78329f(LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI, C77936gq1 gq12) {
        this.f229534h = luckyMoneyHKReceiveUI;
        this.f229533g = gq12;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Intent intent = new Intent();
        intent.setClass(this.f229534h.getContext(), LuckyMoneyHKBeforeDetailUI.class);
        intent.putExtra("key_lucky_money_can_received", true);
        intent.putExtra("key_native_url", this.f229534h.f198925x);
        intent.putExtra("key_sendid", this.f229534h.f198924w);
        intent.putExtra("key_username", this.f229534h.getIntent().getStringExtra("key_username"));
        intent.putExtra("key_msgid", this.f229534h.f198927z);
        LuckyMoneyEmojiSwitch luckyMoneyEmojiSwitch = new LuckyMoneyEmojiSwitch();
        C77936gq1 gq12 = this.f229533g;
        luckyMoneyEmojiSwitch.f198931f = gq12.f227493J;
        luckyMoneyEmojiSwitch.f198932g = gq12.f227494K;
        intent.putExtra("key_emoji_switch", luckyMoneyEmojiSwitch);
        LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI = this.f229534h;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI2 = luckyMoneyHKReceiveUI;
        C117292a.m165358d(luckyMoneyHKReceiveUI2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$4", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyHKReceiveUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(luckyMoneyHKReceiveUI2, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$4", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f229534h.finish();
    }
}
