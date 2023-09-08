package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j93 */
public class C49965j93 extends C47465a {

    /* renamed from: d */
    public String f135944d;

    /* renamed from: e */
    public String f135945e;

    /* renamed from: f */
    public String f135946f;

    /* renamed from: g */
    public String f135947g;

    /* renamed from: h */
    public String f135948h;

    /* renamed from: i */
    public String f135949i;

    /* renamed from: j */
    public String f135950j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49965j93)) {
            return false;
        }
        C49965j93 j932 = (C49965j93) aVar;
        return C46238a.m51546a(this.f135944d, j932.f135944d) && C46238a.m51546a(this.f135945e, j932.f135945e) && C46238a.m51546a(this.f135946f, j932.f135946f) && C46238a.m51546a(this.f135947g, j932.f135947g) && C46238a.m51546a(this.f135948h, j932.f135948h) && C46238a.m51546a(this.f135949i, j932.f135949i) && C46238a.m51546a(this.f135950j, j932.f135950j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135944d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f135945e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f135946f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f135947g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f135948h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f135949i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f135950j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            return 0;
        } else if (i == 1) {
            String str8 = this.f135944d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f135945e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f135946f;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f135947g;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f135948h;
            if (str12 != null) {
                i2 += C52418a.m58683j(5, str12);
            }
            String str13 = this.f135949i;
            if (str13 != null) {
                i2 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f135950j;
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
            C49965j93 j932 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    j932.f135944d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    j932.f135945e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    j932.f135946f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    j932.f135947g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    j932.f135948h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    j932.f135949i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    j932.f135950j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
