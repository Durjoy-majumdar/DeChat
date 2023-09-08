package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.i4 */
public class C47601i4 extends C47465a {

    /* renamed from: d */
    public String f127789d;

    /* renamed from: e */
    public String f127790e;

    /* renamed from: f */
    public String f127791f;

    /* renamed from: g */
    public String f127792g;

    /* renamed from: h */
    public String f127793h;

    /* renamed from: i */
    public String f127794i;

    /* renamed from: j */
    public String f127795j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47601i4)) {
            return false;
        }
        C47601i4 i4Var = (C47601i4) aVar;
        return C46238a.m51546a(this.f127789d, i4Var.f127789d) && C46238a.m51546a(this.f127790e, i4Var.f127790e) && C46238a.m51546a(this.f127791f, i4Var.f127791f) && C46238a.m51546a(this.f127792g, i4Var.f127792g) && C46238a.m51546a(this.f127793h, i4Var.f127793h) && C46238a.m51546a(this.f127794i, i4Var.f127794i) && C46238a.m51546a(this.f127795j, i4Var.f127795j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127789d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f127790e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f127791f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f127792g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                String str5 = this.f127793h;
                if (str5 != null) {
                    aVar.mo74323j(5, str5);
                }
                String str6 = this.f127794i;
                if (str6 != null) {
                    aVar.mo74323j(6, str6);
                }
                String str7 = this.f127795j;
                if (str7 != null) {
                    aVar.mo74323j(7, str7);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: AppName");
        } else if (i == 1) {
            String str8 = this.f127789d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f127790e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f127791f;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f127792g;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f127793h;
            if (str12 != null) {
                i2 += C52418a.m58683j(5, str12);
            }
            String str13 = this.f127794i;
            if (str13 != null) {
                i2 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f127795j;
            return str14 != null ? i2 + C52418a.m58683j(7, str14) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127789d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: AppName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47601i4 i4Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    i4Var.f127789d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    i4Var.f127790e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    i4Var.f127791f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    i4Var.f127792g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    i4Var.f127793h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    i4Var.f127794i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    i4Var.f127795j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
