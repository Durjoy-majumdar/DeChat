package com.tencent.p014mm.plugin.topstory.p113ui.home;

import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import o03.C47324k;
import te3.qo4;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.p */
public class C43258p implements C47324k.C47325a {

    /* renamed from: a */
    public final /* synthetic */ TopStorySettingUI f117057a;

    public C43258p(TopStorySettingUI topStorySettingUI) {
        this.f117057a = topStorySettingUI;
    }

    /* renamed from: a */
    public void mo67489a() {
        Log.m105924i("MicroMsg.TopStory.TopStorySettingUI", "showSafeDialogCheck, onFail, lastRecommendSwithIsChecked = " + this.f117057a.f117050n);
        TopStorySettingUI topStorySettingUI = this.f117057a;
        topStorySettingUI.f117046g.mo6805K(topStorySettingUI.f117050n);
    }

    /* renamed from: b */
    public void mo67490b(qo4 qo4) {
        int i = qo4.f140442d;
        boolean z = true;
        if (i == 1 || i == 2) {
            Log.m105924i("MicroMsg.TopStory.TopStorySettingUI", "showSafeDialogCheck, onSuccess, response.state = " + qo4.f140442d);
            CheckBoxPreference checkBoxPreference = this.f117057a.f117046g;
            if (qo4.f140442d != 2) {
                z = false;
            }
            checkBoxPreference.mo6805K(z);
            MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("TopStorySettingUI_settings_top_story_recommend", this.f117057a.f117046g.mo6804J()).apply();
            return;
        }
        TopStorySettingUI topStorySettingUI = this.f117057a;
        topStorySettingUI.f117046g.mo6805K(topStorySettingUI.f117050n);
        Log.m105924i("MicroMsg.TopStory.TopStorySettingUI", "error happen, unkonw state.");
    }
}
