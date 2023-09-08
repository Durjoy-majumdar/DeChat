package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import b63.C28266f0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import eb0.C116734h6;
import eb0.C75592q0;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import ob0.C117747y;
import p003ay.C0235b;
import p281yz.C79173v;
import p763ym.C39073u;
import v53.C37677r;
import v53.C78354v;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletSwitchWalletCurrencyUI */
public class WalletSwitchWalletCurrencyUI extends WalletBaseUI implements View.OnClickListener {

    /* renamed from: d */
    public ListView f210299d;

    /* renamed from: e */
    public ArrayList<C28266f0> f210300e = null;

    /* renamed from: f */
    public C72417q1 f210301f = null;

    /* renamed from: g */
    public C28266f0 f210302g;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletSwitchWalletCurrencyUI$a */
    public class C72316a implements AdapterView.OnItemClickListener {
        public C72316a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletSwitchWalletCurrencyUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C28266f0 a = WalletSwitchWalletCurrencyUI.this.f210301f.getItem(i);
            WalletSwitchWalletCurrencyUI walletSwitchWalletCurrencyUI = WalletSwitchWalletCurrencyUI.this;
            C28266f0 f0Var = walletSwitchWalletCurrencyUI.f210301f.f210663f;
            walletSwitchWalletCurrencyUI.getClass();
            if (a != null && (f0Var == null || !f0Var.field_wallet_tpa_country.equals(a.field_wallet_tpa_country))) {
                WalletSwitchWalletCurrencyUI walletSwitchWalletCurrencyUI2 = WalletSwitchWalletCurrencyUI.this;
                walletSwitchWalletCurrencyUI2.f210302g = a;
                String str = a.field_wallet_tpa_country;
                walletSwitchWalletCurrencyUI2.getClass();
                Log.m105924i("MicroMsg.WalletSwitchWalletCurrencyUI", "doSetUserWallet walletid = " + str);
                walletSwitchWalletCurrencyUI2.doSceneForceProgress(new C78354v(str));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletSwitchWalletCurrencyUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: H7 */
    public void mo99644H7(boolean z) {
        Log.m105924i("MicroMsg.WalletSwitchWalletCurrencyUI", "doGetAllWalletType isShowProcess = " + z);
        doSceneProgress(new C37677r(), z);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cgo;
    }

    public void initView() {
        this.f210299d = (ListView) findViewById(C0966R.C0970id.jf6);
        C72417q1 q1Var = new C72417q1(this, this.f210300e);
        this.f210301f = q1Var;
        this.f210299d.setAdapter(q1Var);
        ArrayList<C28266f0> arrayList = this.f210300e;
        if (arrayList != null && arrayList.size() > 0) {
            C72417q1 q1Var2 = this.f210301f;
            q1Var2.f210661d = this.f210300e;
            q1Var2.notifyDataSetChanged();
        }
        this.f210299d.setOnItemClickListener(new C72316a());
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletSwitchWalletCurrencyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletSwitchWalletCurrencyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.l9u);
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN, Boolean.TRUE);
        getIntent().getIntExtra("switch_wallet_scene", 0);
        ArrayList<C28266f0> jo = ((C79173v) C86312j.m106911c(C79173v.class)).Gx0().mo58169jo();
        this.f210300e = jo;
        if (jo == null || jo.size() == 0) {
            Log.m105924i("MicroMsg.WalletSwitchWalletCurrencyUI", "not data cache,do NetSceneQueryUserWallet");
            mo99644H7(true);
        } else {
            Log.m105924i("MicroMsg.WalletSwitchWalletCurrencyUI", "use cache data first, and do NetSceneQueryUserWallet for update cache");
            mo99644H7(false);
        }
        initView();
        setResult(0);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = C79173v.class;
        if (yVar instanceof C37677r) {
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.WalletSwitchWalletCurrencyUI", "NetSceneQueryUserWallet succ and update view");
                ArrayList<C28266f0> jo = ((C79173v) C86312j.m106911c(cls)).Gx0().mo58169jo();
                this.f210300e = jo;
                C72417q1 q1Var = this.f210301f;
                q1Var.f210661d = jo;
                q1Var.notifyDataSetChanged();
                return true;
            }
            Log.m105920e("MicroMsg.WalletSwitchWalletCurrencyUI", "NetSceneQueryUserWallet error");
            if (this.f210300e == null) {
                Log.m105920e("MicroMsg.WalletSwitchWalletCurrencyUI", "wallet list is null in cache");
                return false;
            }
            Log.m105920e("MicroMsg.WalletSwitchWalletCurrencyUI", "use cache wallet list data");
            return true;
        } else if (!(yVar instanceof C78354v) || i != 0 || i2 != 0) {
            return false;
        } else {
            this.f210302g.field_wallet_selected = 1;
            Log.m105924i("MicroMsg.WalletSwitchWalletCurrencyUI", "set user wallet succ. current wallet type = " + this.f210302g.field_wallet_type + " " + this.f210302g.field_wallet_tpa_country_mask);
            ((C39073u) C86312j.m106911c(C39073u.class)).reset();
            ((C79173v) C86312j.m106911c(cls)).Gx0().update(this.f210302g, new String[0]);
            C28266f0 f0Var = this.f210301f.f210663f;
            if (f0Var != null) {
                f0Var.field_wallet_selected = 0;
                ((C79173v) C86312j.m106911c(cls)).Gx0().update(f0Var, new String[0]);
            }
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(339975, Integer.valueOf(this.f210302g.field_wallet_type));
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, Integer.valueOf(this.f210302g.field_wallet_tpa_country_mask));
            C116734h6.m164657m(this.f210302g.field_wallet_tpa_country_mask);
            ((C0235b) C86312j.m106911c(C0235b.class)).mo268rs();
            if (C75592q0.m90753A()) {
                ((C79173v) C86312j.m106911c(cls)).vx0(this, (Intent) null);
            }
            Intent intent = new Intent();
            intent.putExtra("is_switch_wallet", 1);
            setResult(-1, intent);
            finish();
            return true;
        }
    }
}
