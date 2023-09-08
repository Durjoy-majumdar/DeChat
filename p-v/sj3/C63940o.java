package sj3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50008jm0;

/* renamed from: sj3.o */
public final class C63940o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C89132b.C89134c<C50008jm0> f181251d;

    /* renamed from: e */
    public final /* synthetic */ String f181252e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<FinderObject, C13598b0> f181253f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63940o(C89132b.C89134c<C50008jm0> cVar, String str, C32226l<? super FinderObject, C13598b0> lVar) {
        super(0);
        this.f181251d = cVar;
        this.f181252e = str;
        this.f181253f = lVar;
    }

    public Object invoke() {
        if (((C50008jm0) this.f181251d.f256796d).f136184e != null) {
            C63941p pVar = C63941p.f181254a;
            Log.m105924i("BizChatUtil", "it.resp.feedObject != null");
            C63941p.f181256c.put(this.f181252e, ((C50008jm0) this.f181251d.f256796d).f136184e);
        }
        C32226l<FinderObject, C13598b0> lVar = this.f181253f;
        if (lVar != null) {
            lVar.invoke(((C50008jm0) this.f181251d.f256796d).f136184e);
        }
        return C13598b0.f38549a;
    }
}
