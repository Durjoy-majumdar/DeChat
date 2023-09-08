package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.TalkRoomUitlEvent;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.modelavatar.C1295s;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.base.preference.HeadImgNewPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.SummaryTextPreference;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C40475h;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C7624i3;
import f12.C7970a;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import hn2.C20974j;
import ht1.C60200t1;
import ht1.C60216z4;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import ky2.C10432i;
import l31.C61212e;
import lc3.C10485b;
import m53.C10756c;
import o31.C11345b;
import o31.C76986a;
import ob0.C11385n;
import ob0.C117747y;
import p140cw.C7138g;
import p145dx.C58457w;
import p145dx.C7526s;
import p196ln.C10579k;
import p196ln.C117475p;
import p196ln.C76706g;
import p196ln.C76708i;
import p214om.C11502f;
import p629ny.C76979h;
import pj3.C47511g;
import tm2.C14049d;
import ud2.C78150h;
import wj2.C66132f;
import xm2.C53385p;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI */
public class SettingsPersonalInfoUI extends MMPreference implements MStorageEx.IOnStorageChange, C11385n {

    /* renamed from: g */
    public static final /* synthetic */ int f20911g = 0;

    /* renamed from: d */
    public C47511g f20912d;

    /* renamed from: e */
    public boolean f20913e;

    /* renamed from: f */
    public C53385p f20914f;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI$a */
    public class C5304a implements MenuItem.OnMenuItemClickListener {
        public C5304a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsPersonalInfoUI.this.hideVKB();
            SettingsPersonalInfoUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI$d */
    public class C5305d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f20916d;

        public C5305d(Bitmap bitmap) {
            this.f20916d = bitmap;
        }

        public void run() {
            Log.m105919d("MicroMsg.SettingsPersonalInfoUI", "updateHeadImg hasUin:%b user:%s", Boolean.valueOf(C86709a0.m107522a()), C75592q0.m90789s());
            if (C86709a0.m107522a()) {
                if (this.f20916d != null) {
                    C10579k RE = ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE();
                    PreviewHdHeadImg.m83514H7(this.f20916d, ((AvatarStorage) RE).mo93558g(C75592q0.m90789s() + ".last", true, false));
                }
                C7624i3.f25910c.mo8754b(((C76708i) C86312j.m106911c(C76708i.class)).eg0(C75592q0.m90789s(), false, true));
            }
            SettingsPersonalInfoUI settingsPersonalInfoUI = SettingsPersonalInfoUI.this;
            int i = SettingsPersonalInfoUI.f20911g;
            HeadImgNewPreference headImgNewPreference = (HeadImgNewPreference) settingsPersonalInfoUI.f20912d.mo72519a("settings_change_avatar");
            headImgNewPreference.mo7739I(C75592q0.m90789s());
            headImgNewPreference.f24242Q = new C5407w2(settingsPersonalInfoUI);
            if (SettingsPersonalInfoUI.this.f20913e) {
                C115669n.INSTANCE.mo160131h(ErrorCode.ERROR_OUTOF_MEMORY, 4, 4);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI$b */
    public class C5306b implements Runnable {
        public C5306b(SettingsPersonalInfoUI settingsPersonalInfoUI) {
        }

        public void run() {
            TalkRoomUitlEvent talkRoomUitlEvent = new TalkRoomUitlEvent();
            talkRoomUitlEvent.f193954d.f193956b = true;
            talkRoomUitlEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI$c */
    public class C5307c implements Runnable {
        public C5307c(SettingsPersonalInfoUI settingsPersonalInfoUI) {
        }

        public void run() {
            TalkRoomUitlEvent talkRoomUitlEvent = new TalkRoomUitlEvent();
            talkRoomUitlEvent.f193954d.f193956b = true;
            talkRoomUitlEvent.publish();
        }
    }

    /* renamed from: H7 */
    public final void mo6275H7(boolean z) {
        if (!(!((C60200t1) C86312j.m106911c(C60200t1.class)).mo76885uf().mo8926e(1)) || !z) {
            this.f20912d.mo72529n("settings_finder_recent_like", true);
        } else {
            this.f20912d.mo72529n("settings_finder_recent_like", false);
        }
    }

    /* renamed from: I7 */
    public final void mo6276I7() {
        Intent intent = new Intent();
        intent.setClass(this, SettingsModifyPatSuffixUI.class);
        intent.putExtras(getIntent());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "goToSetPatSuffix", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "goToSetPatSuffix", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: J7 */
    public final void mo6277J7() {
        Class cls = C10485b.class;
        Preference a = this.f20912d.mo72519a("settings_username");
        String c = C75592q0.m90773c();
        String s = C75592q0.m90789s();
        if (Util.isNullOrNil(c)) {
            if (C72996z1.m85802I4(s)) {
                a.mo7741E(getString(C0966R.string.iw5));
            } else {
                a.mo7741E(s);
            }
            if (!C72996z1.m85814Q4(C75592q0.m90789s()) && ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("EnableModAlias", 0) == 0) {
                a.mo69921C(8);
            }
        } else {
            a.mo7741E(c);
            if (((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("EnableModAlias", 0) == 0) {
                a.mo69921C(8);
            }
        }
        if (WeChatBrands.Business.Entries.MeAvatarWeChatId.restricted()) {
            a.mo69921C(8);
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8966cn;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.iwc);
        C86709a0.m107535s().mo121142i().add(this);
        this.f20912d = getPreferenceScreen();
        setBackBtn(new C5304a());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C86001b0 q;
        Class cls = C76706g.class;
        Log.m105925i("MicroMsg.SettingsPersonalInfoUI", "onAcvityResult requestCode:%d, resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 != -1) {
            if (i == 3 || i == 2 || i == 4) {
                new MMHandler(Looper.getMainLooper()).post(new C5306b(this));
            }
        } else if (i != 2) {
            if (i == 3) {
                String g6 = ((C7138g) C86312j.m106911c(C7138g.class)).mo8319g6(getApplicationContext(), intent, C7970a.m8127a());
                if (g6 != null) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("CropImageMode", 1);
                    intent2.putExtra("CropImage_OutputPath", g6);
                    intent2.putExtra("CropImage_ImgPath", g6);
                    intent2.putExtra("CropImage_from_scene", 3);
                    ((C67654r1) C14049d.m13403b()).mo93178k(this, intent2, 4);
                }
            } else if (i == 4) {
                new MMHandler(Looper.getMainLooper()).post(new C5307c(this));
                if (intent != null) {
                    String stringExtra = intent.getStringExtra("CropImage_OutputPath");
                    Bitmap k = ((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93562k(C75592q0.m90789s());
                    if (stringExtra == null) {
                        Log.m105920e("MicroMsg.SettingsPersonalInfoUI", "crop picture failed");
                        return;
                    }
                    Object[] objArr = new Object[2];
                    objArr[0] = stringExtra;
                    Uri n = C116299g2.m163858n(stringExtra);
                    String path = n.getPath();
                    if (path != null) {
                        String k2 = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k2)) {
                            n = n.buildUpon().path(k2).build();
                        }
                    }
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    long j = 0;
                    if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
                        j = q.f250473c;
                    }
                    objArr[1] = Long.valueOf(j);
                    Log.m105925i("MicroMsg.SettingsPersonalInfoUI", "onActivityResult(CONTEXT_MENU_CROP_PICTURE)  file:%s, size:%d", objArr);
                    ((C1295s) ((C117475p) C86312j.m106911c(C117475p.class)).mo182091fC(getContext(), stringExtra, false)).mo1220b(1, new C5305d(k), true);
                }
            }
        } else if (intent != null) {
            Intent intent3 = new Intent();
            intent3.putExtra("CropImageMode", 1);
            intent3.putExtra("CropImage_Filter", true);
            C10579k RE = ((C76706g) C86312j.m106911c(cls)).mo106826RE();
            intent3.putExtra("CropImage_OutputPath", ((AvatarStorage) RE).mo93558g(C75592q0.m90789s() + ".crop", true, false));
            intent3.putExtra("CropImage_ImgPath", (String) null);
            intent3.putExtra("CropImage_from_scene", 3);
            ((C67654r1) C14049d.m13403b()).mo93179l(this, intent, intent3, C7970a.m8127a(), 4, (C7013o.C7017c) null);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("jumptoPat", false)) {
            mo6276I7();
        }
        initView();
        if (getIntent().getBooleanExtra("intent_set_avatar", false)) {
            this.f20913e = getIntent().getBooleanExtra("KEnterFromBanner", false);
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93149TE(this);
        }
        C86709a0.m107524d().mo123455a(C40475h.CTRL_INDEX, this);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.SettingsPersonalInfoUI).mo86179qs(this, C76986a.MyProfile);
    }

    public void onDestroy() {
        Log.m105918d("MicroMsg.SettingsPersonalInfoUI", "SettingsPersonalInfoUI.onDestroy()");
        if (C86709a0.m107522a()) {
            C86709a0.m107535s().mo121142i().remove(this);
        }
        if (this.f20914f != null) {
            C86709a0.m107524d().mo123458d(this.f20914f);
        }
        C86709a0.m107524d().mo123470p(C40475h.CTRL_INDEX, this);
        super.onDestroy();
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        int nullAsInt = Util.nullAsInt(obj, 0);
        Log.m105919d("MicroMsg.SettingsPersonalInfoUI", "onNotifyChange event:%d obj:%d stg:%s", Integer.valueOf(i), Integer.valueOf(nullAsInt), mStorageEx);
        if (mStorageEx != C86709a0.m107535s().mo121142i() || nullAsInt <= 0) {
            Log.m105921e("MicroMsg.SettingsPersonalInfoUI", "onNotifyChange error obj:%d stg:%s", Integer.valueOf(nullAsInt), mStorageEx);
            return;
        }
        mo6277J7();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Class cls = C10485b.class;
        String str = preference.f121285r;
        Log.m105918d("MicroMsg.SettingsPersonalInfoUI", "key = " + str);
        if (str.equals("settings_change_avatar")) {
            return ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93149TE(this);
        }
        boolean z = true;
        if (str.equals("settings_username")) {
            if (WeChatBrands.Business.Entries.MeAvatarWeChatId.restricted()) {
                return true;
            }
            if (!Util.isNullOrNil(C75592q0.m90773c()) || !C72996z1.m85814Q4(C75592q0.m90789s()) || ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("EnableModAlias", 0) != 0) {
                if (((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("EnableModAlias", 0) != 0) {
                    Intent intent = new Intent(this, SettingsAliasUI.class);
                    intent.putExtra("WizardRootClass", SettingsPersonalInfoUI.class.getCanonicalName());
                    MMWizardActivity.m7017L7(this, intent);
                }
                return true;
            }
            startActivity(SettingsCreateAliasUI.class);
            return true;
        } else if (str.equals("settings_name")) {
            Intent intent2 = new Intent();
            intent2.setClass(this, SettingsModifyNameUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "goTosetName", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "goTosetName", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else {
            if (str.equals("settings_qrcode")) {
                C115669n.INSTANCE.mo160131h(11264, 2);
                if (!(C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Global_ColorfulQRCode_Int, 0) == 1 || (!C87412m.m108589b(C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_QRCODE_OLD_STYLE_INT, -100), -100)) || ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_colorful_qrcode_new_enable, 0) == 1)) {
                    z = false;
                }
                if (z) {
                    AppCompatActivity context = getContext();
                    Intent intent3 = new Intent(this, ColorfulSelfQRCodeUI.class);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent3);
                    C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    AppCompatActivity context2 = getContext();
                    Intent intent4 = new Intent(this, SelfQRCodeUI.class);
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent4);
                    AppCompatActivity appCompatActivity = context2;
                    C117292a.m165358d(appCompatActivity, aVar3.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else if (str.equals("settings_more_info")) {
                Intent intent5 = new Intent(this, SettingsPersonalMoreUI.class);
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(intent5);
                C117292a.m165358d(this, aVar4.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar4.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (str.equals("settings_address")) {
                if (!WeChatBrands.Business.Entries.MeAvatarAddress.checkAvailable(getContext())) {
                    return true;
                }
                Intent intent6 = new Intent();
                intent6.putExtra("launch_from_webview", false);
                C88144b.m109792j(getContext(), "address", ".ui.WalletSelectAddrUI", intent6, true);
                return true;
            } else if (str.equals("settings_invoice")) {
                if (!WeChatBrands.Business.Entries.MeAvatarInvoiceTitle.checkAvailable(getContext())) {
                    return true;
                }
                C115669n.INSTANCE.mo160131h(14199, 1);
                Intent intent7 = new Intent();
                intent7.putExtra("launch_from_webview", false);
                C88144b.m109792j(getContext(), "address", ".ui.InvoiceListUI", intent7, true);
                return true;
            } else if (str.equals("settings_pat")) {
                mo6276I7();
            } else if (str.equals("settings_wecoin")) {
                if (!((C10756c) C86709a0.m107533q(C10756c.class)).mo10998j3()) {
                    C20974j.m23149c(this, 8, true, new C5409x2(this));
                } else {
                    C115669n.INSTANCE.mo160131h(21650, 0);
                    Intent intent8 = new Intent();
                    intent8.putExtra("launch_from_webview", false);
                    C88144b.m109792j(getContext(), "wallet", ".wecoin.ui.WeCoinRechargeView", intent8, true);
                }
            } else if (str.equals("settings_finder_recent_like")) {
                String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(4, (Object) null);
                if (Util.isNullOrNil(str2)) {
                    str2 = "";
                }
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83762I5(this, C75592q0.m90789s(), str2, 92);
            } else if (str.equals("settings_notification_ringtone")) {
                ((C58457w) C86312j.m106911c(C58457w.class)).mo82791Pu(this, 7);
            }
            return false;
        }
    }

    public void onResume() {
        String str;
        Class cls = C10432i.class;
        Class cls2 = C76979h.class;
        mo6277J7();
        HeadImgNewPreference headImgNewPreference = (HeadImgNewPreference) this.f20912d.mo72519a("settings_change_avatar");
        headImgNewPreference.mo7739I(C75592q0.m90789s());
        headImgNewPreference.f24242Q = new C5407w2(this);
        String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(4, (Object) null);
        if (str2 != null && str2.length() > 0) {
            this.f20912d.mo72519a("settings_name").mo7741E(((C76979h) C86312j.m106911c(cls2)).mo107057T1(this, str2));
        }
        Preference a = this.f20912d.mo72519a("settings_pat");
        if (((C78150h) C86312j.m106911c(C78150h.class)).isPatEnable()) {
            this.f20912d.mo72529n("settings_pat", false);
            a.mo7741E(((C76979h) C86312j.m106911c(cls2)).mo107057T1(this, (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_PAT_SUFFIX_STRING_SYNC, (Object) null)));
        } else {
            this.f20912d.mo72529n("settings_pat", true);
        }
        this.f20912d.mo72529n("settings_address", Util.isOverseasUser(this) || WeChatBrands.Business.Entries.MeAvatarAddress.banned());
        if (((C10432i) C86312j.m106911c(cls)).mo10750e()) {
            this.f20912d.mo72529n("settings_finder_recent_like", true);
        } else {
            mo6275H7(((C60200t1) C86312j.m106911c(C60200t1.class)).mo76885uf().mo8923b(new C5411y2(this), (C60216z4.C8821a<Integer>) null));
        }
        boolean z = WeChatBrands.Business.Entries.MeAvatarInvoiceTitle.banned() || !Util.nullAsFalse(Boolean.valueOf(C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_ABOUT_INVOICE_ENTRANCE_BOOLEAN, false)));
        this.f20912d.mo72529n("settings_invoice", z);
        if (z) {
            this.f20914f = new C53385p();
            C86709a0.m107524d().mo123460f(this.f20914f);
        }
        Class cls3 = C10756c.class;
        boolean e = ((C10432i) C86312j.m106911c(cls)).mo10750e();
        SummaryTextPreference summaryTextPreference = (SummaryTextPreference) this.f20912d.mo72519a("settings_wecoin");
        this.f20912d.mo72529n("settings_wecoin", e);
        String str3 = "";
        if (!e) {
            long longValue = ((C10756c) C86709a0.m107533q(cls3)).mo10995Wl().longValue();
            Log.m105925i("MicroMsg.SettingsPersonalInfoUI", "updateWeCoinEntry balance catch: %s", Long.valueOf(longValue));
            if (longValue > 0) {
                str = longValue + " " + getString(C0966R.string.j2b);
            } else {
                str = str3;
            }
            summaryTextPreference.f24294K = "fonts/WeChatSansSS-Regular.ttf";
            summaryTextPreference.mo7741E(str);
            ((C10756c) C86709a0.m107533q(cls3)).mo11000qy(new C5413z2(this, summaryTextPreference, str));
        }
        Preference a2 = this.f20912d.mo72519a("settings_notification_ringtone");
        C66132f Hi0 = ((C7526s) C86312j.m106911c(C7526s.class)).Hi0(str3);
        if (Hi0 != null) {
            str3 = Util.nullAsNil(Hi0.f190086i);
        }
        a2.mo7741E(str3);
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z = false;
        if (WeChatBrands.Business.Entries.MeAvatarInvoiceTitle.banned() || !Util.nullAsFalse(Boolean.valueOf(C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_ABOUT_INVOICE_ENTRANCE_BOOLEAN, false)))) {
            z = true;
        }
        this.f20912d.mo72529n("settings_invoice", z);
    }
}
