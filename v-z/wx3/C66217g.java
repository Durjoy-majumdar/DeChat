package wx3;

import fy3.C32227p;
import gy3.C87412m;
import java.io.Serializable;
import wx3.C66212f;

/* renamed from: wx3.g */
public final class C66217g implements C66212f, Serializable {

    /* renamed from: d */
    public static final C66217g f190253d = new C66217g();

    public <R> R fold(R r, C32227p<? super R, ? super C66212f.C66215b, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return r;
    }

    public <E extends C66212f.C66215b> E get(C66212f.C15602c<E> cVar) {
        C87412m.m108594g(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public C66212f minusKey(C66212f.C15602c<?> cVar) {
        C87412m.m108594g(cVar, "key");
        return this;
    }

    public C66212f plus(C66212f fVar) {
        C87412m.m108594g(fVar, "context");
        return fVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
