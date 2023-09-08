package com.tencent.p014mm.plugin.sns.p106ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;
import pj3.C47511g;
import vr2.C102260r;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsAdLBSAuthManagerUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI */
public final class SnsAdLBSAuthManagerUI extends MMPreference {

    /* renamed from: d */
    public final String f21175d = "SnsAdLBSAuthManagerUI";

    /* renamed from: e */
    public int f21176e;

    /* renamed from: f */
    public String f21177f = "";

    /* renamed from: g */
    public String f21178g = "";

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI$a */
    public static final class C5443a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ SnsAdLBSAuthManagerUI f21179d;

        public C5443a(SnsAdLBSAuthManagerUI snsAdLBSAuthManagerUI) {
            this.f21179d = snsAdLBSAuthManagerUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI$onCreate$1");
            this.f21179d.finish();
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI$onCreate$1");
            return true;
        }
    }

    public int getResourceId() {
        SnsMethodCalculate.markStartTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
        SnsMethodCalculate.markEndTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
        return C0966R.xml.f8974d0;
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.mdr);
        setBackBtn(new C5443a(this));
        this.f21176e = getIntent().getIntExtra("sns_landig_pages_from_source", 0);
        String stringExtra = getIntent().getStringExtra("sns_landing_pages_rawSnsId");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        this.f21177f = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("sns_landing_pages_ux_info");
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        this.f21178g = str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("snsid", this.f21177f);
        jSONObject.put("uxinfo", this.f21178g);
        jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f21176e);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("action", "exposed");
        jSONObject.put("extInfo", jSONObject2);
        String jSONObject3 = jSONObject.toString();
        C87412m.m108593f(jSONObject3, "obj.toString()");
        C102260r.m134858a("location_ad_auth_ui_report", jSONObject3);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        C47511g gVar2 = gVar;
        Preference preference2 = preference;
        SnsMethodCalculate.markStartTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
        String str = preference2 != null ? preference2.f121285r : null;
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
            return false;
        } else if (gVar2 == null) {
            SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
            return false;
        } else {
            String str2 = this.f21175d;
            Log.m105924i(str2, "onPreferenceTreeClick() called with: screen = " + gVar2 + ", pref = " + preference2);
            Object obj = "click_to_enable";
            if (C87412m.m108589b(str, "sns_ad_can_request_lbs")) {
                Preference a = gVar2.mo72519a("sns_ad_can_request_lbs");
                CheckBoxPreference checkBoxPreference = a instanceof CheckBoxPreference ? (CheckBoxPreference) a : null;
                boolean J = checkBoxPreference != null ? checkBoxPreference.mo6804J() : false;
                MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("sns_ad_landing_page_key");
                if (mmkv == null) {
                    SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
                    return false;
                }
                mmkv.putBoolean("canRequestLBS", J);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("snsid", this.f21177f);
                jSONObject.put("uxinfo", this.f21178g);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f21176e);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("action", J ? obj : "click_to_disable");
                jSONObject2.put("name", "lbs_auth");
                jSONObject.put("extInfo", jSONObject2);
                String jSONObject3 = jSONObject.toString();
                C87412m.m108593f(jSONObject3, "obj.toString()");
                C102260r.m134858a("location_ad_auth_ui_report", jSONObject3);
                SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
                return true;
            } else if (str.equals("sns_ad_can_auto_fill_data")) {
                Preference a2 = gVar2.mo72519a("sns_ad_can_auto_fill_data");
                CheckBoxPreference checkBoxPreference2 = a2 instanceof CheckBoxPreference ? (CheckBoxPreference) a2 : null;
                boolean J2 = checkBoxPreference2 != null ? checkBoxPreference2.mo6804J() : false;
                MultiProcessMMKV mmkv2 = MultiProcessMMKV.getMMKV("sns_ad_landing_page_key");
                if (mmkv2 == null) {
                    SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
                    return false;
                }
                mmkv2.putBoolean("canAutoFillData", J2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("snsid", this.f21177f);
                jSONObject4.put("uxinfo", this.f21178g);
                jSONObject4.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f21176e);
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("action", J2 ? obj : "click_to_disable");
                jSONObject5.put("name", "auto_fill");
                jSONObject4.put("extInfo", jSONObject5);
                String jSONObject6 = jSONObject4.toString();
                C87412m.m108593f(jSONObject6, "obj.toString()");
                C102260r.m134858a("location_ad_auth_ui_report", jSONObject6);
                SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
                return true;
            } else {
                SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
                return false;
            }
        }
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
        super.onResume();
        Log.m105924i(this.f21175d, "onResume() called");
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("sns_ad_landing_page_key");
        if (mmkv == null) {
            SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
            return;
        }
        boolean z = mmkv.getBoolean("canRequestLBS", false);
        boolean z2 = mmkv.getBoolean("canAutoFillData", false);
        C47511g preferenceScreen = getPreferenceScreen();
        CheckBoxPreference checkBoxPreference = null;
        Preference a = preferenceScreen != null ? preferenceScreen.mo72519a("sns_ad_can_request_lbs") : null;
        CheckBoxPreference checkBoxPreference2 = a instanceof CheckBoxPreference ? (CheckBoxPreference) a : null;
        if (checkBoxPreference2 != null) {
            checkBoxPreference2.mo6805K(z);
        }
        Preference a2 = preferenceScreen != null ? preferenceScreen.mo72519a("sns_ad_can_auto_fill_data") : null;
        if (a2 instanceof CheckBoxPreference) {
            checkBoxPreference = (CheckBoxPreference) a2;
        }
        if (checkBoxPreference != null) {
            checkBoxPreference.mo6805K(z2);
        }
        String str = this.f21175d;
        Log.m105924i(str, "init data canAutoFillData= " + z2 + " canRequestLBS= " + z);
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
    }
}
