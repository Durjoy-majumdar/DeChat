package com.tencent.p014mm.plugin.wallet.bind.p120ui;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.h */
public class C71890h implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletBankcardManageUI f208529d;

    /* renamed from: com.tencent.mm.plugin.wallet.bind.ui.h$a */
    public class C71891a implements C11182m0 {
        public C71891a(C71890h hVar) {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107125a(0, C0966R.string.kn4);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.bind.ui.h$b */
    public class C71892b implements C11184p0 {
        public C71892b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            Log.m105925i("MicroMsg.WalletBankcardManageUI", "operType：%s", Integer.valueOf(itemId));
            if (itemId == 0) {
                Intent intent = new Intent();
                intent.putExtra(C74928u.C45093i.f122326r, true);
                intent.putExtra("rawUrl", "https://payapp.weixin.qq.com/kfweb/helpcenter/dispatch?scene_code=CommIssueBankCard");
                C75228t.m90217J(C71890h.this.f208529d.getContext(), intent);
                C115669n.INSTANCE.mo160131h(14422, 3);
            }
        }
    }

    public C71890h(WalletBankcardManageUI walletBankcardManageUI) {
        this.f208529d = walletBankcardManageUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C77407n nVar = new C77407n((Context) this.f208529d.getContext(), 1, false);
        nVar.f225771i = new C71891a(this);
        nVar.f225782p = new C71892b();
        nVar.mo107573q();
        return false;
    }
}
