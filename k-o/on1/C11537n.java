package on1;

import cm1.C0740i2;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import java.util.Set;
import on1.C11545o;

/* renamed from: on1.n */
public interface C11537n<T extends C0740i2> {

    /* renamed from: on1.n$a */
    public static abstract class C11538a<T extends C0740i2> implements C11537n<T> {
        public C11538a() {
        }

        /* renamed from: b */
        public abstract int mo11475b(List<T> list);

        public C11538a(boolean z, int i, C8480h hVar) {
        }
    }

    /* renamed from: on1.n$b */
    public static final class C11539b<T extends C0740i2> implements C11537n<T> {

        /* renamed from: a */
        public final C11575y<T> f33872a;

        public C11539b(C11575y<T> yVar) {
            C87412m.m108594g(yVar, "data");
            this.f33872a = yVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11539b) && C87412m.m108589b(this.f33872a, ((C11539b) obj).f33872a);
        }

        public int hashCode() {
            return this.f33872a.hashCode();
        }

        public String toString() {
            return "FirstScreenEvent(data=" + this.f33872a + ')';
        }
    }

    /* renamed from: on1.n$c */
    public static abstract class C11540c<T extends C0740i2> implements C11537n<T> {

        /* renamed from: a */
        public final List<T> f33873a;

        /* renamed from: b */
        public final boolean f33874b;

        public C11540c(List<? extends T> list, boolean z) {
            C87412m.m108594g(list, "feeds");
            this.f33873a = list;
            this.f33874b = z;
        }

        /* renamed from: b */
        public abstract Set<Integer> mo11492b(List<T> list);
    }

    /* renamed from: on1.n$d */
    public static final class C11541d<T extends C0740i2> implements C11537n<T> {

        /* renamed from: a */
        public final C11575y<T> f33875a;

        /* renamed from: b */
        public final C11545o.C11546a f33876b;

        public C11541d(C11575y yVar, C11545o.C11546a aVar, int i, C8480h hVar) {
            aVar = (i & 2) != 0 ? null : aVar;
            C87412m.m108594g(yVar, "data");
            this.f33875a = yVar;
            this.f33876b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11541d)) {
                return false;
            }
            C11541d dVar = (C11541d) obj;
            return C87412m.m108589b(this.f33875a, dVar.f33875a) && C87412m.m108589b(this.f33876b, dVar.f33876b);
        }

        public int hashCode() {
            int hashCode = this.f33875a.hashCode() * 31;
            C11545o.C11546a aVar = this.f33876b;
            return hashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "LoadMoreEvent(data=" + this.f33875a + ", key=" + this.f33876b + ')';
        }
    }

    /* renamed from: on1.n$e */
    public interface C11542e<T extends C0740i2> extends C11537n<T> {
        /* renamed from: a */
        void mo10502a(List<T> list);
    }

    /* renamed from: on1.n$f */
    public static final class C11543f<T extends C0740i2> implements C11537n<T> {

        /* renamed from: a */
        public final C11575y<T> f33877a;

        /* renamed from: b */
        public final C11545o.C11546a f33878b;

        public C11543f(C11575y yVar, C11545o.C11546a aVar, int i, C8480h hVar) {
            aVar = (i & 2) != 0 ? null : aVar;
            C87412m.m108594g(yVar, "data");
            this.f33877a = yVar;
            this.f33878b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11543f)) {
                return false;
            }
            C11543f fVar = (C11543f) obj;
            return C87412m.m108589b(this.f33877a, fVar.f33877a) && C87412m.m108589b(this.f33878b, fVar.f33878b);
        }

        public int hashCode() {
            int hashCode = this.f33877a.hashCode() * 31;
            C11545o.C11546a aVar = this.f33878b;
            return hashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "RefreshEvent(data=" + this.f33877a + ", key=" + this.f33878b + ')';
        }
    }

    /* renamed from: on1.n$g */
    public static abstract class C11544g<T extends C0740i2> implements C11537n<T> {

        /* renamed from: a */
        public final long f33879a;

        /* renamed from: b */
        public final boolean f33880b;

        public C11544g(long j, boolean z) {
            this.f33879a = j;
            this.f33880b = z;
        }

        /* renamed from: b */
        public abstract int mo11485b(List<T> list);
    }
}
