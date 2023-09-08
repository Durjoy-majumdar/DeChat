package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.SwitchPhoneItemGroupView;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.SwitchPhoneItemView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import nj3.C88989a;
import ob0.C117747y;
import p281yz.C79173v;
import te3.C51622v00;
import te3.C77958k9;
import v53.C52768h;
import v53.C78358z;
import yq3.C79143a;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletSwitchVerifyPhoneUI */
public class WalletSwitchVerifyPhoneUI extends WalletBaseUI {

    /* renamed from: g */
    public static final /* synthetic */ int f210294g = 0;

    /* renamed from: d */
    public SwitchPhoneItemGroupView f210295d;

    /* renamed from: e */
    public List<C77958k9> f210296e;

    /* renamed from: f */
    public boolean f210297f = false;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletSwitchVerifyPhoneUI$a */
    public class C72314a implements SwitchPhoneItemGroupView.C72441b {
        public C72314a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletSwitchVerifyPhoneUI$b */
    public class C72315b implements Comparator<C77958k9> {
        public C72315b(WalletSwitchVerifyPhoneUI walletSwitchVerifyPhoneUI) {
        }

        public int compare(Object obj, Object obj2) {
            C77958k9 k9Var = (C77958k9) obj;
            C77958k9 k9Var2 = (C77958k9) obj2;
            if (k9Var == null || k9Var2 == null) {
                return 0;
            }
            if (!"wx".equals(k9Var.f227734d) || !"cft".equals(k9Var2.f227734d)) {
                return (!"cft".equals(k9Var.f227734d) || !"wx".equals(k9Var2.f227734d)) ? 0 : 1;
            }
            return -1;
        }
    }

    /* renamed from: H7 */
    public final void mo99642H7() {
        Log.m105924i("MicroMsg.WalletSwitchVerifyPhoneUI", "directToNext()");
        Authen authen = (Authen) getInput().getParcelable("key_authen");
        Bankcard bankcard = (Bankcard) getInput().getParcelable("key_bankcard");
        if (authen == null || bankcard == null) {
            Log.m105928w("MicroMsg.WalletSwitchVerifyPhoneUI", "authen or bankcard is null");
            return;
        }
        ElementQuery a = ((C79173v) C86312j.m106911c(C79173v.class)).f232472d.mo91345a(bankcard.field_bankcardType);
        getInput().putParcelable("elemt_query", a);
        authen.f209370g = bankcard.field_bankcardType;
        authen.f209371h = bankcard.field_bindSerial;
        bankcard.field_bankPhone = a.f209519v;
        getInput().putBoolean("key_balance_change_phone_need_confirm_phone", true);
        getInput().putBoolean("key_is_changing_balance_phone_num", true);
        getInput().putInt("key_err_code", 418);
        C79143a.m95765d(this, getInput());
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cgm;
    }

    public void initView() {
        SwitchPhoneItemGroupView switchPhoneItemGroupView = (SwitchPhoneItemGroupView) findViewById(C0966R.C0970id.f358922hv3);
        this.f210295d = switchPhoneItemGroupView;
        switchPhoneItemGroupView.setOnItemSelectListener(new C72314a());
    }

    public boolean needConfirmFinish() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
        super.onCreate(bundle);
        setMMTitle(getString(C0966R.string.l9o));
        initView();
        boolean z = getInput().getBoolean("key_block_bind_new_card", false);
        this.f210297f = z;
        if (!z) {
            SwitchPhoneItemView switchPhoneItemView = new SwitchPhoneItemView((Context) getContext(), 0);
            switchPhoneItemView.setTag(-1);
            switchPhoneItemView.mo99801a(getString(C0966R.string.l9k), (CharSequence) null);
            this.f210295d.mo99798a(switchPhoneItemView, -1);
        }
        if (getProcess() != null && getProcess().mo91258e().equals("PayProcess") && getInput().getInt("key_can_verify_tail", 0) == 1) {
            Log.m105924i("MicroMsg.WalletSwitchVerifyPhoneUI", "show verify id card item");
            String string = getString(C0966R.string.ktr);
            SwitchPhoneItemView switchPhoneItemView2 = new SwitchPhoneItemView((Context) getContext(), (int) C0966R.C0971layout.cgk);
            switchPhoneItemView2.setTag(-2);
            switchPhoneItemView2.mo99801a(string, (CharSequence) null);
            this.f210295d.mo99798a(switchPhoneItemView2, -1);
        }
        addSceneEndListener(1667);
        addSceneEndListener(461);
        addSceneEndListener(1505);
        doSceneProgress(new C52768h(getPayReqKey()));
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1667);
        removeSceneEndListener(461);
        removeSceneEndListener(1505);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SpannableString spannableString;
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C52768h) {
                C52768h hVar = (C52768h) yVar;
                LinkedList<C77958k9> linkedList = hVar.f147436f.f137659f;
                this.f210296e = linkedList;
                if (linkedList != null) {
                    Collections.sort(linkedList, new C72315b(this));
                }
                C51622v00 v002 = hVar.f147436f.f137660g;
                if (v002 != null) {
                    getInput().putString("key_true_name", v002.f143211d);
                    getInput().putString("key_cre_name", v002.f143213f);
                    getInput().putString("key_cre_type", v002.f143212e);
                }
                List<C77958k9> list = this.f210296e;
                if (list == null || list.isEmpty()) {
                    Log.m105924i("MicroMsg.WalletSwitchVerifyPhoneUI", "empty mobile info");
                } else {
                    for (int size = this.f210296e.size() - 1; size >= 0; size--) {
                        C77958k9 k9Var = this.f210296e.get(size);
                        if (Util.isNullOrNil(k9Var.f227734d) || !k9Var.f227734d.equals("cft")) {
                            SwitchPhoneItemView switchPhoneItemView = new SwitchPhoneItemView((Context) getContext(), 0);
                            switchPhoneItemView.setTag(Integer.valueOf(size));
                            switchPhoneItemView.mo99801a(k9Var.f227735e, getString(C0966R.string.l9r));
                            this.f210295d.mo99798a(switchPhoneItemView, 0);
                        } else {
                            SwitchPhoneItemView switchPhoneItemView2 = new SwitchPhoneItemView((Context) getContext(), 0);
                            String string = getString(C0966R.string.l9l, new Object[]{k9Var.f227738h, (Util.isNullOrNil(k9Var.f227739i) || !k9Var.f227739i.equals("1")) ? getString(C0966R.string.l9m) : getString(C0966R.string.l9n), k9Var.f227740j});
                            if (this.f210297f) {
                                spannableString = new SpannableString(string);
                            } else {
                                String string2 = getString(C0966R.string.l9q);
                                C72478z zVar = new C72478z(this);
                                String str2 = string + "，";
                                zVar.f210836e = getResources().getColor(C0966R.color.f3144gt);
                                SpannableString spannableString2 = new SpannableString(str2 + string2);
                                spannableString2.setSpan(zVar, str2.length(), str2.length() + string2.length(), 33);
                                zVar.f210835d = new C72415p1(this, k9Var);
                                spannableString = spannableString2;
                            }
                            switchPhoneItemView2.setTag(Integer.valueOf(size));
                            switchPhoneItemView2.mo99801a(k9Var.f227735e, spannableString);
                            this.f210295d.mo99798a(switchPhoneItemView2, 0);
                        }
                    }
                }
                return true;
            } else if (yVar instanceof C78358z) {
                mo99642H7();
            }
        }
        return false;
    }
}
