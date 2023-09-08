package com.tencent.p014mm.plugin.setting.p102ui.setting;

import al3.C0086a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85811a5;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.newtips.NormalIconNewTipPreference;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import com.tencent.wcdb.support.CancellationSignal;
import di3.C86312j;
import f40.C86709a0;
import gc2.C116945b;
import h81.C32735h;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import l20.C21388a;
import lc3.C10485b;
import lg3.C88497f;
import nj3.C76879j;
import nj3.C76912y0;
import nj3.C88990b;
import p156gj.C107835h0;
import p327ct.C30914c;
import p605mj.C34575a;
import p761yd.C91441c;
import p910lj.C76701a;
import pj3.C47511g;
import qo3.C77389a;
import qo3.C77398g;
import sf0.C90188n0;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI */
public class SettingsAboutSystemUI extends MMPreference {

    /* renamed from: i */
    public static final /* synthetic */ int f205661i = 0;

    /* renamed from: d */
    public C47511g f205662d;

    /* renamed from: e */
    public boolean f205663e = false;

    /* renamed from: f */
    public int f205664f;

    /* renamed from: g */
    public int f205665g;

    /* renamed from: h */
    public boolean f205666h;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI$a */
    public class C71057a implements MenuItem.OnMenuItemClickListener {
        public C71057a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsAboutSystemUI.this.hideVKB();
            SettingsAboutSystemUI.this.finish();
            return true;
        }
    }

    public SettingsAboutSystemUI() {
        new CancellationSignal();
        this.f205664f = -1;
        this.f205665g = -1;
        this.f205666h = false;
    }

    /* renamed from: I7 */
    public static boolean m83526I7() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.mmvoip_multipath_switch, false);
    }

    /* renamed from: H7 */
    public final void mo97718H7(LinearLayout linearLayout, int i, int i2, boolean z, View.OnClickListener onClickListener) {
        TextView textView = (TextView) View.inflate(getContext(), C0966R.C0971layout.bpg, (ViewGroup) null);
        textView.setText(i);
        textView.setTag(Integer.valueOf(i2));
        linearLayout.addView(textView);
        textView.setOnClickListener(onClickListener);
        if (z) {
            textView.setCompoundDrawablesWithIntrinsicBounds(C0966R.raw.radio_on, 0, 0, 0);
        }
    }

    /* renamed from: J7 */
    public final void mo97719J7(boolean z) {
        MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putBoolean("settings_nfc_switch", z).commit();
        ((CheckBoxPreference) this.f205662d.mo72519a("settings_nfc_switch")).mo6805K(z);
        this.f205662d.notifyDataSetChanged();
    }

    /* renamed from: K7 */
    public final void mo97720K7(boolean z) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_NFC_OPEN_SWITCH_INT_SYNC;
        if (z) {
            getPackageManager().setComponentEnabledSetting(new ComponentName(MMApplicationContext.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 1, 1);
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
            return;
        }
        getPackageManager().setComponentEnabledSetting(new ComponentName(MMApplicationContext.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 2, 1);
        C86709a0.m107535s().mo121142i().mo119677K(aVar, 2);
    }

    /* renamed from: L7 */
    public final boolean mo97721L7() {
        Intent intent = new Intent(this, SettingsFontUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetTextSize", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetTextSize", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    /* renamed from: M7 */
    public final void mo97722M7() {
        boolean z = false;
        boolean z2 = Util.safeParseInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SilentDownloadApkAtWiFi")) != 0;
        if ((ChannelUtil.updateMode & 1) != 0) {
            Log.m105918d("MicroMsg.SettingsAboutSystemUI", "channel pack, not silence download.");
            z2 = true;
        }
        if (z2) {
            this.f205662d.mo72529n("settings_silence_update_mode", true);
            return;
        }
        this.f205662d.mo72529n("settings_silence_update_mode", false);
        if ((((Integer) C86709a0.m107535s().mo121142i().mo119684e(7, 0)).intValue() & TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0) {
            z = true;
        }
        this.f205662d.mo72519a("settings_silence_update_mode").mo7741E(getString(z ? C0966R.string.iyw : C0966R.string.iyv));
        this.f205662d.notifyDataSetChanged();
    }

    /* renamed from: N7 */
    public final void mo97723N7() {
        int i = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SIGHTAutoLoadNetwork"), 1);
        int nullAs = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(327686, (Object) null), i);
        Log.m105925i("MicroMsg.SettingsAboutSystemUI", "auto getSightViewSummary %d, %d", Integer.valueOf(i), Integer.valueOf(nullAs));
        if (this.f205664f == -1) {
            this.f205664f = nullAs;
        }
        this.f205665g = nullAs;
        int i2 = 3 == nullAs ? C0966R.string.iza : 2 == nullAs ? C0966R.string.izc : C0966R.string.iz_;
        Preference a = this.f205662d.mo72519a("settings_sns_sight_auto_download");
        if (!(a == null || i2 == 0)) {
            a.mo7741E(getString(i2));
        }
        this.f205662d.notifyDataSetChanged();
    }

    /* renamed from: O7 */
    public final void mo97724O7() {
        NormalIconNewTipPreference normalIconNewTipPreference = (NormalIconNewTipPreference) this.f205662d.mo72519a("settings_plugins");
        C116945b.yx0().mo175770k(normalIconNewTipPreference);
        normalIconNewTipPreference.mo96254e0(this.f205662d);
        normalIconNewTipPreference.mo96252c0();
        boolean nullAs = Util.nullAs((Boolean) C86709a0.m107535s().mo121142i().mo119684e(-2046825377, (Object) null), false);
        boolean b = ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33494b(262158, 266266);
        boolean d = C116945b.wx0().mo175755d(1);
        if (!normalIconNewTipPreference.mo64138m(nullAs || b || d)) {
            if (nullAs) {
                normalIconNewTipPreference.mo101936T(0);
                normalIconNewTipPreference.f215054P = getString(C0966R.string.f360088a12);
                normalIconNewTipPreference.f215055Q = C0966R.C0969drawable.ake;
                normalIconNewTipPreference.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_NEW, true);
                return;
            }
            normalIconNewTipPreference.mo101936T(8);
            normalIconNewTipPreference.f215054P = "";
            normalIconNewTipPreference.f215055Q = -1;
            if (b || d) {
                normalIconNewTipPreference.mo96250V(0);
                normalIconNewTipPreference.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT, true);
            } else {
                normalIconNewTipPreference.mo96250V(8);
            }
            this.f205662d.notifyDataSetChanged();
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8968cp;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.ipr);
        this.f205662d = getPreferenceScreen();
        setBackBtn(new C71057a());
        this.f205662d.mo72529n("settings_swipeback_mode", !C88990b.m111196e());
        C88144b.m109788f("backup");
        mo97724O7();
        this.f205662d.mo72529n("settings_traffic_statistic", true);
        if (m83526I7()) {
            if (this.f205662d.mo72519a("settings_take_photo") != null) {
                this.f205662d.mo72519a("settings_take_photo").mo69923G(C0966R.string.iwi);
            }
        } else if (this.f205662d.mo72519a("settings_take_photo") != null) {
            this.f205662d.mo72519a("settings_take_photo").mo69923G(C0966R.string.iwh);
        }
        boolean z = C90188n0.f258933a;
        if (C88497f.m110368a() || (!BuildInfo.IS_FLAVOR_RED && !BuildInfo.IS_FLAVOR_PURPLE && !C85875k4.m106147D())) {
            this.f205662d.mo72529n("settings_dark", true);
            this.f205662d.mo72529n("small_divider", true);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f205663e = false;
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f205666h) {
            Object[] objArr = new Object[2];
            boolean z = false;
            objArr[0] = Integer.valueOf(this.f205665g);
            objArr[1] = Boolean.valueOf(this.f205664f == this.f205665g);
            Log.m105925i("MicroMsg.SettingsAboutSystemUI", "kvstat, autodownload sight change: %d, %b", objArr);
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr2 = new Object[3];
            objArr2[0] = 1;
            objArr2[1] = Integer.valueOf(this.f205665g);
            if (this.f205664f == this.f205665g) {
                z = true;
            }
            objArr2[2] = Boolean.valueOf(z);
            nVar.mo160131h(11437, objArr2);
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Preference preference2 = preference;
        String str = preference2.f121285r;
        boolean z = false;
        if (str.equals("settings_landscape_mode")) {
            Log.m105925i("MicroMsg.SettingsAboutSystemUI", "set ScreenOrientation，now is ： %s", Boolean.valueOf(getDefaultSharedPreferences().getBoolean("settings_landscape_mode", false)));
            if (getDefaultSharedPreferences().getBoolean("settings_landscape_mode", false)) {
                if (C85875k4.m106160Q() || C85875k4.m106159P()) {
                    C85811a5.m106025b(getContext());
                    C85811a5.m106028e(1);
                }
                setRequestedOrientation(-1);
            } else {
                if (C85875k4.m106160Q() || C85875k4.m106159P()) {
                    C85811a5.m106025b(getContext());
                    C85811a5.m106028e(0);
                }
                setRequestedOrientation(1);
            }
            return true;
        } else if (str.equals("settings_voicerecorder_mode")) {
            if (C107835h0.f322846c.f322747i != 1) {
                z = true;
            }
            if (!getDefaultSharedPreferences().getBoolean("settings_voicerecorder_mode", z)) {
                C76879j.m92743n(getContext(), C0966R.string.f361344j24, C0966R.string.a3h, new C30394m1(this), new C71149n1(this));
            }
            return true;
        } else if (str.equals("settings_nfc_switch")) {
            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this);
            if (defaultAdapter == null) {
                Log.m105924i("MicroMsg.SettingsAboutSystemUI", "lo-nfc-goTosetNfcSwitch phone not suppot nfc");
            } else {
                int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_NFC_OPEN_SWITCH_INT_SYNC, 0)).intValue();
                int intValue2 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_NFC_OPEN_DEFAULT_SWITCH_INT_SYNC, 0)).intValue();
                if ((intValue == 2 || (intValue == 0 && intValue2 != 1)) && !defaultAdapter.isEnabled() && getDefaultSharedPreferences().getBoolean("settings_nfc_switch", false)) {
                    mo97719J7(false);
                    C76879j.m92707A(getContext(), getString(C0966R.string.f361098h92), "", getString(C0966R.string.f361099h93), getString(C0966R.string.f7926wf), new C5366k1(this), new C5371l1(this));
                } else {
                    mo97720K7(getDefaultSharedPreferences().getBoolean("settings_nfc_switch", false));
                }
            }
            return true;
        } else if (str.equals("settings_voice_play_mode")) {
            boolean booleanValue = ((Boolean) C86709a0.m107535s().mo121142i().mo119684e(26, Boolean.FALSE)).booleanValue();
            boolean z2 = !booleanValue;
            Log.m105919d("MicroMsg.SettingsAboutSystemUI", "set voice mode from %B to %B", Boolean.valueOf(booleanValue), Boolean.valueOf(z2));
            C86709a0.m107535s().mo121142i().mo119676J(26, Boolean.valueOf(z2));
            return true;
        } else if (str.equals("settings_enter_button_send")) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f205662d.mo72519a("settings_enter_button_send");
            if (checkBoxPreference != null) {
                boolean J = checkBoxPreference.mo6804J();
                Log.m105919d("MicroMsg.SettingsAboutSystemUI", "set enter button send : %s", Boolean.valueOf(J));
                C86709a0.m107535s().mo121142i().mo119676J(66832, Boolean.valueOf(J));
            }
            return true;
        } else if (str.equals("settings_sns_sight_auto_download")) {
            AppCompatActivity context = getContext();
            C77389a aVar = new C77389a();
            aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.f7926wf);
            aVar.f225644a = C0086a.m38a(context).getString(C0966R.string.izb);
            View inflate = View.inflate(getContext(), C0966R.C0971layout.bbz, (ViewGroup) null);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.kbc);
            int nullAs = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(327686, (Object) null), Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SIGHTAutoLoadNetwork"), 1));
            C5390p1 p1Var = new C5390p1(this, linearLayout, nullAs);
            C5390p1 p1Var2 = p1Var;
            mo97718H7(linearLayout, C0966R.string.iz_, 1, 1 == nullAs, p1Var);
            mo97718H7(linearLayout, C0966R.string.izc, 2, 2 == nullAs, p1Var2);
            mo97718H7(linearLayout, C0966R.string.iza, 3, 3 == nullAs, p1Var2);
            aVar.f225627J = inflate;
            C77398g gVar2 = new C77398g(context, C0966R.style.a66);
            gVar2.mo107525e(aVar);
            linearLayout.setTag(gVar2);
            gVar2.show();
            addDialog(gVar2);
            this.f205666h = true;
            return true;
        } else if (str.equals("settings_silence_update_mode")) {
            AppCompatActivity context2 = getContext();
            C77389a aVar2 = new C77389a();
            aVar2.f225664u = C0086a.m38a(context2).getString(C0966R.string.f7926wf);
            aVar2.f225644a = C0086a.m38a(context2).getString(C0966R.string.iyu);
            View inflate2 = View.inflate(getContext(), C0966R.C0971layout.bbz, (ViewGroup) null);
            LinearLayout linearLayout2 = (LinearLayout) inflate2.findViewById(C0966R.C0970id.kbc);
            C5386o1 o1Var = new C5386o1(this, linearLayout2);
            if ((((Integer) C86709a0.m107535s().mo121142i().mo119684e(7, 0)).intValue() & TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0) {
                z = true;
            }
            LinearLayout linearLayout3 = linearLayout2;
            C5386o1 o1Var2 = o1Var;
            mo97718H7(linearLayout3, C0966R.string.iyw, 0, z, o1Var2);
            mo97718H7(linearLayout3, C0966R.string.iyv, 1, !z, o1Var2);
            aVar2.f225627J = inflate2;
            C77398g gVar3 = new C77398g(context2, C0966R.style.a66);
            gVar3.mo107525e(aVar2);
            linearLayout2.setTag(gVar3);
            gVar3.show();
            addDialog(gVar3);
            return true;
        } else if (str.equals("settings_language")) {
            Intent intent = new Intent(getContext(), SettingsLanguageUI.class);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent);
            C117292a.m165358d(this, aVar3.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetLanguage", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetLanguage", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (str.equals("settings_text_size")) {
            mo97721L7();
            return true;
        } else if (str.equals("settings_chatting_bg")) {
            Intent intent2 = new Intent();
            intent2.setClass(this, SettingsChattingBackgroundUI.class);
            AppCompatActivity context3 = getContext();
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(intent2);
            AppCompatActivity appCompatActivity = context3;
            C117292a.m165358d(appCompatActivity, aVar4.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetChattingBackground", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((Intent) aVar4.mo10231a(0));
            C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetChattingBackground", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (str.equals("settings_manage_findmoreui")) {
            Intent intent3 = new Intent();
            intent3.setClass(this, SettingsManageFindMoreV2UI.class);
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(intent3);
            C117292a.m165358d(this, aVar5.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goToManageFindMoreUI", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar5.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goToManageFindMoreUI", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (str.equals("settings_plugins")) {
            C116945b.yx0().mo175762a(32);
            C86709a0.m107535s().mo121142i().mo119676J(-2046825377, Boolean.FALSE);
            Intent intent4 = new Intent();
            intent4.setClass(this, SettingsPluginsUI.class);
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(intent4);
            C117292a.m165358d(this, aVar6.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetPlugins", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar6.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetPlugins", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33499h(262158, 266266);
            return true;
        } else {
            if (!str.equals("settings_reset")) {
                if (str.equals("settings_emoji_manager")) {
                    Intent intent5 = new Intent();
                    intent5.putExtra(String.valueOf(10931), 2);
                    C88144b.m109791i(getContext(), "emoji", ".ui.EmojiMineUI", intent5, (Bundle) null);
                    return true;
                } else if (str.equals("settngs_clean")) {
                    if (!C86709a0.m107535s().mo121147n()) {
                        C76912y0.m92771j(getContext(), (View) null);
                    } else {
                        C88144b.m109791i(getContext(), "clean", ".ui.CleanUI", new Intent(), (Bundle) null);
                    }
                    return true;
                } else if (str.equals("settings_traffic_statistic")) {
                    Intent intent6 = new Intent(this, SettingsNetStatUI.class);
                    C9556a aVar7 = new C9556a();
                    aVar7.mo10233c(intent6);
                    C117292a.m165358d(this, aVar7.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goToSetTrafficStatistic", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar7.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goToSetTrafficStatistic", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return true;
                } else if (str.equals("settings_text_size")) {
                    mo97721L7();
                    return true;
                } else if (str.equals("settings_swipeback_mode")) {
                    CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) preference2;
                    boolean a = C34575a.m40396a();
                    C76879j.m92750u(getContext(), getString(!a ? C0966R.string.izn : C0966R.string.izm), (String) null, new C30392i1(this), new C71147j1(this, checkBoxPreference2, a));
                    return true;
                } else if (str.equals("settings_take_photo")) {
                    Intent intent7 = new Intent(this, SettingsAboutCamera.class);
                    C9556a aVar8 = new C9556a();
                    aVar8.mo10233c(intent7);
                    C117292a.m165358d(this, aVar8.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar8.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (str.equalsIgnoreCase("settngs_matrix_trace")) {
                    if (!C91441c.m114729c()) {
                        C76701a.makeText((Context) this, (CharSequence) "Matrix is never installed", 0).show();
                        return false;
                    }
                    Intent intent8 = new Intent();
                    intent8.setClassName(MMApplicationContext.getContext(), "com.tencent.mm.ui.matrix.MatrixSettingUI");
                    intent8.addFlags(67108864);
                    C9556a aVar9 = new C9556a();
                    aVar9.mo10233c(intent8);
                    C117292a.m165358d(this, aVar9.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar9.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (str.equals("settings_dark")) {
                    MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("dark_mode_red_dot", false);
                    Intent intent9 = new Intent(this, SettingDarkMode.class);
                    C9556a aVar10 = new C9556a();
                    aVar10.mo10233c(intent9);
                    C117292a.m165358d(this, aVar10.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetDarkMode", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar10.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetDarkMode", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
            return false;
        }
    }

    public void onResume() {
        super.onResume();
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f205662d.mo72519a("settings_voice_play_mode");
        if (checkBoxPreference != null) {
            checkBoxPreference.mo6805K(((Boolean) C86709a0.m107535s().mo121142i().mo119684e(26, Boolean.FALSE)).booleanValue());
            checkBoxPreference.f121290w = false;
        }
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) this.f205662d.mo72519a("settings_enter_button_send");
        if (checkBoxPreference2 != null) {
            checkBoxPreference2.mo6805K(((Boolean) C86709a0.m107535s().mo121142i().mo119684e(66832, Boolean.FALSE)).booleanValue());
            checkBoxPreference2.f121290w = false;
        }
        CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) this.f205662d.mo72519a("settings_swipeback_mode");
        if (checkBoxPreference3 != null) {
            checkBoxPreference3.mo6805K(C34575a.m40396a());
            checkBoxPreference3.f121290w = false;
        }
        Preference a = this.f205662d.mo72519a("settings_language");
        if (a != null) {
            a.mo7741E(LocaleUtil.getLanguageName(getContext(), C0966R.array.f2581p, C0966R.string.f8037zz));
        }
        mo97724O7();
        mo97723N7();
        mo97723N7();
        mo97722M7();
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this);
        CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) this.f205662d.mo72519a("settings_nfc_switch");
        if (defaultAdapter == null) {
            this.f205662d.mo72529n("settings_nfc_switch", true);
        } else {
            this.f205662d.mo72529n("settings_nfc_switch", false);
            checkBoxPreference4.mo7741E(Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_NFC_OPEN_SWITCH_WORDING_STRING_SYNC, (Object) null)));
            if (this.f205663e) {
                Log.m105924i("MicroMsg.SettingsAboutSystemUI", "lo-nfc-updateNfcOpenSwitch go setSystemNfc and back");
                if (defaultAdapter.isEnabled()) {
                    mo97720K7(true);
                    mo97719J7(true);
                }
            }
            int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_NFC_OPEN_SWITCH_INT_SYNC, 0)).intValue();
            if (intValue == 0) {
                if (((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_NFC_OPEN_DEFAULT_SWITCH_INT_SYNC, 0)).intValue() == 1) {
                    mo97719J7(true);
                } else {
                    mo97719J7(false);
                }
            } else if (intValue == 1) {
                mo97719J7(true);
            } else {
                mo97719J7(false);
            }
            this.f205662d.notifyDataSetChanged();
        }
        IconPreference iconPreference = (IconPreference) this.f205662d.mo72519a("settings_dark");
        if (C85875k4.m106146C()) {
            if (C85875k4.m106149F()) {
                iconPreference.mo7741E(getString(C0966R.string.f8037zz));
            } else {
                iconPreference.mo7741E(getString(C85875k4.m106211z() ? C0966R.string.ini : C0966R.string.imp));
            }
        }
        iconPreference.mo96250V(8);
        this.f205662d.mo72529n("settngs_matrix_trace", true);
    }
}
