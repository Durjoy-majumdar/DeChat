package on1;

import a14.C0000n0;
import fy3.C32227p;
import gy3.C8480h;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$removeByLocalId$1", mo125469f = "FinderDefaultLoaderActions.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: on1.j */
public final class C11531j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C11533k f33855d;

    /* renamed from: e */
    public final /* synthetic */ long f33856e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11531j(C11533k kVar, long j, C15601d<? super C11531j> dVar) {
        super(2, dVar);
        this.f33855d = kVar;
        this.f33856e = j;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C11531j(this.f33855d, this.f33856e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C11531j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        this.f33855d.f33860d.mo11503e3(new C11514d(0, 0, this.f33856e, 3, (C8480h) null), false);
        return C13598b0.f38549a;
    }
}
