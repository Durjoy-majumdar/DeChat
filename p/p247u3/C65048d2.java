package p247u3;

import gy3.C87412m;
import java.util.Arrays;
import java.util.List;
import sx3.C64186f0;

/* renamed from: u3.d2 */
public final class C65048d2<T> {

    /* renamed from: e */
    public static final C65048d2<Object> f187231e = new C65048d2<>(0, C64186f0.f181907d);

    /* renamed from: a */
    public final int[] f187232a;

    /* renamed from: b */
    public final List<T> f187233b;

    /* renamed from: c */
    public final int f187234c;

    /* renamed from: d */
    public final List<Integer> f187235d;

    public C65048d2(int[] iArr, List<? extends T> list, int i, List<Integer> list2) {
        C87412m.m108594g(iArr, "originalPageOffsets");
        C87412m.m108594g(list, "data");
        this.f187232a = iArr;
        this.f187233b = list;
        this.f187234c = i;
        this.f187235d = list2;
        boolean z = false;
        if (!(iArr.length == 0)) {
            if (!((list2 == null || list2.size() == list.size()) ? true : z)) {
                StringBuilder sb = new StringBuilder();
                sb.append("If originalIndices (size = ");
                C87412m.m108591d(list2);
                sb.append(list2.size());
                sb.append(") is provided,");
                sb.append(" it must be same length as data (size = ");
                sb.append(list.size());
                sb.append(')');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            return;
        }
        throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage".toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C87412m.m108589b(C65048d2.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C65048d2 d2Var = (C65048d2) obj;
            return Arrays.equals(this.f187232a, d2Var.f187232a) && !(C87412m.m108589b(this.f187233b, d2Var.f187233b) ^ true) && this.f187234c == d2Var.f187234c && !(C87412m.m108589b(this.f187235d, d2Var.f187235d) ^ true);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.paging.TransformablePage<*>");
    }

    public int hashCode() {
        int hashCode = ((((Arrays.hashCode(this.f187232a) * 31) + this.f187233b.hashCode()) * 31) + this.f187234c) * 31;
        List<Integer> list = this.f187235d;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.f187232a) + ", data=" + this.f187233b + ", hintOriginalPageOffset=" + this.f187234c + ", hintOriginalIndices=" + this.f187235d + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C65048d2(int i, List<? extends T> list) {
        this(new int[]{i}, list, i, (List<Integer>) null);
        C87412m.m108594g(list, "data");
    }
}
