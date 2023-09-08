package ij2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import fy3.C32227p;
import hj2.C59928c;
import hj2.C59930e;
import java.util.LinkedList;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C64563mr3;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;
import z04.C112551y;

@C91590f(mo125468c = "com.tencent.mm.plugin.repairer.ui.uic.RepairerSearchDataUIC$onCreate$3$1$1", mo125469f = "RepairerSearchDataUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: ij2.h */
public final class C60325h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C59930e f171974d;

    /* renamed from: e */
    public final /* synthetic */ C60321g f171975e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60325h(C59930e eVar, C60321g gVar, C15601d<? super C60325h> dVar) {
        super(2, dVar);
        this.f171974d = eVar;
        this.f171975e = gVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C60325h(this.f171974d, this.f171975e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60325h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        UIStateCenter stateCenter;
        ResultKt.throwOnFailure(obj);
        LinkedList linkedList = new LinkedList();
        if (!C112551y.m153811k(this.f171974d.f171039a)) {
            LinkedList<C64563mr3> linkedList2 = this.f171975e.f171970e;
            C59930e eVar = this.f171974d;
            for (C64563mr3 mr32 : linkedList2) {
                String str = mr32.f184381e;
                boolean z = false;
                if (str != null && C112550d0.m153801u(str, eVar.f171039a, false)) {
                    z = true;
                }
                if (z) {
                    linkedList.add(mr32);
                }
            }
        }
        BaseMvvmActivity d3 = this.f171975e.mo14598d3();
        if (!(d3 == null || (stateCenter = d3.getStateCenter()) == null)) {
            stateCenter.dispatch(new C59928c(linkedList));
        }
        return C13598b0.f38549a;
    }
}
