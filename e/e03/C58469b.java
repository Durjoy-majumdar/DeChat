package e03;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: e03.b */
public final class C58469b {

    /* renamed from: a */
    public int f167445a;

    /* renamed from: b */
    public int f167446b;

    /* renamed from: c */
    public final int f167447c;

    /* renamed from: d */
    public int f167448d;

    /* renamed from: e */
    public long f167449e;

    /* renamed from: f */
    public String f167450f;

    /* renamed from: g */
    public int f167451g;

    public C58469b(int i, int i2, int i3, int i4, long j, String str, int i5) {
        C87412m.m108594g(str, "desc");
        this.f167445a = i;
        this.f167446b = i2;
        this.f167447c = i3;
        this.f167448d = i4;
        this.f167449e = j;
        this.f167450f = str;
        this.f167451g = i5;
    }

    /* renamed from: a */
    public static C58469b m67900a(C58469b bVar, int i, int i2, int i3, int i4, long j, String str, int i5, int i6, Object obj) {
        C58469b bVar2 = bVar;
        int i7 = (i6 & 1) != 0 ? bVar2.f167445a : i;
        int i8 = (i6 & 2) != 0 ? bVar2.f167446b : i2;
        int i9 = (i6 & 4) != 0 ? bVar2.f167447c : i3;
        int i15 = (i6 & 8) != 0 ? bVar2.f167448d : i4;
        long j2 = (i6 & 16) != 0 ? bVar2.f167449e : j;
        String str2 = (i6 & 32) != 0 ? bVar2.f167450f : str;
        int i16 = (i6 & 64) != 0 ? bVar2.f167451g : i5;
        bVar.getClass();
        C87412m.m108594g(str2, "desc");
        return new C58469b(i7, i8, i9, i15, j2, str2, i16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58469b)) {
            return false;
        }
        C58469b bVar = (C58469b) obj;
        return this.f167445a == bVar.f167445a && this.f167446b == bVar.f167446b && this.f167447c == bVar.f167447c && this.f167448d == bVar.f167448d && this.f167449e == bVar.f167449e && C87412m.m108589b(this.f167450f, bVar.f167450f) && this.f167451g == bVar.f167451g;
    }

    public int hashCode() {
        long j = this.f167449e;
        return (((((((((((this.f167445a * 31) + this.f167446b) * 31) + this.f167447c) * 31) + this.f167448d) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f167450f.hashCode()) * 31) + this.f167451g;
    }

    public String toString() {
        return "CdnTaskContext(actionType=" + this.f167445a + ", downloadType=" + this.f167446b + ", commentScene=" + this.f167447c + ", downloadStrategy=" + this.f167448d + ", durationMs=" + this.f167449e + ", desc=" + this.f167450f + ", preloadStage=" + this.f167451g + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C58469b(int i, int i2, int i3, int i4, long j, String str, int i5, int i6, C8480h hVar) {
        this(i, i2, i3, i4, (i6 & 16) != 0 ? 0 : j, (i6 & 32) != 0 ? "" : str, (i6 & 64) != 0 ? 0 : i5);
    }

    public C58469b() {
        this(-1, -1, -1, -1, -1, "", 0, 64, (C8480h) null);
    }
}
