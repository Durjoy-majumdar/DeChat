package n04;

import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayDeque;
import java.util.Set;
import q04.C25526i;
import q04.C25528k;
import q04.C25532p;
import w04.C22850f;

/* renamed from: n04.i1 */
public class C25134i1 {

    /* renamed from: a */
    public final boolean f71575a;

    /* renamed from: b */
    public final boolean f71576b;

    /* renamed from: c */
    public final C25532p f71577c;

    /* renamed from: d */
    public final C25152l f71578d;

    /* renamed from: e */
    public final C25156m f71579e;

    /* renamed from: f */
    public int f71580f;

    /* renamed from: g */
    public ArrayDeque<C25528k> f71581g;

    /* renamed from: h */
    public Set<C25528k> f71582h;

    /* renamed from: n04.i1$b */
    public static abstract class C25135b {

        /* renamed from: n04.i1$b$a */
        public static abstract class C25136a extends C25135b {
        }

        /* renamed from: n04.i1$b$b */
        public static final class C25137b extends C25135b {

            /* renamed from: a */
            public static final C25137b f71583a = new C25137b();

            /* renamed from: a */
            public C25528k mo52285a(C25134i1 i1Var, C25526i iVar) {
                C87412m.m108594g(i1Var, "state");
                C87412m.m108594g(iVar, "type");
                return i1Var.f71577c.mo52474q0(iVar);
            }
        }

        /* renamed from: n04.i1$b$c */
        public static final class C25138c extends C25135b {

            /* renamed from: a */
            public static final C25138c f71584a = new C25138c();

            /* renamed from: a */
            public C25528k mo52285a(C25134i1 i1Var, C25526i iVar) {
                C87412m.m108594g(i1Var, "state");
                C87412m.m108594g(iVar, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* renamed from: n04.i1$b$d */
        public static final class C25139d extends C25135b {

            /* renamed from: a */
            public static final C25139d f71585a = new C25139d();

            /* renamed from: a */
            public C25528k mo52285a(C25134i1 i1Var, C25526i iVar) {
                C87412m.m108594g(i1Var, "state");
                C87412m.m108594g(iVar, "type");
                return i1Var.f71577c.mo52442S(iVar);
            }
        }

        /* renamed from: a */
        public abstract C25528k mo52285a(C25134i1 i1Var, C25526i iVar);
    }

    /* renamed from: n04.i1$a */
    public interface C25140a {

        /* renamed from: n04.i1$a$a */
        public static final class C25141a implements C25140a {

            /* renamed from: a */
            public boolean f71586a;

            /* renamed from: a */
            public void mo52286a(C32224a<Boolean> aVar) {
                C87412m.m108594g(aVar, "block");
                if (!this.f71586a) {
                    this.f71586a = aVar.invoke().booleanValue();
                }
            }
        }

        /* renamed from: a */
        void mo52286a(C32224a<Boolean> aVar);
    }

    public C25134i1(boolean z, boolean z2, boolean z3, C25532p pVar, C25152l lVar, C25156m mVar) {
        C87412m.m108594g(pVar, "typeSystemContext");
        C87412m.m108594g(lVar, "kotlinTypePreparator");
        C87412m.m108594g(mVar, "kotlinTypeRefiner");
        this.f71575a = z;
        this.f71576b = z2;
        this.f71577c = pVar;
        this.f71578d = lVar;
        this.f71579e = mVar;
    }

    /* renamed from: a */
    public final void mo52281a() {
        ArrayDeque<C25528k> arrayDeque = this.f71581g;
        C87412m.m108591d(arrayDeque);
        arrayDeque.clear();
        Set<C25528k> set = this.f71582h;
        C87412m.m108591d(set);
        ((C22850f) set).clear();
    }

    /* renamed from: b */
    public boolean mo52282b(C25526i iVar, C25526i iVar2) {
        C87412m.m108594g(iVar, "subType");
        C87412m.m108594g(iVar2, "superType");
        return true;
    }

    /* renamed from: c */
    public final void mo52283c() {
        if (this.f71581g == null) {
            this.f71581g = new ArrayDeque<>(4);
        }
        if (this.f71582h == null) {
            this.f71582h = C22850f.f65674f.mo36008a();
        }
    }

    /* renamed from: d */
    public final C25526i mo52284d(C25526i iVar) {
        C87412m.m108594g(iVar, "type");
        return this.f71578d.mo52291a(iVar);
    }
}
