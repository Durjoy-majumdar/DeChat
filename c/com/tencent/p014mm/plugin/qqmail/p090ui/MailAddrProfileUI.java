package com.tencent.p014mm.plugin.qqmail.p090ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.KeyValuePreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import j20.C117292a;
import k20.C9556a;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrProfileUI */
public class MailAddrProfileUI extends MMPreference {

    /* renamed from: d */
    public C47511g f20342d;

    /* renamed from: e */
    public String f20343e;

    /* renamed from: f */
    public String f20344f;

    /* renamed from: g */
    public boolean f20345g;

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrProfileUI$a */
    public class C5029a implements MenuItem.OnMenuItemClickListener {
        public C5029a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MailAddrProfileUI.this.hideVKB();
            MailAddrProfileUI.this.finish();
            return true;
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8913b9;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.frr);
        C47511g preferenceScreen = getPreferenceScreen();
        this.f20342d = preferenceScreen;
        ((KeyValuePreference) preferenceScreen.mo72519a("mail_receiver_info_name")).mo7741E(this.f20343e);
        ((KeyValuePreference) this.f20342d.mo72519a("mail_receiver_info_addr")).mo7741E(getIntent().getStringExtra("addr"));
        Preference a = this.f20342d.mo72519a("mail_compose_btn");
        if (!this.f20345g) {
            this.f20342d.mo72526j(a);
        }
        setBackBtn(new C5029a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20343e = getIntent().getStringExtra("name");
        this.f20344f = getIntent().getStringExtra("addr");
        this.f20345g = getIntent().getBooleanExtra("can_compose", false);
        initView();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (preference.f121285r.equals("mail_compose_btn")) {
            Intent intent = new Intent(this, ComposeUI.class);
            intent.putExtra("composeType", 4);
            intent.putExtra("toList", new String[]{this.f20343e + " " + this.f20344f});
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/MailAddrProfileUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/qqmail/ui/MailAddrProfileUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
        }
        return false;
    }
}
