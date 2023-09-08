package ao1;

import a14.C0000n0;
import a14.C53934p0;
import bi1.C0283d;
import bl3.C0317e;
import com.tencent.p014mm.plugin.finder.p056ui.FinderCreateContactUI;
import fy3.C32227p;
import fy3.C32229r;
import gy3.C87413o;
import je1.C46531q4;
import kotlin.ResultKt;
import ob0.C117747y;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.post.PostCreateContactUIC$requestAvatarUrl$1", mo125469f = "PostCreateContactUIC.kt", mo125470l = {213}, mo125471m = "invokeSuspend")
/* renamed from: ao1.n */
public final class C0175n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f638d;

    /* renamed from: e */
    public final /* synthetic */ C46531q4 f639e;

    /* renamed from: f */
    public final /* synthetic */ C0166l f640f;

    /* renamed from: ao1.n$a */
    public static final class C0176a extends C87413o implements C32229r<Integer, Integer, String, C117747y, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C0166l f641d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0176a(C0166l lVar) {
            super(4);
            this.f641d = lVar;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            String str = (String) obj3;
            C117747y yVar = (C117747y) obj4;
            if (yVar instanceof C46531q4) {
                if (intValue == 0 && intValue2 == 0) {
                    C46531q4 q4Var = (C46531q4) yVar;
                    String str2 = q4Var.f125365q;
                    String str3 = q4Var.f125360i;
                    int i = q4Var.f125361j;
                    if (str2 != null) {
                        C0166l lVar = this.f641d;
                        String a = FinderCreateContactUI.f16795U0.mo4033a(str3, i);
                        if (a.length() > 0) {
                            FinderCreateContactUI.f16807g1.put(a, str2);
                        }
                        lVar.mo158e3(str2);
                    }
                } else {
                    C0166l lVar2 = this.f641d;
                    C0317e.launchUI$default(lVar2, (C66212f) null, (C53934p0) null, new C0173m(lVar2, (C15601d<? super C0173m>) null), 3, (Object) null);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0175n(C46531q4 q4Var, C0166l lVar, C15601d<? super C0175n> dVar) {
        super(2, dVar);
        this.f639e = q4Var;
        this.f640f = lVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C0175n(this.f639e, this.f640f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C0175n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f638d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C46531q4 q4Var = this.f639e;
            C0176a aVar2 = new C0176a(this.f640f);
            this.f638d = 1;
            if (C0283d.m244b(q4Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
