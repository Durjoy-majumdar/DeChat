package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108419c;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.e */
public final class C103867e extends C108421e {

    /* renamed from: b */
    public String f306962b = "";

    /* renamed from: c */
    public int f306963c = 0;

    /* renamed from: d */
    public long f306964d = 0;

    /* renamed from: e */
    public C103875g1 f306965e = null;

    /* renamed from: f */
    public int f306966f = 0;

    /* renamed from: g */
    public int f306967g = 0;

    /* renamed from: h */
    public int f306968h = 0;

    /* renamed from: i */
    public int f306969i = 0;

    /* renamed from: j */
    public C103914z0 f306970j = null;

    /* renamed from: k */
    public String[] f306971k = C108422g.f324645b;

    /* renamed from: l */
    public C103891o[] f306972l;

    /* renamed from: m */
    public C103903u f306973m;

    /* renamed from: n */
    public int f306974n;

    /* renamed from: o */
    public int f306975o;

    public C103867e() {
        if (C103891o.f307113e == null) {
            synchronized (C108419c.f324642a) {
                if (C103891o.f307113e == null) {
                    C103891o.f307113e = new C103891o[0];
                }
            }
        }
        this.f306972l = C103891o.f307113e;
        this.f306973m = null;
        this.f306974n = 0;
        this.f306975o = 0;
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = 0;
        int g = !this.f306962b.equals("") ? C108418b.m146887g(1, this.f306962b) + 0 : 0;
        int i2 = this.f306963c;
        if (i2 != 0) {
            g += C108418b.m146882b(2, i2);
        }
        long j = this.f306964d;
        if (j != 0) {
            g += C108418b.m146883c(3, j);
        }
        C103875g1 g1Var = this.f306965e;
        if (g1Var != null) {
            g += C108418b.m146884d(4, g1Var);
        }
        int i3 = this.f306966f;
        if (i3 != 0) {
            g += C108418b.m146882b(5, i3);
        }
        int i4 = this.f306967g;
        if (i4 != 0) {
            g += C108418b.m146890j(6, i4);
        }
        int i5 = this.f306968h;
        if (i5 != 0) {
            g += C108418b.m146882b(7, i5);
        }
        int i6 = this.f306969i;
        if (i6 != 0) {
            g += C108418b.m146890j(8, i6);
        }
        C103914z0 z0Var = this.f306970j;
        if (z0Var != null) {
            g += C108418b.m146884d(200, z0Var);
        }
        String[] strArr = this.f306971k;
        if (strArr != null && strArr.length > 0) {
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                String[] strArr2 = this.f306971k;
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
            g = g + i8 + (i9 * 2);
        }
        C103891o[] oVarArr = this.f306972l;
        if (oVarArr != null && oVarArr.length > 0) {
            while (true) {
                C103891o[] oVarArr2 = this.f306972l;
                if (i >= oVarArr2.length) {
                    break;
                }
                C103891o oVar = oVarArr2[i];
                if (oVar != null) {
                    g += C108418b.m146884d(202, oVar);
                }
                i++;
            }
        }
        C103903u uVar = this.f306973m;
        if (uVar != null) {
            g += C108418b.m146884d(203, uVar);
        }
        int i15 = this.f306974n;
        if (i15 != 0) {
            g += C108418b.m146890j(204, i15);
        }
        int i16 = this.f306975o;
        return i16 != 0 ? g + C108418b.m146890j(240, i16) : g;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            switch (k) {
                case 0:
                    break;
                case 10:
                    this.f306962b = aVar.mo158948j();
                    continue;
                case 16:
                    this.f306963c = aVar.mo158946h();
                    continue;
                case 24:
                    this.f306964d = aVar.mo158947i();
                    continue;
                case 34:
                    if (this.f306965e == null) {
                        this.f306965e = new C103875g1();
                    }
                    aVar.mo158943e(this.f306965e);
                    continue;
                case 40:
                    this.f306966f = aVar.mo158946h();
                    continue;
                case 48:
                    this.f306967g = aVar.mo158946h();
                    continue;
                case 56:
                    this.f306968h = aVar.mo158946h();
                    continue;
                case 64:
                    this.f306969i = aVar.mo158946h();
                    continue;
                case TingScene_FinderProfileSinger_VALUE:
                    if (this.f306970j == null) {
                        this.f306970j = new C103914z0();
                    }
                    aVar.mo158943e(this.f306970j);
                    continue;
                case 1610:
                    int a = C108422g.m146910a(aVar, 1610);
                    String[] strArr = this.f306971k;
                    int length = strArr == null ? 0 : strArr.length;
                    int i = a + length;
                    String[] strArr2 = new String[i];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i - 1) {
                        strArr2[length] = aVar.mo158948j();
                        aVar.mo158949k();
                        length++;
                    }
                    strArr2[length] = aVar.mo158948j();
                    this.f306971k = strArr2;
                    continue;
                case 1618:
                    int a2 = C108422g.m146910a(aVar, 1618);
                    C103891o[] oVarArr = this.f306972l;
                    int length2 = oVarArr == null ? 0 : oVarArr.length;
                    int i2 = a2 + length2;
                    C103891o[] oVarArr2 = new C103891o[i2];
                    if (length2 != 0) {
                        System.arraycopy(oVarArr, 0, oVarArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        C103891o oVar = new C103891o();
                        oVarArr2[length2] = oVar;
                        aVar.mo158943e(oVar);
                        aVar.mo158949k();
                        length2++;
                    }
                    C103891o oVar2 = new C103891o();
                    oVarArr2[length2] = oVar2;
                    aVar.mo158943e(oVar2);
                    this.f306972l = oVarArr2;
                    continue;
                case 1626:
                    if (this.f306973m == null) {
                        this.f306973m = new C103903u();
                    }
                    aVar.mo158943e(this.f306973m);
                    continue;
                case 1632:
                    this.f306974n = aVar.mo158946h();
                    continue;
                case 1920:
                    this.f306975o = aVar.mo158946h();
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
        if (!this.f306962b.equals("")) {
            bVar.mo158961t(1, this.f306962b);
        }
        int i = this.f306963c;
        if (i != 0) {
            bVar.mo158954m(2, i);
        }
        long j = this.f306964d;
        if (j != 0) {
            bVar.mo158955n(3, j);
        }
        C103875g1 g1Var = this.f306965e;
        if (g1Var != null) {
            bVar.mo158956o(4, g1Var);
        }
        int i2 = this.f306966f;
        if (i2 != 0) {
            bVar.mo158954m(5, i2);
        }
        int i3 = this.f306967g;
        if (i3 != 0) {
            bVar.mo158963v(6, i3);
        }
        int i4 = this.f306968h;
        if (i4 != 0) {
            bVar.mo158954m(7, i4);
        }
        int i5 = this.f306969i;
        if (i5 != 0) {
            bVar.mo158963v(8, i5);
        }
        C103914z0 z0Var = this.f306970j;
        if (z0Var != null) {
            bVar.mo158956o(200, z0Var);
        }
        String[] strArr = this.f306971k;
        int i6 = 0;
        if (strArr != null && strArr.length > 0) {
            int i7 = 0;
            while (true) {
                String[] strArr2 = this.f306971k;
                if (i7 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i7];
                if (str != null) {
                    bVar.mo158961t(201, str);
                }
                i7++;
            }
        }
        C103891o[] oVarArr = this.f306972l;
        if (oVarArr != null && oVarArr.length > 0) {
            while (true) {
                C103891o[] oVarArr2 = this.f306972l;
                if (i6 >= oVarArr2.length) {
                    break;
                }
                C103891o oVar = oVarArr2[i6];
                if (oVar != null) {
                    bVar.mo158956o(202, oVar);
                }
                i6++;
            }
        }
        C103903u uVar = this.f306973m;
        if (uVar != null) {
            bVar.mo158956o(203, uVar);
        }
        int i8 = this.f306974n;
        if (i8 != 0) {
            bVar.mo158963v(204, i8);
        }
        int i9 = this.f306975o;
        if (i9 != 0) {
            bVar.mo158963v(240, i9);
        }
    }
}
