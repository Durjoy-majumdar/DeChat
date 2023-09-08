package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.y */
public final class C103911y extends C108421e {

    /* renamed from: d */
    public static volatile C103911y[] f307219d;

    /* renamed from: b */
    public String f307220b = "";

    /* renamed from: c */
    public String f307221c = "";

    public C103911y() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = 0;
        if (!this.f307220b.equals("")) {
            i = 0 + C108418b.m146887g(1, this.f307220b);
        }
        return !this.f307221c.equals("") ? i + C108418b.m146887g(2, this.f307221c) : i;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 10) {
                this.f307220b = aVar.mo158948j();
            } else if (k == 18) {
                this.f307221c = aVar.mo158948j();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        if (!this.f307220b.equals("")) {
            bVar.mo158961t(1, this.f307220b);
        }
        if (!this.f307221c.equals("")) {
            bVar.mo158961t(2, this.f307221c);
        }
    }
}
