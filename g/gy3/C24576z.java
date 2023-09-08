package gy3;

import ny3.C25234c;
import ny3.C89104m;

/* renamed from: gy3.z */
public abstract class C24576z extends C24557d implements C89104m {
    public C24576z() {
    }

    /* renamed from: c */
    public C89104m getReflected() {
        return (C89104m) super.getReflected();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24576z) {
            C24576z zVar = (C24576z) obj;
            return getOwner().equals(zVar.getOwner()) && getName().equals(zVar.getName()) && getSignature().equals(zVar.getSignature()) && C87412m.m108589b(getBoundReceiver(), zVar.getBoundReceiver());
        } else if (obj instanceof C89104m) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        C25234c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24576z(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }
}
