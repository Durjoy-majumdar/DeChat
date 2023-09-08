package qj2;

import a14.C0000n0;
import d14.C58052j1;
import fy3.C32227p;
import java.util.ArrayList;
import kotlin.ResultKt;
import nj2.C61768p;
import pj2.C62318a;
import qj2.C63183a;
import rx3.C13598b0;
import ve3.C52833i;
import wj2.C66128a;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.exclusive.ExclusiveDataViewModel$loadFromCache$1", mo125469f = "ExclusiveDataViewModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: qj2.d */
public final class C63190d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C63183a f179289d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63190d(C63183a aVar, C15601d<? super C63190d> dVar) {
        super(2, dVar);
        this.f179289d = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C63190d(this.f179289d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63190d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = new ArrayList();
        for (C66128a aVar : C61768p.m72479g()) {
            C52833i iVar = new C52833i();
            iVar.f147588d = aVar.f190060e;
            iVar.f147591g = aVar.f190061f;
            arrayList.add(new C62318a(iVar));
        }
        ((C58052j1) this.f179289d.f179274f).setValue(new C63183a.C63184a.C63185a(arrayList, 5));
        return C13598b0.f38549a;
    }
}
