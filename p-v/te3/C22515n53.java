package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n53 */
public class C22515n53 extends C47465a {

    /* renamed from: d */
    public String f64264d;

    /* renamed from: e */
    public int f64265e;

    /* renamed from: f */
    public int f64266f;

    /* renamed from: g */
    public int f64267g;

    /* renamed from: h */
    public int f64268h;

    /* renamed from: i */
    public String f64269i;

    /* renamed from: j */
    public String f64270j;

    /* renamed from: n */
    public int f64271n;

    /* renamed from: o */
    public int f64272o;

    /* renamed from: p */
    public long f64273p;

    /* renamed from: q */
    public int f64274q;

    /* renamed from: r */
    public int f64275r;

    /* renamed from: s */
    public String f64276s;

    /* renamed from: t */
    public int f64277t;

    /* renamed from: u */
    public int f64278u;

    /* renamed from: v */
    public int f64279v;

    /* renamed from: w */
    public int f64280w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22515n53)) {
            return false;
        }
        C22515n53 n532 = (C22515n53) aVar;
        return C46238a.m51546a(this.f64264d, n532.f64264d) && C46238a.m51546a(Integer.valueOf(this.f64265e), Integer.valueOf(n532.f64265e)) && C46238a.m51546a(Integer.valueOf(this.f64266f), Integer.valueOf(n532.f64266f)) && C46238a.m51546a(Integer.valueOf(this.f64267g), Integer.valueOf(n532.f64267g)) && C46238a.m51546a(Integer.valueOf(this.f64268h), Integer.valueOf(n532.f64268h)) && C46238a.m51546a(this.f64269i, n532.f64269i) && C46238a.m51546a(this.f64270j, n532.f64270j) && C46238a.m51546a(Integer.valueOf(this.f64271n), Integer.valueOf(n532.f64271n)) && C46238a.m51546a(Integer.valueOf(this.f64272o), Integer.valueOf(n532.f64272o)) && C46238a.m51546a(Long.valueOf(this.f64273p), Long.valueOf(n532.f64273p)) && C46238a.m51546a(Integer.valueOf(this.f64274q), Integer.valueOf(n532.f64274q)) && C46238a.m51546a(Integer.valueOf(this.f64275r), Integer.valueOf(n532.f64275r)) && C46238a.m51546a(this.f64276s, n532.f64276s) && C46238a.m51546a(Integer.valueOf(this.f64277t), Integer.valueOf(n532.f64277t)) && C46238a.m51546a(Integer.valueOf(this.f64278u), Integer.valueOf(n532.f64278u)) && C46238a.m51546a(Integer.valueOf(this.f64279v), Integer.valueOf(n532.f64279v)) && C46238a.m51546a(Integer.valueOf(this.f64280w), Integer.valueOf(n532.f64280w));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64264d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f64265e);
            aVar.mo74318e(3, this.f64266f);
            aVar.mo74318e(4, this.f64267g);
            aVar.mo74318e(5, this.f64268h);
            String str2 = this.f64269i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f64270j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74318e(8, this.f64271n);
            aVar.mo74318e(9, this.f64272o);
            aVar.mo74321h(10, this.f64273p);
            aVar.mo74318e(11, this.f64274q);
            aVar.mo74318e(12, this.f64275r);
            String str4 = this.f64276s;
            if (str4 != null) {
                aVar.mo74323j(13, str4);
            }
            aVar.mo74318e(14, this.f64277t);
            aVar.mo74318e(15, this.f64278u);
            aVar.mo74318e(16, this.f64279v);
            aVar.mo74318e(17, this.f64280w);
            return 0;
        } else if (i2 == 1) {
            String str5 = this.f64264d;
            if (str5 != null) {
                i3 = C52418a.m58683j(1, str5) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f64265e) + C52418a.m58678e(3, this.f64266f) + C52418a.m58678e(4, this.f64267g) + C52418a.m58678e(5, this.f64268h);
            String str6 = this.f64269i;
            if (str6 != null) {
                e += C52418a.m58683j(6, str6);
            }
            String str7 = this.f64270j;
            if (str7 != null) {
                e += C52418a.m58683j(7, str7);
            }
            int e2 = e + C52418a.m58678e(8, this.f64271n) + C52418a.m58678e(9, this.f64272o) + C52418a.m58681h(10, this.f64273p) + C52418a.m58678e(11, this.f64274q) + C52418a.m58678e(12, this.f64275r);
            String str8 = this.f64276s;
            if (str8 != null) {
                e2 += C52418a.m58683j(13, str8);
            }
            return e2 + C52418a.m58678e(14, this.f64277t) + C52418a.m58678e(15, this.f64278u) + C52418a.m58678e(16, this.f64279v) + C52418a.m58678e(17, this.f64280w);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C22515n53 n532 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    n532.f64264d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    n532.f64265e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    n532.f64266f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    n532.f64267g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    n532.f64268h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    n532.f64269i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    n532.f64270j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    n532.f64271n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    n532.f64272o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    n532.f64273p = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    n532.f64274q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    n532.f64275r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    n532.f64276s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    n532.f64277t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    n532.f64278u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    n532.f64279v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    n532.f64280w = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
