package b63;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;

/* renamed from: b63.q0 */
public class C67199q0 {

    /* renamed from: a */
    public int f192928a = 0;

    /* renamed from: b */
    public int f192929b = 0;

    public C67199q0(int i, int i2) {
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(196660, Integer.valueOf(i));
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_BALANCE_SHOW_INT, Integer.valueOf(i2));
        this.f192928a = i;
        this.f192929b = i2;
        Log.m105924i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig1 " + i + "balanceShow:" + i2);
    }

    /* renamed from: a */
    public boolean mo91301a() {
        boolean z = (this.f192928a & 16384) > 0;
        Log.m105925i("MicroMsg.WalletSwitchConfig", "isHideBalanceNum, ret = %s switchBit %s", Boolean.valueOf(z), Integer.valueOf(this.f192928a));
        return z;
    }

    /* renamed from: b */
    public boolean mo91302b() {
        boolean z = (this.f192928a & 2) > 0;
        Log.m105925i("MicroMsg.WalletSwitchConfig", "isMicroPayOn, ret = %s switchBit %s", Boolean.valueOf(z), Integer.valueOf(this.f192928a));
        return z;
    }

    /* renamed from: c */
    public boolean mo91303c() {
        boolean isEqual = Util.isEqual(this.f192929b, 1);
        Log.m105925i("MicroMsg.WalletSwitchConfig", "isShowBalance, ret = %s switchBit %s", Boolean.valueOf(isEqual), Integer.valueOf(this.f192928a));
        return isEqual;
    }

    /* renamed from: d */
    public boolean mo91304d() {
        boolean z = (this.f192928a & 4194304) > 0;
        Log.m105925i("MicroMsg.WalletSwitchConfig", "isShowBalanceAmount, ret = %s switchBit %s", Boolean.valueOf(z), Integer.valueOf(this.f192928a));
        return z;
    }

    /* renamed from: e */
    public boolean mo91305e() {
        boolean z = (this.f192928a & 2048) > 0;
        Log.m105925i("MicroMsg.WalletSwitchConfig", "isSupporSwitchWalletCurrency, ret = %s switchBit %s", Boolean.valueOf(z), Integer.valueOf(this.f192928a));
        return z;
    }

    /* renamed from: f */
    public boolean mo91306f() {
        boolean z = (this.f192928a & 67108864) > 0;
        Log.m105925i("MicroMsg.WalletSwitchConfig", "isSupportNewPayManage, ret = %s switchBit %s", Boolean.valueOf(z), Integer.valueOf(this.f192928a));
        return z;
    }

    /* renamed from: g */
    public boolean mo91307g() {
        boolean z = (this.f192928a & 128) > 0;
        Log.m105925i("MicroMsg.WalletSwitchConfig", "isSupportScanBankCard, ret = %s switchBit %s", Boolean.valueOf(z), Integer.valueOf(this.f192928a));
        return z;
    }

    /* renamed from: h */
    public boolean mo91308h() {
        boolean z = (this.f192928a & 256) > 0;
        Log.m105925i("MicroMsg.WalletSwitchConfig", "isSupportTouchPay, ret = %s switchBit %s", Boolean.valueOf(z), Integer.valueOf(this.f192928a));
        return z;
    }

    public C67199q0() {
        C86709a0.m107528h();
        this.f192928a = ((Integer) C86709a0.m107535s().mo121142i().mo119684e(196660, 0)).intValue();
        C86709a0.m107528h();
        this.f192929b = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_BALANCE_SHOW_INT, 0)).intValue();
        Log.m105924i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig2 " + this.f192928a + "balanceShow:" + this.f192929b);
    }
}
