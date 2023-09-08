package ck2;

import a14.C0000n0;
import bl3.C39818r;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C58100z0;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.ResultKt;
import mp3.C88819d;
import p145dx.C58451o;
import pj2.C62323d;
import pj2.C62324e;
import pj2.C62328j;
import q40.C89456b;
import rx3.C13598b0;
import ve3.C52839l;
import ve3.C52842n;
import ve3.C65685n0;
import vj2.C52935e;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneFinderAuthorDataUIC$loadMore$1", mo125469f = "RingtoneFinderAuthorDataUIC.kt", mo125470l = {41}, mo125471m = "invokeSuspend")
/* renamed from: ck2.n */
public final class C54916n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f153922d;

    /* renamed from: e */
    public final /* synthetic */ C54917o f153923e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54916n(C54917o oVar, C15601d<? super C54916n> dVar) {
        super(2, dVar);
        this.f153923e = oVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54916n(this.f153923e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54916n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Class cls = C54873a.class;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f153922d;
        boolean z = false;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C54917o oVar = this.f153923e;
            C52935e eVar = new C52935e(oVar.f153927g, oVar.f153926f + 1);
            this.f153922d = 1;
            obj = C89456b.m111831a(eVar, 0, (C88819d) null, this, 3, (Object) null);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.RingtoneFinderAuthorDataUIC", "GetFinderAuthorRingBack failed: " + e.getMessage());
                C54917o oVar2 = this.f153923e;
                oVar2.f153925e = false;
                oVar2.f153924d = new ArrayList<>();
                ((C54873a) C39818r.f106831a.mo62444c(this.f153923e.getActivity()).mo75002a(cls)).mo75817c3();
                return C13598b0.f38549a;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C52842n nVar = (C52842n) obj;
        this.f153923e.f153925e = nVar.f147608d;
        ArrayList<C52839l> arrayList = new ArrayList<>();
        if (this.f153923e.f153926f == -1) {
            z = true;
        }
        LinkedList<C52839l> linkedList = nVar.f147609e;
        C87412m.m108593f(linkedList, "resp.Infos");
        C54917o oVar3 = this.f153923e;
        for (C52839l lVar : linkedList) {
            int i2 = oVar3.f153926f;
            if (i2 == -1 || i2 < lVar.f147600e) {
                oVar3.f153926f = lVar.f147600e;
            }
            arrayList.add(lVar);
        }
        C54917o oVar4 = this.f153923e;
        oVar4.getClass();
        oVar4.f153924d = arrayList;
        if (z) {
            C62328j jVar = ((C54873a) C39818r.f106831a.mo62444c(this.f153923e.getActivity()).mo75002a(cls)).f153804d;
            jVar.getClass();
            Log.m105924i("MicroMsg.RingtoneDataViewModel", "clearDataSource");
            ((C58100z0) jVar.f177168d).mo82832d(new C58451o.C58452a((List<? extends C62323d>) null, 1));
        }
        ArrayList arrayList2 = new ArrayList();
        for (C52839l lVar2 : this.f153923e.f153924d) {
            C65685n0 n0Var = lVar2.f147599d;
            if (n0Var != null) {
                arrayList2.add(new C62324e(n0Var));
            }
        }
        return C13598b0.f38549a;
    }
}
