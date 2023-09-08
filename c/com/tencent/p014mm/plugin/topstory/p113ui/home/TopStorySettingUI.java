package com.tencent.p014mm.plugin.topstory.p113ui.home;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import f40.C86709a0;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import o03.C47319c;
import o03.C47323j;
import o03.C47324k;
import p156gj.C87200o;
import p156gj.C87203t;
import p206nj.C117627q;
import pj3.C47511g;
import qe3.C89625d;
import r03.C47918a;
import te3.qo4;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI */
public class TopStorySettingUI extends MMPreference {

    /* renamed from: o */
    public static final /* synthetic */ int f117042o = 0;

    /* renamed from: d */
    public C47511g f117043d;

    /* renamed from: e */
    public IconPreference f117044e;

    /* renamed from: f */
    public IconPreference f117045f;

    /* renamed from: g */
    public CheckBoxPreference f117046g;

    /* renamed from: h */
    public int f117047h = -1;

    /* renamed from: i */
    public int f117048i = -1;

    /* renamed from: j */
    public boolean f117049j = false;

    /* renamed from: n */
    public boolean f117050n = true;

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI$a */
    public class C43251a implements MenuItem.OnMenuItemClickListener {
        public C43251a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            TopStorySettingUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI$b */
    public class C43252b implements C47918a.C47919a {
        public C43252b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI$c */
    public class C43253c implements C47918a.C47920b {
        public C43253c() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI$d */
    public class C43254d implements C47324k.C47325a {
        public C43254d() {
        }

        /* renamed from: a */
        public void mo67489a() {
            Log.m105924i("MicroMsg.TopStory.TopStorySettingUI", "init, onFail, lastRecommendSwithIsChecked = " + TopStorySettingUI.this.f117050n);
            TopStorySettingUI topStorySettingUI = TopStorySettingUI.this;
            topStorySettingUI.f117046g.mo6805K(topStorySettingUI.f117050n);
        }

        /* renamed from: b */
        public void mo67490b(qo4 qo4) {
            int i = qo4.f140442d;
            boolean z = true;
            if (i == 1 || i == 2) {
                Log.m105924i("MicroMsg.TopStory.TopStorySettingUI", "init, onSuccess checkBoxRcmPreference, response.state = " + qo4.f140442d);
                CheckBoxPreference checkBoxPreference = TopStorySettingUI.this.f117046g;
                if (qo4.f140442d != 2) {
                    z = false;
                }
                checkBoxPreference.mo6805K(z);
                MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("TopStorySettingUI_settings_top_story_recommend", TopStorySettingUI.this.f117046g.mo6804J()).apply();
                return;
            }
            TopStorySettingUI topStorySettingUI = TopStorySettingUI.this;
            topStorySettingUI.f117046g.mo6805K(topStorySettingUI.f117050n);
            Log.m105924i("MicroMsg.TopStory.TopStorySettingUI", "error happen, unkonw state.");
        }
    }

    /* renamed from: H7 */
    public final boolean mo67484H7(int i) {
        Log.m105925i("MicroMsg.TopStory.TopStorySettingUI", "goDetailSettingUI, type:%s", Integer.valueOf(i));
        if (i != 1 && i != 2) {
            return false;
        }
        Intent intent = new Intent();
        if (i == 1) {
            String listToString = Util.listToString(C47918a.m53244b().f128580e, ",");
            intent.putExtra("k_topstory_type", 1);
            intent.putExtra("k_topstory_user_list", listToString);
            intent.setClassName(this, "com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI");
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/home/TopStorySettingUI", "goDetailPrivacySettingUI", "(I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/topstory/ui/home/TopStorySettingUI", "goDetailPrivacySettingUI", "(I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            String listToString2 = Util.listToString(C47918a.m53244b().f128579d, ",");
            intent.putExtra("k_topstory_type", 2);
            intent.putExtra("k_topstory_user_list", listToString2);
            intent.setClassName(this, "com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/home/TopStorySettingUI", "goDetailPrivacySettingUI", "(I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/topstory/ui/home/TopStorySettingUI", "goDetailPrivacySettingUI", "(I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return true;
    }

    /* renamed from: I7 */
    public final boolean mo67485I7(int i) {
        Log.m105925i("MicroMsg.TopStory.TopStorySettingUI", "goDetailSettingUI, type:%s", Integer.valueOf(i));
        if (i != 1 && i != 2) {
            return false;
        }
        Intent intent = new Intent();
        if (i == 1) {
            String listToString = Util.listToString(C47918a.m53244b().f128580e, ",");
            intent.putExtra("k_topstory_type", 1);
            intent.putExtra("k_topstory_user_list", listToString);
            C43471q.m46985i(this, ".ui.home.TopStorySettingVisibilityDetailUI", intent);
        } else {
            String listToString2 = Util.listToString(C47918a.m53244b().f128579d, ",");
            intent.putExtra("k_topstory_type", 2);
            intent.putExtra("k_topstory_user_list", listToString2);
            C43471q.m46985i(this, ".ui.home.TopStorySettingVisibilityDetailUI", intent);
        }
        return true;
    }

    /* renamed from: J7 */
    public final void mo67486J7() {
        this.f117048i = C47918a.m53244b().f128579d.size();
        this.f117047h = C47918a.m53244b().f128580e.size();
    }

    /* renamed from: K7 */
    public final void mo67487K7() {
        Log.m105925i("MicroMsg.TopStory.TopStorySettingUI", "updateSummary %s, %s", Integer.valueOf(this.f117047h), Integer.valueOf(this.f117048i));
        if (this.f117047h <= 0) {
            this.f117044e.mo7741E("");
        } else {
            IconPreference iconPreference = this.f117044e;
            iconPreference.mo7741E("" + this.f117047h);
        }
        if (this.f117048i <= 0) {
            this.f117045f.mo7741E("");
        } else {
            IconPreference iconPreference2 = this.f117045f;
            iconPreference2.mo7741E("" + this.f117048i);
        }
        this.f117043d.notifyDataSetChanged();
    }

    public int getResourceId() {
        return C0966R.xml.f8979d2;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(getString(C0966R.string.k4x));
        setBackBtn(new C43251a());
        C47511g preferenceScreen = getPreferenceScreen();
        this.f117043d = preferenceScreen;
        this.f117044e = (IconPreference) preferenceScreen.mo72519a("unlike");
        this.f117045f = (IconPreference) this.f117043d.mo72519a("black");
        this.f117049j = getIntent().getBooleanExtra("intent_status_from_privacy_to_tophistory_setting", false);
        C47918a b = C47918a.m53244b();
        b.mo72678e(b.f128581f, 0);
        C47918a b2 = C47918a.m53244b();
        b2.mo72679f(b2.f128582g, 0);
        mo67486J7();
        mo67487K7();
        C47918a.m53244b().f128587o = new C43252b();
        C47918a.m53244b().f128588p = new C43253c();
        if (this.f117049j) {
            this.f117043d.mo72529n("feedback", true);
            this.f117043d.mo72529n("not_be_seen_desc", true);
            this.f117043d.mo72529n("unlike_desc", true);
            this.f117043d.mo72529n("unlike_empty", true);
            this.f117043d.mo72529n("black_empty", true);
            this.f117043d.mo72529n("settings_top_story_setting_recommend", true);
        }
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f117043d.mo72519a("settings_top_story_setting_recommend");
        this.f117046g = checkBoxPreference;
        if (!this.f117049j && checkBoxPreference != null) {
            checkBoxPreference.mo6805K(MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getBoolean("TopStorySettingUI_settings_top_story_recommend", true));
            Log.m105924i("MicroMsg.TopStory.TopStorySettingUI", "onCreate, KEY_TOP_STORY_RECOMMEND = " + this.f117046g.mo6804J());
            this.f117050n = this.f117046g.mo6804J();
            C47323j jVar = new C47323j(this, new C43254d());
            synchronized (C47324k.class) {
                C47319c cVar = new C47319c(this, 0, jVar);
                cVar.f126995g = true;
                cVar.mo72374a();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C47918a.m53244b().f128588p = null;
        C47918a.m53244b().f128587o = null;
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        int i = 2;
        if ("unlike".equals(str)) {
            C115669n.INSTANCE.mo160131h(17080, 1, 2, "" + this.f117047h);
            return this.f117049j ? mo67484H7(1) : mo67485I7(1);
        } else if ("black".equals(str)) {
            C115669n.INSTANCE.mo160131h(17080, 2, 2, "" + this.f117048i);
            return this.f117049j ? mo67484H7(2) : mo67485I7(2);
        } else {
            if ("settings_top_story_setting_recommend".equals(str)) {
                boolean z = !((CheckBoxPreference) gVar.mo72519a("settings_top_story_setting_recommend")).mo6804J();
                this.f117050n = z;
                Log.m105925i("MicroMsg.TopStory.TopStorySettingUI", "onPreferenceTreeClick, lastRecommendSwithIsChecked = %s, isCheck = %s", Boolean.valueOf(z), Boolean.valueOf(!this.f117050n));
                CheckBoxPreference checkBoxPreference = this.f117046g;
                if (checkBoxPreference == null) {
                    Log.m105924i("MicroMsg.TopStory.TopStorySettingUI", "doRecommandStateAction, checkBoxRcmPreference checkBoxRcmPreference, lastRecommendSwithIsChecked = " + this.f117050n);
                } else {
                    if (!checkBoxPreference.mo6804J()) {
                        i = 1;
                    }
                    C47323j jVar = new C47323j(this, new C43258p(this));
                    synchronized (C47324k.class) {
                        C47319c cVar = new C47319c(this, i, jVar);
                        cVar.f126995g = true;
                        cVar.mo72374a();
                    }
                }
            } else if ("feedback".equals(str)) {
                C115669n.INSTANCE.mo160131h(17080, 18, 2, "0");
                StringBuilder sb = new StringBuilder(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/readtemplate?t=feedback/index");
                try {
                    sb.append("&deviceName=");
                    sb.append(C117627q.m165909b(C89625d.f257838d, "UTF-8"));
                } catch (Exception unused) {
                }
                sb.append("&imei=");
                sb.append("");
                try {
                    sb.append("&deviceBrand=");
                    sb.append(C117627q.m165909b(Build.BRAND, "UTF-8"));
                } catch (Exception unused2) {
                }
                try {
                    sb.append("&deviceModel=");
                    sb.append(C117627q.m165909b(C87203t.m108275k(), "UTF-8"));
                } catch (Exception unused3) {
                }
                sb.append("&from=");
                sb.append("settingPage");
                sb.append("&uin=");
                sb.append(C86709a0.m107523b().mo121111i());
                sb.append("&version=");
                sb.append(C89625d.f257841g);
                try {
                    sb.append("&lang=");
                    sb.append(C117627q.m165909b(LocaleUtil.getApplicationLanguage(), "UTF-8"));
                } catch (Exception unused4) {
                }
                try {
                    sb.append("&ostype=");
                    sb.append(C117627q.m165909b(C87200o.f252872e, "UTF-8"));
                } catch (Exception unused5) {
                }
                sb.append("&scene=");
                sb.append("32");
                sb.append("&timeZone=");
                sb.append(Util.getTimeZoneOffset());
                sb.append("&templateVersion=");
                sb.append(C43471q.m46977a(1));
                sb.append("#/list/4155");
                Log.m105924i("MicroMsg.TopStory.TopStorySettingUI", "url is:" + sb.toString());
                Intent intent = new Intent();
                intent.putExtra("rawUrl", sb.toString());
                intent.putExtra("convertActivityFromTranslucent", false);
                intent.putExtra("customize_status_bar_color", 0);
                intent.putExtra("status_bar_style", (String) null);
                intent.putExtra("prePublishId", "wes##2##1");
                intent.putExtra("KPublisherId", "wes##2##1");
                intent.putExtra("preChatTYPE", 10);
                C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                return true;
            }
            return false;
        }
    }

    public void onResume() {
        super.onResume();
        mo67486J7();
        mo67487K7();
    }
}
