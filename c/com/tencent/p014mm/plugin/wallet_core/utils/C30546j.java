package com.tencent.p014mm.plugin.wallet_core.utils;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53895h;
import a14.C53934p0;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.storage.C72963f4;
import fy3.C32227p;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.j */
public final class C30546j {

    @C91590f(mo125468c = "com.tencent.mm.plugin.wallet_core.utils.MessageReportor$report$1", mo125469f = "MessageReportor.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.j$a */
    public static final class C30547a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ List<C72963f4> f82295d;

        /* renamed from: e */
        public final /* synthetic */ C30545i f82296e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30547a(List<? extends C72963f4> list, C30545i iVar, C15601d<? super C30547a> dVar) {
            super(2, dVar);
            this.f82295d = list;
            this.f82296e = iVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C30547a(this.f82295d, this.f82296e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C30547a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C68070l.C68072b u;
            C30548k kVar;
            ResultKt.throwOnFailure(obj);
            for (C72963f4 next : this.f82295d) {
                if (!(!next.mo101020w3() || next.getContent() == null || next.mo108768t() == null || (u = C68070l.C68072b.m80422u(next.getContent(), (String) null)) == null)) {
                    String t = next.mo108768t();
                    C8478d0 d0Var = new C8478d0();
                    C8479f0 f0Var = new C8479f0();
                    f0Var.f27484d = "";
                    int i = u.f195582i;
                    if (i == 2000 || i == 2011) {
                        kVar = C30548k.TRANSFER;
                        T t2 = u.f195501J0;
                        if (t2 != null) {
                            f0Var.f27484d = t2;
                        }
                    } else if (i == 2001) {
                        kVar = C30548k.C2C;
                        T t3 = u.f195616q1;
                        if (t3 != null) {
                            if (t3.length() > 0) {
                                f0Var.f27484d = t3;
                            }
                        }
                        T t4 = u.f195640w1;
                        if (t4 != null) {
                            if (t4.length() > 0) {
                                f0Var.f27484d = t4;
                            }
                        }
                        String str = u.f195604n1;
                        if (str != null) {
                            d0Var.f27483d = Integer.parseInt(str);
                        }
                    }
                    C115669n.INSTANCE.mo160131h(22835, new Integer(kVar.f82300d), new Integer(this.f82296e.f82294d), new Integer((next.mo108769t2() == 1 ? C30549m.SENDER : C30549m.RECEIVER).f82304d), t, new Integer(d0Var.f27483d), f0Var.f27484d);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo57475a(List<? extends C72963f4> list, C30545i iVar) {
        C87412m.m108594g(list, "messages");
        C87412m.m108594g(iVar, "eventType");
        C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C30547a(list, iVar, (C15601d<? super C30547a>) null), 3, (Object) null);
    }
}
