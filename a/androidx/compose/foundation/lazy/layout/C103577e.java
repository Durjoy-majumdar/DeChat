package androidx.compose.foundation.lazy.layout;

import fy3.C32227p;
import gy3.C87413o;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: androidx.compose.foundation.lazy.layout.e */
public final class C103577e extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C103583j f305895d;

    /* renamed from: e */
    public final /* synthetic */ int f305896e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103577e(C103583j jVar, int i) {
        super(2);
        this.f305895d = jVar;
        this.f305896e = i;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            this.f305895d.mo75146b(this.f305896e, hVar, 0);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
