package tf1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import fy3.C32224a;
import gy3.C87413o;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49335eu3;

/* renamed from: tf1.b */
public final class C13892b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13893c f39053d;

    /* renamed from: e */
    public final /* synthetic */ C89132b.C89134c<? extends C49335eu3> f39054e;

    /* renamed from: f */
    public final /* synthetic */ Object f39055f;

    /* renamed from: g */
    public final /* synthetic */ C13910j<C0740i2> f39056g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13892b(C13893c cVar, C89132b.C89134c<? extends C49335eu3> cVar2, Object obj, C13910j<C0740i2> jVar) {
        super(0);
        this.f39053d = cVar;
        this.f39054e = cVar2;
        this.f39055f = obj;
        this.f39056g = jVar;
    }

    public Object invoke() {
        C13893c cVar = this.f39053d;
        C89132b.C89134c<? extends C49335eu3> cVar2 = this.f39054e;
        IResponse<C0740i2> b = cVar.mo2700b(cVar2.f256793a, cVar2.f256794b, cVar2.f256795c, (C89132b) this.f39055f, cVar2.f256796d);
        if (b != null) {
            this.f39056g.onFetchDone(b);
        }
        return C13598b0.f38549a;
    }
}
