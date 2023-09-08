package g73;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import b73.C67213b;
import com.tencent.p014mm.autogen.events.WalletLockProtectEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.walletlock.gesture.p1101ui.GestureGuardLogicUI;
import com.tencent.p014mm.plugin.walletlock.model.C106555a;
import com.tencent.p014mm.plugin.walletlock.model.C106557f;
import com.tencent.p014mm.plugin.walletlock.model.C106559h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;

/* renamed from: g73.e */
public class C107760e extends C106555a {
    /* renamed from: b */
    public void mo91348b(Activity activity, int i, int i2) {
        if (i == 1) {
            Intent intent = new Intent();
            intent.putExtra("action", "action.verify_paypwd");
            intent.putExtra("next_action", "next_action.switch_on_pattern");
            intent.putExtra("key_wallet_lock_type", 1);
            C88144b.m109795m(activity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent, i2);
        }
    }

    /* renamed from: c */
    public boolean mo91349c() {
        return C107759d.m145973c();
    }

    /* renamed from: d */
    public void mo91350d(Activity activity) {
        if (!C107759d.m145973c()) {
            Log.m105918d("MicroMsg.GestureImpl", "try to enter modify gesture password process while gesture password has been switched off.");
            return;
        }
        Intent intent = new Intent(activity, GestureGuardLogicUI.class);
        intent.addFlags(131072);
        intent.putExtra("action", "action.verify_pattern");
        intent.putExtra("next_action", "next_action.modify_pattern");
        intent.setPackage(MMApplicationContext.getPackageName());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/walletlock/gesture/model/GestureImpl", "enterModifyWalletLockProcess", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/plugin/walletlock/gesture/model/GestureImpl", "enterModifyWalletLockProcess", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: f */
    public boolean mo91352f() {
        return C107759d.m145972b();
    }

    /* renamed from: g */
    public void mo91353g(Activity activity, int i) {
        if (!C107759d.m145973c()) {
            Log.m105918d("MicroMsg.GestureImpl", "try to enter close gesture password process while gesture password has been switched off.");
            return;
        }
        Intent intent = new Intent(activity, GestureGuardLogicUI.class);
        intent.addFlags(131072);
        intent.putExtra("action", "action.verify_pattern");
        intent.putExtra("next_action", "next_action.switch_off_pattern");
        intent.setPackage(MMApplicationContext.getPackageName());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/walletlock/gesture/model/GestureImpl", "enterCloseWalletLockProcess", "(Landroid/app/Activity;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/plugin/walletlock/gesture/model/GestureImpl", "enterCloseWalletLockProcess", "(Landroid/app/Activity;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: h */
    public boolean mo91354h(Activity activity, C67213b.C67214b bVar) {
        if (bVar == null || ((C106557f) bVar).mo153252a(activity)) {
            WalletLockProtectEvent walletLockProtectEvent = new WalletLockProtectEvent();
            WalletLockProtectEvent.C104598a aVar = walletLockProtectEvent.f310017d;
            aVar.f310019a = 0;
            aVar.f310020b = activity;
            walletLockProtectEvent.publish();
            if (((Integer) walletLockProtectEvent.f310018e.f310021a).intValue() != 17) {
                return false;
            }
            Intent intent = new Intent(activity, GestureGuardLogicUI.class);
            intent.addFlags(131072);
            intent.putExtra("action", "action.verify_pattern");
            intent.putExtra("next_action", "next_action.goto_protected_page");
            intent.putExtra("page_intent", activity.getIntent());
            intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, mo153251m(activity));
            intent.setPackage(MMApplicationContext.getPackageName());
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            C117292a.m165358d(activity, aVar2.mo10232b(), "com/tencent/mm/plugin/walletlock/gesture/model/GestureImpl", "protectMeOnCreate", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GuardFilter;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/plugin/walletlock/gesture/model/GestureImpl", "protectMeOnCreate", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GuardFilter;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.finish();
            C115669n.INSTANCE.mo160131h(12097, 8, 0, Long.valueOf(System.currentTimeMillis()));
            return true;
        }
        Log.m105918d("MicroMsg.GestureImpl", "protectMeOnCreate: still in filter range, do not activate protection.");
        return false;
    }

    /* renamed from: i */
    public void mo91355i(Activity activity, int i) {
        if (i == 1) {
            Intent intent = new Intent();
            intent.putExtra("action", "action.verify_paypwd");
            intent.putExtra("next_action", "next_action.switch_on_pattern");
            intent.putExtra("key_wallet_lock_type", 1);
            C88144b.m109791i(activity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent, (Bundle) null);
        }
    }

    public void init() {
        Log.m105920e("MicroMsg.GestureImpl", "alvinluo gestureimpl init");
        C106559h hVar = C106559h.instance;
        C107759d.m145974d(true);
        hVar.mo153258g(1);
    }

    /* renamed from: j */
    public void mo91357j(Activity activity, C67213b.C67214b bVar, C67213b.C67215a aVar) {
        WalletLockProtectEvent walletLockProtectEvent = new WalletLockProtectEvent();
        WalletLockProtectEvent.C104598a aVar2 = walletLockProtectEvent.f310017d;
        aVar2.f310019a = 1;
        aVar2.f310020b = activity;
        walletLockProtectEvent.publish();
        int intValue = ((Integer) walletLockProtectEvent.f310018e.f310021a).intValue();
        if (intValue != 17) {
            if (intValue == 18 && aVar != null) {
                aVar.mo91360a();
            }
        } else if (bVar == null || ((C106557f) bVar).mo153252a(activity)) {
            if (aVar != null) {
                aVar.mo91361b();
            }
            Intent intent = new Intent(activity, GestureGuardLogicUI.class);
            intent.addFlags(131072);
            intent.putExtra("action", "action.verify_pattern");
            intent.putExtra("next_action", "next_action.goto_protected_page");
            intent.putExtra("page_intent", activity.getIntent());
            intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, mo153251m(activity));
            intent.setPackage(MMApplicationContext.getPackageName());
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent);
            Activity activity2 = activity;
            C117292a.m165358d(activity2, aVar3.mo10232b(), "com/tencent/mm/plugin/walletlock/gesture/model/GestureImpl", "protectMeOnResume", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GuardFilter;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GestureGuardCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(activity2, "com/tencent/mm/plugin/walletlock/gesture/model/GestureImpl", "protectMeOnResume", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GuardFilter;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GestureGuardCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            Log.m105918d("MicroMsg.GestureImpl", "protectMeOnResume: still in filter range, do not activate protection.");
        }
    }

    /* renamed from: k */
    public C67213b.C67214b mo91358k() {
        if (C106557f.f318377a == null) {
            C106557f.f318377a = new C106557f();
        }
        return C106557f.f318377a;
    }
}
