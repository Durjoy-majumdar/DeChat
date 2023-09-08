package com.tencent.p014mm.plugin.wallet_index.p127ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import b63.C67205s0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.AutoLoginActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import f40.C86709a0;
import ke3.C88144b;
import l53.C76670a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p156gj.C107835h0;
import v53.C78342e0;
import y43.C79029b0;

/* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletOpenFingerprintPayRedirectUI */
public class WalletOpenFingerprintPayRedirectUI extends AutoLoginActivity implements C11385n {

    /* renamed from: d */
    public Dialog f211046d = null;

    /* renamed from: e */
    public boolean f211047e = false;

    /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletOpenFingerprintPayRedirectUI$a */
    public class C72548a implements DialogInterface.OnClickListener {
        public C72548a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletOpenFingerprintPayRedirectUI.this.finish();
        }
    }

    /* renamed from: J7 */
    public void mo94557J7(AutoLoginActivity.C72717a aVar, Intent intent) {
        Log.m105924i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "postLogin, loginResult = " + aVar);
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2) {
                Log.m105920e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "postLogin fail, loginResult = " + aVar);
                mo99951L7(1, false, "");
            } else {
                Log.m105920e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "postLogin, unknown login result = " + aVar);
            }
            mo99951L7(2, true, getString(C0966R.string.kkj));
            return;
        }
        Log.m105924i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: login ok.");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(new C78342e0((String) null, 19));
        Dialog dialog = this.f211046d;
        if (dialog != null) {
            dialog.dismiss();
            this.f211046d = null;
        }
        this.f211046d = C75197d0.m90165f(this, true, false, new C72565i(this));
    }

    /* renamed from: K7 */
    public boolean mo94558K7(Intent intent) {
        return true;
    }

    /* renamed from: L7 */
    public final void mo99951L7(int i, boolean z, String str) {
        Log.m105921e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: redirect to open fingerprint failed. errCode: %d", Integer.valueOf(i));
        Dialog dialog = this.f211046d;
        if (dialog != null && dialog.isShowing()) {
            this.f211046d.dismiss();
            this.f211046d = null;
        }
        if (z) {
            C76879j.m92713G(this, str, "", false, new C72548a());
        } else {
            finish();
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(385, this);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(385, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C78342e0)) {
            return;
        }
        if (!this.f211047e) {
            this.f211047e = true;
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: bind query ok. start judge.");
                C67205s0 wx02 = C79029b0.vx0().wx0();
                if (wx02 == null || !wx02.mo91341w()) {
                    Log.m105924i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: not open wechat payment. hint bind bankcard");
                    mo99951L7(5, true, getString(C0966R.string.kt5));
                } else if (!C76670a.m92324b() || C107835h0.f322849f.f322933b != 1) {
                    Log.m105920e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: not support wechat fp pay or not allow");
                    mo99951L7(6, true, getString(C0966R.string.kt7));
                } else {
                    Intent intent = new Intent();
                    intent.putExtra("key_is_from_system", true);
                    C88144b.m109791i(this, "wallet", ".pwd.ui.WalletPasswordSettingUI", intent, (Bundle) null);
                    finish();
                }
            } else {
                Log.m105920e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: bind query failed. inform fail.");
                mo99951L7(3, true, getString(C0966R.string.kkj));
            }
        } else {
            Log.m105928w("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: is already handled");
        }
    }

    public void onStop() {
        super.onStop();
        Dialog dialog = this.f211046d;
        if (dialog != null && dialog.isShowing()) {
            this.f211046d.dismiss();
            this.f211046d = null;
        }
    }
}
