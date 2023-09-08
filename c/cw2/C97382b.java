package cw2;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: cw2.b */
public final class C97382b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C97383c f285880d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97382b(C97383c cVar) {
        super(0);
        this.f285880d = cVar;
    }

    public Object invoke() {
        try {
            C97383c cVar = this.f285880d;
            C97383c.m125400a(cVar, "pic/", cVar.f285882b / 10, cVar.f285883c);
            C97383c cVar2 = this.f285880d;
            C97383c.m125400a(cVar2, "video/", cVar2.f285882b, cVar2.f285883c);
        } catch (Exception e) {
            Log.printErrStackTrace(this.f285880d.f285881a, e, "", new Object[0]);
        }
        return C13598b0.f38549a;
    }
}
