package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class g45 extends C47465a {

    /* renamed from: d */
    public String f133849d;

    /* renamed from: e */
    public String f133850e;

    /* renamed from: f */
    public String f133851f;

    /* renamed from: g */
    public String f133852g;

    /* renamed from: h */
    public String f133853h;

    /* renamed from: i */
    public String f133854i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof g45)) {
            return false;
        }
        g45 g45 = (g45) aVar;
        return C46238a.m51546a(this.f133849d, g45.f133849d) && C46238a.m51546a(this.f133850e, g45.f133850e) && C46238a.m51546a(this.f133851f, g45.f133851f) && C46238a.m51546a(this.f133852g, g45.f133852g) && C46238a.m51546a(this.f133853h, g45.f133853h) && C46238a.m51546a(this.f133854i, g45.f133854i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f133849d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f133850e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f133851f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f133852g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f133853h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f133854i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f133849d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f133850e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f133851f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f133852g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f133853h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f133854i;
            return str12 != null ? i2 + C52418a.m58683j(6, str12) : i2;
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
            g45 g45 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    g45.f133849d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    g45.f133850e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    g45.f133851f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    g45.f133852g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    g45.f133853h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    g45.f133854i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
