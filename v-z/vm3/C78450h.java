package vm3;

import a14.C0000n0;
import d14.C45253g;
import d14.C58085t0;
import fy3.C32227p;
import java.util.HashMap;
import java.util.List;
import kotlin.ResultKt;
import lv1.C10656l;
import om3.C77020b;
import rx3.C13598b0;
import rx3.C13600d;
import sx3.C110818d0;
import tm3.C78064o;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.mvvm.uic.addressbook.SelectContactAddressBookSearchUIC$startSearch$2$1", mo125469f = "SelectContactAddressBookSearchUIC.kt", mo125470l = {161}, mo125471m = "invokeSuspend")
/* renamed from: vm3.h */
public final class C78450h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f229832d;

    /* renamed from: e */
    public final /* synthetic */ C58085t0<C10656l> f229833e;

    /* renamed from: f */
    public final /* synthetic */ HashMap<Integer, Object> f229834f;

    /* renamed from: g */
    public final /* synthetic */ int f229835g;

    /* renamed from: h */
    public final /* synthetic */ C78444g f229836h;

    /* renamed from: i */
    public final /* synthetic */ C78064o f229837i;

    /* renamed from: j */
    public final /* synthetic */ List<C77020b> f229838j;

    /* renamed from: n */
    public final /* synthetic */ C58085t0<List<C77020b>> f229839n;

    /* renamed from: vm3.h$a */
    public static final class C78451a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ HashMap<Integer, Object> f229840d;

        /* renamed from: e */
        public final /* synthetic */ int f229841e;

        /* renamed from: f */
        public final /* synthetic */ C78444g f229842f;

        /* renamed from: g */
        public final /* synthetic */ C78064o f229843g;

        /* renamed from: h */
        public final /* synthetic */ List<C77020b> f229844h;

        /* renamed from: i */
        public final /* synthetic */ C58085t0<List<C77020b>> f229845i;

        public C78451a(HashMap<Integer, Object> hashMap, int i, C78444g gVar, C78064o oVar, List<C77020b> list, C58085t0<List<C77020b>> t0Var) {
            this.f229840d = hashMap;
            this.f229841e = i;
            this.f229842f = gVar;
            this.f229843g = oVar;
            this.f229844h = list;
            this.f229845i = t0Var;
        }

        public Object emit(Object obj, C15601d dVar) {
            C10656l lVar = (C10656l) obj;
            this.f229840d.put(new Integer(this.f229841e), lVar);
            this.f229844h.addAll(C78444g.m94750g3(this.f229842f, this.f229841e, this.f229843g.f228812d, lVar));
            Object emit = this.f229845i.emit(C110818d0.m150953y0(this.f229844h), dVar);
            return emit == C15911a.COROUTINE_SUSPENDED ? emit : C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78450h(C58085t0<C10656l> t0Var, HashMap<Integer, Object> hashMap, int i, C78444g gVar, C78064o oVar, List<C77020b> list, C58085t0<List<C77020b>> t0Var2, C15601d<? super C78450h> dVar) {
        super(2, dVar);
        this.f229833e = t0Var;
        this.f229834f = hashMap;
        this.f229835g = i;
        this.f229836h = gVar;
        this.f229837i = oVar;
        this.f229838j = list;
        this.f229839n = t0Var2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C78450h(this.f229833e, this.f229834f, this.f229835g, this.f229836h, this.f229837i, this.f229838j, this.f229839n, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        ((C78450h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        return C15911a.COROUTINE_SUSPENDED;
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f229832d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58085t0<C10656l> t0Var = this.f229833e;
            C78451a aVar2 = new C78451a(this.f229834f, this.f229835g, this.f229836h, this.f229837i, this.f229838j, this.f229839n);
            this.f229832d = 1;
            if (t0Var.mo31880a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        throw new C13600d();
    }
}
