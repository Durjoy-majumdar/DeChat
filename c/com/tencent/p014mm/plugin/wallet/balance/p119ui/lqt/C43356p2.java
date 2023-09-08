package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43298g;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71648n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import hp3.C87581a;
import ob0.C89132b;
import te3.C49206dz1;
import te3.C51892wy;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.p2 */
public class C43356p2 implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ C51892wy f117233a;

    /* renamed from: b */
    public final /* synthetic */ int f117234b;

    /* renamed from: c */
    public final /* synthetic */ WalletLqtSaveFetchUI f117235c;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.p2$a */
    public class C43357a implements C87581a<Void, C89132b.C89134c<C49206dz1>> {
        public C43357a() {
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "on get distribute preview finish, errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            if (cVar.f256793a != 0 || cVar.f256794b != 0) {
                return null;
            }
            C49206dz1 dz12 = (C49206dz1) cVar.f256796d;
            Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "on get distribute preview finish, retcode: %s, retmsg: %s url:%s", Integer.valueOf(dz12.f132586d), dz12.f132587e, dz12.f132588f);
            if (dz12.f132586d != 0) {
                return null;
            }
            C71648n1.m84125c(dz12.f132589g);
            C75228t.m90219L(C43356p2.this.f117235c.getContext(), dz12.f132588f, true);
            return null;
        }
    }

    public C43356p2(WalletLqtSaveFetchUI walletLqtSaveFetchUI, C51892wy wyVar, int i) {
        this.f117235c = walletLqtSaveFetchUI;
        this.f117233a = wyVar;
        this.f117234b = i;
    }

    public void onClick(View view) {
        C51892wy wyVar = this.f117233a;
        int i = wyVar.f144347f;
        if (i == 2) {
            C75228t.m90219L(this.f117235c.getContext(), this.f117233a.f144348g, true);
        } else if (i == 3) {
            C75228t.m90224Q(wyVar.f144349h, wyVar.f144348g, 0, 1000);
        } else if (i == 4) {
            new C43298g(C75228t.m90232Y(this.f117235c.f208174T0 + "", "100"), this.f117234b).mo9225i().mo123062e(new C43357a());
        }
    }
}
