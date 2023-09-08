package p345h7;

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
import p401y6.C23224a;

/* renamed from: h7.b */
public final class C20895b implements C20901h {

    /* renamed from: a */
    public final C20540l f59043a;

    /* renamed from: b */
    public final C20541m f59044b;

    /* renamed from: c */
    public final String f59045c;

    /* renamed from: d */
    public String f59046d;

    /* renamed from: e */
    public C16750m f59047e;

    /* renamed from: f */
    public int f59048f = 0;

    /* renamed from: g */
    public int f59049g;

    /* renamed from: h */
    public boolean f59050h;

    /* renamed from: i */
    public long f59051i;

    /* renamed from: j */
    public Format f59052j;

    /* renamed from: k */
    public int f59053k;

    /* renamed from: l */
    public long f59054l;

    public C20895b(String str) {
        C20540l lVar = new C20540l(new byte[8], 8);
        this.f59043a = lVar;
        this.f59044b = new C20541m(lVar.f57805a);
        this.f59045c = str;
    }

    /* renamed from: a */
    public void mo32609a(C20541m mVar) {
        boolean z;
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        C20541m mVar2 = mVar;
        while (true) {
            int i5 = mVar2.f57811c;
            int i6 = mVar2.f57810b;
            if (i5 - i6 > 0) {
                int i7 = this.f59048f;
                if (i7 == 0) {
                    while (true) {
                        if (mVar2.f57811c - mVar2.f57810b <= 0) {
                            z = false;
                            break;
                        } else if (!this.f59050h) {
                            this.f59050h = mVar.mo32103n() == 11;
                        } else {
                            int n = mVar.mo32103n();
                            if (n == 119) {
                                this.f59050h = false;
                                z = true;
                                break;
                            }
                            this.f59050h = n == 11;
                        }
                    }
                    if (z) {
                        this.f59048f = 1;
                        byte[] bArr = this.f59044b.f57809a;
                        bArr[0] = 11;
                        bArr[1] = 119;
                        this.f59049g = 2;
                    }
                } else if (i7 == 1) {
                    byte[] bArr2 = this.f59044b.f57809a;
                    int min = Math.min(i5 - i6, 8 - this.f59049g);
                    mVar2.mo32091b(bArr2, this.f59049g, min);
                    int i8 = this.f59049g + min;
                    this.f59049g = i8;
                    if (i8 == 8) {
                        this.f59043a.mo32088e(0);
                        C20540l lVar = this.f59043a;
                        int i9 = (lVar.f57806b * 8) + lVar.f57807c;
                        lVar.mo32089f(40);
                        boolean z2 = lVar.mo32087d(5) == 16;
                        lVar.mo32088e(i9);
                        int i15 = 6;
                        if (z2) {
                            lVar.mo32089f(21);
                            i3 = (lVar.mo32087d(11) + 1) * 2;
                            int d = lVar.mo32087d(2);
                            if (d == 3) {
                                i2 = C23224a.f66667c[lVar.mo32087d(2)];
                            } else {
                                i15 = C23224a.f66665a[lVar.mo32087d(2)];
                                i2 = C23224a.f66666b[d];
                            }
                            i4 = i15 * 256;
                            i = lVar.mo32087d(3);
                            str = MimeTypes.AUDIO_E_AC3;
                        } else {
                            lVar.mo32089f(32);
                            int d2 = lVar.mo32087d(2);
                            int a = C23224a.m27627a(d2, lVar.mo32087d(6));
                            lVar.mo32089f(8);
                            int d3 = lVar.mo32087d(3);
                            if (!((d3 & 1) == 0 || d3 == 1)) {
                                lVar.mo32089f(2);
                            }
                            if ((d3 & 4) != 0) {
                                lVar.mo32089f(2);
                            }
                            if (d3 == 2) {
                                lVar.mo32089f(2);
                            }
                            int i16 = C23224a.f66666b[d2];
                            i = d3;
                            str = MimeTypes.AUDIO_AC3;
                            i2 = i16;
                            i3 = a;
                            i4 = 1536;
                        }
                        int i17 = C23224a.f66668d[i] + (lVar.mo32086c() ? 1 : 0);
                        Format format = this.f59052j;
                        if (!(format != null && i17 == format.f45789x && i2 == format.f45790y && str == format.f45777i)) {
                            Format c = Format.m16642c(this.f59046d, str, (String) null, -1, -1, i17, i2, (List<byte[]>) null, (DrmInitData) null, 0, this.f59045c);
                            this.f59052j = c;
                            this.f59047e.mo17741a(c);
                        }
                        this.f59053k = i3;
                        this.f59051i = (((long) i4) * TimeUtil.SECOND_TO_US) / ((long) this.f59052j.f45790y);
                        this.f59044b.mo32113x(0);
                        this.f59047e.mo17742b(this.f59044b, 8);
                        this.f59048f = 2;
                    }
                } else if (i7 == 2) {
                    int min2 = Math.min(i5 - i6, this.f59053k - this.f59049g);
                    this.f59047e.mo17742b(mVar2, min2);
                    int i18 = this.f59049g + min2;
                    this.f59049g = i18;
                    int i19 = this.f59053k;
                    if (i18 == i19) {
                        this.f59047e.mo17744d(this.f59054l, 1, i19, 0, (C16750m.C16751a) null);
                        this.f59054l += this.f59051i;
                        this.f59048f = 0;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo32610b() {
        this.f59048f = 0;
        this.f59049g = 0;
        this.f59050h = false;
    }

    /* renamed from: c */
    public void mo32611c() {
    }

    /* renamed from: d */
    public void mo32612d(C16743g gVar, C20923v.C20927d dVar) {
        dVar.mo32634a();
        dVar.mo32635b();
        this.f59046d = dVar.f59281e;
        dVar.mo32635b();
        this.f59047e = gVar.mo17752o(dVar.f59280d, 1);
    }

    /* renamed from: e */
    public void mo32613e(long j, boolean z) {
        this.f59054l = j;
    }
}
