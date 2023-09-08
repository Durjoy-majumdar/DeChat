package p435a0;

import gy3.C8480h;
import gy3.C87412m;
import p560i2.C33183o;
import p631o1.C109854n0;
import p721v0.C111294a;

/* renamed from: a0.m */
public abstract class C103167m {

    /* renamed from: a */
    public static final /* synthetic */ int f304322a = 0;

    /* renamed from: a0.m$a */
    public static final class C103168a extends C103167m {

        /* renamed from: b */
        public static final /* synthetic */ int f304323b = 0;

        static {
            new C103168a();
        }

        /* renamed from: a */
        public int mo142916a(int i, C33183o oVar, C109854n0 n0Var, int i2) {
            C87412m.m108594g(oVar, "layoutDirection");
            C87412m.m108594g(n0Var, "placeable");
            return i / 2;
        }
    }

    /* renamed from: a0.m$b */
    public static final class C103169b {
        public C103169b(C8480h hVar) {
        }
    }

    /* renamed from: a0.m$c */
    public static final class C103170c extends C103167m {

        /* renamed from: b */
        public static final /* synthetic */ int f304324b = 0;

        static {
            new C103170c();
        }

        /* renamed from: a */
        public int mo142916a(int i, C33183o oVar, C109854n0 n0Var, int i2) {
            C87412m.m108594g(oVar, "layoutDirection");
            C87412m.m108594g(n0Var, "placeable");
            if (oVar == C33183o.Ltr) {
                return i;
            }
            return 0;
        }
    }

    /* renamed from: a0.m$d */
    public static final class C103171d extends C103167m {

        /* renamed from: b */
        public final C111294a.C37633b f304325b;

        public C103171d(C111294a.C37633b bVar) {
            C87412m.m108594g(bVar, "horizontal");
            this.f304325b = bVar;
        }

        /* renamed from: a */
        public int mo142916a(int i, C33183o oVar, C109854n0 n0Var, int i2) {
            C87412m.m108594g(oVar, "layoutDirection");
            C87412m.m108594g(n0Var, "placeable");
            return this.f304325b.mo61254a(0, i, oVar);
        }
    }

    /* renamed from: a0.m$e */
    public static final class C103172e extends C103167m {

        /* renamed from: b */
        public static final /* synthetic */ int f304326b = 0;

        static {
            new C103172e();
        }

        /* renamed from: a */
        public int mo142916a(int i, C33183o oVar, C109854n0 n0Var, int i2) {
            C87412m.m108594g(oVar, "layoutDirection");
            C87412m.m108594g(n0Var, "placeable");
            if (oVar == C33183o.Ltr) {
                return 0;
            }
            return i;
        }
    }

    /* renamed from: a0.m$f */
    public static final class C103173f extends C103167m {

        /* renamed from: b */
        public final C111294a.C37634c f304327b;

        public C103173f(C111294a.C37634c cVar) {
            C87412m.m108594g(cVar, "vertical");
            this.f304327b = cVar;
        }

        /* renamed from: a */
        public int mo142916a(int i, C33183o oVar, C109854n0 n0Var, int i2) {
            C87412m.m108594g(oVar, "layoutDirection");
            C87412m.m108594g(n0Var, "placeable");
            return this.f304327b.mo61255a(0, i);
        }
    }

    static {
        new C103169b((C8480h) null);
        int i = C103168a.f304323b;
        int i2 = C103172e.f304326b;
        int i3 = C103170c.f304324b;
    }

    /* renamed from: a */
    public abstract int mo142916a(int i, C33183o oVar, C109854n0 n0Var, int i2);
}
