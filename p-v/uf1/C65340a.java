package uf1;

import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import kotlin.Result;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49335eu3;
import tf1.C13914m;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C66447b;

/* renamed from: uf1.a */
public final class C65340a<T extends C13914m> extends C65345d<T> {

    /* renamed from: b */
    public C89132b<?> f188092b;

    /* renamed from: c */
    public C32226l<? super C89132b.C89134c<?>, ? extends IResponse<T>> f188093c;

    /* renamed from: uf1.a$a */
    public static final class C65341a extends C87413o implements C32226l<C89132b.C89134c<? extends C49335eu3>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65340a<T> f188094d;

        /* renamed from: e */
        public final /* synthetic */ C15601d<IResponse<T>> f188095e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65341a(C65340a<T> aVar, C15601d<? super IResponse<T>> dVar) {
            super(1);
            this.f188094d = aVar;
            this.f188095e = dVar;
        }

        public Object invoke(Object obj) {
            IResponse iResponse;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C32226l<? super C89132b.C89134c<?>, ? extends IResponse<T>> lVar = this.f188094d.f188093c;
            if (lVar != null) {
                C87412m.m108593f(cVar, LocaleUtil.ITALIAN);
                iResponse = (IResponse) ((C65343b) lVar).invoke(cVar);
            } else {
                iResponse = null;
            }
            this.f188095e.resumeWith(Result.m168114constructorimpl(iResponse));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: uf1.a$b */
    public static final class C65342b implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C32226l f188096a;

        public C65342b(C32226l lVar) {
            this.f188096a = lVar;
        }

        public final /* synthetic */ Object call(Object obj) {
            return this.f188096a.invoke(obj);
        }
    }

    /* renamed from: a */
    public Object mo89453a(C15601d<? super IResponse<T>> dVar) {
        C89132b<?> bVar = this.f188092b;
        if (bVar == null) {
            return null;
        }
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        bVar.mo9225i().mo123419C(new C65342b(new C65341a(this, hVar)));
        return hVar.mo90314b();
    }
}
