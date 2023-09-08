package i91;

import android.text.TextUtils;
import d91.C20451c;
import java.util.Iterator;
import op3.C117877b;
import op3.C117882j;
import te3.C118467t1;
import te3.C118471u1;
import te3.fh4;
import te3.mf4;

/* renamed from: i91.f */
public final class C21065f {

    /* renamed from: a */
    public C21064e f59588a;

    /* renamed from: a */
    public static void m23259a(C118471u1 u1Var, C118467t1 t1Var, boolean z) {
        if (t1Var != null) {
            mf4 mf4 = new mf4();
            mf4.f354134d = z;
            mf4.f354135e.addLast(t1Var);
            if (u1Var == null) {
                u1Var = new C118471u1();
            }
            u1Var.f354473d.addLast(mf4);
        }
    }

    /* renamed from: d */
    public static C117877b<mf4, Integer> m23260d(C118471u1 u1Var, C118467t1 t1Var) {
        if (!(u1Var == null || u1Var.f354473d.isEmpty() || t1Var == null)) {
            for (int size = u1Var.f354473d.size() - 1; size >= 0; size--) {
                mf4 mf4 = u1Var.f354473d.get(size);
                if (mf4 != null && !mf4.f354135e.isEmpty()) {
                    for (int size2 = mf4.f354135e.size() - 1; size2 >= 0; size2--) {
                        C118467t1 t1Var2 = mf4.f354135e.get(size2);
                        if (t1Var2 != null && C21066g.m23269a(t1Var.f354392d, t1Var2.f354392d)) {
                            return C117882j.m166284c(mf4, Integer.valueOf(size));
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public static C118467t1 m23261f(C118471u1 u1Var) {
        if (u1Var == null) {
            return null;
        }
        mf4 last = !u1Var.f354473d.isEmpty() ? u1Var.f354473d.getLast() : null;
        if (last != null && !last.f354135e.isEmpty()) {
            return last.f354135e.getLast();
        }
        return null;
    }

    /* renamed from: i */
    public static void m23262i(C118471u1 u1Var, C118467t1 t1Var) {
        mf4 last = !u1Var.f354473d.isEmpty() ? u1Var.f354473d.getLast() : null;
        if (last == null) {
            last = new mf4();
            u1Var.f354473d.addLast(last);
        }
        last.f354135e.addLast(t1Var);
    }

    /* renamed from: j */
    public static C117877b<Integer, Integer> m23263j(C118471u1 u1Var, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return C117882j.m166284c(-1, -1);
        }
        if (u1Var == null) {
            return C117882j.m166284c(-1, -1);
        }
        int size = u1Var.f354473d.size();
        if (size <= 0) {
            return C117882j.m166284c(-1, -1);
        }
        int i2 = -1;
        int i3 = -1;
        for (int i4 = size - 1; i4 >= 0; i4--) {
            mf4 mf4 = u1Var.f354473d.get(i4);
            int size2 = mf4.f354135e.size() - 1;
            while (true) {
                if (size2 < 0) {
                    break;
                }
                fh4 fh4 = mf4.f354135e.get(size2).f354392d;
                String str2 = fh4.f354001d;
                int i5 = fh4.f354002e;
                if (str.equals(str2)) {
                    i2 = i4;
                    i3 = size2;
                    break;
                }
                size2--;
            }
        }
        return i2 == -1 ? C117882j.m166284c(-1, -1) : C117882j.m166284c(Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: b */
    public C117877b<C118471u1, C118467t1> mo32780b() {
        C118471u1 a = C21061b.m23247a();
        return C117882j.m166284c(a, mo32781c(a));
    }

    /* renamed from: c */
    public final C118467t1 mo32781c(C118471u1 u1Var) {
        if (u1Var == null) {
            return null;
        }
        mf4 last = !u1Var.f354473d.isEmpty() ? u1Var.f354473d.getLast() : null;
        if (last != null && !last.f354135e.isEmpty()) {
            return last.f354135e.getLast();
        }
        return null;
    }

    /* renamed from: e */
    public final boolean mo32782e(C118471u1 u1Var) {
        if (u1Var == null) {
            return false;
        }
        mf4 mf4 = null;
        if (!u1Var.f354473d.isEmpty()) {
            mf4 = u1Var.f354473d.getLast();
        }
        return mf4 != null && mf4.f354134d;
    }

    /* renamed from: g */
    public final void mo32783g(C118471u1 u1Var, int i, C118467t1 t1Var) {
        if (u1Var != null) {
            mf4 last = u1Var.f354473d.getLast();
            int size = last.f354135e.size();
            if (i >= 0 && i < size) {
                for (int i2 = size - 1; i2 >= i; i2--) {
                    C118467t1 remove = last.f354135e.remove(i2);
                    C21064e eVar = this.f59588a;
                    if (eVar != null) {
                        remove.f354392d.f354003f = t1Var.f354392d.f354003f;
                        ((C20451c) eVar).mo31992a(remove, t1Var);
                    }
                }
                if (last.f354135e.isEmpty() && !u1Var.f354473d.isEmpty()) {
                    u1Var.f354473d.removeLast();
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo32784h(C118471u1 u1Var, int i, C118467t1 t1Var) {
        if (u1Var != null) {
            int size = u1Var.f354473d.size();
            if (i >= 0 && i < size) {
                for (int i2 = size - 1; i2 >= i; i2--) {
                    Iterator<C118467t1> it = u1Var.f354473d.remove(i2).f354135e.iterator();
                    while (it.hasNext()) {
                        C118467t1 next = it.next();
                        C21064e eVar = this.f59588a;
                        if (eVar != null) {
                            next.f354392d.f354003f = t1Var.f354392d.f354003f;
                            ((C20451c) eVar).mo31992a(next, t1Var);
                        }
                    }
                }
            }
        }
    }
}
