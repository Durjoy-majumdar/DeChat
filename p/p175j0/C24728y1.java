package p175j0;

import gy3.C87412m;
import java.util.ArrayList;
import p175j0.C108504h;

/* renamed from: j0.y1 */
public final class C24728y1 {

    /* renamed from: a */
    public final C24729z1 f70542a;

    /* renamed from: b */
    public final int[] f70543b;

    /* renamed from: c */
    public final int f70544c;

    /* renamed from: d */
    public final Object[] f70545d;

    /* renamed from: e */
    public final int f70546e;

    /* renamed from: f */
    public int f70547f;

    /* renamed from: g */
    public int f70548g;

    /* renamed from: h */
    public int f70549h = -1;

    /* renamed from: i */
    public int f70550i;

    /* renamed from: j */
    public int f70551j;

    /* renamed from: k */
    public int f70552k;

    public C24728y1(C24729z1 z1Var) {
        C87412m.m108594g(z1Var, "table");
        this.f70542a = z1Var;
        this.f70543b = z1Var.f70553d;
        int i = z1Var.f70554e;
        this.f70544c = i;
        this.f70545d = z1Var.f70555f;
        this.f70546e = z1Var.f70556g;
        this.f70548g = i;
    }

    /* renamed from: a */
    public final C24663c mo51687a(int i) {
        ArrayList<C24663c> arrayList = this.f70542a.f70560n;
        int k = C24659a2.m30859k(arrayList, i, this.f70544c);
        if (k < 0) {
            C24663c cVar = new C24663c(i);
            arrayList.add(-(k + 1), cVar);
            return cVar;
        }
        C24663c cVar2 = arrayList.get(k);
        C87412m.m108593f(cVar2, "get(location)");
        return cVar2;
    }

    /* renamed from: b */
    public final Object mo51688b(int[] iArr, int i) {
        int i2;
        if (C24659a2.m30851c(iArr, i)) {
            Object[] objArr = this.f70545d;
            int i3 = i * 5;
            if (i3 >= iArr.length) {
                i2 = iArr.length;
            } else {
                i2 = C24659a2.m30858j(iArr[i3 + 1] >> 29) + iArr[i3 + 4];
            }
            return objArr[i2];
        }
        int i4 = C108504h.f324828a;
        return C108504h.C60656a.f172772a;
    }

    /* renamed from: c */
    public final void mo51689c() {
        C24729z1 z1Var = this.f70542a;
        z1Var.getClass();
        if (this.f70542a == z1Var && z1Var.f70557h > 0) {
            z1Var.f70557h--;
            return;
        }
        throw new IllegalArgumentException("Unexpected reader close()".toString());
    }

    /* renamed from: d */
    public final void mo51690d() {
        if (this.f70550i == 0) {
            if (this.f70547f == this.f70548g) {
                int[] iArr = this.f70543b;
                int i = iArr[(this.f70549h * 5) + 2];
                this.f70549h = i;
                this.f70548g = i < 0 ? this.f70544c : C24659a2.m30850b(iArr, i) + i;
                return;
            }
            throw new IllegalArgumentException("endGroup() not called at the end of a group".toString());
        }
    }

    /* renamed from: e */
    public final Object mo51691e() {
        int i = this.f70547f;
        if (i < this.f70548g) {
            return mo51688b(this.f70543b, i);
        }
        return 0;
    }

    /* renamed from: f */
    public final int mo51692f() {
        int i = this.f70547f;
        if (i < this.f70548g) {
            return this.f70543b[i * 5];
        }
        return 0;
    }

    /* renamed from: g */
    public final Object mo51693g(int i, int i2) {
        int g = C24659a2.m30855g(this.f70543b, i);
        int i3 = i + 1;
        int i4 = g + i2;
        return i4 < (i3 < this.f70544c ? this.f70543b[(i3 * 5) + 4] : this.f70546e) ? this.f70545d[i4] : C108504h.C60656a.f172772a;
    }

    /* renamed from: h */
    public final int mo51694h(int i) {
        return C24659a2.m30850b(this.f70543b, i);
    }

    /* renamed from: i */
    public final boolean mo51695i(int i) {
        return C24659a2.m30852d(this.f70543b, i);
    }

    /* renamed from: j */
    public final Object mo51696j(int i) {
        if (!C24659a2.m30852d(this.f70543b, i)) {
            return null;
        }
        int[] iArr = this.f70543b;
        if (C24659a2.m30852d(iArr, i)) {
            return this.f70545d[iArr[(i * 5) + 4]];
        }
        int i2 = C108504h.f324828a;
        return C108504h.C60656a.f172772a;
    }

    /* renamed from: k */
    public final Object mo51697k(int[] iArr, int i) {
        int i2 = i * 5;
        boolean z = true;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            z = false;
        }
        if (z) {
            return this.f70545d[iArr[i2 + 4] + C24659a2.m30858j(i3 >> 30)];
        }
        return null;
    }

    /* renamed from: l */
    public final int mo51698l(int i) {
        return this.f70543b[(i * 5) + 2];
    }

    /* renamed from: m */
    public final void mo51699m(int i) {
        if (this.f70550i == 0) {
            this.f70547f = i;
            int i2 = this.f70544c;
            int i3 = i < i2 ? this.f70543b[(i * 5) + 2] : -1;
            this.f70549h = i3;
            if (i3 < 0) {
                this.f70548g = i2;
            } else {
                this.f70548g = i3 + C24659a2.m30850b(this.f70543b, i3);
            }
            this.f70551j = 0;
            this.f70552k = 0;
            return;
        }
        throw new IllegalArgumentException("Cannot reposition while in an empty region".toString());
    }

    /* renamed from: n */
    public final int mo51700n() {
        int i = 1;
        if (this.f70550i == 0) {
            if (!C24659a2.m30852d(this.f70543b, this.f70547f)) {
                i = C24659a2.m30854f(this.f70543b, this.f70547f);
            }
            int i2 = this.f70547f;
            this.f70547f = i2 + C24659a2.m30850b(this.f70543b, i2);
            return i;
        }
        throw new IllegalArgumentException("Cannot skip while in an empty region".toString());
    }

    /* renamed from: o */
    public final void mo51701o() {
        if (this.f70550i == 0) {
            this.f70547f = this.f70548g;
            return;
        }
        throw new IllegalArgumentException("Cannot skip the enclosing group while in an empty region".toString());
    }

    /* renamed from: p */
    public final void mo51702p() {
        if (this.f70550i <= 0) {
            int[] iArr = this.f70543b;
            int i = this.f70547f;
            if (iArr[(i * 5) + 2] == this.f70549h) {
                this.f70549h = i;
                this.f70548g = i + C24659a2.m30850b(iArr, i);
                int i2 = this.f70547f;
                int i3 = i2 + 1;
                this.f70547f = i3;
                this.f70551j = C24659a2.m30855g(this.f70543b, i2);
                this.f70552k = i2 >= this.f70544c - 1 ? this.f70546e : this.f70543b[(i3 * 5) + 4];
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    public String toString() {
        return "SlotReader(current=" + this.f70547f + ", key=" + mo51692f() + ", parent=" + this.f70549h + ", end=" + this.f70548g + ')';
    }
}
