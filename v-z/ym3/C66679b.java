package ym3;

import a14.C0000n0;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72996z1;
import d14.C45253g;
import d14.C58085t0;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import lv1.C10656l;
import lv1.C99671h;
import lv1.C99681n;
import rm3.C77540a;
import rx3.C13598b0;
import rx3.C13600d;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C64197v;
import tm3.C64957k;
import tm3.C78064o;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.mvvm.uic.chatroommember.SelectContactChatRoomMemberSearchUIC$startSearch$2", mo125469f = "SelectContactChatRoomMemberSearchUIC.kt", mo125470l = {120}, mo125471m = "invokeSuspend")
/* renamed from: ym3.b */
public final class C66679b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f191709d;

    /* renamed from: e */
    public final /* synthetic */ C58085t0<C10656l> f191710e;

    /* renamed from: f */
    public final /* synthetic */ HashMap<Integer, Object> f191711f;

    /* renamed from: g */
    public final /* synthetic */ C66670a f191712g;

    /* renamed from: h */
    public final /* synthetic */ C78064o f191713h;

    /* renamed from: ym3.b$a */
    public static final class C66680a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ HashMap<Integer, Object> f191714d;

        /* renamed from: e */
        public final /* synthetic */ C66670a f191715e;

        /* renamed from: f */
        public final /* synthetic */ C78064o f191716f;

        public C66680a(HashMap<Integer, Object> hashMap, C66670a aVar, C78064o oVar) {
            this.f191714d = hashMap;
            this.f191715e = aVar;
            this.f191716f = oVar;
        }

        public Object emit(Object obj, C15601d dVar) {
            List<C99671h> list;
            C10656l lVar = (C10656l) obj;
            this.f191714d.put(new Integer(0), lVar);
            UIStateCenter e3 = this.f191715e.mo14599e3();
            if (e3 != null) {
                C78064o oVar = this.f191716f;
                HashMap<Integer, Object> hashMap = this.f191714d;
                C66670a aVar = this.f191715e;
                aVar.getClass();
                ArrayList arrayList = new ArrayList();
                C44661m1 m1Var = (C44661m1) ((C36570n) aVar.f191696h).getValue();
                if (m1Var != null) {
                    List<C99681n> list2 = lVar.f32076e;
                    C87412m.m108593f(list2, "result.resultList");
                    C99681n nVar = (C99681n) C110818d0.m150917O(list2, 0);
                    if (nVar != null) {
                        nVar.f292168v = lVar.f32075d;
                    } else {
                        nVar = null;
                    }
                    if (!(nVar == null || (list = nVar.f292160n) == null)) {
                        Iterator it = ((ArrayList) list).iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i2 = i + 1;
                            if (i >= 0) {
                                C99671h hVar = (C99671h) next;
                                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(hVar.f292113e);
                                if (!z1Var.mo62932t3()) {
                                    C77540a aVar2 = new C77540a(m1Var, hVar, lVar.f32075d, i, 0, (String) null, 48, (C8480h) null);
                                    String username = z1Var.getUsername();
                                    C87412m.m108593f(username, "contact.username");
                                    arrayList.add(C77540a.f226063g.mo107705a(aVar.getActivity(), username + '-' + 10 + '-' + 0, z1Var, 10, aVar2));
                                }
                                i = i2;
                            } else {
                                C64197v.m75542k();
                                throw null;
                            }
                        }
                    }
                }
                e3.dispatch(new C64957k(oVar, hashMap, arrayList));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66679b(C58085t0<C10656l> t0Var, HashMap<Integer, Object> hashMap, C66670a aVar, C78064o oVar, C15601d<? super C66679b> dVar) {
        super(2, dVar);
        this.f191710e = t0Var;
        this.f191711f = hashMap;
        this.f191712g = aVar;
        this.f191713h = oVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C66679b(this.f191710e, this.f191711f, this.f191712g, this.f191713h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        ((C66679b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        return C15911a.COROUTINE_SUSPENDED;
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f191709d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58085t0<C10656l> t0Var = this.f191710e;
            C66680a aVar2 = new C66680a(this.f191711f, this.f191712g, this.f191713h);
            this.f191709d = 1;
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
