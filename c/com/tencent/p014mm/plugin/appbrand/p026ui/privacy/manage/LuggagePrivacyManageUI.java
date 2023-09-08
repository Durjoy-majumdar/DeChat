package com.tencent.p014mm.plugin.appbrand.p026ui.privacy.manage;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.SummaryBelowPreference;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.AppBrandPrivacyPageContainerUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86299o;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import kr0.C76630x0;
import pj3.C47511g;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/privacy/manage/LuggagePrivacyManageUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.privacy.manage.LuggagePrivacyManageUI */
public final class LuggagePrivacyManageUI extends MMPreference {

    /* renamed from: d */
    public static final /* synthetic */ int f246786d = 0;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.privacy.manage.LuggagePrivacyManageUI$a */
    public static final class C84577a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ LuggagePrivacyManageUI f246787d;

        public C84577a(LuggagePrivacyManageUI luggagePrivacyManageUI) {
            this.f246787d = luggagePrivacyManageUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f246787d.finish();
            return false;
        }
    }

    public int getResourceId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.jkh);
        setBackBtn(new C84577a(this));
        C47511g preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            Preference preference = new Preference(this);
            preference.mo26273A("AppBrandPrivacyManage");
            preference.f121290w = false;
            preference.mo69923G(C0966R.string.csv);
            preferenceScreen.mo72527k(preference);
            SummaryBelowPreference summaryBelowPreference = new SummaryBelowPreference(this);
            summaryBelowPreference.mo26273A("ThirdAppLuggageAuthManage");
            summaryBelowPreference.f121290w = false;
            summaryBelowPreference.mo69923G(C0966R.string.nc7);
            summaryBelowPreference.mo7740D(C0966R.string.nc6);
            preferenceScreen.mo72527k(summaryBelowPreference);
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (preference == null) {
            return false;
        }
        String str = preference.f121285r;
        Log.m105924i("MicroMsg.AppBrand.LuggagePrivacyManageUI", "onPreferenceTreeClick, key: " + str);
        if (C87412m.m108589b(str, "AppBrandPrivacyManage")) {
            AppBrandPrivacyManagePage.f246784e.mo117264a(this, AppBrandPrivacyPageContainerUI.class);
        } else if (!C87412m.m108589b(str, "ThirdAppLuggageAuthManage")) {
            return false;
        } else {
            C76630x0 x0Var = (C76630x0) C86312j.m106911c(C76630x0.class);
            if (x0Var != null) {
                C86299o oVar = new C86299o();
                oVar.f250930b = "wxb6d22f922f37b35a";
                oVar.f250932d = 0;
                oVar.f250934f = "/packages/settings/pages/third-app-auth/index.html";
                oVar.f250939k = 1251;
                C13598b0 b0Var = C13598b0.f38549a;
                x0Var.mo106898tv(this, oVar);
            }
        }
        return true;
    }
}
