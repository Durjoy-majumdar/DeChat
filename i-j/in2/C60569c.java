package in2;

import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import zb2.C66778l;

/* renamed from: in2.c */
public final class C60569c extends C53996a<C9205a> {

    /* renamed from: d */
    public final List<C9205a> f172645d;

    /* renamed from: in2.c$a */
    public static final class C9207a extends C87413o implements C32226l<Integer, C9205a> {

        /* renamed from: d */
        public final /* synthetic */ C60569c f28955d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9207a(C60569c cVar) {
            super(1);
            this.f28955d = cVar;
        }

        public Object invoke(Object obj) {
            return this.f28955d.f172645d.get(((Number) obj).intValue());
        }
    }

    public C60569c(List<C9205a> list) {
        C87412m.m108594g(list, "dataList");
        this.f172645d = list;
    }

    /* renamed from: b */
    public C45252f<C39534d<C9205a>> mo70650e(LifecycleScope lifecycleScope, C53998c<C9205a> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C66778l.C66779a aVar = C66778l.f191877a;
        return aVar.mo90783a(lifecycleScope, aVar.mo90784b(this.f172645d.size(), cVar, new C9207a(this)));
    }
}
