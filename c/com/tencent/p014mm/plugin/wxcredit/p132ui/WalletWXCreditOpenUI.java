package com.tencent.p014mm.plugin.wxcredit.p132ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import j20.C117292a;
import java.util.ArrayList;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenUI */
public class WalletWXCreditOpenUI extends WalletBaseUI {

    /* renamed from: d */
    public Button f211420d;

    /* renamed from: e */
    public Bankcard f211421e;

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenUI$a */
    public class C72666a implements CompoundButton.OnCheckedChangeListener {
        public C72666a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            WalletWXCreditOpenUI.this.f211420d.setEnabled(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenUI$b */
    public class C72667b implements View.OnClickListener {
        public C72667b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletWXCreditOpenUI walletWXCreditOpenUI = WalletWXCreditOpenUI.this;
            Bankcard bankcard = walletWXCreditOpenUI.f211421e;
            C75228t.m90214G(walletWXCreditOpenUI, bankcard.field_bankcardType, bankcard.field_bankName, true, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenUI$c */
    public class C72668c implements View.OnClickListener {
        public C72668c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletWXCreditOpenUI.this.next();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f360065ch1;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.lcg);
        ((CheckBox) findViewById(C0966R.C0970id.f5661l6)).setOnCheckedChangeListener(new C72666a());
        findViewById(C0966R.C0970id.f5655l0).setOnClickListener(new C72667b());
        Button button = (Button) findViewById(C0966R.C0970id.hfe);
        this.f211420d = button;
        button.setOnClickListener(new C72668c());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f211421e = (Bankcard) getInput().getParcelable("key_bankcard");
        initView();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
