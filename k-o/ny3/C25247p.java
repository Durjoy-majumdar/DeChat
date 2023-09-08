package ny3;

import gy3.C87412m;
import rx3.C13603j;

/* renamed from: ny3.p */
public final class C25247p {

    /* renamed from: c */
    public static final C25247p f71705c = new C25247p((C25249q) null, (C25245n) null);

    /* renamed from: a */
    public final C25249q f71706a;

    /* renamed from: b */
    public final C25245n f71707b;

    /* renamed from: ny3.p$a */
    public /* synthetic */ class C25248a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f71708a;

        static {
            int[] iArr = new int[C25249q.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            f71708a = iArr;
        }
    }

    public C25247p(C25249q qVar, C25245n nVar) {
        String str;
        this.f71706a = qVar;
        this.f71707b = nVar;
        if (!((qVar == null) != (nVar == null) ? false : true)) {
            if (qVar == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + qVar + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25247p)) {
            return false;
        }
        C25247p pVar = (C25247p) obj;
        return this.f71706a == pVar.f71706a && C87412m.m108589b(this.f71707b, pVar.f71707b);
    }

    public int hashCode() {
        C25249q qVar = this.f71706a;
        int i = 0;
        int hashCode = (qVar == null ? 0 : qVar.hashCode()) * 31;
        C25245n nVar = this.f71707b;
        if (nVar != null) {
            i = nVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        C25249q qVar = this.f71706a;
        int i = qVar == null ? -1 : C25248a.f71708a[qVar.ordinal()];
        if (i == -1) {
            return "*";
        }
        if (i == 1) {
            return String.valueOf(this.f71707b);
        }
        if (i == 2) {
            return "in " + this.f71707b;
        } else if (i == 3) {
            return "out " + this.f71707b;
        } else {
            throw new C13603j();
        }
    }
}
