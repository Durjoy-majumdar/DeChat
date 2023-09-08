package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k21 */
public class C64481k21 extends C47465a {

    /* renamed from: d */
    public int f183860d;

    /* renamed from: e */
    public String f183861e;

    /* renamed from: f */
    public String f183862f;

    /* renamed from: g */
    public int f183863g;

    /* renamed from: h */
    public String f183864h;

    /* renamed from: i */
    public String f183865i;

    /* renamed from: j */
    public String f183866j;

    /* renamed from: n */
    public int f183867n;

    /* renamed from: o */
    public String f183868o;

    /* renamed from: p */
    public int f183869p;

    /* renamed from: q */
    public String f183870q;

    /* renamed from: r */
    public int f183871r;

    /* renamed from: s */
    public int f183872s;

    /* renamed from: t */
    public int f183873t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64481k21)) {
            return false;
        }
        C64481k21 k212 = (C64481k21) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183860d), Integer.valueOf(k212.f183860d)) && C46238a.m51546a(this.f183861e, k212.f183861e) && C46238a.m51546a(this.f183862f, k212.f183862f) && C46238a.m51546a(Integer.valueOf(this.f183863g), Integer.valueOf(k212.f183863g)) && C46238a.m51546a(this.f183864h, k212.f183864h) && C46238a.m51546a(this.f183865i, k212.f183865i) && C46238a.m51546a(this.f183866j, k212.f183866j) && C46238a.m51546a(Integer.valueOf(this.f183867n), Integer.valueOf(k212.f183867n)) && C46238a.m51546a(this.f183868o, k212.f183868o) && C46238a.m51546a(Integer.valueOf(this.f183869p), Integer.valueOf(k212.f183869p)) && C46238a.m51546a(this.f183870q, k212.f183870q) && C46238a.m51546a(Integer.valueOf(this.f183871r), Integer.valueOf(k212.f183871r)) && C46238a.m51546a(Integer.valueOf(this.f183872s), Integer.valueOf(k212.f183872s)) && C46238a.m51546a(Integer.valueOf(this.f183873t), Integer.valueOf(k212.f183873t));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183860d);
            String str = this.f183861e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f183862f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f183863g);
            String str3 = this.f183864h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f183865i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f183866j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            aVar.mo74318e(8, this.f183867n);
            String str6 = this.f183868o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            aVar.mo74318e(10, this.f183869p);
            String str7 = this.f183870q;
            if (str7 != null) {
                aVar.mo74323j(11, str7);
            }
            aVar.mo74318e(12, this.f183871r);
            aVar.mo74318e(13, this.f183872s);
            aVar.mo74318e(14, this.f183873t);
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f183860d) + 0;
            String str8 = this.f183861e;
            if (str8 != null) {
                e += C52418a.m58683j(2, str8);
            }
            String str9 = this.f183862f;
            if (str9 != null) {
                e += C52418a.m58683j(3, str9);
            }
            int e2 = e + C52418a.m58678e(4, this.f183863g);
            String str10 = this.f183864h;
            if (str10 != null) {
                e2 += C52418a.m58683j(5, str10);
            }
            String str11 = this.f183865i;
            if (str11 != null) {
                e2 += C52418a.m58683j(6, str11);
            }
            String str12 = this.f183866j;
            if (str12 != null) {
                e2 += C52418a.m58683j(7, str12);
            }
            int e3 = e2 + C52418a.m58678e(8, this.f183867n);
            String str13 = this.f183868o;
            if (str13 != null) {
                e3 += C52418a.m58683j(9, str13);
            }
            int e4 = e3 + C52418a.m58678e(10, this.f183869p);
            String str14 = this.f183870q;
            if (str14 != null) {
                e4 += C52418a.m58683j(11, str14);
            }
            return e4 + C52418a.m58678e(12, this.f183871r) + C52418a.m58678e(13, this.f183872s) + C52418a.m58678e(14, this.f183873t);
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
            C64481k21 k212 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    k212.f183860d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    k212.f183861e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    k212.f183862f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    k212.f183863g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    k212.f183864h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    k212.f183865i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    k212.f183866j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    k212.f183867n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    k212.f183868o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    k212.f183869p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    k212.f183870q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    k212.f183871r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    k212.f183872s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    k212.f183873t = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
