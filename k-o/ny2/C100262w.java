package ny2;

import a14.C0000n0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.teenmode.p111ui.TeenModePrivatePwdUI;
import d14.C45252f;
import d14.C45253g;
import di3.C86312j;
import fy3.C32227p;
import kotlin.ResultKt;
import ly2.C10685q;
import nj3.C76912y0;
import pb0.C47445a;
import qb0.C47798b;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C48805b34;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI$doClear$1", mo125469f = "TeenModePrivatePwdUI.kt", mo125470l = {408}, mo125471m = "invokeSuspend")
/* renamed from: ny2.w */
public final class C100262w extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f293742d;

    /* renamed from: e */
    public final /* synthetic */ C45252f<C47445a<C48805b34>> f293743e;

    /* renamed from: f */
    public final /* synthetic */ TeenModePrivatePwdUI f293744f;

    /* renamed from: ny2.w$a */
    public static final class C100263a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ TeenModePrivatePwdUI f293745d;

        public C100263a(TeenModePrivatePwdUI teenModePrivatePwdUI) {
            this.f293745d = teenModePrivatePwdUI;
        }

        public Object emit(Object obj, C15601d dVar) {
            C47445a aVar = (C47445a) obj;
            Class cls = C10685q.class;
            if (aVar.f128348a == C47798b.OnEnd) {
                C89779i0 i0Var = this.f293745d.f282425i;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                if (aVar.f128350c == 0) {
                    ((C10685q) C86312j.m106911c(cls)).f32106f = null;
                    ((C10685q) C86312j.m106911c(cls)).f32107g = 1;
                    this.f293745d.finish();
                    C76912y0.m92768g(this.f293745d.getContext(), this.f293745d.getString(C0966R.string.jxv));
                    ((C10685q) C86312j.m106911c(cls)).mo10757ri(19);
                } else {
                    this.f293745d.mo134521W7(aVar.f128351d);
                    this.f293745d.mo134515Q7().setText("");
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100262w(C45252f<C47445a<C48805b34>> fVar, TeenModePrivatePwdUI teenModePrivatePwdUI, C15601d<? super C100262w> dVar) {
        super(2, dVar);
        this.f293743e = fVar;
        this.f293744f = teenModePrivatePwdUI;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C100262w(this.f293743e, this.f293744f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C100262w) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f293742d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C45252f<C47445a<C48805b34>> fVar = this.f293743e;
            C100263a aVar2 = new C100263a(this.f293744f);
            this.f293742d = 1;
            if (fVar.mo31880a(aVar2, this) == aVar) {
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
