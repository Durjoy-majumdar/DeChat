package ke1;

import a14.C0000n0;
import c14.C54625h;
import c14.C54630l;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C51981xj0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.cgi.fetcher.FinderEnhanceStreamFetcher$fetch$2$1$1", mo125469f = "FinderEnhanceStreamFetcher.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: ke1.k */
public final class C9592k extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C54625h<C89132b.C89134c<C51981xj0>> f29831d;

    /* renamed from: e */
    public final /* synthetic */ C89132b.C89134c<C51981xj0> f29832e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9592k(C54625h<C89132b.C89134c<C51981xj0>> hVar, C89132b.C89134c<C51981xj0> cVar, C15601d<? super C9592k> dVar) {
        super(2, dVar);
        this.f29831d = hVar;
        this.f29832e = cVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C9592k(this.f29831d, this.f29832e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C9592k) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        Log.m105928w("Finder.EnhanceStreamFetcher", "send...");
        C54625h<C89132b.C89134c<C51981xj0>> hVar = this.f29831d;
        C89132b.C89134c<C51981xj0> cVar = this.f29832e;
        C87412m.m108593f(cVar, LocaleUtil.ITALIAN);
        Object t = hVar.mo75539t(cVar);
        StringBuilder sb = new StringBuilder();
        sb.append("done[");
        sb.append(!(t instanceof C54630l.C54632b));
        sb.append(']');
        Log.m105928w("Finder.EnhanceStreamFetcher", sb.toString());
        return C13598b0.f38549a;
    }
}
