package p631o1;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p560i2.C108321c;

/* renamed from: o1.y */
public interface C109895y {

    /* renamed from: o1.y$a */
    public static final class C109896a {
        /* renamed from: a */
        public static int m149385a(C109895y yVar, C109848k kVar, List<? extends C109846j> list, int i) {
            C87412m.m108594g(kVar, "receiver");
            C87412m.m108594g(list, "measurables");
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(new C109843g((C109846j) list.get(i2), C35082l.Max, C109851m.Height));
            }
            return yVar.mo142887d(new C109853n(kVar, kVar.getLayoutDirection()), arrayList, C108321c.m146705b(0, i, 0, 0, 13, (Object) null)).getHeight();
        }

        /* renamed from: b */
        public static int m149386b(C109895y yVar, C109848k kVar, List<? extends C109846j> list, int i) {
            C87412m.m108594g(kVar, "receiver");
            C87412m.m108594g(list, "measurables");
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(new C109843g((C109846j) list.get(i2), C35082l.Max, C109851m.Width));
            }
            return yVar.mo142887d(new C109853n(kVar, kVar.getLayoutDirection()), arrayList, C108321c.m146705b(0, 0, 0, i, 7, (Object) null)).getWidth();
        }

        /* renamed from: c */
        public static int m149387c(C109895y yVar, C109848k kVar, List<? extends C109846j> list, int i) {
            C87412m.m108594g(kVar, "receiver");
            C87412m.m108594g(list, "measurables");
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(new C109843g((C109846j) list.get(i2), C35082l.Min, C109851m.Height));
            }
            return yVar.mo142887d(new C109853n(kVar, kVar.getLayoutDirection()), arrayList, C108321c.m146705b(0, i, 0, 0, 13, (Object) null)).getHeight();
        }

        /* renamed from: d */
        public static int m149388d(C109895y yVar, C109848k kVar, List<? extends C109846j> list, int i) {
            C87412m.m108594g(kVar, "receiver");
            C87412m.m108594g(list, "measurables");
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(new C109843g((C109846j) list.get(i2), C35082l.Min, C109851m.Width));
            }
            return yVar.mo142887d(new C109853n(kVar, kVar.getLayoutDirection()), arrayList, C108321c.m146705b(0, 0, 0, i, 7, (Object) null)).getWidth();
        }
    }

    /* renamed from: a */
    int mo142884a(C109848k kVar, List<? extends C109846j> list, int i);

    /* renamed from: b */
    int mo142885b(C109848k kVar, List<? extends C109846j> list, int i);

    /* renamed from: c */
    int mo142886c(C109848k kVar, List<? extends C109846j> list, int i);

    /* renamed from: d */
    C109899z mo142887d(C109827a0 a0Var, List<? extends C109893x> list, long j);

    /* renamed from: e */
    int mo142888e(C109848k kVar, List<? extends C109846j> list, int i);
}
