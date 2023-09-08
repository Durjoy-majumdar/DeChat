package ny2;

import a14.C0000n0;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.teenmode.p111ui.TeenModeGuardianInfoUI;
import com.tencent.p014mm.plugin.teenmode.p111ui.TeenModePrivatePwdUI;
import d14.C45252f;
import d14.C45253g;
import di3.C86312j;
import fy3.C32227p;
import j20.C117292a;
import k20.C9556a;
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

@C91590f(mo125468c = "com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI$doScene$1", mo125469f = "TeenModeGuardianInfoUI.kt", mo125470l = {165}, mo125471m = "invokeSuspend")
/* renamed from: ny2.v */
public final class C100260v extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f293736d;

    /* renamed from: e */
    public final /* synthetic */ C45252f<C47445a<C48805b34>> f293737e;

    /* renamed from: f */
    public final /* synthetic */ C89779i0 f293738f;

    /* renamed from: g */
    public final /* synthetic */ TeenModeGuardianInfoUI f293739g;

    /* renamed from: ny2.v$a */
    public static final class C100261a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C89779i0 f293740d;

        /* renamed from: e */
        public final /* synthetic */ TeenModeGuardianInfoUI f293741e;

        public C100261a(C89779i0 i0Var, TeenModeGuardianInfoUI teenModeGuardianInfoUI) {
            this.f293740d = i0Var;
            this.f293741e = teenModeGuardianInfoUI;
        }

        public Object emit(Object obj, C15601d dVar) {
            String str;
            C47445a aVar = (C47445a) obj;
            Class cls = C10685q.class;
            if (aVar.f128348a == C47798b.OnEnd) {
                this.f293740d.dismiss();
                if (aVar.f128350c == 0) {
                    C76912y0.m92768g(this.f293741e.getContext(), this.f293741e.getString(C0966R.string.f361445jy3));
                    C10685q qVar = (C10685q) C86312j.m106911c(cls);
                    C48805b34 b342 = (C48805b34) aVar.f128353f;
                    if (b342 == null || (str = b342.f130927d) == null) {
                        str = null;
                    }
                    qVar.f32106f = str;
                    ((C10685q) C86312j.m106911c(cls)).f32107g = 2;
                    Intent intent = new Intent(this.f293741e.getContext(), TeenModePrivatePwdUI.class);
                    intent.putExtra("intent_process", 4);
                    intent.addFlags(67108864);
                    TeenModeGuardianInfoUI teenModeGuardianInfoUI = this.f293741e;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent);
                    TeenModeGuardianInfoUI teenModeGuardianInfoUI2 = teenModeGuardianInfoUI;
                    C117292a.m165358d(teenModeGuardianInfoUI2, aVar2.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/TeenModeGuardianInfoUI$doScene$1$1", "emit", "(Lcom/tencent/mm/modelbase/flow/FlowEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    teenModeGuardianInfoUI.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(teenModeGuardianInfoUI2, "com/tencent/mm/plugin/teenmode/ui/TeenModeGuardianInfoUI$doScene$1$1", "emit", "(Lcom/tencent/mm/modelbase/flow/FlowEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    ((C10685q) C86312j.m106911c(cls)).mo10757ri(14);
                } else {
                    TeenModeGuardianInfoUI.m83876N7(this.f293741e, aVar.f128351d);
                    ((C10685q) C86312j.m106911c(cls)).mo10757ri(13);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100260v(C45252f<C47445a<C48805b34>> fVar, C89779i0 i0Var, TeenModeGuardianInfoUI teenModeGuardianInfoUI, C15601d<? super C100260v> dVar) {
        super(2, dVar);
        this.f293737e = fVar;
        this.f293738f = i0Var;
        this.f293739g = teenModeGuardianInfoUI;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C100260v(this.f293737e, this.f293738f, this.f293739g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C100260v) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f293736d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C45252f<C47445a<C48805b34>> fVar = this.f293737e;
            C100261a aVar2 = new C100261a(this.f293738f, this.f293739g);
            this.f293736d = 1;
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
