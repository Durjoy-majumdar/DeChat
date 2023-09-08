package ln3;

import gy3.C87412m;
import java.util.Map;
import ln3.C76709a;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: ln3.a */
public abstract class C76709a<T extends C76709a<T>> implements C76712e<T> {

    /* renamed from: g */
    public static int f224424g;

    /* renamed from: h */
    public static final int f224425h;

    /* renamed from: i */
    public static final int f224426i;

    /* renamed from: j */
    public static final int f224427j;

    /* renamed from: n */
    public static final int f224428n;

    /* renamed from: o */
    public static final int f224429o;

    /* renamed from: p */
    public static final int f224430p;

    /* renamed from: q */
    public static final int f224431q;

    /* renamed from: r */
    public static final int f224432r;

    /* renamed from: s */
    public static final int f224433s;

    /* renamed from: t */
    public static final int f224434t;

    /* renamed from: d */
    public int f224435d;

    /* renamed from: e */
    public int f224436e = -1;

    /* renamed from: f */
    public Map<String, ? extends Object> f224437f;

    static {
        int i = f224424g;
        int i2 = i + 1;
        f224425h = i;
        int i3 = i2 + 1;
        f224426i = i2;
        int i4 = i3 + 1;
        f224427j = i3;
        int i5 = i4 + 1;
        f224428n = i4;
        int i6 = i5 + 1;
        f224429o = i5;
        int i7 = i6 + 1;
        f224430p = i6;
        int i8 = i7 + 1;
        f224431q = i7;
        int i9 = i8 + 1;
        f224432r = i8;
        int i15 = i9 + 1;
        f224433s = i9;
        f224424g = i15 + 1;
        f224434t = i15;
    }

    /* renamed from: a */
    public Map<String, Object> mo86283a() {
        return null;
    }

    /* renamed from: b */
    public final Map<String, Object> mo106997b() {
        Map<String, Object> a = mo86283a();
        Map<String, Object> f = C90364q0.m113147f(new C13604l("group_bar_position_index", Integer.valueOf(this.f224435d)), new C13604l("group_bar_item_type", Integer.valueOf(mo86281d())));
        if (a != null) {
            f = C90364q0.m113149h(f, a);
        }
        Map<String, ? extends Object> map = this.f224437f;
        return map != null ? C90364q0.m113149h(f, map) : f;
    }

    /* renamed from: d */
    public abstract int mo86281d();

    /* renamed from: f */
    public boolean mo106998f(T t) {
        C87412m.m108594g(t, "other");
        return false;
    }

    public long getItemId() {
        return (long) hashCode();
    }
}
