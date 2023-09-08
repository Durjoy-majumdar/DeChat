package ck2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import fy3.C32227p;
import kotlin.ResultKt;
import nj2.C61768p;
import nj3.C76912y0;
import q40.C62580c;
import qj2.C63183a;
import qj2.C63192f;
import qo3.C89779i0;
import r13.C63358c;
import rx3.C13598b0;
import wj2.C66132f;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yj2.C66655a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveFlowUIC$deleteRingtone$1", mo125469f = "RingtoneExclusiveFlowUIC.kt", mo125470l = {92}, mo125471m = "invokeSuspend")
/* renamed from: ck2.f */
public final class C54888f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f153844d;

    /* renamed from: e */
    public int f153845e;

    /* renamed from: f */
    public final /* synthetic */ String f153846f;

    /* renamed from: g */
    public final /* synthetic */ C54897h f153847g;

    /* renamed from: h */
    public final /* synthetic */ C89779i0 f153848h;

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveFlowUIC$deleteRingtone$1$1$1", mo125469f = "RingtoneExclusiveFlowUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ck2.f$a */
    public static final class C54889a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C89779i0 f153849d;

        /* renamed from: e */
        public final /* synthetic */ C54897h f153850e;

        /* renamed from: f */
        public final /* synthetic */ C66132f f153851f;

        /* renamed from: g */
        public final /* synthetic */ String f153852g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54889a(C89779i0 i0Var, C54897h hVar, C66132f fVar, String str, C15601d<? super C54889a> dVar) {
            super(2, dVar);
            this.f153849d = i0Var;
            this.f153850e = hVar;
            this.f153851f = fVar;
            this.f153852g = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54889a(this.f153849d, this.f153850e, this.f153851f, this.f153852g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54889a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C89779i0 i0Var = this.f153849d;
            if (i0Var != null) {
                i0Var.hide();
            }
            C76912y0.m92768g(this.f153850e.getActivity(), this.f153850e.getActivity().getResources().getString(C0966R.string.byf));
            C66132f fVar = this.f153851f;
            if (fVar == null) {
                return C13598b0.f38549a;
            }
            ((C54914j0) C39818r.f106831a.mo62444c(this.f153850e.getActivity()).mo75002a(C54914j0.class)).mo75844d3(fVar, this.f153852g, (fVar.f190095r == null || fVar.mo90178i().f170150b == null || !C63358c.m74700b(fVar.mo90178i())) ? false : true);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveFlowUIC$deleteRingtone$1$1$2", mo125469f = "RingtoneExclusiveFlowUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ck2.f$b */
    public static final class C54890b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C89779i0 f153853d;

        /* renamed from: e */
        public final /* synthetic */ C54897h f153854e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54890b(C89779i0 i0Var, C54897h hVar, C15601d<? super C54890b> dVar) {
            super(2, dVar);
            this.f153853d = i0Var;
            this.f153854e = hVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54890b(this.f153853d, this.f153854e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54890b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C89779i0 i0Var = this.f153853d;
            if (i0Var != null) {
                i0Var.hide();
            }
            C76912y0.m92767f(this.f153854e.getActivity(), this.f153854e.getActivity().getResources().getString(C0966R.string.bya));
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54888f(String str, C54897h hVar, C89779i0 i0Var, C15601d<? super C54888f> dVar) {
        super(2, dVar);
        this.f153846f = str;
        this.f153847g = hVar;
        this.f153848h = i0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54888f(this.f153846f, this.f153847g, this.f153848h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54888f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C66132f fVar;
        Object obj2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f153845e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C66132f d = C61768p.m72477d(this.f153846f);
            String str = this.f153846f;
            this.f153844d = d;
            this.f153845e = 1;
            C66132f fVar2 = d;
            obj2 = C66655a.m78640c(C66655a.f191654a, 2, 3, 0, (String) null, 0, 0, str, 0, (String) null, this, 384, (Object) null);
            if (obj2 == aVar) {
                return aVar;
            }
            fVar = fVar2;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            fVar = (C66132f) this.f153844d;
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C62580c cVar = (C62580c) obj2;
        if (cVar != null) {
            String str2 = this.f153846f;
            C54897h hVar = this.f153847g;
            C89779i0 i0Var = this.f153848h;
            if (cVar.f177733a) {
                C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C54889a(i0Var, hVar, fVar, str2, (C15601d<? super C54889a>) null), 3, (Object) null);
                C61768p.m72486n(str2, (C66132f) null, 0, 4, (Object) null);
                C63183a aVar2 = hVar.f153875g;
                if (aVar2 != null) {
                    aVar2.f179277i = C53895h.m60466d(aVar2.f179273e, (C66212f) null, (C53934p0) null, new C63192f(str2, aVar2, (C15601d<? super C63192f>) null), 3, (Object) null);
                }
                C61768p.m72484l(str2, (C66132f) null);
            } else {
                C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C54890b(i0Var, hVar, (C15601d<? super C54890b>) null), 3, (Object) null);
            }
        }
        return C13598b0.f38549a;
    }
}
