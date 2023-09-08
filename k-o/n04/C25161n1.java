package n04;

/* renamed from: n04.n1 */
public abstract class C25161n1 implements C25158m1 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25158m1)) {
            return false;
        }
        C25158m1 m1Var = (C25158m1) obj;
        return mo52296b() == m1Var.mo52296b() && mo52295a() == m1Var.mo52295a() && getType().equals(m1Var.getType());
    }

    public int hashCode() {
        int hashCode = mo52295a().hashCode();
        if (C25187v1.m32096p(getType())) {
            return (hashCode * 31) + 19;
        }
        return (hashCode * 31) + (mo52296b() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (mo52296b()) {
            return "*";
        }
        if (mo52295a() == C25202z1.INVARIANT) {
            return getType().toString();
        }
        return mo52295a() + " " + getType();
    }
}
