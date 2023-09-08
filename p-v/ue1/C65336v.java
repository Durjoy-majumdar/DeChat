package ue1;

import a14.C0000n0;
import android.graphics.Bitmap;
import c14.C54625h;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.conv.FinderGlobalPushNewXmlConsumer$dispatchNotify$2$1$1", mo125469f = "FinderGlobalPushNewXmlConsumer.kt", mo125470l = {935}, mo125471m = "invokeSuspend")
/* renamed from: ue1.v */
public final class C65336v extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f188058d;

    /* renamed from: e */
    public final /* synthetic */ C54625h<Bitmap> f188059e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65336v(C54625h<Bitmap> hVar, C15601d<? super C65336v> dVar) {
        super(2, dVar);
        this.f188059e = hVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C65336v(this.f188059e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C65336v) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f188058d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C54625h<Bitmap> hVar = this.f188059e;
            this.f188058d = 1;
            if (hVar.mo75536o(null, this) == aVar) {
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
