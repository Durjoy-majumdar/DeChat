package as3;

import java.util.Arrays;
import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.x */
public final class C103909x extends C108421e {

    /* renamed from: b */
    public C103907w f307213b = null;

    /* renamed from: c */
    public byte[] f307214c = C108422g.f324646c;

    public C103909x() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        C103907w wVar = this.f307213b;
        int i = 0;
        if (wVar != null) {
            i = 0 + C108418b.m146884d(1, wVar);
        }
        return !Arrays.equals(this.f307214c, C108422g.f324646c) ? i + C108418b.m146881a(2, this.f307214c) : i;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 10) {
                if (this.f307213b == null) {
                    this.f307213b = new C103907w();
                }
                aVar.mo158943e(this.f307213b);
            } else if (k == 18) {
                this.f307214c = aVar.mo158942d();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        C103907w wVar = this.f307213b;
        if (wVar != null) {
            bVar.mo158956o(1, wVar);
        }
        if (!Arrays.equals(this.f307214c, C108422g.f324646c)) {
            bVar.mo158953l(2, this.f307214c);
        }
    }
}
