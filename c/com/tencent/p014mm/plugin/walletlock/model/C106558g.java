package com.tencent.p014mm.plugin.walletlock.model;

import android.app.Activity;
import android.content.Intent;
import b73.C67213b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import d73.C107005a;
import e73.C107243a;
import e73.C107244b;
import f40.C86709a0;
import g73.C107759d;
import g73.C107760e;
import ke3.C88144b;
import lc3.C10485b;
import lt3.C21460a;
import pv2.C77292s;

/* renamed from: com.tencent.mm.plugin.walletlock.model.g */
public class C106558g extends C106555a {

    /* renamed from: a */
    public static C67213b f318378a;

    /* renamed from: a */
    public void mo91347a(Activity activity, Intent intent, int i) {
        C67213b bVar = f318378a;
        if (bVar != null) {
            bVar.mo91347a(activity, intent, i);
        } else {
            super.mo91347a(activity, intent, i);
        }
    }

    /* renamed from: b */
    public void mo91348b(Activity activity, int i, int i2) {
        super.mo91348b(activity, i, i2);
    }

    /* renamed from: c */
    public boolean mo91349c() {
        return C107759d.m145973c() || C106559h.instance.mo153255c();
    }

    /* renamed from: d */
    public void mo91350d(Activity activity) {
        C67213b bVar = f318378a;
        if (bVar != null) {
            bVar.mo91350d(activity);
        }
    }

    /* renamed from: e */
    public void mo91351e(Activity activity, Intent intent) {
        C67213b bVar = f318378a;
        if (bVar != null) {
            bVar.mo91351e(activity, intent);
        } else {
            super.mo91351e(activity, intent);
        }
    }

    /* renamed from: f */
    public boolean mo91352f() {
        C67213b bVar = f318378a;
        if (bVar != null) {
            return bVar.mo91352f();
        }
        return false;
    }

    /* renamed from: g */
    public void mo91353g(Activity activity, int i) {
        Intent intent = new Intent();
        intent.putExtra("action", "action.close_wallet_lock");
        C88144b.m109795m(activity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent, i);
    }

    /* renamed from: h */
    public boolean mo91354h(Activity activity, C67213b.C67214b bVar) {
        C67213b bVar2 = f318378a;
        if (bVar2 != null) {
            return bVar2.mo91354h(activity, bVar);
        }
        return false;
    }

    /* renamed from: i */
    public void mo91355i(Activity activity, int i) {
        super.mo91355i(activity, i);
    }

    public void init() {
        C106559h hVar = C106559h.instance;
        Log.m105925i("MicroMsg.WalletLockImpl", "alvinluo WalletLock init start, call stack: %s", Util.stackTraceToString(new Throwable()));
        int nullAsInt = Util.nullAsInt(C86709a0.m107535s().mo121142i().mo119684e(40, (Object) null), 0);
        int i = nullAsInt & 8388608;
        Log.m105925i("MicroMsg.WalletLockImpl", "alvinluo pluginSwitch %d %d", Integer.valueOf(nullAsInt), Integer.valueOf(i));
        if (i != 0) {
            Log.m105924i("MicroMsg.WalletLockImpl", "alvinluo fingerprint wallet lock is opened");
            C107244b bVar = new C107244b();
            f318378a = bVar;
            bVar.init();
            boolean z = (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("TouchLockFunction", 0) != 1) && C77292s.m93116c() && C21460a.m24280n(MMApplicationContext.getContext());
            Log.m105925i("MicroMsg.WalletLockImpl", "alvinluo init isSupportSoter: %b, isSupportFingerprintLock: %b", Boolean.valueOf(C77292s.m93116c()), Boolean.valueOf(z));
            if (C107759d.m145973c() && !z) {
                boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_WALLETLOCK_IS_AUTO_JUMP_TO_GESTURE_WHEN_NOT_SUPPORT_FINGERPRINT_BOOLEAN_SYNC, false);
                Log.m105925i("MicroMsg.WalletLockImpl", "alvinluo has opened fingerprint lock, but device not support soter, and use gesture, isAutoJumpToGesture: %b", Boolean.valueOf(g));
                if (g) {
                    C107760e eVar = new C107760e();
                    f318378a = eVar;
                    eVar.init();
                    Log.m105925i("MicroMsg.WalletLockImpl", "alvinluo WalletLock init end, wallet lock type: %d", Integer.valueOf(hVar.mo153253a()));
                    return;
                }
            }
        } else if (C107759d.m145973c()) {
            Log.m105924i("MicroMsg.WalletLockImpl", "alvinluo gesture wallet lock is opened");
            C107760e eVar2 = new C107760e();
            f318378a = eVar2;
            eVar2.init();
            hVar.mo153257f(false);
        } else {
            Log.m105924i("MicroMsg.WalletLockImpl", "alvinluo wallet lock is not open");
            f318378a = new C106555a();
            Log.m105924i("MicroMsg.WalletLockManager", "alvinluo closeAllWalletLock");
            hVar.mo153257f(false);
            C107759d.m145974d(false);
            hVar.mo153256e(false);
            f318378a.init();
        }
        Log.m105925i("MicroMsg.WalletLockImpl", "alvinluo WalletLock init end, wallet lock type: %d", Integer.valueOf(hVar.mo153253a()));
    }

    /* renamed from: j */
    public void mo91357j(Activity activity, C67213b.C67214b bVar, C67213b.C67215a aVar) {
        C67213b bVar2 = f318378a;
        if (bVar2 != null) {
            bVar2.mo91357j(activity, bVar, aVar);
        }
    }

    /* renamed from: k */
    public C67213b.C67214b mo91358k() {
        C67213b bVar = f318378a;
        if (bVar != null) {
            return bVar.mo91358k();
        }
        return null;
    }

    /* renamed from: l */
    public void mo91359l(int i) {
        C106559h hVar = C106559h.instance;
        if (i == 1) {
            Log.m105924i("MicroMsg.WalletLockImpl", "alvinluo wallet lock switch to gesture");
            C107760e eVar = new C107760e();
            f318378a = eVar;
            eVar.init();
            hVar.mo153257f(false);
            C107243a.m145333b();
        } else if (i == 2) {
            Log.m105924i("MicroMsg.WalletLockImpl", "alvinluo wallet lock switch to fingerprint lock");
            C107244b bVar = new C107244b();
            f318378a = bVar;
            bVar.init();
            C107759d.m145974d(false);
        } else if (i == 3) {
            Log.m105924i("MicroMsg.WalletLockImpl", "wallet lock switch to faceid lock");
            C107005a aVar = new C107005a();
            f318378a = aVar;
            aVar.init();
        } else if (i == 0) {
            Log.m105924i("MicroMsg.WalletLockImpl", "alvinluo wallet lock switch to none");
            C106555a aVar2 = new C106555a();
            f318378a = aVar2;
            aVar2.init();
            Log.m105924i("MicroMsg.WalletLockManager", "alvinluo closeAllWalletLock");
            hVar.mo153257f(false);
            C107243a.m145333b();
            C107759d.m145974d(false);
            hVar.mo153256e(false);
            C107243a.m145333b();
        } else {
            Log.m105920e("MicroMsg.WalletLockImpl", "alvinluo unknown wallet lock type, ignore switch");
        }
    }
}
