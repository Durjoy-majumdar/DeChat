package ac3;

import com.tencent.mapsdk.internal.C0947jz;
import u80.C111141c;

/* renamed from: ac3.i */
public final class C103359i extends C111141c {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C103359i(int r9, int r10, int r11, gy3.C8480h r12) {
        /*
            r8 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L_0x0006
            r9 = 0
        L_0x0006:
            r11 = r11 & 2
            if (r11 == 0) goto L_0x000b
            r10 = 0
        L_0x000b:
            r6 = 2
            r7 = 1
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            if (r9 == 0) goto L_0x001c
            if (r10 == 0) goto L_0x001c
            r8.mo143263u(r9, r10)
        L_0x001c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ac3.C103359i.<init>(int, int, int, gy3.h):void");
    }

    /* renamed from: q */
    public void mo143262q(int i) {
        boolean z = i != this.f332758m;
        this.f332758m = i;
        if (z) {
            mo143264v();
        }
    }

    /* renamed from: u */
    public void mo143263u(int i, int i2) {
        boolean z = (i == this.f332746a && i2 == this.f332747b) ? false : true;
        super.mo143263u(i, i2);
        if (z) {
            mo143264v();
        }
    }

    /* renamed from: v */
    public final void mo143264v() {
        int i;
        int i2 = this.f332747b;
        int i3 = this.f332746a;
        int i4 = C0947jz.f2205e;
        if (i2 > i3) {
            if (i2 <= 320) {
                i4 = i2;
            }
            i = (i3 * i4) / i2;
        } else {
            if (i3 <= 320) {
                i4 = i3;
            }
            int i5 = (i2 * i4) / i3;
            i = i4;
            i4 = i5;
        }
        if (this.f332758m % 180 != 0) {
            mo158522s(i4, i);
        } else {
            mo158522s(i, i4);
        }
    }
}
