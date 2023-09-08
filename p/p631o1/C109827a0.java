package p631o1;

import fy3.C32226l;
import gy3.C87412m;
import java.util.Map;
import p560i2.C33183o;
import p631o1.C109854n0;
import rx3.C13598b0;
import sx3.C36903g0;

/* renamed from: o1.a0 */
public interface C109827a0 extends C109848k {

    /* renamed from: o1.a0$a */
    public static final class C109828a {

        /* renamed from: o1.a0$a$a */
        public static final class C109829a implements C109899z {

            /* renamed from: a */
            public final int f328750a;

            /* renamed from: b */
            public final int f328751b;

            /* renamed from: c */
            public final Map<C61911a, Integer> f328752c;

            /* renamed from: d */
            public final /* synthetic */ int f328753d;

            /* renamed from: e */
            public final /* synthetic */ C109827a0 f328754e;

            /* renamed from: f */
            public final /* synthetic */ C32226l<C109854n0.C109855a, C13598b0> f328755f;

            public C109829a(int i, int i2, Map<C61911a, Integer> map, C109827a0 a0Var, C32226l<? super C109854n0.C109855a, C13598b0> lVar) {
                this.f328753d = i;
                this.f328754e = a0Var;
                this.f328755f = lVar;
                this.f328750a = i;
                this.f328751b = i2;
                this.f328752c = map;
            }

            /* renamed from: b */
            public void mo145549b() {
                C109854n0.C109855a.C109856a aVar = C109854n0.C109855a.f328783a;
                int i = this.f328753d;
                C33183o layoutDirection = this.f328754e.getLayoutDirection();
                C32226l<C109854n0.C109855a, C13598b0> lVar = this.f328755f;
                aVar.getClass();
                int i2 = C109854n0.C109855a.f328785c;
                aVar.getClass();
                C33183o oVar = C109854n0.C109855a.f328784b;
                C109854n0.C109855a.f328785c = i;
                C109854n0.C109855a.f328784b = layoutDirection;
                lVar.invoke(aVar);
                C109854n0.C109855a.f328785c = i2;
                C109854n0.C109855a.f328784b = oVar;
            }

            /* renamed from: d */
            public Map<C61911a, Integer> mo145550d() {
                return this.f328752c;
            }

            public int getHeight() {
                return this.f328751b;
            }

            public int getWidth() {
                return this.f328750a;
            }
        }

        /* renamed from: a */
        public static C109899z m149246a(C109827a0 a0Var, int i, int i2, Map<C61911a, Integer> map, C32226l<? super C109854n0.C109855a, C13598b0> lVar) {
            C87412m.m108594g(map, "alignmentLines");
            C87412m.m108594g(lVar, "placementBlock");
            return new C109829a(i, i2, map, a0Var, lVar);
        }

        /* renamed from: b */
        public static /* synthetic */ C109899z m149247b(C109827a0 a0Var, int i, int i2, Map map, C32226l lVar, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    map = C36903g0.f97931d;
                }
                return a0Var.mo144573t(i, i2, map, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
    }

    /* renamed from: t */
    C109899z mo144573t(int i, int i2, Map<C61911a, Integer> map, C32226l<? super C109854n0.C109855a, C13598b0> lVar);
}
