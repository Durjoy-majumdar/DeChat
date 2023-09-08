package com.tencent.p014mm.plugin.wxcredit.p132ui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import b63.C67205s0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C88989a;
import ob0.C117747y;
import p281yz.C79173v;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenResultUI */
public class WalletWXCreditOpenResultUI extends WalletBaseUI {

    /* renamed from: e */
    public static final /* synthetic */ int f211417e = 0;

    /* renamed from: d */
    public CheckBox f211418d;

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenResultUI$a */
    public class C72665a implements View.OnClickListener {
        public C72665a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletWXCreditOpenResultUI walletWXCreditOpenResultUI = WalletWXCreditOpenResultUI.this;
            int i = WalletWXCreditOpenResultUI.f211417e;
            walletWXCreditOpenResultUI.getNetController().mo91271d(Boolean.valueOf(walletWXCreditOpenResultUI.f211418d.isChecked()));
            C117292a.m165361g(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f360064ch0;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.lca);
        TextView textView = (TextView) findViewById(C0966R.C0970id.lk6);
        this.f211418d = (CheckBox) findViewById(C0966R.C0970id.f6192zw);
        Bankcard bankcard = (Bankcard) getInput().getParcelable("key_bankcard");
        if (bankcard != null) {
            this.f211418d.setText(getString(C0966R.string.lcc, new Object[]{bankcard.field_bankName}));
            textView.setText(C0966R.string.lcd);
        }
        ((Button) findViewById(C0966R.C0970id.hfe)).setOnClickListener(new C72665a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(196658, Boolean.TRUE);
        C67205s0 Ex0 = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0();
        Ex0.getClass();
        Ex0.f192962o = Util.nowSecond();
        initView();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        getNetController().mo91271d(Boolean.valueOf(this.f211418d.isChecked()));
        return true;
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
