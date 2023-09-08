package com.tencent.p014mm.plugin.setting.p102ui.qrcode;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44667s4;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.ShareMicroMsgChoiceUI */
public class ShareMicroMsgChoiceUI extends MMPreference {

    /* renamed from: d */
    public C47511g f20619d;

    /* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.ShareMicroMsgChoiceUI$a */
    public class C5182a implements MenuItem.OnMenuItemClickListener {
        public C5182a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ShareMicroMsgChoiceUI.this.hideVKB();
            ShareMicroMsgChoiceUI.this.finish();
            return true;
        }
    }

    public boolean autoRefresh() {
        return false;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359978bz1;
    }

    public int getResourceId() {
        return C0966R.xml.f8973cu;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.iln);
        this.f20619d = getPreferenceScreen();
        setBackBtn(new C5182a());
        ((IconPreference) this.f20619d.mo72519a("share_micromsg_to_sina")).f215053N = C76577a.m92158i(this, C0966R.C0969drawable.blg);
        ((C44667s4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).V50()).mo69821jo("@t.qq.com");
        boolean z = Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(9, (Object) null)) != 0;
        IconPreference iconPreference = (IconPreference) this.f20619d.mo72519a("share_micromsg_qzone");
        if (!z) {
            this.f20619d.mo72526j(iconPreference);
        } else {
            iconPreference.f215053N = C76577a.m92158i(this, C0966R.C0969drawable.f357341bl1);
        }
        IconPreference iconPreference2 = (IconPreference) this.f20619d.mo72519a("share_micromsg_to_fuckbook");
        if (C75592q0.m90755C()) {
            iconPreference2.f215053N = C76577a.m92158i(this, C0966R.C0969drawable.blf);
        } else {
            this.f20619d.mo72526j(iconPreference2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Class<ShowQRCodeStep1UI> cls = ShowQRCodeStep1UI.class;
        String str = preference.f121285r;
        if (str.equals("share_micromsg_qzone")) {
            if (Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(9, (Object) null)) != 0) {
                Intent intent = new Intent(this, cls);
                intent.putExtra("show_to", 2);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/qrcode/ShareMicroMsgChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/qrcode/ShareMicroMsgChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                C76879j.m92738i(this, C0966R.string.ikq, C0966R.string.a3h);
            }
        } else if (str.equals("share_micromsg_to_sina")) {
            Intent intent2 = new Intent(this, cls);
            intent2.putExtra("show_to", 3);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent2);
            C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/qrcode/ShareMicroMsgChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/qrcode/ShareMicroMsgChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("share_micromsg_to_fuckbook")) {
            Intent intent3 = new Intent(this, cls);
            intent3.putExtra("show_to", 4);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent3);
            C117292a.m165358d(this, aVar3.mo10232b(), "com/tencent/mm/plugin/setting/ui/qrcode/ShareMicroMsgChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/qrcode/ShareMicroMsgChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return false;
    }
}
