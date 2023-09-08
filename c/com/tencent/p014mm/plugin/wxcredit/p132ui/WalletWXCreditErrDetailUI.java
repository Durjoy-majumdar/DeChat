package com.tencent.p014mm.plugin.wxcredit.p132ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import j20.C117292a;
import java.util.ArrayList;
import ob0.C117747y;
import yq3.C79143a;

/* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditErrDetailUI */
public class WalletWXCreditErrDetailUI extends WalletBaseUI {

    /* renamed from: d */
    public Bankcard f211410d;

    /* renamed from: e */
    public String f211411e;

    /* renamed from: f */
    public TextView f211412f;

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditErrDetailUI$a */
    public class C72661a implements View.OnClickListener {
        public C72661a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditErrDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletWXCreditErrDetailUI walletWXCreditErrDetailUI = WalletWXCreditErrDetailUI.this;
            C75228t.m90219L(walletWXCreditErrDetailUI, walletWXCreditErrDetailUI.f211411e, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditErrDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditErrDetailUI$b */
    public class C72662b implements View.OnClickListener {
        public C72662b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditErrDetailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletWXCreditErrDetailUI walletWXCreditErrDetailUI = WalletWXCreditErrDetailUI.this;
            C79143a.m95765d(walletWXCreditErrDetailUI, walletWXCreditErrDetailUI.getInput());
            C117292a.m165361g(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditErrDetailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cgy;
    }

    public void initView() {
        this.f211410d = (Bankcard) getInput().getParcelable("key_bankcard");
        this.f211411e = getInput().getString("key_repayment_url");
        if (this.f211410d != null) {
            ((TextView) findViewById(C0966R.C0970id.lf8)).setOnClickListener(new C72661a());
            TextView textView = (TextView) findViewById(C0966R.C0970id.lf9);
            this.f211412f = textView;
            textView.setOnClickListener(new C72662b());
            this.f211412f.setVisibility(getInput().getBoolean("key_can_unbind", true) ? 0 : 8);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.kmz);
        initView();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
