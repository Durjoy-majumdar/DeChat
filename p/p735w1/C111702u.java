package p735w1;

import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import p451b2.C104014i;
import p560i2.C108319b;
import p560i2.C108322d;
import p560i2.C33183o;
import p735w1.C37958a;

/* renamed from: w1.u */
public final class C111702u {

    /* renamed from: a */
    public final C37958a f334361a;

    /* renamed from: b */
    public final C111705z f334362b;

    /* renamed from: c */
    public final List<C37958a.C37961b<C37967m>> f334363c;

    /* renamed from: d */
    public final int f334364d;

    /* renamed from: e */
    public final boolean f334365e;

    /* renamed from: f */
    public final int f334366f;

    /* renamed from: g */
    public final C108322d f334367g;

    /* renamed from: h */
    public final C33183o f334368h;

    /* renamed from: i */
    public final C104014i.C104015a f334369i;

    /* renamed from: j */
    public final long f334370j;

    public C111702u(C37958a aVar, C111705z zVar, List list, int i, boolean z, int i2, C108322d dVar, C33183o oVar, C104014i.C104015a aVar2, long j, C8480h hVar) {
        this.f334361a = aVar;
        this.f334362b = zVar;
        this.f334363c = list;
        this.f334364d = i;
        this.f334365e = z;
        this.f334366f = i2;
        this.f334367g = dVar;
        this.f334368h = oVar;
        this.f334369i = aVar2;
        this.f334370j = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C111702u)) {
            return false;
        }
        C111702u uVar = (C111702u) obj;
        if (!C87412m.m108589b(this.f334361a, uVar.f334361a) || !C87412m.m108589b(this.f334362b, uVar.f334362b) || !C87412m.m108589b(this.f334363c, uVar.f334363c) || this.f334364d != uVar.f334364d || this.f334365e != uVar.f334365e) {
            return false;
        }
        return (this.f334366f == uVar.f334366f) && C87412m.m108589b(this.f334367g, uVar.f334367g) && this.f334368h == uVar.f334368h && C87412m.m108589b(this.f334369i, uVar.f334369i) && C108319b.m146691b(this.f334370j, uVar.f334370j);
    }

    public int hashCode() {
        int hashCode = ((((((this.f334361a.hashCode() * 31) + this.f334362b.hashCode()) * 31) + this.f334363c.hashCode()) * 31) + this.f334364d) * 31;
        int i = this.f334365e ? 1231 : 1237;
        long j = this.f334370j;
        return ((((((((((hashCode + i) * 31) + this.f334366f) * 31) + this.f334367g.hashCode()) * 31) + this.f334368h.hashCode()) * 31) + this.f334369i.hashCode()) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("TextLayoutInput(text=");
        sb.append(this.f334361a);
        sb.append(", style=");
        sb.append(this.f334362b);
        sb.append(", placeholders=");
        sb.append(this.f334363c);
        sb.append(", maxLines=");
        sb.append(this.f334364d);
        sb.append(", softWrap=");
        sb.append(this.f334365e);
        sb.append(", overflow=");
        int i = this.f334366f;
        boolean z = false;
        if (i == 1) {
            str = "Clip";
        } else {
            if (i == 2) {
                str = "Ellipsis";
            } else {
                if (i == 3) {
                    z = true;
                }
                str = z ? "Visible" : "Invalid";
            }
        }
        sb.append(str);
        sb.append(", density=");
        sb.append(this.f334367g);
        sb.append(", layoutDirection=");
        sb.append(this.f334368h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f334369i);
        sb.append(", constraints=");
        sb.append(C108319b.m146700k(this.f334370j));
        sb.append(')');
        return sb.toString();
    }
}
