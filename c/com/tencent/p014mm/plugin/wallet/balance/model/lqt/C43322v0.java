package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C98494b;
import lp3.C46888b;
import lp3.C88643g;
import mp3.C88820e;
import op3.C117878c;
import te3.C50734ou2;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.v0 */
public class C43322v0 implements C98494b<C43321u0> {

    /* renamed from: a */
    public C43321u0 f117158a;

    /* renamed from: b */
    public final C43323a f117159b = new C43323a();

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.v0$a */
    public class C43323a implements C88820e<C50734ou2, C117878c<Integer, Integer, String>> {
        public C43323a() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.UI";
        }

        public Object call(Object obj) {
            C117878c cVar = (C117878c) obj;
            C43321u0 u0Var = C43322v0.this.f117158a;
            u0Var.getClass();
            Log.m105924i("MicroMsg.LqtPlanHomeInteractor", "do oper plan");
            C46888b b = C88643g.m110544b();
            b.mo72092b();
            new C43299h(((Integer) cVar.mo182596a(0)).intValue(), ((Integer) cVar.mo182596a(1)).intValue(), (String) cVar.mo182596a(2)).mo9225i().mo123062e(new C43319t0(u0Var, b));
            return null;
        }
    }

    public C43322v0() {
        C43321u0 u0Var = new C43321u0();
        this.f117158a = u0Var;
    }

    /* renamed from: a */
    public Object mo67527a() {
        return this.f117158a;
    }
}
