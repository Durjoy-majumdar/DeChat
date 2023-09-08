package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import java.util.Iterator;
import java.util.LinkedList;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import qo3.C77407n;
import te3.C64483k33;
import te3.C78023zk3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.b0 */
public class C71781b0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletLqtDetailUI f208311d;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.b0$a */
    public class C71782a implements C11182m0 {
        public C71782a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            LinkedList<C64483k33> linkedList = C71781b0.this.f208311d.f207962f.f228714U;
            if (linkedList != null && linkedList.size() > 0) {
                int i = 0;
                Iterator<C64483k33> it = C71781b0.this.f208311d.f207962f.f228714U.iterator();
                while (it.hasNext()) {
                    C64483k33 next = it.next();
                    if (!Util.isNullOrNil(next.f183885d)) {
                        e0Var.mo107142f(i, next.f183885d);
                    }
                    i++;
                }
            }
            WalletLqtDetailUI walletLqtDetailUI = C71781b0.this.f208311d;
            if (!walletLqtDetailUI.f207962f.f228692B) {
                e0Var.mo107140d(-1, walletLqtDetailUI.getContext().getResources().getColor(C0966R.color.f2966ao), C71781b0.this.f208311d.getString(C0966R.string.kwg));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.b0$b */
    public class C71783b implements C11184p0 {

        /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.b0$b$a */
        public class C71784a implements DialogInterface.OnClickListener {
            public C71784a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C71781b0.this.f208311d.f207945U = false;
                C71781b0.this.f208311d.startActivityForResult(new Intent(C71781b0.this.f208311d, WalletLqtSimpleCheckPwdUI.class), 123);
            }
        }

        public C71783b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C64483k33 k332;
            int i2;
            String str;
            if (menuItem.getItemId() == -1) {
                C78023zk3 zk32 = C71781b0.this.f208311d.f207962f;
                if (!zk32.f228692B) {
                    if (!Util.isNullOrNil(zk32.f228699I)) {
                        str = C71781b0.this.f208311d.f207962f.f228699I;
                    } else {
                        WalletLqtDetailUI walletLqtDetailUI = C71781b0.this.f208311d;
                        str = walletLqtDetailUI.f207962f.f228693C == 0 ? walletLqtDetailUI.getString(C0966R.string.kwi) : walletLqtDetailUI.getString(C0966R.string.f361568kw1);
                    }
                    WalletLqtDetailUI walletLqtDetailUI2 = C71781b0.this.f208311d;
                    C76879j.m92754y(walletLqtDetailUI2, str, "", walletLqtDetailUI2.getString(C0966R.string.bfj), new C71784a());
                    return;
                }
            }
            LinkedList<C64483k33> linkedList = C71781b0.this.f208311d.f207962f.f228714U;
            if (linkedList != null && linkedList.size() > 0 && menuItem.getItemId() < C71781b0.this.f208311d.f207962f.f228714U.size() && (i2 = k332.f183889h) != 1) {
                if (i2 == 2) {
                    if (!Util.isNullOrNil(k332.f183887f)) {
                        C75228t.m90221N(C71781b0.this.f208311d, k332.f183887f, false);
                    }
                } else if (i2 == 3 && !Util.isNullOrNil((k332 = C71781b0.this.f208311d.f207962f.f228714U.get(menuItem.getItemId())).f183890i) && !Util.isNullOrNil(k332.f183887f)) {
                    C75228t.m90224Q(k332.f183890i, k332.f183887f, 0, 1061);
                }
            }
        }
    }

    public C71781b0(WalletLqtDetailUI walletLqtDetailUI) {
        this.f208311d = walletLqtDetailUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C77407n nVar = new C77407n((Context) this.f208311d, 1, false);
        nVar.f225771i = new C71782a();
        nVar.f225782p = new C71783b();
        nVar.mo107573q();
        return false;
    }
}
