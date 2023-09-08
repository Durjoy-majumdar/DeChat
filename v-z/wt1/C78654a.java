package wt1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI;
import com.tencent.p014mm.plugin.fingerprint.p842ui.FingerPrintAuthUI;
import com.tencent.p014mm.plugin.fingerprint.p842ui.WalletOpenTouchPayApi31UI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr3.C75282g;
import cr3.C75296i;
import di3.C86312j;
import h81.C32735h;
import ob0.C117747y;
import yq3.C79148e;

/* renamed from: wt1.a */
public class C78654a extends C79148e {

    /* renamed from: wt1.a$a */
    public class C78655a extends C75282g {
        public C78655a(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            C78654a.this.f232423c.putString("pwd", objArr[0]);
            Log.m105924i("MicroMsg.FingerPrintAuthProcess", "this is onNext");
            return false;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            return false;
        }
    }

    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        Log.m105924i("MicroMsg.FingerPrintAuthProcess", "FingerPrintAuthProcess start,forward to WalletCheckPwdUI");
        mo109103B(activity, WalletCheckPwdUI.class, bundle);
        return this;
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        mo91259f(activity, new Bundle());
    }

    /* renamed from: e */
    public String mo91258e() {
        return "FingerprintAuth";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        Intent intent = new Intent();
        Log.m105924i("MicroMsg.FingerPrintAuthProcess", "FingerPrintAuthProcess end");
        if (this.f232423c.getInt("open_scene", 0) == 1) {
            mo109113k(activity, "wallet", ".pwd.ui.WalletBiometricPaySettingsUI", 0, intent, true);
        } else {
            mo109109g(activity);
        }
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        if (activity instanceof WalletCheckPwdUI) {
            Log.m105924i("MicroMsg.FingerPrintAuthProcess", "forward to FingerPrintAuthUI");
            if (this.f232423c.getInt("key_open_biometric_type") == 1) {
                boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_soter_adopt_to_android12_by_device, 0) == 1 || C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Pay_UseBiometricPrompt_Int, 0) == 1;
                Log.m105925i("MicroMsg.FingerPrintAuthProcess", "use biometric prompt: %s", Boolean.valueOf(z));
                if (z) {
                    mo109103B(activity, WalletOpenTouchPayApi31UI.class, bundle);
                } else {
                    mo109103B(activity, FingerPrintAuthUI.class, bundle);
                }
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("key_scene", 0);
                mo109104C(activity, WalletFaceIdAuthUI.class, bundle, bundle2);
            }
        } else if (activity instanceof FingerPrintAuthUI) {
            mo91259f(activity, bundle);
        } else if (activity instanceof WalletFaceIdAuthUI) {
            mo91259f(activity, bundle);
        }
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        if (mMActivity instanceof WalletCheckPwdUI) {
            return new C78655a(mMActivity, iVar);
        }
        return null;
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return false;
    }
}
