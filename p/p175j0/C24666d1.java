package p175j0;

import fy3.C32224a;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: j0.d1 */
public final class C24666d1 {

    /* renamed from: a */
    public final List<C24714o0> f70332a;

    /* renamed from: b */
    public final int f70333b;

    /* renamed from: c */
    public int f70334c;

    /* renamed from: d */
    public final List<C24714o0> f70335d;

    /* renamed from: e */
    public final HashMap<Integer, C24668h0> f70336e;

    /* renamed from: f */
    public final C13601g f70337f;

    /* renamed from: j0.d1$a */
    public static final class C24667a extends C87413o implements C32224a<HashMap<Object, LinkedHashSet<C24714o0>>> {

        /* renamed from: d */
        public final /* synthetic */ C24666d1 f70338d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24667a(C24666d1 d1Var) {
            super(0);
            this.f70338d = d1Var;
        }

        public Object invoke() {
            C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar = C24715p.f70494a;
            HashMap hashMap = new HashMap();
            C24666d1 d1Var = this.f70338d;
            int size = d1Var.f70332a.size();
            for (int i = 0; i < size; i++) {
                C24714o0 o0Var = d1Var.f70332a.get(i);
                Object n0Var = o0Var.f70491b != null ? new C9270n0(Integer.valueOf(o0Var.f70490a), o0Var.f70491b) : Integer.valueOf(o0Var.f70490a);
                Object obj = hashMap.get(n0Var);
                if (obj == null) {
                    obj = new LinkedHashSet();
                    hashMap.put(n0Var, obj);
                }
                ((LinkedHashSet) obj).add(o0Var);
            }
            return hashMap;
        }
    }

    public C24666d1(List<C24714o0> list, int i) {
        C87412m.m108594g(list, "keyInfos");
        this.f70332a = list;
        this.f70333b = i;
        if (i >= 0) {
            this.f70335d = new ArrayList();
            HashMap<Integer, C24668h0> hashMap = new HashMap<>();
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C24714o0 o0Var = this.f70332a.get(i3);
                hashMap.put(Integer.valueOf(o0Var.f70492c), new C24668h0(i3, i2, o0Var.f70493d));
                i2 += o0Var.f70493d;
            }
            this.f70336e = hashMap;
            this.f70337f = C36568h.m40985a(new C24667a(this));
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    /* renamed from: a */
    public final int mo51541a(C24714o0 o0Var) {
        C87412m.m108594g(o0Var, "keyInfo");
        C24668h0 h0Var = this.f70336e.get(Integer.valueOf(o0Var.f70492c));
        if (h0Var != null) {
            return h0Var.f70340b;
        }
        return -1;
    }

    /* renamed from: b */
    public final boolean mo51542b(int i, int i2) {
        int i3;
        C24668h0 h0Var = this.f70336e.get(Integer.valueOf(i));
        if (h0Var == null) {
            return false;
        }
        int i4 = h0Var.f70340b;
        int i5 = i2 - h0Var.f70341c;
        h0Var.f70341c = i2;
        if (i5 == 0) {
            return true;
        }
        Collection<C24668h0> values = this.f70336e.values();
        C87412m.m108593f(values, "groupInfos.values");
        for (C24668h0 h0Var2 : values) {
            if (h0Var2.f70340b >= i4 && !C87412m.m108589b(h0Var2, h0Var) && (i3 = h0Var2.f70340b + i5) >= 0) {
                h0Var2.f70340b = i3;
            }
        }
        return true;
    }
}
