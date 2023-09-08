package kk1;

import dj1.C45379o0;
import gy3.C87412m;
import te3.C51489u31;
import te3.C52312zv0;

/* renamed from: kk1.a */
public final class C46728a implements C45379o0.C45380a {

    /* renamed from: a */
    public final /* synthetic */ long f125798a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f125799b;

    /* renamed from: c */
    public final /* synthetic */ String f125800c;

    /* renamed from: d */
    public final /* synthetic */ long f125801d;

    /* renamed from: e */
    public final /* synthetic */ C52312zv0 f125802e;

    public C46728a(long j, byte[] bArr, String str, long j2, C52312zv0 zv02) {
        this.f125798a = j;
        this.f125799b = bArr;
        this.f125800c = str;
        this.f125801d = j2;
        this.f125802e = zv02;
    }

    /* renamed from: a */
    public void mo70894a(int i, int i2, String str, int i3, C51489u31 u312) {
        int i4 = i3;
        C87412m.m108594g(u312, "resp");
        if (!(i == 0 && i2 == 0) && i4 < 3) {
            long j = this.f125798a;
            byte[] bArr = this.f125799b;
            String str2 = this.f125800c;
            long j2 = this.f125801d;
            C52312zv0 zv02 = this.f125802e;
            C87412m.m108594g(zv02, "musicInfo");
            C52312zv0 zv03 = zv02;
            new C45379o0(j, bArr, str2, j2, zv03, i4 + 1, new C46728a(j, bArr, str2, j2, zv02)).mo9225i();
        }
    }
}
