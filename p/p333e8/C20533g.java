package p333e8;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: e8.g */
public final class C20533g {

    /* renamed from: a */
    public final int f57782a;

    /* renamed from: b */
    public final int f57783b;

    /* renamed from: c */
    public final int f57784c;

    /* renamed from: d */
    public final long f57785d;

    public C20533g(byte[] bArr, int i) {
        C20540l lVar = new C20540l(bArr, bArr.length);
        lVar.mo32088e(i * 8);
        lVar.mo32087d(16);
        lVar.mo32087d(16);
        lVar.mo32087d(24);
        lVar.mo32087d(24);
        this.f57782a = lVar.mo32087d(20);
        this.f57783b = lVar.mo32087d(3) + 1;
        this.f57784c = lVar.mo32087d(5) + 1;
        this.f57785d = ((((long) lVar.mo32087d(4)) & 15) << 32) | (((long) lVar.mo32087d(32)) & Util.MAX_32BIT_VALUE);
    }
}
