package p247u3;

import fy3.C32226l;
import gy3.C87412m;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import p247u3.C65014b0;
import p247u3.C65145q1;
import sx3.C110818d0;

/* renamed from: u3.h1 */
public final class C65067h1<T> extends AbstractList<T> implements C65014b0.C65015a<Object> {

    /* renamed from: d */
    public final List<C65145q1.C65150b.C65152b<?, T>> f187272d;

    /* renamed from: e */
    public int f187273e;

    /* renamed from: f */
    public int f187274f;

    /* renamed from: g */
    public int f187275g;

    /* renamed from: h */
    public int f187276h;

    /* renamed from: u3.h1$a */
    public interface C65068a {
        /* renamed from: f */
        void mo89274f(int i);
    }

    public C65067h1() {
        this.f187272d = new ArrayList();
    }

    /* renamed from: f */
    public final void mo89269f(int i, C65145q1.C65150b.C65152b<?, T> bVar, int i2, int i3, C65068a aVar, boolean z) {
        C87412m.m108594g(bVar, "page");
        C87412m.m108594g(aVar, "callback");
        this.f187273e = i;
        ((ArrayList) this.f187272d).clear();
        ((ArrayList) this.f187272d).add(bVar);
        this.f187274f = i2;
        this.f187275g = bVar.f187562a.size();
        this.f187276h = bVar.f187562a.size() / 2;
        aVar.mo89274f(size());
    }

    public T get(int i) {
        int i2 = i - this.f187273e;
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size());
        } else if (i2 < 0 || i2 >= this.f187275g) {
            return null;
        } else {
            int size = ((ArrayList) this.f187272d).size();
            int i3 = 0;
            while (i3 < size) {
                int size2 = ((C65145q1.C65150b.C65152b) ((ArrayList) this.f187272d).get(i3)).f187562a.size();
                if (size2 > i2) {
                    break;
                }
                i2 -= size2;
                i3++;
            }
            return ((C65145q1.C65150b.C65152b) ((ArrayList) this.f187272d).get(i3)).f187562a.get(i2);
        }
    }

    public final /* bridge */ T remove(int i) {
        return super.remove(i);
    }

    public final int size() {
        return this.f187273e + this.f187275g + this.f187274f;
    }

    public String toString() {
        return "leading " + this.f187273e + ", storage " + this.f187275g + ", trailing " + this.f187274f + ' ' + C110818d0.m150921S(this.f187272d, " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
    }

    public C65067h1(C65067h1<T> h1Var) {
        ArrayList arrayList = new ArrayList();
        this.f187272d = arrayList;
        arrayList.addAll(h1Var.f187272d);
        this.f187273e = h1Var.f187273e;
        this.f187274f = h1Var.f187274f;
        this.f187275g = h1Var.f187275g;
        this.f187276h = h1Var.f187276h;
    }
}
