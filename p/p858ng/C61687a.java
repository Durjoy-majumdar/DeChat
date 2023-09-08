package p858ng;

import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p855lg.C61278a;
import zb2.C66778l;

/* renamed from: ng.a */
public final class C61687a extends C53996a<C61278a> {

    /* renamed from: d */
    public final List<C61278a> f175383d;

    /* renamed from: ng.a$a */
    public static final class C61688a extends C87413o implements C32226l<Integer, C61278a> {

        /* renamed from: d */
        public final /* synthetic */ C61687a f175384d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61688a(C61687a aVar) {
            super(1);
            this.f175384d = aVar;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C61278a aVar = this.f175384d.f175383d.get(intValue);
            return new C61278a(aVar.toString(), intValue, aVar.f174387f, aVar.f174388g, aVar.f174389h, aVar.f174390i);
        }
    }

    public C61687a(List<C61278a> list) {
        C87412m.m108594g(list, "dataList");
        this.f175383d = list;
    }

    /* renamed from: b */
    public C45252f<C39534d<C61278a>> mo70650e(LifecycleScope lifecycleScope, C53998c<C61278a> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C66778l.C66779a aVar = C66778l.f191877a;
        return aVar.mo90783a(lifecycleScope, aVar.mo90784b(this.f175383d.size(), cVar, new C61688a(this)));
    }
}
