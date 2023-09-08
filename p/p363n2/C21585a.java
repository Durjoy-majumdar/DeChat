package p363n2;

import java.util.Arrays;
import p363n2.C21593h;

/* renamed from: n2.a */
public class C21585a {

    /* renamed from: a */
    public int f61117a = 0;

    /* renamed from: b */
    public final C21586b f61118b;

    /* renamed from: c */
    public final C21587c f61119c;

    /* renamed from: d */
    public int f61120d = 8;

    /* renamed from: e */
    public int[] f61121e = new int[8];

    /* renamed from: f */
    public int[] f61122f = new int[8];

    /* renamed from: g */
    public float[] f61123g = new float[8];

    /* renamed from: h */
    public int f61124h = -1;

    /* renamed from: i */
    public int f61125i = -1;

    /* renamed from: j */
    public boolean f61126j = false;

    public C21585a(C21586b bVar, C21587c cVar) {
        this.f61118b = bVar;
        this.f61119c = cVar;
    }

    /* renamed from: a */
    public final void mo33820a(C21593h hVar, float f, boolean z) {
        if (f != 0.0f) {
            int i = this.f61124h;
            if (i == -1) {
                this.f61124h = 0;
                this.f61123g[0] = f;
                this.f61121e[0] = hVar.f61151a;
                this.f61122f[0] = -1;
                hVar.f61159i++;
                hVar.mo33852a(this.f61118b);
                this.f61117a++;
                if (!this.f61126j) {
                    int i2 = this.f61125i + 1;
                    this.f61125i = i2;
                    int[] iArr = this.f61121e;
                    if (i2 >= iArr.length) {
                        this.f61126j = true;
                        this.f61125i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f61117a) {
                int i5 = this.f61121e[i];
                int i6 = hVar.f61151a;
                if (i5 == i6) {
                    float[] fArr = this.f61123g;
                    float f2 = fArr[i] + f;
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f61124h) {
                            this.f61124h = this.f61122f[i];
                        } else {
                            int[] iArr2 = this.f61122f;
                            iArr2[i4] = iArr2[i];
                        }
                        if (z) {
                            hVar.mo33853b(this.f61118b);
                        }
                        if (this.f61126j) {
                            this.f61125i = i;
                        }
                        hVar.f61159i--;
                        this.f61117a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i4 = i;
                }
                i = this.f61122f[i];
                i3++;
            }
            int i7 = this.f61125i;
            int i8 = i7 + 1;
            if (this.f61126j) {
                int[] iArr3 = this.f61121e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f61121e;
            if (i7 >= iArr4.length && this.f61117a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f61121e;
                    if (i9 >= iArr5.length) {
                        break;
                    } else if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr6 = this.f61121e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i15 = this.f61120d * 2;
                this.f61120d = i15;
                this.f61126j = false;
                this.f61125i = i7 - 1;
                this.f61123g = Arrays.copyOf(this.f61123g, i15);
                this.f61121e = Arrays.copyOf(this.f61121e, this.f61120d);
                this.f61122f = Arrays.copyOf(this.f61122f, this.f61120d);
            }
            this.f61121e[i7] = hVar.f61151a;
            this.f61123g[i7] = f;
            if (i4 != -1) {
                int[] iArr7 = this.f61122f;
                iArr7[i7] = iArr7[i4];
                iArr7[i4] = i7;
            } else {
                this.f61122f[i7] = this.f61124h;
                this.f61124h = i7;
            }
            hVar.f61159i++;
            hVar.mo33852a(this.f61118b);
            this.f61117a++;
            if (!this.f61126j) {
                this.f61125i++;
            }
            int i16 = this.f61125i;
            int[] iArr8 = this.f61121e;
            if (i16 >= iArr8.length) {
                this.f61126j = true;
                this.f61125i = iArr8.length - 1;
            }
        }
    }

    /* renamed from: b */
    public final void mo33821b() {
        int i = this.f61124h;
        int i2 = 0;
        while (i != -1 && i2 < this.f61117a) {
            C21593h hVar = this.f61119c.f61133c[this.f61121e[i]];
            if (hVar != null) {
                hVar.mo33853b(this.f61118b);
            }
            i = this.f61122f[i];
            i2++;
        }
        this.f61124h = -1;
        this.f61125i = -1;
        this.f61126j = false;
        this.f61117a = 0;
    }

    /* renamed from: c */
    public final float mo33822c(C21593h hVar) {
        int i = this.f61124h;
        int i2 = 0;
        while (i != -1 && i2 < this.f61117a) {
            if (this.f61121e[i] == hVar.f61151a) {
                return this.f61123g[i];
            }
            i = this.f61122f[i];
            i2++;
        }
        return 0.0f;
    }

    /* renamed from: d */
    public C21593h mo33823d(boolean[] zArr, C21593h hVar) {
        C21593h.C21594a aVar;
        int i = this.f61124h;
        int i2 = 0;
        C21593h hVar2 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.f61117a) {
            float f2 = this.f61123g[i];
            if (f2 < 0.0f) {
                C21593h hVar3 = this.f61119c.f61133c[this.f61121e[i]];
                if ((zArr == null || !zArr[hVar3.f61151a]) && hVar3 != hVar && (((aVar = hVar3.f61156f) == C21593h.C21594a.SLACK || aVar == C21593h.C21594a.ERROR) && f2 < f)) {
                    f = f2;
                    hVar2 = hVar3;
                }
            }
            i = this.f61122f[i];
            i2++;
        }
        return hVar2;
    }

    /* renamed from: e */
    public final C21593h mo33824e(int i) {
        int i2 = this.f61124h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f61117a) {
            if (i3 == i) {
                return this.f61119c.f61133c[this.f61121e[i2]];
            }
            i2 = this.f61122f[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: f */
    public final void mo33825f(C21593h hVar, float f) {
        if (f == 0.0f) {
            mo33826g(hVar, true);
            return;
        }
        int i = this.f61124h;
        if (i == -1) {
            this.f61124h = 0;
            this.f61123g[0] = f;
            this.f61121e[0] = hVar.f61151a;
            this.f61122f[0] = -1;
            hVar.f61159i++;
            hVar.mo33852a(this.f61118b);
            this.f61117a++;
            if (!this.f61126j) {
                int i2 = this.f61125i + 1;
                this.f61125i = i2;
                int[] iArr = this.f61121e;
                if (i2 >= iArr.length) {
                    this.f61126j = true;
                    this.f61125i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f61117a) {
            int i5 = this.f61121e[i];
            int i6 = hVar.f61151a;
            if (i5 == i6) {
                this.f61123g[i] = f;
                return;
            }
            if (i5 < i6) {
                i4 = i;
            }
            i = this.f61122f[i];
            i3++;
        }
        int i7 = this.f61125i;
        int i8 = i7 + 1;
        if (this.f61126j) {
            int[] iArr2 = this.f61121e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f61121e;
        if (i7 >= iArr3.length && this.f61117a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f61121e;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.f61121e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i15 = this.f61120d * 2;
            this.f61120d = i15;
            this.f61126j = false;
            this.f61125i = i7 - 1;
            this.f61123g = Arrays.copyOf(this.f61123g, i15);
            this.f61121e = Arrays.copyOf(this.f61121e, this.f61120d);
            this.f61122f = Arrays.copyOf(this.f61122f, this.f61120d);
        }
        this.f61121e[i7] = hVar.f61151a;
        this.f61123g[i7] = f;
        if (i4 != -1) {
            int[] iArr6 = this.f61122f;
            iArr6[i7] = iArr6[i4];
            iArr6[i4] = i7;
        } else {
            this.f61122f[i7] = this.f61124h;
            this.f61124h = i7;
        }
        hVar.f61159i++;
        hVar.mo33852a(this.f61118b);
        int i16 = this.f61117a + 1;
        this.f61117a = i16;
        if (!this.f61126j) {
            this.f61125i++;
        }
        int[] iArr7 = this.f61121e;
        if (i16 >= iArr7.length) {
            this.f61126j = true;
        }
        if (this.f61125i >= iArr7.length) {
            this.f61126j = true;
            this.f61125i = iArr7.length - 1;
        }
    }

    /* renamed from: g */
    public final float mo33826g(C21593h hVar, boolean z) {
        int i = this.f61124h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f61117a) {
            if (this.f61121e[i] == hVar.f61151a) {
                if (i == this.f61124h) {
                    this.f61124h = this.f61122f[i];
                } else {
                    int[] iArr = this.f61122f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    hVar.mo33853b(this.f61118b);
                }
                hVar.f61159i--;
                this.f61117a--;
                this.f61121e[i] = -1;
                if (this.f61126j) {
                    this.f61125i = i;
                }
                return this.f61123g[i];
            }
            i2++;
            i3 = i;
            i = this.f61122f[i];
        }
        return 0.0f;
    }

    public String toString() {
        int i = this.f61124h;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f61117a) {
            str = ((str + " -> ") + this.f61123g[i] + " : ") + this.f61119c.f61133c[this.f61121e[i]];
            i = this.f61122f[i];
            i2++;
        }
        return str;
    }
}
