package p401y6;

import java.util.Arrays;
import p333e8.C20528a;

/* renamed from: y6.p */
public final class C23250p {

    /* renamed from: a */
    public final int f66782a;

    /* renamed from: b */
    public final int f66783b;

    /* renamed from: c */
    public final int f66784c;

    /* renamed from: d */
    public final int f66785d;

    /* renamed from: e */
    public final int f66786e;

    /* renamed from: f */
    public final short[] f66787f;

    /* renamed from: g */
    public int f66788g;

    /* renamed from: h */
    public short[] f66789h;

    /* renamed from: i */
    public int f66790i;

    /* renamed from: j */
    public short[] f66791j;

    /* renamed from: k */
    public int f66792k;

    /* renamed from: l */
    public short[] f66793l;

    /* renamed from: m */
    public int f66794m = 0;

    /* renamed from: n */
    public int f66795n = 0;

    /* renamed from: o */
    public float f66796o = 1.0f;

    /* renamed from: p */
    public float f66797p = 1.0f;

    /* renamed from: q */
    public int f66798q;

    /* renamed from: r */
    public int f66799r;

    /* renamed from: s */
    public int f66800s;

    /* renamed from: t */
    public int f66801t;

    /* renamed from: u */
    public int f66802u = 0;

    /* renamed from: v */
    public int f66803v;

    /* renamed from: w */
    public int f66804w;

    /* renamed from: x */
    public int f66805x;

    public C23250p(int i, int i2) {
        this.f66782a = i;
        this.f66783b = i2;
        this.f66784c = i / 400;
        int i3 = i / 65;
        this.f66785d = i3;
        int i4 = i3 * 2;
        this.f66786e = i4;
        this.f66787f = new short[i4];
        this.f66788g = i4;
        this.f66789h = new short[(i4 * i2)];
        this.f66790i = i4;
        this.f66791j = new short[(i4 * i2)];
        this.f66792k = i4;
        this.f66793l = new short[(i4 * i2)];
    }

    /* renamed from: d */
    public static void m27685d(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i15 = 0; i15 < i; i15++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i15)) + (sArr3[i8] * i15)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: a */
    public final void mo36714a(short[] sArr, int i, int i2) {
        int i3 = this.f66786e / i2;
        int i4 = this.f66783b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f66787f[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: b */
    public final void mo36715b(int i) {
        int i2 = this.f66799r + i;
        int i3 = this.f66790i;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f66790i = i4;
            this.f66791j = Arrays.copyOf(this.f66791j, i4 * this.f66783b);
        }
    }

    /* renamed from: c */
    public final int mo36716c(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f66783b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i15 = 0; i15 < i2; i15++) {
                i9 += Math.abs(sArr[i4 + i15] - sArr[(i4 + i2) + i15]);
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f66804w = i5 / i7;
        this.f66805x = i8 / i6;
        return i7;
    }

    /* renamed from: e */
    public final void mo36717e() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.f66799r;
        float f = this.f66796o / this.f66797p;
        double d = (double) f;
        int i9 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i15 = this.f66798q;
            if (i15 >= this.f66786e) {
                int i16 = 0;
                while (true) {
                    int i17 = this.f66801t;
                    if (i17 > 0) {
                        int min = Math.min(this.f66786e, i17);
                        short[] sArr = this.f66789h;
                        mo36715b(min);
                        int i18 = this.f66783b;
                        System.arraycopy(sArr, i16 * i18, this.f66791j, this.f66799r * i18, i18 * min);
                        this.f66799r += min;
                        this.f66801t -= min;
                        i16 += min;
                    } else {
                        short[] sArr2 = this.f66789h;
                        int i19 = this.f66782a;
                        int i25 = i19 > 4000 ? i19 / 4000 : 1;
                        if (this.f66783b == i9 && i25 == i9) {
                            i5 = mo36716c(sArr2, i16, this.f66784c, this.f66785d);
                        } else {
                            mo36714a(sArr2, i16, i25);
                            int c = mo36716c(this.f66787f, 0, this.f66784c / i25, this.f66785d / i25);
                            if (i25 != i9) {
                                int i26 = c * i25;
                                int i27 = i25 * 4;
                                int i28 = i26 - i27;
                                int i29 = i26 + i27;
                                int i35 = this.f66784c;
                                if (i28 < i35) {
                                    i28 = i35;
                                }
                                int i36 = this.f66785d;
                                if (i29 > i36) {
                                    i29 = i36;
                                }
                                if (this.f66783b == i9) {
                                    i5 = mo36716c(sArr2, i16, i28, i29);
                                } else {
                                    mo36714a(sArr2, i16, i9);
                                    i5 = mo36716c(this.f66787f, 0, i28, i29);
                                }
                            } else {
                                i5 = c;
                            }
                        }
                        int i37 = this.f66804w;
                        int i38 = i37 != 0 && this.f66802u != 0 && this.f66805x <= i37 * 3 && i37 * 2 > this.f66803v * 3 ? this.f66802u : i5;
                        this.f66803v = i37;
                        this.f66802u = i5;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f66789h;
                            if (f >= 2.0f) {
                                i7 = (int) (((float) i38) / (f - 1.0f));
                            } else {
                                this.f66801t = (int) ((((float) i38) * (2.0f - f)) / (f - 1.0f));
                                i7 = i38;
                            }
                            mo36715b(i7);
                            int i39 = i7;
                            m27685d(i7, this.f66783b, this.f66791j, this.f66799r, sArr3, i16, sArr3, i16 + i38);
                            this.f66799r += i39;
                            i16 += i38 + i39;
                        } else {
                            int i44 = i38;
                            short[] sArr4 = this.f66789h;
                            if (f < 0.5f) {
                                i6 = (int) ((((float) i44) * f) / (1.0f - f));
                            } else {
                                this.f66801t = (int) ((((float) i44) * ((2.0f * f) - 1.0f)) / (1.0f - f));
                                i6 = i44;
                            }
                            int i45 = i44 + i6;
                            mo36715b(i45);
                            int i46 = this.f66783b;
                            System.arraycopy(sArr4, i16 * i46, this.f66791j, this.f66799r * i46, i46 * i44);
                            m27685d(i6, this.f66783b, this.f66791j, this.f66799r + i44, sArr4, i44 + i16, sArr4, i16);
                            this.f66799r += i45;
                            i16 += i6;
                        }
                    }
                    if (this.f66786e + i16 > i15) {
                        break;
                    }
                    i9 = 1;
                }
                int i47 = this.f66798q - i16;
                short[] sArr5 = this.f66789h;
                int i48 = this.f66783b;
                System.arraycopy(sArr5, i16 * i48, sArr5, 0, i48 * i47);
                this.f66798q = i47;
            }
        } else {
            short[] sArr6 = this.f66789h;
            int i49 = this.f66798q;
            mo36715b(i49);
            int i54 = this.f66783b;
            System.arraycopy(sArr6, 0 * i54, this.f66791j, this.f66799r * i54, i54 * i49);
            this.f66799r += i49;
            this.f66798q = 0;
        }
        float f2 = this.f66797p;
        if (f2 != 1.0f && this.f66799r != i8) {
            int i55 = this.f66782a;
            int i56 = (int) (((float) i55) / f2);
            while (true) {
                if (i56 <= 16384 && i55 <= 16384) {
                    break;
                }
                i56 /= 2;
                i55 /= 2;
            }
            int i57 = this.f66799r - i8;
            int i58 = this.f66800s + i57;
            int i59 = this.f66792k;
            if (i58 > i59) {
                int i64 = i59 + (i59 / 2) + i57;
                this.f66792k = i64;
                this.f66793l = Arrays.copyOf(this.f66793l, i64 * this.f66783b);
            }
            short[] sArr7 = this.f66791j;
            int i65 = this.f66783b;
            System.arraycopy(sArr7, i8 * i65, this.f66793l, this.f66800s * i65, i65 * i57);
            this.f66799r = i8;
            this.f66800s += i57;
            int i66 = 0;
            while (true) {
                i = this.f66800s;
                i2 = i - 1;
                if (i66 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.f66794m + 1;
                    int i67 = i3 * i56;
                    i4 = this.f66795n;
                    if (i67 <= i4 * i55) {
                        break;
                    }
                    mo36715b(1);
                    int i68 = 0;
                    while (true) {
                        int i69 = this.f66783b;
                        if (i68 >= i69) {
                            break;
                        }
                        short[] sArr8 = this.f66793l;
                        int i74 = (i66 * i69) + i68;
                        short s = sArr8[i74];
                        short s2 = sArr8[i74 + i69];
                        int i75 = this.f66794m;
                        int i76 = i75 * i56;
                        int i77 = (i75 + 1) * i56;
                        int i78 = i77 - (this.f66795n * i55);
                        int i79 = i77 - i76;
                        this.f66791j[(this.f66799r * i69) + i68] = (short) (((s * i78) + ((i79 - i78) * s2)) / i79);
                        i68++;
                    }
                    this.f66795n++;
                    this.f66799r++;
                }
                this.f66794m = i3;
                if (i3 == i55) {
                    this.f66794m = 0;
                    C20528a.m22240d(i4 == i56);
                    this.f66795n = 0;
                }
                i66++;
            }
            if (i2 != 0) {
                short[] sArr9 = this.f66793l;
                int i84 = this.f66783b;
                System.arraycopy(sArr9, i2 * i84, sArr9, 0, (i - i2) * i84);
                this.f66800s -= i2;
            }
        }
    }
}
