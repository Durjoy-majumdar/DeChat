package cn3;

import a14.C0000n0;
import com.tencent.p014mm.C0966R;
import d14.C45253g;
import d14.C58085t0;
import fy3.C32227p;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import kotlin.ResultKt;
import lv1.C10656l;
import om3.C77020b;
import rx3.C13598b0;
import rx3.C13600d;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.mvvm.uic.conversation.recent.RecentConversationSearchUIC$startSearch$3", mo125469f = "RecentConversationSearchUIC.kt", mo125470l = {159}, mo125471m = "invokeSuspend")
/* renamed from: cn3.j */
public final class C67429j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f193358d;

    /* renamed from: e */
    public final /* synthetic */ C58085t0<C10656l> f193359e;

    /* renamed from: f */
    public final /* synthetic */ List<C77020b> f193360f;

    /* renamed from: g */
    public final /* synthetic */ C67421h f193361g;

    /* renamed from: h */
    public final /* synthetic */ HashMap<Integer, Object> f193362h;

    /* renamed from: i */
    public final /* synthetic */ C58085t0<List<C77020b>> f193363i;

    /* renamed from: cn3.j$a */
    public static final class C67430a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ List<C77020b> f193364d;

        /* renamed from: e */
        public final /* synthetic */ C67421h f193365e;

        /* renamed from: f */
        public final /* synthetic */ HashMap<Integer, Object> f193366f;

        /* renamed from: g */
        public final /* synthetic */ C58085t0<List<C77020b>> f193367g;

        public C67430a(List<C77020b> list, C67421h hVar, HashMap<Integer, Object> hashMap, C58085t0<List<C77020b>> t0Var) {
            this.f193364d = list;
            this.f193365e = hVar;
            this.f193366f = hashMap;
            this.f193367g = t0Var;
        }

        public Object emit(Object obj, C15601d dVar) {
            C10656l lVar = (C10656l) obj;
            List<C77020b> list = this.f193364d;
            C67421h hVar = this.f193365e;
            String string = hVar.getActivity().getString(C0966R.string.f2q);
            C87412m.m108593f(string, "activity.getString(com.t…ring.fts_header_chatroom)");
            list.addAll(C67421h.m79831g3(hVar, 1, false, lVar, string));
            this.f193366f.put(new Integer(1), lVar);
            Object emit = this.f193367g.emit(this.f193364d, dVar);
            return emit == C15911a.COROUTINE_SUSPENDED ? emit : C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67429j(C58085t0<C10656l> t0Var, List<C77020b> list, C67421h hVar, HashMap<Integer, Object> hashMap, C58085t0<List<C77020b>> t0Var2, C15601d<? super C67429j> dVar) {
        super(2, dVar);
        this.f193359e = t0Var;
        this.f193360f = list;
        this.f193361g = hVar;
        this.f193362h = hashMap;
        this.f193363i = t0Var2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C67429j(this.f193359e, this.f193360f, this.f193361g, this.f193362h, this.f193363i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        ((C67429j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        return C15911a.COROUTINE_SUSPENDED;
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f193358d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58085t0<C10656l> t0Var = this.f193359e;
            C67430a aVar2 = new C67430a(this.f193360f, this.f193361g, this.f193362h, this.f193363i);
            this.f193358d = 1;
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
