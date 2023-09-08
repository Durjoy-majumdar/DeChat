package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.CloseFingerPrintEvent;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.WalletPreferenceUI;
import f40.C86709a0;
import l53.C76670a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import pj3.C47511g;
import v53.C78342e0;
import vt1.C78473a;
import yq3.C79143a;
import yq3.C79148e;

@C88989a(0)
/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletBiometricPaySettingsUI */
public class WalletBiometricPaySettingsUI extends WalletPreferenceUI {

    /* renamed from: g */
    public Preference f208739g;

    /* renamed from: h */
    public Preference f208740h;

    /* renamed from: i */
    public Preference f208741i;

    /* renamed from: j */
    public Preference f208742j;

    /* renamed from: n */
    public ResultReceiver f208743n;

    /* renamed from: o */
    public boolean f208744o = false;

    /* renamed from: p */
    public int f208745p = 0;

    /* renamed from: q */
    public boolean f208746q;

    /* renamed from: r */
    public boolean f208747r;

    /* renamed from: s */
    public boolean f208748s;

    /* renamed from: t */
    public boolean f208749t;

    /* renamed from: u */
    public C78473a f208750u;

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletBiometricPaySettingsUI$a */
    public class C71963a implements MenuItem.OnMenuItemClickListener {
        public C71963a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletBiometricPaySettingsUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletBiometricPaySettingsUI$b */
    public class C71964b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C47511g f208752d;

        /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletBiometricPaySettingsUI$b$a */
        public class C71965a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ CloseFingerPrintEvent f208754d;

            /* renamed from: e */
            public final /* synthetic */ Dialog f208755e;

            public C71965a(CloseFingerPrintEvent closeFingerPrintEvent, Dialog dialog) {
                this.f208754d = closeFingerPrintEvent;
                this.f208755e = dialog;
            }

            public void run() {
                if (this.f208754d.f78760e != null) {
                    Dialog dialog = this.f208755e;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    Log.m105925i("MicroMsg.WalletBiometricPaySettingsUI", "close event result: %s", Integer.valueOf(this.f208754d.f78760e.f78762a));
                    if (this.f208754d.f78760e.f78762a == 0) {
                        C86709a0.m107529k().f251779b.mo123460f(new C78342e0((String) null, 19));
                        return;
                    }
                    WalletBiometricPaySettingsUI walletBiometricPaySettingsUI = WalletBiometricPaySettingsUI.this;
                    walletBiometricPaySettingsUI.mo99180L7(walletBiometricPaySettingsUI.f208739g, walletBiometricPaySettingsUI.f208749t);
                    if (walletBiometricPaySettingsUI.f208745p == 1) {
                        walletBiometricPaySettingsUI.mo99180L7(walletBiometricPaySettingsUI.f208742j, walletBiometricPaySettingsUI.f208747r);
                        walletBiometricPaySettingsUI.mo99180L7(walletBiometricPaySettingsUI.f208741i, walletBiometricPaySettingsUI.f208748s);
                    } else {
                        walletBiometricPaySettingsUI.mo99180L7(walletBiometricPaySettingsUI.f208740h, walletBiometricPaySettingsUI.f208746q);
                    }
                    walletBiometricPaySettingsUI.getPreferenceScreen().notifyDataSetChanged();
                    WalletBiometricPaySettingsUI walletBiometricPaySettingsUI2 = WalletBiometricPaySettingsUI.this;
                    if (walletBiometricPaySettingsUI2.f208750u.mo107880J3()) {
                        C76879j.m92712F(walletBiometricPaySettingsUI2, walletBiometricPaySettingsUI2.getResources().getString(C0966R.string.eua), "", true);
                    } else {
                        C76879j.m92712F(walletBiometricPaySettingsUI2, walletBiometricPaySettingsUI2.getResources().getString(C0966R.string.l2t), "", true);
                    }
                }
            }
        }

        public C71964b(C47511g gVar) {
            this.f208752d = gVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Dialog d = C75197d0.m90163d(WalletBiometricPaySettingsUI.this.getContext(), false, false, (DialogInterface.OnCancelListener) null);
            CloseFingerPrintEvent closeFingerPrintEvent = new CloseFingerPrintEvent();
            closeFingerPrintEvent.f78759d.f78761a = WalletBiometricPaySettingsUI.this.f208750u.mo107880J3() ? 1 : 2;
            closeFingerPrintEvent.callback = new C71965a(closeFingerPrintEvent, d);
            closeFingerPrintEvent.asyncPublish(WalletBiometricPaySettingsUI.this.getMainLooper());
            WalletBiometricPaySettingsUI.this.mo99178J7();
            this.f208752d.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletBiometricPaySettingsUI$c */
    public class C71966c implements DialogInterface.OnClickListener {
        public C71966c(WalletBiometricPaySettingsUI walletBiometricPaySettingsUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletBiometricPaySettingsUI$d */
    public class C71967d implements DialogInterface.OnClickListener {
        public C71967d(WalletBiometricPaySettingsUI walletBiometricPaySettingsUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: I7 */
    public boolean mo94696I7(int i, int i2, String str, C117747y yVar) {
        return false;
    }

    /* renamed from: J7 */
    public final void mo99178J7() {
        if (this.f208745p == 1) {
            mo99180L7(this.f208741i, false);
            mo99180L7(this.f208742j, false);
        } else {
            mo99180L7(this.f208740h, false);
        }
        mo99180L7(this.f208739g, true);
    }

    /* renamed from: K7 */
    public final boolean mo99179K7(Preference preference) {
        return preference.f121272H == C0966R.C0971layout.beu;
    }

    /* renamed from: L7 */
    public final void mo99180L7(Preference preference, boolean z) {
        preference.f121272H = z ? C0966R.C0971layout.beu : C0966R.C0971layout.bev;
    }

    /* renamed from: M7 */
    public final void mo99181M7(int i) {
        Log.m105925i("MicroMsg.WalletBiometricPaySettingsUI", "show enroll biometric guide: %s", Integer.valueOf(i));
        String string = getString(C0966R.string.l3_);
        if (i == 1) {
            string = getString(C0966R.string.l3b);
        }
        C76879j.m92754y(this, string, "", getString(C0966R.string.l39), new C71967d(this));
    }

    /* renamed from: N7 */
    public final void mo99182N7(int i) {
        Log.m105925i("MicroMsg.WalletBiometricPaySettingsUI", "start open process: %s", Integer.valueOf(i));
        Bundle bundle = new Bundle();
        bundle.putInt("open_scene", 1);
        bundle.putInt("key_open_biometric_type", i);
        C79143a.m95772k(this, FingerprintManagerProxy.FINGERPRINT_SERVICE, "FingerprintAuth", bundle, (C79148e.C79149a) null);
    }

    public int getResourceId() {
        return C0966R.xml.f8985d8;
    }

    public void initView() {
        C47511g preferenceScreen = getPreferenceScreen();
        Preference a = preferenceScreen.mo72519a("biometric_pay_close");
        this.f208739g = a;
        a.mo69921C(8);
        Log.m105925i("MicroMsg.WalletBiometricPaySettingsUI", "fingerprint: %s, faceid: %s", Boolean.valueOf(this.f208750u.mo107880J3()), Boolean.valueOf(this.f208750u.mo107883Zi()));
        int i = this.f208745p;
        if (i == 2 || i == 3) {
            Preference preference = new Preference(this);
            this.f208740h = preference;
            preference.mo26273A("key_single_open");
            this.f208740h.mo69923G(C0966R.string.knj);
            Preference preference2 = this.f208740h;
            preference2.f121290w = false;
            preferenceScreen.mo72524h(preference2, 0);
            this.f208740h.mo69921C(8);
        } else if (i == 1) {
            Preference preference3 = new Preference(this);
            this.f208742j = preference3;
            preference3.mo26273A("key_faceid_open");
            this.f208742j.mo69923G(C0966R.string.knk);
            preferenceScreen.mo72524h(this.f208742j, 0);
            Preference preference4 = new Preference(this);
            this.f208741i = preference4;
            preference4.mo26273A("key_fingerprint_open");
            this.f208741i.mo69923G(C0966R.string.knl);
            preferenceScreen.mo72524h(this.f208741i, 1);
            this.f208742j.mo69921C(8);
            this.f208741i.mo69921C(8);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C76670a.m92323a() && C76670a.m92324b()) {
            this.f208745p = 1;
        } else if (C76670a.m92324b()) {
            this.f208745p = 2;
        } else if (C76670a.m92323a()) {
            this.f208745p = 3;
        } else {
            Log.m105928w("MicroMsg.WalletBiometricPaySettingsUI", "device not support biometric pay!");
            finish();
        }
        int i = this.f208745p;
        if (i == 1) {
            setMMTitle((int) C0966R.string.kni);
        } else if (i == 2) {
            setMMTitle((int) C0966R.string.l2x);
        } else {
            setMMTitle((int) C0966R.string.l2v);
        }
        setBackBtn(new C71963a());
        this.f208743n = (ResultReceiver) getIntent().getParcelableExtra("key_should_update_result_receiver");
        this.f208750u = (C78473a) C86709a0.m107533q(C78473a.class);
        Log.m105925i("MicroMsg.WalletBiometricPaySettingsUI", "biometric mode: %s", Integer.valueOf(this.f208745p));
        initView();
    }

    public void onPause() {
        ResultReceiver resultReceiver;
        super.onPause();
        if (this.f208744o && (resultReceiver = this.f208743n) != null) {
            resultReceiver.send(0, (Bundle) null);
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Log.m105925i("MicroMsg.WalletBiometricPaySettingsUI", "click key: %s", preference.f121285r);
        this.f208749t = mo99179K7(this.f208739g);
        if (this.f208745p == 1) {
            this.f208747r = mo99179K7(this.f208742j);
            this.f208748s = mo99179K7(this.f208741i);
        } else {
            this.f208746q = mo99179K7(this.f208740h);
        }
        Log.m105925i("MicroMsg.WalletBiometricPaySettingsUI", "is checked: %s", Boolean.valueOf(mo99179K7(preference)));
        if (mo99179K7(preference)) {
            return false;
        }
        this.f208744o = true;
        if ("biometric_pay_close".equals(preference.f121285r)) {
            String string = getString(C0966R.string.eu9);
            if (this.f208750u.mo107883Zi()) {
                string = getString(C0966R.string.clr);
            }
            C76879j.m92717K(this, false, string, "", getString(C0966R.string.a18), getString(C0966R.string.f7926wf), new C71964b(gVar), new C71966c(this));
        } else if ("key_single_open".equals(preference.f121285r)) {
            int i = this.f208745p;
            if (i == 2) {
                Log.m105924i("MicroMsg.WalletBiometricPaySettingsUI", "on click open fingerprint");
                if (this.f208750u.iw0()) {
                    mo99182N7(1);
                } else {
                    mo99181M7(1);
                }
            } else if (i == 3) {
                Log.m105924i("MicroMsg.WalletBiometricPaySettingsUI", "on click open faceid");
                if (this.f208750u.mo107913l3()) {
                    mo99182N7(2);
                } else {
                    mo99181M7(2);
                }
            }
        } else if ("key_fingerprint_open".equals(preference.f121285r)) {
            Log.m105924i("MicroMsg.WalletBiometricPaySettingsUI", "on click open fingerprint");
            if (this.f208750u.iw0()) {
                mo99182N7(1);
            } else {
                mo99181M7(1);
            }
        } else if ("key_faceid_open".equals(preference.f121285r)) {
            Log.m105924i("MicroMsg.WalletBiometricPaySettingsUI", "on click open faceid");
            if (this.f208750u.mo107913l3()) {
                mo99182N7(2);
            } else {
                mo99181M7(2);
            }
        }
        gVar.notifyDataSetChanged();
        return false;
    }

    public void onResume() {
        super.onResume();
        Log.m105925i("MicroMsg.WalletBiometricPaySettingsUI", "update pref check state: %s, %s", Boolean.valueOf(this.f208750u.mo107880J3()), Boolean.valueOf(this.f208750u.mo107883Zi()));
        if (this.f208745p == 1) {
            if (this.f208750u.mo107880J3()) {
                if (this.f208745p == 1) {
                    mo99180L7(this.f208741i, true);
                    mo99180L7(this.f208742j, false);
                    mo99180L7(this.f208739g, false);
                }
            } else if (!this.f208750u.mo107883Zi()) {
                mo99178J7();
            } else if (this.f208745p == 1) {
                mo99180L7(this.f208741i, false);
                mo99180L7(this.f208742j, true);
                mo99180L7(this.f208739g, false);
            }
        } else if (this.f208750u.mo107880J3() || this.f208750u.mo107883Zi()) {
            int i = this.f208745p;
            if (i == 2 || i == 3) {
                mo99180L7(this.f208740h, true);
                mo99180L7(this.f208739g, false);
            }
        } else {
            mo99178J7();
        }
        getPreferenceScreen().notifyDataSetChanged();
    }
}
