package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import pj3.C47511g;
import vo3.C90852c;

@C90852c(0)
/* renamed from: com.tencent.mm.plugin.account.ui.LoginSelectUI */
public class LoginSelectUI extends MMPreference {

    /* renamed from: d */
    public C47511g f10695d;

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginSelectUI$a */
    public class C1434a implements MenuItem.OnMenuItemClickListener {
        public C1434a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            LoginSelectUI.this.finish();
            return true;
        }
    }

    public int getHeaderResourceId() {
        return C0966R.C0971layout.b8g;
    }

    public int getResourceId() {
        return C0966R.xml.f8912b8;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getContext().getResources().getColor(C0966R.color.f2929c));
        setNavigationbarColor(getContext().getResources().getColor(C0966R.color.f2929c));
        setBackGroundColorResource(C0966R.color.al6);
        if (getListView() != null) {
            getListView().setBackgroundColor(getContext().getResources().getColor(C0966R.color.f2929c));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getListView().getLayoutParams();
            layoutParams.width = C74942w4.m89786c(getContext(), C0966R.dimen.f3751d2);
            getListView().setLayoutParams(layoutParams);
        }
        this.f10695d = getPreferenceScreen();
        if (C85875k4.m106157N()) {
            this.f10695d.mo72519a("phone_and_pad").mo69924H(getResources().getString(C0966R.string.f0v));
            this.f10695d.mo72519a("only_pad").mo69924H(getResources().getString(C0966R.string.f0w));
        }
        setBackBtn(new C1434a());
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        if (str.equals("phone_and_pad")) {
            C88144b.m109789g(this, "login_exdevice", ".ui.LoginAsExDeviceUI");
            overridePendingTransition(C0966R.C0968anim.f2468ds, C0966R.C0968anim.f2333y);
            C115669n.INSTANCE.mo175904A(1570, 1);
        } else if (str.equals("only_pad")) {
            Intent intent = new Intent(this, MobileInputUI.class);
            intent.putExtra("mobile_input_purpose", 1);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginSelectUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/LoginSelectUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C115669n.INSTANCE.mo175904A(1570, 0);
        }
        return false;
    }
}
