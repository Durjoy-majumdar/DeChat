package d73;

import android.app.Activity;
import android.content.Intent;
import b73.C67213b;
import com.tencent.p014mm.autogen.events.WalletLockProtectEvent;
import com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI;
import com.tencent.p014mm.plugin.walletlock.model.C106555a;
import com.tencent.p014mm.plugin.walletlock.model.C106557f;
import com.tencent.p014mm.plugin.walletlock.model.C106559h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import f40.C86709a0;
import j20.C117292a;
import k20.C9556a;

/* renamed from: d73.a */
public class C107005a extends C106555a {
    /* renamed from: b */
    public void mo91348b(Activity activity, int i, int i2) {
        super.mo91348b(activity, i, i2);
    }

    /* renamed from: c */
    public boolean mo91349c() {
        return ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLETLOCK_FACEID_IS_OPENED_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue();
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
            Intent intent = new Intent(activity, FingerprintWalletLockUI.class);
            intent.addFlags(131072);
            intent.putExtra("action", "action.verify_pattern");
            intent.putExtra("next_action", "next_action.goto_protected_page");
            intent.putExtra("page_intent", activity.getIntent());
            intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, mo153251m(activity));
            intent.setPackage(MMApplicationContext.getPackageName());
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            C117292a.m165358d(activity, aVar2.mo10232b(), "com/tencent/mm/plugin/walletlock/faceid/FaceIdLockImpl", "protectMeOnCreate", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GuardFilter;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/plugin/walletlock/faceid/FaceIdLockImpl", "protectMeOnCreate", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GuardFilter;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.finish();
            return true;
        }
        Log.m105918d("MicroMsg.FaceIdLockImpl", "protectMeOnCreate: still in filter range, do not activate protection.");
        return false;
    }

    public void init() {
        C106559h hVar = C106559h.instance;
        hVar.mo153256e(true);
        hVar.mo153258g(3);
    }

    /* renamed from: j */
    public void mo91357j(Activity activity, C67213b.C67214b bVar, C67213b.C67215a aVar) {
    }

    /* renamed from: k */
    public C67213b.C67214b mo91358k() {
        if (C106557f.f318377a == null) {
            C106557f.f318377a = new C106557f();
        }
        return C106557f.f318377a;
    }
}
