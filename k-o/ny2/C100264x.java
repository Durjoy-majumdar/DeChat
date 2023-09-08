package ny2;

import a14.C0000n0;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.teenmode.p111ui.SettingsTeenModeMain;
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

@C91590f(mo125468c = "com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI$doModify$1", mo125469f = "TeenModePrivatePwdUI.kt", mo125470l = {449}, mo125471m = "invokeSuspend")
/* renamed from: ny2.x */
public final class C100264x extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f293746d;

    /* renamed from: e */
    public final /* synthetic */ C45252f<C47445a<C48805b34>> f293747e;

    /* renamed from: f */
    public final /* synthetic */ TeenModePrivatePwdUI f293748f;

    /* renamed from: ny2.x$a */
    public static final class C100265a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ TeenModePrivatePwdUI f293749d;

        public C100265a(TeenModePrivatePwdUI teenModePrivatePwdUI) {
            this.f293749d = teenModePrivatePwdUI;
        }

        public Object emit(Object obj, C15601d dVar) {
            String str;
            C47445a aVar = (C47445a) obj;
            Class cls = C10685q.class;
            if (aVar.f128348a == C47798b.OnEnd) {
                C89779i0 i0Var = this.f293749d.f282425i;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                if (aVar.f128350c == 0) {
                    C10685q qVar = (C10685q) C86312j.m106911c(cls);
                    C48805b34 b342 = (C48805b34) aVar.f128353f;
                    if (b342 == null || (str = b342.f130927d) == null) {
                        str = ((C10685q) C86312j.m106911c(cls)).f32106f;
                    }
                    qVar.f32106f = str;
                    ((C10685q) C86312j.m106911c(cls)).f32107g = 2;
                    Intent intent = new Intent(this.f293749d.getContext(), SettingsTeenModeMain.class);
                    intent.addFlags(67108864);
                    TeenModePrivatePwdUI teenModePrivatePwdUI = this.f293749d;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent);
                    TeenModePrivatePwdUI teenModePrivatePwdUI2 = teenModePrivatePwdUI;
                    C117292a.m165358d(teenModePrivatePwdUI2, aVar2.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$doModify$1$1", "emit", "(Lcom/tencent/mm/modelbase/flow/FlowEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    teenModePrivatePwdUI.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(teenModePrivatePwdUI2, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$doModify$1$1", "emit", "(Lcom/tencent/mm/modelbase/flow/FlowEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    C76912y0.m92768g(this.f293749d.getContext(), this.f293749d.getString(C0966R.string.a0g));
                    ((C10685q) C86312j.m106911c(cls)).mo10757ri(16);
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("result_err", aVar.f128351d);
                    this.f293749d.setResult(0, intent2);
                    this.f293749d.finish();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100264x(C45252f<C47445a<C48805b34>> fVar, TeenModePrivatePwdUI teenModePrivatePwdUI, C15601d<? super C100264x> dVar) {
        super(2, dVar);
        this.f293747e = fVar;
        this.f293748f = teenModePrivatePwdUI;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C100264x(this.f293747e, this.f293748f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C100264x) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f293746d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C45252f<C47445a<C48805b34>> fVar = this.f293747e;
            C100265a aVar2 = new C100265a(this.f293748f);
            this.f293746d = 1;
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
