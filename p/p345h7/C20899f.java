package p345h7;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.util.List;
import p294b7.C16743g;
import p294b7.C16750m;
import p333e8.C20540l;
import p333e8.C20541m;
import p345h7.C20923v;
import p401y6.C23246m;

/* renamed from: h7.f */
public final class C20899f implements C20901h {

    /* renamed from: a */
    public final C20541m f59080a;

    /* renamed from: b */
    public final String f59081b;

    /* renamed from: c */
    public String f59082c;

    /* renamed from: d */
    public C16750m f59083d;

    /* renamed from: e */
    public int f59084e = 0;

    /* renamed from: f */
    public int f59085f;

    /* renamed from: g */
    public int f59086g;

    /* renamed from: h */
    public long f59087h;

    /* renamed from: i */
    public Format f59088i;

    /* renamed from: j */
    public int f59089j;

    /* renamed from: k */
    public long f59090k;

    public C20899f(String str) {
        C20541m mVar = new C20541m(new byte[15]);
        this.f59080a = mVar;
        byte[] bArr = mVar.f57809a;
        bArr[0] = Byte.MAX_VALUE;
        bArr[1] = -2;
        bArr[2] = Byte.MIN_VALUE;
        bArr[3] = 1;
        this.f59081b = str;
    }

    /* renamed from: a */
    public void mo32609a(C20541m mVar) {
        C20541m mVar2 = mVar;
        while (true) {
            int i = mVar2.f57811c;
            int i2 = mVar2.f57810b;
            if (i - i2 > 0) {
                int i3 = this.f59084e;
                boolean z = false;
                if (i3 == 0) {
                    while (true) {
                        if (mVar2.f57811c - mVar2.f57810b <= 0) {
                            break;
                        }
                        int i4 = this.f59086g << 8;
                        this.f59086g = i4;
                        int n = i4 | mVar.mo32103n();
                        this.f59086g = n;
                        if (n == 2147385345) {
                            this.f59086g = 0;
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        this.f59085f = 4;
                        this.f59084e = 1;
                    }
                } else if (i3 == 1) {
                    byte[] bArr = this.f59080a.f57809a;
                    int min = Math.min(i - i2, 15 - this.f59085f);
                    mVar2.mo32091b(bArr, this.f59085f, min);
                    int i5 = this.f59085f + min;
                    this.f59085f = i5;
                    if (i5 == 15) {
                        byte[] bArr2 = this.f59080a.f57809a;
                        if (this.f59088i == null) {
                            String str = this.f59082c;
                            String str2 = this.f59081b;
                            C20540l lVar = new C20540l(bArr2, bArr2.length);
                            lVar.mo32089f(60);
                            int i6 = C23246m.f66769a[lVar.mo32087d(6)];
                            int i7 = C23246m.f66770b[lVar.mo32087d(4)];
                            int d = lVar.mo32087d(5);
                            int i8 = d >= 29 ? -1 : (C23246m.f66771c[d] * 1000) / 2;
                            lVar.mo32089f(10);
                            Format c = Format.m16642c(str, MimeTypes.AUDIO_DTS, (String) null, i8, -1, i6 + (lVar.mo32087d(2) > 0 ? 1 : 0), i7, (List<byte[]>) null, (DrmInitData) null, 0, str2);
                            this.f59088i = c;
                            this.f59083d.mo17741a(c);
                        }
                        byte b = bArr2[5];
                        this.f59089j = (((b & 2) << 12) | ((bArr2[6] & ExifInterface.MARKER) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                        this.f59087h = (long) ((int) ((((long) (((((bArr2[4] & 1) << 6) | ((b & 252) >> 2)) + 1) * 32)) * TimeUtil.SECOND_TO_US) / ((long) this.f59088i.f45790y)));
                        this.f59080a.mo32113x(0);
                        this.f59083d.mo17742b(this.f59080a, 15);
                        this.f59084e = 2;
                    }
                } else if (i3 == 2) {
                    int min2 = Math.min(i - i2, this.f59089j - this.f59085f);
                    this.f59083d.mo17742b(mVar2, min2);
                    int i9 = this.f59085f + min2;
                    this.f59085f = i9;
                    int i15 = this.f59089j;
                    if (i9 == i15) {
                        this.f59083d.mo17744d(this.f59090k, 1, i15, 0, (C16750m.C16751a) null);
                        this.f59090k += this.f59087h;
                        this.f59084e = 0;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo32610b() {
        this.f59084e = 0;
        this.f59085f = 0;
        this.f59086g = 0;
    }

    /* renamed from: c */
    public void mo32611c() {
    }

    /* renamed from: d */
    public void mo32612d(C16743g gVar, C20923v.C20927d dVar) {
        dVar.mo32634a();
        dVar.mo32635b();
        this.f59082c = dVar.f59281e;
        dVar.mo32635b();
        this.f59083d = gVar.mo17752o(dVar.f59280d, 1);
    }

    /* renamed from: e */
    public void mo32613e(long j, boolean z) {
        this.f59090k = j;
    }
}
