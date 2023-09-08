package com.tencent.p014mm.plugin.walletlock.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import e73.C107243a;
import f40.C86709a0;
import g73.C107759d;
import ot3.C21889m;

/* renamed from: com.tencent.mm.plugin.walletlock.model.h */
public enum C106559h {
    instance;
    

    /* renamed from: d */
    public String f318381d;

    /* renamed from: e */
    public C21889m f318382e;

    /* renamed from: f */
    public int f318383f;

    /* renamed from: a */
    public int mo153253a() {
        if (this.f318383f == -1) {
            this.f318383f = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLETLOCK_CURRENT_USED_TYPE_INT_SYNC, 0)).intValue();
        }
        return this.f318383f;
    }

    /* renamed from: b */
    public boolean mo153254b() {
        int i = this.f318383f;
        if (i == 1) {
            return C107759d.m145972b();
        }
        if (i != 2) {
            return false;
        }
        Log.m105925i("MicroMsg.WalletLockManager", "alvinluo isUserBlockedInFingerprint: %b", Boolean.valueOf(C107243a.m145335d()));
        return C107243a.m145335d();
    }

    /* renamed from: c */
    public boolean mo153255c() {
        boolean booleanValue = ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLETLOCK_FINGERPRINT_IS_OPENED_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue();
        Log.m105925i("MicroMsg.WalletLockManager", "isUserSetFingerprintLock: %b", Boolean.valueOf(booleanValue));
        return booleanValue;
    }

    /* renamed from: e */
    public void mo153256e(boolean z) {
        Log.m105925i("MicroMsg.FingerprintInfoStorage", "set user face id lock: %s", Boolean.valueOf(z));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLETLOCK_FACEID_IS_OPENED_BOOLEAN_SYNC, Boolean.valueOf(z));
        C86709a0.m107535s().mo121142i().mo119681a(true);
    }

    /* renamed from: f */
    public void mo153257f(boolean z) {
        Log.m105925i("MicroMsg.FingerprintInfoStorage", "alvinluo set fingerprint lock status isOpened: %b", Boolean.valueOf(z));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLETLOCK_FINGERPRINT_IS_OPENED_BOOLEAN_SYNC, Boolean.valueOf(z));
        C86709a0.m107535s().mo121142i().mo119681a(true);
    }

    /* renamed from: g */
    public void mo153258g(int i) {
        Log.m105925i("MicroMsg.WalletLockManager", "alvinluo old wallet lock type: %d, new type: %d", Integer.valueOf(this.f318383f), Integer.valueOf(i));
        this.f318383f = i;
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLETLOCK_CURRENT_USED_TYPE_INT_SYNC, Integer.valueOf(i));
        C86709a0.m107535s().mo121142i().mo119681a(true);
    }
}
