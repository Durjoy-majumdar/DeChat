package eb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import f40.C86718e;
import p248ug.C52570c0;
import p749xh.C53349s0;

/* renamed from: eb0.c0 */
public final class C31451c0 implements C52570c0 {

    /* renamed from: d */
    public MultiProcessMMKV f84163d;

    /* renamed from: e */
    public boolean f84164e;

    /* renamed from: H1 */
    public boolean mo58178H1() {
        mo58181a();
        MultiProcessMMKV multiProcessMMKV = this.f84163d;
        boolean z = multiProcessMMKV != null ? multiProcessMMKV.getBoolean("is_teen_mode", false) : false;
        MultiProcessMMKV multiProcessMMKV2 = this.f84163d;
        int i = -1;
        if (multiProcessMMKV2 != null) {
            i = multiProcessMMKV2.getInt("biz_teen_mode_acct_option", -1);
        }
        Log.m105925i("MicroMsg.BizTeenModeServiceProxy", "alvinluo isBizTeenModeDenyAll isTeenMode: %b, bizTeenModeAcctOption: %d", Boolean.valueOf(z), Integer.valueOf(i));
        return z && i == 2;
    }

    /* renamed from: IC */
    public void mo58179IC(C53349s0 s0Var) {
        Log.m105928w("MicroMsg.BizTeenModeServiceProxy", "reportRemoveBizContact not implemented in non-MM process");
    }

    /* renamed from: ND */
    public boolean mo58180ND() {
        mo58181a();
        MultiProcessMMKV multiProcessMMKV = this.f84163d;
        boolean z = multiProcessMMKV != null ? multiProcessMMKV.getBoolean("is_teen_mode", false) : false;
        if (!z) {
            return true;
        }
        MultiProcessMMKV multiProcessMMKV2 = this.f84163d;
        int i = -1;
        if (multiProcessMMKV2 != null) {
            i = multiProcessMMKV2.getInt("biz_teen_mode_acct_option", -1);
        }
        Log.m105925i("MicroMsg.BizTeenModeServiceProxy", "alvinluo isBizTeenModeAllowAll isTeenMode: %b, bizTeenModeAcctOption: %d", Boolean.valueOf(z), Integer.valueOf(i));
        return !z || i == 1;
    }

    /* renamed from: a */
    public final void mo58181a() {
        if (!this.f84164e) {
            String str = C86718e.m107549h() + "_biz_teen_mode_mmkv";
            this.f84163d = MultiProcessMMKV.getMMKV(str, 2);
            Log.m105925i("MicroMsg.BizTeenModeServiceProxy", "alvinluo initBizTeenModeServiceProxy key: %s", str);
            this.f84164e = true;
        }
    }

    /* renamed from: e */
    public boolean mo58182e() {
        mo58181a();
        MultiProcessMMKV multiProcessMMKV = this.f84163d;
        if (multiProcessMMKV != null) {
            return multiProcessMMKV.getBoolean("is_teen_mode", false);
        }
        return false;
    }

    public void n80(int i, String str, String str2) {
        Log.m105928w("MicroMsg.BizTeenModeServiceProxy", "reportTeenModeToast not implemented in non-MM process");
    }

    /* renamed from: vU */
    public void mo58184vU(int i, String str) {
        Log.m105928w("MicroMsg.BizTeenModeServiceProxy", "reportTeenModeToast not implemented in non-MM process");
    }
}
