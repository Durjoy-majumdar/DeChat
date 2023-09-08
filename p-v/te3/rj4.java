package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class rj4 extends C47465a {

    /* renamed from: d */
    public String f140960d;

    /* renamed from: e */
    public String f140961e;

    /* renamed from: f */
    public String f140962f;

    /* renamed from: g */
    public String f140963g;

    /* renamed from: h */
    public String f140964h;

    /* renamed from: i */
    public String f140965i;

    /* renamed from: j */
    public String f140966j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof rj4)) {
            return false;
        }
        rj4 rj4 = (rj4) aVar;
        return C46238a.m51546a(this.f140960d, rj4.f140960d) && C46238a.m51546a(this.f140961e, rj4.f140961e) && C46238a.m51546a(this.f140962f, rj4.f140962f) && C46238a.m51546a(this.f140963g, rj4.f140963g) && C46238a.m51546a(this.f140964h, rj4.f140964h) && C46238a.m51546a(this.f140965i, rj4.f140965i) && C46238a.m51546a(this.f140966j, rj4.f140966j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140960d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f140961e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f140962f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f140963g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f140964h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f140965i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f140966j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            return 0;
        } else if (i == 1) {
            String str8 = this.f140960d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f140961e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f140962f;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f140963g;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f140964h;
            if (str12 != null) {
                i2 += C52418a.m58683j(5, str12);
            }
            String str13 = this.f140965i;
            if (str13 != null) {
                i2 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f140966j;
            return str14 != null ? i2 + C52418a.m58683j(7, str14) : i2;
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
            rj4 rj4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rj4.f140960d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    rj4.f140961e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rj4.f140962f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    rj4.f140963g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    rj4.f140964h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    rj4.f140965i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    rj4.f140966j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
