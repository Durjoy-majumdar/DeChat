package cn3;

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

@C91590f(mo125468c = "com.tencent.mm.ui.mvvm.uic.conversation.recent.RecentConversationSearchUIC$startSearch$4", mo125469f = "RecentConversationSearchUIC.kt", mo125470l = {167}, mo125471m = "invokeSuspend")
/* renamed from: cn3.k */
public final class C67431k extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f193368d;

    /* renamed from: e */
    public final /* synthetic */ C58085t0<List<C77020b>> f193369e;

    /* renamed from: f */
    public final /* synthetic */ C67421h f193370f;

    /* renamed from: g */
    public final /* synthetic */ C78064o f193371g;

    /* renamed from: h */
    public final /* synthetic */ HashMap<Integer, Object> f193372h;

    /* renamed from: cn3.k$a */
    public static final class C67432a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C67421h f193373d;

        /* renamed from: e */
        public final /* synthetic */ C78064o f193374e;

        /* renamed from: f */
        public final /* synthetic */ HashMap<Integer, Object> f193375f;

        public C67432a(C67421h hVar, C78064o oVar, HashMap<Integer, Object> hashMap) {
            this.f193373d = hVar;
            this.f193374e = oVar;
            this.f193375f = hashMap;
        }

        public Object emit(Object obj, C15601d dVar) {
            List list = (List) obj;
            UIStateCenter e3 = this.f193373d.mo14599e3();
            if (e3 != null) {
                e3.dispatch(new C64957k(this.f193374e, this.f193375f, list));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67431k(C58085t0<List<C77020b>> t0Var, C67421h hVar, C78064o oVar, HashMap<Integer, Object> hashMap, C15601d<? super C67431k> dVar) {
        super(2, dVar);
        this.f193369e = t0Var;
        this.f193370f = hVar;
        this.f193371g = oVar;
        this.f193372h = hashMap;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C67431k(this.f193369e, this.f193370f, this.f193371g, this.f193372h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        ((C67431k) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        return C15911a.COROUTINE_SUSPENDED;
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f193368d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58085t0<List<C77020b>> t0Var = this.f193369e;
            C67432a aVar2 = new C67432a(this.f193370f, this.f193371g, this.f193372h);
            this.f193368d = 1;
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
