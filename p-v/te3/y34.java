package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class y34 extends C47465a {

    /* renamed from: d */
    public String f64815d;

    /* renamed from: e */
    public String f64816e;

    /* renamed from: f */
    public String f64817f;

    /* renamed from: g */
    public String f64818g;

    /* renamed from: h */
    public String f64819h;

    /* renamed from: i */
    public int f64820i;

    /* renamed from: j */
    public String f64821j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof y34)) {
            return false;
        }
        y34 y34 = (y34) aVar;
        return C46238a.m51546a(this.f64815d, y34.f64815d) && C46238a.m51546a(this.f64816e, y34.f64816e) && C46238a.m51546a(this.f64817f, y34.f64817f) && C46238a.m51546a(this.f64818g, y34.f64818g) && C46238a.m51546a(this.f64819h, y34.f64819h) && C46238a.m51546a(Integer.valueOf(this.f64820i), Integer.valueOf(y34.f64820i)) && C46238a.m51546a(this.f64821j, y34.f64821j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64815d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f64816e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f64817f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f64818g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f64819h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74318e(6, this.f64820i);
            String str6 = this.f64821j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f64815d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f64816e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f64817f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f64818g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f64819h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            int e = i2 + C52418a.m58678e(6, this.f64820i);
            String str12 = this.f64821j;
            return str12 != null ? e + C52418a.m58683j(7, str12) : e;
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
            y34 y34 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    y34.f64815d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    y34.f64816e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    y34.f64817f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    y34.f64818g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    y34.f64819h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    y34.f64820i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    y34.f64821j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
