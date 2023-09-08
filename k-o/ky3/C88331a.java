package ky3;

import gy3.C87412m;
import java.util.Random;

/* renamed from: ky3.a */
public abstract class C88331a extends C88334c {
    /* renamed from: a */
    public int mo122713a(int i) {
        return ((-i) >> 31) & (mo122720j().nextInt() >>> (32 - i));
    }

    /* renamed from: b */
    public byte[] mo122714b(byte[] bArr) {
        C87412m.m108594g(bArr, "array");
        mo122720j().nextBytes(bArr);
        return bArr;
    }

    /* renamed from: d */
    public double mo122715d() {
        return mo122720j().nextDouble();
    }

    /* renamed from: e */
    public float mo122716e() {
        return mo122720j().nextFloat();
    }

    /* renamed from: f */
    public int mo122717f() {
        return mo122720j().nextInt();
    }

    /* renamed from: g */
    public int mo122718g(int i) {
        return mo122720j().nextInt(i);
    }

    /* renamed from: i */
    public long mo122719i() {
        return mo122720j().nextLong();
    }

    /* renamed from: j */
    public abstract Random mo122720j();
}
