package p978i9;

/* renamed from: i9.a */
public final class C108417a {

    /* renamed from: a */
    public final byte[] f324631a;

    /* renamed from: b */
    public int f324632b;

    /* renamed from: c */
    public int f324633c;

    /* renamed from: d */
    public int f324634d;

    /* renamed from: e */
    public int f324635e;

    /* renamed from: f */
    public int f324636f;

    /* renamed from: g */
    public int f324637g = Integer.MAX_VALUE;

    /* renamed from: h */
    public int f324638h;

    public C108417a(byte[] bArr, int i, int i2) {
        this.f324631a = bArr;
        this.f324632b = i;
        this.f324633c = i2 + i;
        this.f324635e = i;
    }

    /* renamed from: a */
    public int mo158939a() {
        int i = this.f324637g;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.f324635e;
    }

    /* renamed from: b */
    public void mo158940b(int i) {
        this.f324637g = i;
        int i2 = this.f324633c + this.f324634d;
        this.f324633c = i2;
        if (i2 > i) {
            int i3 = i2 - i;
            this.f324634d = i3;
            this.f324633c = i2 - i3;
            return;
        }
        this.f324634d = 0;
    }

    /* renamed from: c */
    public int mo158941c(int i) {
        if (i >= 0) {
            int i2 = i + this.f324635e;
            int i3 = this.f324637g;
            if (i2 <= i3) {
                this.f324637g = i2;
                int i4 = this.f324633c + this.f324634d;
                this.f324633c = i4;
                if (i4 > i2) {
                    int i5 = i4 - i2;
                    this.f324634d = i5;
                    this.f324633c = i4 - i5;
                } else {
                    this.f324634d = 0;
                }
                return i3;
            }
            throw C108420d.m146904a();
        }
        throw new C108420d("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: d */
    public byte[] mo158942d() {
        int h = mo158946h();
        int i = this.f324633c;
        int i2 = this.f324635e;
        if (h > i - i2 || h <= 0) {
            return mo158945g(h);
        }
        byte[] bArr = new byte[h];
        System.arraycopy(this.f324631a, i2, bArr, 0, h);
        this.f324635e += h;
        return bArr;
    }

    /* renamed from: e */
    public void mo158943e(C108421e eVar) {
        int h = mo158946h();
        if (this.f324638h < 64) {
            int c = mo158941c(h);
            this.f324638h++;
            eVar.mo145538b(this);
            if (this.f324636f == 0) {
                this.f324638h--;
                mo158940b(c);
                return;
            }
            throw new C108420d("Protocol message end-group tag did not match expected tag.");
        }
        throw new C108420d("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: f */
    public byte mo158944f() {
        int i = this.f324635e;
        if (i != this.f324633c) {
            byte[] bArr = this.f324631a;
            this.f324635e = i + 1;
            return bArr[i];
        }
        throw C108420d.m146904a();
    }

    /* renamed from: g */
    public byte[] mo158945g(int i) {
        if (i >= 0) {
            int i2 = this.f324635e;
            int i3 = i2 + i;
            int i4 = this.f324637g;
            if (i3 > i4) {
                mo158952n(i4 - i2);
                throw C108420d.m146904a();
            } else if (i <= this.f324633c - i2) {
                byte[] bArr = new byte[i];
                System.arraycopy(this.f324631a, i2, bArr, 0, i);
                this.f324635e += i;
                return bArr;
            } else {
                throw C108420d.m146904a();
            }
        } else {
            throw new C108420d("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    /* renamed from: h */
    public int mo158946h() {
        int i;
        byte f = mo158944f();
        if (f >= 0) {
            return f;
        }
        byte b = f & Byte.MAX_VALUE;
        byte f2 = mo158944f();
        if (f2 >= 0) {
            i = f2 << 7;
        } else {
            b |= (f2 & Byte.MAX_VALUE) << 7;
            byte f3 = mo158944f();
            if (f3 >= 0) {
                i = f3 << 14;
            } else {
                b |= (f3 & Byte.MAX_VALUE) << 14;
                byte f4 = mo158944f();
                if (f4 >= 0) {
                    i = f4 << 21;
                } else {
                    byte b2 = b | ((f4 & Byte.MAX_VALUE) << 21);
                    byte f5 = mo158944f();
                    byte b3 = b2 | (f5 << 28);
                    if (f5 >= 0) {
                        return b3;
                    }
                    for (int i2 = 0; i2 < 5; i2++) {
                        if (mo158944f() >= 0) {
                            return b3;
                        }
                    }
                    throw new C108420d("CodedInputStream encountered a malformed varint.");
                }
            }
        }
        return b | i;
    }

    /* renamed from: i */
    public long mo158947i() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte f = mo158944f();
            j |= ((long) (f & Byte.MAX_VALUE)) << i;
            if ((f & 128) == 0) {
                return j;
            }
        }
        throw new C108420d("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: j */
    public String mo158948j() {
        int h = mo158946h();
        int i = this.f324633c;
        int i2 = this.f324635e;
        if (h > i - i2 || h <= 0) {
            return new String(mo158945g(h), "UTF-8");
        }
        String str = new String(this.f324631a, i2, h, "UTF-8");
        this.f324635e += h;
        return str;
    }

    /* renamed from: k */
    public int mo158949k() {
        if (this.f324635e == this.f324633c) {
            this.f324636f = 0;
            return 0;
        }
        int h = mo158946h();
        this.f324636f = h;
        if (h != 0) {
            return h;
        }
        throw new C108420d("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: l */
    public void mo158950l(int i) {
        int i2 = this.f324635e;
        int i3 = this.f324632b;
        if (i > i2 - i3) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.f324635e - this.f324632b));
        } else if (i >= 0) {
            this.f324635e = i3 + i;
        } else {
            throw new IllegalArgumentException("Bad position " + i);
        }
    }

    /* renamed from: m */
    public boolean mo158951m(int i) {
        int k;
        int i2 = i & 7;
        if (i2 == 0) {
            mo158946h();
            return true;
        } else if (i2 == 1) {
            mo158944f();
            mo158944f();
            mo158944f();
            mo158944f();
            mo158944f();
            mo158944f();
            mo158944f();
            mo158944f();
            return true;
        } else if (i2 == 2) {
            mo158952n(mo158946h());
            return true;
        } else if (i2 == 3) {
            do {
                k = mo158949k();
                if (k == 0 || !mo158951m(k)) {
                }
                k = mo158949k();
                break;
            } while (!mo158951m(k));
            if (this.f324636f == (((i >>> 3) << 3) | 4)) {
                return true;
            }
            throw new C108420d("Protocol message end-group tag did not match expected tag.");
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                mo158944f();
                mo158944f();
                mo158944f();
                mo158944f();
                return true;
            }
            throw new C108420d("Protocol message tag had invalid wire type.");
        }
    }

    /* renamed from: n */
    public void mo158952n(int i) {
        if (i >= 0) {
            int i2 = this.f324635e;
            int i3 = i2 + i;
            int i4 = this.f324637g;
            if (i3 > i4) {
                mo158952n(i4 - i2);
                throw C108420d.m146904a();
            } else if (i <= this.f324633c - i2) {
                this.f324635e = i3;
            } else {
                throw C108420d.m146904a();
            }
        } else {
            throw new C108420d("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }
}
