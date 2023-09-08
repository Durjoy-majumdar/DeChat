package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108419c;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.d */
public final class C103864d extends C108421e {

    /* renamed from: b */
    public C103914z0 f306946b = null;

    /* renamed from: c */
    public int[] f306947c = C108422g.f324644a;

    /* renamed from: d */
    public C103875g1 f306948d = null;

    /* renamed from: e */
    public int f306949e = 0;

    /* renamed from: f */
    public int f306950f = 0;

    /* renamed from: g */
    public C103869e1 f306951g = null;

    /* renamed from: h */
    public String f306952h = "";

    /* renamed from: i */
    public String f306953i = "";

    /* renamed from: j */
    public int f306954j = 0;

    /* renamed from: k */
    public String[] f306955k = C108422g.f324645b;

    /* renamed from: l */
    public C103891o[] f306956l;

    /* renamed from: m */
    public int f306957m;

    public C103864d() {
        if (C103891o.f307113e == null) {
            synchronized (C108419c.f324642a) {
                if (C103891o.f307113e == null) {
                    C103891o.f307113e = new C103891o[0];
                }
            }
        }
        this.f306956l = C103891o.f307113e;
        this.f306957m = 0;
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int[] iArr;
        C103914z0 z0Var = this.f306946b;
        int i = 0;
        int d = z0Var != null ? C108418b.m146884d(1, z0Var) + 0 : 0;
        int[] iArr2 = this.f306947c;
        if (iArr2 != null && iArr2.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                iArr = this.f306947c;
                if (i2 >= iArr.length) {
                    break;
                }
                i3 += C108418b.m146885e(iArr[i2]);
                i2++;
            }
            d = d + i3 + (iArr.length * 1);
        }
        C103875g1 g1Var = this.f306948d;
        if (g1Var != null) {
            d += C108418b.m146884d(3, g1Var);
        }
        int i4 = this.f306949e;
        if (i4 != 0) {
            d += C108418b.m146890j(4, i4);
        }
        int i5 = this.f306950f;
        if (i5 != 0) {
            d += C108418b.m146890j(5, i5);
        }
        C103869e1 e1Var = this.f306951g;
        if (e1Var != null) {
            d += C108418b.m146884d(6, e1Var);
        }
        if (!this.f306952h.equals("")) {
            d += C108418b.m146887g(7, this.f306952h);
        }
        if (!this.f306953i.equals("")) {
            d += C108418b.m146887g(8, this.f306953i);
        }
        int i6 = this.f306954j;
        if (i6 != 0) {
            d += C108418b.m146890j(9, i6);
        }
        String[] strArr = this.f306955k;
        if (strArr != null && strArr.length > 0) {
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                String[] strArr2 = this.f306955k;
                if (i7 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i7];
                if (str != null) {
                    i9++;
                    i8 += C108418b.m146888h(str);
                }
                i7++;
            }
            d = d + i8 + (i9 * 2);
        }
        C103891o[] oVarArr = this.f306956l;
        if (oVarArr != null && oVarArr.length > 0) {
            while (true) {
                C103891o[] oVarArr2 = this.f306956l;
                if (i >= oVarArr2.length) {
                    break;
                }
                C103891o oVar = oVarArr2[i];
                if (oVar != null) {
                    d += C108418b.m146884d(202, oVar);
                }
                i++;
            }
        }
        int i15 = this.f306957m;
        return i15 != 0 ? d + C108418b.m146890j(240, i15) : d;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            switch (k) {
                case 0:
                    break;
                case 10:
                    if (this.f306946b == null) {
                        this.f306946b = new C103914z0();
                    }
                    aVar.mo158943e(this.f306946b);
                    continue;
                case 16:
                    int a = C108422g.m146910a(aVar, 16);
                    int[] iArr = this.f306947c;
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
                    this.f306947c = iArr2;
                    continue;
                case 18:
                    int c = aVar.mo158941c(aVar.mo158946h());
                    int i2 = aVar.f324635e - aVar.f324632b;
                    int i3 = 0;
                    while (aVar.mo158939a() > 0) {
                        aVar.mo158946h();
                        i3++;
                    }
                    aVar.mo158950l(i2);
                    int[] iArr3 = this.f306947c;
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
                    this.f306947c = iArr4;
                    aVar.mo158940b(c);
                    continue;
                case 26:
                    if (this.f306948d == null) {
                        this.f306948d = new C103875g1();
                    }
                    aVar.mo158943e(this.f306948d);
                    continue;
                case 32:
                    this.f306949e = aVar.mo158946h();
                    continue;
                case 40:
                    this.f306950f = aVar.mo158946h();
                    continue;
                case 50:
                    if (this.f306951g == null) {
                        this.f306951g = new C103869e1();
                    }
                    aVar.mo158943e(this.f306951g);
                    continue;
                case 58:
                    this.f306952h = aVar.mo158948j();
                    continue;
                case 66:
                    this.f306953i = aVar.mo158948j();
                    continue;
                case 72:
                    this.f306954j = aVar.mo158946h();
                    continue;
                case 802:
                    int a2 = C108422g.m146910a(aVar, 802);
                    String[] strArr = this.f306955k;
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
                    this.f306955k = strArr2;
                    continue;
                case 1618:
                    int a3 = C108422g.m146910a(aVar, 1618);
                    C103891o[] oVarArr = this.f306956l;
                    int length4 = oVarArr == null ? 0 : oVarArr.length;
                    int i6 = a3 + length4;
                    C103891o[] oVarArr2 = new C103891o[i6];
                    if (length4 != 0) {
                        System.arraycopy(oVarArr, 0, oVarArr2, 0, length4);
                    }
                    while (length4 < i6 - 1) {
                        C103891o oVar = new C103891o();
                        oVarArr2[length4] = oVar;
                        aVar.mo158943e(oVar);
                        aVar.mo158949k();
                        length4++;
                    }
                    C103891o oVar2 = new C103891o();
                    oVarArr2[length4] = oVar2;
                    aVar.mo158943e(oVar2);
                    this.f306956l = oVarArr2;
                    continue;
                case 1920:
                    this.f306957m = aVar.mo158946h();
                    continue;
                default:
                    if (!aVar.mo158951m(k)) {
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        C103914z0 z0Var = this.f306946b;
        if (z0Var != null) {
            bVar.mo158956o(1, z0Var);
        }
        int[] iArr = this.f306947c;
        int i = 0;
        if (iArr != null && iArr.length > 0) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.f306947c;
                if (i2 >= iArr2.length) {
                    break;
                }
                bVar.mo158963v(2, iArr2[i2]);
                i2++;
            }
        }
        C103875g1 g1Var = this.f306948d;
        if (g1Var != null) {
            bVar.mo158956o(3, g1Var);
        }
        int i3 = this.f306949e;
        if (i3 != 0) {
            bVar.mo158963v(4, i3);
        }
        int i4 = this.f306950f;
        if (i4 != 0) {
            bVar.mo158963v(5, i4);
        }
        C103869e1 e1Var = this.f306951g;
        if (e1Var != null) {
            bVar.mo158956o(6, e1Var);
        }
        if (!this.f306952h.equals("")) {
            bVar.mo158961t(7, this.f306952h);
        }
        if (!this.f306953i.equals("")) {
            bVar.mo158961t(8, this.f306953i);
        }
        int i5 = this.f306954j;
        if (i5 != 0) {
            bVar.mo158963v(9, i5);
        }
        String[] strArr = this.f306955k;
        if (strArr != null && strArr.length > 0) {
            int i6 = 0;
            while (true) {
                String[] strArr2 = this.f306955k;
                if (i6 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i6];
                if (str != null) {
                    bVar.mo158961t(100, str);
                }
                i6++;
            }
        }
        C103891o[] oVarArr = this.f306956l;
        if (oVarArr != null && oVarArr.length > 0) {
            while (true) {
                C103891o[] oVarArr2 = this.f306956l;
                if (i >= oVarArr2.length) {
                    break;
                }
                C103891o oVar = oVarArr2[i];
                if (oVar != null) {
                    bVar.mo158956o(202, oVar);
                }
                i++;
            }
        }
        int i7 = this.f306957m;
        if (i7 != 0) {
            bVar.mo158963v(240, i7);
        }
    }
}
