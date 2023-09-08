package vf1;

import a14.C0000n0;
import com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI39;
import fy3.C32227p;
import java.util.LinkedList;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39$addItem$1", mo125469f = "OccupyFinderUI39.kt", mo125470l = {141}, mo125471m = "invokeSuspend")
/* renamed from: vf1.v5 */
public final class C52877v5 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f147676d;

    /* renamed from: e */
    public final /* synthetic */ OccupyFinderUI39 f147677e;

    /* renamed from: f */
    public final /* synthetic */ String f147678f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52877v5(OccupyFinderUI39 occupyFinderUI39, String str, C15601d<? super C52877v5> dVar) {
        super(2, dVar);
        this.f147677e = occupyFinderUI39;
        this.f147678f = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C52877v5(this.f147677e, this.f147678f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C52877v5) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f147676d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OccupyFinderUI39 occupyFinderUI39 = this.f147677e;
            LinkedList linkedList = new LinkedList();
            linkedList.add(this.f147678f);
            C13598b0 b0Var = C13598b0.f38549a;
            this.f147676d = 1;
            int i2 = OccupyFinderUI39.f111565v;
            obj = occupyFinderUI39.mo64532N7(1, linkedList, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) obj).booleanValue()) {
            OccupyFinderUI39 occupyFinderUI392 = this.f147677e;
            String str = this.f147678f;
            int i3 = OccupyFinderUI39.f111565v;
            occupyFinderUI392.mo64534P7("live_sensitive_word_add", "view_clk", str);
        }
        return C13598b0.f38549a;
    }
}
