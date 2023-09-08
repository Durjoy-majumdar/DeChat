package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gg1 */
public class C49557gg1 extends C47465a {

    /* renamed from: d */
    public String f134031d;

    /* renamed from: e */
    public String f134032e;

    /* renamed from: f */
    public int f134033f;

    /* renamed from: g */
    public String f134034g;

    /* renamed from: h */
    public String f134035h;

    /* renamed from: i */
    public String f134036i;

    /* renamed from: j */
    public String f134037j;

    /* renamed from: n */
    public String f134038n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49557gg1)) {
            return false;
        }
        C49557gg1 gg12 = (C49557gg1) aVar;
        return C46238a.m51546a(this.f134031d, gg12.f134031d) && C46238a.m51546a(this.f134032e, gg12.f134032e) && C46238a.m51546a(Integer.valueOf(this.f134033f), Integer.valueOf(gg12.f134033f)) && C46238a.m51546a(this.f134034g, gg12.f134034g) && C46238a.m51546a(this.f134035h, gg12.f134035h) && C46238a.m51546a(this.f134036i, gg12.f134036i) && C46238a.m51546a(this.f134037j, gg12.f134037j) && C46238a.m51546a(this.f134038n, gg12.f134038n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134031d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f134032e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f134033f);
            String str3 = this.f134034g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f134035h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f134036i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f134037j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f134038n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            return 0;
        } else if (i == 1) {
            String str8 = this.f134031d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f134032e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            int e = i2 + C52418a.m58678e(3, this.f134033f);
            String str10 = this.f134034g;
            if (str10 != null) {
                e += C52418a.m58683j(4, str10);
            }
            String str11 = this.f134035h;
            if (str11 != null) {
                e += C52418a.m58683j(5, str11);
            }
            String str12 = this.f134036i;
            if (str12 != null) {
                e += C52418a.m58683j(6, str12);
            }
            String str13 = this.f134037j;
            if (str13 != null) {
                e += C52418a.m58683j(7, str13);
            }
            String str14 = this.f134038n;
            return str14 != null ? e + C52418a.m58683j(8, str14) : e;
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
            C49557gg1 gg12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    gg12.f134031d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    gg12.f134032e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    gg12.f134033f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    gg12.f134034g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    gg12.f134035h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    gg12.f134036i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    gg12.f134037j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    gg12.f134038n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
