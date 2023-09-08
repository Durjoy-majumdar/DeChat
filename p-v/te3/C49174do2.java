package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.do2 */
public class C49174do2 extends C47465a {

    /* renamed from: d */
    public String f132450d;

    /* renamed from: e */
    public String f132451e;

    /* renamed from: f */
    public int f132452f;

    /* renamed from: g */
    public String f132453g;

    /* renamed from: h */
    public String f132454h;

    /* renamed from: i */
    public String f132455i;

    /* renamed from: j */
    public String f132456j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49174do2)) {
            return false;
        }
        C49174do2 do22 = (C49174do2) aVar;
        return C46238a.m51546a(this.f132450d, do22.f132450d) && C46238a.m51546a(this.f132451e, do22.f132451e) && C46238a.m51546a(Integer.valueOf(this.f132452f), Integer.valueOf(do22.f132452f)) && C46238a.m51546a(this.f132453g, do22.f132453g) && C46238a.m51546a(this.f132454h, do22.f132454h) && C46238a.m51546a(this.f132455i, do22.f132455i) && C46238a.m51546a(this.f132456j, do22.f132456j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132450d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f132451e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f132452f);
            String str3 = this.f132453g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f132454h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f132455i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f132456j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f132450d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f132451e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            int e = i2 + C52418a.m58678e(3, this.f132452f);
            String str9 = this.f132453g;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            String str10 = this.f132454h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            String str11 = this.f132455i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            String str12 = this.f132456j;
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
            C49174do2 do22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    do22.f132450d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    do22.f132451e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    do22.f132452f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    do22.f132453g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    do22.f132454h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    do22.f132455i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    do22.f132456j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
