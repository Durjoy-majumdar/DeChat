package p175j0;

import gy3.C87412m;
import hy3.C33145a;
import java.util.ArrayList;
import java.util.Iterator;
import p708u0.C111061a;

/* renamed from: j0.z1 */
public final class C24729z1 implements C111061a, Iterable<Object>, C33145a {

    /* renamed from: d */
    public int[] f70553d = new int[0];

    /* renamed from: e */
    public int f70554e;

    /* renamed from: f */
    public Object[] f70555f = new Object[0];

    /* renamed from: g */
    public int f70556g;

    /* renamed from: h */
    public int f70557h;

    /* renamed from: i */
    public boolean f70558i;

    /* renamed from: j */
    public int f70559j;

    /* renamed from: n */
    public ArrayList<C24663c> f70560n = new ArrayList<>();

    /* renamed from: f */
    public final int mo51704f(C24663c cVar) {
        C87412m.m108594g(cVar, "anchor");
        if (!(!this.f70558i)) {
            C24715p.m31027c("Use active SlotWriter to determine anchor location instead".toString());
            throw null;
        } else if (cVar.mo51537a()) {
            return cVar.f70328a;
        } else {
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
    }

    /* renamed from: i */
    public final boolean mo51705i(int i, C24663c cVar) {
        C87412m.m108594g(cVar, "anchor");
        if (!this.f70558i) {
            if (i >= 0 && i < this.f70554e) {
                if (mo51709m(cVar)) {
                    int b = C24659a2.m30850b(this.f70553d, i) + i;
                    int i2 = cVar.f70328a;
                    if (i <= i2 && i2 < b) {
                        return true;
                    }
                }
                return false;
            }
            C24715p.m31027c("Invalid group index".toString());
            throw null;
        }
        C24715p.m31027c("Writer is active".toString());
        throw null;
    }

    public Iterator<Object> iterator() {
        return new C24704j0(this, 0, this.f70554e);
    }

    /* renamed from: k */
    public final C24728y1 mo51707k() {
        if (!this.f70558i) {
            this.f70557h++;
            return new C24728y1(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    /* renamed from: l */
    public final C24661b2 mo51708l() {
        if (!this.f70558i) {
            if (this.f70557h <= 0) {
                this.f70558i = true;
                this.f70559j++;
                return new C24661b2(this);
            }
            C24715p.m31027c("Cannot start a writer when a reader is pending".toString());
            throw null;
        }
        C24715p.m31027c("Cannot start a writer when another writer is pending".toString());
        throw null;
    }

    /* renamed from: m */
    public final boolean mo51709m(C24663c cVar) {
        C87412m.m108594g(cVar, "anchor");
        if (cVar.mo51537a()) {
            int k = C24659a2.m30859k(this.f70560n, cVar.f70328a, this.f70554e);
            if (k >= 0 && C87412m.m108589b(this.f70560n.get(k), cVar)) {
                return true;
            }
        }
        return false;
    }
}
