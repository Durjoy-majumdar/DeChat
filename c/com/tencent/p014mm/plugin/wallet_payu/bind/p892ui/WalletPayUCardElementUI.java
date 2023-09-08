package com.tencent.p014mm.plugin.wallet_payu.bind.p892ui;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import eb0.C75592q0;
import gr3.C76024a;
import java.util.HashMap;
import java.util.HashSet;
import nj3.C88989a;
import ob0.C117747y;
import r63.C77487a;
import s63.C77622b;
import v63.C78359a;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI */
public class WalletPayUCardElementUI extends WalletBaseUI implements WalletFormView.C75209c {

    /* renamed from: d */
    public WalletFormView f211141d;

    /* renamed from: e */
    public WalletFormView f211142e;

    /* renamed from: f */
    public WalletFormView f211143f;

    /* renamed from: g */
    public TextView f211144g;

    /* renamed from: h */
    public TextView f211145h;

    /* renamed from: i */
    public Button f211146i;

    /* renamed from: j */
    public C72578b f211147j;

    /* renamed from: n */
    public boolean f211148n = false;

    /* renamed from: o */
    public boolean f211149o = false;

    /* renamed from: p */
    public HashMap<String, NetScenePayUElementQuery.PayUBankcardElement> f211150p = null;

    /* renamed from: q */
    public HashSet<String> f211151q = null;

    /* renamed from: com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI$a */
    public abstract class C72577a implements TextWatcher {
        public C72577a(WalletPayUCardElementUI walletPayUCardElementUI, C72579a aVar) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI$b */
    public class C72578b {

        /* renamed from: a */
        public boolean f211152a;

        /* renamed from: b */
        public boolean f211153b;

        /* renamed from: c */
        public boolean f211154c;

        public C72578b() {
        }

        /* renamed from: a */
        public void mo99979a() {
            boolean z;
            this.f211152a = WalletPayUCardElementUI.this.f211141d.mo105094l();
            this.f211153b = WalletPayUCardElementUI.this.f211142e.mo105094l();
            boolean l = WalletPayUCardElementUI.this.f211143f.mo105094l();
            this.f211154c = l;
            WalletPayUCardElementUI walletPayUCardElementUI = WalletPayUCardElementUI.this;
            if (!walletPayUCardElementUI.f211149o || l) {
                walletPayUCardElementUI.f211145h.setVisibility(4);
            } else {
                walletPayUCardElementUI.f211145h.setVisibility(0);
                WalletPayUCardElementUI.this.f211145h.setText(C0966R.string.koj);
            }
            WalletPayUCardElementUI walletPayUCardElementUI2 = WalletPayUCardElementUI.this;
            if (walletPayUCardElementUI2.f211148n) {
                if (!this.f211152a) {
                    walletPayUCardElementUI2.f211144g.setVisibility(0);
                    WalletPayUCardElementUI walletPayUCardElementUI3 = WalletPayUCardElementUI.this;
                    walletPayUCardElementUI3.f211144g.setTextColor(walletPayUCardElementUI3.getResources().getColor(C0966R.color.a_0));
                    WalletPayUCardElementUI.this.f211144g.setText(C0966R.string.f361541ko1);
                } else {
                    if (walletPayUCardElementUI2.f211150p.containsKey(walletPayUCardElementUI2.f211141d.getText())) {
                        WalletPayUCardElementUI walletPayUCardElementUI4 = WalletPayUCardElementUI.this;
                        if (!walletPayUCardElementUI4.f211151q.contains(walletPayUCardElementUI4.f211141d.getText())) {
                            WalletPayUCardElementUI walletPayUCardElementUI5 = WalletPayUCardElementUI.this;
                            NetScenePayUElementQuery.PayUBankcardElement payUBankcardElement = walletPayUCardElementUI5.f211150p.get(walletPayUCardElementUI5.f211141d.getText());
                            WalletPayUCardElementUI.this.f211144g.setVisibility(0);
                            if (!Util.isNullOrNil(payUBankcardElement.f211135d)) {
                                WalletPayUCardElementUI walletPayUCardElementUI6 = WalletPayUCardElementUI.this;
                                walletPayUCardElementUI6.f211144g.setTextColor(walletPayUCardElementUI6.getResources().getColor(C0966R.color.f3563xt));
                                WalletPayUCardElementUI.this.f211144g.setText(payUBankcardElement.f211137f);
                            } else {
                                WalletPayUCardElementUI walletPayUCardElementUI7 = WalletPayUCardElementUI.this;
                                walletPayUCardElementUI7.f211144g.setTextColor(walletPayUCardElementUI7.getResources().getColor(C0966R.color.a_0));
                                WalletPayUCardElementUI.this.f211144g.setText(payUBankcardElement.f211137f);
                                this.f211152a = false;
                            }
                        }
                    }
                    WalletPayUCardElementUI walletPayUCardElementUI8 = WalletPayUCardElementUI.this;
                    walletPayUCardElementUI8.doSceneProgress(new NetScenePayUElementQuery(walletPayUCardElementUI8.f211141d.getText()), false);
                    WalletPayUCardElementUI walletPayUCardElementUI9 = WalletPayUCardElementUI.this;
                    walletPayUCardElementUI9.f211151q.add(walletPayUCardElementUI9.f211141d.getText());
                    WalletPayUCardElementUI.this.f211144g.setVisibility(0);
                    WalletPayUCardElementUI walletPayUCardElementUI10 = WalletPayUCardElementUI.this;
                    walletPayUCardElementUI10.f211144g.setTextColor(walletPayUCardElementUI10.getResources().getColor(C0966R.color.f3563xt));
                    WalletPayUCardElementUI walletPayUCardElementUI11 = WalletPayUCardElementUI.this;
                    walletPayUCardElementUI11.f211144g.setText(walletPayUCardElementUI11.getString(C0966R.string.kng));
                    z = true;
                    if (this.f211152a || this.f211153b || this.f211154c || z) {
                        WalletPayUCardElementUI.this.f211146i.setEnabled(false);
                    } else {
                        WalletPayUCardElementUI.this.f211146i.setEnabled(true);
                        return;
                    }
                }
            }
            z = false;
            if (this.f211152a && this.f211153b && this.f211154c) {
            }
            WalletPayUCardElementUI.this.f211146i.setEnabled(false);
        }
    }

    /* renamed from: H7 */
    public static void m84945H7(WalletPayUCardElementUI walletPayUCardElementUI, View view, Editable editable) {
        if (editable != null) {
            walletPayUCardElementUI.getClass();
            if (editable.length() != 0) {
                if (view.getId() == walletPayUCardElementUI.f211141d.getId()) {
                    walletPayUCardElementUI.f211148n = true;
                } else if (view.getId() == walletPayUCardElementUI.f211143f.getId()) {
                    walletPayUCardElementUI.f211149o = true;
                } else {
                    view.getId();
                    walletPayUCardElementUI.f211142e.getId();
                }
            }
        }
        walletPayUCardElementUI.f211147j.mo99979a();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bmg;
    }

    public boolean needConfirmFinish() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f211147j = new C72578b();
        this.f211150p = new HashMap<>();
        this.f211151q = new HashSet<>();
        WalletFormView walletFormView = (WalletFormView) findViewById(C0966R.C0970id.aw9);
        this.f211141d = walletFormView;
        C76024a.m91320a(walletFormView);
        WalletFormView walletFormView2 = (WalletFormView) findViewById(C0966R.C0970id.f357829bz1);
        this.f211142e = walletFormView2;
        C76024a.m91323d(this, walletFormView2);
        WalletFormView walletFormView3 = (WalletFormView) findViewById(C0966R.C0970id.bym);
        this.f211143f = walletFormView3;
        C76024a.m91322c(this, walletFormView3);
        this.f211144g = (TextView) findViewById(C0966R.C0970id.lg4);
        this.f211145h = (TextView) findViewById(C0966R.C0970id.lft);
        this.f211146i = (Button) findViewById(C0966R.C0970id.hfe);
        setEditFocusListener(this.f211141d, 0, false);
        setEditFocusListener(this.f211143f, 0, false);
        this.f211141d.setOnInputValidChangeListener(this);
        this.f211143f.setOnInputValidChangeListener(this);
        this.f211142e.setOnInputValidChangeListener(this);
        this.f211141d.setEncryptType(0);
        this.f211143f.mo105069a(new C72579a(this));
        this.f211142e.mo105069a(new C72580b(this));
        this.f211141d.mo105069a(new C72581c(this));
        this.f211146i.setOnClickListener(new C77622b(this));
        ((TextView) findViewById(C0966R.C0970id.f359562lj3)).setText(C75592q0.m90763K() ? C0966R.string.l5m : C0966R.string.l5n);
        C78359a.m94632a(this, (TextView) findViewById(C0966R.C0970id.k0g));
    }

    public void onInputValidChange(boolean z) {
    }

    public void onResume() {
        super.onResume();
        this.f211147j.mo99979a();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof NetScenePayUElementQuery) {
            NetScenePayUElementQuery netScenePayUElementQuery = (NetScenePayUElementQuery) yVar;
            this.f211150p.put(netScenePayUElementQuery.f211133d, (NetScenePayUElementQuery.PayUBankcardElement) getInput().getParcelable("key_card_element"));
            this.f211147j.mo99979a();
            this.f211151q.remove(netScenePayUElementQuery.f211133d);
            return true;
        }
        if ((yVar instanceof C77487a) && !(i == 0 && i2 == 0)) {
            this.f211141d.setEncryptType(0);
        }
        return false;
    }
}
