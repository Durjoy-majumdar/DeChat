package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.tools.C7021t1;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C75359b0;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;
import kotlin.Metadata;
import lc3.C10485b;
import p629ny.C76979h;
import pj3.C47511g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wd3.C53155r0;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-setting_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI */
public final class SettingsPermissionIndexUI extends MMPreference {

    /* renamed from: d */
    public String f20881d = "";

    /* renamed from: e */
    public final C13601g f20882e = C36568h.m40985a(C5290e.f20889d);

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI$a */
    public static final class C5286a extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SettingsPermissionIndexUI f20883d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<String> f20884e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5286a(SettingsPermissionIndexUI settingsPermissionIndexUI, C8479f0<String> f0Var) {
            super(1);
            this.f20883d = settingsPermissionIndexUI;
            this.f20884e = f0Var;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            String string = this.f20883d.getString(C0966R.string.g5e, new Object[]{"infopage", this.f20884e.f27484d});
            C87412m.m108593f(string, "getString(\n             …ode\n                    )");
            SettingsPermissionIndexUI.m5259H7(this.f20883d, string);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI$b */
    public static final class C5287b extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SettingsPermissionIndexUI f20885d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<String> f20886e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5287b(SettingsPermissionIndexUI settingsPermissionIndexUI, C8479f0<String> f0Var) {
            super(1);
            this.f20885d = settingsPermissionIndexUI;
            this.f20886e = f0Var;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            String string = this.f20885d.getString(C0966R.string.g5g, new Object[]{LocaleUtil.getApplicationLanguage(), this.f20886e.f27484d, "setting", 0, 0});
            C87412m.m108593f(string, "getString(\n             …      0\n                )");
            SettingsPermissionIndexUI.m5259H7(this.f20885d, string);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI$c */
    public static final class C5288c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsPermissionIndexUI f20887d;

        public C5288c(SettingsPermissionIndexUI settingsPermissionIndexUI) {
            this.f20887d = settingsPermissionIndexUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f20887d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI$d */
    public static final class C5289d extends C75359b0 {

        /* renamed from: d */
        public final /* synthetic */ C32226l<View, C13598b0> f20888d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5289d(C32226l<? super View, C13598b0> lVar) {
            super(1, (C53155r0) null);
            this.f20888d = lVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI$setSpannableClick$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view, "widget");
            this.f20888d.invoke(view);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI$setSpannableClick$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI$e */
    public static final class C5290e extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C5290e f20889d = new C5290e();

        public C5290e() {
            super(0);
        }

        public Object invoke() {
            return ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("ShowExportUserDataEntry");
        }
    }

    /* renamed from: H7 */
    public static final void m5259H7(SettingsPermissionIndexUI settingsPermissionIndexUI, String str) {
        settingsPermissionIndexUI.getClass();
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
        intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
        C88144b.m109791i(settingsPermissionIndexUI.getContext(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: I7 */
    public final void mo6262I7(TextView textView, C32226l<? super View, C13598b0> lVar) {
        SpannableString spannableString = new SpannableString(textView.getText());
        spannableString.setSpan(new C5289d(lVar), 0, spannableString.length(), 17);
        textView.setText(spannableString);
        ((C76979h) C86312j.m106911c(C76979h.class)).mo107056S3(textView, spannableString);
    }

    public View getBottomView() {
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.bxr, (ViewGroup) null);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) inflate;
        C8479f0 f0Var = new C8479f0();
        T obj = C86709a0.m107535s().mo121142i().mo119684e(274436, "").toString();
        f0Var.f27484d = obj;
        if (Util.isNullOrNil((String) obj)) {
            f0Var.f27484d = LocaleUtil.getCurrentCountryCode();
        }
        if (!Util.isNullOrNil((String) f0Var.f27484d) && !Util.isAllAlpha((String) f0Var.f27484d)) {
            f0Var.f27484d = "";
        }
        if (C112551y.m153809i((String) f0Var.f27484d, "cn", true)) {
            TextView textView = (TextView) linearLayout.findViewById(C0966R.C0970id.f359176jf2);
            C87412m.m108593f(textView, LocaleUtil.ITALIAN);
            mo6262I7(textView, new C5286a(this, f0Var));
            textView.setVisibility(0);
        }
        View findViewById = linearLayout.findViewById(C0966R.C0970id.f359175jf1);
        C87412m.m108593f(findViewById, "bottomView.findViewById<…settings_privacy_link_tv)");
        mo6262I7((TextView) findViewById, new C5287b(this, f0Var));
        return linearLayout;
    }

    public int getResourceId() {
        return C0966R.xml.f8949c6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x008e, code lost:
        if (z04.C112550d0.m153801u(r6, r0, false) != false) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            super.onCreate(r6)
            r6 = 2131836271(0x7f113d6f, float:1.9305704E38)
            r5.setMMTitle((int) r6)
            com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI$c r6 = new com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI$c
            r6.<init>(r5)
            r5.setBackBtn(r6)
            f40.e r6 = f40.C86709a0.m107523b()
            f40.e$c r6 = r6.mo121109d()
            f40.e$c r1 = f40.C86718e.C7980c.WeiXin
            r2 = 0
            if (r6 != r1) goto L_0x0036
            di3.d r6 = di3.C86312j.m106911c(r0)
            h81.h r6 = (h81.C32735h) r6
            h81.h$c r0 = h81.C32735h.C32737c.clicfg_cn_admanage_url_android
            java.lang.String r1 = "https://ads.privacy.qq.com/ads/wxoptout.html?media_source=101001"
            java.lang.String r6 = r6.Y60(r0, r1)
            java.lang.String r0 = "getService(IExptService:…ml?media_source=101001\" )"
            gy3.C87412m.m108593f(r6, r0)
            r5.f20881d = r6
            goto L_0x0092
        L_0x0036:
            di3.d r6 = di3.C86312j.m106911c(r0)
            h81.h r6 = (h81.C32735h) r6
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_oversea_admanage_url_android
            java.lang.String r3 = ""
            java.lang.String r6 = r6.Y60(r1, r3)
            java.lang.String r1 = "getService(IExptService:…dmanage_url_android, \"\" )"
            gy3.C87412m.m108593f(r6, r1)
            r5.f20881d = r6
            di3.d r6 = di3.C86312j.m106911c(r0)
            h81.h r6 = (h81.C32735h) r6
            h81.h$c r0 = h81.C32735h.C32737c.clicfg_oversea_admanage_close_country_android
            java.lang.String r6 = r6.Y60(r0, r3)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r1 = 274436(0x43004, float:3.84567E-40)
            java.lang.String r0 = r0.mo119674H(r1, r3)
            java.lang.String r1 = r5.f20881d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0090
            java.lang.String r1 = "adMgrCloseCountry"
            gy3.C87412m.m108593f(r6, r1)
            java.lang.String r6 = r6.toLowerCase()
            java.lang.String r1 = "this as java.lang.String).toLowerCase()"
            gy3.C87412m.m108593f(r6, r1)
            java.lang.String r4 = "regCountry"
            gy3.C87412m.m108593f(r0, r4)
            java.lang.String r0 = r0.toLowerCase()
            gy3.C87412m.m108593f(r0, r1)
            boolean r6 = z04.C112550d0.m153801u(r6, r0, r2)
            if (r6 == 0) goto L_0x0092
        L_0x0090:
            r5.f20881d = r3
        L_0x0092:
            java.lang.String r6 = r5.f20881d
            r0 = 1
            if (r6 == 0) goto L_0x00a0
            int r6 = r6.length()
            if (r6 != 0) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r6 = 0
            goto L_0x00a1
        L_0x00a0:
            r6 = 1
        L_0x00a1:
            if (r6 != 0) goto L_0x00af
            java.lang.String r6 = r5.f20881d
            r1 = 2
            r3 = 0
            java.lang.String r4 = "http"
            boolean r6 = z04.C112551y.m153820t(r6, r4, r2, r1, r3)
            if (r6 != 0) goto L_0x00b9
        L_0x00af:
            pj3.g r6 = r5.getPreferenceScreen()
            java.lang.String r1 = "setting_privacy_personal_ad_mgr"
            r6.mo72529n(r1, r0)
        L_0x00b9:
            f40.e r6 = f40.C86709a0.m107523b()
            f40.e$c r6 = r6.mo121109d()
            f40.e$c r1 = f40.C86718e.C7980c.WeChat
            java.lang.String r3 = "setting_wechat_personal_info_export"
            if (r6 != r1) goto L_0x00ef
            pj3.g r6 = r5.getPreferenceScreen()
            java.lang.String r1 = "setting_privacy_personal_info_export"
            r6.mo72529n(r1, r0)
            rx3.g r6 = r5.f20882e
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00e4
            int r6 = r6.length()
            if (r6 != 0) goto L_0x00e5
        L_0x00e4:
            r2 = 1
        L_0x00e5:
            if (r2 == 0) goto L_0x00f6
            pj3.g r6 = r5.getPreferenceScreen()
            r6.mo72529n(r3, r0)
            goto L_0x00f6
        L_0x00ef:
            pj3.g r6 = r5.getPreferenceScreen()
            r6.mo72529n(r3, r0)
        L_0x00f6:
            com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct r6 = new com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct
            r6.<init>()
            r0 = 2
            r6.f10079d = r0
            r6.mo86054n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsPermissionIndexUI.onCreate(android.os.Bundle):void");
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        C87412m.m108591d(preference);
        String str = preference.f121285r;
        if (str != null) {
            switch (str.hashCode()) {
                case -2127957195:
                    if (str.equals("setting_privacy_personal_ad_mgr")) {
                        String str2 = this.f20881d;
                        if (!Util.isNullOrNil(str2)) {
                            str2 = C7021t1.m7266a(str2, "lang=" + LocaleUtil.getCurrentLanguage(this));
                            C87412m.m108593f(str2, "safelyUrlConcatParam(raw…tCurrentLanguage(this)}\")");
                        }
                        Intent intent = new Intent();
                        intent.putExtra("showShare", false);
                        intent.putExtra("rawUrl", str2);
                        intent.putExtra("show_feedback", false);
                        intent.putExtra("show_bottom", false);
                        intent.putExtra("needRedirect", false);
                        intent.putExtra("neverGetA8Key", false);
                        C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                        UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct = new UserPrivacySettingClientReportStruct();
                        userPrivacySettingClientReportStruct.f10079d = 54;
                        userPrivacySettingClientReportStruct.mo86054n();
                        return true;
                    }
                    break;
                case -1179310352:
                    if (str.equals("setting_wechat_personal_info_export")) {
                        Intent intent2 = new Intent();
                        intent2.putExtra("showShare", false);
                        intent2.putExtra("rawUrl", (String) ((C36570n) this.f20882e).getValue());
                        intent2.putExtra("show_feedback", false);
                        intent2.putExtra("show_bottom", false);
                        intent2.putExtra("needRedirect", false);
                        intent2.putExtra("neverGetA8Key", false);
                        C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
                        UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct2 = new UserPrivacySettingClientReportStruct();
                        userPrivacySettingClientReportStruct2.f10079d = 51;
                        userPrivacySettingClientReportStruct2.mo86054n();
                        return true;
                    }
                    break;
                case 264218592:
                    if (str.equals("settings_privacy_app_permission")) {
                        Intent intent3 = new Intent(this, SettingsAuthUI.class);
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent3);
                        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct3 = new UserPrivacySettingClientReportStruct();
                        userPrivacySettingClientReportStruct3.f10079d = 53;
                        userPrivacySettingClientReportStruct3.mo86054n();
                        return true;
                    }
                    break;
                case 765127884:
                    if (str.equals("setting_privacy_personal_info_export")) {
                        Intent intent4 = new Intent(getContext(), SettingsPersonalInfoPreviewUI.class);
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(intent4);
                        C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((Intent) aVar2.mo10231a(0));
                        C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct4 = new UserPrivacySettingClientReportStruct();
                        userPrivacySettingClientReportStruct4.f10079d = 51;
                        userPrivacySettingClientReportStruct4.mo86054n();
                        return true;
                    }
                    break;
                case 1795686324:
                    if (str.equals("settings_privacy_sys_permission")) {
                        Intent intent5 = new Intent(getContext(), SettingsSystemPermissionUI.class);
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(intent5);
                        C117292a.m165358d(this, aVar3.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((Intent) aVar3.mo10231a(0));
                        C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct5 = new UserPrivacySettingClientReportStruct();
                        userPrivacySettingClientReportStruct5.f10079d = 52;
                        userPrivacySettingClientReportStruct5.mo86054n();
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
