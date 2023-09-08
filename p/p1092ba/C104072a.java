package p1092ba;

import android.graphics.Rect;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import sx3.C110818d0;
import sx3.C64197v;
import ux3.C65486b;

/* renamed from: ba.a */
public final class C104072a {

    /* renamed from: a */
    public static final C104072a f307806a = new C104072a();

    /* renamed from: ba.a$a */
    public static final class C104073a {

        /* renamed from: a */
        public final int f307807a;

        /* renamed from: b */
        public final String f307808b;

        /* renamed from: c */
        public Rect f307809c;

        public C104073a(int i, String str, Rect rect) {
            C87412m.m108594g(str, "username");
            C87412m.m108594g(rect, "rect");
            this.f307807a = i;
            this.f307808b = str;
            this.f307809c = rect;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C104073a)) {
                return false;
            }
            C104073a aVar = (C104073a) obj;
            return this.f307807a == aVar.f307807a && C87412m.m108589b(this.f307808b, aVar.f307808b) && C87412m.m108589b(this.f307809c, aVar.f307809c);
        }

        public int hashCode() {
            return (((this.f307807a * 31) + this.f307808b.hashCode()) * 31) + this.f307809c.hashCode();
        }

        public String toString() {
            return "LayoutInfo(idx=" + this.f307807a + ", username=" + this.f307808b + ", rect=" + this.f307809c + ')';
        }
    }

    /* renamed from: ba.a$b */
    public static final class C104074b<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(((C104073a) t).f307807a), Integer.valueOf(((C104073a) t2).f307807a));
        }
    }

    /* renamed from: a */
    public final List<C104073a> mo145668a(List<C104073a> list, int i, int i2, int i3, boolean z) {
        int i4 = i3 / i2;
        ArrayList arrayList = new ArrayList();
        for (List<C104073a> list2 : C110818d0.m150901C(list, i2)) {
            int size = (!z || list2.size() == i2) ? 0 : (i3 - (list2.size() * i4)) / 2;
            for (C104073a aVar : list2) {
                int i5 = size + i4;
                Rect rect = new Rect(size, i, i5, i + i4);
                if (!(!C87412m.m108589b(rect, aVar.f307809c))) {
                    rect = null;
                }
                if (rect != null) {
                    aVar.f307809c = rect;
                    arrayList.add(aVar);
                }
                size = i5;
            }
            i += i4;
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List<C104073a> mo145669b(List<C104073a> list, int i, int i2, int i3) {
        int i4;
        List<C104073a> list2 = list;
        int i5 = i;
        int i6 = i2;
        C87412m.m108594g(list2, "layoutList");
        list.size();
        List<T> o0 = C110818d0.m150943o0(list2, new C104074b());
        boolean z = true;
        int i7 = 0;
        if (i5 < 0) {
            return mo145668a(o0, (o0.size() > 2 || i3 == 0) ? 0 : (i3 - (i6 / 2)) / 2, o0.size() <= 4 ? 2 : 3, i2, o0.size() < 4);
        } else if (o0.size() <= 4) {
            ArrayList arrayList = new ArrayList();
            C104073a aVar = (C104073a) C110818d0.m150917O(o0, i5);
            if (aVar != null) {
                Rect rect = new Rect(0, 0, i6, i6);
                C104073a aVar2 = C87412m.m108589b(aVar.f307809c, rect) ^ true ? aVar : null;
                if (aVar2 != null) {
                    aVar2.f307809c = rect;
                    arrayList.add(aVar2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (T next : o0) {
                if (((C104073a) next).f307807a != i5) {
                    arrayList2.add(next);
                }
            }
            arrayList.addAll(mo145668a(arrayList2, i2, 3, i2, false));
            return arrayList;
        } else {
            ArrayList arrayList3 = new ArrayList();
            int i8 = i5 / 3;
            if (i5 >= 3) {
                arrayList3.addAll(mo145668a(o0.subList(0, i5 - (i5 % 3)), 0, 3, i2, false));
            }
            int i9 = i6 / 3;
            int i15 = (i8 * i9) + 0;
            int i16 = i8 * 3;
            int i17 = (i8 + 1) * 3;
            List<T> subList = o0.subList(i16, Math.min(i17, o0.size()));
            int i18 = i5 % 3;
            ArrayList arrayList4 = new ArrayList();
            boolean z2 = false;
            int i19 = 0;
            int i25 = 0;
            int i26 = 0;
            for (T next2 : subList) {
                int i27 = i7 + 1;
                if (i7 >= 0) {
                    C104073a aVar3 = (C104073a) next2;
                    if (i7 == i18) {
                        if (i19 == 0) {
                            i25 = i9 * 2;
                        }
                        int i28 = i9 * 2;
                        Rect rect2 = new Rect(i19, i15, i19 + i28, i28 + i15);
                        if (!(C87412m.m108589b(aVar3.f307809c, rect2) ^ z)) {
                            aVar3 = null;
                        }
                        if (aVar3 != null) {
                            aVar3.f307809c = rect2;
                            arrayList4.add(aVar3);
                        }
                        i4 = i18;
                        z2 = true;
                    } else {
                        if (!z2) {
                            i19 = i9;
                        }
                        int i29 = i15 + i26;
                        i4 = i18;
                        Rect rect3 = new Rect(i25, i29, i25 + i9, i29 + i9);
                        z = true;
                        if (!(!C87412m.m108589b(aVar3.f307809c, rect3))) {
                            aVar3 = null;
                        }
                        if (aVar3 != null) {
                            aVar3.f307809c = rect3;
                            arrayList4.add(aVar3);
                        }
                        i26 += i9;
                    }
                    i18 = i4;
                    i7 = i27;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            arrayList3.addAll(arrayList4);
            int i35 = (i9 * 2) + i15;
            if (i17 < o0.size()) {
                arrayList3.addAll(mo145668a(o0.subList(i17, o0.size()), i35, 3, i2, false));
            }
            return arrayList3;
        }
    }
}
