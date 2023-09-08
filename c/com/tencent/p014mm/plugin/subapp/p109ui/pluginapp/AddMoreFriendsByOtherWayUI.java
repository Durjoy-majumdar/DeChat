package com.tencent.p014mm.plugin.subapp.p109ui.pluginapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindGoogleContactUI;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactIntroUI;
import com.tencent.p014mm.plugin.account.bind.p021ui.GoogleFriendUI;
import com.tencent.p014mm.plugin.account.bind.p021ui.MobileFriendUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import f40.C86709a0;
import hg0.C76186t;
import j20.C117292a;
import k20.C9556a;
import p286zl.C79396l;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsByOtherWayUI */
public class AddMoreFriendsByOtherWayUI extends MMPreference {

    /* renamed from: d */
    public C47511g f21330d;

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsByOtherWayUI$a */
    public class C5505a implements MenuItem.OnMenuItemClickListener {
        public C5505a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AddMoreFriendsByOtherWayUI.this.finish();
            return true;
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getResourceId() {
        return C0966R.xml.f8853c;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.f7390ew);
        this.f21330d = getPreferenceScreen();
        setBackBtn(new C5505a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Log.m105919d("MicroMsg.AddMoreFriendsByOthersUI", "click %s", preference.f121285r);
        if ("find_friends_by_mobile".equals(preference.f121285r)) {
            if (C76186t.m91534b() != C79396l.SUCC) {
                Intent intent = new Intent(this, BindMContactIntroUI.class);
                intent.putExtra("key_upload_scene", 6);
                MMWizardActivity.m7017L7(this, intent);
                return true;
            }
            Intent intent2 = new Intent(this, MobileFriendUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsByOtherWayUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsByOtherWayUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (!"find_friends_by_google_account".equals(preference.f121285r)) {
            return false;
        } else {
            if (!(!TextUtils.isEmpty((String) C86709a0.m107535s().mo121142i().mo119684e(208903, (Object) null)))) {
                Intent intent3 = new Intent(this, BindGoogleContactUI.class);
                intent3.putExtra("enter_scene", 1);
                MMWizardActivity.m7017L7(this, intent3);
                return true;
            }
            Intent intent4 = new Intent(this, GoogleFriendUI.class);
            intent4.putExtra("enter_scene", 1);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent4);
            C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsByOtherWayUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsByOtherWayUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        if (((IconPreference) this.f21330d.mo72519a("find_friends_by_google_account")) != null) {
            if (!((C75592q0.m90785o() & 8388608) == 0) || !Util.isOverseasUser(this)) {
                this.f21330d.mo72531o("find_friends_by_google_account");
            }
        }
        this.f21330d.notifyDataSetChanged();
    }
}
