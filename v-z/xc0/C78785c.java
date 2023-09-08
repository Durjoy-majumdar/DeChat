package xc0;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C48662a4;
import wx3.C15601d;
import xc0.C78786d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.modelremark.RemarkCdnDownloadServicePLC$Companion$startDownLoad$1", mo125469f = "RemarkCdnDownloadServicePLC.kt", mo125470l = {43}, mo125471m = "invokeSuspend")
/* renamed from: xc0.c */
public final class C78785c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f230529d;

    /* renamed from: e */
    public final /* synthetic */ String f230530e;

    /* renamed from: f */
    public final /* synthetic */ C48662a4 f230531f;

    /* renamed from: g */
    public final /* synthetic */ int f230532g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78785c(String str, C48662a4 a4Var, int i, C15601d<? super C78785c> dVar) {
        super(2, dVar);
        this.f230530e = str;
        this.f230531f = a4Var;
        this.f230532g = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C78785c(this.f230530e, this.f230531f, this.f230532g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C78785c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f230529d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C78786d.C78787a aVar2 = C78786d.f230533a;
            String str = this.f230530e;
            C48662a4 a4Var = this.f230531f;
            int i2 = this.f230532g;
            this.f230529d = 1;
            if (C78786d.C78787a.m95192a(aVar2, str, a4Var, i2, this) == aVar) {
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
