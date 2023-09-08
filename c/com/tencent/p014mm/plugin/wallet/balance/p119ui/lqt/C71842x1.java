package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.x1 */
public class C71842x1 implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f208394a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtSaveFetchUI f208395b;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.x1$a */
    public class C71843a implements C11182m0 {
        public C71843a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            Iterator it = C71842x1.this.f208394a.iterator();
            int i = 0;
            while (it.hasNext()) {
                e0Var.add(0, i, 0, (CharSequence) ((String) it.next()).split("\\|\\|")[0]);
                i++;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.x1$b */
    public class C71844b implements C11184p0 {
        public C71844b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId < C71842x1.this.f208394a.size()) {
                C75228t.m90219L(C71842x1.this.f208395b, ((String) C71842x1.this.f208394a.get(itemId)).split("\\|\\|")[1], false);
            }
        }
    }

    public C71842x1(WalletLqtSaveFetchUI walletLqtSaveFetchUI, ArrayList arrayList) {
        this.f208395b = walletLqtSaveFetchUI;
        this.f208394a = arrayList;
    }

    public void onClick(View view) {
        C77407n nVar = new C77407n((Context) this.f208395b, 1, false);
        nVar.f225771i = new C71843a();
        nVar.f225782p = new C71844b();
        nVar.mo107573q();
    }
}
