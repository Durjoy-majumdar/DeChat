package xz3;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: xz3.d */
public final class C26586d {

    /* renamed from: a */
    public final byte[] f73986a = new byte[4096];

    /* renamed from: b */
    public int f73987b = 0;

    /* renamed from: c */
    public int f73988c;

    /* renamed from: d */
    public int f73989d = 0;

    /* renamed from: e */
    public final InputStream f73990e;

    /* renamed from: f */
    public int f73991f;

    /* renamed from: g */
    public int f73992g = 0;

    /* renamed from: h */
    public int f73993h = Integer.MAX_VALUE;

    /* renamed from: i */
    public int f73994i;

    public C26586d(InputStream inputStream) {
        this.f73990e = inputStream;
    }

    /* renamed from: a */
    public void mo53517a(int i) {
        if (this.f73991f != i) {
            throw new C26601j("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: b */
    public int mo53518b() {
        int i = this.f73993h;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f73992g + this.f73989d);
    }

    /* renamed from: c */
    public void mo53519c(int i) {
        this.f73993h = i;
        mo53531o();
    }

    /* renamed from: d */
    public int mo53520d(int i) {
        if (i >= 0) {
            int i2 = i + this.f73992g + this.f73989d;
            int i3 = this.f73993h;
            if (i2 <= i3) {
                this.f73993h = i2;
                mo53531o();
                return i3;
            }
            throw C26601j.m34468b();
        }
        throw new C26601j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    public C23156c mo53521e() {
        int k = mo53527k();
        int i = this.f73987b;
        int i2 = this.f73989d;
        if (k > i - i2 || k <= 0) {
            return k == 0 ? C23156c.f66530d : new C23163o(mo53524h(k));
        }
        byte[] bArr = this.f73986a;
        C23156c cVar = C23156c.f66530d;
        byte[] bArr2 = new byte[k];
        System.arraycopy(bArr, i2, bArr2, 0, k);
        C23163o oVar = new C23163o(bArr2);
        this.f73989d += k;
        return oVar;
    }

    /* renamed from: f */
    public int mo53522f() {
        return mo53527k();
    }

    /* renamed from: g */
    public <T extends C26607p> T mo53523g(C26610r<T> rVar, C26589f fVar) {
        int k = mo53527k();
        if (this.f73994i < 64) {
            int d = mo53520d(k);
            this.f73994i++;
            T t = (C26607p) rVar.mo52860a(this, fVar);
            mo53517a(0);
            this.f73994i--;
            mo53519c(d);
            return t;
        }
        throw new C26601j("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: h */
    public final byte[] mo53524h(int i) {
        if (i > 0) {
            int i2 = this.f73992g;
            int i3 = this.f73989d;
            int i4 = i2 + i3 + i;
            int i5 = this.f73993h;
            if (i4 > i5) {
                mo53534r((i5 - i2) - i3);
                throw C26601j.m34468b();
            } else if (i < 4096) {
                byte[] bArr = new byte[i];
                int i6 = this.f73987b - i3;
                System.arraycopy(this.f73986a, i3, bArr, 0, i6);
                int i7 = this.f73987b;
                this.f73989d = i7;
                int i8 = i - i6;
                if (i7 - i7 < i8) {
                    mo53532p(i8);
                }
                System.arraycopy(this.f73986a, 0, bArr, i6, i8);
                this.f73989d = i8;
                return bArr;
            } else {
                int i9 = this.f73987b;
                this.f73992g = i2 + i9;
                this.f73989d = 0;
                this.f73987b = 0;
                int i15 = i9 - i3;
                int i16 = i - i15;
                ArrayList arrayList = new ArrayList();
                while (i16 > 0) {
                    int min = Math.min(i16, 4096);
                    byte[] bArr2 = new byte[min];
                    int i17 = 0;
                    while (i17 < min) {
                        InputStream inputStream = this.f73990e;
                        int read = inputStream == null ? -1 : inputStream.read(bArr2, i17, min - i17);
                        if (read != -1) {
                            this.f73992g += read;
                            i17 += read;
                        } else {
                            throw C26601j.m34468b();
                        }
                    }
                    i16 -= min;
                    arrayList.add(bArr2);
                }
                byte[] bArr3 = new byte[i];
                System.arraycopy(this.f73986a, i3, bArr3, 0, i15);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    byte[] bArr4 = (byte[]) it.next();
                    System.arraycopy(bArr4, 0, bArr3, i15, bArr4.length);
                    i15 += bArr4.length;
                }
                return bArr3;
            }
        } else if (i == 0) {
            return C23159i.f66537a;
        } else {
            throw new C26601j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    /* renamed from: i */
    public int mo53525i() {
        int i = this.f73989d;
        if (this.f73987b - i < 4) {
            mo53532p(4);
            i = this.f73989d;
        }
        byte[] bArr = this.f73986a;
        this.f73989d = i + 4;
        return ((bArr[i + 3] & ExifInterface.MARKER) << 24) | (bArr[i] & ExifInterface.MARKER) | ((bArr[i + 1] & ExifInterface.MARKER) << 8) | ((bArr[i + 2] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
    }

    /* renamed from: j */
    public long mo53526j() {
        int i = this.f73989d;
        if (this.f73987b - i < 8) {
            mo53532p(8);
            i = this.f73989d;
        }
        byte[] bArr = this.f73986a;
        this.f73989d = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        if (r2[r3] < 0) goto L_0x007c;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo53527k() {
        /*
            r9 = this;
            int r0 = r9.f73989d
            int r1 = r9.f73987b
            if (r1 != r0) goto L_0x0008
            goto L_0x007c
        L_0x0008:
            byte[] r2 = r9.f73986a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0013
            r9.f73989d = r3
            return r0
        L_0x0013:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x0019
            goto L_0x007c
        L_0x0019:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x002d
            r5 = -128(0xffffffffffffff80, double:NaN)
        L_0x0029:
            long r2 = r3 ^ r5
            int r0 = (int) r2
            goto L_0x0082
        L_0x002d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x003f
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L_0x003d:
            r1 = r3
            goto L_0x0082
        L_0x003f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x004f
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L_0x0029
        L_0x004f:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0082
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0082
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 >= 0) goto L_0x0082
        L_0x007c:
            long r0 = r9.mo53529m()
            int r1 = (int) r0
            return r1
        L_0x0082:
            r9.f73989d = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xz3.C26586d.mo53527k():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        if (((long) r2[r0]) < 0) goto L_0x00b8;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo53528l() {
        /*
            r9 = this;
            int r0 = r9.f73989d
            int r1 = r9.f73987b
            if (r1 != r0) goto L_0x0008
            goto L_0x00b8
        L_0x0008:
            byte[] r2 = r9.f73986a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0014
            r9.f73989d = r3
            long r0 = (long) r0
            return r0
        L_0x0014:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x001b
            goto L_0x00b8
        L_0x001b:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x002f
            r5 = -128(0xffffffffffffff80, double:NaN)
        L_0x002b:
            long r2 = r3 ^ r5
            goto L_0x00bf
        L_0x002f:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            long r7 = (long) r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0042
            r1 = 16256(0x3f80, double:8.0315E-320)
        L_0x003d:
            long r2 = r3 ^ r1
            r1 = r0
            goto L_0x00bf
        L_0x0042:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            int r0 = r0 << 21
            long r7 = (long) r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0052
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L_0x002b
        L_0x0052:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 28
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0063
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L_0x003d
        L_0x0063:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L_0x002b
        L_0x0076:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0089
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x003d
        L_0x0089:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x009c
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x002b
        L_0x009c:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00bd
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00be
        L_0x00b8:
            long r0 = r9.mo53529m()
            return r0
        L_0x00bd:
            r1 = r0
        L_0x00be:
            r2 = r3
        L_0x00bf:
            r9.f73989d = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xz3.C26586d.mo53528l():long");
    }

    /* renamed from: m */
    public long mo53529m() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f73989d == this.f73987b) {
                mo53532p(1);
            }
            byte[] bArr = this.f73986a;
            int i2 = this.f73989d;
            this.f73989d = i2 + 1;
            byte b = bArr[i2];
            j |= ((long) (b & Byte.MAX_VALUE)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw new C26601j("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: n */
    public int mo53530n() {
        boolean z = true;
        if (this.f73989d != this.f73987b || mo53535s(1)) {
            z = false;
        }
        if (z) {
            this.f73991f = 0;
            return 0;
        }
        int k = mo53527k();
        this.f73991f = k;
        if ((k >>> 3) != 0) {
            return k;
        }
        throw new C26601j("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: o */
    public final void mo53531o() {
        int i = this.f73987b + this.f73988c;
        this.f73987b = i;
        int i2 = this.f73992g + i;
        int i3 = this.f73993h;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f73988c = i4;
            this.f73987b = i - i4;
            return;
        }
        this.f73988c = 0;
    }

    /* renamed from: p */
    public final void mo53532p(int i) {
        if (!mo53535s(i)) {
            throw C26601j.m34468b();
        }
    }

    /* renamed from: q */
    public boolean mo53533q(int i, C26587e eVar) {
        int n;
        int i2 = i & 7;
        if (i2 == 0) {
            long l = mo53528l();
            eVar.mo53548v(i);
            eVar.mo53549w(l);
            return true;
        } else if (i2 == 1) {
            long j = mo53526j();
            eVar.mo53548v(i);
            eVar.mo53547u(j);
            return true;
        } else if (i2 == 2) {
            C23156c e = mo53521e();
            eVar.mo53548v(i);
            eVar.mo53548v(e.size());
            eVar.mo53544r(e);
            return true;
        } else if (i2 == 3) {
            eVar.mo53548v(i);
            do {
                n = mo53530n();
                if (n == 0 || !mo53533q(n, eVar)) {
                    int i3 = ((i >>> 3) << 3) | 4;
                    mo53517a(i3);
                    eVar.mo53548v(i3);
                }
                n = mo53530n();
                break;
            } while (!mo53533q(n, eVar));
            int i35 = ((i >>> 3) << 3) | 4;
            mo53517a(i35);
            eVar.mo53548v(i35);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                int i4 = mo53525i();
                eVar.mo53548v(i);
                eVar.mo53546t(i4);
                return true;
            }
            throw new C26601j("Protocol message tag had invalid wire type.");
        }
    }

    /* renamed from: r */
    public void mo53534r(int i) {
        int i2 = this.f73987b;
        int i3 = this.f73989d;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f73989d = i3 + i;
        } else if (i >= 0) {
            int i5 = this.f73992g;
            int i6 = i5 + i3 + i;
            int i7 = this.f73993h;
            if (i6 <= i7) {
                this.f73989d = i2;
                mo53532p(1);
                while (true) {
                    int i8 = i - i4;
                    int i9 = this.f73987b;
                    if (i8 > i9) {
                        i4 += i9;
                        this.f73989d = i9;
                        mo53532p(1);
                    } else {
                        this.f73989d = i8;
                        return;
                    }
                }
            } else {
                mo53534r((i7 - i5) - i3);
                throw C26601j.m34468b();
            }
        } else {
            throw new C26601j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    /* renamed from: s */
    public final boolean mo53535s(int i) {
        int i2 = this.f73989d;
        int i3 = i2 + i;
        int i4 = this.f73987b;
        if (i3 > i4) {
            if (this.f73992g + i2 + i <= this.f73993h && this.f73990e != null) {
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.f73986a;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.f73992g += i2;
                    this.f73987b -= i2;
                    this.f73989d = 0;
                }
                InputStream inputStream = this.f73990e;
                byte[] bArr2 = this.f73986a;
                int i5 = this.f73987b;
                int read = inputStream.read(bArr2, i5, bArr2.length - i5);
                if (read == 0 || read < -1 || read > this.f73986a.length) {
                    StringBuilder sb = new StringBuilder(102);
                    sb.append("InputStream#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                } else if (read > 0) {
                    this.f73987b += read;
                    if ((this.f73992g + i) - 67108864 <= 0) {
                        mo53531o();
                        if (this.f73987b >= i) {
                            return true;
                        }
                        return mo53535s(i);
                    }
                    throw new C26601j("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
            }
            return false;
        }
        StringBuilder sb4 = new StringBuilder(77);
        sb4.append("refillBuffer() called when ");
        sb4.append(i);
        sb4.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb4.toString());
    }
}
