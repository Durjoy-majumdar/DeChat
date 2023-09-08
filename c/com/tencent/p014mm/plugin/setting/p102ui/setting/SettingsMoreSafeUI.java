package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.BackupProcessMgrExitEvent;
import com.tencent.p014mm.autogen.events.FcmUnRegisterEvent;
import com.tencent.p014mm.autogen.events.LogoutEvent;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.account.p024ui.MMFBAuthUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C75681p0;
import f40.C86709a0;
import j20.C117292a;
import jg0.C46556e;
import junit.framework.Assert;
import k20.C9556a;
import ke3.C88144b;
import l20.C21388a;
import lc3.C10485b;
import m83.C10769b;
import m83.C10770c;
import m83.C10771d;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p327ct.C30914c;
import p823sg.C77710q;
import pj3.C47511g;
import tm2.C14049d;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsMoreSafeUI */
public class SettingsMoreSafeUI extends MMPreference implements MStorageEx.IOnStorageChange, C11385n {

    /* renamed from: d */
    public C47511g f205750d;

    /* renamed from: e */
    public ProgressDialog f205751e;

    /* renamed from: f */
    public String f205752f = null;

    /* renamed from: g */
    public String f205753g;

    /* renamed from: h */
    public SparseIntArray f205754h;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsMoreSafeUI$a */
    public class C71075a implements MenuItem.OnMenuItemClickListener {
        public C71075a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsMoreSafeUI.this.hideVKB();
            SettingsMoreSafeUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsMoreSafeUI$b */
    public class C71076b implements C76879j.C47267l {

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsMoreSafeUI$b$a */
        public class C71077a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C46556e f205757d;

            public C71077a(C71076b bVar, C46556e eVar) {
                this.f205757d = eVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d(this.f205757d);
            }
        }

        public C71076b() {
        }

        public boolean onFinish(CharSequence charSequence) {
            if (!Util.isValidEmail(charSequence.toString())) {
                C76879j.m92726T(SettingsMoreSafeUI.this.getContext(), SettingsMoreSafeUI.this.getString(C0966R.string.k9v));
                return false;
            }
            C14049d.m13402a().mo93136Bk();
            C46556e eVar = new C46556e(1, charSequence.toString());
            C86709a0.m107524d().mo123460f(eVar);
            SettingsMoreSafeUI settingsMoreSafeUI = SettingsMoreSafeUI.this;
            settingsMoreSafeUI.f205751e = C76879j.m92723Q(settingsMoreSafeUI.getContext(), SettingsMoreSafeUI.this.getString(C0966R.string.a3h), SettingsMoreSafeUI.this.getString(C0966R.string.iqx), true, true, new C71077a(this, eVar));
            return true;
        }
    }

    public SettingsMoreSafeUI() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f205754h = sparseIntArray;
        sparseIntArray.put(0, C0966R.string.irb);
        this.f205754h.put(-82, C0966R.string.ion);
        this.f205754h.put(-83, C0966R.string.iok);
        this.f205754h.put(-84, C0966R.string.iol);
        this.f205754h.put(-85, C0966R.string.ioe);
        this.f205754h.put(-86, C0966R.string.iop);
    }

    /* renamed from: H7 */
    public final void mo97748H7() {
        Preference a = this.f205750d.mo72519a("settings_facebook");
        if (a == null) {
            Log.m105920e("MicroMsg.SettingsMoreSafeUI", "updateFacebook Preference null");
        } else if (WeChatBrands.Business.Entries.MeSetSecurityFacebook.banned() || !C75592q0.m90755C()) {
            this.f205750d.mo72526j(a);
        } else if (!C75592q0.m90792v()) {
            a.mo7741E(getString(C0966R.string.iqw));
        } else {
            a.mo7741E((String) C86709a0.m107535s().mo121142i().mo119684e(65826, (Object) null));
        }
    }

    /* renamed from: I7 */
    public final void mo97749I7() {
        Preference a = this.f205750d.mo72519a("settings_email_addr");
        Assert.assertNotNull(a);
        String str = (String) C86709a0.m107535s().mo121142i().mo119683d(5);
        Integer num = (Integer) C86709a0.m107535s().mo121142i().mo119683d(7);
        if (num != null && (num.intValue() & 2) != 0 && !Util.isNullOrNil(str)) {
            a.mo7740D(C0966R.string.irk);
        } else if (Util.isNullOrNil(str)) {
            a.mo7740D(C0966R.string.irj);
        } else {
            a.mo7740D(C0966R.string.iod);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        if (r1.mo33502k(r2.f60519d) == 0) goto L_0x0041;
     */
    /* renamed from: J7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97750J7() {
        /*
            r6 = this;
            pj3.g r0 = r6.f205750d
            java.lang.String r1 = "settings_phone_security"
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r1)
            com.tencent.mm.ui.base.preference.IconSwitchKeyValuePreference r0 = (com.tencent.p014mm.p136ui.base.preference.IconSwitchKeyValuePreference) r0
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "MicroMsg.SettingsMoreSafeUI"
            java.lang.String r1 = "phone_security preference is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            return
        L_0x0016:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.isGPVersion()
            r3 = 1
            if (r2 != 0) goto L_0x0061
            boolean r2 = eb0.C45628s0.m50756U()
            if (r2 == 0) goto L_0x0024
            goto L_0x0061
        L_0x0024:
            java.lang.Class<ct.c> r1 = p327ct.C30914c.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ct.c r1 = (p327ct.C30914c) r1
            ct.d r1 = r1.mo17862sM()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC
            l20.a r1 = (l20.C21388a) r1
            boolean r4 = r1.f60497c
            r5 = 0
            if (r4 != 0) goto L_0x0043
            java.lang.String r1 = "MicroMsg.NewBadge"
            java.lang.String r2 = "queryHasDotSourceValue NewBadge has not initialized"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
        L_0x0041:
            r3 = 0
            goto L_0x0055
        L_0x0043:
            l20.b r4 = r1.f60495a
            l20.b$a r2 = r4.mo33512b(r2)
            if (r2 != 0) goto L_0x004c
        L_0x004b:
            goto L_0x0041
        L_0x004c:
            java.lang.String r2 = r2.f60519d
            int r1 = r1.mo33502k(r2)
            if (r1 != 0) goto L_0x0055
            goto L_0x004b
        L_0x0055:
            if (r3 == 0) goto L_0x005b
            r0.mo96250V(r5)
            goto L_0x0060
        L_0x005b:
            r1 = 8
            r0.mo96250V(r1)
        L_0x0060:
            return
        L_0x0061:
            pj3.g r0 = r6.f205750d
            r0.mo72529n(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsMoreSafeUI.mo97750J7():void");
    }

    /* renamed from: K7 */
    public final void mo97751K7() {
        Preference a = this.f205750d.mo72519a("settings_bind_qq");
        if (a == null) {
            Log.m105920e("MicroMsg.SettingsMoreSafeUI", "updateUin Preference null");
            return;
        }
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119684e(9, 0)).intValue();
        if (intValue == 0) {
            Log.m105924i("MicroMsg.SettingsMoreSafeUI", "updateUin 0 Preference");
            if (Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("BindQQSwitch"), 1) != 1) {
                this.f205750d.mo72529n("settings_uin", true);
            } else {
                a.mo7740D(C0966R.string.iqw);
            }
        } else {
            a.mo7741E("" + new C77710q(intValue));
        }
        if (WeChatBrands.Business.Entries.MeSetSecurityQQ.banned()) {
            this.f205750d.mo72526j(a);
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8961cf;
    }

    public void initView() {
        Class cls = C10485b.class;
        setMMTitle((int) C0966R.string.iuu);
        this.f205750d = getPreferenceScreen();
        if (((Integer) C86709a0.m107535s().mo121142i().mo119684e(9, 0)).intValue() != 0) {
            Log.m105924i("MicroMsg.SettingsMoreSafeUI", "summerqq BindQQSwitch bindqq");
        } else if (Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("BindQQSwitch"), 1) != 1) {
            this.f205750d.mo72529n("settings_uin", true);
            Log.m105924i("MicroMsg.SettingsMoreSafeUI", "summerqq BindQQSwitch off");
        }
        this.f205752f = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("CloseAcctUrl");
        setBackBtn(new C71075a());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2 && i2 == -1) {
            if (!(C86709a0.m107524d() == null || C86709a0.m107524d().f256809d == null)) {
                C86709a0.m107524d().f256809d.mo55479j0(false);
            }
            new FcmUnRegisterEvent().publish();
            C14049d.m13402a().fq0();
            C86709a0.m107535s().mo121142i().remove(this);
            LogoutEvent logoutEvent = new LogoutEvent();
            LogoutEvent.C28774a aVar = logoutEvent.f78863d;
            aVar.getClass();
            aVar.f78864a = 3;
            logoutEvent.publish();
            BackupProcessMgrExitEvent backupProcessMgrExitEvent = new BackupProcessMgrExitEvent();
            backupProcessMgrExitEvent.f78724d.f78725a = true;
            backupProcessMgrExitEvent.publish();
            MMEntryLock.unlock("show_whatsnew");
            C75681p0.m90934a(this, true);
            Intent intent2 = new Intent();
            intent2.addFlags(67108864);
            intent2.putExtra("Intro_Switch", true);
            ((C67654r1) C14049d.m13403b()).mo93183p(intent2, getContext());
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        C86709a0.m107524d().mo123455a(256, this);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(256, this);
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        mo97751K7();
        mo97749I7();
        mo97748H7();
        mo97750J7();
    }

    public void onPause() {
        super.onPause();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        Log.m105924i("MicroMsg.SettingsMoreSafeUI", str + " item has been clicked!");
        if (Util.isNullOrNil(str)) {
            return false;
        }
        if (str.equals("settings_facebook")) {
            if (WeChatBrands.Business.Entries.MeSetSecurityFacebook.checkAvailable(this)) {
                startActivity(MMFBAuthUI.class);
            }
            return true;
        } else if (str.equals("settings_email_addr")) {
            Integer num = (Integer) C86709a0.m107535s().mo121142i().mo119684e(7, (Object) null);
            boolean z = (num == null || (num.intValue() & 2) == 0) ? false : true;
            String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(5, (Object) null);
            if (z || !Util.isNullOrNil(str2)) {
                Intent intent = new Intent(getContext(), SettingsModifyEmailAddrUI.class);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsMoreSafeUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsMoreSafeUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                if (this.f205751e != null) {
                    Log.m105928w("MicroMsg.SettingsMoreSafeUI", "do get email input, but tips dialog has not dismissed");
                    this.f205751e.dismiss();
                    this.f205751e = null;
                }
                C76879j.m92720N(getContext(), getString(C0966R.string.iub), "", getString(C0966R.string.iuc), 50, new C71076b());
            }
            return true;
        } else if (str.equals("settings_bind_qq")) {
            if (WeChatBrands.Business.Entries.MeSetSecurityQQ.checkAvailable(this)) {
                ((C67654r1) C14049d.m13403b()).mo93172e(new Intent(), this);
            }
            return true;
        } else {
            if (str.equals("settings_phone_security")) {
                ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33508q(C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, false);
                ((IconPreference) preference).mo96250V(8);
                C115669n.INSTANCE.mo160131h(10939, Integer.valueOf(((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_DEVICE_PROTECT_SECURITY_STATUS_INT_SYNC, 0)).intValue()));
                C10770c cVar = new C10770c(this);
                cVar.f32244b = "mmdownloadapp_HMNgrd6q8lVpXoJy7Y";
                ((C10771d) C86312j.m106911c(C10771d.class)).mo10782yz(cVar, (C10769b) null);
            } else if (str.equals("settings_delete_account")) {
                Intent intent2 = new Intent();
                if (!Util.isNullOrNil(this.f205752f)) {
                    intent2.putExtra("rawUrl", this.f205752f + "&lang=" + LocaleUtil.getCurrentLanguage(getContext()));
                    intent2.putExtra("showShare", true);
                    intent2.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
                    C88144b.m109795m(getContext(), "webview", ".ui.tools.WebViewUI", intent2, 2);
                }
            } else if (str.equals("settings_dump_personal_data")) {
                Intent intent3 = new Intent();
                if (!Util.isNullOrNil(this.f205753g)) {
                    intent3.putExtra("rawUrl", this.f205753g);
                    intent3.putExtra("showShare", false);
                    intent3.putExtra("needRedirect", false);
                    intent3.putExtra("neverGetA8Key", false);
                    intent3.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
                    C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", intent3, (Bundle) null);
                }
            }
            return false;
        }
    }

    public void onResume() {
        mo97751K7();
        mo97749I7();
        mo97748H7();
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("ShowExportUserDataEntry");
        if (!Util.isNullOrNil(c)) {
            this.f205753g = c;
        } else {
            this.f205753g = "";
            this.f205750d.mo72529n("settings_dump_personal_data", true);
        }
        mo97750J7();
        this.f205750d.mo72526j(this.f205750d.mo72519a("settings_about_domainmail"));
        if (Util.isNullOrNil(this.f205752f)) {
            this.f205750d.mo72526j(this.f205750d.mo72519a("settings_delete_account"));
        }
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105918d("MicroMsg.SettingsMoreSafeUI", "onSceneEnd " + i + " errCode " + i2 + " errMsg " + str + "  " + yVar.getType());
        ProgressDialog progressDialog = this.f205751e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f205751e = null;
        }
        if (yVar.getType() != 256) {
            return;
        }
        if ((i == 0 && i2 == 0) || !C14049d.m13402a().mo93163uP(this, i, i2, str)) {
            int i3 = this.f205754h.get(i2);
            String string = getString(C0966R.string.ira, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            if (i3 != 0) {
                try {
                    string = getString(i3);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.SettingsMoreSafeUI", "try get string by id %d, fail:%s", Integer.valueOf(i3), e.getMessage());
                    Log.printErrStackTrace("MicroMsg.SettingsMoreSafeUI", e, "", new Object[0]);
                }
            }
            C76879j.m92726T(getContext(), string);
        }
    }
}
