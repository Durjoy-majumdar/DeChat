package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cp3 */
public class C101765cp3 extends C47465a {

    /* renamed from: d */
    public float f298033d;

    /* renamed from: e */
    public float f298034e;

    /* renamed from: f */
    public String f298035f;

    /* renamed from: g */
    public String f298036g;

    /* renamed from: h */
    public String f298037h;

    /* renamed from: i */
    public String f298038i;

    /* renamed from: j */
    public int f298039j;

    /* renamed from: n */
    public String f298040n;

    /* renamed from: o */
    public int f298041o;

    /* renamed from: p */
    public int f298042p;

    /* renamed from: q */
    public int f298043q;

    /* renamed from: r */
    public float f298044r;

    /* renamed from: s */
    public C89349b f298045s;

    /* renamed from: t */
    public int f298046t;

    /* renamed from: u */
    public String f298047u;

    /* renamed from: v */
    public String f298048v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101765cp3)) {
            return false;
        }
        C101765cp3 cp32 = (C101765cp3) aVar;
        return C46238a.m51546a(Float.valueOf(this.f298033d), Float.valueOf(cp32.f298033d)) && C46238a.m51546a(Float.valueOf(this.f298034e), Float.valueOf(cp32.f298034e)) && C46238a.m51546a(this.f298035f, cp32.f298035f) && C46238a.m51546a(this.f298036g, cp32.f298036g) && C46238a.m51546a(this.f298037h, cp32.f298037h) && C46238a.m51546a(this.f298038i, cp32.f298038i) && C46238a.m51546a(Integer.valueOf(this.f298039j), Integer.valueOf(cp32.f298039j)) && C46238a.m51546a(this.f298040n, cp32.f298040n) && C46238a.m51546a(Integer.valueOf(this.f298041o), Integer.valueOf(cp32.f298041o)) && C46238a.m51546a(Integer.valueOf(this.f298042p), Integer.valueOf(cp32.f298042p)) && C46238a.m51546a(Integer.valueOf(this.f298043q), Integer.valueOf(cp32.f298043q)) && C46238a.m51546a(Float.valueOf(this.f298044r), Float.valueOf(cp32.f298044r)) && C46238a.m51546a(this.f298045s, cp32.f298045s) && C46238a.m51546a(Integer.valueOf(this.f298046t), Integer.valueOf(cp32.f298046t)) && C46238a.m51546a(this.f298047u, cp32.f298047u) && C46238a.m51546a(this.f298048v, cp32.f298048v);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f298033d);
            aVar.mo74317d(2, this.f298034e);
            String str = this.f298035f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f298036g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f298037h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f298038i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f298039j);
            String str5 = this.f298040n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            aVar.mo74318e(9, this.f298041o);
            aVar.mo74318e(10, this.f298042p);
            aVar.mo74318e(11, this.f298043q);
            aVar.mo74317d(12, this.f298044r);
            C89349b bVar = this.f298045s;
            if (bVar != null) {
                aVar.mo74315b(13, bVar);
            }
            aVar.mo74318e(14, this.f298046t);
            String str6 = this.f298047u;
            if (str6 != null) {
                aVar.mo74323j(15, str6);
            }
            String str7 = this.f298048v;
            if (str7 != null) {
                aVar.mo74323j(16, str7);
            }
            return 0;
        } else if (i2 == 1) {
            int d = C52418a.m58677d(1, this.f298033d) + 0 + C52418a.m58677d(2, this.f298034e);
            String str8 = this.f298035f;
            if (str8 != null) {
                d += C52418a.m58683j(3, str8);
            }
            String str9 = this.f298036g;
            if (str9 != null) {
                d += C52418a.m58683j(4, str9);
            }
            String str10 = this.f298037h;
            if (str10 != null) {
                d += C52418a.m58683j(5, str10);
            }
            String str11 = this.f298038i;
            if (str11 != null) {
                d += C52418a.m58683j(6, str11);
            }
            int e = d + C52418a.m58678e(7, this.f298039j);
            String str12 = this.f298040n;
            if (str12 != null) {
                e += C52418a.m58683j(8, str12);
            }
            int e2 = e + C52418a.m58678e(9, this.f298041o) + C52418a.m58678e(10, this.f298042p) + C52418a.m58678e(11, this.f298043q) + C52418a.m58677d(12, this.f298044r);
            C89349b bVar2 = this.f298045s;
            if (bVar2 != null) {
                e2 += C52418a.m58675b(13, bVar2);
            }
            int e3 = e2 + C52418a.m58678e(14, this.f298046t);
            String str13 = this.f298047u;
            if (str13 != null) {
                e3 += C52418a.m58683j(15, str13);
            }
            String str14 = this.f298048v;
            return str14 != null ? e3 + C52418a.m58683j(16, str14) : e3;
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
            C101765cp3 cp32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    cp32.f298033d = aVar3.mo141628f(intValue);
                    return 0;
                case 2:
                    cp32.f298034e = aVar3.mo141628f(intValue);
                    return 0;
                case 3:
                    cp32.f298035f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    cp32.f298036g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    cp32.f298037h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    cp32.f298038i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    cp32.f298039j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    cp32.f298040n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    cp32.f298041o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    cp32.f298042p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    cp32.f298043q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    cp32.f298044r = aVar3.mo141628f(intValue);
                    return 0;
                case 13:
                    cp32.f298045s = aVar3.mo141626d(intValue);
                    return 0;
                case 14:
                    cp32.f298046t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    cp32.f298047u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    cp32.f298048v = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
