package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hj */
public class C77941hj extends C47465a {

    /* renamed from: d */
    public String f227564d;

    /* renamed from: e */
    public String f227565e;

    /* renamed from: f */
    public String f227566f;

    /* renamed from: g */
    public String f227567g;

    /* renamed from: h */
    public String f227568h;

    /* renamed from: i */
    public String f227569i;

    /* renamed from: j */
    public String f227570j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77941hj)) {
            return false;
        }
        C77941hj hjVar = (C77941hj) aVar;
        return C46238a.m51546a(this.f227564d, hjVar.f227564d) && C46238a.m51546a(this.f227565e, hjVar.f227565e) && C46238a.m51546a(this.f227566f, hjVar.f227566f) && C46238a.m51546a(this.f227567g, hjVar.f227567g) && C46238a.m51546a(this.f227568h, hjVar.f227568h) && C46238a.m51546a(this.f227569i, hjVar.f227569i) && C46238a.m51546a(this.f227570j, hjVar.f227570j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f227564d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f227565e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f227566f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f227567g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f227568h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f227569i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f227570j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            return 0;
        } else if (i == 1) {
            String str8 = this.f227564d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f227565e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f227566f;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f227567g;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f227568h;
            if (str12 != null) {
                i2 += C52418a.m58683j(5, str12);
            }
            String str13 = this.f227569i;
            if (str13 != null) {
                i2 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f227570j;
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
            C77941hj hjVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hjVar.f227564d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    hjVar.f227565e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    hjVar.f227566f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    hjVar.f227567g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    hjVar.f227568h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    hjVar.f227569i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    hjVar.f227570j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
