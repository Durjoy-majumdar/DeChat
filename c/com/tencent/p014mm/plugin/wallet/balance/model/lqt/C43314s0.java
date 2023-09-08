package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C98494b;
import lp3.C46888b;
import lp3.C88643g;
import mp3.C88820e;
import op3.C117878c;
import op3.C89278g;
import te3.C49074d03;
import te3.C50004jk3;
import te3.C51776w3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.s0 */
public class C43314s0 implements C98494b<C43313r0> {

    /* renamed from: a */
    public C43313r0 f117150a;

    /* renamed from: b */
    public final C43315a f117151b = new C43315a();

    /* renamed from: c */
    public final C43316b f117152c = new C43316b();

    /* renamed from: d */
    public final C43317c f117153d = new C43317c();

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.s0$a */
    public class C43315a implements C88820e<C51776w3, C89278g<String, String, String, String, Integer, Integer, Integer>> {
        public C43315a() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.UI";
        }

        public Object call(Object obj) {
            C89278g gVar = (C89278g) obj;
            C43313r0 r0Var = C43314s0.this.f117150a;
            int intValue = ((Integer) gVar.mo182596a(4)).intValue();
            int intValue2 = ((Integer) gVar.mo182596a(5)).intValue();
            int intValue3 = ((Integer) gVar.mo182596a(6)).intValue();
            r0Var.getClass();
            Log.m105924i("MicroMsg.LqtPlanAddInteractor", "do add plan");
            C46888b b = C88643g.m110544b();
            b.mo72092b();
            new C43281a((String) gVar.mo182596a(0), (String) gVar.mo182596a(1), (String) gVar.mo182596a(2), (String) gVar.mo182596a(3), (long) intValue, intValue2, intValue3).mo9225i().mo123062e(new C43307o0(r0Var, b));
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.s0$b */
    public class C43316b implements C88820e<C49074d03, C89278g<Integer, String, String, String, Integer, Integer, String>> {
        public C43316b() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.UI";
        }

        public Object call(Object obj) {
            C89278g gVar = (C89278g) obj;
            C43313r0 r0Var = C43314s0.this.f117150a;
            int intValue = ((Integer) gVar.mo182596a(4)).intValue();
            r0Var.getClass();
            Log.m105924i("MicroMsg.LqtPlanAddInteractor", "do add plan");
            C46888b b = C88643g.m110544b();
            b.mo72092b();
            new C43300i(((Integer) gVar.mo182596a(0)).intValue(), (String) gVar.mo182596a(1), (String) gVar.mo182596a(2), (String) gVar.mo182596a(3), (long) intValue, ((Integer) gVar.mo182596a(5)).intValue(), (String) gVar.mo182596a(6)).mo9225i().mo123062e(new C43309p0(r0Var, b));
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.s0$c */
    public class C43317c implements C88820e<C50004jk3, C117878c<Integer, Integer, Integer>> {
        public C43317c() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.UI";
        }

        public Object call(Object obj) {
            C117878c cVar = (C117878c) obj;
            C43313r0 r0Var = C43314s0.this.f117150a;
            int intValue = ((Integer) cVar.mo182596a(0)).intValue();
            int intValue2 = ((Integer) cVar.mo182596a(1)).intValue();
            int intValue3 = ((Integer) cVar.mo182596a(2)).intValue();
            r0Var.getClass();
            Log.m105924i("MicroMsg.LqtPlanAddInteractor", "doPlanOrderList");
            C46888b b = C88643g.m110544b();
            b.mo72092b();
            new CgiLqtPlanOrderList(intValue, intValue2, intValue3).mo9225i().mo123062e(new C43311q0(r0Var, b));
            return null;
        }
    }

    public C43314s0() {
        C43313r0 r0Var = new C43313r0();
        this.f117150a = r0Var;
    }

    /* renamed from: a */
    public Object mo67527a() {
        return this.f117150a;
    }
}
