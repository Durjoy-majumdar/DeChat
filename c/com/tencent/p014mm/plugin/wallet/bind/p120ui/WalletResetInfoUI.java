package com.tencent.p014mm.plugin.wallet.bind.p120ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import b63.C67212y;
import c53.C67341a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletPhoneInputView;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.MMScrollView;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import d53.C75326b;
import d53.C75327c;
import di3.C86312j;
import gr3.C76024a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import nc0.C76850a;
import nj3.C88989a;
import ob0.C117747y;
import p281yz.C79173v;
import v53.C78358z;
import yq3.C79143a;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletResetInfoUI */
public class WalletResetInfoUI extends WalletBaseUI implements WalletFormView.C75209c {

    /* renamed from: r */
    public static final /* synthetic */ int f208494r = 0;

    /* renamed from: d */
    public Button f208495d;

    /* renamed from: e */
    public WalletFormView f208496e;

    /* renamed from: f */
    public WalletFormView f208497f;

    /* renamed from: g */
    public WalletFormView f208498g;

    /* renamed from: h */
    public WalletFormView f208499h;

    /* renamed from: i */
    public WalletPhoneInputView f208500i;

    /* renamed from: j */
    public Orders f208501j;

    /* renamed from: n */
    public Authen f208502n;

    /* renamed from: o */
    public ElementQuery f208503o;

    /* renamed from: p */
    public TextView f208504p;

    /* renamed from: q */
    public Bankcard f208505q;

    /* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletResetInfoUI$a */
    public class C71880a implements View.OnClickListener {
        public C71880a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/bind/ui/WalletResetInfoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletResetInfoUI walletResetInfoUI = WalletResetInfoUI.this;
            int i = WalletResetInfoUI.f208494r;
            if (!walletResetInfoUI.mo99068H7()) {
                Log.m105928w("Micromsg.WalletResetInfoUI", "input format illegal!");
                C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletResetInfoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (WalletResetInfoUI.this.f208498g.getVisibility() == 0) {
                WalletResetInfoUI walletResetInfoUI2 = WalletResetInfoUI.this;
                walletResetInfoUI2.f208502n.f209377q = walletResetInfoUI2.f208498g.getText();
            }
            if (WalletResetInfoUI.this.f208497f.getVisibility() == 0) {
                WalletResetInfoUI walletResetInfoUI3 = WalletResetInfoUI.this;
                walletResetInfoUI3.f208502n.f209378r = Util.nullAs(walletResetInfoUI3.f208497f.getText(), "");
            }
            if (WalletResetInfoUI.this.f208500i.getVisibility() == 0) {
                WalletResetInfoUI walletResetInfoUI4 = WalletResetInfoUI.this;
                walletResetInfoUI4.f208502n.f209375o = Util.nullAs(walletResetInfoUI4.f208499h.getText(), "");
                WalletResetInfoUI.this.getInput().putString("key_mobile", C75228t.m90227T(WalletResetInfoUI.this.f208502n.f209375o));
            }
            Authen authen = WalletResetInfoUI.this.f208502n;
            Log.m105919d("Micromsg.WalletResetInfoUI", "tft: bank_type: %s, bank_serial: %s", authen.f209370g, authen.f209371h);
            Authen authen2 = WalletResetInfoUI.this.f208502n;
            authen2.f209368e = 1;
            authen2.f209360M = "+" + WalletResetInfoUI.this.f208500i.getCountryCode();
            if (WalletResetInfoUI.this.getInput().getBoolean("key_is_changing_balance_phone_num", false)) {
                WalletResetInfoUI walletResetInfoUI5 = WalletResetInfoUI.this;
                walletResetInfoUI5.doSceneProgress(C67341a.m79679b(walletResetInfoUI5.f208502n, walletResetInfoUI5.f208501j, walletResetInfoUI5.getInput().getBoolean("key_isbalance", false)));
            } else {
                WalletResetInfoUI walletResetInfoUI6 = WalletResetInfoUI.this;
                C75326b a = C67341a.m79678a(walletResetInfoUI6.f208502n, walletResetInfoUI6.f208501j, false);
                if (a != null) {
                    WalletResetInfoUI.this.doSceneProgress(a);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletResetInfoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public final boolean mo99068H7() {
        boolean b = this.f208497f.mo105070b((View) null);
        if (this.f208500i.getVisibility() == 0) {
            if ((this.f208500i.f210731h == 0) && !this.f208499h.mo105070b((View) null)) {
                b = false;
            }
        }
        if (!this.f208498g.mo105070b((View) null)) {
            b = false;
        }
        if (this.f208501j == null || this.f208502n == null) {
            b = false;
        }
        if (b) {
            this.f208495d.setEnabled(true);
            this.f208495d.setClickable(true);
        } else {
            this.f208495d.setEnabled(false);
            this.f208495d.setClickable(false);
        }
        return b;
    }

    /* renamed from: I7 */
    public final void mo99069I7() {
        int i = getInput().getInt("key_err_code", 408);
        boolean z = true;
        if (i == 402) {
            setMMTitle((int) C0966R.string.l7f);
            this.f208498g.setVisibility(0);
            this.f208504p.setText(C0966R.string.l7e);
        } else if (i != 403) {
            if (getInput().getBoolean("key_balance_change_phone_need_confirm_phone", true)) {
                setMMTitle((int) C0966R.string.l7j);
                this.f208500i.setVisibility(0);
            } else {
                setMMTitle((int) C0966R.string.l7h);
            }
            Bankcard bankcard = this.f208505q;
            if (bankcard != null) {
                Log.m105919d("Micromsg.WalletResetInfoUI", "bankPhone: %s", bankcard.field_bankPhone);
                this.f208504p.setText(String.format(getString(C0966R.string.l7i), new Object[]{this.f208505q.field_bankPhone}));
            }
            if (this.f208503o == null && this.f208505q != null) {
                this.f208503o = ((C79173v) C86312j.m106911c(C79173v.class)).f232472d.mo91345a(this.f208505q.field_bankcardType);
            }
            ElementQuery elementQuery = this.f208503o;
            if (elementQuery != null && elementQuery.f209509i) {
                this.f208498g.setVisibility(0);
            }
            ElementQuery elementQuery2 = this.f208503o;
            if (elementQuery2 != null && elementQuery2.f209510j) {
                this.f208497f.setVisibility(0);
            }
        } else {
            setMMTitle((int) C0966R.string.l7m);
            this.f208497f.setVisibility(0);
            this.f208504p.setText(C0966R.string.l7l);
        }
        Button button = (Button) findViewById(C0966R.C0970id.hfe);
        this.f208495d = button;
        button.setOnClickListener(new C71880a());
        mo99068H7();
        if (!(getInput().getInt("key_err_code", 408) == 408 && this.f208503o == null)) {
            z = false;
        }
        if (z) {
            setContentViewVisibility(4);
        } else {
            setContentViewVisibility(0);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cgb;
    }

    public void initView() {
        this.f208504p = (TextView) findViewById(C0966R.C0970id.ljf);
        Bankcard bankcard = (Bankcard) getInput().getParcelable("key_switch_phone_reset_bank_card");
        if (bankcard == null) {
            bankcard = (Bankcard) getInput().getParcelable("key_bankcard");
        }
        this.f208505q = bankcard;
        this.f208501j = (Orders) getInput().getParcelable("key_orders");
        Authen authen = (Authen) getInput().getParcelable("key_authen");
        this.f208502n = authen;
        if (authen == null) {
            Log.m105928w("Micromsg.WalletResetInfoUI", "authen is null!");
            return;
        }
        if (TextUtils.isEmpty(getInput().getString("key_pwd1", ""))) {
            getInput().putString("key_pwd1", this.f208502n.f209369f);
            Log.m105920e("Micromsg.WalletResetInfoUI", "pwd is empty, reset it to input");
        }
        this.f208503o = (ElementQuery) getInput().getParcelable("elemt_query");
        WalletPhoneInputView walletPhoneInputView = (WalletPhoneInputView) findViewById(C0966R.C0970id.gw8);
        this.f208500i = walletPhoneInputView;
        this.f208499h = walletPhoneInputView.getPhoneNumberEt();
        boolean z = false;
        if (this.f208505q.f209392E2 == 1) {
            this.f208500i.mo99815c();
        } else {
            WalletPhoneInputView walletPhoneInputView2 = this.f208500i;
            walletPhoneInputView2.f210731h = 0;
            C76850a.C76851a aVar = (C76850a.C76851a) ((HashMap) walletPhoneInputView2.f210732i).get("86");
            walletPhoneInputView2.f210734n = aVar.f224676b;
            String str = aVar.f224677c;
            walletPhoneInputView2.f210733j = str;
            walletPhoneInputView2.f210727d.setText(str);
            walletPhoneInputView2.f210729f.setText(walletPhoneInputView2.f210734n);
            walletPhoneInputView2.f210727d.setVisibility(8);
            walletPhoneInputView2.f210729f.setVisibility(8);
            walletPhoneInputView2.f210730g.setVisibility(8);
        }
        setEditFocusListener(this.f208500i.getPhoneNumberEt(), 0, false);
        setEditFocusListener(this.f208500i.getPhoneNumberEt(), (EditText) this.f208500i.findViewById(C0966R.C0970id.i1k), 0, false, false, true);
        this.f208496e = (WalletFormView) findViewById(C0966R.C0970id.a6t);
        WalletFormView walletFormView = (WalletFormView) findViewById(C0966R.C0970id.f357829bz1);
        this.f208497f = walletFormView;
        C76024a.m91323d(this, walletFormView);
        WalletFormView walletFormView2 = (WalletFormView) findViewById(C0966R.C0970id.bym);
        this.f208498g = walletFormView2;
        C76024a.m91322c(this, walletFormView2);
        this.f208497f.setOnInputValidChangeListener(this);
        this.f208498g.setOnInputValidChangeListener(this);
        this.f208499h.setOnInputValidChangeListener(this);
        MMScrollView mMScrollView = (MMScrollView) findViewById(C0966R.C0970id.ljl);
        mMScrollView.mo104932a(mMScrollView, mMScrollView);
        Bankcard bankcard2 = this.f208505q;
        if (bankcard2 != null) {
            this.f208496e.setText(bankcard2.field_desc);
        } else {
            this.f208496e.setVisibility(8);
        }
        mo99069I7();
        if (getInput().getInt("key_err_code", 408) == 408 && this.f208503o == null) {
            z = true;
        }
        if (z) {
            doSceneProgress(new C78358z("", "", (PayInfo) null), true);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f208500i.mo99816d(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onInputValidChange(boolean z) {
        mo99068H7();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105918d("Micromsg.WalletResetInfoUI", " errCode: " + i2 + " errMsg :" + str);
        if (i == 0 && i2 == 0) {
            Bundle input = getInput();
            if ((yVar instanceof C75326b) || (yVar instanceof C75327c)) {
                C75326b bVar = (C75326b) yVar;
                input.putBoolean("key_need_verify_sms", !bVar.f221491A);
                input.putString("kreq_token", bVar.f221494D);
                if (bVar.isPaySuccess) {
                    input.putParcelable("key_orders", bVar.f221492B);
                }
                RealnameGuideHelper realnameGuideHelper = bVar.f222394s;
                if (realnameGuideHelper != null) {
                    input.putParcelable("key_realname_guide_helper", realnameGuideHelper);
                }
                input.putInt("key_err_code", 0);
                C79143a.m95765d(this, input);
                return true;
            } else if ((yVar instanceof C78358z) && this.f208505q != null) {
                C67212y yVar2 = ((C79173v) C86312j.m106911c(C79173v.class)).f232472d;
                String str2 = this.f208505q.field_bindSerial;
                yVar2.getClass();
                ElementQuery elementQuery = null;
                if (!Util.isNullOrNil(str2)) {
                    List<ElementQuery> list = yVar2.f193007b;
                    if (list != null && list.size() != 0) {
                        Iterator<ElementQuery> it = yVar2.f193007b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                Log.m105928w("MicroMsg.WalletBankElementManager", "hy: not found given element query");
                                break;
                            }
                            ElementQuery next = it.next();
                            if (str2.equals(next.f209504d)) {
                                elementQuery = next;
                                break;
                            }
                        }
                    } else {
                        Log.m105928w("MicroMsg.WalletBankElementManager", "hy: element list is null. get element failed");
                    }
                } else {
                    Log.m105928w("MicroMsg.WalletBankElementManager", "hy: bindSerail given is null");
                }
                this.f208503o = elementQuery;
                mo99069I7();
            }
        }
        return false;
    }
}
