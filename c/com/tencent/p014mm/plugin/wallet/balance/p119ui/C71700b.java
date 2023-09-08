package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.content.Context;
import android.view.MenuItem;
import b63.C67176b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.b */
public class C71700b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C67176b f207882d;

    /* renamed from: e */
    public final /* synthetic */ WalletBalanceFetchUI f207883e;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.b$a */
    public class C71701a implements C11182m0 {
        public C71701a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            int i = 0;
            for (C67176b.C67179c cVar : C71700b.this.f207882d.f192857j.f192858a) {
                if (!Util.isNullOrNil(cVar.f192861a)) {
                    if (!Util.isNullOrNil(cVar.f192862b)) {
                        e0Var.mo107154n(i, cVar.f192861a, cVar.f192862b, 0);
                    } else {
                        e0Var.mo107142f(i, cVar.f192861a);
                    }
                }
                i++;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.b$b */
    public class C71702b implements C11184p0 {
        public C71702b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            C67176b.C67179c[] cVarArr = C71700b.this.f207882d.f192857j.f192858a;
            if (cVarArr != null && itemId < cVarArr.length) {
                C67176b.C67179c cVar = cVarArr[itemId];
                Log.m105925i("MicroMsg.WalletBalanceFetchUI", "jump type: %s, url: %s", Integer.valueOf(cVar.f192863c), cVar.f192864d);
                int i2 = cVar.f192863c;
                if (i2 == 1) {
                    C75228t.m90219L(C71700b.this.f207883e.getContext(), cVar.f192864d, true);
                } else if (i2 == 2) {
                    C75228t.m90224Q(cVar.f192865e, cVar.f192866f, 0, 1000);
                }
            }
        }
    }

    public C71700b(WalletBalanceFetchUI walletBalanceFetchUI, C67176b bVar) {
        this.f207883e = walletBalanceFetchUI;
        this.f207882d = bVar;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C77407n nVar = new C77407n((Context) this.f207883e.getContext(), 1, false);
        nVar.f225771i = new C71701a();
        nVar.f225782p = new C71702b();
        nVar.mo107573q();
        return true;
    }
}
