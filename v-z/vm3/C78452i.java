package vm3;

import a14.C0000n0;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import d14.C45253g;
import d14.C58085t0;
import fy3.C32227p;
import java.util.HashMap;
import java.util.List;
import kotlin.ResultKt;
import om3.C77020b;
import rx3.C13598b0;
import rx3.C13600d;
import tm3.C64957k;
import tm3.C78064o;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.mvvm.uic.addressbook.SelectContactAddressBookSearchUIC$startSearch$3", mo125469f = "SelectContactAddressBookSearchUIC.kt", mo125470l = {173}, mo125471m = "invokeSuspend")
/* renamed from: vm3.i */
public final class C78452i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f229846d;

    /* renamed from: e */
    public final /* synthetic */ C58085t0<List<C77020b>> f229847e;

    /* renamed from: f */
    public final /* synthetic */ C78444g f229848f;

    /* renamed from: g */
    public final /* synthetic */ C78064o f229849g;

    /* renamed from: h */
    public final /* synthetic */ HashMap<Integer, Object> f229850h;

    /* renamed from: vm3.i$a */
    public static final class C78453a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C78444g f229851d;

        /* renamed from: e */
        public final /* synthetic */ C78064o f229852e;

        /* renamed from: f */
        public final /* synthetic */ HashMap<Integer, Object> f229853f;

        public C78453a(C78444g gVar, C78064o oVar, HashMap<Integer, Object> hashMap) {
            this.f229851d = gVar;
            this.f229852e = oVar;
            this.f229853f = hashMap;
        }

        public Object emit(Object obj, C15601d dVar) {
            List list = (List) obj;
            UIStateCenter e3 = this.f229851d.mo14599e3();
            if (e3 != null) {
                e3.dispatch(new C64957k(this.f229852e, this.f229853f, list));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78452i(C58085t0<List<C77020b>> t0Var, C78444g gVar, C78064o oVar, HashMap<Integer, Object> hashMap, C15601d<? super C78452i> dVar) {
        super(2, dVar);
        this.f229847e = t0Var;
        this.f229848f = gVar;
        this.f229849g = oVar;
        this.f229850h = hashMap;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C78452i(this.f229847e, this.f229848f, this.f229849g, this.f229850h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        ((C78452i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        return C15911a.COROUTINE_SUSPENDED;
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f229846d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58085t0<List<C77020b>> t0Var = this.f229847e;
            C78453a aVar2 = new C78453a(this.f229848f, this.f229849g, this.f229850h);
            this.f229846d = 1;
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
