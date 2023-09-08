package androidx.compose.p002ui.platform;

import fy3.C32224a;
import gy3.C87412m;
import java.util.List;
import java.util.Map;
import p683s0.C110688i;
import rx3.C13598b0;

/* renamed from: androidx.compose.ui.platform.p0 */
public final class C103675p0 implements C110688i {

    /* renamed from: a */
    public final C32224a<C13598b0> f306232a;

    /* renamed from: b */
    public final /* synthetic */ C110688i f306233b;

    public C103675p0(C110688i iVar, C32224a<C13598b0> aVar) {
        C87412m.m108594g(iVar, "saveableStateRegistry");
        C87412m.m108594g(aVar, "onDispose");
        this.f306232a = aVar;
        this.f306233b = iVar;
    }

    /* renamed from: a */
    public boolean mo60744a(Object obj) {
        C87412m.m108594g(obj, "value");
        return this.f306233b.mo60744a(obj);
    }

    /* renamed from: b */
    public C110688i.C110689a mo60745b(String str, C32224a<? extends Object> aVar) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(aVar, "valueProvider");
        return this.f306233b.mo60745b(str, aVar);
    }

    /* renamed from: c */
    public Map<String, List<Object>> mo60746c() {
        return this.f306233b.mo60746c();
    }

    /* renamed from: d */
    public Object mo60747d(String str) {
        C87412m.m108594g(str, "key");
        return this.f306233b.mo60747d(str);
    }
}
