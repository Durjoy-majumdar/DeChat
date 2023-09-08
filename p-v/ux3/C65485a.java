package ux3;

import fy3.C32226l;
import java.util.Comparator;

/* renamed from: ux3.a */
public final class C65485a<T> implements Comparator {

    /* renamed from: d */
    public final /* synthetic */ C32226l<T, Comparable<?>>[] f188438d;

    public C65485a(C32226l<? super T, ? extends Comparable<?>>[] lVarArr) {
        this.f188438d = lVarArr;
    }

    public final int compare(T t, T t2) {
        for (C32226l<T, Comparable<?>> lVar : this.f188438d) {
            int a = C65486b.m77169a(lVar.invoke(t), lVar.invoke(t2));
            if (a != 0) {
                return a;
            }
        }
        return 0;
    }
}
