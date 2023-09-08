package p631o1;

import gy3.C87412m;
import p560i2.C108321c;
import p721v0.C65503j;

/* renamed from: o1.r */
public interface C109866r extends C65503j.C65506c {

    /* renamed from: o1.r$a */
    public static final class C109867a {
        /* renamed from: a */
        public static int m149337a(C109866r rVar, C109848k kVar, C109846j jVar, int i) {
            C87412m.m108594g(kVar, "receiver");
            C87412m.m108594g(jVar, "measurable");
            C87412m.m108594g(rVar, "modifier");
            return rVar.mo142877G(new C109853n(kVar, kVar.getLayoutDirection()), new C109830b0(jVar, C35081d0.Max, C109835e0.Height), C108321c.m146705b(0, i, 0, 0, 13, (Object) null)).getHeight();
        }

        /* renamed from: b */
        public static int m149338b(C109866r rVar, C109848k kVar, C109846j jVar, int i) {
            C87412m.m108594g(kVar, "receiver");
            C87412m.m108594g(jVar, "measurable");
            C87412m.m108594g(rVar, "modifier");
            return rVar.mo142877G(new C109853n(kVar, kVar.getLayoutDirection()), new C109830b0(jVar, C35081d0.Max, C109835e0.Width), C108321c.m146705b(0, 0, 0, i, 7, (Object) null)).getWidth();
        }

        /* renamed from: c */
        public static int m149339c(C109866r rVar, C109848k kVar, C109846j jVar, int i) {
            C87412m.m108594g(kVar, "receiver");
            C87412m.m108594g(jVar, "measurable");
            C87412m.m108594g(rVar, "modifier");
            return rVar.mo142877G(new C109853n(kVar, kVar.getLayoutDirection()), new C109830b0(jVar, C35081d0.Min, C109835e0.Height), C108321c.m146705b(0, i, 0, 0, 13, (Object) null)).getHeight();
        }

        /* renamed from: d */
        public static int m149340d(C109866r rVar, C109848k kVar, C109846j jVar, int i) {
            C87412m.m108594g(kVar, "receiver");
            C87412m.m108594g(jVar, "measurable");
            C87412m.m108594g(rVar, "modifier");
            return rVar.mo142877G(new C109853n(kVar, kVar.getLayoutDirection()), new C109830b0(jVar, C35081d0.Min, C109835e0.Width), C108321c.m146705b(0, 0, 0, i, 7, (Object) null)).getWidth();
        }
    }

    /* renamed from: E */
    int mo142876E(C109848k kVar, C109846j jVar, int i);

    /* renamed from: G */
    C109899z mo142877G(C109827a0 a0Var, C109893x xVar, long j);

    /* renamed from: Y */
    int mo142878Y(C109848k kVar, C109846j jVar, int i);

    /* renamed from: s0 */
    int mo142882s0(C109848k kVar, C109846j jVar, int i);

    /* renamed from: v */
    int mo142883v(C109848k kVar, C109846j jVar, int i);
}
