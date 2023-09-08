package p14;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l14.C24951b;
import n14.C25217e;
import n14.C25223i;
import n14.C25226j;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;

/* renamed from: p14.e0 */
public class C25428e0 implements C25217e {

    /* renamed from: a */
    public int f72016a = -1;

    /* renamed from: b */
    public final String[] f72017b;

    /* renamed from: c */
    public final List<Annotation>[] f72018c;

    /* renamed from: d */
    public boolean[] f72019d;

    /* renamed from: e */
    public final C13601g f72020e;

    /* renamed from: f */
    public final C13601g f72021f;

    /* renamed from: g */
    public final C13601g f72022g;

    /* renamed from: h */
    public final String f72023h;

    /* renamed from: i */
    public final C25440j<?> f72024i;

    /* renamed from: j */
    public final int f72025j;

    /* renamed from: p14.e0$a */
    public static final class C25429a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C25428e0 f72026d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25429a(C25428e0 e0Var) {
            super(0);
            this.f72026d = e0Var;
        }

        public Object invoke() {
            C25428e0 e0Var = this.f72026d;
            int hashCode = (e0Var.f72023h.hashCode() * 31) + Arrays.hashCode((C25217e[]) ((C36570n) e0Var.f72021f).getValue());
            int h = e0Var.mo52325h();
            int i = 1;
            while (true) {
                int i2 = 0;
                if (!(h > 0)) {
                    break;
                }
                int i3 = h - 1;
                int i4 = i * 31;
                String j = e0Var.mo52330l(e0Var.mo52325h() - h).mo52328j();
                if (j != null) {
                    i2 = j.hashCode();
                }
                i = i4 + i2;
                h = i3;
            }
            int h2 = e0Var.mo52325h();
            int i5 = 1;
            while (true) {
                if (!(h2 > 0)) {
                    return Integer.valueOf((((hashCode * 31) + i) * 31) + i5);
                }
                int i6 = h2 - 1;
                int i7 = i5 * 31;
                C25223i f = e0Var.mo52330l(e0Var.mo52325h() - h2).mo52323f();
                i5 = i7 + (f != null ? f.hashCode() : 0);
                h2 = i6;
            }
        }
    }

    /* renamed from: p14.e0$b */
    public static final class C25430b extends C87413o implements C32224a<Map<String, ? extends Integer>> {

        /* renamed from: d */
        public final /* synthetic */ C25428e0 f72027d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25430b(C25428e0 e0Var) {
            super(0);
            this.f72027d = e0Var;
        }

        public Object invoke() {
            C25428e0 e0Var = this.f72027d;
            e0Var.getClass();
            HashMap hashMap = new HashMap();
            int length = e0Var.f72017b.length;
            for (int i = 0; i < length; i++) {
                hashMap.put(e0Var.f72017b[i], Integer.valueOf(i));
            }
            return hashMap;
        }
    }

    /* renamed from: p14.e0$c */
    public static final class C25431c extends C87413o implements C32226l<Map.Entry<? extends String, ? extends Integer>, CharSequence> {

        /* renamed from: d */
        public final /* synthetic */ C25428e0 f72028d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25431c(C25428e0 e0Var) {
            super(1);
            this.f72028d = e0Var;
        }

        public Object invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            C87412m.m108594g(entry, LocaleUtil.ITALIAN);
            return ((String) entry.getKey()) + ": " + this.f72028d.mo52330l(((Number) entry.getValue()).intValue()).mo52328j();
        }
    }

    /* renamed from: p14.e0$d */
    public static final class C25432d extends C87413o implements C32224a<C25217e[]> {

        /* renamed from: d */
        public final /* synthetic */ C25428e0 f72029d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25432d(C25428e0 e0Var) {
            super(0);
            this.f72029d = e0Var;
        }

        public Object invoke() {
            ArrayList arrayList;
            C24951b[] c;
            C25440j<?> jVar = this.f72029d.f72024i;
            if (jVar == null || (c = jVar.mo52672c()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(c.length);
                for (C24951b a : c) {
                    arrayList.add(a.mo51996a());
                }
            }
            return C25426d0.m32742a(arrayList);
        }
    }

    public C25428e0(String str, C25440j<?> jVar, int i) {
        C87412m.m108594g(str, "serialName");
        this.f72023h = str;
        this.f72024i = jVar;
        this.f72025j = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.f72017b = strArr;
        int i3 = this.f72025j;
        this.f72018c = new List[i3];
        this.f72019d = new boolean[i3];
        this.f72020e = C36568h.m40985a(new C25430b(this));
        this.f72021f = C36568h.m40985a(new C25432d(this));
        this.f72022g = C36568h.m40985a(new C25429a(this));
    }

    /* renamed from: a */
    public final void mo52664a(String str, boolean z) {
        C87412m.m108594g(str, "name");
        String[] strArr = this.f72017b;
        int i = this.f72016a + 1;
        this.f72016a = i;
        strArr[i] = str;
        this.f72019d[i] = z;
        this.f72018c[i] = null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C25428e0)) {
                return false;
            }
            C25217e eVar = (C25217e) obj;
            if ((!C87412m.m108589b(this.f72023h, eVar.mo52328j())) || !Arrays.equals((C25217e[]) ((C36570n) this.f72021f).getValue(), (C25217e[]) ((C36570n) ((C25428e0) obj).f72021f).getValue()) || this.f72025j != eVar.mo52325h()) {
                return false;
            }
            int i = this.f72025j;
            for (int i2 = 0; i2 < i; i2++) {
                if ((!C87412m.m108589b(mo52330l(i2).mo52328j(), eVar.mo52330l(i2).mo52328j())) || (!C87412m.m108589b(mo52330l(i2).mo52323f(), eVar.mo52330l(i2).mo52323f()))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    public C25223i mo52323f() {
        return C25226j.C25227a.f71696a;
    }

    /* renamed from: g */
    public boolean mo52324g() {
        return false;
    }

    /* renamed from: h */
    public final int mo52325h() {
        return this.f72025j;
    }

    public int hashCode() {
        return ((Number) ((C36570n) this.f72022g).getValue()).intValue();
    }

    /* renamed from: i */
    public String mo52327i(int i) {
        return this.f72017b[i];
    }

    /* renamed from: j */
    public String mo52328j() {
        return this.f72023h;
    }

    /* renamed from: k */
    public int mo52329k(String str) {
        C87412m.m108594g(str, "name");
        Integer num = (Integer) ((Map) ((C36570n) this.f72020e).getValue()).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* renamed from: l */
    public C25217e mo52330l(int i) {
        C24951b[] e;
        C24951b bVar;
        C25217e a;
        C25440j<?> jVar = this.f72024i;
        if (jVar != null && (e = jVar.mo52673e()) != null && (bVar = e[i]) != null && (a = bVar.mo51996a()) != null) {
            return a;
        }
        throw new IndexOutOfBoundsException(this.f72023h + " descriptor has only " + this.f72025j + " elements, index: " + i);
    }

    public String toString() {
        Set entrySet = ((Map) ((C36570n) this.f72020e).getValue()).entrySet();
        return C110818d0.m150921S(entrySet, ", ", this.f72023h + '(', ")", 0, (CharSequence) null, new C25431c(this), 24, (Object) null);
    }
}
