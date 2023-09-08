package ac2;

import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import zb2.C103001d;
import zb2.C66778l;

/* renamed from: ac2.g */
public final class C54001g<T extends C103001d<T>> extends C53996a<T> {

    /* renamed from: d */
    public final List<T> f151267d;

    /* renamed from: ac2.g$a */
    public static final class C54002a extends C87413o implements C32226l<Integer, T> {

        /* renamed from: d */
        public final /* synthetic */ C54001g<T> f151268d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54002a(C54001g<T> gVar) {
            super(1);
            this.f151268d = gVar;
        }

        public Object invoke(Object obj) {
            return (C103001d) this.f151268d.f151267d.get(((Number) obj).intValue());
        }
    }

    public C54001g(List<? extends T> list) {
        C87412m.m108594g(list, "dataList");
        this.f151267d = list;
    }

    /* renamed from: b */
    public C45252f<C39534d<T>> mo70650e(LifecycleScope lifecycleScope, C53998c<T> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C66778l.C66779a aVar = C66778l.f191877a;
        return aVar.mo90783a(lifecycleScope, aVar.mo90784b(this.f151267d.size(), cVar, new C54002a(this)));
    }
}
