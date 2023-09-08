package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C98494b;
import lp3.C46888b;
import lp3.C88629c;
import lp3.C88633e;
import lp3.C88643g;
import mp3.C88820e;
import op3.C117877b;
import op3.C117878c;
import op3.C117879d;
import te3.C77969n9;
import te3.C78005vk3;
import te3.C78014xp3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.m1 */
public class C71642m1 implements C98494b<C71624d1> {

    /* renamed from: a */
    public C71624d1 f207642a;

    /* renamed from: b */
    public final C71644c f207643b = new C71644c();

    /* renamed from: c */
    public final C71643a f207644c = new C71643a();

    /* renamed from: d */
    public final C71645d f207645d = new C71645d();

    /* renamed from: e */
    public final C43306b f207646e = new C43306b();

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.m1$b */
    public class C43306b implements C88820e<Void, C117877b<Integer, Integer>> {
        public C43306b() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.UI";
        }

        /* renamed from: b */
        public C88629c<Void> mo67530b(int i, int i2) {
            return ((C88633e) C88643g.m110548f(Integer.valueOf(i), Integer.valueOf(i2))).mo123061d(this);
        }

        public Object call(Object obj) {
            C117877b bVar = (C117877b) obj;
            C71624d1 d1Var = C71642m1.this.f207642a;
            int intValue = ((Integer) bVar.mo182596a(0)).intValue();
            int intValue2 = ((Integer) bVar.mo182596a(1)).intValue();
            d1Var.getClass();
            Log.m105925i("MicroMsg.LqtSaveFetchLogic", "reportLqtSaveShowingAndClickState, clickState: %s, showingState: %s", Integer.valueOf(intValue), Integer.valueOf(intValue2));
            C46888b b = C88643g.m110544b();
            d1Var.f207613l = b;
            b.mo72092b();
            new C43320u(intValue, intValue2).mo9225i().mo123062e(new C43288e1(d1Var));
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.m1$a */
    public class C71643a implements C88820e<C78014xp3, C117879d<Integer, Integer, Integer, C77969n9>> {
        public C71643a() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.UI";
        }

        public Object call(Object obj) {
            C117879d dVar = (C117879d) obj;
            C71624d1 d1Var = C71642m1.this.f207642a;
            int intValue = ((Integer) dVar.mo182596a(0)).intValue();
            int intValue2 = ((Integer) dVar.mo182596a(1)).intValue();
            int intValue3 = ((Integer) dVar.mo182596a(2)).intValue();
            d1Var.getClass();
            Log.m105925i("MicroMsg.LqtSaveFetchLogic", "fetchLqt, accountType: %s, %s", Integer.valueOf(intValue2), Integer.valueOf(intValue3));
            Log.m105919d("MicroMsg.LqtSaveFetchLogic", "fetchLqt, amount: %s, accountType: %s", Integer.valueOf(intValue), Integer.valueOf(intValue2));
            d1Var.f207607f = intValue;
            String stringExtra = d1Var.f207603b.getIntent().getStringExtra("operate_id");
            d1Var.f207609h = intValue2;
            d1Var.f207603b.showLoading(true);
            C88643g.m110543a(((C88633e) C88643g.m110551i(Integer.valueOf(intValue), (C77969n9) dVar.mo182596a(3), Integer.valueOf(intValue2), Integer.valueOf(intValue3), stringExtra)).mo123061d(d1Var.f207602a.f207593e).mo123061d(new C43304k1(d1Var)).mo123065b(new C43302j1(d1Var)));
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.m1$c */
    public class C71644c implements C88820e<C78005vk3, C117878c<Integer, Integer, Bankcard>> {
        public C71644c() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.UI";
        }

        public Object call(Object obj) {
            C117878c cVar = (C117878c) obj;
            C71624d1 d1Var = C71642m1.this.f207642a;
            int intValue = ((Integer) cVar.mo182596a(0)).intValue();
            int intValue2 = ((Integer) cVar.mo182596a(1)).intValue();
            Bankcard bankcard = (Bankcard) cVar.mo182596a(2);
            d1Var.getClass();
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(intValue2);
            objArr[1] = bankcard != null ? bankcard.field_bindSerial : "";
            Log.m105925i("MicroMsg.LqtSaveFetchLogic", "saveLqt, accountType: %s, bankcard: %s", objArr);
            Log.m105919d("MicroMsg.LqtSaveFetchLogic", "saveLqt, amount: %s", Integer.valueOf(intValue));
            String stringExtra = d1Var.f207603b.getIntent().getStringExtra("lqt_save_fund_code");
            String stringExtra2 = d1Var.f207603b.getIntent().getStringExtra("lqt_fund_spid");
            String stringExtra3 = d1Var.f207603b.getIntent().getStringExtra("operate_id");
            d1Var.f207606e = intValue;
            d1Var.f207609h = intValue2;
            String str = bankcard.field_bankcardType;
            String str2 = bankcard.field_bindSerial;
            d1Var.f207603b.showLoading(true);
            Integer valueOf = Integer.valueOf(intValue);
            Integer valueOf2 = Integer.valueOf(intValue2);
            Integer valueOf3 = Integer.valueOf(d1Var.f207612k);
            C88633e eVar = new C88633e();
            eVar.mo123077t(stringExtra, stringExtra2, valueOf, valueOf2, stringExtra3, valueOf3, str, str2);
            eVar.mo123061d(d1Var.f207602a.f207590b);
            eVar.mo123061d(new C71632h1(d1Var));
            eVar.mo123061d(new C71630g1(d1Var, bankcard));
            eVar.mo123065b(new C43297f1(d1Var));
            C88643g.m110543a(eVar);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.m1$d */
    public class C71645d implements C88820e<Void, C117878c<Integer, Integer, Integer>> {
        public C71645d() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.UI";
        }

        /* renamed from: b */
        public C88629c<Void> mo98814b(int i, int i2, int i3) {
            return ((C88633e) C88643g.m110549g(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3))).mo123061d(this);
        }

        public Object call(Object obj) {
            C117878c cVar = (C117878c) obj;
            C71642m1.this.f207642a.mo98812d(((Integer) cVar.mo182596a(0)).intValue(), ((Integer) cVar.mo182596a(1)).intValue(), ((Integer) cVar.mo182596a(2)).intValue());
            return null;
        }
    }

    public C71642m1(C71624d1 d1Var) {
        this.f207642a = d1Var;
    }

    /* renamed from: a */
    public Object mo67527a() {
        return this.f207642a;
    }
}
