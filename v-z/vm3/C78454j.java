package vm3;

import a14.C0000n0;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import d14.C45253g;
import d14.C58085t0;
import fy3.C32227p;
import java.util.HashMap;
import kotlin.ResultKt;
import lv1.C10656l;
import rx3.C13598b0;
import rx3.C13600d;
import tm3.C64957k;
import tm3.C78064o;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.mvvm.uic.addressbook.SelectContactAddressBookSearchUIC$startSearch$4", mo125469f = "SelectContactAddressBookSearchUIC.kt", mo125470l = {192}, mo125471m = "invokeSuspend")
/* renamed from: vm3.j */
public final class C78454j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f229854d;

    /* renamed from: e */
    public final /* synthetic */ C58085t0<C10656l> f229855e;

    /* renamed from: f */
    public final /* synthetic */ HashMap<Integer, Object> f229856f;

    /* renamed from: g */
    public final /* synthetic */ C78444g f229857g;

    /* renamed from: h */
    public final /* synthetic */ C78064o f229858h;

    /* renamed from: vm3.j$a */
    public static final class C78455a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ HashMap<Integer, Object> f229859d;

        /* renamed from: e */
        public final /* synthetic */ C78444g f229860e;

        /* renamed from: f */
        public final /* synthetic */ C78064o f229861f;

        public C78455a(HashMap<Integer, Object> hashMap, C78444g gVar, C78064o oVar) {
            this.f229859d = hashMap;
            this.f229860e = gVar;
            this.f229861f = oVar;
        }

        public Object emit(Object obj, C15601d dVar) {
            C10656l lVar = (C10656l) obj;
            this.f229859d.put(new Integer(0), lVar);
            UIStateCenter e3 = this.f229860e.mo14599e3();
            if (e3 != null) {
                e3.dispatch(new C64957k(this.f229861f, this.f229859d, C78444g.m94750g3(this.f229860e, 0, false, lVar)));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78454j(C58085t0<C10656l> t0Var, HashMap<Integer, Object> hashMap, C78444g gVar, C78064o oVar, C15601d<? super C78454j> dVar) {
        super(2, dVar);
        this.f229855e = t0Var;
        this.f229856f = hashMap;
        this.f229857g = gVar;
        this.f229858h = oVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C78454j(this.f229855e, this.f229856f, this.f229857g, this.f229858h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        ((C78454j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        return C15911a.COROUTINE_SUSPENDED;
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f229854d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58085t0<C10656l> t0Var = this.f229855e;
            C78455a aVar2 = new C78455a(this.f229856f, this.f229857g, this.f229858h);
            this.f229854d = 1;
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
