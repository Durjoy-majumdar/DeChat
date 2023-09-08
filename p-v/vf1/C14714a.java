package vf1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderAccountManagent;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import f14.C58901s;
import fy3.C32227p;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C36570n;
import te3.C50119ke1;
import te3.C52261zg3;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.FinderAccountManagent$refresh$1", mo125469f = "FinderAccountManagent.kt", mo125470l = {71, 74}, mo125471m = "invokeSuspend")
/* renamed from: vf1.a */
public final class C14714a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f40671d;

    /* renamed from: e */
    public int f40672e;

    /* renamed from: f */
    public final /* synthetic */ FinderAccountManagent f40673f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.FinderAccountManagent$refresh$1$1$2", mo125469f = "FinderAccountManagent.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: vf1.a$a */
    public static final class C14715a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ FinderAccountManagent f40674d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14715a(FinderAccountManagent finderAccountManagent, C15601d<? super C14715a> dVar) {
            super(2, dVar);
            this.f40674d = finderAccountManagent;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C14715a(this.f40674d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C14715a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            FinderAccountManagent finderAccountManagent = this.f40674d;
            int i = FinderAccountManagent.f14197g;
            finderAccountManagent.mo2942H7(true);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14714a(FinderAccountManagent finderAccountManagent, C15601d<? super C14714a> dVar) {
        super(2, dVar);
        this.f40673f = finderAccountManagent;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C14714a(this.f40673f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C14714a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        T t;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f40672e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C66785b bVar = C66785b.f191882e;
            this.f40672e = 1;
            obj2 = bVar.mo90679u0(2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).m168123unboximpl();
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FinderAccountManagent finderAccountManagent = this.f40673f;
        if (Result.m168121isSuccessimpl(obj2)) {
            LinkedList<C52261zg3> linkedList = ((C50119ke1) obj2).f136709z;
            C87412m.m108593f(linkedList, "resp.finder_list");
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                FinderContact finderContact = ((C52261zg3) t).f145918e;
                if (C87412m.m108589b(finderContact != null ? finderContact.username : null, (String) ((C36570n) finderAccountManagent.f14200f).getValue())) {
                    break;
                }
            }
            C52261zg3 zg32 = (C52261zg3) t;
            finderAccountManagent.f14199e = zg32 != null ? zg32.f145927q : null;
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C14715a aVar2 = new C14715a(finderAccountManagent, (C15601d<? super C14715a>) null);
            this.f40671d = obj2;
            this.f40672e = 2;
            if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return C13598b0.f38549a;
    }
}
