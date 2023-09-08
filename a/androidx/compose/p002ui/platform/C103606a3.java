package androidx.compose.p002ui.platform;

import fy3.C32227p;
import gy3.C87413o;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: androidx.compose.ui.platform.a3 */
public final class C103606a3 extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WrappedComposition f306051d;

    /* renamed from: e */
    public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f306052e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103606a3(WrappedComposition wrappedComposition, C32227p<? super C108504h, ? super Integer, C13598b0> pVar) {
        super(2);
        this.f306051d = wrappedComposition;
        this.f306052e = pVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            C103691v.m137993a(this.f306051d.f306042d, this.f306052e, hVar, 8);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
