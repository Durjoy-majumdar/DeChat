package com.tencent.p014mm.plugin.walletlock.model;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import b73.C67213b;
import com.tencent.p014mm.plugin.walletlock.p951ui.WalletLockSettingUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.walletlock.model.a */
public class C106555a implements C67213b {
    /* renamed from: a */
    public void mo91347a(Activity activity, Intent intent, int i) {
        intent.setClass(activity, WalletLockSettingUI.class);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/walletlock/model/BaseWalletLockImpl", "startWalletLockManagerUIForResult", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* renamed from: b */
    public void mo91348b(Activity activity, int i, int i2) {
        Log.m105925i("MicroMsg.BaseWalletLockImpl", "alvinluo enterNewWalletLockProcessForResult walletLockType: %d, requestCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 1) {
            if (i == 1) {
                Intent intent = new Intent();
                intent.putExtra("action", "action.verify_paypwd");
                intent.putExtra("next_action", "next_action.switch_on_pattern");
                intent.putExtra("key_wallet_lock_type", 1);
                C88144b.m109795m(activity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent, i2);
            }
        } else if (i == 2 && i == 2) {
            Intent intent2 = new Intent();
            intent2.putExtra("action", "action.verify_paypwd");
            intent2.putExtra("next_action", "next_action.switch_on_pattern");
            intent2.putExtra("key_wallet_lock_type", 2);
            Log.m105925i("MicroMsg.FingerprintLockImpl", "alvinluo enterNewWalletLockProcessForResult start check pwd ui, wallet lock type: %d", Integer.valueOf(i));
            C88144b.m109795m(activity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent2, i2);
        }
    }

    /* renamed from: c */
    public boolean mo91349c() {
        return false;
    }

    /* renamed from: d */
    public void mo91350d(Activity activity) {
    }

    /* renamed from: e */
    public void mo91351e(Activity activity, Intent intent) {
        intent.setClass(activity, WalletLockSettingUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/walletlock/model/BaseWalletLockImpl", "startWalletLockManagerUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/plugin/walletlock/model/BaseWalletLockImpl", "startWalletLockManagerUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: f */
    public boolean mo91352f() {
        return false;
    }

    /* renamed from: g */
    public void mo91353g(Activity activity, int i) {
    }

    /* renamed from: h */
    public boolean mo91354h(Activity activity, C67213b.C67214b bVar) {
        return false;
    }

    /* renamed from: i */
    public void mo91355i(Activity activity, int i) {
        Log.m105925i("MicroMsg.BaseWalletLockImpl", "alvinluo enterNewWalletLockProcess walletLockType: %d", Integer.valueOf(i));
        if (i == 1) {
            if (i == 1) {
                Intent intent = new Intent();
                intent.putExtra("action", "action.verify_paypwd");
                intent.putExtra("next_action", "next_action.switch_on_pattern");
                intent.putExtra("key_wallet_lock_type", 1);
                C88144b.m109791i(activity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent, (Bundle) null);
            }
        } else if (i == 2 && i == 2) {
            Intent intent2 = new Intent();
            intent2.putExtra("action", "action.verify_paypwd");
            intent2.putExtra("next_action", "next_action.switch_on_pattern");
            intent2.putExtra("key_wallet_lock_type", 2);
            C88144b.m109791i(activity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent2, (Bundle) null);
        }
    }

    public void init() {
        C106559h.instance.mo153258g(0);
    }

    /* renamed from: j */
    public void mo91357j(Activity activity, C67213b.C67214b bVar, C67213b.C67215a aVar) {
    }

    /* renamed from: k */
    public C67213b.C67214b mo91358k() {
        return null;
    }

    /* renamed from: l */
    public void mo91359l(int i) {
    }

    /* renamed from: m */
    public int mo153251m(Activity activity) {
        Log.m105925i("MicroMsg.BaseWalletLockImpl", "alvinluo activity %s", activity.getClass().getSimpleName());
        if (activity.getClass().getSimpleName().equals("MallIndexUI") || activity.getClass().getSimpleName().equals("MallIndexUIv2")) {
            return 1;
        }
        return activity.getClass().getSimpleName().equals("WalletOfflineCoinPurseUI") ? 2 : -1;
    }
}
