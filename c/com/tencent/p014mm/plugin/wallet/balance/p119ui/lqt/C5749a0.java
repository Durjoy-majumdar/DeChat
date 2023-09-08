package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import te3.C64483k33;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.a0 */
public class C5749a0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C64483k33 f21800d;

    /* renamed from: e */
    public final /* synthetic */ WalletLqtDetailUI f21801e;

    public C5749a0(WalletLqtDetailUI walletLqtDetailUI, C64483k33 k332) {
        this.f21801e = walletLqtDetailUI;
        this.f21800d = k332;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C64483k33 k332 = this.f21800d;
        int i = k332.f183889h;
        if (i != 1) {
            if (i == 2) {
                if (!Util.isNullOrNil(k332.f183887f)) {
                    C75228t.m90221N(this.f21801e, this.f21800d.f183887f, false);
                }
            } else if (i == 3 && !Util.isNullOrNil(k332.f183890i) && !Util.isNullOrNil(this.f21800d.f183887f)) {
                C64483k33 k333 = this.f21800d;
                C75228t.m90224Q(k333.f183890i, k333.f183887f, 0, 1061);
            }
        }
        return false;
    }
}
