package com.tencent.p014mm.plugin.subapp.p109ui.openapi;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import ob0.C11385n;
import ob0.C117747y;
import pj3.C47511g;
import qe3.C89625d;
import zw2.C53823a;
import zw2.C53824b;
import zw2.C53825c;

/* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.AddAppUI */
public class AddAppUI extends MMPreference implements C11385n {

    /* renamed from: d */
    public C47511g f116788d;

    /* renamed from: e */
    public AppPreference f116789e;

    /* renamed from: f */
    public AppPreference f116790f;

    /* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.AddAppUI$a */
    public class C43173a implements MenuItem.OnMenuItemClickListener {
        public C43173a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AddAppUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public static void m46737H7(AddAppUI addAppUI, String str) {
        addAppUI.getClass();
        Intent intent = new Intent(addAppUI, AppProfileUI.class);
        intent.putExtra("AppProfileUI_AppId", str);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(addAppUI, aVar.mo10232b(), "com/tencent/mm/plugin/subapp/ui/openapi/AddAppUI", "gotoProfile", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        addAppUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(addAppUI, "com/tencent/mm/plugin/subapp/ui/openapi/AddAppUI", "gotoProfile", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public int getResourceId() {
        return C0966R.xml.f8854d;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.f7403fb);
        setBackBtn(new C43173a());
        C47511g preferenceScreen = getPreferenceScreen();
        this.f116788d = preferenceScreen;
        preferenceScreen.removeAll();
        this.f116788d.mo72520b(getResourceId());
        AppPreference appPreference = (AppPreference) this.f116788d.mo72519a("addapp_added");
        this.f116789e = appPreference;
        appPreference.f116803N = 1;
        appPreference.f116801L = new C53823a(this);
        appPreference.f116802M = new C53824b(this);
        AppPreference appPreference2 = (AppPreference) this.f116788d.mo72519a("addapp_available");
        this.f116790f = appPreference2;
        appPreference2.f116803N = 0;
        appPreference2.f116801L = new C53825c(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onPause() {
        super.onPause();
        AppPreference appPreference = this.f116789e;
        if (!(appPreference == null || appPreference.f116800K == null)) {
            C72709y1.yx0().remove(appPreference.f116800K);
        }
        AppPreference appPreference2 = this.f116790f;
        if (appPreference2 != null && appPreference2.f116800K != null) {
            C72709y1.yx0().remove(appPreference2.f116800K);
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (!preference.f121285r.equals("addapp_recommend")) {
            return false;
        }
        String string = getString(C0966R.string.f7408fg, new Object[]{Integer.valueOf(C89625d.f257841g), LocaleUtil.loadApplicationLanguage(getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), getContext()), LocaleUtil.getCurrentCountryCode()});
        Intent intent = new Intent();
        intent.putExtra("rawUrl", string);
        C88144b.m109791i(this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        return true;
    }

    public void onResume() {
        super.onResume();
        initView();
        AppPreference appPreference = this.f116789e;
        if (!(appPreference == null || appPreference.f116800K == null)) {
            C72709y1.yx0().add(appPreference.f116800K);
        }
        AppPreference appPreference2 = this.f116790f;
        if (appPreference2 != null && appPreference2.f116800K != null) {
            C72709y1.yx0().add(appPreference2.f116800K);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105918d("MicroMsg.AddAppUI", "onSceneEnd, errType = " + i + ", errCode = " + i2);
        if (i != 0 || i2 != 0) {
            Log.m105920e("MicroMsg.AddAppUI", "onSceneEnd, errType = " + i + ", errCode = " + i2);
        }
    }
}
