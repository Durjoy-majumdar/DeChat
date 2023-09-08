package b04;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;
import n04.C25143j0;
import p04.C25416i;
import p04.C25417j;
import rx3.C13598b0;
import wy3.C26448e0;

/* renamed from: b04.l */
public abstract class C23655l extends C23649g<C13598b0> {

    /* renamed from: b04.l$a */
    public static final class C23656a extends C23655l {

        /* renamed from: b */
        public final String f67845b;

        public C23656a(String str) {
            C87412m.m108594g(str, StateEvent.Name.MESSAGE);
            this.f67845b = str;
        }

        /* renamed from: a */
        public C25143j0 mo37191a(C26448e0 e0Var) {
            C87412m.m108594g(e0Var, "module");
            return C25417j.m32698c(C25416i.ERROR_CONSTANT_VALUE, this.f67845b);
        }

        public String toString() {
            return this.f67845b;
        }
    }

    public C23655l() {
        super(C13598b0.f38549a);
    }

    /* renamed from: b */
    public Object mo37196b() {
        throw new UnsupportedOperationException();
    }
}
