package com.tencent.p014mm.plugin.account.p024ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.account.friend.p022ui.RecommendFriendUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44667s4;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import k20.C9556a;
import p910lj.C76701a;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.account.ui.InviteRecommendChoiceUI */
public class InviteRecommendChoiceUI extends MMPreference {

    /* renamed from: d */
    public C47511g f10680d;

    /* renamed from: com.tencent.mm.plugin.account.ui.InviteRecommendChoiceUI$a */
    public class C1430a implements MenuItem.OnMenuItemClickListener {
        public C1430a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            InviteRecommendChoiceUI.this.hideVKB();
            InviteRecommendChoiceUI.this.finish();
            return true;
        }
    }

    public boolean autoRefresh() {
        return false;
    }

    public int getResourceId() {
        return C0966R.xml.f8909b5;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.il4);
        C47511g preferenceScreen = getPreferenceScreen();
        this.f10680d = preferenceScreen;
        this.f10680d.mo72526j((IconPreference) preferenceScreen.mo72519a("settings_invite_facebook_friends"));
        IconPreference iconPreference = (IconPreference) this.f10680d.mo72519a("settings_invite_qq_friends");
        if (C75592q0.m90776f() == 0) {
            this.f10680d.mo72526j(iconPreference);
        }
        IconPreference iconPreference2 = (IconPreference) this.f10680d.mo72519a("settings_recommend_by_mail");
        if (C75592q0.m90776f() == 0) {
            this.f10680d.mo72526j(iconPreference2);
        }
        IconPreference iconPreference3 = (IconPreference) this.f10680d.mo72519a("settings_recommend_by_mb");
        if (((C44667s4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).V50()).mo69821jo("@t.qq.com") == null) {
            this.f10680d.mo72526j(iconPreference3);
        }
        setBackBtn(new C1430a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Class<RecommendFriendUI> cls = RecommendFriendUI.class;
        String str = preference.f121285r;
        if (str.equals("settings_invite_qq_friends")) {
            Intent intent = new Intent(this, cls);
            intent.putExtra("recommend_type", Integer.toString(0));
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("settings_recommend_by_mail")) {
            Intent intent2 = new Intent(this, cls);
            intent2.putExtra("recommend_type", Integer.toString(2));
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent2);
            C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("settings_recommend_by_mb")) {
            Intent intent3 = new Intent(this, cls);
            intent3.putExtra("recommend_type", Integer.toString(1));
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent3);
            C117292a.m165358d(this, aVar3.mo10232b(), "com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("settings_invite_mobile_friends")) {
            Intent intent4 = new Intent("android.intent.action.VIEW");
            intent4.putExtra("sms_body", getString(C0966R.string.fs7, new Object[]{C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null)}));
            intent4.setType("vnd.android-dir/mms-sms");
            if (Util.isIntentAvailable(this, intent4, true)) {
                try {
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(intent4);
                    C117292a.m165358d(this, aVar4.mo10232b(), "com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar4.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (ActivityNotFoundException e) {
                    Log.m105920e(MMPreference.TAG, "ActivityNotFoundException:" + e);
                    C76701a.makeText((Context) this, (int) C0966R.string.ik8, 1).show();
                } catch (Exception e2) {
                    Log.printErrStackTrace(MMPreference.TAG, e2, "", new Object[0]);
                }
            } else {
                C76701a.makeText((Context) this, (int) C0966R.string.ik8, 1).show();
            }
        } else if (str.equals("settings_invite_facebook_friends")) {
            Intent intent5 = new Intent(this, InviteMMFBFriendsUI.class);
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(intent5);
            C117292a.m165358d(this, aVar5.mo10232b(), "com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar5.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return false;
    }
}
