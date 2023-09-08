package qp3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import qp3.C118204f;

/* renamed from: qp3.g */
public class C118206g<S, T> implements Iterator<T> {

    /* renamed from: d */
    public final Iterator<? extends S> f353348d;

    /* renamed from: e */
    public final C118204f.C118205a<S, T> f353349e;

    /* renamed from: f */
    public final boolean f353350f;

    /* renamed from: g */
    public T f353351g;

    /* renamed from: h */
    public boolean f353352h;

    public C118206g(Iterator<? extends S> it, C118204f.C118205a<S, T> aVar, boolean z) {
        this.f353348d = it;
        this.f353349e = aVar;
        this.f353350f = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x000e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasNext() {
        /*
            r3 = this;
            boolean r0 = r3.f353352h
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.util.Iterator<? extends S> r0 = r3.f353348d
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x0025
            java.util.Iterator<? extends S> r0 = r3.f353348d
            java.lang.Object r0 = r0.next()
            qp3.f$a<S, T> r2 = r3.f353349e
            java.lang.Object r0 = r2.mo105957f(r0)
            r3.f353351g = r0
            if (r0 != 0) goto L_0x0022
            boolean r0 = r3.f353350f
            if (r0 == 0) goto L_0x0006
        L_0x0022:
            r3.f353352h = r1
            return r1
        L_0x0025:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qp3.C118206g.hasNext():boolean");
    }

    public T next() {
        if (this.f353352h || hasNext()) {
            T t = this.f353351g;
            this.f353351g = null;
            this.f353352h = false;
            return t;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
