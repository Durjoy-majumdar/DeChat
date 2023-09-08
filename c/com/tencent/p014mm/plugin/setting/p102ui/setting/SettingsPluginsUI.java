package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.PluginTextPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceSmallCategory;
import com.tencent.p014mm.plugin.preference.PluginPreference;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import gc2.C116945b;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ke3.C88144b;
import ky2.C10432i;
import lc3.C10485b;
import nc0.C76850a;
import ob0.C11385n;
import ob0.C117747y;
import pj3.C47511g;
import te3.C50091k72;
import tv2.C52366c;
import xm2.C53382l;
import xm2.C53383m;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPluginsUI */
public class SettingsPluginsUI extends MMPreference implements C11385n {

    /* renamed from: f */
    public static HashMap<String, Integer> f116332f = new C42967a();

    /* renamed from: d */
    public C47511g f116333d;

    /* renamed from: e */
    public boolean f116334e;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPluginsUI$a */
    public class C42967a extends HashMap<String, Integer> {
        public C42967a() {
            put("qqmail", 3);
            put("newsapp", 8);
            put("masssendapp", 9);
            put("feedsapp", 10);
            put("linkedinplugin", 13);
            put("facebookapp", 16);
            put("gh_43f2581f6fd6", 18);
            put("downloaderapp", 19);
            put("gh_3dfda90e39d6", 20);
            put("gh_f0a92aa7146c", 21);
            put("gh_579db1f2cf89", 22);
            put("gh_b4af18eac3d5", 23);
            put("gh_e087bb5b95e6", 24);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPluginsUI$b */
    public class C42968b implements MenuItem.OnMenuItemClickListener {
        public C42968b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsPluginsUI.this.hideVKB();
            SettingsPluginsUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo67170H7() {
        Class cls = C32735h.class;
        Class cls2 = C10485b.class;
        Class cls3 = C75700k0.class;
        this.f116333d.removeAll();
        this.f116333d.mo72527k(new PreferenceSmallCategory(this, (AttributeSet) null));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean t = C75592q0.m90790t();
        if (!t) {
            t = Util.getInt(((C10485b) C86709a0.m107533q(cls2)).vh0().mo107405c("BindQQSwitch"), 1) == 1;
        }
        if (!t) {
            Log.m105924i("MicroMsg.SettingsPluginsUI", "summerqq BindQQSwitch off");
        }
        WeChatBrands.Business.Entries entries = WeChatBrands.Business.Entries.HomePluginQQMail;
        if (!entries.banned() && t) {
            C88144b.m109788f("qqmail");
            PluginPreference pluginPreference = new PluginPreference(this, (AttributeSet) null);
            if (pluginPreference.mo66703I("qqmail")) {
                pluginPreference.mo69924H(pluginPreference.f115260K);
                if ((C75592q0.m90785o() & 1) == 0) {
                    arrayList.add(pluginPreference);
                } else if (C76850a.m92637i()) {
                    arrayList2.add(pluginPreference);
                }
            }
        }
        if (!entries.banned()) {
            C88144b.m109788f("readerapp");
            if (!((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
                PluginPreference pluginPreference2 = new PluginPreference(this, (AttributeSet) null);
                if (pluginPreference2.mo66703I("newsapp")) {
                    pluginPreference2.mo69924H(pluginPreference2.f115260K);
                    if ((C75592q0.m90785o() & 524288) == 0) {
                        arrayList.add(pluginPreference2);
                    } else if (C76850a.m92637i()) {
                        arrayList2.add(pluginPreference2);
                    }
                }
            }
        }
        if (!WeChatBrands.Business.Entries.MeSetSecurityFacebook.banned()) {
            PluginPreference pluginPreference3 = new PluginPreference(this, (AttributeSet) null);
            if (pluginPreference3.mo66703I("facebookapp")) {
                pluginPreference3.mo69924H(pluginPreference3.f115260K);
                if ((C75592q0.m90785o() & 8192) == 0) {
                    arrayList.add(pluginPreference3);
                } else if (C76850a.m92636h()) {
                    arrayList2.add(pluginPreference3);
                }
            }
        }
        C88144b.m109788f("masssend");
        PluginPreference pluginPreference4 = new PluginPreference(this, (AttributeSet) null);
        if (pluginPreference4.mo66703I("masssendapp")) {
            pluginPreference4.mo69924H(pluginPreference4.f115260K);
            if ((C75592q0.m90785o() & 65536) == 0) {
                arrayList.add(pluginPreference4);
            } else {
                arrayList2.add(pluginPreference4);
            }
        }
        PluginPreference pluginPreference5 = new PluginPreference(this, (AttributeSet) null);
        pluginPreference5.mo66704J("gh_43f2581f6fd6", getString(C0966R.string.cgc));
        pluginPreference5.mo69924H(pluginPreference5.f115260K);
        if (((C52366c) C86312j.m106911c(C52366c.class)).mo73378Rw()) {
            arrayList.add(pluginPreference5);
        } else {
            arrayList2.add(pluginPreference5);
        }
        boolean d = C116945b.wx0().mo175755d(1);
        this.f116334e = d;
        pluginPreference5.f115264P = d;
        PluginPreference pluginPreference6 = new PluginPreference(this, (AttributeSet) null);
        pluginPreference6.mo66704J("gh_3dfda90e39d6", getString(C0966R.string.hls));
        pluginPreference6.mo69924H(pluginPreference6.f115260K);
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls3)).mo96097Ni().get("gh_3dfda90e39d6");
        if (z1Var != null ? z1Var.mo62927s3() : false) {
            arrayList.add(pluginPreference6);
        } else {
            arrayList2.add(pluginPreference6);
        }
        PluginPreference pluginPreference7 = new PluginPreference(this, (AttributeSet) null);
        pluginPreference7.mo66704J("gh_b4af18eac3d5", getString(C0966R.string.hlr));
        pluginPreference7.mo69924H(pluginPreference7.f115260K);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls3)).mo96097Ni().get("gh_b4af18eac3d5");
        if (z1Var2 != null ? z1Var2.mo62927s3() : false) {
            arrayList.add(pluginPreference7);
        }
        PluginPreference pluginPreference8 = new PluginPreference(this, (AttributeSet) null);
        pluginPreference8.mo66704J("gh_f0a92aa7146c", getString(C0966R.string.hlq));
        pluginPreference8.mo69924H(pluginPreference8.f115260K);
        C72996z1 z1Var3 = ((C75700k0) C86709a0.m107533q(cls3)).mo96097Ni().get("gh_f0a92aa7146c");
        if (z1Var3 != null ? z1Var3.mo62927s3() : false) {
            arrayList.add(pluginPreference8);
        } else {
            C86709a0.m107528h();
            int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_SETTING_PLUGIN_SHOW_PAY_COLLECTION_FLAG_INT_SYNC, 0)).intValue();
            Log.m105925i("MicroMsg.SettingsPluginsUI", "SETTING_PLUGIN_SHOW_PAY_COLLECTION Flag :%s", Integer.valueOf(intValue));
            if (intValue == 1) {
                arrayList2.add(pluginPreference8);
            }
        }
        PluginPreference pluginPreference9 = new PluginPreference(this, (AttributeSet) null);
        pluginPreference9.mo66704J("gh_e087bb5b95e6", getString(C0966R.string.hlp));
        pluginPreference9.mo69924H(pluginPreference9.f115260K);
        C72996z1 z1Var4 = ((C75700k0) C86709a0.m107533q(cls3)).mo96097Ni().get("gh_e087bb5b95e6");
        if (z1Var4 != null ? z1Var4.mo62927s3() : false) {
            arrayList.add(pluginPreference9);
        } else {
            boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_android_add_pay_business_collection_open_config, false);
            Log.m105925i("MicroMsg.SettingsPluginsUI", "addPayBusinessCollection openConfig ：%s ", Boolean.valueOf(wf));
            if (wf) {
                arrayList2.add(pluginPreference9);
            }
        }
        if (1 != ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_minishop_plugin_enabled, 1)) {
            Log.m105924i("MicroMsg.SettingsPluginsUI", "addMiniShopHelperIfNeed, not need");
        } else {
            PluginPreference pluginPreference10 = new PluginPreference(this, (AttributeSet) null);
            pluginPreference10.mo66704J("gh_579db1f2cf89", getString(C0966R.string.f360872fi1));
            pluginPreference10.mo69924H(pluginPreference10.f115260K);
            C72996z1 z1Var5 = ((C75700k0) C86709a0.m107533q(cls3)).mo96097Ni().get("gh_579db1f2cf89");
            if (z1Var5 != null ? z1Var5.mo62927s3() : false) {
                arrayList.add(pluginPreference10);
            } else {
                int intValue2 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_SETTING_PLUGIN_SHOW_MINI_SHOP_HELPER_FLAG_INT_SYNC, 0)).intValue();
                Log.m105924i("MicroMsg.SettingsPluginsUI", "addMiniShopHelperIfNeed, USERINFO_SETTING_PLUGIN_SHOW_MINI_SHOP_HELPER_FLAG_INT_SYNC: " + intValue2);
                if (1 == intValue2) {
                    arrayList2.add(pluginPreference10);
                }
            }
        }
        String c = ((C10485b) C86709a0.m107533q(cls2)).vh0().mo107405c("LinkedinPluginClose");
        if (Util.isNullOrNil(c) || Util.getInt(c, 0) == 0) {
            PluginPreference pluginPreference11 = new PluginPreference(this, (AttributeSet) null);
            if (pluginPreference11.mo66703I("linkedinplugin")) {
                pluginPreference11.mo69924H(pluginPreference11.f115260K);
                boolean z = (C75592q0.m90785o() & TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0;
                boolean z2 = !Util.isNullOrNil((String) C86709a0.m107535s().mo121142i().mo119684e(286721, (Object) null));
                if (z && z2) {
                    arrayList.add(pluginPreference11);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            PluginTextPreference pluginTextPreference = new PluginTextPreference(this);
            pluginTextPreference.f121261L = C0966R.raw.setting_plugin_install;
            pluginTextPreference.f121262M = pluginTextPreference.f121274d.getString(C0966R.string.iwv);
            this.f116333d.mo72527k(pluginTextPreference);
        }
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_SETTING_PLUGIN_SWITCH_NAMES_STRING, "");
        Iterator it = arrayList.iterator();
        PluginPreference pluginPreference12 = null;
        while (it.hasNext()) {
            PluginPreference pluginPreference13 = (PluginPreference) it.next();
            pluginPreference13.f115266R = 255;
            if (str.contains(pluginPreference13.f115259J)) {
                pluginPreference13.f115264P = true;
                if (pluginPreference12 == null) {
                    pluginPreference12 = pluginPreference13;
                }
            }
            this.f116333d.mo72527k(pluginPreference13);
        }
        this.f116333d.mo72527k(new PreferenceSmallCategory(this, (AttributeSet) null));
        PluginTextPreference pluginTextPreference2 = new PluginTextPreference(this);
        pluginTextPreference2.f121261L = C0966R.raw.setting_plugin_uninstall;
        pluginTextPreference2.f121262M = pluginTextPreference2.f121274d.getString(C0966R.string.f361323ix2);
        this.f116333d.mo72527k(pluginTextPreference2);
        if (arrayList2.isEmpty()) {
            PluginEmptyTextPreference pluginEmptyTextPreference = new PluginEmptyTextPreference(this, (AttributeSet) null, 0);
            pluginEmptyTextPreference.f20732K = getString(C0966R.string.iwq);
            this.f116333d.mo72527k(pluginEmptyTextPreference);
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            PluginPreference pluginPreference14 = (PluginPreference) it4.next();
            pluginPreference14.f115266R = 136;
            if (str.contains(pluginPreference14.f115259J)) {
                pluginPreference14.f115264P = true;
                if (pluginPreference12 == null) {
                    pluginPreference12 = pluginPreference14;
                }
            }
            this.f116333d.mo72527k(pluginPreference14);
        }
        this.f116333d.mo72527k(new PreferenceSmallCategory(this, (AttributeSet) null));
        if (pluginPreference12 != null) {
            setSelection(this.f116333d.mo72523g(pluginPreference12.f121285r));
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8967co;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.iwp);
        setBackBtn(new C42968b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f116333d = getPreferenceScreen();
        initView();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(14098, 5);
        nVar.mo160131h(12846, 1);
        C31519v2.m39436a().mo55987c("gh_43f2581f6fd6", "");
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        if (com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.HomePluginSports.checkAvailable(r8) != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        if (com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.HomePluginWePay.checkAvailable(r8) != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
        r10 = new android.content.Intent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        if ("newsapp".equals(r9) == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        r10.putExtra("reportSessionId", eb0.C86493v0.m107223a("reader_app"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a9, code lost:
        if ("gh_f0a92aa7146c".equals(r9) == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE.mo160131h(19540, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00be, code lost:
        if ("gh_43f2581f6fd6".equals(r9) == false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c2, code lost:
        if (r8.f116334e == false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c4, code lost:
        gc2.C116945b.yx0().mo175766e(1, true);
        r10.putExtra("key_from_wesport_plugin_newtips", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d0, code lost:
        r10.putExtra("Contact_User", r9);
        ke3.C88144b.m109791i(r8, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", r10, (android.os.Bundle) null);
        com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE.mo160131h(12846, f116332f.get(r9));
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.SettingsPluginsUI", "click id:%s, kvID:%d", r9, f116332f.get(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0102, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreferenceTreeClick(pj3.C47511g r9, com.tencent.p014mm.p136ui.base.preference.Preference r10) {
        /*
            r8 = this;
            java.lang.String r0 = r10.f121285r
            r1 = 1
            if (r0 == 0) goto L_0x0029
            java.lang.String r2 = "display_in_addr_book"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0029
            com.tencent.mm.ui.base.preference.Preference r9 = r9.mo72519a(r0)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r9 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r9
            boolean r9 = r9.mo6804J()
            f40.o r10 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r10 = r10.mo121142i()
            r0 = 35
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r10.mo119676J(r0, r9)
            return r1
        L_0x0029:
            boolean r9 = r10 instanceof com.tencent.p014mm.plugin.preference.PluginPreference
            r0 = 0
            if (r9 == 0) goto L_0x0103
            com.tencent.mm.plugin.preference.PluginPreference r10 = (com.tencent.p014mm.plugin.preference.PluginPreference) r10
            java.lang.String r9 = r10.f115259J
            r9.getClass()
            r10 = -1
            int r2 = r9.hashCode()
            java.lang.String r3 = "newsapp"
            java.lang.String r4 = "gh_43f2581f6fd6"
            r5 = 2
            switch(r2) {
                case -952171561: goto L_0x0061;
                case -656511598: goto L_0x0056;
                case 1570189923: goto L_0x004d;
                case 1846123118: goto L_0x0044;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x006c
        L_0x0044:
            boolean r2 = r9.equals(r3)
            if (r2 != 0) goto L_0x004b
            goto L_0x006c
        L_0x004b:
            r10 = 3
            goto L_0x006c
        L_0x004d:
            boolean r2 = r9.equals(r4)
            if (r2 != 0) goto L_0x0054
            goto L_0x006c
        L_0x0054:
            r10 = 2
            goto L_0x006c
        L_0x0056:
            java.lang.String r2 = "gh_3dfda90e39d6"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x005f
            goto L_0x006c
        L_0x005f:
            r10 = 1
            goto L_0x006c
        L_0x0061:
            java.lang.String r2 = "qqmail"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r10 = 0
        L_0x006c:
            switch(r10) {
                case 0: goto L_0x0070;
                case 1: goto L_0x0082;
                case 2: goto L_0x0079;
                case 3: goto L_0x0070;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x008b
        L_0x0070:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r10 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.HomePluginQQMail
            boolean r10 = r10.checkAvailable(r8)
            if (r10 != 0) goto L_0x0079
            return r1
        L_0x0079:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r10 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.HomePluginSports
            boolean r10 = r10.checkAvailable(r8)
            if (r10 != 0) goto L_0x0082
            return r1
        L_0x0082:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r10 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.HomePluginWePay
            boolean r10 = r10.checkAvailable(r8)
            if (r10 != 0) goto L_0x008b
            return r1
        L_0x008b:
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            boolean r2 = r3.equals(r9)
            if (r2 == 0) goto L_0x00a3
            java.lang.String r2 = "reader_app"
            java.lang.String r2 = eb0.C86493v0.m107223a(r2)
            java.lang.String r3 = "reportSessionId"
            r10.putExtra(r3, r2)
        L_0x00a3:
            java.lang.String r2 = "gh_f0a92aa7146c"
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x00ba
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 19540(0x4c54, float:2.7381E-41)
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r6[r0] = r7
            r2.mo160131h(r3, r6)
        L_0x00ba:
            boolean r2 = r4.equals(r9)
            if (r2 == 0) goto L_0x00d0
            boolean r2 = r8.f116334e
            if (r2 == 0) goto L_0x00d0
            com.tencent.mm.plugin.newtips.model.l r2 = gc2.C116945b.yx0()
            r2.mo175766e(r1, r1)
            java.lang.String r2 = "key_from_wesport_plugin_newtips"
            r10.putExtra(r2, r1)
        L_0x00d0:
            java.lang.String r2 = "Contact_User"
            r10.putExtra(r2, r9)
            r2 = 0
            java.lang.String r3 = "profile"
            java.lang.String r4 = ".ui.ContactInfoUI"
            ke3.C88144b.m109791i(r8, r3, r4, r10, r2)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 12846(0x322e, float:1.8001E-41)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.util.HashMap<java.lang.String, java.lang.Integer> r4 = f116332f
            java.lang.Object r4 = r4.get(r9)
            r3[r0] = r4
            r10.mo160131h(r2, r3)
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r0] = r9
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = f116332f
            java.lang.Object r9 = r0.get(r9)
            r10[r1] = r9
            java.lang.String r9 = "MicroMsg.SettingsPluginsUI"
            java.lang.String r0 = "click id:%s, kvID:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r10)
            return r1
        L_0x0103:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsPluginsUI.onPreferenceTreeClick(pj3.g, com.tencent.mm.ui.base.preference.Preference):boolean");
    }

    public boolean onPreferenceTreeLongClick(C47511g gVar, Preference preference, View view) {
        return super.onPreferenceTreeLongClick(gVar, preference, view);
    }

    public void onResume() {
        Class cls = C75700k0.class;
        super.onResume();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("gh_f0a92aa7146c");
        boolean s3 = z1Var != null ? z1Var.mo62927s3() : false;
        boolean z = true;
        Log.m105925i("MicroMsg.SettingsPluginsUI", "needGetReceipAssistPlugin result：%s", Boolean.valueOf(s3));
        if (!s3) {
            C86709a0.m107524d().mo123455a(2745, this);
            C86709a0.m107524d().mo123460f(new C53383m());
        }
        if (1 != ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_minishop_plugin_enabled, 1)) {
            Log.m105924i("MicroMsg.SettingsPluginsUI", "fetchMiniShopHelperPluginShowStatusIfNeed, not need");
        } else {
            C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("gh_579db1f2cf89");
            if (z1Var2 != null) {
                z = true ^ z1Var2.mo62927s3();
            }
            Log.m105924i("MicroMsg.SettingsPluginsUI", "fetchMiniShopHelperPluginShowStatusIfNeed, needFetch: " + z);
            if (z) {
                C86709a0.m107524d().mo123455a(4158, this);
                C86709a0.m107524d().mo123460f(new C53382l());
            }
        }
        mo67170H7();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SETTING_PLUGIN_SHOW_MINI_SHOP_HELPER_FLAG_INT_SYNC;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_SETTING_PLUGIN_SHOW_PAY_COLLECTION_FLAG_INT_SYNC;
        Log.m105924i("MicroMsg.SettingsPluginsUI", "errType:" + i + " errCode:" + i2 + " errMsg:" + str + " scenetype:" + yVar.getType());
        if (yVar instanceof C53383m) {
            C86709a0.m107524d().mo123470p(2745, this);
            if (i == 0 || i2 == 0) {
                C50091k72 k722 = ((C53383m) yVar).f150210f;
                if (k722 == null) {
                    k722 = new C50091k72();
                }
                if (k722.f136596d == 1) {
                    Log.m105924i("MicroMsg.SettingsPluginsUI", "need to show unstall ReceipAssistPlugin");
                    C86709a0.m107535s().mo121142i().mo119677K(aVar2, 1);
                } else {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar2, 0);
                }
                mo67170H7();
                return;
            }
            Log.m105921e("MicroMsg.SettingsPluginsUI", "errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        } else if (yVar instanceof C53382l) {
            C86709a0.m107524d().mo123470p(4158, this);
            if (i == 0 || i2 == 0) {
                if (((C53382l) yVar).f150207f) {
                    Log.m105924i("MicroMsg.SettingsPluginsUI", "need to show unstall MiniShopHelperPlugin");
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
                } else {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
                }
                mo67170H7();
                return;
            }
            Log.m105921e("MicroMsg.SettingsPluginsUI", "errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        }
    }
}
