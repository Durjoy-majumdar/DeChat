package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.MenuItem;
import b73.C28273c;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import kd2.C76559f;
import nj3.C11184p0;
import nj3.C76879j;
import qo3.C77389a;
import qo3.C77426q;

/* renamed from: com.tencent.mm.plugin.offline.ui.x0 */
public class C70039x0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ WalletOfflineCoinPurseUI f202068d;

    public C70039x0(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f202068d = walletOfflineCoinPurseUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 0) {
            C76559f.m92118n(this.f202068d);
        } else if (menuItem.getItemId() == 1) {
            C70034w wVar = this.f202068d.f201885k1;
            wVar.getClass();
            if (!((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91349c()) {
                C77426q qVar = new C77426q(wVar.f202060a);
                qVar.mo107595g(wVar.mo96359a(C0966R.string.lao));
                String a = wVar.mo96359a(C0966R.string.lbo);
                String a2 = wVar.mo96359a(C0966R.string.lal);
                String a3 = wVar.mo96359a(C0966R.string.las);
                C77389a aVar = qVar.f225837a.f225714b;
                aVar.f225665v = a;
                aVar.f225666w = a2;
                aVar.f225667x = a3;
                C70038x xVar = new C70038x(wVar);
                C70040y yVar = new C70040y(wVar);
                C70042z zVar = new C70042z(wVar);
                aVar.f225624G = xVar;
                aVar.f225625H = yVar;
                aVar.f225626I = zVar;
                qVar.mo107603o();
                return;
            }
            C76879j.m92707A(wVar.f202060a, wVar.mo96359a(C0966R.string.lam), "", wVar.mo96359a(C0966R.string.lal), wVar.mo96359a(C0966R.string.las), new C69988a0(wVar), new C69991b0(wVar));
        }
    }
}
