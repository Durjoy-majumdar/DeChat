package pa0;

import bl3.C39818r;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45253g;
import fy3.C32228q;
import gy3.C8477a0;
import i21.C60242i;
import k21.C60960c;
import kotlin.ResultKt;
import la0.C61242a;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.sns.uic.SnsTemplateControlUIC$onTemplateChange$4", mo125469f = "SnsTemplateControlUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: pa0.o */
public final class C62238o extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public /* synthetic */ Object f176929d;

    /* renamed from: e */
    public final /* synthetic */ C8477a0 f176930e;

    /* renamed from: f */
    public final /* synthetic */ C62211a f176931f;

    /* renamed from: g */
    public final /* synthetic */ String f176932g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62238o(C8477a0 a0Var, C62211a aVar, String str, C15601d<? super C62238o> dVar) {
        super(3, dVar);
        this.f176930e = a0Var;
        this.f176931f = aVar;
        this.f176932g = str;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C45253g gVar = (C45253g) obj;
        C62238o oVar = new C62238o(this.f176930e, this.f176931f, this.f176932g, (C15601d) obj3);
        oVar.f176929d = (Throwable) obj2;
        return oVar.invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        Throwable th = (Throwable) this.f176929d;
        Log.m105924i("MicroMsg.SnsTemplate.TemplateControlUIC", "change on completion");
        this.f176930e.f27482d = th == null;
        this.f176931f.mo87300k3();
        this.f176931f.mo87296f3().dismiss();
        this.f176931f.mo87298i3();
        this.f176931f.f176880z = System.currentTimeMillis();
        C60960c.C60961a.m71445p(C60960c.f173618a, "SnsTemplate", "editdetail", "vediotime", new Long(((C61242a) C39818r.f106831a.mo62443b(this.f176931f.getContext()).mo62447c(C61242a.class)).mo86219c0()), (C60242i) null, false, (String) null, (String) null, 240, (Object) null);
        this.f176931f.mo87299j3(this.f176932g);
        return C13598b0.f38549a;
    }
}
