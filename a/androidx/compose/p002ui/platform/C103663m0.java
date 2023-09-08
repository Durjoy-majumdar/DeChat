package androidx.compose.p002ui.platform;

import android.os.Parcel;
import android.util.Base64;
import gy3.C87412m;
import p560i2.C33184p;
import p560i2.C33185q;
import p560i2.C33186r;

/* renamed from: androidx.compose.ui.platform.m0 */
public final class C103663m0 {

    /* renamed from: a */
    public final Parcel f306198a;

    public C103663m0(String str) {
        C87412m.m108594g(str, "string");
        Parcel obtain = Parcel.obtain();
        C87412m.m108593f(obtain, "obtain()");
        this.f306198a = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    /* renamed from: a */
    public final int mo144803a() {
        return this.f306198a.dataAvail();
    }

    /* renamed from: b */
    public final float mo144804b() {
        return this.f306198a.readFloat();
    }

    /* renamed from: c */
    public final long mo144805c() {
        byte readByte = this.f306198a.readByte();
        long j = readByte == 1 ? 4294967296L : readByte == 2 ? 8589934592L : 0;
        return C33186r.m39977a(j, 0) ? C33184p.f90062c : C33185q.m39976d(j, mo144804b());
    }
}
