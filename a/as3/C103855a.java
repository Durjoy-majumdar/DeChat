package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.a */
public final class C103855a extends C108421e {

    /* renamed from: b */
    public String f306842b = "";

    /* renamed from: c */
    public int f306843c = 0;

    /* renamed from: d */
    public long f306844d = 0;

    /* renamed from: e */
    public int[] f306845e = C108422g.f324644a;

    /* renamed from: f */
    public int f306846f = 0;

    /* renamed from: g */
    public String[] f306847g = C108422g.f324645b;

    public C103855a() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int[] iArr;
        int i = 0;
        int g = !this.f306842b.equals("") ? C108418b.m146887g(1, this.f306842b) + 0 : 0;
        int i2 = this.f306843c;
        if (i2 != 0) {
            g += C108418b.m146882b(2, i2);
        }
        long j = this.f306844d;
        if (j != 0) {
            g += C108418b.m146883c(3, j);
        }
        int[] iArr2 = this.f306845e;
        if (iArr2 != null && iArr2.length > 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                iArr = this.f306845e;
                if (i3 >= iArr.length) {
                    break;
                }
                i4 += C108418b.m146885e(iArr[i3]);
                i3++;
            }
            g = g + i4 + (iArr.length * 1);
        }
        int i5 = this.f306846f;
        if (i5 != 0) {
            g += C108418b.m146882b(5, i5);
        }
        String[] strArr = this.f306847g;
        if (strArr == null || strArr.length <= 0) {
            return g;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            String[] strArr2 = this.f306847g;
            if (i >= strArr2.length) {
                return g + i6 + (i7 * 2);
            }
            String str = strArr2[i];
            if (str != null) {
                i7++;
                i6 += C108418b.m146888h(str);
            }
            i++;
        }
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 10) {
                this.f306842b = aVar.mo158948j();
            } else if (k == 16) {
                this.f306843c = aVar.mo158946h();
            } else if (k == 24) {
                this.f306844d = aVar.mo158947i();
            } else if (k == 32) {
                int a = C108422g.m146910a(aVar, 32);
                int[] iArr = this.f306845e;
                int length = iArr == null ? 0 : iArr.length;
                int i = a + length;
                int[] iArr2 = new int[i];
                if (length != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                }
                while (length < i - 1) {
                    iArr2[length] = aVar.mo158946h();
                    aVar.mo158949k();
                    length++;
                }
                iArr2[length] = aVar.mo158946h();
                this.f306845e = iArr2;
            } else if (k == 34) {
                int c = aVar.mo158941c(aVar.mo158946h());
                int i2 = aVar.f324635e - aVar.f324632b;
                int i3 = 0;
                while (aVar.mo158939a() > 0) {
                    aVar.mo158946h();
                    i3++;
                }
                aVar.mo158950l(i2);
                int[] iArr3 = this.f306845e;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i4 = i3 + length2;
                int[] iArr4 = new int[i4];
                if (length2 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length2);
                }
                while (length2 < i4) {
                    iArr4[length2] = aVar.mo158946h();
                    length2++;
                }
                this.f306845e = iArr4;
                aVar.mo158940b(c);
            } else if (k == 40) {
                this.f306846f = aVar.mo158946h();
            } else if (k == 802) {
                int a2 = C108422g.m146910a(aVar, 802);
                String[] strArr = this.f306847g;
                int length3 = strArr == null ? 0 : strArr.length;
                int i5 = a2 + length3;
                String[] strArr2 = new String[i5];
                if (length3 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length3);
                }
                while (length3 < i5 - 1) {
                    strArr2[length3] = aVar.mo158948j();
                    aVar.mo158949k();
                    length3++;
                }
                strArr2[length3] = aVar.mo158948j();
                this.f306847g = strArr2;
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        if (!this.f306842b.equals("")) {
            bVar.mo158961t(1, this.f306842b);
        }
        int i = this.f306843c;
        if (i != 0) {
            bVar.mo158954m(2, i);
        }
        long j = this.f306844d;
        if (j != 0) {
            bVar.mo158955n(3, j);
        }
        int[] iArr = this.f306845e;
        int i2 = 0;
        if (iArr != null && iArr.length > 0) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.f306845e;
                if (i3 >= iArr2.length) {
                    break;
                }
                bVar.mo158963v(4, iArr2[i3]);
                i3++;
            }
        }
        int i4 = this.f306846f;
        if (i4 != 0) {
            bVar.mo158954m(5, i4);
        }
        String[] strArr = this.f306847g;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f306847g;
                if (i2 < strArr2.length) {
                    String str = strArr2[i2];
                    if (str != null) {
                        bVar.mo158961t(100, str);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }
}
