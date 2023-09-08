package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import di3.C86312j;
import hn2.C20974j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import nj3.C76879j;
import p629ny.C76979h;
import pj3.C47511g;
import te3.C52238za0;
import xm2.C23109g;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI */
public class SettingsManageFindOtherServiceUI extends SettingsManageFindMoreUI {

    /* renamed from: v */
    public static final /* synthetic */ int f53965v = 0;

    /* renamed from: r */
    public HashMap<Integer, Integer> f53966r = new HashMap<>();

    /* renamed from: s */
    public View f53967s;

    /* renamed from: t */
    public Button f53968t;

    /* renamed from: u */
    public TextView f53969u;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI$a */
    public class C19167a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI$a$a */
        public class C19168a implements DialogInterface.OnClickListener {
            public C19168a(C19167a aVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI$a$b */
        public class C19169b implements DialogInterface.OnClickListener {
            public C19169b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                long j;
                SettingsManageFindOtherServiceUI settingsManageFindOtherServiceUI = SettingsManageFindOtherServiceUI.this;
                int i2 = SettingsManageFindOtherServiceUI.f53965v;
                settingsManageFindOtherServiceUI.getClass();
                Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "doSave.");
                long j2 = 0;
                long j3 = 0;
                for (Integer intValue : settingsManageFindOtherServiceUI.f53931f.keySet()) {
                    int intValue2 = intValue.intValue();
                    if (intValue2 == 3) {
                        if (settingsManageFindOtherServiceUI.getPreferenceScreen().mo72522f("settings_search_switch")) {
                            j = 2097152;
                        }
                    } else if (intValue2 == 10) {
                        if (settingsManageFindOtherServiceUI.getPreferenceScreen().mo72522f("settings_look_switch")) {
                            j = 67108864;
                        }
                    } else if (intValue2 == 11) {
                        if (settingsManageFindOtherServiceUI.getPreferenceScreen().mo72522f("settings_finder_switch")) {
                            j = 34359738368L;
                        }
                    } else if (intValue2 == 8 && settingsManageFindOtherServiceUI.getPreferenceScreen().mo72522f("settings_miniprogram_switch")) {
                        j = 16777216;
                    }
                    j2 |= j;
                    j3 |= j;
                }
                Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "doSave. switchValue = " + j3 + ", WhichExtFunctionSwitch= " + j2);
                C20974j.m23147a(settingsManageFindOtherServiceUI, 1, 2, j2, j3, new C19185l2(settingsManageFindOtherServiceUI));
            }
        }

        public C19167a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsManageFindOtherServiceUI settingsManageFindOtherServiceUI = SettingsManageFindOtherServiceUI.this;
            C76879j.m92707A(settingsManageFindOtherServiceUI, settingsManageFindOtherServiceUI.getString(C0966R.string.iox), (String) null, SettingsManageFindOtherServiceUI.this.getString(C0966R.string.ioy), SettingsManageFindOtherServiceUI.this.getString(C0966R.string.iow), new C19168a(this), new C19169b());
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI$b */
    public class C19170b implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI$b$a */
        public class C19171a implements C19175c {

            /* renamed from: a */
            public final /* synthetic */ long f53973a;

            /* renamed from: b */
            public final /* synthetic */ long f53974b;

            /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI$b$a$a */
            public class C19172a implements C23109g {

                /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI$b$a$a$a */
                public class C19173a implements Runnable {
                    public C19173a() {
                    }

                    public void run() {
                        C20974j.m23158l(SettingsManageFindOtherServiceUI.this);
                    }
                }

                public C19172a() {
                }

                /* renamed from: a */
                public void mo24594a(Context context, boolean z, C52238za0 za02) {
                    boolean z2;
                    if (za02 == null || !z) {
                        Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "showTipDialog, response no.");
                        C20974j.m23157k(SettingsManageFindOtherServiceUI.this);
                        return;
                    }
                    Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "showTipDialog, response yes.");
                    long currentTimeMillis = System.currentTimeMillis();
                    SettingsManageFindOtherServiceUI settingsManageFindOtherServiceUI = SettingsManageFindOtherServiceUI.this;
                    settingsManageFindOtherServiceUI.f53968t.postDelayed(new C19187m2(settingsManageFindOtherServiceUI), 1000);
                    Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "showTipDialog time = " + (System.currentTimeMillis() - currentTimeMillis));
                    SettingsManageFindOtherServiceUI settingsManageFindOtherServiceUI2 = SettingsManageFindOtherServiceUI.this;
                    Iterator<Integer> it = settingsManageFindOtherServiceUI2.f53931f.keySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z2 = false;
                            break;
                        }
                        int intValue = it.next().intValue();
                        z2 = true;
                        if (intValue != 3) {
                            if (intValue != 10) {
                                if (intValue == 11 && settingsManageFindOtherServiceUI2.getPreferenceScreen().mo72522f("settings_finder_switch") && ((CheckBoxPreference) settingsManageFindOtherServiceUI2.getPreferenceScreen().mo72519a("settings_finder_switch")).mo6804J()) {
                                    break;
                                }
                            } else if (settingsManageFindOtherServiceUI2.getPreferenceScreen().mo72522f("settings_look_switch") && ((CheckBoxPreference) settingsManageFindOtherServiceUI2.getPreferenceScreen().mo72519a("settings_look_switch")).mo6804J()) {
                                break;
                            }
                        } else if (settingsManageFindOtherServiceUI2.getPreferenceScreen().mo72522f("settings_search_switch") && ((CheckBoxPreference) settingsManageFindOtherServiceUI2.getPreferenceScreen().mo72519a("settings_search_switch")).mo6804J()) {
                            break;
                        }
                    }
                    if (z2) {
                        SettingsManageFindOtherServiceUI.this.f53968t.postDelayed(new C19173a(), 500);
                    }
                }
            }

            public C19171a(long j, long j2) {
                this.f53973a = j;
                this.f53974b = j2;
            }

            /* renamed from: a */
            public void mo24593a(boolean z) {
                if (z) {
                    Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "showTipDialog, yes.");
                    C20974j.m23147a(SettingsManageFindOtherServiceUI.this, 1, 1, this.f53973a, this.f53974b, new C19172a());
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI$b$b */
        public class C19174b implements C23109g {
            public C19174b() {
            }

            /* renamed from: a */
            public void mo24594a(Context context, boolean z, C52238za0 za02) {
                if (za02 == null || !z) {
                    Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "doSave. response = no");
                    SettingsManageFindOtherServiceUI.this.finish();
                    return;
                }
                Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "doSave. response = yes");
                SettingsManageFindOtherServiceUI settingsManageFindOtherServiceUI = SettingsManageFindOtherServiceUI.this;
                settingsManageFindOtherServiceUI.f53968t.postDelayed(new C19187m2(settingsManageFindOtherServiceUI), 1000);
            }
        }

        public C19170b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsManageFindOtherServiceUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            long j = 0;
            long j2 = 0;
            boolean z = false;
            for (Integer intValue : SettingsManageFindOtherServiceUI.this.f53931f.keySet()) {
                int intValue2 = intValue.intValue();
                if (intValue2 == 3) {
                    CheckBoxPreference checkBoxPreference = (CheckBoxPreference) SettingsManageFindOtherServiceUI.this.getPreferenceScreen().mo72519a("settings_search_switch");
                    if (SettingsManageFindOtherServiceUI.this.getPreferenceScreen().mo72522f("settings_search_switch")) {
                        j |= 2097152;
                        if (!checkBoxPreference.mo6804J()) {
                            j2 |= 2097152;
                        } else {
                            z = true;
                        }
                        Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "finishBtn, settings_search_switch " + checkBoxPreference.mo6804J());
                    }
                } else if (intValue2 == 10) {
                    if (SettingsManageFindOtherServiceUI.this.getPreferenceScreen().mo72522f("settings_look_switch")) {
                        j |= 67108864;
                        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) SettingsManageFindOtherServiceUI.this.getPreferenceScreen().mo72519a("settings_look_switch");
                        if (!checkBoxPreference2.mo6804J()) {
                            j2 |= 67108864;
                        } else {
                            z = true;
                        }
                        Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "finishBtn, settings_look_switch " + checkBoxPreference2.mo6804J());
                    }
                } else if (intValue2 == 11) {
                    if (SettingsManageFindOtherServiceUI.this.getPreferenceScreen().mo72522f("settings_finder_switch")) {
                        j |= 34359738368L;
                        CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) SettingsManageFindOtherServiceUI.this.getPreferenceScreen().mo72519a("settings_finder_switch");
                        if (!checkBoxPreference3.mo6804J()) {
                            j2 |= 34359738368L;
                        } else {
                            z = true;
                        }
                        Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "finishBtn, settings_finder_switch = " + checkBoxPreference3.mo6804J());
                    }
                } else if (intValue2 == 8 && SettingsManageFindOtherServiceUI.this.getPreferenceScreen().mo72522f("settings_miniprogram_switch")) {
                    j |= 16777216;
                    CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) SettingsManageFindOtherServiceUI.this.getPreferenceScreen().mo72519a("settings_miniprogram_switch");
                    if (!checkBoxPreference4.mo6804J()) {
                        j2 |= 16777216;
                    } else {
                        z = true;
                    }
                    Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "finishBtn, settings_miniprogram_switch = " + checkBoxPreference4.mo6804J());
                }
            }
            Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "finishBtn, switchValue = " + j2 + ", WhichExtFunctionSwitch = " + j + ", hasOpen = " + z);
            if (z) {
                SettingsManageFindOtherServiceUI settingsManageFindOtherServiceUI = SettingsManageFindOtherServiceUI.this;
                C20974j.m23156j(settingsManageFindOtherServiceUI, settingsManageFindOtherServiceUI.getString(C0966R.string.f361270in0), new C19171a(j, j2), false);
            } else {
                C20974j.m23147a(SettingsManageFindOtherServiceUI.this, 1, 2, j, j2, new C19174b());
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageFindOtherServiceUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI$c */
    public interface C19175c {
        /* renamed from: a */
        void mo24593a(boolean z);
    }

    /* renamed from: H7 */
    public void mo24561H7() {
        Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "doReport.");
        for (Integer intValue : this.f53966r.keySet()) {
            int intValue2 = intValue.intValue();
            CheckBoxPreference checkBoxPreference = null;
            if (intValue2 == 3) {
                if (getPreferenceScreen().mo72522f("settings_search_switch")) {
                    checkBoxPreference = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_search_switch");
                }
            } else if (intValue2 == 10) {
                if (getPreferenceScreen().mo72522f("settings_look_switch")) {
                    checkBoxPreference = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_look_switch");
                }
            } else if (intValue2 == 11) {
                if (getPreferenceScreen().mo72522f("settings_finder_switch")) {
                    checkBoxPreference = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_finder_switch");
                }
            } else if (intValue2 == 8 && getPreferenceScreen().mo72522f("settings_miniprogram_switch")) {
                checkBoxPreference = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_miniprogram_switch");
            }
            Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "doReport. oldDefaultState.get(entrance) = " + this.f53966r.get(Integer.valueOf(intValue2)) + ", checkBoxPreference.isChecked() = " + checkBoxPreference.mo6804J());
            if (this.f53966r.get(Integer.valueOf(intValue2)).intValue() != checkBoxPreference.mo6804J()) {
                C115669n.INSTANCE.mo160131h(15185, Integer.valueOf(intValue2), Integer.valueOf(checkBoxPreference.mo6804J() ? 1 : 0), 1);
            }
        }
    }

    /* renamed from: K7 */
    public void mo24564K7() {
        CheckBoxPreference checkBoxPreference;
        super.mo24564K7();
        if (this.f53931f.containsKey(8)) {
            this.f53966r.put(8, this.f53931f.get(8));
        }
        if (this.f53934i && getPreferenceScreen().mo72522f("settings_miniprogram_switch") && (checkBoxPreference = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_miniprogram_switch")) != null) {
            if (this.f53937o) {
                checkBoxPreference.mo6805K(true);
                this.f53931f.put(11, 1);
                return;
            }
            checkBoxPreference.mo6805K(false);
            this.f53931f.put(11, 0);
        }
    }

    /* renamed from: L7 */
    public void mo24565L7() {
        CheckBoxPreference checkBoxPreference;
        super.mo24565L7();
        if (this.f53931f.containsKey(11)) {
            this.f53966r.put(11, this.f53931f.get(11));
        }
        if (this.f53934i && getPreferenceScreen().mo72522f("settings_finder_switch") && (checkBoxPreference = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_finder_switch")) != null) {
            if (this.f53937o) {
                checkBoxPreference.mo6805K(true);
                this.f53931f.put(11, 1);
                return;
            }
            checkBoxPreference.mo6805K(false);
            this.f53931f.put(11, 0);
        }
    }

    /* renamed from: M7 */
    public void mo24566M7() {
        CheckBoxPreference checkBoxPreference;
        super.mo24566M7();
        if (this.f53931f.containsKey(10)) {
            this.f53966r.put(10, this.f53931f.get(10));
        }
        if (this.f53934i && getPreferenceScreen().mo72522f("settings_look_switch") && (checkBoxPreference = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_look_switch")) != null) {
            if (this.f53937o) {
                checkBoxPreference.mo6805K(true);
                this.f53931f.put(10, 1);
                return;
            }
            checkBoxPreference.mo6805K(false);
            this.f53931f.put(10, 0);
        }
    }

    /* renamed from: N7 */
    public void mo24567N7() {
        CheckBoxPreference checkBoxPreference;
        super.mo24567N7();
        if (this.f53931f.containsKey(3)) {
            this.f53966r.put(3, this.f53931f.get(3));
        }
        if (this.f53934i && getPreferenceScreen().mo72522f("settings_search_switch") && (checkBoxPreference = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_search_switch")) != null) {
            if (this.f53937o) {
                checkBoxPreference.mo6805K(true);
                this.f53931f.put(3, 1);
                return;
            }
            checkBoxPreference.mo6805K(false);
            this.f53931f.put(3, 0);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bwx;
    }

    public int getResourceId() {
        return C0966R.xml.f8956cc;
    }

    public void initView() {
        setBackBtn(new C19167a(), C0966R.raw.actionbar_icon_close_black);
        View findViewById = findViewById(C0966R.C0970id.gv5);
        this.f53967s = findViewById;
        findViewById.setBackgroundColor(getResources().getColor(C0966R.color.al8));
        this.f53968t = (Button) findViewById(C0966R.C0970id.e9q);
        this.f53969u = (TextView) findViewById(C0966R.C0970id.hu9);
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        ArrayList arrayList = new ArrayList();
        if ("zh_CN".equals(LocaleUtil.getCurrentLanguage(this))) {
            arrayList.add(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fll) + "/cgi-bin/micromsg-bin/oshelpcenter?opcode=2&lang=zh_CN&plat=android&pid=1002060&id=180514qe7zqb180514ea6rff&Channel=helpcenter");
        } else {
            arrayList.add(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fll) + "/cgi-bin/micromsg-bin/oshelpcenter?opcode=2&lang=en&plat=android&pid=1003432&id=180323j2ynmi180323afvrzj&Channel=helpcenter");
        }
        String charSequence = this.f53969u.getText().toString();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(getString(C0966R.string.f361286ip1));
        hVar.mo107047GG(this, arrayList, charSequence, arrayList2, this.f53969u);
        this.f53968t.setOnClickListener(new C19170b());
        mo24565L7();
        mo24566M7();
        mo24567N7();
        mo24564K7();
        getPreferenceScreen().notifyDataSetChanged();
        setActionbarColor(getContext().getResources().getColor(C0966R.color.al8));
        hideActionbarLine();
        setMMTitle("");
        this.mController.mo177105z0(getResources().getColor(C0966R.color.al8));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (!(preference instanceof CheckBoxPreference)) {
            return true;
        }
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preference;
        String str = preference.f121285r;
        Log.m105925i("MicroMsg.SettingsManageFindMoreUI", "click pref key %s", str);
        int i = -1;
        if (str.equals("settings_search_switch")) {
            if (!WeChatBrands.Business.Entries.MeSetDiscoverySearch.checkAvailable(this)) {
                return true;
            }
            i = 3;
            mo24572S7(checkBoxPreference, checkBoxPreference.mo6804J(), true);
        } else if (str.equals("settings_look_switch")) {
            if (!WeChatBrands.Business.Entries.MeSetDiscoveryLooks.checkAvailable(this)) {
                return true;
            }
            i = 10;
        } else if (str.equals("settings_finder_switch")) {
            if (!WeChatBrands.Business.Entries.MeSetDiscoveryChannels.checkAvailable(this)) {
                return true;
            }
            i = 11;
        } else if (str.equals("settings_miniprogram_switch")) {
            if (!WeChatBrands.Business.Entries.MeSetDiscoveryAppbrand.checkAvailable(this)) {
                return true;
            }
            i = 8;
        }
        boolean J = checkBoxPreference.mo6804J();
        if (i >= 0) {
            this.f53932g.put(Integer.valueOf(i), Integer.valueOf(J ? 1 : 0));
        }
        return true;
    }
}
