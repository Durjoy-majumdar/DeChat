package v32;

import a63.C67008a;
import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C115591q5;
import com.tencent.p014mm.plugin.luckymoney.p886hk.p887ui.LuckyMoneyHKReceiveUI;
import com.tencent.p014mm.plugin.wallet_core.utils.C72501h;
import com.tencent.p014mm.plugin.wallet_core.utils.C72505q;
import com.tencent.p014mm.plugin.wallet_core.utils.C72506r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.JumpRemind;
import hp3.C87581a;
import nj3.C76879j;
import ob0.C89132b;
import te3.C64320dn3;
import te3.C77936gq1;
import te3.C77942hl2;
import yq3.C79148e;

/* renamed from: v32.e */
public class C78328e implements C87581a<Object, C89132b.C89134c<C77936gq1>> {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyHKReceiveUI f229532a;

    public C78328e(LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI) {
        this.f229532a = luckyMoneyHKReceiveUI;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        this.f229532a.f198916o.setVisibility(0);
        C69242l1.m81618x(this.f229532a.f198917p);
        this.f229532a.f198916o.setClickable(true);
        this.f229532a.mo95303K7();
        Log.m105925i("MicroMsg.LuckyMoneyHKReceiveUI", "do open hb, errtype: %s, errcode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C77936gq1 gq12 = (C77936gq1) cVar.f256796d;
            Log.m105925i("MicroMsg.LuckyMoneyHKReceiveUI", "do open hb, retcode: %s, retmsg: %s", Integer.valueOf(gq12.f227500d), gq12.f227501e);
            int i = gq12.f227500d;
            if (i == 0) {
                C115591q5.m162472a(this.f229532a.getContext(), C0966R.string.gek);
                C77942hl2 hl22 = gq12.f227492I;
                if (hl22 != null) {
                    JumpRemind.m90059d(hl22).mo104782f(this.f229532a.getContext(), new C78327d(this, gq12));
                    return Boolean.TRUE;
                }
                C72501h b = C72501h.m84834b(gq12.f227495L);
                if (C72506r.m84838d(b)) {
                    this.f229532a.setContentViewVisibility(4);
                    C72506r rVar = new C72506r(this.f229532a);
                    rVar.f210915a = true;
                    rVar.mo99912b(b, new C72505q(rVar));
                    return Boolean.TRUE;
                }
                LuckyMoneyHKReceiveUI.m81488J7(this.f229532a, gq12);
            } else if (i == 416) {
                Log.m105924i("MicroMsg.LuckyMoneyHKReceiveUI", "need verify realname");
                C64320dn3 dn32 = gq12.f227487D;
                if (dn32 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("realname_verify_process_jump_activity", ".hk.ui.LuckyMoneyHKReceiveUI");
                    bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
                    this.f229532a.f198916o.setBackgroundResource(C0966R.C0969drawable.c27);
                    int i2 = dn32.f182785d;
                    if (i2 == 1) {
                        Log.m105924i("MicroMsg.LuckyMoneyHKReceiveUI", "showRealnameDialog");
                        C67008a.m79172h(this.f229532a.getContext(), dn32.f182786e, 0, dn32.f182787f, dn32.f182788g, bundle, false, (DialogInterface.OnClickListener) null, (C79148e.C79149a) null, 1003, 2);
                    } else if (i2 == 2 && !Util.isNullOrNil(dn32.f182789h)) {
                        Log.m105924i("MicroMsg.LuckyMoneyHKReceiveUI", "showUploadCreditDialog");
                        C67008a.m79173i(this.f229532a.getContext(), dn32.f182786e, dn32.f182789h, dn32.f182787f, dn32.f182788g, false, (DialogInterface.OnClickListener) null);
                    }
                }
            } else {
                String str = LuckyMoneyHKReceiveUI.f198909B;
                if (!Util.isNullOrNil(gq12.f227501e)) {
                    str = gq12.f227501e;
                }
                C76879j.m92726T(this.f229532a.getContext(), str);
                this.f229532a.finish();
            }
        } else {
            String str2 = LuckyMoneyHKReceiveUI.f198909B;
            if (!Util.isNullOrNil(cVar.f256795c)) {
                str2 = cVar.f256795c;
            }
            C76879j.m92726T(this.f229532a.getContext(), str2);
            this.f229532a.finish();
        }
        return null;
    }
}
