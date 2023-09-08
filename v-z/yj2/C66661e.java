package yj2;

import a14.C0000n0;
import eb0.C75592q0;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import nj2.C61768p;
import oj2.C62035b;
import rx3.C13598b0;
import ve3.C65680f;
import ve3.C65681f0;
import ve3.C65682g;
import ve3.C65685n0;
import wj2.C66132f;
import wx3.C15601d;
import xx3.C15911a;
import yj2.C66655a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.ringtone.RingtoneSettingHelper$getRingBackPlayInfoSelfRemote$2", mo125469f = "RingtoneSettingHelper.kt", mo125470l = {70}, mo125471m = "invokeSuspend")
/* renamed from: yj2.e */
public final class C66661e extends C91594j implements C32227p<C0000n0, C15601d<? super C62035b>, Object> {

    /* renamed from: d */
    public Object f191680d;

    /* renamed from: e */
    public int f191681e;

    public C66661e(C15601d<? super C66661e> dVar) {
        super(2, dVar);
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C66661e(dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        C0000n0 n0Var = (C0000n0) obj;
        return new C66661e((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C66132f fVar;
        C65685n0 n0Var;
        C65681f0 f0Var;
        C65682g gVar;
        C65680f fVar2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f191681e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String s = C75592q0.m90789s();
            C87412m.m108593f(s, "getUsernameFromUserInfo()");
            if (C61768p.m72477d(s) != null) {
                String s2 = C75592q0.m90789s();
                C87412m.m108593f(s2, "getUsernameFromUserInfo()");
                fVar = C61768p.m72477d(s2);
                if (fVar == null) {
                    return null;
                }
                C65685n0 n0Var2 = fVar.f190083f;
                Integer num = n0Var2 != null ? new Integer(n0Var2.f189020d) : null;
                if (num != null && num.intValue() == 2) {
                    C65685n0 n0Var3 = fVar.f190083f;
                    if (n0Var3 == null || (gVar = n0Var3.f189022f) == null || (fVar2 = gVar.f188994d) == null) {
                        return null;
                    }
                    long j = fVar2.f188983d;
                    String str = fVar2.f188984e;
                    if (str == null) {
                        return null;
                    }
                    this.f191680d = fVar;
                    this.f191681e = 1;
                    obj = C66655a.m78639a(j, str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (!(num == null || num.intValue() != 1 || (n0Var = fVar.f190083f) == null || (f0Var = n0Var.f189021e) == null || f0Var.f188985d == null)) {
                    return new C62035b(1, (int) fVar.f190079b, (int) fVar.f190080c, false, fVar);
                }
            }
            return null;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            fVar = (C66132f) this.f191680d;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C66655a.C66656a aVar2 = (C66655a.C66656a) obj;
        if (aVar2 == null) {
            return null;
        }
        fVar.f190081d = aVar2.f191655a;
        boolean z = aVar2.f191656b;
        if (z) {
            return null;
        }
        return new C62035b(2, (int) fVar.f190079b, (int) fVar.f190080c, z, fVar);
    }
}
