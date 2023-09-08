package v32;

import android.content.Intent;
import com.tencent.p014mm.plugin.luckymoney.model.C69232i1;
import com.tencent.p014mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch;
import com.tencent.p014mm.plugin.luckymoney.p886hk.p887ui.LuckyMoneyHKBeforeDetailUI;
import com.tencent.p014mm.plugin.luckymoney.p886hk.p887ui.LuckyMoneyHKReceiveUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f32.C75674c;
import hp3.C87581a;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import ob0.C89132b;
import te3.C77923eq1;

/* renamed from: v32.c */
public class C78326c implements C87581a<Object, C89132b.C89134c<C77923eq1>> {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyHKReceiveUI f229529a;

    public C78326c(LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI) {
        this.f229529a = luckyMoneyHKReceiveUI;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C77923eq1 eq12 = (C77923eq1) cVar.f256796d;
            if (eq12.f227282d == 0) {
                C75674c.m90930b(this.f229529a.f198924w, C69232i1.m81581e(eq12));
                LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI = this.f229529a;
                luckyMoneyHKReceiveUI.getClass();
                Log.m105924i("MicroMsg.LuckyMoneyHKReceiveUI", "go to before detail ui");
                Intent intent = new Intent();
                intent.setClass(luckyMoneyHKReceiveUI.getContext(), LuckyMoneyHKBeforeDetailUI.class);
                intent.putExtra("key_lucky_money_can_received", true);
                intent.putExtra("key_jump_from", 2);
                intent.putExtra("key_native_url", luckyMoneyHKReceiveUI.f198925x);
                intent.putExtra("key_sendid", luckyMoneyHKReceiveUI.f198924w);
                intent.putExtra("key_anim_slide", true);
                intent.putExtra("key_username", luckyMoneyHKReceiveUI.getIntent().getStringExtra("key_username"));
                intent.putExtra("key_way", luckyMoneyHKReceiveUI.f198926y);
                intent.putExtra("key_msgid", luckyMoneyHKReceiveUI.f198927z);
                intent.putExtra("key_hk_scene", luckyMoneyHKReceiveUI.getIntent().getIntExtra("key_hk_scene", 0));
                LuckyMoneyEmojiSwitch luckyMoneyEmojiSwitch = new LuckyMoneyEmojiSwitch();
                luckyMoneyEmojiSwitch.f198931f = eq12.f227277H;
                luckyMoneyEmojiSwitch.f198932g = eq12.f227278I;
                intent.putExtra("key_emoji_switch", luckyMoneyEmojiSwitch);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI2 = luckyMoneyHKReceiveUI;
                C117292a.m165358d(luckyMoneyHKReceiveUI2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "gotoBeforeDetailUI", "(Lcom/tencent/mm/protocal/protobuf/ForeignHbDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                luckyMoneyHKReceiveUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(luckyMoneyHKReceiveUI2, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "gotoBeforeDetailUI", "(Lcom/tencent/mm/protocal/protobuf/ForeignHbDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                String str = LuckyMoneyHKReceiveUI.f198909B;
                if (!Util.isNullOrNil(eq12.f227283e)) {
                    str = eq12.f227283e;
                }
                C76879j.m92726T(this.f229529a.getContext(), str);
            }
        } else {
            String str2 = LuckyMoneyHKReceiveUI.f198909B;
            if (!Util.isNullOrNil(cVar.f256795c)) {
                str2 = cVar.f256795c;
            }
            C76879j.m92726T(this.f229529a.getContext(), str2);
        }
        this.f229529a.finish();
        return null;
    }
}
