package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C98494b;
import lp3.C46888b;
import lp3.C88643g;
import mp3.C88820e;
import op3.C117880e;
import op3.C89278g;
import op3.C89279h;
import te3.C50958qg3;
import te3.C77964lj3;
import te3.C77969n9;
import te3.C78005vk3;
import te3.C78014xp3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.b1 */
public class C71617b1 implements C98494b<C71615a1> {

    /* renamed from: a */
    public C71615a1 f207589a;

    /* renamed from: b */
    public final C71621d f207590b = new C71621d();

    /* renamed from: c */
    public final C71619b f207591c = new C71619b();

    /* renamed from: d */
    public final C71620c f207592d = new C71620c();

    /* renamed from: e */
    public final C71618a f207593e = new C71618a();

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.b1$a */
    public class C71618a implements C88820e<C50958qg3, C117880e<Integer, C77969n9, Integer, Integer, String>> {
        public C71618a() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.UI";
        }

        public Object call(Object obj) {
            C117880e eVar = (C117880e) obj;
            C71615a1 a1Var = C71617b1.this.f207589a;
            int intValue = ((Integer) eVar.mo182596a(0)).intValue();
            int intValue2 = ((Integer) eVar.mo182596a(2)).intValue();
            a1Var.getClass();
            Log.m105925i("MicroMsg.LqtSaveFetchInteractor", "do lqtPreRedeemFund, accountType: %s", Integer.valueOf(intValue2));
            Log.m105919d("MicroMsg.LqtSaveFetchInteractor", "do lqtPreRedeemFund, redeemFee: %s", Integer.valueOf(intValue));
            C46888b b = C88643g.m110544b();
            b.mo72092b();
            new C71641m(intValue, (C77969n9) eVar.mo182596a(1), intValue2, ((Integer) eVar.mo182596a(3)).intValue(), (String) eVar.mo182596a(4)).mo9225i().mo123062e(new C43326z0(a1Var, b));
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.b1$b */
    public class C71619b implements C88820e<C78005vk3, C89278g<String, String, Integer, Integer, String, Integer, Integer>> {
        public C71619b() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.UI";
        }

        public Object call(Object obj) {
            C89278g gVar = (C89278g) obj;
            C71615a1 a1Var = C71617b1.this.f207589a;
            String str = (String) gVar.mo182596a(0);
            String str2 = (String) gVar.mo182596a(1);
            int intValue = ((Integer) gVar.mo182596a(2)).intValue();
            int intValue2 = ((Integer) gVar.mo182596a(3)).intValue();
            int intValue3 = ((Integer) gVar.mo182596a(5)).intValue();
            int intValue4 = ((Integer) gVar.mo182596a(6)).intValue();
            a1Var.getClass();
            Log.m105925i("MicroMsg.LqtSaveFetchInteractor", "do lqtQueryPurchaseResult, tradeNo: %s, transactionId: %s, accountType: %s", str, str2, Integer.valueOf(intValue2));
            Log.m105919d("MicroMsg.LqtSaveFetchInteractor", "do lqtQueryPurchaseResult, tradeNo: %s, transactionId: %s, purchaseFee: %s", str, str2, Integer.valueOf(intValue));
            C46888b b = C88643g.m110544b();
            b.mo72092b();
            new C57477o(str, str2, intValue, intValue2, (String) gVar.mo182596a(4), intValue3, intValue4).mo9225i().mo123062e(new C71659x0(a1Var, b));
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.b1$c */
    public class C71620c implements C88820e<C78014xp3, C117880e<Integer, String, String, Integer, String>> {
        public C71620c() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.UI";
        }

        public Object call(Object obj) {
            C117880e eVar = (C117880e) obj;
            C71615a1 a1Var = C71617b1.this.f207589a;
            int intValue = ((Integer) eVar.mo182596a(0)).intValue();
            String str = (String) eVar.mo182596a(1);
            String str2 = (String) eVar.mo182596a(2);
            int intValue2 = ((Integer) eVar.mo182596a(3)).intValue();
            a1Var.getClass();
            Log.m105925i("MicroMsg.LqtSaveFetchInteractor", "do lqtRedeemFund, redeemListId: %s, accountType: %s", str2, Integer.valueOf(intValue2));
            Log.m105919d("MicroMsg.LqtSaveFetchInteractor", "do lqtRedeemFund, redeemFee: %s, payPasswdEnc: %s, redeemListId: %s", Integer.valueOf(intValue), str, str2);
            C46888b b = C88643g.m110544b();
            b.mo72092b();
            new C57478q(intValue, str, str2, intValue2, (String) eVar.mo182596a(4)).mo9225i().mo123062e(new C71660y0(a1Var, b));
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.b1$d */
    public class C71621d implements C88820e<C77964lj3, C89279h<String, String, Integer, Integer, String, Integer, String, String>> {
        public C71621d() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.UI";
        }

        public Object call(Object obj) {
            C89279h hVar = (C89279h) obj;
            C71615a1 a1Var = C71617b1.this.f207589a;
            String str = (String) hVar.mo182596a(0);
            String str2 = (String) hVar.mo182596a(1);
            int intValue = ((Integer) hVar.mo182596a(2)).intValue();
            int intValue2 = ((Integer) hVar.mo182596a(3)).intValue();
            int intValue3 = ((Integer) hVar.mo182596a(5)).intValue();
            a1Var.getClass();
            Log.m105925i("MicroMsg.LqtSaveFetchInteractor", "do lqtSave, fundCode: %s, accountType: %s, spid: %s, purchaseScene: %s", str, Integer.valueOf(intValue2), str2, Integer.valueOf(intValue3));
            Log.m105919d("MicroMsg.LqtSaveFetchInteractor", "do lqtSave, fundCode: %s, purchaseFee: %s", str, Integer.valueOf(intValue));
            C46888b b = C88643g.m110544b();
            b.mo72092b();
            new C71646n(str, str2, intValue, intValue2, (String) hVar.mo182596a(4), intValue3, (String) hVar.mo182596a(6), (String) hVar.mo182596a(7)).mo9225i().mo123062e(new C71658w0(a1Var, b));
            return null;
        }
    }

    public C71617b1() {
        C71615a1 a1Var = new C71615a1();
        this.f207589a = a1Var;
    }

    /* renamed from: a */
    public Object mo67527a() {
        return this.f207589a;
    }
}
