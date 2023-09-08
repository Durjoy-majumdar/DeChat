package vf1;

import a14.C0000n0;
import ak1.C54108o;
import com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI40;
import di3.C86312j;
import fy3.C32227p;
import java.util.LinkedList;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90363p0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40$deleteItem$1", mo125469f = "OccupyFinderUI40.kt", mo125470l = {118}, mo125471m = "invokeSuspend")
/* renamed from: vf1.a6 */
public final class C52867a6 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f147664d;

    /* renamed from: e */
    public final /* synthetic */ OccupyFinderUI40 f147665e;

    /* renamed from: f */
    public final /* synthetic */ String f147666f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52867a6(OccupyFinderUI40 occupyFinderUI40, String str, C15601d<? super C52867a6> dVar) {
        super(2, dVar);
        this.f147665e = occupyFinderUI40;
        this.f147666f = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C52867a6(this.f147665e, this.f147666f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C52867a6) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f147664d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OccupyFinderUI40 occupyFinderUI40 = this.f147665e;
            LinkedList linkedList = new LinkedList();
            linkedList.add(this.f147666f);
            C13598b0 b0Var = C13598b0.f38549a;
            this.f147664d = 1;
            int i2 = OccupyFinderUI40.f111584z;
            obj = occupyFinderUI40.mo64537O7(2, linkedList, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) obj).booleanValue()) {
            OccupyFinderUI40 occupyFinderUI402 = this.f147665e;
            String str = this.f147666f;
            int i3 = OccupyFinderUI40.f111584z;
            occupyFinderUI402.getClass();
            ((C54108o) C86312j.m106911c(C54108o.class)).Rx0("live_sensitive_word_delete", "view_clk", C90363p0.m113143b(new C13604l("sensitive_word", str)));
        }
        return C13598b0.f38549a;
    }
}
