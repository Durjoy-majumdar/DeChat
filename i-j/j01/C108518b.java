package j01;

import a14.C0000n0;
import fy3.C32227p;
import gy3.C87412m;
import java.io.BufferedReader;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.cast.transportclient.reader.RemoteReader$destroyReader$2", mo125469f = "RemoteReader.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: j01.b */
public final class C108518b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C108519c f324841d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108518b(C108519c cVar, C15601d<? super C108518b> dVar) {
        super(2, dVar);
        this.f324841d = cVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C108518b(this.f324841d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C108518b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        BufferedReader bufferedReader = this.f324841d.f324844c;
        if (bufferedReader != null) {
            bufferedReader.close();
            return C13598b0.f38549a;
        }
        C87412m.m108603p("reader");
        throw null;
    }
}
