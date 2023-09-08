package androidx.compose.p002ui.platform;

import android.os.Parcel;
import gy3.C87412m;
import p560i2.C33184p;
import p560i2.C33186r;

/* renamed from: androidx.compose.ui.platform.v0 */
public final class C103702v0 {

    /* renamed from: a */
    public Parcel f306288a;

    public C103702v0() {
        Parcel obtain = Parcel.obtain();
        C87412m.m108593f(obtain, "obtain()");
        this.f306288a = obtain;
    }

    /* renamed from: a */
    public final void mo144866a(byte b) {
        this.f306288a.writeByte(b);
    }

    /* renamed from: b */
    public final void mo144867b(float f) {
        this.f306288a.writeFloat(f);
    }

    /* renamed from: c */
    public final void mo144868c(long j) {
        long b = C33184p.m39969b(j);
        byte b2 = 0;
        if (!C33186r.m39977a(b, 0)) {
            if (C33186r.m39977a(b, 4294967296L)) {
                b2 = 1;
            } else if (C33186r.m39977a(b, 8589934592L)) {
                b2 = 2;
            }
        }
        mo144866a(b2);
        if (!C33186r.m39977a(C33184p.m39969b(j), 0)) {
            mo144867b(C33184p.m39970c(j));
        }
    }
}
