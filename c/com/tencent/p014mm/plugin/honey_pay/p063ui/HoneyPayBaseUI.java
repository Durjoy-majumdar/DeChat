package com.tencent.p014mm.plugin.honey_pay.p063ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI */
public abstract class HoneyPayBaseUI extends WalletBaseUI {

    /* renamed from: d */
    public final String f114712d = ("MicroMsg." + getClass().getSimpleName());

    /* renamed from: e */
    public int f114713e = C0966R.color.al6;

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI$a */
    public class C42409a implements MenuItem.OnMenuItemClickListener {
        public C42409a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            HoneyPayBaseUI.this.hideVKB();
            HoneyPayBaseUI.this.hideTenpayKB();
            HoneyPayBaseUI.this.finish();
            return false;
        }
    }

    /* renamed from: H7 */
    public void mo66493H7() {
        setActionbarColor(getResources().getColor(this.f114713e));
        hideActionbarLine();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo66493H7();
        setBackBtn(new C42409a());
    }
}
