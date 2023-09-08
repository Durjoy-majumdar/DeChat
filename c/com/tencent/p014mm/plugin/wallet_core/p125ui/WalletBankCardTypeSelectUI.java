package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.SelectPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankCardTypeSelectUI */
public class WalletBankCardTypeSelectUI extends MMPreference {

    /* renamed from: d */
    public ArrayList<String> f21902d;

    /* renamed from: e */
    public String f21903e;

    /* renamed from: f */
    public C47511g f21904f;

    /* renamed from: g */
    public SelectPreference f21905g;

    /* renamed from: h */
    public SelectPreference f21906h;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankCardTypeSelectUI$a */
    public class C5773a implements MenuItem.OnMenuItemClickListener {
        public C5773a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletBankCardTypeSelectUI.this.hideVKB();
            WalletBankCardTypeSelectUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankCardTypeSelectUI$b */
    public class C5774b implements MenuItem.OnMenuItemClickListener {
        public C5774b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Intent intent = new Intent();
            intent.putExtra("bank_card_acc_name", WalletBankCardTypeSelectUI.this.f21903e);
            Log.m105925i("WalletBankCardTypeSelectUI", "item bank: %s", WalletBankCardTypeSelectUI.this.f21903e);
            WalletBankCardTypeSelectUI.this.setResult(-1, intent);
            WalletBankCardTypeSelectUI.this.finish();
            return true;
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8984d7;
    }

    public void initView() {
        this.f21904f = getPreferenceScreen();
        for (int i = 0; i < this.f21902d.size(); i++) {
            SelectPreference selectPreference = new SelectPreference(getContext());
            selectPreference.mo26273A(this.f21902d.get(i));
            selectPreference.mo69924H(this.f21902d.get(i));
            this.f21904f.mo72527k(selectPreference);
        }
        if (this.f21902d.get(0) != null) {
            SelectPreference selectPreference2 = (SelectPreference) this.f21904f.mo72519a(this.f21902d.get(0));
            this.f21906h = selectPreference2;
            selectPreference2.f24291M = true;
            this.f21903e = this.f21902d.get(0);
            this.f21904f.notifyDataSetChanged();
        }
        setBackBtn(new C5773a());
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C5774b(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.ksh);
        this.f21902d = getIntent().getStringArrayListExtra("bank_type_show_list");
        initView();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        for (int i = 0; i < this.f21902d.size(); i++) {
            if (str.equals(this.f21902d.get(i))) {
                SelectPreference selectPreference = (SelectPreference) gVar.mo72519a(this.f21902d.get(i));
                this.f21905g = selectPreference;
                selectPreference.f24291M = true;
                this.f21903e = this.f21902d.get(i);
                if (!this.f21906h.f121285r.equals(this.f21905g.f121285r)) {
                    this.f21906h.f24291M = false;
                    this.f21906h = this.f21905g;
                }
                gVar.notifyDataSetChanged();
            }
        }
        return false;
    }
}
