package as3;

import java.util.Arrays;
import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.p */
public final class C103893p extends C108421e {

    /* renamed from: e */
    public static volatile C103893p[] f307120e;

    /* renamed from: b */
    public int f307121b = 0;

    /* renamed from: c */
    public byte[] f307122c = C108422g.f324646c;

    /* renamed from: d */
    public int f307123d = 0;

    public C103893p() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = this.f307121b;
        int i2 = 0;
        if (i != 0) {
            i2 = 0 + C108418b.m146882b(1, i);
        }
        if (!Arrays.equals(this.f307122c, C108422g.f324646c)) {
            i2 += C108418b.m146881a(2, this.f307122c);
        }
        int i3 = this.f307123d;
        return i3 != 0 ? i2 + C108418b.m146890j(3, i3) : i2;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 8) {
                this.f307121b = aVar.mo158946h();
            } else if (k == 18) {
                this.f307122c = aVar.mo158942d();
            } else if (k == 24) {
                this.f307123d = aVar.mo158946h();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        int i = this.f307121b;
        if (i != 0) {
            bVar.mo158954m(1, i);
        }
        if (!Arrays.equals(this.f307122c, C108422g.f324646c)) {
            bVar.mo158953l(2, this.f307122c);
        }
        int i2 = this.f307123d;
        if (i2 != 0) {
            bVar.mo158963v(3, i2);
        }
    }
}
