package com.tencent.p014mm.plugin.wallet.pay.p121ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72473y;
import di3.C86312j;
import java.util.ArrayList;
import java.util.Collections;
import nj3.C88989a;
import p281yz.C79173v;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletChangeLoanRepayBankcardUI */
public class WalletChangeLoanRepayBankcardUI extends WalletChangeBankcardUI {

    /* renamed from: A */
    public String f208559A;

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletChangeLoanRepayBankcardUI$a */
    public class C71902a implements MenuItem.OnMenuItemClickListener {
        public C71902a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletChangeLoanRepayBankcardUI.this.setResult(-1, (Intent) null);
            return true;
        }
    }

    /* renamed from: J7 */
    public C72473y mo99090J7() {
        ArrayList<Bankcard> arrayList = ((C79173v) C86312j.m106911c(C79173v.class)).Cx0().f192926a;
        this.f208537h = arrayList;
        if (arrayList != null) {
            Collections.sort(arrayList, new C71955d(this));
        }
        C72473y yVar = new C72473y(this, this.f208537h, this.f208539j, this.f208543q);
        yVar.f210821h = this.f208559A;
        return yVar;
    }

    /* renamed from: L7 */
    public void mo99092L7(int i) {
        ArrayList<Bankcard> arrayList = this.f208537h;
        int size = arrayList != null ? arrayList.size() : 0;
        ArrayList<Bankcard> arrayList2 = this.f208537h;
        if (arrayList2 != null && i < size) {
            Bankcard bankcard = arrayList2.get(i);
            this.f208540n = bankcard;
            this.f208541o.f210821h = bankcard.field_bindSerial;
            this.f208535f.setEnabled(true);
            this.f208541o.notifyDataSetChanged();
            Intent intent = new Intent();
            intent.putExtra("bindSerial", bankcard.field_bindSerial);
            intent.putExtra("ret", 0);
            setResult(-1, intent);
        } else if (size == i) {
            Intent intent2 = new Intent();
            intent2.putExtra("ret", -1003);
            setResult(-1, intent2);
        }
        finish();
    }

    public int getForceOrientation() {
        return 1;
    }

    public void onCreate(Bundle bundle) {
        this.f208559A = getIntent().getStringExtra("bindSerial");
        super.onCreate(bundle);
        setBackBtn(new C71902a());
    }
}
