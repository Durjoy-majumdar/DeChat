package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f32.C75675d;
import gc0.C20828a;
import hc0.C20937c;
import hp3.C87581a;
import ob0.C89132b;
import te3.C51504u72;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.q0 */
public class C69666q0 implements C87581a<Object, C89132b.C89134c<C51504u72>> {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyDetailUI f201054a;

    public C69666q0(LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f201054a = luckyMoneyDetailUI;
    }

    public Object call(Object obj) {
        T t;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "getRedpacketFission resp errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (this.f201054a.isFinishing() || this.f201054a.isDestroyed()) {
            Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "this activity has finished do not show fissison entrance");
            return null;
        } else if (cVar.f256793a != 0 || cVar.f256794b != 0 || (t = cVar.f256796d) == null || !((C51504u72) t).f142648d) {
            Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "do not show fissison entrance");
            LuckyMoneyDetailUI luckyMoneyDetailUI = this.f201054a;
            luckyMoneyDetailUI.f199802E1 = false;
            luckyMoneyDetailUI.f199839V.setVisibility(8);
            return null;
        } else {
            Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "show fissison entrance");
            LuckyMoneyDetailUI luckyMoneyDetailUI2 = this.f201054a;
            luckyMoneyDetailUI2.f199802E1 = true;
            luckyMoneyDetailUI2.f199839V.setVisibility(0);
            C75675d.m90931a(21, this.f201054a.f199861d2);
            this.f201054a.f199845X.setText(((C51504u72) cVar.f256796d).f142649e);
            C20828a b = C20828a.m22825b();
            String str = ((C51504u72) cVar.f256796d).f142650f;
            ImageView imageView = this.f201054a.f199842W;
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59359o = C0966R.C0969drawable.be5;
            bVar.f59347c = true;
            b.mo32519h(str, imageView, bVar.mo32666a());
            if (Util.isNullOrNil(((C51504u72) cVar.f256796d).f142652h)) {
                return null;
            }
            this.f201054a.f199839V.setOnClickListener(new C69661p0(this, cVar));
            return null;
        }
    }
}
