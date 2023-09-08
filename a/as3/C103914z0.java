package as3;

import com.tencent.xweb.util.WXWebReporter;
import java.util.Arrays;
import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108419c;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.z0 */
public final class C103914z0 extends C108421e {

    /* renamed from: b */
    public String f307239b = "";

    /* renamed from: c */
    public byte[] f307240c;

    /* renamed from: d */
    public int f307241d;

    /* renamed from: e */
    public long f307242e;

    /* renamed from: f */
    public byte[] f307243f;

    /* renamed from: g */
    public byte[] f307244g;

    /* renamed from: h */
    public byte[] f307245h;

    /* renamed from: i */
    public C103866d1 f307246i;

    /* renamed from: j */
    public byte[] f307247j;

    /* renamed from: k */
    public C103906v0 f307248k;

    /* renamed from: l */
    public String f307249l;

    /* renamed from: m */
    public String f307250m;

    /* renamed from: n */
    public long f307251n;

    /* renamed from: o */
    public byte[] f307252o;

    /* renamed from: p */
    public byte[] f307253p;

    /* renamed from: q */
    public byte[] f307254q;

    /* renamed from: r */
    public byte[] f307255r;

    /* renamed from: s */
    public int f307256s;

    /* renamed from: t */
    public byte[] f307257t;

    /* renamed from: u */
    public byte[] f307258u;

    /* renamed from: v */
    public byte[] f307259v;

    /* renamed from: w */
    public int f307260w;

    /* renamed from: x */
    public C103893p[] f307261x;

    public C103914z0() {
        byte[] bArr = C108422g.f324646c;
        this.f307240c = bArr;
        this.f307241d = 0;
        this.f307242e = 0;
        this.f307243f = bArr;
        this.f307244g = bArr;
        this.f307245h = bArr;
        this.f307246i = null;
        this.f307247j = bArr;
        this.f307248k = null;
        this.f307249l = "";
        this.f307250m = "";
        this.f307251n = 0;
        this.f307252o = bArr;
        this.f307253p = bArr;
        this.f307254q = bArr;
        this.f307255r = bArr;
        this.f307256s = 0;
        this.f307257t = bArr;
        this.f307258u = bArr;
        this.f307259v = bArr;
        this.f307260w = 0;
        if (C103893p.f307120e == null) {
            synchronized (C108419c.f324642a) {
                if (C103893p.f307120e == null) {
                    C103893p.f307120e = new C103893p[0];
                }
            }
        }
        this.f307261x = C103893p.f307120e;
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = 0;
        int g = !this.f307239b.equals("") ? C108418b.m146887g(1, this.f307239b) + 0 : 0;
        byte[] bArr = this.f307240c;
        byte[] bArr2 = C108422g.f324646c;
        if (!Arrays.equals(bArr, bArr2)) {
            g += C108418b.m146881a(2, this.f307240c);
        }
        int i2 = this.f307241d;
        if (i2 != 0) {
            g += C108418b.m146882b(3, i2);
        }
        long j = this.f307242e;
        if (j != 0) {
            g += C108418b.m146891k(4, j);
        }
        if (!Arrays.equals(this.f307243f, bArr2)) {
            g += C108418b.m146881a(5, this.f307243f);
        }
        if (!Arrays.equals(this.f307244g, bArr2)) {
            g += C108418b.m146881a(6, this.f307244g);
        }
        if (!Arrays.equals(this.f307245h, bArr2)) {
            g += C108418b.m146881a(7, this.f307245h);
        }
        C103866d1 d1Var = this.f307246i;
        if (d1Var != null) {
            g += C108418b.m146884d(8, d1Var);
        }
        if (!Arrays.equals(this.f307247j, bArr2)) {
            g += C108418b.m146881a(9, this.f307247j);
        }
        C103906v0 v0Var = this.f307248k;
        if (v0Var != null) {
            g += C108418b.m146884d(10, v0Var);
        }
        if (!this.f307249l.equals("")) {
            g += C108418b.m146887g(100, this.f307249l);
        }
        if (!this.f307250m.equals("")) {
            g += C108418b.m146887g(101, this.f307250m);
        }
        long j2 = this.f307251n;
        if (j2 != 0) {
            g += C108418b.m146891k(200, j2);
        }
        if (!Arrays.equals(this.f307252o, bArr2)) {
            g += C108418b.m146881a(201, this.f307252o);
        }
        if (!Arrays.equals(this.f307253p, bArr2)) {
            g += C108418b.m146881a(202, this.f307253p);
        }
        if (!Arrays.equals(this.f307254q, bArr2)) {
            g += C108418b.m146881a(203, this.f307254q);
        }
        if (!Arrays.equals(this.f307255r, bArr2)) {
            g += C108418b.m146881a(204, this.f307255r);
        }
        int i3 = this.f307256s;
        if (i3 != 0) {
            g += C108418b.m146882b(220, i3);
        }
        if (!Arrays.equals(this.f307257t, bArr2)) {
            g += C108418b.m146881a(221, this.f307257t);
        }
        if (!Arrays.equals(this.f307258u, bArr2)) {
            g += C108418b.m146881a(WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS, this.f307258u);
        }
        if (!Arrays.equals(this.f307259v, bArr2)) {
            g += C108418b.m146881a(WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB, this.f307259v);
        }
        int i4 = this.f307260w;
        if (i4 != 0) {
            g += C108418b.m146890j(WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, i4);
        }
        C103893p[] pVarArr = this.f307261x;
        if (pVarArr != null && pVarArr.length > 0) {
            while (true) {
                C103893p[] pVarArr2 = this.f307261x;
                if (i >= pVarArr2.length) {
                    break;
                }
                C103893p pVar = pVarArr2[i];
                if (pVar != null) {
                    g += C108418b.m146884d(225, pVar);
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
                    this.f307239b = aVar.mo158948j();
                    continue;
                case 18:
                    this.f307240c = aVar.mo158942d();
                    continue;
                case 24:
                    this.f307241d = aVar.mo158946h();
                    continue;
                case 32:
                    this.f307242e = aVar.mo158947i();
                    continue;
                case 42:
                    this.f307243f = aVar.mo158942d();
                    continue;
                case 50:
                    this.f307244g = aVar.mo158942d();
                    continue;
                case 58:
                    this.f307245h = aVar.mo158942d();
                    continue;
                case 66:
                    if (this.f307246i == null) {
                        this.f307246i = new C103866d1();
                    }
                    aVar.mo158943e(this.f307246i);
                    continue;
                case 74:
                    this.f307247j = aVar.mo158942d();
                    continue;
                case 82:
                    if (this.f307248k == null) {
                        this.f307248k = new C103906v0();
                    }
                    aVar.mo158943e(this.f307248k);
                    continue;
                case 802:
                    this.f307249l = aVar.mo158948j();
                    continue;
                case 810:
                    this.f307250m = aVar.mo158948j();
                    continue;
                case 1600:
                    this.f307251n = aVar.mo158947i();
                    continue;
                case 1610:
                    this.f307252o = aVar.mo158942d();
                    continue;
                case 1618:
                    this.f307253p = aVar.mo158942d();
                    continue;
                case 1626:
                    this.f307254q = aVar.mo158942d();
                    continue;
                case 1634:
                    this.f307255r = aVar.mo158942d();
                    continue;
                case 1760:
                    this.f307256s = aVar.mo158946h();
                    continue;
                case 1770:
                    this.f307257t = aVar.mo158942d();
                    continue;
                case 1778:
                    this.f307258u = aVar.mo158942d();
                    continue;
                case 1786:
                    this.f307259v = aVar.mo158942d();
                    continue;
                case 1792:
                    this.f307260w = aVar.mo158946h();
                    continue;
                case 1802:
                    int a = C108422g.m146910a(aVar, 1802);
                    C103893p[] pVarArr = this.f307261x;
                    int length = pVarArr == null ? 0 : pVarArr.length;
                    int i = a + length;
                    C103893p[] pVarArr2 = new C103893p[i];
                    if (length != 0) {
                        System.arraycopy(pVarArr, 0, pVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        C103893p pVar = new C103893p();
                        pVarArr2[length] = pVar;
                        aVar.mo158943e(pVar);
                        aVar.mo158949k();
                        length++;
                    }
                    C103893p pVar2 = new C103893p();
                    pVarArr2[length] = pVar2;
                    aVar.mo158943e(pVar2);
                    this.f307261x = pVarArr2;
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
        if (!this.f307239b.equals("")) {
            bVar.mo158961t(1, this.f307239b);
        }
        byte[] bArr = this.f307240c;
        byte[] bArr2 = C108422g.f324646c;
        if (!Arrays.equals(bArr, bArr2)) {
            bVar.mo158953l(2, this.f307240c);
        }
        int i = this.f307241d;
        if (i != 0) {
            bVar.mo158954m(3, i);
        }
        long j = this.f307242e;
        if (j != 0) {
            bVar.mo158964w(4, j);
        }
        if (!Arrays.equals(this.f307243f, bArr2)) {
            bVar.mo158953l(5, this.f307243f);
        }
        if (!Arrays.equals(this.f307244g, bArr2)) {
            bVar.mo158953l(6, this.f307244g);
        }
        if (!Arrays.equals(this.f307245h, bArr2)) {
            bVar.mo158953l(7, this.f307245h);
        }
        C103866d1 d1Var = this.f307246i;
        if (d1Var != null) {
            bVar.mo158956o(8, d1Var);
        }
        if (!Arrays.equals(this.f307247j, bArr2)) {
            bVar.mo158953l(9, this.f307247j);
        }
        C103906v0 v0Var = this.f307248k;
        if (v0Var != null) {
            bVar.mo158956o(10, v0Var);
        }
        if (!this.f307249l.equals("")) {
            bVar.mo158961t(100, this.f307249l);
        }
        if (!this.f307250m.equals("")) {
            bVar.mo158961t(101, this.f307250m);
        }
        long j2 = this.f307251n;
        if (j2 != 0) {
            bVar.mo158964w(200, j2);
        }
        if (!Arrays.equals(this.f307252o, bArr2)) {
            bVar.mo158953l(201, this.f307252o);
        }
        if (!Arrays.equals(this.f307253p, bArr2)) {
            bVar.mo158953l(202, this.f307253p);
        }
        if (!Arrays.equals(this.f307254q, bArr2)) {
            bVar.mo158953l(203, this.f307254q);
        }
        if (!Arrays.equals(this.f307255r, bArr2)) {
            bVar.mo158953l(204, this.f307255r);
        }
        int i2 = this.f307256s;
        if (i2 != 0) {
            bVar.mo158954m(220, i2);
        }
        if (!Arrays.equals(this.f307257t, bArr2)) {
            bVar.mo158953l(221, this.f307257t);
        }
        if (!Arrays.equals(this.f307258u, bArr2)) {
            bVar.mo158953l(WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS, this.f307258u);
        }
        if (!Arrays.equals(this.f307259v, bArr2)) {
            bVar.mo158953l(WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB, this.f307259v);
        }
        int i3 = this.f307260w;
        if (i3 != 0) {
            bVar.mo158963v(WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, i3);
        }
        C103893p[] pVarArr = this.f307261x;
        if (pVarArr != null && pVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                C103893p[] pVarArr2 = this.f307261x;
                if (i4 < pVarArr2.length) {
                    C103893p pVar = pVarArr2[i4];
                    if (pVar != null) {
                        bVar.mo158956o(225, pVar);
                    }
                    i4++;
                } else {
                    return;
                }
            }
        }
    }
}
