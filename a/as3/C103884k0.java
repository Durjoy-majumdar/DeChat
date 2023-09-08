package as3;

import com.tencent.wechat.aff.ting.TingClientProto;
import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.k0 */
public final class C103884k0 extends C108421e {

    /* renamed from: b */
    public String f307056b = "";

    /* renamed from: c */
    public int f307057c = 0;

    /* renamed from: d */
    public long f307058d = 0;

    /* renamed from: e */
    public C103895q[] f307059e = C103895q.m138543f();

    /* renamed from: f */
    public C103912y0 f307060f = null;

    /* renamed from: g */
    public int f307061g = 0;

    /* renamed from: h */
    public int[] f307062h = C108422g.f324644a;

    /* renamed from: i */
    public C103860b1[] f307063i = C103860b1.m138436f();

    /* renamed from: j */
    public C103863c1[] f307064j = C103863c1.m138446f();

    /* renamed from: k */
    public C103914z0 f307065k = null;

    /* renamed from: l */
    public C103860b1[] f307066l = C103860b1.m138436f();

    public C103884k0() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int[] iArr;
        int i = 0;
        int g = !this.f307056b.equals("") ? C108418b.m146887g(1, this.f307056b) + 0 : 0;
        int i2 = this.f307057c;
        if (i2 != 0) {
            g += C108418b.m146882b(2, i2);
        }
        long j = this.f307058d;
        if (j != 0) {
            g += C108418b.m146883c(3, j);
        }
        C103895q[] qVarArr = this.f307059e;
        if (qVarArr != null && qVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                C103895q[] qVarArr2 = this.f307059e;
                if (i3 >= qVarArr2.length) {
                    break;
                }
                C103895q qVar = qVarArr2[i3];
                if (qVar != null) {
                    g += C108418b.m146884d(4, qVar);
                }
                i3++;
            }
        }
        C103912y0 y0Var = this.f307060f;
        if (y0Var != null) {
            g += C108418b.m146884d(5, y0Var);
        }
        int i4 = this.f307061g;
        if (i4 != 0) {
            g += C108418b.m146882b(6, i4);
        }
        int[] iArr2 = this.f307062h;
        if (iArr2 != null && iArr2.length > 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                iArr = this.f307062h;
                if (i5 >= iArr.length) {
                    break;
                }
                int i7 = iArr[i5];
                i6 += i7 >= 0 ? C108418b.m146885e(i7) : 10;
                i5++;
            }
            g = g + i6 + (iArr.length * 1);
        }
        C103860b1[] b1VarArr = this.f307063i;
        if (b1VarArr != null && b1VarArr.length > 0) {
            int i8 = 0;
            while (true) {
                C103860b1[] b1VarArr2 = this.f307063i;
                if (i8 >= b1VarArr2.length) {
                    break;
                }
                C103860b1 b1Var = b1VarArr2[i8];
                if (b1Var != null) {
                    g += C108418b.m146884d(200, b1Var);
                }
                i8++;
            }
        }
        C103863c1[] c1VarArr = this.f307064j;
        if (c1VarArr != null && c1VarArr.length > 0) {
            int i9 = 0;
            while (true) {
                C103863c1[] c1VarArr2 = this.f307064j;
                if (i9 >= c1VarArr2.length) {
                    break;
                }
                C103863c1 c1Var = c1VarArr2[i9];
                if (c1Var != null) {
                    g += C108418b.m146884d(201, c1Var);
                }
                i9++;
            }
        }
        C103914z0 z0Var = this.f307065k;
        if (z0Var != null) {
            g += C108418b.m146884d(202, z0Var);
        }
        C103860b1[] b1VarArr3 = this.f307066l;
        if (b1VarArr3 != null && b1VarArr3.length > 0) {
            while (true) {
                C103860b1[] b1VarArr4 = this.f307066l;
                if (i >= b1VarArr4.length) {
                    break;
                }
                C103860b1 b1Var2 = b1VarArr4[i];
                if (b1Var2 != null) {
                    g += C108418b.m146884d(203, b1Var2);
                }
                i++;
            }
        }
        return g;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            switch (k) {
                case 0:
                    break;
                case 10:
                    this.f307056b = aVar.mo158948j();
                    continue;
                case 16:
                    this.f307057c = aVar.mo158946h();
                    continue;
                case 24:
                    this.f307058d = aVar.mo158947i();
                    continue;
                case 34:
                    int a = C108422g.m146910a(aVar, 34);
                    C103895q[] qVarArr = this.f307059e;
                    int length = qVarArr == null ? 0 : qVarArr.length;
                    int i = a + length;
                    C103895q[] qVarArr2 = new C103895q[i];
                    if (length != 0) {
                        System.arraycopy(qVarArr, 0, qVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        C103895q qVar = new C103895q();
                        qVarArr2[length] = qVar;
                        aVar.mo158943e(qVar);
                        aVar.mo158949k();
                        length++;
                    }
                    C103895q qVar2 = new C103895q();
                    qVarArr2[length] = qVar2;
                    aVar.mo158943e(qVar2);
                    this.f307059e = qVarArr2;
                    continue;
                case 42:
                    if (this.f307060f == null) {
                        this.f307060f = new C103912y0();
                    }
                    aVar.mo158943e(this.f307060f);
                    continue;
                case 48:
                    this.f307061g = aVar.mo158946h();
                    continue;
                case 56:
                    int a2 = C108422g.m146910a(aVar, 56);
                    int[] iArr = this.f307062h;
                    int length2 = iArr == null ? 0 : iArr.length;
                    int i2 = a2 + length2;
                    int[] iArr2 = new int[i2];
                    if (length2 != 0) {
                        System.arraycopy(iArr, 0, iArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        iArr2[length2] = aVar.mo158946h();
                        aVar.mo158949k();
                        length2++;
                    }
                    iArr2[length2] = aVar.mo158946h();
                    this.f307062h = iArr2;
                    continue;
                case 58:
                    int c = aVar.mo158941c(aVar.mo158946h());
                    int i3 = aVar.f324635e - aVar.f324632b;
                    int i4 = 0;
                    while (aVar.mo158939a() > 0) {
                        aVar.mo158946h();
                        i4++;
                    }
                    aVar.mo158950l(i3);
                    int[] iArr3 = this.f307062h;
                    int length3 = iArr3 == null ? 0 : iArr3.length;
                    int i5 = i4 + length3;
                    int[] iArr4 = new int[i5];
                    if (length3 != 0) {
                        System.arraycopy(iArr3, 0, iArr4, 0, length3);
                    }
                    while (length3 < i5) {
                        iArr4[length3] = aVar.mo158946h();
                        length3++;
                    }
                    this.f307062h = iArr4;
                    aVar.mo158940b(c);
                    continue;
                case TingScene_FinderProfileSinger_VALUE:
                    int a3 = C108422g.m146910a(aVar, TingClientProto.TingScene.TingScene_FinderProfileSinger_VALUE);
                    C103860b1[] b1VarArr = this.f307063i;
                    int length4 = b1VarArr == null ? 0 : b1VarArr.length;
                    int i6 = a3 + length4;
                    C103860b1[] b1VarArr2 = new C103860b1[i6];
                    if (length4 != 0) {
                        System.arraycopy(b1VarArr, 0, b1VarArr2, 0, length4);
                    }
                    while (length4 < i6 - 1) {
                        C103860b1 b1Var = new C103860b1();
                        b1VarArr2[length4] = b1Var;
                        aVar.mo158943e(b1Var);
                        aVar.mo158949k();
                        length4++;
                    }
                    C103860b1 b1Var2 = new C103860b1();
                    b1VarArr2[length4] = b1Var2;
                    aVar.mo158943e(b1Var2);
                    this.f307063i = b1VarArr2;
                    continue;
                case 1610:
                    int a4 = C108422g.m146910a(aVar, 1610);
                    C103863c1[] c1VarArr = this.f307064j;
                    int length5 = c1VarArr == null ? 0 : c1VarArr.length;
                    int i7 = a4 + length5;
                    C103863c1[] c1VarArr2 = new C103863c1[i7];
                    if (length5 != 0) {
                        System.arraycopy(c1VarArr, 0, c1VarArr2, 0, length5);
                    }
                    while (length5 < i7 - 1) {
                        C103863c1 c1Var = new C103863c1();
                        c1VarArr2[length5] = c1Var;
                        aVar.mo158943e(c1Var);
                        aVar.mo158949k();
                        length5++;
                    }
                    C103863c1 c1Var2 = new C103863c1();
                    c1VarArr2[length5] = c1Var2;
                    aVar.mo158943e(c1Var2);
                    this.f307064j = c1VarArr2;
                    continue;
                case 1618:
                    if (this.f307065k == null) {
                        this.f307065k = new C103914z0();
                    }
                    aVar.mo158943e(this.f307065k);
                    continue;
                case 1626:
                    int a5 = C108422g.m146910a(aVar, 1626);
                    C103860b1[] b1VarArr3 = this.f307066l;
                    int length6 = b1VarArr3 == null ? 0 : b1VarArr3.length;
                    int i8 = a5 + length6;
                    C103860b1[] b1VarArr4 = new C103860b1[i8];
                    if (length6 != 0) {
                        System.arraycopy(b1VarArr3, 0, b1VarArr4, 0, length6);
                    }
                    while (length6 < i8 - 1) {
                        C103860b1 b1Var3 = new C103860b1();
                        b1VarArr4[length6] = b1Var3;
                        aVar.mo158943e(b1Var3);
                        aVar.mo158949k();
                        length6++;
                    }
                    C103860b1 b1Var4 = new C103860b1();
                    b1VarArr4[length6] = b1Var4;
                    aVar.mo158943e(b1Var4);
                    this.f307066l = b1VarArr4;
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
        if (!this.f307056b.equals("")) {
            bVar.mo158961t(1, this.f307056b);
        }
        int i = this.f307057c;
        if (i != 0) {
            bVar.mo158954m(2, i);
        }
        long j = this.f307058d;
        if (j != 0) {
            bVar.mo158955n(3, j);
        }
        C103895q[] qVarArr = this.f307059e;
        int i2 = 0;
        if (qVarArr != null && qVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                C103895q[] qVarArr2 = this.f307059e;
                if (i3 >= qVarArr2.length) {
                    break;
                }
                C103895q qVar = qVarArr2[i3];
                if (qVar != null) {
                    bVar.mo158956o(4, qVar);
                }
                i3++;
            }
        }
        C103912y0 y0Var = this.f307060f;
        if (y0Var != null) {
            bVar.mo158956o(5, y0Var);
        }
        int i4 = this.f307061g;
        if (i4 != 0) {
            bVar.mo158954m(6, i4);
        }
        int[] iArr = this.f307062h;
        if (iArr != null && iArr.length > 0) {
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f307062h;
                if (i5 >= iArr2.length) {
                    break;
                }
                bVar.mo158954m(7, iArr2[i5]);
                i5++;
            }
        }
        C103860b1[] b1VarArr = this.f307063i;
        if (b1VarArr != null && b1VarArr.length > 0) {
            int i6 = 0;
            while (true) {
                C103860b1[] b1VarArr2 = this.f307063i;
                if (i6 >= b1VarArr2.length) {
                    break;
                }
                C103860b1 b1Var = b1VarArr2[i6];
                if (b1Var != null) {
                    bVar.mo158956o(200, b1Var);
                }
                i6++;
            }
        }
        C103863c1[] c1VarArr = this.f307064j;
        if (c1VarArr != null && c1VarArr.length > 0) {
            int i7 = 0;
            while (true) {
                C103863c1[] c1VarArr2 = this.f307064j;
                if (i7 >= c1VarArr2.length) {
                    break;
                }
                C103863c1 c1Var = c1VarArr2[i7];
                if (c1Var != null) {
                    bVar.mo158956o(201, c1Var);
                }
                i7++;
            }
        }
        C103914z0 z0Var = this.f307065k;
        if (z0Var != null) {
            bVar.mo158956o(202, z0Var);
        }
        C103860b1[] b1VarArr3 = this.f307066l;
        if (b1VarArr3 != null && b1VarArr3.length > 0) {
            while (true) {
                C103860b1[] b1VarArr4 = this.f307066l;
                if (i2 < b1VarArr4.length) {
                    C103860b1 b1Var2 = b1VarArr4[i2];
                    if (b1Var2 != null) {
                        bVar.mo158956o(203, b1Var2);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }
}
