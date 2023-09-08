package pa0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45253g;
import fy3.C32228q;
import kotlin.ResultKt;
import nj3.C76912y0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.sns.uic.SnsTemplateControlUIC$onTemplateChange$3", mo125469f = "SnsTemplateControlUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: pa0.n */
public final class C62237n extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public /* synthetic */ Object f176927d;

    /* renamed from: e */
    public final /* synthetic */ C62211a f176928e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62237n(C62211a aVar, C15601d<? super C62237n> dVar) {
        super(3, dVar);
        this.f176928e = aVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C45253g gVar = (C45253g) obj;
        C62237n nVar = new C62237n(this.f176928e, (C15601d) obj3);
        nVar.f176927d = (Throwable) obj2;
        return nVar.invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        Log.printErrStackTrace("MicroMsg.SnsTemplate.TemplateControlUIC", (Throwable) this.f176927d, "maas error", new Object[0]);
        this.f176928e.mo87296f3().dismiss();
        C76912y0.m92767f(this.f176928e.getContext(), this.f176928e.getString(C0966R.string.aui));
        return C13598b0.f38549a;
    }
}
