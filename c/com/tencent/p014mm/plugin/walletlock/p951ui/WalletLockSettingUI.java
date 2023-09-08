package com.tencent.p014mm.plugin.walletlock.p951ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import b73.C28273c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WalletLockProtectEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceTitleCategory;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.walletlock.model.C106559h;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.soter.core.biometric.BiometricManagerCompat;
import di3.C86312j;
import e73.C107243a;
import f40.C86709a0;
import g73.C107759d;
import g73.C107761f;
import h81.C32735h;
import kg3.C76577a;
import lc3.C10485b;
import lt3.C21460a;
import nj3.C76879j;
import p910lj.C76701a;
import pj3.C47511g;
import pt3.C110247f;
import pv2.C77292s;
import qo3.C77398g;
import rt3.C22252b;

/* renamed from: com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI */
public class WalletLockSettingUI extends MMPreference {

    /* renamed from: t */
    public static final /* synthetic */ int f318391t = 0;

    /* renamed from: d */
    public C47511g f318392d;

    /* renamed from: e */
    public IconPreference f318393e;

    /* renamed from: f */
    public IconPreference f318394f;

    /* renamed from: g */
    public IconPreference f318395g;

    /* renamed from: h */
    public IconPreference f318396h;

    /* renamed from: i */
    public C77398g f318397i;

    /* renamed from: j */
    public int f318398j = -1;

    /* renamed from: n */
    public int f318399n = 0;

    /* renamed from: o */
    public boolean f318400o = false;

    /* renamed from: p */
    public boolean f318401p = true;

    /* renamed from: q */
    public boolean f318402q = true;

    /* renamed from: r */
    public boolean f318403r = true;

    /* renamed from: s */
    public IListener<WalletLockProtectEvent> f318404s = new IListener<WalletLockProtectEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1842411039;
        }

        public boolean callback(IEvent iEvent) {
            if (((WalletLockProtectEvent) iEvent).f310017d.f310019a != 6) {
                return false;
            }
            WalletLockSettingUI.this.finish();
            return false;
        }
    };

    /* renamed from: com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI$a */
    public class C106563a implements MenuItem.OnMenuItemClickListener {
        public C106563a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletLockSettingUI walletLockSettingUI = WalletLockSettingUI.this;
            if (walletLockSettingUI.f318400o) {
                walletLockSettingUI.mo153265H7(0, 4, "user cancel setting wallet lock");
            } else {
                walletLockSettingUI.finish();
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI$b */
    public class C106564b implements Runnable {
        public C106564b(WalletLockSettingUI walletLockSettingUI) {
        }

        public void run() {
            try {
                C22252b.m25809f(3);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WalletLockSettingUI", "Remove AK after open gesture lock failed! " + e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI$c */
    public class C106565c implements DialogInterface.OnClickListener {
        public C106565c(WalletLockSettingUI walletLockSettingUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: H7 */
    public final void mo153265H7(int i, int i2, String str) {
        Intent intent = new Intent();
        intent.putExtra("key_err_code", i2);
        intent.putExtra("key_err_msg", str);
        setResult(i, intent);
        finish();
    }

    /* renamed from: I7 */
    public final void mo153266I7() {
        boolean z;
        boolean z2;
        IconPreference iconPreference = this.f318393e;
        if (iconPreference != null && z2) {
            mo153267J7(iconPreference, false, (z2 = this.f318402q));
        }
        IconPreference iconPreference2 = this.f318396h;
        if (iconPreference2 != null && z) {
            mo153267J7(iconPreference2, false, (z = this.f318403r));
        }
        IconPreference iconPreference3 = this.f318394f;
        if (iconPreference3 != null) {
            mo153267J7(iconPreference3, false, true);
        }
        IconPreference iconPreference4 = this.f318395g;
        if (iconPreference4 != null) {
            mo153267J7(iconPreference4, false, true);
        }
    }

    /* renamed from: J7 */
    public final void mo153267J7(Preference preference, boolean z, boolean z2) {
        if (preference instanceof IconPreference) {
            IconPreference iconPreference = (IconPreference) preference;
            iconPreference.mo101935S(C76577a.m92151b(this, 20), C76577a.m92151b(this, 20));
            if (z) {
                if (z2) {
                    iconPreference.mo101931M(C0966R.raw.radio_on);
                } else {
                    iconPreference.mo101931M(C0966R.raw.radio_default_on);
                }
                iconPreference.mo101932N(0);
                return;
            }
            iconPreference.mo101931M(C0966R.raw.radio_off);
            iconPreference.mo101932N(0);
        }
    }

    /* renamed from: K7 */
    public final void mo153268K7(String str) {
        C77398g G = C76879j.m92713G(this, str, "", true, new C106565c(this));
        this.f318397i = G;
        G.setCanceledOnTouchOutside(false);
        this.f318397i.show();
    }

    /* renamed from: L7 */
    public final void mo153269L7() {
        mo153266I7();
        C106559h hVar = C106559h.instance;
        Log.m105925i("MicroMsg.WalletLockSettingUI", "alvinluo current wallet lock type: %d", Integer.valueOf(hVar.mo153253a()));
        if (!(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("TouchLockFunction", 0) != 1)) {
            Log.m105928w("MicroMsg.WalletLockSettingUI", "alvinluo FingerprintLock entry is not opened and don't show FingerprintLock entry");
            this.f318392d.mo72529n("wallet_lock_fingerprint", true);
        } else {
            boolean z = C77292s.m93116c() && C21460a.m24280n(getContext());
            if (hVar.mo153255c()) {
                if (!z) {
                    this.f318392d.mo72529n("wallet_lock_fingerprint", false);
                    this.f318393e.mo101928J(getString(C0966R.string.kv7));
                    this.f318393e.mo101929K(0);
                    mo153267J7(this.f318393e, true, false);
                    this.f318393e.mo69932y(false);
                    this.f318393e.f215082h1 = true;
                    this.f318402q = false;
                } else if (this.f318401p) {
                    this.f318392d.mo72529n("wallet_lock_fingerprint", false);
                    mo153267J7(this.f318393e, true, true);
                    IconPreference iconPreference = this.f318393e;
                    String str = getString(C0966R.string.kvw) + getString(C0966R.string.kve);
                    View view = iconPreference.f215084j1;
                    if (view != null) {
                        view.setContentDescription(str);
                    }
                    iconPreference.f215076b1 = str;
                }
            } else if (!z) {
                this.f318392d.mo72529n("wallet_lock_fingerprint", true);
            } else {
                this.f318392d.mo72529n("wallet_lock_fingerprint", false);
                mo153267J7(this.f318393e, false, true);
                IconPreference iconPreference2 = this.f318393e;
                String str2 = getString(C0966R.string.kvx) + getString(C0966R.string.kve);
                View view2 = iconPreference2.f215084j1;
                if (view2 != null) {
                    view2.setContentDescription(str2);
                }
                iconPreference2.f215076b1 = str2;
            }
        }
        Log.m105925i("MicroMsg.WalletLockSettingUI", "alvinluo isUserSetGesturePwd: %b", Boolean.valueOf(C107759d.m145973c()));
        if (hVar.mo153253a() == 2 || hVar.mo153253a() == 3) {
            mo153267J7(this.f318394f, false, true);
            this.f318392d.mo72529n("wallet_lock_modify_gesture", true);
            IconPreference iconPreference3 = this.f318394f;
            String str3 = getString(C0966R.string.kvx) + getString(C0966R.string.kvm);
            View view3 = iconPreference3.f215084j1;
            if (view3 != null) {
                view3.setContentDescription(str3);
            }
            iconPreference3.f215076b1 = str3;
        } else if (hVar.mo153253a() != 1) {
            mo153267J7(this.f318394f, false, true);
            this.f318392d.mo72529n("wallet_lock_modify_gesture", true);
            IconPreference iconPreference4 = this.f318394f;
            String str4 = getString(C0966R.string.kvx) + getString(C0966R.string.kvm);
            View view4 = iconPreference4.f215084j1;
            if (view4 != null) {
                view4.setContentDescription(str4);
            }
            iconPreference4.f215076b1 = str4;
        } else if (this.f318401p) {
            mo153267J7(this.f318394f, true, true);
            this.f318392d.mo72529n("wallet_lock_modify_gesture", false);
            IconPreference iconPreference5 = this.f318394f;
            String str5 = getString(C0966R.string.kvw) + getString(C0966R.string.kvm);
            View view5 = iconPreference5.f215084j1;
            if (view5 != null) {
                view5.setContentDescription(str5);
            }
            iconPreference5.f215076b1 = str5;
        }
        if (hVar.mo153253a() != 0) {
            mo153267J7(this.f318395g, false, true);
        } else if (this.f318401p) {
            mo153267J7(this.f318395g, true, true);
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8987d_;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        Log.m105925i("MicroMsg.WalletLockSettingUI", "alvinluo onActivityResult requestCode: %d, resultCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (intent2 == null) {
            Log.m105920e("MicroMsg.WalletLockSettingUI", "alvinluo data is null");
            return;
        }
        int intExtra = intent2.getIntExtra("key_err_code", -1);
        Log.m105925i("MicroMsg.WalletLockSettingUI", "alvinluo wallet lock setting onActivityResult errCode: %d", Integer.valueOf(intExtra));
        if (i3 == 1) {
            Log.m105924i("MicroMsg.WalletLockSettingUI", "alvinluo request open fingerprint lock onActivityResult");
            if (intExtra == 0) {
                if (this.f318400o) {
                    setResult(i4, intent2);
                    finish();
                }
            } else if (intExtra != 4) {
                Log.m105924i("MicroMsg.WalletLockSettingUI", "alvinluo open fingerprint lock failed");
                mo153268K7(getString(C0966R.string.kv_));
            }
        } else if (i3 == 2) {
            Log.m105924i("MicroMsg.WalletLockSettingUI", "alvinluo request open gesture onActivityResult");
            if (intExtra == 0) {
                if (this.f318400o) {
                    setResult(i4, intent2);
                    finish();
                }
                ThreadPool.post(new C106564b(this), "WalletLockRemoveAuthKey");
            } else if (intExtra != 4) {
                Log.m105924i("MicroMsg.WalletLockSettingUI", "alvinluo open gesture lock failed");
                mo153268K7(getString(C0966R.string.kvl));
            }
        } else if (i3 != 3) {
        } else {
            if (intExtra == 0) {
                ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91359l(0);
                C107761f.f322498a = -1;
                C107243a.f320886a = -1;
                mo153269L7();
                C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.kv4), 0).show();
                Log.m105924i("MicroMsg.WalletLockReportManager", "alvinluo idkey report close wallet lock success");
                C115669n.INSTANCE.idkeyStat(713, 3, 1, false);
                if (this.f318400o) {
                    mo153265H7(-1, 0, "close wallet lock ok");
                }
                ThreadPool.post(new C106569e(this), "WalletLockRemoveAuthKey");
                WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new WCPaySaftyClickReportStruct();
                wCPaySaftyClickReportStruct.f194681d = 14;
                wCPaySaftyClickReportStruct.f194682e = 2;
                wCPaySaftyClickReportStruct.mo86054n();
            } else if (intExtra != 4) {
                mo153268K7(getString(C0966R.string.kv5));
            }
        }
    }

    public void onBackPressed() {
        Log.m105924i("MicroMsg.WalletLockSettingUI", "alvinluo onBackPressed");
        if (this.f318400o) {
            mo153265H7(0, 4, "user cancel setting wallet lock");
        } else {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C106563a());
        setMMTitle((int) C0966R.string.kvs);
        this.f318392d = getPreferenceScreen();
        C47511g preferenceScreen = getPreferenceScreen();
        this.f318392d = preferenceScreen;
        this.f318393e = (IconPreference) preferenceScreen.mo72519a("wallet_lock_fingerprint");
        this.f318394f = (IconPreference) this.f318392d.mo72519a("wallet_lock_gesture");
        this.f318395g = (IconPreference) this.f318392d.mo72519a("wallet_lock_close");
        this.f318396h = (IconPreference) this.f318392d.mo72519a("wallet_lock_faceid");
        this.f318393e.mo101934R(0);
        this.f318394f.mo101934R(0);
        this.f318395g.mo101934R(0);
        this.f318396h.mo101934R(0);
        this.f318393e.mo69921C(8);
        this.f318394f.mo69921C(8);
        this.f318395g.mo69921C(8);
        this.f318396h.mo69921C(8);
        this.f318392d.mo72529n("wallet_lock_faceid", true);
        PreferenceTitleCategory preferenceTitleCategory = (PreferenceTitleCategory) this.f318392d.mo72519a("wallet_lock_title");
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_more_tab_new_name_cn_config, false);
        Log.m105925i("MicroMsg.WalletLockSettingUI", " cn wallet open new name ：%s", Boolean.valueOf(wf));
        if (wf) {
            preferenceTitleCategory.mo69924H(getString(C0966R.string.lrf));
        } else {
            preferenceTitleCategory.mo69924H(getString(C0966R.string.kvr));
        }
        this.f318399n = getIntent().getIntExtra("wallet_lock_jsapi_scene", 0);
        int intExtra = getIntent().getIntExtra("key_wallet_lock_setting_scene", -1);
        this.f318398j = intExtra;
        if (intExtra == 1) {
            this.f318400o = true;
            this.f318401p = false;
        } else if (intExtra == 2) {
            this.f318404s.alive();
        }
        WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new WCPaySaftyClickReportStruct();
        wCPaySaftyClickReportStruct.f194681d = 13;
        wCPaySaftyClickReportStruct.f194682e = 1;
        wCPaySaftyClickReportStruct.f194683f = (long) this.f318399n;
        wCPaySaftyClickReportStruct.mo86054n();
        Log.m105925i("MicroMsg.WalletLockSettingUI", "alvinluo isNeedFinish: %b, isNeedShowOpenIcon: %b", Boolean.valueOf(this.f318400o), Boolean.valueOf(this.f318401p));
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f318398j == 2) {
            this.f318404s.dead();
        }
    }

    public void onPause() {
        super.onPause();
        C77398g gVar = this.f318397i;
        if (gVar != null && gVar.isShowing()) {
            this.f318397i.dismiss();
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Preference preference2 = preference;
        C106559h hVar = C106559h.instance;
        Class cls = C28273c.class;
        if ("wallet_lock_fingerprint".equals(preference2.f121285r)) {
            mo153266I7();
            mo153267J7(preference2, true, true);
            if (this.f318402q && (!this.f318401p || hVar.mo153253a() != 2)) {
                if (!C21460a.m24281o(this)) {
                    C77398g G = C76879j.m92713G(this, getString(C0966R.string.kvo), "", true, new C106566b(this));
                    this.f318397i = G;
                    G.setCanceledOnTouchOutside(false);
                } else if (!this.f318401p || hVar.mo153253a() != 2) {
                    Log.m105924i("MicroMsg.WalletLockSettingUI", "alvinluo request open fingerprint lock");
                    ((C28273c) C86312j.m106911c(cls)).mo55895Jf().mo91348b(this, 2, 1);
                }
            }
            return true;
        } else if ("wallet_lock_faceid".equals(preference2.f121285r)) {
            mo153266I7();
            mo153267J7(preference2, true, true);
            if (this.f318403r && (!this.f318401p || hVar.mo153253a() != 3)) {
                C110247f fVar = C21460a.f60757b;
                if (!BiometricManagerCompat.from(this, 2).hasEnrolledBiometric()) {
                    C77398g G2 = C76879j.m92713G(this, getString(C0966R.string.kvo), "", true, new C106566b(this));
                    this.f318397i = G2;
                    G2.setCanceledOnTouchOutside(false);
                } else if (!this.f318401p || hVar.mo153253a() == 3) {
                    Log.m105924i("MicroMsg.WalletLockSettingUI", "request open faceid lock");
                    ((C28273c) C86312j.m106911c(cls)).mo55895Jf().mo91348b(this, 3, 4);
                }
            }
            return true;
        } else if ("wallet_lock_gesture".equals(preference2.f121285r)) {
            mo153266I7();
            mo153267J7(preference2, true, true);
            if (hVar.mo153253a() != 1) {
                Log.m105924i("MicroMsg.WalletLockSettingUI", "alvinluo request open gesture lock");
                ((C28273c) C86312j.m106911c(cls)).mo55895Jf().mo91348b(this, 1, 2);
            }
            return true;
        } else if ("wallet_lock_close".equals(preference2.f121285r)) {
            C76879j.m92709C(getContext(), getString(C0966R.string.m_q), "", getString(C0966R.string.f7935ws), getString(C0966R.string.f7926wf), false, new C106567c(this, preference2), new C106568d(this));
            return true;
        } else if (!"wallet_lock_modify_gesture".equals(preference2.f121285r)) {
            return false;
        } else {
            ((C28273c) C86312j.m106911c(cls)).mo55895Jf().mo91350d(this);
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        mo153269L7();
    }
}
