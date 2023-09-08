package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C98494b;
import lp3.C46888b;
import lp3.C88629c;
import lp3.C88633e;
import lp3.C88643g;
import mp3.C88820e;
import op3.C117877b;
import op3.C117878c;
import te3.C49344ex;
import te3.C78002u53;
import te3.C78016y53;
import te3.C78023zk3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.f0 */
public class C43290f0 implements C98494b<C43287e0> {

    /* renamed from: a */
    public C43287e0 f117125a;

    /* renamed from: b */
    public final C43292b f117126b = new C43292b();

    /* renamed from: c */
    public final C43291a f117127c = new C43291a();

    /* renamed from: d */
    public final C43296f f117128d = new C43296f();

    /* renamed from: e */
    public final C43293c f117129e = new C43293c();

    /* renamed from: f */
    public final C43294d f117130f = new C43294d();

    /* renamed from: g */
    public final C43295e f117131g = new C43295e();

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.f0$a */
    public class C43291a implements C88820e<C49344ex, C117877b<String, Integer>> {
        public C43291a() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            C117877b bVar = (C117877b) obj;
            C43287e0 e0Var = C43290f0.this.f117125a;
            int intValue = ((Integer) bVar.mo182596a(1)).intValue();
            e0Var.getClass();
            C46888b b = C88643g.m110544b();
            b.mo72092b();
            Log.m105925i("MicroMsg.LqtDetailInteractor", "closeAccount, accountType: %s", Integer.valueOf(intValue));
            new C43289f((String) bVar.mo182596a(0), intValue).mo9225i().mo123064p(new C43325z(e0Var, b));
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.f0$b */
    public class C43292b implements C88820e<C78023zk3, Void> {
        public C43292b() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.LOGIC";
        }

        /* renamed from: b */
        public C88629c<C78023zk3> mo67528b() {
            return ((C88633e) C88643g.m110546d()).mo123061d(this);
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            C43287e0 e0Var = C43290f0.this.f117125a;
            e0Var.getClass();
            C46888b b = C88643g.m110544b();
            b.mo72092b();
            new C43308p().mo9225i().mo123064p(new C43324y(e0Var, b));
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.f0$c */
    public class C43293c implements C88820e<C78002u53, C117877b<Integer, Integer>> {
        public C43293c() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.UI";
        }

        /* renamed from: b */
        public C88629c<C78002u53> mo67529b(int i, int i2) {
            return ((C88633e) C88643g.m110548f(Integer.valueOf(i), Integer.valueOf(i2))).mo123061d(this);
        }

        public Object call(Object obj) {
            C117877b bVar = (C117877b) obj;
            C43287e0 e0Var = C43290f0.this.f117125a;
            int intValue = ((Integer) bVar.mo182596a(0)).intValue();
            int intValue2 = ((Integer) bVar.mo182596a(1)).intValue();
            e0Var.getClass();
            Log.m105925i("MicroMsg.LqtDetailInteractor", "lqtOnClickPurchase, accountType: %s", Integer.valueOf(intValue));
            C46888b b = C88643g.m110544b();
            b.mo72092b();
            new C43301j(intValue, intValue2).mo9225i().mo123062e(new C71616b0(e0Var, intValue2, b));
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.f0$d */
    public class C43294d implements C88820e<C78002u53, C117878c<Integer, Integer, Long>> {
        public C43294d() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.UI";
        }

        public Object call(Object obj) {
            C117878c cVar = (C117878c) obj;
            C43287e0 e0Var = C43290f0.this.f117125a;
            int intValue = ((Integer) cVar.mo182596a(0)).intValue();
            int intValue2 = ((Integer) cVar.mo182596a(1)).intValue();
            long longValue = ((Long) cVar.mo182596a(2)).longValue();
            e0Var.getClass();
            Log.m105925i("MicroMsg.LqtDetailInteractor", "lqtOnClickPurchase, accountType: %s", Integer.valueOf(intValue));
            C46888b b = C88643g.m110544b();
            b.mo72092b();
            new C43301j(intValue, intValue2, longValue).mo9225i().mo123062e(new C71622c0(e0Var, intValue2, b));
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.f0$e */
    public class C43295e implements C88820e<C78002u53, String> {
        public C43295e() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            String str = (String) obj;
            C43287e0 e0Var = C43290f0.this.f117125a;
            e0Var.getClass();
            Log.m105925i("MicroMsg.LqtDetailInteractor", "lqtOnClickRedDotReq, redDotID: %s", str);
            C46888b b = C88643g.m110544b();
            b.mo72092b();
            new C43312r(str).mo9225i().mo123064p(new C43285d0(e0Var, b));
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.f0$f */
    public class C43296f implements C88820e<C78016y53, C117877b<Integer, Integer>> {
        public C43296f() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.UI";
        }

        public Object call(Object obj) {
            C117877b bVar = (C117877b) obj;
            C43287e0 e0Var = C43290f0.this.f117125a;
            int intValue = ((Integer) bVar.mo182596a(0)).intValue();
            int intValue2 = ((Integer) bVar.mo182596a(1)).intValue();
            e0Var.getClass();
            Log.m105925i("MicroMsg.LqtDetailInteractor", "lqtOnClickRedeem, accountType: %s", Integer.valueOf(intValue));
            C46888b b = C88643g.m110544b();
            b.mo72092b();
            new C43303k(intValue, intValue2).mo9225i().mo123062e(new C71614a0(e0Var, b));
            return null;
        }
    }

    public C43290f0() {
        C43287e0 e0Var = new C43287e0();
        this.f117125a = e0Var;
    }

    /* renamed from: a */
    public Object mo67527a() {
        return this.f117125a;
    }
}
