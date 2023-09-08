package p226rg;

import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p861pg.C62279a;
import zb2.C66778l;

/* renamed from: rg.b */
public final class C63408b extends C53996a<C62279a> {

    /* renamed from: d */
    public final List<C62279a> f179891d;

    /* renamed from: rg.b$a */
    public static final class C63409a extends C87413o implements C32226l<Integer, C62279a> {

        /* renamed from: d */
        public final /* synthetic */ C63408b f179892d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63409a(C63408b bVar) {
            super(1);
            this.f179892d = bVar;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C62279a aVar = this.f179892d.f179891d.get(intValue);
            return new C62279a(aVar.toString(), intValue, aVar.f177044f, aVar.f177045g, aVar.f177046h, aVar.f177047i);
        }
    }

    public C63408b(List<? extends C62279a> list) {
        C87412m.m108594g(list, "dataList");
        this.f179891d = list;
    }

    /* renamed from: b */
    public C45252f<C39534d<C62279a>> mo70650e(LifecycleScope lifecycleScope, C53998c<C62279a> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C66778l.C66779a aVar = C66778l.f191877a;
        return aVar.mo90783a(lifecycleScope, aVar.mo90784b(this.f179891d.size(), cVar, new C63409a(this)));
    }
}
