package as3;

import java.util.Arrays;
import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.x0 */
public final class C103910x0 extends C108421e {

    /* renamed from: e */
    public static volatile C103910x0[] f307215e;

    /* renamed from: b */
    public int f307216b = 0;

    /* renamed from: c */
    public int f307217c = 0;

    /* renamed from: d */
    public byte[] f307218d = C108422g.f324646c;

    public C103910x0() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = this.f307216b;
        int i2 = 0;
        if (i != 0) {
            i2 = 0 + C108418b.m146882b(1, i);
        }
        int i3 = this.f307217c;
        if (i3 != 0) {
            i2 += C108418b.m146882b(2, i3);
        }
        return !Arrays.equals(this.f307218d, C108422g.f324646c) ? i2 + C108418b.m146881a(3, this.f307218d) : i2;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 8) {
                this.f307216b = aVar.mo158946h();
            } else if (k == 16) {
                this.f307217c = aVar.mo158946h();
            } else if (k == 26) {
                this.f307218d = aVar.mo158942d();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        int i = this.f307216b;
        if (i != 0) {
            bVar.mo158954m(1, i);
        }
        int i2 = this.f307217c;
        if (i2 != 0) {
            bVar.mo158954m(2, i2);
        }
        if (!Arrays.equals(this.f307218d, C108422g.f324646c)) {
            bVar.mo158953l(3, this.f307218d);
        }
    }
}
