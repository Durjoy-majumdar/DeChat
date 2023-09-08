package qj2;

import a14.C0000n0;
import d14.C45253g;
import d14.C58052j1;
import d14.C58095x0;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import pj2.C62318a;
import qj2.C63183a;
import rx3.C13598b0;
import sj2.C63918b;
import sj2.C63922c;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.exclusive.ExclusiveDataViewModel$bindDataSource$1", mo125469f = "ExclusiveDataViewModel.kt", mo125470l = {28}, mo125471m = "invokeSuspend")
/* renamed from: qj2.b */
public final class C63187b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f179282d;

    /* renamed from: e */
    public Object f179283e;

    /* renamed from: f */
    public int f179284f;

    /* renamed from: g */
    public final /* synthetic */ C63183a f179285g;

    /* renamed from: h */
    public final /* synthetic */ ArrayList<C62318a> f179286h;

    /* renamed from: qj2.b$a */
    public static final class C63188a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C63183a f179287d;

        public C63188a(C63183a aVar) {
            this.f179287d = aVar;
        }

        public Object emit(Object obj, C15601d dVar) {
            ((C58052j1) this.f179287d.f179274f).setValue(new C63183a.C63184a.C63185a((ArrayList) obj, 2));
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63187b(C63183a aVar, ArrayList<C62318a> arrayList, C15601d<? super C63187b> dVar) {
        super(2, dVar);
        this.f179285g = aVar;
        this.f179286h = arrayList;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C63187b(this.f179285g, this.f179286h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63187b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C63183a aVar;
        Iterator it;
        C15911a aVar2 = C15911a.COROUTINE_SUSPENDED;
        int i = this.f179284f;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C63183a aVar3 = this.f179285g;
            ArrayList<C62318a> arrayList = this.f179286h;
            int i2 = aVar3.f179275g;
            aVar3.getClass();
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i3 = size / i2;
            if (i3 >= 0) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 * i2;
                    int i6 = i4 + 1;
                    int i7 = i6 * i2;
                    if (i7 >= size) {
                        i7 = size;
                    }
                    arrayList2.add(arrayList.subList(i5, i7));
                    if (i4 == i3) {
                        break;
                    }
                    i4 = i6;
                }
            }
            aVar = this.f179285g;
            it = arrayList2.iterator();
        } else if (i == 1) {
            it = (Iterator) this.f179283e;
            aVar = (C63183a) this.f179282d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (it.hasNext()) {
            List list = (List) it.next();
            C63922c cVar = aVar.f179272d;
            cVar.getClass();
            C87412m.m108594g(list, "ringtone");
            C58095x0 x0Var = new C58095x0(new C63918b(list, cVar, (C15601d<? super C63918b>) null));
            C63188a aVar4 = new C63188a(aVar);
            this.f179282d = aVar;
            this.f179283e = it;
            this.f179284f = 1;
            if (x0Var.mo31880a(aVar4, this) == aVar2) {
                return aVar2;
            }
        }
        return C13598b0.f38549a;
    }
}
