package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.DiscoverViewEntranceSettingStruct;
import com.tencent.p014mm.p136ui.base.preference.C73244a;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.platformtools.C96796d;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import g62.C8233m;
import gt1.C20838b;
import h81.C32735h;
import hn2.C20974j;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kr0.C76630x0;
import ky2.C10432i;
import lc3.C10485b;
import na3.C88908g;
import nc0.C76850a;
import p274xx.C15907f;
import pj3.C47510b;
import pj3.C47511g;
import sw1.C48477m;
import tc0.C77884m;
import tc0.C77885p;
import te3.C64266br1;
import u73.C14135q;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI */
public class SettingsManageFindMoreUI extends MMPreference {

    /* renamed from: q */
    public static final /* synthetic */ int f53928q = 0;

    /* renamed from: d */
    public long f53929d;

    /* renamed from: e */
    public HashMap<Integer, Integer> f53930e = new HashMap<>();

    /* renamed from: f */
    public HashMap<Integer, Integer> f53931f = new HashMap<>();

    /* renamed from: g */
    public HashMap<Integer, Integer> f53932g = new HashMap<>();

    /* renamed from: h */
    public int f53933h;

    /* renamed from: i */
    public boolean f53934i = false;

    /* renamed from: j */
    public boolean f53935j = false;

    /* renamed from: n */
    public boolean f53936n = false;

    /* renamed from: o */
    public boolean f53937o = false;

    /* renamed from: p */
    public boolean f53938p = true;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI$a */
    public class C19154a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CheckBoxPreference f53939d;

        public C19154a(SettingsManageFindMoreUI settingsManageFindMoreUI, CheckBoxPreference checkBoxPreference) {
            this.f53939d = checkBoxPreference;
        }

        public void run() {
            CheckBoxPreference checkBoxPreference = this.f53939d;
            if (checkBoxPreference != null) {
                checkBoxPreference.mo6805K(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI$b */
    public class C19155b implements C15907f.C15909b {

        /* renamed from: a */
        public final /* synthetic */ CheckBoxPreference f53940a;

        public C19155b(CheckBoxPreference checkBoxPreference) {
            this.f53940a = checkBoxPreference;
        }

        /* renamed from: a */
        public void mo6380a() {
            CheckBoxPreference checkBoxPreference = this.f53940a;
            checkBoxPreference.mo6808N(!checkBoxPreference.mo6804J());
        }

        public void onSuccess() {
            Log.m105918d("MicroMsg.SettingsManageFindMoreUI", "switchSosData checkPref.isChecked() = " + this.f53940a.mo6804J() + ", extStatus = " + C75592q0.m90781k());
            SettingsManageFindMoreUI.this.mo24570Q7(this.f53940a.mo6804J(), 2097152, 50);
            SettingsManageFindMoreUI.this.f53932g.put(3, Integer.valueOf(this.f53940a.mo6804J() ? 1 : 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI$c */
    public class C19156c implements C15907f.C15909b {

        /* renamed from: a */
        public final /* synthetic */ CheckBoxPreference f53942a;

        public C19156c(CheckBoxPreference checkBoxPreference) {
            this.f53942a = checkBoxPreference;
        }

        /* renamed from: a */
        public void mo6380a() {
            CheckBoxPreference checkBoxPreference = this.f53942a;
            checkBoxPreference.mo6808N(!checkBoxPreference.mo6804J());
        }

        public void onSuccess() {
            Log.m105918d("MicroMsg.SettingsManageFindMoreUI", "Switch miniprogram checkPref.isChecked() = " + this.f53942a.mo6804J() + ", extStatus = " + C75592q0.m90781k());
            SettingsManageFindMoreUI settingsManageFindMoreUI = SettingsManageFindMoreUI.this;
            boolean J = this.f53942a.mo6804J();
            int i = SettingsManageFindMoreUI.f53928q;
            settingsManageFindMoreUI.mo24570Q7(J, 16777216, 53);
            SettingsManageFindMoreUI.this.f53932g.put(8, Integer.valueOf(this.f53942a.mo6804J() ? 1 : 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI$d */
    public class C19157d implements C15907f.C15908a {
        public C19157d(SettingsManageFindMoreUI settingsManageFindMoreUI) {
        }

        /* renamed from: a */
        public void mo9404a() {
        }

        public void onSuccess() {
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI$e */
    public class C19158e implements C15907f.C15909b {

        /* renamed from: a */
        public final /* synthetic */ CheckBoxPreference f53944a;

        public C19158e(CheckBoxPreference checkBoxPreference) {
            this.f53944a = checkBoxPreference;
        }

        /* renamed from: a */
        public void mo6380a() {
            CheckBoxPreference checkBoxPreference = this.f53944a;
            checkBoxPreference.mo6808N(!checkBoxPreference.mo6804J());
        }

        public void onSuccess() {
            Log.m105918d("MicroMsg.SettingsManageFindMoreUI", "switchDiscoveryLooks checkPref.isChecked() = " + this.f53944a.mo6804J() + ", extStatus = " + C75592q0.m90781k());
            SettingsManageFindMoreUI.this.mo24569P7(this.f53944a.mo6804J());
            SettingsManageFindMoreUI.this.f53932g.put(10, Integer.valueOf(this.f53944a.mo6804J() ? 1 : 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI$f */
    public class C19159f implements C15907f.C15909b {

        /* renamed from: a */
        public final /* synthetic */ CheckBoxPreference f53946a;

        public C19159f(CheckBoxPreference checkBoxPreference) {
            this.f53946a = checkBoxPreference;
        }

        /* renamed from: a */
        public void mo6380a() {
            CheckBoxPreference checkBoxPreference = this.f53946a;
            checkBoxPreference.mo6808N(!checkBoxPreference.mo6804J());
        }

        public void onSuccess() {
            Log.m105918d("MicroMsg.SettingsManageFindMoreUI", "switchFinder checkPref.isChecked() = " + this.f53946a.mo6804J() + ", extStatus = " + C75592q0.m90781k());
            SettingsManageFindMoreUI.this.mo24570Q7(this.f53946a.mo6804J(), 34359738368L, 57);
            SettingsManageFindMoreUI.this.f53932g.put(11, Integer.valueOf(this.f53946a.mo6804J() ? 1 : 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI$g */
    public class C19160g implements C15907f.C15908a {

        /* renamed from: a */
        public final /* synthetic */ CheckBoxPreference f53948a;

        /* renamed from: b */
        public final /* synthetic */ int f53949b;

        /* renamed from: c */
        public final /* synthetic */ C15907f.C15908a f53950c;

        public C19160g(CheckBoxPreference checkBoxPreference, int i, C15907f.C15908a aVar) {
            this.f53948a = checkBoxPreference;
            this.f53949b = i;
            this.f53950c = aVar;
        }

        /* renamed from: a */
        public void mo9404a() {
            CheckBoxPreference checkBoxPreference = this.f53948a;
            checkBoxPreference.mo6808N(!checkBoxPreference.mo6804J());
            C15907f.C15908a aVar = this.f53950c;
            if (aVar != null) {
                aVar.mo9404a();
            }
        }

        public void onSuccess() {
            Log.m105918d("MicroMsg.SettingsManageFindMoreUI", "switchDiscoveryLooks checkPref.isChecked() = " + this.f53948a.mo6804J() + ", entrance = " + this.f53949b);
            int i = this.f53949b;
            if (i == 3) {
                SettingsManageFindMoreUI settingsManageFindMoreUI = SettingsManageFindMoreUI.this;
                CheckBoxPreference checkBoxPreference = this.f53948a;
                settingsManageFindMoreUI.mo24572S7(checkBoxPreference, checkBoxPreference.mo6804J(), false);
            } else if (i == 10) {
                SettingsManageFindMoreUI.this.mo24569P7(this.f53948a.mo6804J());
            } else if (i == 11) {
                SettingsManageFindMoreUI.this.mo24570Q7(this.f53948a.mo6804J(), 34359738368L, 57);
            } else if (i == 8) {
                SettingsManageFindMoreUI settingsManageFindMoreUI2 = SettingsManageFindMoreUI.this;
                boolean J = this.f53948a.mo6804J();
                int i2 = SettingsManageFindMoreUI.f53928q;
                settingsManageFindMoreUI2.mo24570Q7(J, 16777216, 53);
            }
            SettingsManageFindMoreUI settingsManageFindMoreUI3 = SettingsManageFindMoreUI.this;
            CheckBoxPreference checkBoxPreference2 = this.f53948a;
            int i3 = this.f53949b;
            int i4 = SettingsManageFindMoreUI.f53928q;
            settingsManageFindMoreUI3.getClass();
            boolean J2 = checkBoxPreference2.mo6804J();
            if (i3 >= 0) {
                settingsManageFindMoreUI3.f53932g.put(Integer.valueOf(i3), Integer.valueOf(J2 ? 1 : 0));
            }
            C15907f.C15908a aVar = this.f53950c;
            if (aVar != null) {
                aVar.onSuccess();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI$h */
    public class C19161h implements MenuItem.OnMenuItemClickListener {
        public C19161h() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsManageFindMoreUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI$j */
    public class C19162j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CheckBoxPreference f53953d;

        /* renamed from: e */
        public final /* synthetic */ boolean f53954e;

        /* renamed from: f */
        public final /* synthetic */ boolean f53955f;

        public C19162j(CheckBoxPreference checkBoxPreference, boolean z, boolean z2) {
            this.f53953d = checkBoxPreference;
            this.f53954e = z;
            this.f53955f = z2;
        }

        public void run() {
            CheckBoxPreference checkBoxPreference = this.f53953d;
            if (checkBoxPreference != null) {
                checkBoxPreference.mo6805K(false);
            }
            if (!this.f53954e) {
                SettingsManageFindMoreUI.this.mo24570Q7(this.f53955f, 2097152, 50);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI$i */
    public class C19163i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WeChatBrands.Business.Entries f53957d;

        public C19163i(SettingsManageFindMoreUI settingsManageFindMoreUI, WeChatBrands.Business.Entries entries) {
            this.f53957d = entries;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsManageFindMoreUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f53957d.checkAvailable(view.getContext());
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageFindMoreUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public void mo24561H7() {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SNS_ENTRY_SWITCH_INT;
        for (Integer intValue : this.f53932g.keySet()) {
            int intValue2 = intValue.intValue();
            if (this.f53931f.containsKey(Integer.valueOf(intValue2)) && this.f53931f.get(Integer.valueOf(intValue2)) != this.f53932g.get(Integer.valueOf(intValue2))) {
                C115669n.INSTANCE.mo160131h(15185, Integer.valueOf(intValue2), this.f53932g.get(Integer.valueOf(intValue2)), 1);
                if (intValue2 == 0) {
                    if (this.f53932g.get(Integer.valueOf(intValue2)).intValue() == 0) {
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, -1);
                    } else if (this.f53932g.get(Integer.valueOf(intValue2)).intValue() == 1) {
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
                    }
                }
            }
        }
    }

    /* renamed from: I7 */
    public boolean mo24562I7(long j) {
        return (j & this.f53929d) != 0;
    }

    /* renamed from: J7 */
    public boolean mo24563J7(long j) {
        return (j & ((long) this.f53933h)) == 0;
    }

    /* renamed from: K7 */
    public void mo24564K7() {
        Class cls = C10432i.class;
        ShouldShowAppBrandEntranceInFindMoreEvent shouldShowAppBrandEntranceInFindMoreEvent = new ShouldShowAppBrandEntranceInFindMoreEvent();
        shouldShowAppBrandEntranceInFindMoreEvent.f236288d.f236290a = true;
        shouldShowAppBrandEntranceInFindMoreEvent.publish();
        boolean z = shouldShowAppBrandEntranceInFindMoreEvent.f236289e.f236291a;
        boolean z2 = ((C10432i) C86312j.m106911c(cls)).mo10750e() && ((C10432i) C86312j.m106911c(cls)).mo10740Mn() == 2;
        Log.m105925i("MicroMsg.SettingsManageFindMoreUI", "shouldShowMiniProgram %s, isTeenModeAndNotAccessRight:%s", Boolean.valueOf(z), Boolean.valueOf(z2));
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_miniprogram_switch");
        checkBoxPreference.f121290w = false;
        if (!z || z2) {
            getPreferenceScreen().mo72529n("settings_miniprogram_switch", true);
        } else if (mo24562I7(16777216)) {
            checkBoxPreference.mo6805K(false);
            this.f53931f.put(8, 0);
        } else {
            checkBoxPreference.mo6805K(true);
            this.f53931f.put(8, 1);
        }
        mo24573T7(WeChatBrands.Business.Entries.MeSetDiscoveryAppbrand, "settings_miniprogram_switch");
    }

    /* renamed from: L7 */
    public void mo24565L7() {
        Class cls = C10432i.class;
        boolean sF = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();
        Log.m105925i("MicroMsg.SettingsManageFindMoreUI", "showFinder %s", Boolean.valueOf(sF));
        boolean z = ((C10432i) C86312j.m106911c(cls)).mo10750e() && ((C10432i) C86312j.m106911c(cls)).mo10740Mn() == 2;
        if (!sF || z) {
            getPreferenceScreen().mo72529n("settings_finder_switch", true);
            return;
        }
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_finder_switch");
        checkBoxPreference.f121290w = false;
        if (mo24562I7(34359738368L)) {
            checkBoxPreference.mo6805K(false);
            this.f53931f.put(11, 0);
        } else {
            checkBoxPreference.mo6805K(true);
            this.f53931f.put(11, 1);
        }
        mo24573T7(WeChatBrands.Business.Entries.MeSetDiscoveryChannels, "settings_finder_switch");
    }

    /* renamed from: M7 */
    public void mo24566M7() {
        boolean z;
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_look_switch");
        checkBoxPreference.f121290w = false;
        boolean z2 = !mo24562I7(67108864);
        if (C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null))) {
            getPreferenceScreen().mo72529n("settings_look_switch", true);
            Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "european user");
            z2 = false;
            z = false;
        } else {
            z = true;
        }
        boolean e = ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
        Log.m105925i("MicroMsg.SettingsManageFindMoreUI", "isInExperiment %s ,openLook %s, isTeenMode:%s", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(e));
        if (z && z2 && !e) {
            checkBoxPreference.mo6805K(true);
            this.f53931f.put(10, 1);
        } else if (!z || e) {
            getPreferenceScreen().mo72529n("settings_look_switch", true);
        } else {
            getPreferenceScreen().mo72529n("settings_look_switch", false);
            checkBoxPreference.mo6805K(false);
            this.f53931f.put(10, 0);
        }
        mo24573T7(WeChatBrands.Business.Entries.MeSetDiscoveryLooks, "settings_look_switch");
    }

    /* renamed from: N7 */
    public void mo24567N7() {
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_search_switch");
        checkBoxPreference.f121290w = false;
        if (mo24562I7(2097152)) {
            checkBoxPreference.mo6805K(false);
            this.f53931f.put(3, 0);
        } else {
            checkBoxPreference.mo6805K(true);
            this.f53931f.put(3, 1);
        }
        mo24573T7(WeChatBrands.Business.Entries.MeSetDiscoverySearch, "settings_search_switch");
    }

    /* renamed from: O7 */
    public final void mo24568O7(CheckBoxPreference checkBoxPreference, int i, String str, String str2, C15907f.C15908a aVar) {
        if (Util.isNullOrNil(str)) {
            str = getContext().getResources().getString(C0966R.string.mdj);
        }
        if (Util.isNullOrNil(str2)) {
            str2 = getContext().getResources().getString(C0966R.string.mdi);
        }
        C20974j.m23153g(this, str, str2, "", new C19160g(checkBoxPreference, i, aVar));
    }

    /* renamed from: P7 */
    public void mo24569P7(boolean z) {
        ((C88908g) C86312j.m106911c(C88908g.class)).o20("labs_browse", z);
        if (z) {
            this.f53929d &= -67108865;
        } else {
            this.f53929d |= 67108864;
        }
    }

    /* renamed from: Q7 */
    public void mo24570Q7(boolean z, long j, int i) {
        Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "switch ext change : open = " + z + " item value = " + j + " functionId = " + i);
        if (z) {
            this.f53929d = (~j) & this.f53929d;
        } else {
            this.f53929d = j | this.f53929d;
        }
        this.f53930e.put(Integer.valueOf(i), Integer.valueOf(z ? 1 : 2));
    }

    /* renamed from: R7 */
    public final void mo24571R7(boolean z, int i) {
        Log.m105925i("MicroMsg.SettingsManageFindMoreUI", "switch plugin flag, open %s, flag %d", Boolean.valueOf(z), Integer.valueOf(i));
        if (!z) {
            this.f53933h |= i;
        } else {
            this.f53933h &= ~i;
        }
    }

    /* renamed from: S7 */
    public void mo24572S7(CheckBoxPreference checkBoxPreference, boolean z, boolean z2) {
        if (!z) {
            if (((C14135q) C86312j.m106911c(C14135q.class)).eq0(this, new C19162j(checkBoxPreference, z2, z)) && checkBoxPreference != null) {
                MMHandlerThread.postToMainThreadDelayed(new C19154a(this, checkBoxPreference), 500);
            }
        } else if (!z2) {
            mo24570Q7(z, 2097152, 50);
        }
    }

    /* renamed from: T7 */
    public final void mo24573T7(WeChatBrands.Business.Entries entries, String str) {
        if (!entries.restricted()) {
            return;
        }
        if (entries.banned()) {
            getPreferenceScreen().mo72529n(str, true);
            return;
        }
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) getPreferenceScreen().mo72519a(str);
        checkBoxPreference.f24211K = true;
        checkBoxPreference.mo7737P();
        C19163i iVar = new C19163i(this, entries);
        checkBoxPreference.f24221V = iVar;
        View view = checkBoxPreference.f24220U;
        if (view != null) {
            view.setOnClickListener(iVar);
        }
    }

    public C73244a createAdapter(SharedPreferences sharedPreferences) {
        return new C47510b(this, getListView(), sharedPreferences);
    }

    public void finish() {
        super.finish();
        if (!(this instanceof SettingsManageFindOtherServiceUI)) {
            Class cls = C75700k0.class;
            Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "oplog extstatus:" + this.f53929d + ",pluginFlag:" + this.f53933h);
            C86709a0.m107535s().mo121142i().mo119676J(147457, Long.valueOf(this.f53929d));
            C86709a0.m107535s().mo121142i().mo119676J(34, Integer.valueOf(this.f53933h));
            for (Map.Entry next : this.f53930e.entrySet()) {
                int intValue = ((Integer) next.getKey()).intValue();
                int intValue2 = ((Integer) next.getValue()).intValue();
                C64266br1 br12 = new C64266br1();
                br12.f182324d = intValue;
                br12.f182325e = intValue2;
                ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(23, br12));
                Log.m105918d("MicroMsg.SettingsManageFindMoreUI", "switch  " + intValue + " " + intValue2);
            }
            this.f53930e.clear();
            C8233m XW = ((C75700k0) C86709a0.m107533q(cls)).mo96100XW();
            C77884m mVar = r2;
            C77884m mVar2 = new C77884m(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", this.f53933h, "", 0, "", 0);
            ((C77885p) XW).mo107993q(mVar);
        }
        mo24561H7();
    }

    public int getResourceId() {
        boolean U = C45628s0.m50756U();
        this.f53936n = U;
        return U ? C0966R.xml.f8959ce : C0966R.xml.f8957cd;
    }

    public void initView() {
        Class cls = C60200t1.class;
        Class cls2 = C10432i.class;
        setMMTitle((int) C0966R.string.iti);
        setBackBtn(new C19161h());
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_sns_switch");
        checkBoxPreference.f121290w = false;
        boolean J7 = mo24563J7(32768);
        Log.m105925i("MicroMsg.SettingsManageFindMoreUI", "openSns %s", Boolean.valueOf(J7));
        if (J7) {
            checkBoxPreference.mo6805K(true);
            this.f53931f.put(0, 1);
        } else {
            checkBoxPreference.mo6805K(false);
            this.f53931f.put(0, 0);
        }
        mo24565L7();
        Class cls3 = C20838b.class;
        boolean S5 = ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83772S5();
        Log.m105925i("MicroMsg.SettingsManageFindMoreUI", "showFinderLiveEntry %s", Boolean.valueOf(S5));
        if (((C20838b) C86312j.m106911c(cls3)).mo32539RP()) {
            getPreferenceScreen().mo72529n("settings_finder_live_switch", true);
        } else {
            getPreferenceScreen().mo72529n("settings_finder_live_above_look_switch", true);
        }
        boolean e = ((C10432i) C86312j.m106911c(cls2)).mo10750e();
        if (!S5 || e) {
            getPreferenceScreen().mo72529n("settings_finder_live_switch", true);
            getPreferenceScreen().mo72529n("settings_finder_live_above_look_switch", true);
        } else {
            CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) getPreferenceScreen().mo72519a(((C20838b) C86312j.m106911c(cls3)).Fl0());
            checkBoxPreference2.f121290w = false;
            if (mo24562I7(9007199254740992L)) {
                checkBoxPreference2.mo6805K(false);
                this.f53931f.put(13, 0);
            } else {
                checkBoxPreference2.mo6805K(true);
                this.f53931f.put(13, 1);
            }
            mo24573T7(WeChatBrands.Business.Entries.MeSetDiscoveryFinderLive, ((C20838b) C86312j.m106911c(cls3)).Fl0());
        }
        CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_scan_switch");
        checkBoxPreference3.f121290w = false;
        if (mo24562I7(1048576)) {
            checkBoxPreference3.mo6805K(false);
            this.f53931f.put(1, 0);
        } else {
            checkBoxPreference3.mo6805K(true);
            this.f53931f.put(1, 1);
        }
        mo24573T7(WeChatBrands.Business.Entries.GlobalScan, "settings_scan_switch");
        CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_shake_switch");
        checkBoxPreference4.f121290w = false;
        boolean J72 = mo24563J7(256);
        Log.m105925i("MicroMsg.SettingsManageFindMoreUI", "openShake %s", Boolean.valueOf(J72));
        if (J72) {
            checkBoxPreference4.mo6805K(true);
            this.f53931f.put(2, 1);
        } else {
            checkBoxPreference4.mo6805K(false);
            this.f53931f.put(2, 0);
        }
        mo24573T7(WeChatBrands.Business.Entries.MeSetDiscoveryShake, "settings_shake_switch");
        if (((C10432i) C86312j.m106911c(cls2)).mo10750e()) {
            getPreferenceScreen().mo72529n("settings_shake_switch", true);
        } else {
            getPreferenceScreen().mo72529n("settings_shake_switch", false);
        }
        mo24566M7();
        mo24567N7();
        if (((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83760G5()) {
            getPreferenceScreen().mo72529n("settings_nearby_switch", true);
            CheckBoxPreference checkBoxPreference5 = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_nearby_live_friend_switch");
            checkBoxPreference5.f121290w = false;
            if (((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83772S5()) {
                checkBoxPreference5.mo69924H(getContext().getResources().getString(C0966R.string.f360444cw0));
            } else {
                checkBoxPreference5.mo69924H(getContext().getResources().getString(C0966R.string.h6d));
            }
            CheckBoxPreference checkBoxPreference6 = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_nearby_live_friend_person_switch");
            checkBoxPreference6.f121290w = false;
            boolean z = !mo24562I7(70368744177664L);
            boolean J73 = mo24563J7(512);
            Log.m105925i("MicroMsg.SettingsManageFindMoreUI", "openNearbyLiveFriends:%s openNearbyLiveFriendsPerson:%s", Boolean.valueOf(z), Boolean.valueOf(J73));
            if (z) {
                checkBoxPreference5.mo6805K(true);
                this.f53931f.put(5, 1);
                getPreferenceScreen().mo72529n("settings_nearby_live_friend_person_switch", false);
            } else {
                checkBoxPreference5.mo6805K(false);
                this.f53931f.put(5, 0);
                getPreferenceScreen().mo72529n("settings_nearby_live_friend_person_switch", true);
            }
            if (J73) {
                checkBoxPreference6.mo6805K(true);
                this.f53931f.put(4, 1);
            } else {
                checkBoxPreference6.mo6805K(false);
                this.f53931f.put(4, 0);
            }
            mo24573T7(WeChatBrands.Business.Entries.MeSetDiscoveryNearbyLiveFriends, "settings_nearby_live_friend_switch");
            mo24573T7(WeChatBrands.Business.Entries.MeSetDiscoveryNearbyLiveFriendsPerson, "settings_nearby_live_friend_person_switch");
            if (((C10432i) C86312j.m106911c(cls2)).mo10750e()) {
                getPreferenceScreen().mo72529n("settings_nearby_live_friend_switch", true);
                getPreferenceScreen().mo72529n("settings_nearby_live_friend_person_switch", true);
            } else {
                getPreferenceScreen().mo72529n("settings_nearby_live_friend_switch", false);
            }
        } else {
            getPreferenceScreen().mo72529n("settings_nearby_live_friend_switch", true);
            getPreferenceScreen().mo72529n("settings_nearby_live_friend_person_switch", true);
            CheckBoxPreference checkBoxPreference7 = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_nearby_switch");
            checkBoxPreference7.f121290w = false;
            boolean J74 = mo24563J7(512);
            Log.m105925i("MicroMsg.SettingsManageFindMoreUI", "openNearby %s", Boolean.valueOf(J74));
            if (J74) {
                checkBoxPreference7.mo6805K(true);
                this.f53931f.put(4, 1);
            } else {
                checkBoxPreference7.mo6805K(false);
                this.f53931f.put(4, 0);
            }
            mo24573T7(WeChatBrands.Business.Entries.MeSetDiscoveryNearby, "settings_nearby_switch");
            if (((C10432i) C86312j.m106911c(cls2)).mo10750e()) {
                getPreferenceScreen().mo72529n("settings_nearby_switch", true);
            } else {
                getPreferenceScreen().mo72529n("settings_nearby_switch", false);
            }
        }
        C96796d.C96797a a = C96796d.m124292a();
        boolean z2 = a != null && a.mo134444UX();
        Log.m105925i("MicroMsg.SettingsManageFindMoreUI", "showShopping %s", Boolean.valueOf(z2));
        boolean e2 = ((C10432i) C86312j.m106911c(cls2)).mo10750e();
        CheckBoxPreference checkBoxPreference8 = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_shopping_switch");
        checkBoxPreference8.f121290w = false;
        if (!z2 || e2) {
            getPreferenceScreen().mo72529n("settings_shopping_switch", true);
        } else {
            getPreferenceScreen().mo72529n("settings_shopping_switch", false);
        }
        if (mo24562I7(4194304)) {
            checkBoxPreference8.mo6805K(false);
            this.f53931f.put(6, 0);
        } else {
            checkBoxPreference8.mo6805K(true);
            this.f53931f.put(6, 1);
        }
        mo24573T7(WeChatBrands.Business.Entries.MeSetDiscoveryShop, "settings_shopping_switch");
        C48477m a2 = C48477m.C13789a.m13091a();
        CheckBoxPreference checkBoxPreference9 = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_game_switch");
        checkBoxPreference9.f121290w = false;
        boolean e3 = ((C10432i) C86312j.m106911c(cls2)).mo10750e();
        if (a2 == null || !a2.ju0(this) || e3) {
            getPreferenceScreen().mo72529n("settings_game_switch", true);
        } else if (mo24562I7(8388608)) {
            checkBoxPreference9.mo6805K(false);
            this.f53931f.put(7, 0);
        } else {
            checkBoxPreference9.mo6805K(true);
            this.f53931f.put(7, 1);
        }
        mo24573T7(WeChatBrands.Business.Entries.MeSetDiscoveryGame, "settings_game_switch");
        mo24564K7();
        CheckBoxPreference checkBoxPreference10 = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_wechatout_switch");
        boolean z3 = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("WCOEntranceSwitch", 0) > 0;
        Log.m105925i("MicroMsg.SettingsManageFindMoreUI", "showWeChatOut %s", Boolean.valueOf(z3));
        if (z3) {
            checkBoxPreference10.f121290w = false;
            if (mo24562I7(33554432)) {
                checkBoxPreference10.mo6805K(false);
                this.f53931f.put(9, 0);
            } else {
                checkBoxPreference10.mo6805K(true);
                this.f53931f.put(9, 1);
            }
        } else {
            getPreferenceScreen().mo72529n("settings_wechatout_switch", true);
        }
        mo24573T7(WeChatBrands.Business.Entries.MeSetDiscoveryWeChatOut, "settings_wechatout_switch");
        if (C45628s0.m50756U()) {
            getPreferenceScreen().mo72529n("settings_switch_bottom_tip", true);
        }
        getPreferenceScreen().notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f53935j = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("ExtFunctionSwitchEntry", 0) == 1;
        this.f53934i = C75592q0.m90762J().booleanValue();
        Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "onCreate isShowWechatUserDialog = " + this.f53935j + "， isOverseaNewUser = " + this.f53934i);
        this.f53929d = C75592q0.m90781k();
        this.f53936n = C45628s0.m50756U();
        String currentLanguage = LocaleUtil.getCurrentLanguage(this);
        if ("zh_CN".equals(currentLanguage) || "zh_HK".equals(currentLanguage) || "zh_TW".equals(currentLanguage)) {
            this.f53937o = true;
        } else {
            this.f53937o = false;
        }
        this.f53933h = C75592q0.m90785o();
        Log.m105925i("MicroMsg.SettingsManageFindMoreUI", "onCreate extStatus %d, pluginFlag %d", Long.valueOf(this.f53929d), Integer.valueOf(this.f53933h));
        initView();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        Preference preference2 = preference;
        Class cls = C32735h.class;
        if (!(preference2 instanceof CheckBoxPreference)) {
            return true;
        }
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preference2;
        String str = preference2.f121285r;
        Log.m105925i("MicroMsg.SettingsManageFindMoreUI", "click pref key %s", str);
        if (str.equals("settings_sns_switch")) {
            mo24571R7(checkBoxPreference.mo6804J(), 32768);
            z = false;
            i = 0;
        } else if (!str.equals("settings_scan_switch")) {
            if (!str.equals("settings_search_switch")) {
                if (str.equals("settings_shopping_switch")) {
                    if (!WeChatBrands.Business.Entries.MeSetDiscoveryShop.checkAvailable(this)) {
                        return true;
                    }
                    i2 = 6;
                    mo24570Q7(checkBoxPreference.mo6804J(), 4194304, 51);
                } else if (str.equals("settings_game_switch")) {
                    if (!WeChatBrands.Business.Entries.MeSetDiscoveryGame.checkAvailable(this)) {
                        return true;
                    }
                    i2 = 7;
                    mo24570Q7(checkBoxPreference.mo6804J(), 8388608, 52);
                    C115669n.INSTANCE.idkeyStat(848, checkBoxPreference.mo6804J() ? 0 : 1, 1, false);
                } else if (str.equals("settings_miniprogram_switch")) {
                    if (!WeChatBrands.Business.Entries.MeSetDiscoveryAppbrand.checkAvailable(this)) {
                        return true;
                    }
                    boolean z4 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_oversea_close_service_dialog_enable, 0) == 1;
                    if (this.f53936n && this.f53935j && checkBoxPreference.mo6804J()) {
                        C20974j.m23154h(this, 16777216, checkBoxPreference, new C19156c(checkBoxPreference), 2);
                    } else if (!this.f53936n || !this.f53935j || !z4 || checkBoxPreference.mo6804J()) {
                        i2 = 8;
                        mo24570Q7(checkBoxPreference.mo6804J(), 16777216, 53);
                        if (!checkBoxPreference.mo6804J()) {
                            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo0();
                        }
                    } else {
                        mo24568O7(checkBoxPreference, 8, getContext().getResources().getString(C0966R.string.mid), getContext().getResources().getString(C0966R.string.mic), new C19157d(this));
                        z = true;
                        i = 8;
                    }
                } else if (str.equals("settings_wechatout_switch")) {
                    if (!WeChatBrands.Business.Entries.MeSetDiscoveryWeChatOut.checkAvailable(this)) {
                        return true;
                    }
                    i2 = 9;
                    mo24570Q7(checkBoxPreference.mo6804J(), 33554432, 54);
                } else if (str.equals("settings_shake_switch")) {
                    if (!WeChatBrands.Business.Entries.MeSetDiscoveryShake.checkAvailable(this)) {
                        return true;
                    }
                    i2 = 2;
                    mo24571R7(checkBoxPreference.mo6804J(), 256);
                } else if (str.equals("settings_nearby_switch")) {
                    if (!WeChatBrands.Business.Entries.MeSetDiscoveryNearby.checkAvailable(this)) {
                        return true;
                    }
                    i2 = 4;
                    mo24571R7(checkBoxPreference.mo6804J(), 512);
                } else if (str.equals("settings_nearby_live_friend_switch")) {
                    if (!WeChatBrands.Business.Entries.MeSetDiscoveryNearbyLiveFriends.checkAvailable(this)) {
                        return true;
                    }
                    mo24570Q7(checkBoxPreference.mo6804J(), 70368744177664L, 61);
                    getPreferenceScreen().mo72529n("settings_nearby_live_friend_person_switch", !checkBoxPreference.mo6804J());
                    long j = checkBoxPreference.mo6804J() ? 1 : 0;
                    DiscoverViewEntranceSettingStruct discoverViewEntranceSettingStruct = new DiscoverViewEntranceSettingStruct();
                    discoverViewEntranceSettingStruct.f48274d = 12;
                    discoverViewEntranceSettingStruct.f48275e = j;
                    discoverViewEntranceSettingStruct.f48276f = 1;
                    discoverViewEntranceSettingStruct.mo86054n();
                    Log.m105924i("FindMoreSettingReport", "reportSwitch " + discoverViewEntranceSettingStruct.mo1006q());
                    i2 = 5;
                } else if (str.equals("settings_nearby_live_friend_person_switch")) {
                    if (!WeChatBrands.Business.Entries.MeSetDiscoveryNearbyLiveFriendsPerson.checkAvailable(this)) {
                        return true;
                    }
                    mo24571R7(checkBoxPreference.mo6804J(), 512);
                    long j2 = checkBoxPreference.mo6804J() ? 1 : 0;
                    DiscoverViewEntranceSettingStruct discoverViewEntranceSettingStruct2 = new DiscoverViewEntranceSettingStruct();
                    discoverViewEntranceSettingStruct2.f48274d = 13;
                    discoverViewEntranceSettingStruct2.f48275e = j2;
                    discoverViewEntranceSettingStruct2.f48276f = 1;
                    discoverViewEntranceSettingStruct2.mo86054n();
                    Log.m105924i("FindMoreSettingReport", "reportSwitch " + discoverViewEntranceSettingStruct2.mo1006q());
                    i2 = 12;
                } else if (str.equals("settings_look_switch")) {
                    if (!WeChatBrands.Business.Entries.MeSetDiscoveryLooks.checkAvailable(this)) {
                        return true;
                    }
                    if (!this.f53936n || !this.f53935j || !checkBoxPreference.mo6804J()) {
                        if (this.f53938p || !this.f53936n || !this.f53935j || checkBoxPreference.mo6804J()) {
                            mo24569P7(checkBoxPreference.mo6804J());
                            z3 = false;
                        } else {
                            mo24568O7(checkBoxPreference, 10, getContext().getResources().getString(C0966R.string.mdj), getContext().getResources().getString(C0966R.string.mdi), (C15907f.C15908a) null);
                            z3 = true;
                        }
                        i = 10;
                    } else {
                        C20974j.m23154h(this, 67108864, checkBoxPreference, new C19158e(checkBoxPreference), 2);
                    }
                } else if (str.equals("settings_finder_switch")) {
                    if (!WeChatBrands.Business.Entries.MeSetDiscoveryChannels.checkAvailable(this)) {
                        return true;
                    }
                    boolean z5 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_oversea_close_service_dialog_enable, 1) == 1;
                    if (!this.f53936n || !this.f53935j || !checkBoxPreference.mo6804J()) {
                        if (!this.f53936n || !this.f53935j || !z5 || checkBoxPreference.mo6804J()) {
                            mo24570Q7(checkBoxPreference.mo6804J(), 34359738368L, 57);
                            z2 = false;
                        } else {
                            mo24568O7(checkBoxPreference, 11, getContext().getResources().getString(C0966R.string.n58), getContext().getResources().getString(C0966R.string.n57), (C15907f.C15908a) null);
                            z2 = true;
                        }
                        i = 11;
                    } else {
                        C20974j.m23154h(this, 34359738368L, checkBoxPreference, new C19159f(checkBoxPreference), 2);
                    }
                } else if (str.equals(((C20838b) C86312j.m106911c(C20838b.class)).Fl0())) {
                    if (!WeChatBrands.Business.Entries.MeSetDiscoveryFinderLive.checkAvailable(this)) {
                        return true;
                    }
                    mo24570Q7(checkBoxPreference.mo6804J(), 9007199254740992L, 65);
                    Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "switch finderlive 65");
                    long j3 = checkBoxPreference.mo6804J() ? 1 : 0;
                    DiscoverViewEntranceSettingStruct discoverViewEntranceSettingStruct3 = new DiscoverViewEntranceSettingStruct();
                    discoverViewEntranceSettingStruct3.f48274d = 14;
                    discoverViewEntranceSettingStruct3.f48275e = j3;
                    discoverViewEntranceSettingStruct3.f48276f = 1;
                    discoverViewEntranceSettingStruct3.mo86054n();
                    Log.m105924i("FindMoreSettingReport", "reportSwitch " + discoverViewEntranceSettingStruct3.mo1006q());
                    i2 = 13;
                }
                i = i2;
                z = false;
            } else if (!WeChatBrands.Business.Entries.MeSetDiscoverySearch.checkAvailable(this)) {
                return true;
            } else {
                if (!this.f53936n || !this.f53935j || !checkBoxPreference.mo6804J()) {
                    if (!this.f53936n || !this.f53935j || checkBoxPreference.mo6804J()) {
                        mo24572S7(checkBoxPreference, checkBoxPreference.mo6804J(), false);
                        z = false;
                    } else {
                        mo24568O7(checkBoxPreference, 3, getContext().getResources().getString(C0966R.string.n5_), getContext().getResources().getString(C0966R.string.n59), (C15907f.C15908a) null);
                        z = true;
                    }
                    i = 3;
                } else {
                    C20974j.m23154h(this, 2097152, checkBoxPreference, new C19155b(checkBoxPreference), 2);
                }
            }
            i2 = -1;
            i = i2;
            z = false;
        } else if (!WeChatBrands.Business.Entries.GlobalScan.checkAvailable(this)) {
            return true;
        } else {
            mo24570Q7(checkBoxPreference.mo6804J(), 1048576, 49);
            z = false;
            i = 1;
        }
        Log.m105921e("MicroMsg.SettingsManageFindMoreUI", "needShowCloseSwitchDilaogTips = %s", Boolean.valueOf(z));
        if (!z) {
            boolean J = checkBoxPreference.mo6804J();
            if (i >= 0) {
                this.f53932g.put(Integer.valueOf(i), Integer.valueOf(J ? 1 : 0));
            }
        }
        return true;
    }
}
