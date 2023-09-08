package p004b0;

import gy3.C8480h;
import java.util.ArrayList;
import p560i2.C33179k;
import p560i2.C33183o;
import p631o1.C109854n0;
import p721v0.C111294a;
import sx3.C110823p;

/* renamed from: b0.o0 */
public final class C103963o0 {

    /* renamed from: a */
    public final int f307453a;

    /* renamed from: b */
    public final C109854n0[] f307454b;

    /* renamed from: c */
    public final boolean f307455c;

    /* renamed from: d */
    public final C111294a.C37633b f307456d;

    /* renamed from: e */
    public final C111294a.C37634c f307457e;

    /* renamed from: f */
    public final C33183o f307458f;

    /* renamed from: g */
    public final boolean f307459g;

    /* renamed from: h */
    public final int f307460h;

    /* renamed from: i */
    public final int f307461i;

    /* renamed from: j */
    public final C103956m f307462j;

    /* renamed from: k */
    public final int f307463k;

    /* renamed from: l */
    public final long f307464l;

    /* renamed from: m */
    public final Object f307465m;

    /* renamed from: n */
    public final int f307466n;

    /* renamed from: o */
    public final int f307467o;

    /* renamed from: p */
    public final int f307468p;

    public C103963o0(int i, C109854n0[] n0VarArr, boolean z, C111294a.C37633b bVar, C111294a.C37634c cVar, C33183o oVar, boolean z2, int i2, int i3, C103956m mVar, int i4, long j, Object obj, C8480h hVar) {
        this.f307453a = i;
        this.f307454b = n0VarArr;
        this.f307455c = z;
        this.f307456d = bVar;
        this.f307457e = cVar;
        this.f307458f = oVar;
        this.f307459g = z2;
        this.f307460h = i2;
        this.f307461i = i3;
        this.f307462j = mVar;
        this.f307463k = i4;
        this.f307464l = j;
        this.f307465m = obj;
        int i5 = 0;
        int i6 = 0;
        for (C109854n0 n0Var : n0VarArr) {
            boolean z3 = this.f307455c;
            i5 += z3 ? n0Var.f328780e : n0Var.f328779d;
            i6 = Math.max(i6, !z3 ? n0Var.f328780e : n0Var.f328779d);
        }
        this.f307466n = i5;
        this.f307467o = i5 + this.f307463k;
        this.f307468p = i6;
    }

    /* renamed from: a */
    public final C103940e0 mo145580a(int i, int i2, int i3) {
        long j;
        ArrayList arrayList = new ArrayList();
        int i4 = this.f307455c ? i3 : i2;
        boolean z = this.f307459g;
        int i5 = z ? (i4 - i) - this.f307466n : i;
        int E = z ? C110823p.m150979E(this.f307454b) : 0;
        while (true) {
            boolean z2 = this.f307459g;
            boolean z3 = true;
            if (!z2 ? E >= this.f307454b.length : E < 0) {
                z3 = false;
            }
            if (z3) {
                C109854n0 n0Var = this.f307454b[E];
                int size = z2 ? 0 : arrayList.size();
                if (this.f307455c) {
                    C111294a.C37633b bVar = this.f307456d;
                    if (bVar != null) {
                        j = C33179k.m39964a(bVar.mo61254a(n0Var.f328779d, i2, this.f307458f), i5);
                        int i6 = i3;
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    int i7 = i2;
                    C111294a.C37634c cVar = this.f307457e;
                    if (cVar != null) {
                        j = C33179k.m39964a(i5, cVar.mo61255a(n0Var.f328780e, i3));
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                long j2 = j;
                i5 += this.f307455c ? n0Var.f328780e : n0Var.f328779d;
                arrayList.add(size, new C103936d0(j2, n0Var, this.f307454b[E].mo161166c(), (C8480h) null));
                E = this.f307459g ? E - 1 : E + 1;
            } else {
                return new C103940e0(i, this.f307453a, this.f307465m, this.f307466n, this.f307467o, -(!z2 ? this.f307460h : this.f307461i), i4 + (!z2 ? this.f307461i : this.f307460h), this.f307455c, arrayList, this.f307462j, this.f307464l, (C8480h) null);
            }
        }
    }
}
