package p247u3;

import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import my3.C61594j;
import p247u3.C65056f2;
import p247u3.C65086n0;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C64197v;

/* renamed from: u3.a1 */
public final class C65007a1<T> {

    /* renamed from: e */
    public static final C65007a1<Object> f187138e = new C65007a1<>(C65086n0.C65088b.f187325f);

    /* renamed from: a */
    public final List<C65048d2<T>> f187139a;

    /* renamed from: b */
    public int f187140b;

    /* renamed from: c */
    public int f187141c;

    /* renamed from: d */
    public int f187142d;

    /* renamed from: u3.a1$a */
    public interface C65008a {
        /* renamed from: a */
        void mo89224a(C65069i0 i0Var, boolean z, C65060g0 g0Var);
    }

    public C65007a1(C65086n0.C65088b<T> bVar) {
        C87412m.m108594g(bVar, "insertEvent");
        this.f187139a = C110818d0.m150900B0(bVar.f187328b);
        int i = 0;
        for (C65048d2 d2Var : bVar.f187328b) {
            i += d2Var.f187233b.size();
        }
        this.f187140b = i;
        this.f187141c = bVar.f187329c;
        this.f187142d = bVar.f187330d;
    }

    /* renamed from: a */
    public final C65056f2.C65057a mo89219a(int i) {
        int i2 = i - this.f187141c;
        int i3 = 0;
        while (i2 >= ((C65048d2) ((ArrayList) this.f187139a).get(i3)).f187233b.size() && i3 < C64197v.m75536e(this.f187139a)) {
            i2 -= ((C65048d2) ((ArrayList) this.f187139a).get(i3)).f187233b.size();
            i3++;
        }
        C65048d2 d2Var = (C65048d2) ((ArrayList) this.f187139a).get(i3);
        int i4 = i - this.f187141c;
        int d = ((mo89222d() - i) - this.f187142d) - 1;
        Integer Q = C110823p.m150991Q(((C65048d2) C110818d0.m150914L(this.f187139a)).f187232a);
        C87412m.m108591d(Q);
        int intValue = Q.intValue();
        Integer P = C110823p.m150990P(((C65048d2) C110818d0.m150923U(this.f187139a)).f187232a);
        C87412m.m108591d(P);
        int intValue2 = P.intValue();
        int i5 = d2Var.f187234c;
        List<Integer> list = d2Var.f187235d;
        if (list != null && C64197v.m75535d(list).mo86532k(i2)) {
            i2 = d2Var.f187235d.get(i2).intValue();
        }
        return new C65056f2.C65057a(i5, i2, i4, d, intValue, intValue2);
    }

    /* renamed from: b */
    public final int mo89220b(C61594j jVar) {
        boolean z;
        Iterator it = ((ArrayList) this.f187139a).iterator();
        int i = 0;
        while (it.hasNext()) {
            C65048d2 d2Var = (C65048d2) it.next();
            int[] iArr = d2Var.f187232a;
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                } else if (jVar.mo86532k(iArr[i2])) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                i += d2Var.f187233b.size();
                it.remove();
            }
        }
        return i;
    }

    /* renamed from: c */
    public T mo89221c(int i) {
        int size = ((ArrayList) this.f187139a).size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((C65048d2) ((ArrayList) this.f187139a).get(i2)).f187233b.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((C65048d2) ((ArrayList) this.f187139a).get(i2)).f187233b.get(i);
    }

    /* renamed from: d */
    public int mo89222d() {
        return this.f187141c + this.f187140b + this.f187142d;
    }

    public String toString() {
        int i = this.f187140b;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(mo89221c(i2));
        }
        String S = C110818d0.m150921S(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 63, (Object) null);
        return "[(" + this.f187141c + " placeholders), " + S + ", (" + this.f187142d + " placeholders)]";
    }
}
