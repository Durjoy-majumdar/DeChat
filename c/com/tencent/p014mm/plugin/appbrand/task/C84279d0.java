package com.tencent.p014mm.plugin.appbrand.task;

import com.tencent.luggage.sdk.processes.LuggageServiceType;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import my3.C61594j;
import my3.C61595o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110821n;

/* renamed from: com.tencent.mm.plugin.appbrand.task.d0 */
public final class C84279d0 extends C84316p {

    /* renamed from: j */
    public final C13601g f246148j = C36568h.m40985a(new C84280a(this));

    /* renamed from: com.tencent.mm.plugin.appbrand.task.d0$a */
    public static final class C84280a extends C87413o implements C32224a<C84310k[]> {

        /* renamed from: d */
        public final /* synthetic */ C84279d0 f246149d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84280a(C84279d0 d0Var) {
            super(0);
            this.f246149d = d0Var;
        }

        public Object invoke() {
            C84310k[] U = C84279d0.super.mo111400o();
            C61594j i = C61595o.m72301i(0, 3);
            C87412m.m108594g(i, "indices");
            return (C84310k[]) (i.isEmpty() ? C110821n.m150967n(U, 0, 0) : C110821n.m150967n(U, i.mo59687f0().intValue(), i.mo59688g0().intValue() + 1));
        }
    }

    /* renamed from: T */
    public C84310k[] mo111400o() {
        C84310k[] kVarArr = (C84310k[]) ((C36570n) this.f246148j).getValue();
        for (C84310k kVar : kVarArr) {
            if (!kVar.mo111374t(LuggageServiceType.WASERVICE) || !kVar.mo111374t(LuggageServiceType.WAGAME)) {
                throw new IllegalStateException(("Incorrect declaration(" + kVar + ") for AppBrandThreeProcessesManager").toString());
            }
        }
        return kVarArr;
    }
}
