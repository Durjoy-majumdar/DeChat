package t51;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import i61.C98602h;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.ResultKt;
import r51.C110502a;
import rx3.C13598b0;
import uc0.C111153e;
import uc0.C111156r;
import uc0.C65319f;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z51.C39315g;

@C91590f(mo125468c = "com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggViewModel$loadEgg$1", mo125469f = "SpringLuckyEggViewModel.kt", mo125470l = {80, 98}, mo125471m = "invokeSuspend")
/* renamed from: t51.t */
public final class C110931t extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f331774d;

    /* renamed from: e */
    public final /* synthetic */ C110935w f331775e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggViewModel$loadEgg$1$egg$1", mo125469f = "SpringLuckyEggViewModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: t51.t$a */
    public static final class C110932a extends C91594j implements C32227p<C0000n0, C15601d<? super C111153e>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C110935w f331776d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110932a(C110935w wVar, C15601d<? super C110932a> dVar) {
            super(2, dVar);
            this.f331776d = wVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C110932a(this.f331776d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C110932a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            T next;
            boolean z;
            C111156r rVar;
            ResultKt.throwOnFailure(obj);
            LinkedList<C111153e> linkedList = ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo137997E().f260401d;
            C87412m.m108593f(linkedList, "eggList.eggList");
            C110935w wVar = this.f331776d;
            Iterator<T> it = linkedList.iterator();
            do {
                T t = null;
                if (!it.hasNext()) {
                    return null;
                }
                next = it.next();
                C111153e eVar = (C111153e) next;
                if (eVar.f332884n >= 5 && C87412m.m108589b(eVar.f332878e, wVar.f331783d) && (rVar = eVar.f332885o) != null && C87412m.m108589b(rVar.f332898d, wVar.f331785f)) {
                    LinkedList<C65319f> linkedList2 = eVar.f332877d;
                    C87412m.m108593f(linkedList2, "egg.keyWords");
                    Iterator<T> it4 = linkedList2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        T next2 = it4.next();
                        if (C87412m.m108589b(((C65319f) next2).f187992d, wVar.f331784e)) {
                            t = next2;
                            break;
                        }
                    }
                    if (t != null) {
                        z = true;
                        continue;
                    }
                }
                z = false;
                continue;
            } while (!z);
            return next;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110931t(C110935w wVar, C15601d<? super C110931t> dVar) {
        super(2, dVar);
        this.f331775e = wVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C110931t(this.f331775e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C110931t) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f331774d;
        C111156r rVar = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.SpringLuckyEggViewModel", "load egg");
            C53896h0 h0Var = C53872d1.f151119c;
            C110932a aVar2 = new C110932a(this.f331775e, (C15601d<? super C110932a>) null);
            this.f331774d = 1;
            obj = C53895h.m60469g(h0Var, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C111153e eVar = (C111153e) obj;
        if (eVar != null) {
            rVar = eVar.f332885o;
        }
        if (rVar == null) {
            Log.m105920e("MicroMsg.SpringLuckyEggViewModel", "couldn't find the luck egg");
            this.f331775e.f331789j.setValue(C110502a.FatalError);
            return C13598b0.f38549a;
        }
        this.f331775e.f331794r.setValue(eVar.f332885o);
        this.f331775e.f331790n.setValue(eVar.f332885o.f332905n);
        C110935w wVar = this.f331775e;
        wVar.f331785f = eVar.f332885o.f332898d;
        this.f331774d = 2;
        if (C110935w.m151221c3(wVar, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
