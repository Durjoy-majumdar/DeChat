package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class iz4 extends C47465a {

    /* renamed from: d */
    public String f135775d;

    /* renamed from: e */
    public String f135776e;

    /* renamed from: f */
    public String f135777f;

    /* renamed from: g */
    public String f135778g;

    /* renamed from: h */
    public int f135779h;

    /* renamed from: i */
    public String f135780i;

    /* renamed from: j */
    public String f135781j;

    /* renamed from: n */
    public String f135782n;

    /* renamed from: o */
    public int f135783o;

    /* renamed from: p */
    public String f135784p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof iz4)) {
            return false;
        }
        iz4 iz4 = (iz4) aVar;
        return C46238a.m51546a(this.f135775d, iz4.f135775d) && C46238a.m51546a(this.f135776e, iz4.f135776e) && C46238a.m51546a(this.f135777f, iz4.f135777f) && C46238a.m51546a(this.f135778g, iz4.f135778g) && C46238a.m51546a(Integer.valueOf(this.f135779h), Integer.valueOf(iz4.f135779h)) && C46238a.m51546a(this.f135780i, iz4.f135780i) && C46238a.m51546a(this.f135781j, iz4.f135781j) && C46238a.m51546a(this.f135782n, iz4.f135782n) && C46238a.m51546a(Integer.valueOf(this.f135783o), Integer.valueOf(iz4.f135783o)) && C46238a.m51546a(this.f135784p, iz4.f135784p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135775d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f135776e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f135777f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f135778g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f135779h);
            String str5 = this.f135780i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f135781j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f135782n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            aVar.mo74318e(9, this.f135783o);
            String str8 = this.f135784p;
            if (str8 != null) {
                aVar.mo74323j(19, str8);
            }
            return 0;
        } else if (i == 1) {
            String str9 = this.f135775d;
            if (str9 != null) {
                i2 = 0 + C52418a.m58683j(1, str9);
            }
            String str10 = this.f135776e;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f135777f;
            if (str11 != null) {
                i2 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f135778g;
            if (str12 != null) {
                i2 += C52418a.m58683j(4, str12);
            }
            int e = i2 + C52418a.m58678e(5, this.f135779h);
            String str13 = this.f135780i;
            if (str13 != null) {
                e += C52418a.m58683j(6, str13);
            }
            String str14 = this.f135781j;
            if (str14 != null) {
                e += C52418a.m58683j(7, str14);
            }
            String str15 = this.f135782n;
            if (str15 != null) {
                e += C52418a.m58683j(8, str15);
            }
            int e2 = e + C52418a.m58678e(9, this.f135783o);
            String str16 = this.f135784p;
            return str16 != null ? e2 + C52418a.m58683j(19, str16) : e2;
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
            iz4 iz4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 19) {
                switch (intValue) {
                    case 1:
                        iz4.f135775d = aVar3.mo141633k(intValue);
                        return 0;
                    case 2:
                        iz4.f135776e = aVar3.mo141633k(intValue);
                        return 0;
                    case 3:
                        iz4.f135777f = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        iz4.f135778g = aVar3.mo141633k(intValue);
                        return 0;
                    case 5:
                        iz4.f135779h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        iz4.f135780i = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        iz4.f135781j = aVar3.mo141633k(intValue);
                        return 0;
                    case 8:
                        iz4.f135782n = aVar3.mo141633k(intValue);
                        return 0;
                    case 9:
                        iz4.f135783o = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                iz4.f135784p = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
