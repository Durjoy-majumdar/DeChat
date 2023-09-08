package com.tencent.p014mm.plugin.wxcredit.p132ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import ob0.C117747y;
import qb3.C77309a;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenNotifyUI */
public class WalletWXCreditOpenNotifyUI extends WalletBaseUI {

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenNotifyUI$a */
    public class C72663a implements MenuItem.OnMenuItemClickListener {
        public C72663a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletWXCreditOpenNotifyUI.this.setResult(-1);
            WalletWXCreditOpenNotifyUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenNotifyUI$b */
    public class C72664b implements View.OnClickListener {
        public C72664b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenNotifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Bundle bundle = new Bundle();
            bundle.putParcelable("key_bankcard", WalletWXCreditOpenNotifyUI.this.getInput().getParcelable("key_bankcard"));
            C79143a.m95771j(WalletWXCreditOpenNotifyUI.this, C77309a.class, bundle, (C79148e.C79149a) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenNotifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cgz;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.lc8);
        int i = 0;
        showHomeBtn(false);
        enableBackMenu(false);
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C72663a());
        ((TextView) findViewById(C0966R.C0970id.ljw)).setText(C75228t.m90256l(getInput().getDouble("key_total_amount")));
        Button button = (Button) findViewById(C0966R.C0970id.hfe);
        button.setOnClickListener(new C72664b());
        if (!getInput().getBoolean("key_can_upgrade_amount", true)) {
            i = 8;
        }
        button.setVisibility(i);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(196658, Boolean.FALSE);
        initView();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
