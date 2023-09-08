package p854l0;

import fy3.C32226l;
import hy3.C33145a;
import hy3.C60231b;
import hy3.C60233d;
import java.util.Collection;
import java.util.List;

/* renamed from: l0.c */
public interface C109072c<E> extends C109070a<E>, Collection, C33145a {

    /* renamed from: l0.c$a */
    public interface C109073a<E> extends List<E>, Collection, C60231b, C60233d {
        C109072c<E> build();
    }

    /* renamed from: H0 */
    C109072c<E> mo160315H0(C32226l<? super E, Boolean> lVar);

    C109072c<E> add(int i, E e);

    C109072c<E> add(E e);

    C109072c<E> addAll(Collection<? extends E> collection);

    /* renamed from: d */
    C109073a<E> mo160319d();

    /* renamed from: n0 */
    C109072c<E> mo160320n0(int i);

    C109072c<E> remove(E e);

    C109072c<E> removeAll(Collection<? extends E> collection);

    C109072c<E> set(int i, E e);
}
