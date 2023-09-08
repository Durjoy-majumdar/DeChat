package p345h7;

import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.xweb.util.WXWebReporter;
import java.util.Arrays;
import java.util.Collections;
import p294b7.C16740d;
import p294b7.C16743g;
import p294b7.C16750m;
import p333e8.C20530d;
import p333e8.C20540l;
import p333e8.C20541m;
import p345h7.C20923v;

/* renamed from: h7.d */
public final class C20897d implements C20901h {

    /* renamed from: r */
    public static final byte[] f59060r = {73, 68, 51};

    /* renamed from: a */
    public final boolean f59061a;

    /* renamed from: b */
    public final C20540l f59062b = new C20540l(new byte[7], 7);

    /* renamed from: c */
    public final C20541m f59063c = new C20541m(Arrays.copyOf(f59060r, 10));

    /* renamed from: d */
    public final String f59064d;

    /* renamed from: e */
    public String f59065e;

    /* renamed from: f */
    public C16750m f59066f;

    /* renamed from: g */
    public C16750m f59067g;

    /* renamed from: h */
    public int f59068h = 0;

    /* renamed from: i */
    public int f59069i = 0;

    /* renamed from: j */
    public int f59070j = 256;

    /* renamed from: k */
    public boolean f59071k;

    /* renamed from: l */
    public boolean f59072l;

    /* renamed from: m */
    public long f59073m;

    /* renamed from: n */
    public int f59074n;

    /* renamed from: o */
    public long f59075o;

    /* renamed from: p */
    public C16750m f59076p;

    /* renamed from: q */
    public long f59077q;

    public C20897d(boolean z, String str) {
        this.f59061a = z;
        this.f59064d = str;
    }

    /* renamed from: a */
    public void mo32609a(C20541m mVar) {
        C20541m mVar2 = mVar;
        while (true) {
            int i = mVar2.f57811c;
            int i2 = mVar2.f57810b;
            int i3 = i - i2;
            if (i3 > 0) {
                int i4 = this.f59068h;
                boolean z = true;
                if (i4 == 0) {
                    byte[] bArr = mVar2.f57809a;
                    while (true) {
                        if (i2 >= i) {
                            mVar2.mo32113x(i2);
                            break;
                        }
                        int i5 = i2 + 1;
                        byte b = bArr[i2] & ExifInterface.MARKER;
                        int i6 = this.f59070j;
                        if (i6 != 512 || b < 240 || b == 255) {
                            byte b2 = b | i6;
                            if (b2 == 329) {
                                this.f59070j = 768;
                            } else if (b2 == 511) {
                                this.f59070j = 512;
                            } else if (b2 != 836) {
                                if (b2 == 1075) {
                                    this.f59068h = 1;
                                    this.f59069i = 3;
                                    this.f59074n = 0;
                                    this.f59063c.mo32113x(0);
                                    mVar2.mo32113x(i5);
                                    break;
                                } else if (i6 != 256) {
                                    this.f59070j = 256;
                                    i5--;
                                }
                            } else {
                                this.f59070j = 1024;
                            }
                            i2 = i5;
                        } else {
                            if ((b & 1) != 0) {
                                z = false;
                            }
                            this.f59071k = z;
                            this.f59068h = 2;
                            this.f59069i = 0;
                            mVar2.mo32113x(i5);
                        }
                    }
                } else if (i4 != 1) {
                    if (i4 == 2) {
                        if (mo32614f(mVar2, this.f59062b.f57805a, this.f59071k ? 7 : 5)) {
                            this.f59062b.mo32088e(0);
                            if (!this.f59072l) {
                                int d = this.f59062b.mo32087d(2) + 1;
                                if (d != 2) {
                                    d = 2;
                                }
                                int d2 = this.f59062b.mo32087d(4);
                                this.f59062b.mo32089f(1);
                                byte[] bArr2 = {(byte) (((d << 3) & WXWebReporter.KEY_TRY_FIX_DEX_FAILED) | ((d2 >> 1) & 7)), (byte) (((d2 << 7) & 128) | ((this.f59062b.mo32087d(3) << 3) & 120))};
                                Pair<Integer, Integer> b3 = C20530d.m22243b(bArr2);
                                Format c = Format.m16642c(this.f59065e, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) b3.second).intValue(), ((Integer) b3.first).intValue(), Collections.singletonList(bArr2), (DrmInitData) null, 0, this.f59064d);
                                this.f59073m = 1024000000 / ((long) c.f45790y);
                                this.f59066f.mo17741a(c);
                                this.f59072l = true;
                            } else {
                                this.f59062b.mo32089f(10);
                            }
                            this.f59062b.mo32089f(4);
                            int d3 = (this.f59062b.mo32087d(13) - 2) - 5;
                            if (this.f59071k) {
                                d3 -= 2;
                            }
                            C16750m mVar3 = this.f59066f;
                            long j = this.f59073m;
                            this.f59068h = 3;
                            this.f59069i = 0;
                            this.f59076p = mVar3;
                            this.f59077q = j;
                            this.f59074n = d3;
                        }
                    } else if (i4 == 3) {
                        int min = Math.min(i3, this.f59074n - this.f59069i);
                        this.f59076p.mo17742b(mVar2, min);
                        int i7 = this.f59069i + min;
                        this.f59069i = i7;
                        int i8 = this.f59074n;
                        if (i7 == i8) {
                            this.f59076p.mo17744d(this.f59075o, 1, i8, 0, (C16750m.C16751a) null);
                            this.f59075o += this.f59077q;
                            this.f59068h = 0;
                            this.f59069i = 0;
                            this.f59070j = 256;
                        }
                    }
                } else if (mo32614f(mVar2, this.f59063c.f57809a, 10)) {
                    this.f59067g.mo17742b(this.f59063c, 10);
                    this.f59063c.mo32113x(6);
                    C16750m mVar4 = this.f59067g;
                    this.f59068h = 3;
                    this.f59069i = 10;
                    this.f59076p = mVar4;
                    this.f59077q = 0;
                    this.f59074n = this.f59063c.mo32102m() + 10;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo32610b() {
        this.f59068h = 0;
        this.f59069i = 0;
        this.f59070j = 256;
    }

    /* renamed from: c */
    public void mo32611c() {
    }

    /* renamed from: d */
    public void mo32612d(C16743g gVar, C20923v.C20927d dVar) {
        dVar.mo32634a();
        dVar.mo32635b();
        this.f59065e = dVar.f59281e;
        dVar.mo32635b();
        this.f59066f = gVar.mo17752o(dVar.f59280d, 1);
        if (this.f59061a) {
            dVar.mo32634a();
            dVar.mo32635b();
            C16750m o = gVar.mo17752o(dVar.f59280d, 4);
            this.f59067g = o;
            dVar.mo32635b();
            o.mo17741a(Format.m16645f(dVar.f59281e, MimeTypes.APPLICATION_ID3, (String) null, -1, (DrmInitData) null));
            return;
        }
        this.f59067g = new C16740d();
    }

    /* renamed from: e */
    public void mo32613e(long j, boolean z) {
        this.f59075o = j;
    }

    /* renamed from: f */
    public final boolean mo32614f(C20541m mVar, byte[] bArr, int i) {
        int min = Math.min(mVar.f57811c - mVar.f57810b, i - this.f59069i);
        mVar.mo32091b(bArr, this.f59069i, min);
        int i2 = this.f59069i + min;
        this.f59069i = i2;
        return i2 == i;
    }
}
