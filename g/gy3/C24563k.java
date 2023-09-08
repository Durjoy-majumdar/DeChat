package gy3;

import ny3.C25234c;
import ny3.C25237g;

/* renamed from: gy3.k */
public class C24563k extends C24557d implements C24562j, C25237g {
    private final int arity;
    private final int flags;

    public C24563k(int i) {
        this(i, C24557d.NO_RECEIVER, (Class) null, (String) null, (String) null, 0);
    }

    public C25234c computeReflected() {
        return C24560g0.f70158a.mo51267a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24563k) {
            C24563k kVar = (C24563k) obj;
            return getName().equals(kVar.getName()) && getSignature().equals(kVar.getSignature()) && this.flags == kVar.flags && this.arity == kVar.arity && C87412m.m108589b(getBoundReceiver(), kVar.getBoundReceiver()) && C87412m.m108589b(getOwner(), kVar.getOwner());
        } else if (obj instanceof C25237g) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        C25234c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public C24563k(int i, Object obj) {
        this(i, obj, (Class) null, (String) null, (String) null, 0);
    }

    public C25237g getReflected() {
        return (C25237g) super.getReflected();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24563k(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
