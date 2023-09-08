package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class d05 extends C47465a {

    /* renamed from: d */
    public String f298070d;

    /* renamed from: e */
    public String f298071e;

    /* renamed from: f */
    public int f298072f;

    /* renamed from: g */
    public int f298073g;

    /* renamed from: h */
    public String f298074h;

    /* renamed from: i */
    public int f298075i;

    /* renamed from: j */
    public String f298076j;

    /* renamed from: n */
    public int f298077n;

    /* renamed from: o */
    public String f298078o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof d05)) {
            return false;
        }
        d05 d05 = (d05) aVar;
        return C46238a.m51546a(this.f298070d, d05.f298070d) && C46238a.m51546a(this.f298071e, d05.f298071e) && C46238a.m51546a(Integer.valueOf(this.f298072f), Integer.valueOf(d05.f298072f)) && C46238a.m51546a(Integer.valueOf(this.f298073g), Integer.valueOf(d05.f298073g)) && C46238a.m51546a(this.f298074h, d05.f298074h) && C46238a.m51546a(Integer.valueOf(this.f298075i), Integer.valueOf(d05.f298075i)) && C46238a.m51546a(this.f298076j, d05.f298076j) && C46238a.m51546a(Integer.valueOf(this.f298077n), Integer.valueOf(d05.f298077n)) && C46238a.m51546a(this.f298078o, d05.f298078o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298070d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f298071e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f298072f);
            aVar.mo74318e(4, this.f298073g);
            String str3 = this.f298074h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f298075i);
            String str4 = this.f298076j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            aVar.mo74318e(8, this.f298077n);
            String str5 = this.f298078o;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f298070d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f298071e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            int e = i2 + C52418a.m58678e(3, this.f298072f) + C52418a.m58678e(4, this.f298073g);
            String str8 = this.f298074h;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            int e2 = e + C52418a.m58678e(6, this.f298075i);
            String str9 = this.f298076j;
            if (str9 != null) {
                e2 += C52418a.m58683j(7, str9);
            }
            int e3 = e2 + C52418a.m58678e(8, this.f298077n);
            String str10 = this.f298078o;
            return str10 != null ? e3 + C52418a.m58683j(9, str10) : e3;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            d05 d05 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    d05.f298070d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    d05.f298071e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    d05.f298072f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    d05.f298073g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    d05.f298074h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    d05.f298075i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    d05.f298076j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    d05.f298077n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    d05.f298078o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
