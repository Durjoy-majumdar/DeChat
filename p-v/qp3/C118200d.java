package qp3;

import com.tencent.p014mm.vfs.C116309m;
import com.tencent.p014mm.vfs.C86001b0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import qp3.C118198c;

/* renamed from: qp3.d */
public class C118200d<T> implements Iterator<T> {

    /* renamed from: d */
    public final Iterator<? extends T> f353339d;

    /* renamed from: e */
    public final C118198c.C118199a<T> f353340e;

    /* renamed from: f */
    public T f353341f;

    /* renamed from: g */
    public boolean f353342g;

    public C118200d(Iterator<? extends T> it, C118198c.C118199a<T> aVar) {
        this.f353339d = it;
        this.f353340e = aVar;
    }

    public boolean hasNext() {
        boolean z;
        T next;
        if (this.f353342g) {
            return true;
        }
        do {
            z = false;
            if (!this.f353339d.hasNext()) {
                return false;
            }
            next = this.f353339d.next();
            C116309m.C116311c cVar = (C116309m.C116311c) this.f353340e;
            cVar.getClass();
            C86001b0 b0Var = (C86001b0) next;
            if (b0Var == null || !cVar.f349029a.add(b0Var.f250471a)) {
                z = true;
                continue;
            }
        } while (z);
        this.f353341f = next;
        this.f353342g = true;
        return true;
    }

    public T next() {
        if (this.f353342g || hasNext()) {
            T t = this.f353341f;
            this.f353341f = null;
            this.f353342g = false;
            return t;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
