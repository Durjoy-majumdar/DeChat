package ck2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import kotlin.ResultKt;
import nj2.C61768p;
import nj3.C76912y0;
import o40.C61926c;
import qo3.C89779i0;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneGlobalDataUIC$resetSelfDefault$1", mo125469f = "RingtoneGlobalDataUIC.kt", mo125470l = {111}, mo125471m = "invokeSuspend")
/* renamed from: ck2.v */
public final class C54929v extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f153952d;

    /* renamed from: e */
    public final /* synthetic */ C54925s f153953e;

    /* renamed from: f */
    public final /* synthetic */ C89779i0 f153954f;

    /* renamed from: ck2.v$a */
    public static final class C54930a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C89779i0 f153955d;

        /* renamed from: e */
        public final /* synthetic */ boolean f153956e;

        /* renamed from: f */
        public final /* synthetic */ C54925s f153957f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54930a(C89779i0 i0Var, boolean z, C54925s sVar) {
            super(0);
            this.f153955d = i0Var;
            this.f153956e = z;
            this.f153957f = sVar;
        }

        public Object invoke() {
            C89779i0 i0Var = this.f153955d;
            if (i0Var != null) {
                i0Var.hide();
            }
            if (this.f153956e) {
                C76912y0.m92768g(this.f153957f.getActivity(), this.f153957f.getActivity().getResources().getString(C0966R.string.i59));
                this.f153957f.f153942d.setValue(C61768p.m72478f());
            } else {
                C76912y0.m92767f(this.f153957f.getActivity(), this.f153957f.getActivity().getResources().getString(C0966R.string.i4u));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54929v(C54925s sVar, C89779i0 i0Var, C15601d<? super C54929v> dVar) {
        super(2, dVar);
        this.f153953e = sVar;
        this.f153954f = i0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54929v(this.f153953e, this.f153954f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54929v) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f153952d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C54925s sVar = this.f153953e;
            this.f153952d = 1;
            sVar.getClass();
            C66218h hVar = new C66218h(C66447b.m78392b(this));
            C53895h.m60466d(sVar.getLifecycleScope(), (C66212f) null, (C53934p0) null, new C54924r(sVar, hVar, (C15601d<? super C54924r>) null), 3, (Object) null);
            obj = hVar.mo90314b();
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C61926c.m72668M(new C54930a(this.f153954f, ((Boolean) obj).booleanValue(), this.f153953e));
        return C13598b0.f38549a;
    }
}
