package v32;

import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.luckymoney.model.C69232i1;
import com.tencent.p014mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch;
import com.tencent.p014mm.plugin.luckymoney.p886hk.p887ui.LuckyMoneyHKBeforeDetailUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f32.C75674c;
import hp3.C87581a;
import nj3.C76879j;
import ob0.C89132b;
import te3.C77923eq1;

/* renamed from: v32.b */
public class C78325b implements C87581a<Object, C89132b.C89134c<C77923eq1>> {

    /* renamed from: a */
    public final /* synthetic */ String f229527a;

    /* renamed from: b */
    public final /* synthetic */ LuckyMoneyHKBeforeDetailUI f229528b;

    public C78325b(LuckyMoneyHKBeforeDetailUI luckyMoneyHKBeforeDetailUI, String str) {
        this.f229528b = luckyMoneyHKBeforeDetailUI;
        this.f229527a = str;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar == null) {
            return null;
        }
        Log.m105925i("MicroMsg.LuckyMoneyHKBeforeDetailUI", "do query detail: errtype: %s, errcode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C77923eq1 eq12 = (C77923eq1) cVar.f256796d;
            Log.m105925i("MicroMsg.LuckyMoneyHKBeforeDetailUI", "do query detail: retcode: %s, retmsg: %s", Integer.valueOf(eq12.f227282d), eq12.f227283e);
            if (eq12.f227282d == 0) {
                C69158a0 e = C69232i1.m81581e(eq12);
                LuckyMoneyEmojiSwitch luckyMoneyEmojiSwitch = new LuckyMoneyEmojiSwitch();
                luckyMoneyEmojiSwitch.f198932g = eq12.f227278I;
                luckyMoneyEmojiSwitch.f198931f = eq12.f227277H;
                this.f229528b.getIntent().putExtra("key_emoji_switch", luckyMoneyEmojiSwitch);
                C75674c.m90930b(this.f229527a, e);
                LuckyMoneyHKBeforeDetailUI luckyMoneyHKBeforeDetailUI = this.f229528b;
                String str = LuckyMoneyHKBeforeDetailUI.f198903j;
                luckyMoneyHKBeforeDetailUI.mo95300J7(false);
                return null;
            }
            String str2 = LuckyMoneyHKBeforeDetailUI.f198903j;
            if (!Util.isNullOrNil(eq12.f227283e)) {
                str2 = eq12.f227283e;
            }
            C76879j.m92726T(this.f229528b.getContext(), str2);
            this.f229528b.finish();
            return null;
        }
        String str3 = LuckyMoneyHKBeforeDetailUI.f198903j;
        if (!Util.isNullOrNil(cVar.f256795c)) {
            str3 = cVar.f256795c;
        }
        C76879j.m92726T(this.f229528b.getContext(), str3);
        this.f229528b.finish();
        return null;
    }
}
