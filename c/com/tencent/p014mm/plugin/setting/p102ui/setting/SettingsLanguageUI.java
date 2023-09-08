package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceCategory;
import com.tencent.p014mm.plugin.account.p024ui.LanguagePreference;
import com.tencent.p014mm.plugin.setting.SwitchAccountReceiver;
import com.tencent.p014mm.plugin.setting.p102ui.widget.FontSelectorView;
import com.tencent.p014mm.sdk.platformtools.LocaleGen;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.SystemProperty;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatSomeFeatureSwitch;
import di3.C86312j;
import eb0.C75576f4;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import lc3.C10485b;
import p564iq.C87790d;
import pj3.C47511g;
import tm2.C14049d;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI */
public class SettingsLanguageUI extends MMPreference {

    /* renamed from: h */
    public static final String[] f205732h = LocaleGen.LOCALES;

    /* renamed from: d */
    public C47511g f205733d;

    /* renamed from: e */
    public List<LanguagePreference.C68448a> f205734e;

    /* renamed from: f */
    public String f205735f;

    /* renamed from: g */
    public boolean f205736g = false;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI$a */
    public class C71072a implements MenuItem.OnMenuItemClickListener {
        public C71072a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsLanguageUI.this.hideVKB();
            SettingsLanguageUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI$b */
    public class C71073b implements MenuItem.OnMenuItemClickListener {
        public C71073b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsLanguageUI settingsLanguageUI = SettingsLanguageUI.this;
            String str = settingsLanguageUI.f205735f;
            boolean z = settingsLanguageUI.f205736g;
            settingsLanguageUI.getClass();
            Log.m105925i(MMPreference.TAG, "saveLanguage language: %s notauth %s", str, Boolean.valueOf(z));
            Locale transLanguageToLocale = LocaleUtil.transLanguageToLocale(str);
            if ("language_default".equalsIgnoreCase(str)) {
                if (Build.VERSION.SDK_INT >= 24) {
                    transLanguageToLocale = LocaleUtil.sysDefaultLocale;
                    Locale.setDefault(transLanguageToLocale);
                } else {
                    transLanguageToLocale = Locale.getDefault();
                }
            }
            LocaleUtil.saveApplicationLanguage(settingsLanguageUI.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), settingsLanguageUI, str);
            WeChatBrands.updateLang(str);
            ((C87790d) C86312j.m106911c(C87790d.class)).mo122030Fy(str);
            LocaleUtil.updateApplicationResourceLocale(settingsLanguageUI, transLanguageToLocale);
            SystemProperty.setProperty("system_property_key_locale", str);
            MMApplicationContext.setResourcesProvider(new C85446j2(settingsLanguageUI));
            if (z) {
                ((C67654r1) C14049d.m13403b()).mo93183p(new Intent().putExtra("Intro_Need_Clear_Top ", true), settingsLanguageUI);
            } else {
                C86709a0.m107524d().mo123460f(new C75576f4(new C71148k2(settingsLanguageUI), (String) null));
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(C74928u.C74930g.f220310a, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
                intent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_RELOAD_RESOURCES");
                intent.putExtra("tools_language", str);
                MMApplicationContext.getContext().sendBroadcast(intent);
                Intent intent2 = new Intent(settingsLanguageUI, SwitchAccountReceiver.class);
                intent2.putExtra("switch_process_action_code_key", "action_reload_resources");
                intent2.putExtra("switch_language", str);
                MMApplicationContext.getContext().sendBroadcast(intent2);
                FontSelectorView.f205976w = 8;
                ((C10485b) C86709a0.m107533q(C10485b.class)).g50().f127471a.clear();
                Intent intent3 = new Intent();
                intent3.putExtra("Intro_Need_Clear_Top ", true);
                ((C67654r1) C14049d.m13403b()).mo93183p(intent3, settingsLanguageUI);
            }
            return true;
        }
    }

    public int getResourceId() {
        return -1;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.f361303it3);
        setBackBtn(new C71072a());
        addTextOptionMenu(0, getString(C0966R.string.f361302it2), new C71073b(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        this.f205736g = getIntent().getBooleanExtra("not_auth_setting", false);
        this.f205733d.removeAll();
        String[] stringArray = WeChatSomeFeatureSwitch.temporaryBlockMinorLanguage() ? getResources().getStringArray(C0966R.array.f2582q) : getResources().getStringArray(C0966R.array.f2581p);
        this.f205735f = LocaleUtil.loadApplicationLanguageSettings(getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), this);
        this.f205734e = new ArrayList();
        String[] strArr = f205732h;
        if (WeChatSomeFeatureSwitch.temporaryBlockMinorLanguage()) {
            strArr = LocaleGen.LOCALES_BLOCK_MINOR_LANG;
        }
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            ((ArrayList) this.f205734e).add(new LanguagePreference.C68448a(stringArray[i], "", str, this.f205735f.equalsIgnoreCase(str)));
        }
        Iterator it = ((ArrayList) this.f205734e).iterator();
        while (it.hasNext()) {
            LanguagePreference.C68448a aVar = (LanguagePreference.C68448a) it.next();
            LanguagePreference languagePreference = new LanguagePreference(this, (AttributeSet) null);
            if (aVar == null || Util.isNullOrNil(aVar.f196669b)) {
                Log.m105920e("MicroMsg.LanguagePreference", "setInfo info error");
            } else {
                languagePreference.f196667J = aVar;
                languagePreference.mo26273A(aVar.f196669b);
            }
            this.f205733d.mo72527k(languagePreference);
        }
        this.f205733d.mo72527k(new PreferenceCategory(this, (AttributeSet) null));
        this.f205733d.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f205733d = getPreferenceScreen();
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        LanguagePreference.C68448a aVar;
        if (!(preference instanceof LanguagePreference) || (aVar = ((LanguagePreference) preference).f196667J) == null) {
            return false;
        }
        Log.m105925i(MMPreference.TAG, "LanguageName:%s IsoCode:%s", aVar.f196668a, aVar.f196669b);
        this.f205735f = aVar.f196669b;
        Iterator it = ((ArrayList) this.f205734e).iterator();
        while (it.hasNext()) {
            ((LanguagePreference.C68448a) it.next()).f196670c = false;
        }
        aVar.f196670c = true;
        gVar.notifyDataSetChanged();
        return true;
    }
}
