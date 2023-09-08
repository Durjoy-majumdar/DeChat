package n14;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import my3.C61594j;
import my3.C61595o;
import p14.C25426d0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C26234j0;
import sx3.C26235k0;
import sx3.C36906q;
import sx3.C36907w;
import sx3.C64188i0;
import sx3.C90364q0;

/* renamed from: n14.f */
public final class C25218f implements C25217e {

    /* renamed from: a */
    public final List<Annotation> f71681a;

    /* renamed from: b */
    public final String[] f71682b;

    /* renamed from: c */
    public final C25217e[] f71683c;

    /* renamed from: d */
    public final List<Annotation>[] f71684d;

    /* renamed from: e */
    public final Map<String, Integer> f71685e;

    /* renamed from: f */
    public final C25217e[] f71686f;

    /* renamed from: g */
    public final C13601g f71687g;

    /* renamed from: h */
    public final String f71688h;

    /* renamed from: i */
    public final C25223i f71689i;

    /* renamed from: j */
    public final int f71690j;

    /* renamed from: n14.f$a */
    public static final class C25219a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C25218f f71691d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25219a(C25218f fVar) {
            super(0);
            this.f71691d = fVar;
        }

        public Object invoke() {
            C25218f fVar = this.f71691d;
            int hashCode = (fVar.f71688h.hashCode() * 31) + Arrays.hashCode(fVar.f71686f);
            int h = fVar.mo52325h();
            int i = 1;
            while (true) {
                int i2 = 0;
                if (!(h > 0)) {
                    break;
                }
                int i3 = h - 1;
                int i4 = i * 31;
                String j = fVar.mo52330l(fVar.mo52325h() - h).mo52328j();
                if (j != null) {
                    i2 = j.hashCode();
                }
                i = i4 + i2;
                h = i3;
            }
            int h2 = fVar.mo52325h();
            int i5 = 1;
            while (true) {
                if (!(h2 > 0)) {
                    return Integer.valueOf((((hashCode * 31) + i) * 31) + i5);
                }
                int i6 = h2 - 1;
                int i7 = i5 * 31;
                C25223i f = fVar.mo52330l(fVar.mo52325h() - h2).mo52323f();
                i5 = i7 + (f != null ? f.hashCode() : 0);
                h2 = i6;
            }
        }
    }

    /* renamed from: n14.f$b */
    public static final class C25220b extends C87413o implements C32226l<Integer, CharSequence> {

        /* renamed from: d */
        public final /* synthetic */ C25218f f71692d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25220b(C25218f fVar) {
            super(1);
            this.f71692d = fVar;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            return this.f71692d.f71682b[intValue] + ": " + this.f71692d.f71683c[intValue].mo52328j();
        }
    }

    public C25218f(String str, C25223i iVar, int i, List<? extends C25217e> list, C25203a aVar) {
        C87412m.m108594g(str, "serialName");
        C87412m.m108594g(iVar, "kind");
        C87412m.m108594g(list, "typeParameters");
        C87412m.m108594g(aVar, "builder");
        this.f71688h = str;
        this.f71689i = iVar;
        this.f71690j = i;
        this.f71681a = aVar.f71662a;
        int i2 = 0;
        Object[] array = ((ArrayList) aVar.f71663b).toArray(new String[0]);
        if (array != null) {
            this.f71682b = (String[]) array;
            this.f71683c = C25426d0.m32742a(aVar.f71665d);
            Object[] array2 = ((ArrayList) aVar.f71666e).toArray(new List[0]);
            if (array2 != null) {
                this.f71684d = (List[]) array2;
                List<Boolean> list2 = aVar.f71667f;
                C87412m.m108594g(list2, "<this>");
                ArrayList arrayList = (ArrayList) list2;
                boolean[] zArr = new boolean[arrayList.size()];
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zArr[i2] = ((Boolean) it.next()).booleanValue();
                    i2++;
                }
                String[] strArr = this.f71682b;
                C87412m.m108594g(strArr, "<this>");
                C26234j0 j0Var = new C26234j0(new C36906q(strArr));
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(j0Var, 10));
                Iterator it4 = j0Var.iterator();
                while (true) {
                    C26235k0 k0Var = (C26235k0) it4;
                    if (k0Var.hasNext()) {
                        C64188i0 i0Var = (C64188i0) k0Var.next();
                        arrayList2.add(new C13604l(i0Var.f181910b, Integer.valueOf(i0Var.f181909a)));
                    } else {
                        this.f71685e = C90364q0.m113152k(arrayList2);
                        this.f71686f = C25426d0.m32742a(list);
                        this.f71687g = C36568h.m40985a(new C25219a(this));
                        return;
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C25218f) {
            C25217e eVar = (C25217e) obj;
            if (!(!C87412m.m108589b(this.f71688h, eVar.mo52328j())) && Arrays.equals(this.f71686f, ((C25218f) obj).f71686f) && this.f71690j == eVar.mo52325h()) {
                int i = this.f71690j;
                int i2 = 0;
                while (i2 < i) {
                    if (!(!C87412m.m108589b(this.f71683c[i2].mo52328j(), eVar.mo52330l(i2).mo52328j())) && !(!C87412m.m108589b(this.f71683c[i2].mo52323f(), eVar.mo52330l(i2).mo52323f()))) {
                        i2++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public C25223i mo52323f() {
        return this.f71689i;
    }

    /* renamed from: g */
    public boolean mo52324g() {
        return false;
    }

    /* renamed from: h */
    public int mo52325h() {
        return this.f71690j;
    }

    public int hashCode() {
        return ((Number) ((C36570n) this.f71687g).getValue()).intValue();
    }

    /* renamed from: i */
    public String mo52327i(int i) {
        return this.f71682b[i];
    }

    /* renamed from: j */
    public String mo52328j() {
        return this.f71688h;
    }

    /* renamed from: k */
    public int mo52329k(String str) {
        C87412m.m108594g(str, "name");
        Integer num = this.f71685e.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* renamed from: l */
    public C25217e mo52330l(int i) {
        return this.f71683c[i];
    }

    public String toString() {
        C61594j i = C61595o.m72301i(0, this.f71690j);
        return C110818d0.m150921S(i, ", ", this.f71688h + '(', ")", 0, (CharSequence) null, new C25220b(this), 24, (Object) null);
    }
}
