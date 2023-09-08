package p869y0;

import rx3.C13603j;

/* renamed from: y0.b0 */
public enum C112306b0 implements C66476a0 {
    Active,
    ActiveParent,
    Captured,
    Deactivated,
    DeactivatedParent,
    Inactive;

    /* renamed from: a */
    public boolean mo90559a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return true;
            }
            if (!(ordinal == 3 || ordinal == 4 || ordinal == 5)) {
                throw new C13603j();
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo164040b() {
        int ordinal = ordinal();
        if (!(ordinal == 0 || ordinal == 1 || ordinal == 2)) {
            if (ordinal == 3 || ordinal == 4) {
                return true;
            }
            if (ordinal != 5) {
                throw new C13603j();
            }
        }
        return false;
    }
}
