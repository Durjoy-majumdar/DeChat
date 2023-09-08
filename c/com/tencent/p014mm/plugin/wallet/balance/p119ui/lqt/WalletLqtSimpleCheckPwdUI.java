package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.wallet_core.utils.C5811n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;
import gr3.C76024a;
import java.util.HashSet;
import nj3.C88989a;
import ob0.C117747y;
import v53.C78356x;

@C88989a(1)
/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSimpleCheckPwdUI */
public class WalletLqtSimpleCheckPwdUI extends WalletBaseUI {

    /* renamed from: d */
    public TextView f208304d;

    /* renamed from: e */
    public TextView f208305e;

    /* renamed from: f */
    public EditHintPasswdView f208306f;

    /* renamed from: g */
    public C78356x f208307g;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSimpleCheckPwdUI$a */
    public class C71778a implements MenuItem.OnMenuItemClickListener {
        public C71778a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletLqtSimpleCheckPwdUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSimpleCheckPwdUI$b */
    public class C71779b implements EditHintPasswdView.C75206c {
        public C71779b() {
        }

        public void onInputValidChange(boolean z) {
            Log.m105925i("MicroMsg.WalletLqtSimpleCheckPwdUI", "input isValid: %s", Boolean.valueOf(z));
            if (z) {
                WalletLqtSimpleCheckPwdUI.this.f208307g = new C78356x(WalletLqtSimpleCheckPwdUI.this.f208306f.getText(), 7, WalletLqtSimpleCheckPwdUI.this.getPayReqKey());
                WalletLqtSimpleCheckPwdUI walletLqtSimpleCheckPwdUI = WalletLqtSimpleCheckPwdUI.this;
                walletLqtSimpleCheckPwdUI.doSceneForceProgress(walletLqtSimpleCheckPwdUI.f208307g);
            }
        }
    }

    public void cleanUiData(int i) {
        super.cleanUiData(i);
        EditHintPasswdView editHintPasswdView = this.f208306f;
        if (editHintPasswdView != null) {
            editHintPasswdView.mo105043a();
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cec;
    }

    public void initView() {
        this.f208304d = (TextView) findViewById(C0966R.C0970id.lja);
        this.f208305e = (TextView) findViewById(C0966R.C0970id.lj6);
        this.f208306f = (EditHintPasswdView) findViewById(C0966R.C0970id.f7k);
        C75228t.m90240d(this.f208304d);
        hideKeyboardPushDownBtn();
        C76024a.m91321b(this.f208306f);
        this.f208306f.setOnInputValidListener(new C71779b());
        this.f208305e.setText(C0966R.string.kxo);
        setEditFocusListener(this.f208306f, 0, false);
        showTenpayKB();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        overridePendingTransition(C0966R.C0968anim.f2492eg, C0966R.C0968anim.f2493eh);
        setBackBtn(new C71778a());
        initView();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105919d("MicroMsg.WalletLqtSimpleCheckPwdUI", "scene end. errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar instanceof C78356x) {
            if (i == 0 && i2 == 0) {
                String text = this.f208306f.getText();
                Intent intent = new Intent();
                intent.putExtra("lqt_enc_pwd", text);
                setResult(-1, intent);
                finish();
                return true;
            }
            EditHintPasswdView editHintPasswdView = this.f208306f;
            if (editHintPasswdView != null) {
                editHintPasswdView.mo105043a();
            }
        }
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C5811n.class);
    }
}
