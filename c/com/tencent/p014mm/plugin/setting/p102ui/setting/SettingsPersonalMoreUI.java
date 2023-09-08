package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindLinkedInUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import d62.C75339i;
import di3.C86312j;
import eb0.C75590o4;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import lc3.C10485b;
import p629ny.C76979h;
import pj3.C47511g;
import tc0.C77885p;
import tm2.C14049d;
import wc3.C15141z;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalMoreUI */
public class SettingsPersonalMoreUI extends MMPreference implements MStorageEx.IOnStorageChange {

    /* renamed from: d */
    public C47511g f20918d;

    /* renamed from: e */
    public int f20919e = -1;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalMoreUI$a */
    public class C5308a implements MenuItem.OnMenuItemClickListener {
        public C5308a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsPersonalMoreUI.this.hideVKB();
            SettingsPersonalMoreUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo6282H7() {
        Preference a = this.f20918d.mo72519a("settings_signature");
        String nullAsNil = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(12291, (Object) null));
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        if (nullAsNil.length() <= 0) {
            nullAsNil = getString(C0966R.string.iyt);
        }
        a.mo7741E(hVar.mo107057T1(this, nullAsNil));
    }

    public int getResourceId() {
        return C0966R.xml.f8965cm;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.iwg);
        this.f20918d = getPreferenceScreen();
        setBackBtn(new C5308a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        int nullAsInt = Util.nullAsInt(obj, 0);
        Log.m105919d("SettingsPersonalMoreUI", "onNotifyChange event:%d obj:%d stg:%s", Integer.valueOf(i), Integer.valueOf(nullAsInt), mStorageEx);
        if (mStorageEx != C86709a0.m107535s().mo121142i() || nullAsInt <= 0) {
            Log.m105921e("SettingsPersonalMoreUI", "onNotifyChange error obj:%d stg:%s", Integer.valueOf(nullAsInt), mStorageEx);
        } else if (12291 == nullAsInt) {
            mo6282H7();
        }
    }

    public void onPause() {
        super.onPause();
        C75590o4 a = C75590o4.m90740a();
        int i = this.f20919e;
        if (i != -1) {
            a.f222065b = i;
        }
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(1, C75590o4.m90742e(a)));
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        if (str.equals("settings_district")) {
            C15141z b = C14049d.m13403b();
            Intent intent = new Intent();
            AppCompatActivity context = getContext();
            ((C67654r1) b).getClass();
            if (context != null) {
                C88144b.m109801s(context, ".ui.tools.MultiStageCitySelectUI", intent, (Bundle) null);
            }
            return true;
        } else if (str.equals("settings_signature")) {
            Intent intent2 = new Intent(this, EditSignatureUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalMoreUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalMoreUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (str.equals("settings_linkedin")) {
            Intent intent3 = new Intent(this, BindLinkedInUI.class);
            intent3.putExtra("oversea_entry", true);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent3);
            C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalMoreUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalMoreUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (!str.equals("settings_sex")) {
            return false;
        } else {
            Intent intent4 = new Intent(this, SelectSexUI.class);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent4);
            C117292a.m165358d(this, aVar3.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalMoreUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalMoreUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        boolean z = false;
        this.f20919e = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(12290, (Object) null), 0);
        Preference a = this.f20918d.mo72519a("settings_sex");
        int i = this.f20919e;
        if (i == 1) {
            a.mo7741E(getString(C0966R.string.f361346j32));
        } else if (i == 2) {
            a.mo7741E(getString(C0966R.string.f361345j31));
        }
        C75590o4 a2 = C75590o4.m90740a();
        String nullAsNil = Util.nullAsNil(a2.mo105937d());
        String nullAsNil2 = Util.nullAsNil(a2.mo105936c());
        this.f20918d.mo72519a("settings_district").mo7741E(((C75339i) C86312j.m106911c(C75339i.class)).K90(nullAsNil) + " " + nullAsNil2);
        mo6282H7();
        boolean z2 = (C75592q0.m90785o() & TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0;
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("LinkedinPluginClose");
        if (Util.isNullOrNil(c) || Util.getInt(c, 0) == 0) {
            z = true;
        }
        boolean z3 = !Util.isNullOrNil((String) C86709a0.m107535s().mo121142i().mo119684e(286721, (Object) null));
        if (!z2 || !z || !z3) {
            this.f20918d.mo72529n("settings_linkedin", true);
            return;
        }
        Preference a3 = this.f20918d.mo72519a("settings_linkedin");
        if ((C75592q0.m90787q() & 4194304) == 0) {
            a3.mo7741E(getString(C0966R.string.it7));
        } else {
            a3.mo7741E(getString(C0966R.string.it8));
        }
    }
}
