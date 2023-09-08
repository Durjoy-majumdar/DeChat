package sx3;

import hy3.C33145a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: sx3.b */
public abstract class C110816b<T> implements Iterator<T>, C33145a {

    /* renamed from: d */
    public C110817b1 f331538d = C110817b1.NotReady;

    /* renamed from: e */
    public T f331539e;

    /* renamed from: a */
    public abstract void mo51014a();

    public boolean hasNext() {
        C110817b1 b1Var = this.f331538d;
        C110817b1 b1Var2 = C110817b1.Failed;
        if (b1Var != b1Var2) {
            int ordinal = b1Var.ordinal();
            if (ordinal == 0) {
                return true;
            }
            if (ordinal != 2) {
                this.f331538d = b1Var2;
                mo51014a();
                if (this.f331538d == C110817b1.Ready) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public T next() {
        if (hasNext()) {
            this.f331538d = C110817b1.NotReady;
            return this.f331539e;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
