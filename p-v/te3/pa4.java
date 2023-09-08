package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class pa4 extends C47465a {

    /* renamed from: d */
    public String f139678d;

    /* renamed from: e */
    public String f139679e;

    /* renamed from: f */
    public String f139680f;

    /* renamed from: g */
    public String f139681g;

    /* renamed from: h */
    public int f139682h;

    /* renamed from: i */
    public String f139683i;

    /* renamed from: j */
    public String f139684j;

    /* renamed from: n */
    public String f139685n;

    /* renamed from: o */
    public int f139686o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof pa4)) {
            return false;
        }
        pa4 pa4 = (pa4) aVar;
        return C46238a.m51546a(this.f139678d, pa4.f139678d) && C46238a.m51546a(this.f139679e, pa4.f139679e) && C46238a.m51546a(this.f139680f, pa4.f139680f) && C46238a.m51546a(this.f139681g, pa4.f139681g) && C46238a.m51546a(Integer.valueOf(this.f139682h), Integer.valueOf(pa4.f139682h)) && C46238a.m51546a(this.f139683i, pa4.f139683i) && C46238a.m51546a(this.f139684j, pa4.f139684j) && C46238a.m51546a(this.f139685n, pa4.f139685n) && C46238a.m51546a(Integer.valueOf(this.f139686o), Integer.valueOf(pa4.f139686o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f139678d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f139679e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f139680f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f139681g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f139682h);
            String str5 = this.f139683i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f139684j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f139685n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            aVar.mo74318e(9, this.f139686o);
            return 0;
        } else if (i == 1) {
            String str8 = this.f139678d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f139679e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f139680f;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f139681g;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            int e = i2 + C52418a.m58678e(5, this.f139682h);
            String str12 = this.f139683i;
            if (str12 != null) {
                e += C52418a.m58683j(6, str12);
            }
            String str13 = this.f139684j;
            if (str13 != null) {
                e += C52418a.m58683j(7, str13);
            }
            String str14 = this.f139685n;
            if (str14 != null) {
                e += C52418a.m58683j(8, str14);
            }
            return e + C52418a.m58678e(9, this.f139686o);
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
            pa4 pa4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pa4.f139678d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    pa4.f139679e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pa4.f139680f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    pa4.f139681g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pa4.f139682h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    pa4.f139683i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    pa4.f139684j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    pa4.f139685n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    pa4.f139686o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
