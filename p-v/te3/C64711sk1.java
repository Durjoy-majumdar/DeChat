package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sk1 */
public class C64711sk1 extends C47465a {

    /* renamed from: d */
    public String f185422d;

    /* renamed from: e */
    public String f185423e;

    /* renamed from: f */
    public String f185424f;

    /* renamed from: g */
    public String f185425g;

    /* renamed from: h */
    public String f185426h;

    /* renamed from: i */
    public String f185427i;

    /* renamed from: j */
    public String f185428j;

    /* renamed from: n */
    public String f185429n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64711sk1)) {
            return false;
        }
        C64711sk1 sk12 = (C64711sk1) aVar;
        return C46238a.m51546a(this.f185422d, sk12.f185422d) && C46238a.m51546a(this.f185423e, sk12.f185423e) && C46238a.m51546a(this.f185424f, sk12.f185424f) && C46238a.m51546a(this.f185425g, sk12.f185425g) && C46238a.m51546a(this.f185426h, sk12.f185426h) && C46238a.m51546a(this.f185427i, sk12.f185427i) && C46238a.m51546a(this.f185428j, sk12.f185428j) && C46238a.m51546a(this.f185429n, sk12.f185429n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185422d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185423e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f185424f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f185425g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f185426h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f185427i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f185428j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            String str8 = this.f185429n;
            if (str8 != null) {
                aVar.mo74323j(8, str8);
            }
            return 0;
        } else if (i == 1) {
            String str9 = this.f185422d;
            if (str9 != null) {
                i2 = 0 + C52418a.m58683j(1, str9);
            }
            String str10 = this.f185423e;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f185424f;
            if (str11 != null) {
                i2 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f185425g;
            if (str12 != null) {
                i2 += C52418a.m58683j(4, str12);
            }
            String str13 = this.f185426h;
            if (str13 != null) {
                i2 += C52418a.m58683j(5, str13);
            }
            String str14 = this.f185427i;
            if (str14 != null) {
                i2 += C52418a.m58683j(6, str14);
            }
            String str15 = this.f185428j;
            if (str15 != null) {
                i2 += C52418a.m58683j(7, str15);
            }
            String str16 = this.f185429n;
            return str16 != null ? i2 + C52418a.m58683j(8, str16) : i2;
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
            C64711sk1 sk12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    sk12.f185422d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    sk12.f185423e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    sk12.f185424f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    sk12.f185425g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    sk12.f185426h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    sk12.f185427i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    sk12.f185428j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    sk12.f185429n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
