package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import b63.C67199q0;
import b63.C67203r0;
import b63.C67205s0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import di3.C86312j;
import f40.C86709a0;
import j53.C46428i;
import j53.C46429k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import p158gt.C76057w;
import p281yz.C79173v;
import pj3.C47511g;
import r43.C12948d;
import te3.C49375f34;
import te3.C49511g34;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyUI */
public class WalletBalancePrivacyUI extends MMPreference implements C11385n {

    /* renamed from: d */
    public C47511g f117243d;

    /* renamed from: e */
    public Dialog f117244e;

    /* renamed from: f */
    public WalletBalancePrivacyCheckBoxPreference f117245f;

    /* renamed from: g */
    public WalletBalancePrivacyMMHeaderPreference f117246g;

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyUI$a */
    public class C43360a implements MenuItem.OnMenuItemClickListener {
        public C43360a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletBalancePrivacyUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyUI$b */
    public class C43361b implements DialogInterface.OnClickListener {
        public C43361b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletBalancePrivacyUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyUI$c */
    public class C43362c implements DialogInterface.OnClickListener {
        public C43362c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletBalancePrivacyUI.this.finish();
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8983d6;
    }

    public void initView() {
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setBackGroundColorResource(C0966R.color.al6);
        setBackBtn(new C43360a());
        if (getListView() != null) {
            getListView().setBackgroundColor(getResources().getColor(C0966R.color.al6));
        }
        C47511g preferenceScreen = getPreferenceScreen();
        this.f117243d = preferenceScreen;
        if (preferenceScreen != null) {
            preferenceScreen.removeAll();
        }
        this.f117245f = (WalletBalancePrivacyCheckBoxPreference) this.f117243d.mo72519a("wallet_banlance_privacy_cb");
        this.f117244e = C75197d0.m90163d(this, false, false, (DialogInterface.OnCancelListener) null);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(new C46428i());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hideActionbarLine();
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        WalletBalancePrivacyMMHeaderPreference walletBalancePrivacyMMHeaderPreference = this.f117246g;
        if (walletBalancePrivacyMMHeaderPreference != null) {
            for (Map.Entry entry : ((HashMap) walletBalancePrivacyMMHeaderPreference.f21824K).entrySet()) {
                ((C76057w) C86312j.m106911c(C76057w.class)).mo106264FL((String) entry.getKey(), (C76057w.C76058a) entry.getValue());
            }
            ((HashMap) walletBalancePrivacyMMHeaderPreference.f21824K).clear();
        }
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(2635, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(2554, this);
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (Util.isEqual(preference.f121285r, "wallet_banlance_privacy_cb")) {
            WalletBalancePrivacyCheckBoxPreference walletBalancePrivacyCheckBoxPreference = (WalletBalancePrivacyCheckBoxPreference) preference;
            Log.m105925i("MicroMsg.WalletBalancePrivacyUI", "set balance privacy: %s", Boolean.valueOf(walletBalancePrivacyCheckBoxPreference.mo6804J()));
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(new C46429k(walletBalancePrivacyCheckBoxPreference.mo6804J()));
        }
        return false;
    }

    public void onResume() {
        super.onResume();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(2635, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(2554, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        Class cls = C79173v.class;
        Log.m105924i("MicroMsg.WalletBalancePrivacyUI", "onSceneEnd() errType:" + i + " errCode:" + i2 + " errMsg:" + str + " netsceneType:" + yVar.getType());
        boolean z2 = false;
        if (yVar instanceof C46428i) {
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.WalletBalancePrivacyUI", "success get balance privacy detail");
                C46428i iVar = (C46428i) yVar;
                if (this.f117243d == null || iVar.mo71829j1() == null || iVar.mo71829j1().f140385g == null) {
                    z = false;
                } else {
                    Log.m105925i("MicroMsg.WalletBalancePrivacyUI", "refresh() title_icon:%s,title:%s,switch_title:%s,switch_desc:%s,switch_state:%s", iVar.mo71829j1().f140385g.f138840e, iVar.mo71829j1().f140385g.f138839d, iVar.mo71829j1().f140385g.f138841f, iVar.mo71829j1().f140385g.f138842g, Integer.valueOf(iVar.mo71829j1().f140384f));
                    this.f117243d.mo72520b(C0966R.xml.f8983d6);
                    WalletBalancePrivacyMMHeaderPreference walletBalancePrivacyMMHeaderPreference = (WalletBalancePrivacyMMHeaderPreference) this.f117243d.mo72519a("wallet_balance_privacy_header");
                    this.f117246g = walletBalancePrivacyMMHeaderPreference;
                    String str2 = iVar.mo71829j1().f140385g.f138840e;
                    walletBalancePrivacyMMHeaderPreference.getClass();
                    this.f117246g.f21823J = iVar.mo71829j1().f140385g.f138839d;
                    WalletBalancePrivacyCheckBoxPreference walletBalancePrivacyCheckBoxPreference = (WalletBalancePrivacyCheckBoxPreference) this.f117243d.mo72519a("wallet_banlance_privacy_cb");
                    this.f117245f = walletBalancePrivacyCheckBoxPreference;
                    walletBalancePrivacyCheckBoxPreference.f121290w = false;
                    walletBalancePrivacyCheckBoxPreference.mo69924H(iVar.mo71829j1().f140385g.f138841f);
                    this.f117245f.mo7741E(iVar.mo71829j1().f140385g.f138842g);
                    this.f117245f.f21819Y = Util.isEqual(iVar.mo71829j1().f140384f, 1);
                    this.f117243d.notifyDataSetChanged();
                    z = true;
                }
                Dialog dialog = this.f117244e;
                if (dialog != null && dialog.isShowing()) {
                    this.f117244e.dismiss();
                }
                if (!z) {
                    C76879j.m92713G(this, getString(C0966R.string.f361610l80), "", false, new C43361b());
                }
            } else {
                Log.m105924i("MicroMsg.WalletBalancePrivacyUI", "fail get balance privacy detail");
                Dialog dialog2 = this.f117244e;
                if (dialog2 != null && dialog2.isShowing()) {
                    this.f117244e.dismiss();
                }
                C76879j.m92713G(this, getString(C0966R.string.f361610l80), "", false, new C43362c());
            }
        }
        if (!(yVar instanceof C46429k)) {
            return;
        }
        if (i == 0 && i2 == 0) {
            C46429k kVar = (C46429k) yVar;
            C49511g34 g342 = kVar.f125048e;
            if (g342 == null) {
                g342 = new C49511g34();
            }
            int i3 = g342.f133832f;
            if (this.f117245f == null) {
                this.f117245f = (WalletBalancePrivacyCheckBoxPreference) this.f117243d.mo72519a("wallet_banlance_privacy_cb");
            }
            Object[] objArr = new Object[2];
            WalletBalancePrivacyCheckBoxPreference walletBalancePrivacyCheckBoxPreference2 = this.f117245f;
            objArr[0] = walletBalancePrivacyCheckBoxPreference2 != null ? Boolean.valueOf(walletBalancePrivacyCheckBoxPreference2.mo6804J()) : "null";
            objArr[1] = Integer.valueOf(i3);
            Log.m105925i("MicroMsg.WalletBalancePrivacyUI", "success set balance privacy detail:%s switchState:%s", objArr);
            C67203r0 jo = ((C79173v) C86312j.m106911c(cls)).Dx0().mo105873jo();
            C49511g34 g343 = kVar.f125048e;
            if (g343 == null) {
                g343 = new C49511g34();
            }
            jo.field_wallet_entrance_balance_switch_state = g343.f133832f;
            ((C79173v) C86312j.m106911c(cls)).Dx0().insert(jo);
            C67205s0 Ex0 = ((C79173v) C86312j.m106911c(cls)).Ex0();
            Ex0.getClass();
            Ex0.f192956i = new C67199q0(jo.field_switchConfig, jo.field_wallet_entrance_balance_switch_state);
            WalletBalancePrivacyCheckBoxPreference walletBalancePrivacyCheckBoxPreference3 = this.f117245f;
            if (walletBalancePrivacyCheckBoxPreference3 != null) {
                if (i3 == 1) {
                    z2 = true;
                }
                walletBalancePrivacyCheckBoxPreference3.mo6808N(z2);
                return;
            }
            return;
        }
        C76912y0.makeText((Context) this, (CharSequence) getString(C0966R.string.l7v), 1).show();
        WalletBalancePrivacyCheckBoxPreference walletBalancePrivacyCheckBoxPreference4 = this.f117245f;
        if (walletBalancePrivacyCheckBoxPreference4 == null) {
            walletBalancePrivacyCheckBoxPreference4.mo6808N(!walletBalancePrivacyCheckBoxPreference4.mo6804J());
        }
        Object[] objArr2 = new Object[1];
        C49375f34 f342 = ((C46429k) yVar).f125047d;
        if (f342 == null) {
            f342 = new C49375f34();
        }
        objArr2[0] = Integer.valueOf(f342.f133272d);
        Log.m105925i("MicroMsg.WalletBalancePrivacyUI", "fail set balance privacy %s", objArr2);
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C12948d.class);
    }
}
